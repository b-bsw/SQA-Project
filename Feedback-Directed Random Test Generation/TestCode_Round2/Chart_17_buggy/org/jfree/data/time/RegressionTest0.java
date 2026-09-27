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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Time" + "'", str0, "Time");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Value" + "'", str0, "Value");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timeSeries2.getValue(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.createCopy((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod5, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries2.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod7, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.addOrUpdate(regularTimePeriod7, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.addOrUpdate(regularTimePeriod7, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries4.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod6, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries2.addOrUpdate(regularTimePeriod3, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod4, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries2.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries4.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod6, (double) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(10, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries4.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeSeries2.getIndex(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod6, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeSeries2.getIndex(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod6, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries2.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod6, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.removeAgedItems((long) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod14, (double) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries4.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.addOrUpdate(regularTimePeriod11, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries21.addOrUpdate(regularTimePeriod27, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod11, (java.lang.Number) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod5, (java.lang.Number) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (short) 0, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries26.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.addOrUpdate(regularTimePeriod10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.addOrUpdate(regularTimePeriod13, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries2.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod13, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(regularTimePeriod2, regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = timeSeries12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries16.getDataItem(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod24, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries25);
        java.util.List list30 = timeSeries29.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        timeSeries29.data = list44;
        timeSeries14.data = list44;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = timeSeries14.getValue(regularTimePeriod47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod14, 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries2.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries12.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setKey((java.lang.Comparable) "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries4.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.Class class15 = null;
        timeSeries14.timePeriodClass = class15;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener17);
        timeSeries14.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries14.addChangeListener(seriesChangeListener21);
        int int23 = timeSeries14.getItemCount();
        java.util.Collection collection24 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries14.getValue(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries26.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries4.addOrUpdate(regularTimePeriod14, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update(10, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries2.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries2.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod5, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries4.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod27, (double) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries14.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        timeSeries12.setRangeDescription("Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries12.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod29, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) '#', (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy(regularTimePeriod3, regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) '#', (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        int int13 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries4.createCopy((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.addOrUpdate(regularTimePeriod12, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.String str20 = timeSeries18.getDescription();
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 10);
        int int23 = timeSeries18.getMaximumItemCount();
        int int24 = timeSeries18.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener25);
        java.util.Collection collection27 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = timeSeries18.getIndex(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod15, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        java.lang.Class class30 = timeSeries12.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.removeAgedItems((long) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNull(class30);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.addOrUpdate(regularTimePeriod12, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries2.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, (java.lang.Number) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.Class class16 = null;
        timeSeries15.timePeriodClass = class16;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass22 = timeSeries15.getClass();
        timeSeries4.timePeriodClass = wildcardClass22;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod29, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        timeSeries4.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list10 = timeSeries8.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries8.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod30, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable29 = timeSeries8.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries8.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (byte) 100 + "'", comparable29, (byte) 100);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        boolean boolean30 = timeSeries12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries12.createCopy((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (short) -1, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = timeSeries2.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod30, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries8.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        timeSeries1.setKey((java.lang.Comparable) 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.removeAgedItems((long) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries4.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.String str20 = timeSeries18.getDescription();
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 10);
        int int23 = timeSeries18.getMaximumItemCount();
        int int24 = timeSeries18.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener25);
        java.util.Collection collection27 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        boolean boolean28 = timeSeries12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) (byte) 0, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Class class29 = timeSeries8.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries8.createCopy((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.String str4 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries2.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.createCopy(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0f + "'", comparable11, 0.0f);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.String str20 = timeSeries18.getDescription();
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 10);
        int int23 = timeSeries18.getMaximumItemCount();
        int int24 = timeSeries18.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener25);
        java.util.Collection collection27 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries22.getIndex(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (byte) 100, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries2.addOrUpdate(regularTimePeriod4, number5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        timeSeries12.setDescription("");
        timeSeries12.setDomainDescription("Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = timeSeries12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        int int4 = timeSeries1.getItemCount();
        java.util.List list5 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries2.addOrUpdate(regularTimePeriod16, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.Class class14 = timeSeries12.getTimePeriodClass();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.Class class20 = null;
        timeSeries19.timePeriodClass = class20;
        timeSeries19.removeAgedItems(false);
        java.lang.Class<?> wildcardClass24 = timeSeries19.getClass();
        timeSeries12.timePeriodClass = wildcardClass24;
        timeSeries8.timePeriodClass = wildcardClass24;
        boolean boolean28 = timeSeries8.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries8.addOrUpdate(regularTimePeriod29, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.List list16 = timeSeries14.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.removeAgedItems((long) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod14, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setMaximumItemCount(10);
        boolean boolean17 = timeSeries13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries13.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (java.lang.Number) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries2.addOrUpdate(regularTimePeriod8, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries2.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries4.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        timeSeries4.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries4.addOrUpdate(regularTimePeriod16, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (java.lang.Number) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod8, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(100);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries17);
        java.util.List list19 = timeSeries17.getItems();
        timeSeries4.data = list19;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries4.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries4.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries23.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        boolean boolean29 = timeSeries14.equals((java.lang.Object) comparable28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.addOrUpdate(regularTimePeriod12, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        timeSeries4.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.Class class19 = null;
        timeSeries18.timePeriodClass = class19;
        timeSeries18.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries18.addChangeListener(seriesChangeListener23);
        timeSeries18.clear();
        timeSeries18.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries31 = timeSeries28.createCopy(regularTimePeriod29, regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries18.addOrUpdate(regularTimePeriod23, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries4.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        java.lang.String str36 = timeSeries34.getDescription();
        boolean boolean38 = timeSeries34.equals((java.lang.Object) 10);
        java.lang.String str39 = timeSeries34.getDomainDescription();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.util.Collection collection45 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.util.Collection collection46 = timeSeries44.getTimePeriods();
        boolean boolean47 = timeSeries26.equals((java.lang.Object) collection46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(regularTimePeriod48, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Time" + "'", str35, "Time");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod27, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.Class class16 = null;
        timeSeries15.timePeriodClass = class16;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass22 = timeSeries15.getClass();
        timeSeries4.timePeriodClass = wildcardClass22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod24, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setKey((java.lang.Comparable) 1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod17, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries2.removeChangeListener(seriesChangeListener5);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        java.lang.String str13 = timeSeries11.getDescription();
        java.lang.Class class14 = timeSeries11.getTimePeriodClass();
        timeSeries11.setMaximumItemCount(0);
        boolean boolean17 = timeSeries2.equals((java.lang.Object) timeSeries11);
        boolean boolean18 = timeSeries11.isEmpty();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries11.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.addOrUpdate(regularTimePeriod8, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        timeSeries12.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries12.getValue(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod16, (double) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries8.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        timeSeries4.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.addOrUpdate(regularTimePeriod13, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.Class class16 = null;
        timeSeries15.timePeriodClass = class16;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass22 = timeSeries15.getClass();
        timeSeries4.timePeriodClass = wildcardClass22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.addOrUpdate(regularTimePeriod9, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        timeSeries4.setKey((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        boolean boolean30 = timeSeries12.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection32 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        long long3 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries2.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        java.util.List list14 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries4.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        int int12 = timeSeries7.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries7.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        timeSeries4.setKey((java.lang.Comparable) 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod25, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable29 = timeSeries8.getKey();
        timeSeries8.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = timeSeries8.getIndex(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (byte) 100 + "'", comparable29, (byte) 100);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        java.lang.String str36 = timeSeries34.getDescription();
        boolean boolean38 = timeSeries34.equals((java.lang.Object) 10);
        java.lang.String str39 = timeSeries34.getDomainDescription();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.util.Collection collection45 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        java.util.Collection collection46 = timeSeries44.getTimePeriods();
        boolean boolean47 = timeSeries26.equals((java.lang.Object) collection46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = timeSeries26.getIndex(regularTimePeriod48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Time" + "'", str35, "Time");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setKey((java.lang.Comparable) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.addOrUpdate(regularTimePeriod8, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries2.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) false);
        java.lang.Comparable comparable15 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod16, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 1 + "'", comparable15, (byte) 1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.String str30 = timeSeries26.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries2.removeChangeListener(seriesChangeListener5);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.Class class12 = null;
        timeSeries11.timePeriodClass = class12;
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener14);
        timeSeries11.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass18 = timeSeries11.getClass();
        timeSeries2.timePeriodClass = wildcardClass18;
        long long20 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod21, (java.lang.Number) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries9.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries26.addOrUpdate(regularTimePeriod30, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        boolean boolean30 = timeSeries12.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod31, (double) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.Class class15 = null;
        timeSeries14.timePeriodClass = class15;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener17);
        timeSeries14.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries14.addChangeListener(seriesChangeListener21);
        int int23 = timeSeries14.getItemCount();
        java.util.Collection collection24 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        timeSeries9.setMaximumItemAge((long) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries6.addChangeListener(seriesChangeListener13);
        int int15 = timeSeries6.getItemCount();
        timeSeries6.setDescription("Time");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.Class class22 = timeSeries20.getTimePeriodClass();
        java.lang.String str23 = timeSeries20.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        java.lang.Comparable comparable16 = timeSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        int int13 = timeSeries12.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((-1), (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Comparable comparable0 = null;
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        int int8 = timeSeries7.getMaximumItemCount();
        long long9 = timeSeries7.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class<?> wildcardClass14 = timeSeries7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries(comparable0, "Overwritten values from: 100", "", (java.lang.Class) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.addOrUpdate(regularTimePeriod11, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.String str30 = timeSeries26.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.removeAgedItems((long) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries8.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        timeSeries4.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod17, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        timeSeries4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.Class class16 = null;
        timeSeries15.timePeriodClass = class16;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener18);
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass22 = timeSeries15.getClass();
        timeSeries4.timePeriodClass = wildcardClass22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries4.addOrUpdate(regularTimePeriod24, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.util.List list29 = timeSeries8.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.addOrUpdate(regularTimePeriod9, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.addOrUpdate(regularTimePeriod8, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.createCopy((int) '#', (int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod24, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        java.util.Collection collection16 = timeSeries2.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries2.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = timeSeries14.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries4.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setMaximumItemCount(10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod17, (java.lang.Number) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        java.lang.String str10 = timeSeries8.getDescription();
        java.lang.Class class11 = timeSeries8.getTimePeriodClass();
        java.lang.Class<?> wildcardClass12 = timeSeries8.getClass();
        timeSeries1.timePeriodClass = wildcardClass12;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        timeSeries8.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries8.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class9);
        java.lang.Class class11 = null;
        timeSeries10.timePeriodClass = class11;
        timeSeries10.removeAgedItems(false);
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "hi!", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.createCopy((int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        timeSeries4.clear();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries25);
        java.util.List list30 = timeSeries29.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        timeSeries29.data = list44;
        java.util.List list46 = timeSeries29.getItems();
        timeSeries29.setDescription("");
        timeSeries29.setDomainDescription("Overwritten values from: 100");
        java.util.Collection collection51 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries29.getDataItem(regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        long long10 = timeSeries9.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod11, (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        java.lang.String str12 = timeSeries8.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries4.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries24.addOrUpdate(regularTimePeriod28, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        java.lang.String str2 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeSeries1.getIndex(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.util.List list14 = timeSeries13.getItems();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.addAndOrUpdate(timeSeries23);
        java.util.List list28 = timeSeries27.getItems();
        timeSeries13.data = list28;
        java.util.List list30 = timeSeries13.getItems();
        boolean boolean31 = timeSeries13.isEmpty();
        java.lang.Class class32 = timeSeries13.getTimePeriodClass();
        java.lang.Class<?> wildcardClass33 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries34.getValue(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.String str4 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.String str30 = timeSeries26.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (short) 10, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries4.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries4.getKey();
        java.util.List list12 = timeSeries4.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.addOrUpdate(regularTimePeriod13, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0f + "'", comparable11, 0.0f);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        int int30 = timeSeries26.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries26.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.util.List list14 = timeSeries13.getItems();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.addAndOrUpdate(timeSeries23);
        java.util.List list28 = timeSeries27.getItems();
        timeSeries13.data = list28;
        java.util.List list30 = timeSeries13.getItems();
        boolean boolean31 = timeSeries13.isEmpty();
        java.lang.Class class32 = timeSeries13.getTimePeriodClass();
        java.lang.Class<?> wildcardClass33 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = timeSeries34.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        int int12 = timeSeries7.getMaximumItemCount();
        java.lang.String str13 = timeSeries7.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.addOrUpdate(regularTimePeriod14, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries12.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries4.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        int int10 = timeSeries5.getMaximumItemCount();
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass13 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass13);
        timeSeries14.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries14.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod5, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.Class class8 = null;
        timeSeries7.timePeriodClass = class8;
        timeSeries7.removeAgedItems(false);
        java.lang.Class<?> wildcardClass12 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass23 = timeSeries16.getClass();
        timeSeries4.timePeriodClass = wildcardClass23;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod25, (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries2.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.lang.Comparable comparable6 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod7, (java.lang.Number) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        java.lang.String str2 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod12, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries34);
        java.util.List list39 = timeSeries38.getItems();
        timeSeries24.data = list39;
        java.util.List list41 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = timeSeries24.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries4.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.Comparable comparable0 = null;
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        java.lang.String str8 = timeSeries6.getDescription();
        java.lang.Class class9 = timeSeries6.getTimePeriodClass();
        java.lang.Class<?> wildcardClass10 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries(comparable0, (java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass13);
        int int16 = timeSeries15.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries15.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        int int8 = timeSeries7.getMaximumItemCount();
        long long9 = timeSeries7.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class<?> wildcardClass14 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "", "Time", (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries15.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries4.addOrUpdate(regularTimePeriod15, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries6.addChangeListener(seriesChangeListener13);
        int int15 = timeSeries6.getItemCount();
        timeSeries6.setDescription("Time");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.Class class22 = timeSeries20.getTimePeriodClass();
        java.lang.String str23 = timeSeries20.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = timeSeries6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setMaximumItemCount(10);
        int int17 = timeSeries13.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries13.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems(10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries4.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Class class29 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        int int27 = timeSeries26.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries26.addOrUpdate(regularTimePeriod28, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.String str30 = timeSeries26.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries34);
        java.util.List list39 = timeSeries38.getItems();
        timeSeries24.data = list39;
        java.util.List list41 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = timeSeries24.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries8.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        timeSeries12.setDescription("");
        timeSeries12.setDomainDescription("Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries2.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod31, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries9.setMaximumItemCount((int) (byte) 100);
        timeSeries9.clear();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        timeSeries17.removeAgedItems(false);
        boolean boolean22 = timeSeries9.equals((java.lang.Object) false);
        java.lang.Comparable comparable23 = timeSeries9.getKey();
        java.util.Collection collection24 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 1 + "'", comparable23, (byte) 1);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries25);
        java.util.List list30 = timeSeries29.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        timeSeries29.data = list44;
        timeSeries14.data = list44;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries4.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries4.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        timeSeries5.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries5.addChangeListener(seriesChangeListener10);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass23 = timeSeries16.getClass();
        timeSeries5.timePeriodClass = wildcardClass23;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries25.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.addOrUpdate(regularTimePeriod9, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        java.util.List list11 = timeSeries4.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (short) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries2.removeChangeListener(seriesChangeListener5);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.Class class12 = null;
        timeSeries11.timePeriodClass = class12;
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener14);
        timeSeries11.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass18 = timeSeries11.getClass();
        timeSeries2.timePeriodClass = wildcardClass18;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod20, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class7);
        int int9 = timeSeries8.getMaximumItemCount();
        long long10 = timeSeries8.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Class<?> wildcardClass15 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "", "Time", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass15);
        java.lang.String str18 = timeSeries17.getDescription();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod21, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable29 = timeSeries8.getKey();
        timeSeries8.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (byte) 100 + "'", comparable29, (byte) 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        timeSeries9.setMaximumItemAge((long) (byte) 100);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass13);
        int int16 = timeSeries15.getMaximumItemCount();
        java.lang.Comparable comparable17 = timeSeries15.getKey();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "" + "'", comparable17, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries8.removeChangeListener(seriesChangeListener27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = timeSeries8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemAge((long) 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (java.lang.Number) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.update(regularTimePeriod29, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class21 = timeSeries15.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries15.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        int int23 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries4.getDataItem(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        java.util.Collection collection16 = timeSeries2.getTimePeriods();
        timeSeries2.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries2.addOrUpdate(regularTimePeriod18, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        timeSeries3.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.Class class13 = null;
        timeSeries12.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener15);
        timeSeries12.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass19 = timeSeries12.getClass();
        timeSeries3.timePeriodClass = wildcardClass19;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod22, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries34);
        java.util.List list39 = timeSeries38.getItems();
        timeSeries24.data = list39;
        java.util.List list41 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries24.addOrUpdate(regularTimePeriod43, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        boolean boolean29 = timeSeries14.equals((java.lang.Object) comparable28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries14);
        java.lang.Comparable comparable31 = timeSeries14.getKey();
        java.util.List list32 = timeSeries14.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries14.addOrUpdate(regularTimePeriod33, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0.0f + "'", comparable31, 0.0f);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list10 = timeSeries8.getItems();
        java.lang.String str11 = timeSeries8.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries8.addOrUpdate(regularTimePeriod12, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.util.List list14 = timeSeries13.getItems();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.addAndOrUpdate(timeSeries23);
        java.util.List list28 = timeSeries27.getItems();
        timeSeries13.data = list28;
        java.util.List list30 = timeSeries13.getItems();
        boolean boolean31 = timeSeries13.isEmpty();
        java.lang.Class class32 = timeSeries13.getTimePeriodClass();
        java.lang.Class<?> wildcardClass33 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass33);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        int int40 = timeSeries39.getMaximumItemCount();
        long long41 = timeSeries39.getMaximumItemAge();
        java.util.List list42 = timeSeries39.getItems();
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class44);
        timeSeries45.removeAgedItems(true);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries45.addAndOrUpdate(timeSeries50);
        timeSeries50.removeAgedItems(true);
        java.util.Collection collection55 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries39.createCopy((int) '#', (int) (short) 100);
        boolean boolean59 = timeSeries34.equals((java.lang.Object) '#');
        timeSeries34.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        java.lang.Number number63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries34.addOrUpdate(regularTimePeriod62, number63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9223372036854775807L + "'", long41 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        timeSeries4.setMaximumItemCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries5 = timeSeries1.createCopy((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.Class class30 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod31, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNull(class30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        java.lang.Class class8 = timeSeries5.getTimePeriodClass();
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        timeSeries15.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries22.getIndex(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries12.createCopy(1, (int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries16.addOrUpdate(regularTimePeriod17, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        java.lang.Class class11 = timeSeries2.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod12, (double) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries4.addOrUpdate(regularTimePeriod24, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        timeSeries4.setMaximumItemAge((long) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Comparable comparable12 = timeSeries9.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.removeAgedItems((long) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Overwritten values from: 100" + "'", comparable12, "Overwritten values from: 100");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries28.addAndOrUpdate(timeSeries34);
        java.util.List list39 = timeSeries38.getItems();
        timeSeries24.data = list39;
        java.util.List list41 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(regularTimePeriod43, (double) (-1L), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries4.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setMaximumItemCount(10);
        int int17 = timeSeries13.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod18, (java.lang.Number) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        timeSeries2.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = timeSeries2.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod4, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries9.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries9.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(100);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries17);
        java.util.List list19 = timeSeries17.getItems();
        timeSeries4.data = list19;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries4.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.setRangeDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        timeSeries13.setMaximumItemCount(100);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries13.addAndOrUpdate(timeSeries19);
        java.util.List list24 = timeSeries23.getItems();
        timeSeries4.data = list24;
        boolean boolean26 = timeSeries4.getNotify();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class21 = timeSeries15.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.Class class14 = timeSeries12.getTimePeriodClass();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.Class class20 = null;
        timeSeries19.timePeriodClass = class20;
        timeSeries19.removeAgedItems(false);
        java.lang.Class<?> wildcardClass24 = timeSeries19.getClass();
        timeSeries12.timePeriodClass = wildcardClass24;
        timeSeries8.timePeriodClass = wildcardClass24;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        timeSeries12.setRangeDescription("Overwritten values from: 100");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        timeSeries20.setDomainDescription("Value");
        java.util.Collection collection30 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries20.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.Class class14 = timeSeries12.getTimePeriodClass();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.Class class20 = null;
        timeSeries19.timePeriodClass = class20;
        timeSeries19.removeAgedItems(false);
        java.lang.Class<?> wildcardClass24 = timeSeries19.getClass();
        timeSeries12.timePeriodClass = wildcardClass24;
        timeSeries8.timePeriodClass = wildcardClass24;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries8.removeChangeListener(seriesChangeListener27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries8.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.Class class14 = null;
        timeSeries13.timePeriodClass = class14;
        timeSeries13.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries13.addChangeListener(seriesChangeListener18);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Class class25 = null;
        timeSeries24.timePeriodClass = class25;
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener27);
        timeSeries24.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass31 = timeSeries24.getClass();
        timeSeries13.timePeriodClass = wildcardClass31;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass31);
        timeSeries4.timePeriodClass = wildcardClass31;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = timeSeries4.getValue(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries6.addChangeListener(seriesChangeListener13);
        int int15 = timeSeries6.getItemCount();
        timeSeries6.setDescription("Time");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.Class class22 = timeSeries20.getTimePeriodClass();
        java.lang.String str23 = timeSeries20.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries1.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        timeSeries4.setDescription("Time");
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.String str21 = timeSeries18.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries4.addAndOrUpdate(timeSeries18);
        int int23 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod24, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        timeSeries12.setRangeDescription("Overwritten values from: 100");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        timeSeries20.setDomainDescription("Value");
        java.util.Collection collection30 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries12.getValue(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        timeSeries2.fireSeriesChanged();
        java.lang.String str6 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries2.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        timeSeries4.setKey((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        timeSeries17.setKey((java.lang.Comparable) 0L);
        boolean boolean20 = timeSeries17.isEmpty();
        java.lang.Comparable comparable21 = timeSeries17.getKey();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount(100);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries24.addAndOrUpdate(timeSeries30);
        java.util.List list35 = timeSeries34.getItems();
        timeSeries17.data = list35;
        timeSeries12.data = list35;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 0L + "'", comparable21, 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        java.lang.Class class8 = timeSeries5.getTimePeriodClass();
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass9);
        long long11 = timeSeries10.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (byte) 0, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        timeSeries12.setDescription("");
        timeSeries12.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) false);
        java.lang.Class class15 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        timeSeries5.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries5.removeChangeListener(seriesChangeListener8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.Class class15 = null;
        timeSeries14.timePeriodClass = class15;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener17);
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass21 = timeSeries14.getClass();
        timeSeries5.timePeriodClass = wildcardClass21;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "hi!", "Time", (java.lang.Class) wildcardClass21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod24, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = timeSeries4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        int int10 = timeSeries5.getMaximumItemCount();
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass13 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass13);
        timeSeries14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = timeSeries14.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setNotify(false);
        timeSeries4.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        timeSeries4.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries2.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod11, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long2 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        timeSeries8.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod16, (double) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getDescription();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries14);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        int int21 = timeSeries20.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        timeSeries26.removeAgedItems(true);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        java.lang.Comparable comparable34 = timeSeries33.getKey();
        boolean boolean35 = timeSeries20.equals((java.lang.Object) comparable34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries8.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable37 = timeSeries20.getKey();
        java.util.List list38 = timeSeries20.data;
        boolean boolean39 = timeSeries1.equals((java.lang.Object) timeSeries20);
        timeSeries1.removeAgedItems((long) ' ', true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 100" + "'", comparable34, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 0.0f + "'", comparable37, 0.0f);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries4.addAndOrUpdate(timeSeries10);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries4.addAndOrUpdate(timeSeries10);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        int int19 = timeSeries17.getMaximumItemCount();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.List list25 = timeSeries24.getItems();
        timeSeries17.data = list25;
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries12.addAndOrUpdate(timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.removeAgedItems((long) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(100);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries17);
        java.util.List list19 = timeSeries17.getItems();
        timeSeries4.data = list19;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries4.addOrUpdate(regularTimePeriod23, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod17, (double) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries4.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries4.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class<?> wildcardClass7 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = timeSeries12.getIndex(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        timeSeries4.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemCount(100);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        java.lang.String str11 = timeSeries10.getRangeDescription();
        timeSeries10.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries10);
        java.util.List list15 = timeSeries14.getItems();
        timeSeries1.data = list15;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) 'a', (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener26);
        java.util.Collection collection28 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries4.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) false);
        java.lang.Class class15 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries8.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries9.setMaximumItemCount((int) (byte) 100);
        timeSeries9.clear();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        timeSeries17.removeAgedItems(false);
        boolean boolean22 = timeSeries9.equals((java.lang.Object) false);
        java.lang.Comparable comparable23 = timeSeries9.getKey();
        java.util.Collection collection24 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries4.addOrUpdate(regularTimePeriod25, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 1 + "'", comparable23, (byte) 1);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        int int13 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        timeSeries15.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries2.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        java.util.List list14 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries4.addOrUpdate(regularTimePeriod15, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries4.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        java.lang.Comparable comparable11 = timeSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) 100 + "'", comparable11, (byte) 100);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries25);
        java.util.List list30 = timeSeries29.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        timeSeries29.data = list44;
        timeSeries14.data = list44;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries14.addChangeListener(seriesChangeListener47);
        java.lang.Comparable comparable49 = timeSeries14.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries52 = timeSeries14.createCopy(regularTimePeriod50, regularTimePeriod51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 0.0f + "'", comparable49, 0.0f);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass13);
        timeSeries15.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(2147483647, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener29);
        timeSeries21.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        boolean boolean29 = timeSeries14.equals((java.lang.Object) comparable28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.removeChangeListener(seriesChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.delete(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        boolean boolean29 = timeSeries14.equals((java.lang.Object) comparable28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries14);
        timeSeries2.clear();
        long long32 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod33, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        java.lang.Comparable comparable16 = timeSeries2.getKey();
        java.util.List list17 = timeSeries2.getItems();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        timeSeries13.setMaximumItemCount(10);
        int int17 = timeSeries13.getMaximumItemCount();
        timeSeries13.fireSeriesChanged();
        java.lang.String str19 = timeSeries13.getDomainDescription();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.delete(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class21 = timeSeries15.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries15.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        long long14 = timeSeries13.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        long long27 = timeSeries2.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod28, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.clear();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        boolean boolean6 = timeSeries2.getNotify();
        int int7 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries2.addOrUpdate(regularTimePeriod8, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        timeSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        int int13 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries12.addOrUpdate(regularTimePeriod14, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        timeSeries4.fireSeriesChanged();
        boolean boolean16 = timeSeries4.getNotify();
        timeSeries4.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries15.removeAgedItems(true);
        java.util.Collection collection20 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries15.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries4.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L));
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setKey((java.lang.Comparable) 100);
        timeSeries4.setMaximumItemAge((long) '#');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries4.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        java.lang.Class<?> wildcardClass14 = timeSeries9.getClass();
        timeSeries2.timePeriodClass = wildcardClass14;
        java.lang.Comparable comparable16 = timeSeries2.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (double) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries7.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(true);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.Class class19 = null;
        timeSeries18.timePeriodClass = class19;
        timeSeries18.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries18.addChangeListener(seriesChangeListener23);
        timeSeries18.clear();
        timeSeries18.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod29, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        boolean boolean30 = timeSeries12.isEmpty();
        timeSeries12.removeAgedItems(true);
        java.lang.String str33 = timeSeries12.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries12.getIndex(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class30);
        java.lang.Class class32 = null;
        timeSeries31.timePeriodClass = class32;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener34);
        timeSeries31.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries31.addChangeListener(seriesChangeListener38);
        int int40 = timeSeries31.getItemCount();
        int int41 = timeSeries31.getMaximumItemCount();
        java.util.Collection collection42 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries31.addOrUpdate(regularTimePeriod43, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        timeSeries15.clear();
        boolean boolean27 = timeSeries7.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries7.getValue(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod16, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.Class class14 = timeSeries12.getTimePeriodClass();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.Class class20 = null;
        timeSeries19.timePeriodClass = class20;
        timeSeries19.removeAgedItems(false);
        java.lang.Class<?> wildcardClass24 = timeSeries19.getClass();
        timeSeries12.timePeriodClass = wildcardClass24;
        timeSeries8.timePeriodClass = wildcardClass24;
        boolean boolean28 = timeSeries8.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        java.lang.Comparable comparable29 = timeSeries8.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries8.getDataItem(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (byte) 100 + "'", comparable29, (byte) 100);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        timeSeries8.setDescription("Value");
        int int16 = timeSeries8.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries9.getMaximumItemCount();
        boolean boolean13 = timeSeries9.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries9.getIndex(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        int int3 = timeSeries2.getItemCount();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), class4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries5.addOrUpdate(regularTimePeriod6, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(class4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries4.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries26.createCopy(regularTimePeriod30, regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        java.util.List list14 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod15, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        timeSeries15.clear();
        boolean boolean27 = timeSeries7.equals((java.lang.Object) timeSeries15);
        java.util.Collection collection28 = timeSeries15.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = timeSeries15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.util.List list30 = timeSeries26.data;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries6.addChangeListener(seriesChangeListener13);
        int int15 = timeSeries6.getItemCount();
        timeSeries6.setDescription("Time");
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.Class class22 = timeSeries20.getTimePeriodClass();
        java.lang.String str23 = timeSeries20.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries6.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries6);
        java.lang.Object obj26 = null;
        boolean boolean27 = timeSeries1.equals(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        int int14 = timeSeries13.getMaximumItemCount();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries23);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        java.lang.String str31 = timeSeries29.getDescription();
        boolean boolean33 = timeSeries29.equals((java.lang.Object) 10);
        java.lang.String str34 = timeSeries29.getDomainDescription();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.util.Collection collection40 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        java.util.Collection collection41 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount(100);
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class51);
        java.lang.String str53 = timeSeries52.getRangeDescription();
        timeSeries52.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries46.addAndOrUpdate(timeSeries52);
        java.util.List list57 = timeSeries56.getItems();
        timeSeries43.data = list57;
        boolean boolean59 = timeSeries17.equals((java.lang.Object) timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries13.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod61, (double) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeSeries60);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.util.List list25 = timeSeries24.getItems();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener26);
        java.util.Collection collection28 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.lang.String str29 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.update(regularTimePeriod29, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update((int) (byte) -1, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        timeSeries4.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries4.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries12.createCopy(1, (int) (short) 10);
        timeSeries12.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries12.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries12.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod5, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (byte) 1, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries8.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        timeSeries20.removeAgedItems(true);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries20.addAndOrUpdate(timeSeries25);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        boolean boolean29 = timeSeries14.equals((java.lang.Object) comparable28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.addAndOrUpdate(timeSeries14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = timeSeries30.getValue(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        timeSeries4.setKey((java.lang.Comparable) (-1L));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries4.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.util.List list10 = timeSeries7.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries14.setMaximumItemCount((int) (byte) 100);
        timeSeries14.clear();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.lang.Class class23 = null;
        timeSeries22.timePeriodClass = class23;
        timeSeries22.removeAgedItems(false);
        boolean boolean27 = timeSeries14.equals((java.lang.Object) false);
        java.util.Collection collection28 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.removeAgedItems((long) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setKey((java.lang.Comparable) 100);
        timeSeries4.setDescription("Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        boolean boolean2 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries2.clear();
        java.util.List list14 = timeSeries2.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries2.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getDescription();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries14);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        int int21 = timeSeries20.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        timeSeries26.removeAgedItems(true);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries31);
        java.lang.Comparable comparable34 = timeSeries33.getKey();
        boolean boolean35 = timeSeries20.equals((java.lang.Object) comparable34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries8.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable37 = timeSeries20.getKey();
        java.util.List list38 = timeSeries20.data;
        boolean boolean39 = timeSeries1.equals((java.lang.Object) timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = timeSeries1.getIndex(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + "Overwritten values from: 100" + "'", comparable34, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 0.0f + "'", comparable37, 0.0f);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        java.lang.Class class30 = timeSeries12.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries12.getDataItem(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNull(class30);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(1, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.delete((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        long long3 = timeSeries2.getMaximumItemAge();
        timeSeries2.setMaximumItemCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.Class class15 = null;
        timeSeries14.timePeriodClass = class15;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener17);
        timeSeries14.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries14.addChangeListener(seriesChangeListener21);
        int int23 = timeSeries14.getItemCount();
        java.util.Collection collection24 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries2.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        java.lang.Class class12 = null;
        timeSeries4.timePeriodClass = class12;
        timeSeries4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries4.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(1, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        int int13 = timeSeries12.getMaximumItemCount();
        timeSeries12.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod16, (double) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod10, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        boolean boolean28 = timeSeries8.equals((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.String str14 = timeSeries12.getRangeDescription();
        java.lang.Class class15 = timeSeries12.getTimePeriodClass();
        timeSeries12.setNotify(true);
        java.lang.String str18 = timeSeries12.getDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries4.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        int int12 = timeSeries7.getMaximumItemCount();
        java.lang.String str13 = timeSeries7.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = timeSeries7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        long long10 = timeSeries7.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        java.lang.String str30 = timeSeries26.getDomainDescription();
        long long31 = timeSeries26.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.add(regularTimePeriod32, (double) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries4.addAndOrUpdate(timeSeries10);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        int int19 = timeSeries17.getMaximumItemCount();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.List list25 = timeSeries24.getItems();
        timeSeries17.data = list25;
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries12.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.add(timeSeriesDataItem28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries8.addOrUpdate(regularTimePeriod13, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list13 = timeSeries12.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        timeSeries16.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries16.addAndOrUpdate(timeSeries22);
        java.util.List list27 = timeSeries26.getItems();
        timeSeries12.data = list27;
        java.util.List list29 = timeSeries12.getItems();
        timeSeries12.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries21);
        timeSeries26.setRangeDescription("hi!");
        int int29 = timeSeries26.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = timeSeries26.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        timeSeries13.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries13.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.util.List list10 = timeSeries7.data;
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries14.setMaximumItemCount((int) (byte) 100);
        timeSeries14.clear();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.lang.Class class23 = null;
        timeSeries22.timePeriodClass = class23;
        timeSeries22.removeAgedItems(false);
        boolean boolean27 = timeSeries14.equals((java.lang.Object) false);
        java.util.Collection collection28 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries14.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.util.Collection collection25 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.Collection collection26 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount(100);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        java.lang.String str38 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries31.addAndOrUpdate(timeSeries37);
        java.util.List list42 = timeSeries41.getItems();
        timeSeries28.data = list42;
        boolean boolean44 = timeSeries2.equals((java.lang.Object) timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod45, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries4.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(false);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.String str20 = timeSeries18.getDescription();
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 10);
        java.lang.String str23 = timeSeries18.getDomainDescription();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class27);
        java.util.Collection collection29 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.util.Collection collection30 = timeSeries28.getTimePeriods();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class46);
        java.lang.String str48 = timeSeries47.getRangeDescription();
        timeSeries47.setMaximumItemCount(100);
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class52);
        java.lang.String str54 = timeSeries53.getRangeDescription();
        timeSeries53.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries47.addAndOrUpdate(timeSeries53);
        java.util.List list58 = timeSeries57.getItems();
        timeSeries43.data = list58;
        timeSeries28.data = list58;
        timeSeries4.data = list58;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem62, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value" + "'", str48, "Value");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        long long3 = timeSeries2.getMaximumItemAge();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        timeSeries15.clear();
        boolean boolean27 = timeSeries7.equals((java.lang.Object) timeSeries15);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        int int33 = timeSeries32.getMaximumItemCount();
        timeSeries32.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries32.removeChangeListener(seriesChangeListener36);
        java.util.Collection collection38 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        java.lang.String str45 = timeSeries43.getDescription();
        java.lang.Class class46 = timeSeries43.getTimePeriodClass();
        timeSeries43.setKey((java.lang.Comparable) "Value");
        boolean boolean49 = timeSeries43.isEmpty();
        boolean boolean50 = timeSeries7.equals((java.lang.Object) boolean49);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Time" + "'", str44, "Time");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.util.Collection collection16 = timeSeries14.getTimePeriods();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries19.addAndOrUpdate(timeSeries25);
        java.util.List list30 = timeSeries29.getItems();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries33.addAndOrUpdate(timeSeries39);
        java.util.List list44 = timeSeries43.getItems();
        timeSeries29.data = list44;
        timeSeries14.data = list44;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries14.addOrUpdate(regularTimePeriod47, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
    }
}

