package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.delete(10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.Class<?> wildcardClass19 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L, "Value", "Time");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "Value", "Time");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((-1), (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        int int11 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        java.lang.String str15 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ');
        int int2 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        timePeriodValues1.setDescription("");
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        int int5 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Value");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        timePeriodValues1.setNotify(true);
        int int11 = timePeriodValues1.getMaxStartIndex();
        int int12 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        boolean boolean17 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int18 = timePeriodValues17.getMinEndIndex();
        timePeriodValues17.setNotify(false);
        boolean boolean21 = timePeriodValues17.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timePeriodValues17.removeChangeListener(seriesChangeListener22);
        boolean boolean24 = timePeriodValues17.getNotify();
        int int25 = timePeriodValues17.getMinEndIndex();
        timePeriodValues17.setRangeDescription("Time");
        boolean boolean28 = timePeriodValues1.equals((java.lang.Object) "Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod11, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        int int13 = timePeriodValues1.getMinEndIndex();
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        int int5 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setDomainDescription("");
        java.lang.Object obj8 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) ' ', (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setKey((java.lang.Comparable) (short) 10);
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 1);
        timePeriodValues1.setKey((java.lang.Comparable) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "Time", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.setKey((java.lang.Comparable) 10);
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        timePeriodValues11.fireSeriesChanged();
        timePeriodValues11.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 1, 100);
        timePeriodValues18.setKey((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Time");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (short) 10, (int) ' ');
        timePeriodValues13.setDescription("Value");
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues13.update((int) (short) 100, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "Time", "Value");
        int int4 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues3.getMinStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Value");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        int int16 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        timePeriodValues20.setRangeDescription("hi!");
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) 0);
        int int13 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "Time", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 1, "hi!", "Value");
        timePeriodValues3.setKey((java.lang.Comparable) '#');
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) ' ', number7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int15 = timePeriodValues14.getMinEndIndex();
        timePeriodValues14.setKey((java.lang.Comparable) 100L);
        int int18 = timePeriodValues14.getMaxStartIndex();
        int int19 = timePeriodValues14.getMaxMiddleIndex();
        int int20 = timePeriodValues14.getItemCount();
        int int21 = timePeriodValues14.getMinStartIndex();
        java.lang.String str22 = timePeriodValues14.getDescription();
        int int23 = timePeriodValues14.getMinMiddleIndex();
        int int24 = timePeriodValues14.getMaxMiddleIndex();
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.lang.Object obj5 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        int int15 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues17.setDescription("");
        java.lang.Comparable comparable20 = timePeriodValues17.getKey();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues17.addPropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues17.getMaxStartIndex();
        timePeriodValues17.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = timePeriodValues17.createCopy((int) '4', 1);
        int int29 = timePeriodValues17.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timePeriodValues17.removeChangeListener(seriesChangeListener30);
        java.lang.Object obj32 = timePeriodValues17.clone();
        boolean boolean33 = timePeriodValues1.equals((java.lang.Object) timePeriodValues17);
        int int34 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        timePeriodValues1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "", "Value");
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) 100.0d);
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0, "hi!", "hi!");
        timePeriodValues3.setDomainDescription("Value");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        int int14 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) "");
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        int int14 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "Value", "Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        java.lang.Class<?> wildcardClass16 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        boolean boolean23 = timePeriodValues1.isEmpty();
        int int24 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "", "Time");
        int int4 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        java.lang.String str12 = timePeriodValues1.getDescription();
        timePeriodValues1.delete((int) (short) 10, (int) (short) 1);
        boolean boolean16 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValue timePeriodValue17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        java.lang.String str16 = timePeriodValues1.getDescription();
        java.lang.Class<?> wildcardClass17 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timePeriodValues1.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int14 = timePeriodValues13.getMinEndIndex();
        timePeriodValues13.setKey((java.lang.Comparable) 100L);
        int int17 = timePeriodValues13.getMinEndIndex();
        java.lang.String str18 = timePeriodValues13.getDomainDescription();
        java.lang.String str19 = timePeriodValues13.getDomainDescription();
        java.lang.String str20 = timePeriodValues13.getDomainDescription();
        java.lang.String str21 = timePeriodValues13.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timePeriodValues13.removeChangeListener(seriesChangeListener22);
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) seriesChangeListener22);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        int int11 = timePeriodValues7.getMaxStartIndex();
        boolean boolean12 = timePeriodValues7.getNotify();
        boolean boolean13 = timePeriodValues7.isEmpty();
        timePeriodValues7.setKey((java.lang.Comparable) (-2210593619794989709L));
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) timePeriodValues7);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        timePeriodValues1.setKey((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMaxEndIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        java.lang.Object obj14 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod16 = timePeriodValues1.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Time");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) (short) 10, (int) ' ');
        java.lang.String str14 = timePeriodValues13.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "hi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str22 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int21 = timePeriodValues16.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        java.lang.String str26 = timePeriodValues25.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = timePeriodValues25.createCopy((int) ' ', (int) (short) 100);
        boolean boolean30 = timePeriodValues16.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        java.lang.String str16 = timePeriodValues1.getDescription();
        boolean boolean17 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues16.setDescription("");
        java.lang.Comparable comparable19 = timePeriodValues16.getKey();
        timePeriodValues16.setDomainDescription("hi!");
        int int22 = timePeriodValues16.getItemCount();
        java.lang.Comparable comparable23 = timePeriodValues16.getKey();
        boolean boolean24 = timePeriodValues14.equals((java.lang.Object) comparable23);
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) boolean24);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 1 + "'", comparable23, 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "Value", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener4);
        timePeriodValues3.setDescription("");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        java.lang.String str15 = timePeriodValues11.getRangeDescription();
        java.lang.String str16 = timePeriodValues11.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) ' ', (int) (short) 100);
        timePeriodValues7.setKey((java.lang.Comparable) 10);
        java.lang.String str10 = timePeriodValues7.getRangeDescription();
        timePeriodValues7.setDomainDescription("");
        int int13 = timePeriodValues7.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setNotify(false);
        boolean boolean13 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int16 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues18.setDescription("");
        java.lang.Comparable comparable21 = timePeriodValues18.getKey();
        int int22 = timePeriodValues18.getMinMiddleIndex();
        timePeriodValues18.setDomainDescription("hi!");
        int int25 = timePeriodValues18.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues18.removeChangeListener(seriesChangeListener26);
        int int28 = timePeriodValues18.getMaxStartIndex();
        boolean boolean29 = timePeriodValues1.equals((java.lang.Object) int28);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1 + "'", comparable21, 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        timePeriodValues1.setNotify(true);
        java.lang.String str12 = timePeriodValues1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getMaxStartIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.add(timePeriod13, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy(1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues18.update((int) (short) 0, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setNotify(false);
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) 10);
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.Object obj12 = timePeriodValues10.clone();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        int int12 = timePeriodValues8.getMaxEndIndex();
        int int13 = timePeriodValues8.getMaxMiddleIndex();
        java.lang.String str14 = timePeriodValues8.getRangeDescription();
        java.lang.Class<?> wildcardClass15 = timePeriodValues8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.String str8 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj7 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        boolean boolean16 = timePeriodValues1.isEmpty();
        java.lang.String str17 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        int int8 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        boolean boolean16 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.Comparable comparable16 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) 10, (int) (short) 1);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str11 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        int int14 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimePeriod timePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod17, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Value", "");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        timePeriodValues16.setRangeDescription("hi!");
        boolean boolean19 = timePeriodValues16.getNotify();
        boolean boolean20 = timePeriodValues16.getNotify();
        timePeriodValues16.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        timePeriodValues12.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue19 = timePeriodValues12.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setDomainDescription("hi!");
        timePeriodValues3.setDomainDescription("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        boolean boolean10 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.setKey(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod17, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        int int12 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj13 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        int int16 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean17 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        boolean boolean13 = timePeriodValues10.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues10.createCopy(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        int int11 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        int int14 = timePeriodValues1.getMinStartIndex();
        int int15 = timePeriodValues1.getMinEndIndex();
        int int16 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int19 = timePeriodValues18.getMinEndIndex();
        timePeriodValues18.setNotify(false);
        boolean boolean22 = timePeriodValues18.isEmpty();
        timePeriodValues18.fireSeriesChanged();
        timePeriodValues18.setDomainDescription("");
        timePeriodValues18.fireSeriesChanged();
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) timePeriodValues18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue29 = timePeriodValues18.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues1.createCopy((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass14 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        int int13 = timePeriodValues1.getMinStartIndex();
        java.lang.String str14 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.lang.Comparable comparable21 = timePeriodValues1.getKey();
        java.lang.Comparable comparable22 = timePeriodValues1.getKey();
        int int23 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 100L + "'", comparable21, 100L);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 100L + "'", comparable22, 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "Value", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMinEndIndex();
        int int12 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        timePeriodValues16.setKey((java.lang.Comparable) "Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '#', "Value", "Time");
        int int4 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        timePeriodValues8.fireSeriesChanged();
        int int13 = timePeriodValues8.getMinMiddleIndex();
        int int14 = timePeriodValues8.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        boolean boolean14 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String str18 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        int int18 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        java.lang.Object obj5 = timePeriodValues3.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) -1, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 1, "hi!", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int6 = timePeriodValues5.getMinEndIndex();
        timePeriodValues5.setKey((java.lang.Comparable) 100L);
        boolean boolean9 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        boolean boolean10 = timePeriodValues5.isEmpty();
        timePeriodValues5.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.delete((int) 'a', (int) '4');
        boolean boolean9 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Class<?> wildcardClass12 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        java.lang.Comparable comparable15 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int18 = timePeriodValues17.getMinEndIndex();
        int int19 = timePeriodValues17.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues17.addChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues17.getMaxEndIndex();
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues17);
        int int24 = timePeriodValues17.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        boolean boolean20 = timePeriodValues18.isEmpty();
        boolean boolean21 = timePeriodValues18.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        int int15 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues1.getItemCount();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        boolean boolean12 = timePeriodValues1.isEmpty();
        java.lang.String str13 = timePeriodValues1.getDescription();
        int int14 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "hi!", "Value");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        int int5 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) (short) 10, 0);
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getMaxEndIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete((int) (short) 100, (int) '#');
        int int12 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.Comparable comparable16 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int19 = timePeriodValues18.getMinEndIndex();
        timePeriodValues18.setKey((java.lang.Comparable) 100L);
        timePeriodValues18.setRangeDescription("Time");
        timePeriodValues18.setDomainDescription("");
        boolean boolean26 = timePeriodValues18.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timePeriodValues18.addPropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        int int15 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = timePeriodValues1.isEmpty();
        int int18 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues1.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        int int2 = timePeriodValues1.getItemCount();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) ' ', 0);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Value");
        int int15 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "Time", "hi!");
        timePeriodValues3.fireSeriesChanged();
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 1 + "'", comparable3, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0f);
        int int10 = timePeriodValues3.getItemCount();
        int int11 = timePeriodValues3.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener12);
        int int14 = timePeriodValues3.getMinEndIndex();
        int int15 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str16 = timePeriodValues3.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        java.lang.String str10 = timePeriodValues1.getDescription();
        int int11 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "Time");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues13.setDescription("");
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        timePeriodValues13.delete((int) ' ', 0);
        java.lang.Object obj20 = timePeriodValues13.clone();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues13);
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int24 = timePeriodValues23.getMinEndIndex();
        timePeriodValues23.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues30 = timePeriodValues23.createCopy((int) '#', (int) '#');
        timePeriodValues23.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues34 = timePeriodValues23.createCopy(0, (int) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timePeriodValues23.addPropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues30);
        org.junit.Assert.assertNotNull(timePeriodValues34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "Time");
        boolean boolean4 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L);
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setKey((java.lang.Comparable) (-2210593619794989709L));
        int int11 = timePeriodValues8.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.delete((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        timePeriodValues11.fireSeriesChanged();
        boolean boolean16 = timePeriodValues11.getNotify();
        java.lang.Object obj17 = timePeriodValues11.clone();
        int int18 = timePeriodValues11.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) ' ', 0);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod12, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int13 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "Time");
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) "Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy(0, (int) (byte) 1);
        int int13 = timePeriodValues12.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timePeriodValues20.addPropertyChangeListener(propertyChangeListener28);
        java.lang.String str30 = timePeriodValues20.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.lang.Comparable comparable14 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 1 + "'", comparable14, 1);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        java.lang.String str16 = timePeriodValues1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        java.lang.String str15 = timePeriodValues11.getDescription();
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.update((int) (byte) 1, number17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10, "Time", "Time");
        int int4 = timePeriodValues3.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues3.getKey();
        int int6 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10 + "'", comparable5, 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setDescription("Time");
        java.lang.String str13 = timePeriodValues1.getDescription();
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        int int12 = timePeriodValues11.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues11.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues11.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod16, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) (short) 100);
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Time", "");
        timePeriodValues3.setDomainDescription("");
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy(1, 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int17 = timePeriodValues16.getMinEndIndex();
        timePeriodValues16.setKey((java.lang.Comparable) 100L);
        int int20 = timePeriodValues16.getMaxStartIndex();
        int int21 = timePeriodValues16.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimePeriodValues timePeriodValues26 = timePeriodValues16.createCopy(0, (int) (byte) 100);
        int int27 = timePeriodValues16.getMinEndIndex();
        boolean boolean28 = timePeriodValues1.equals((java.lang.Object) int27);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        java.lang.String str14 = timePeriodValues1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int14 = timePeriodValues13.getMinEndIndex();
        timePeriodValues13.setKey((java.lang.Comparable) 100L);
        int int17 = timePeriodValues13.getMinEndIndex();
        java.lang.String str18 = timePeriodValues13.getDomainDescription();
        java.lang.String str19 = timePeriodValues13.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy(10, 100);
        boolean boolean23 = timePeriodValues3.equals((java.lang.Object) timePeriodValues13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        boolean boolean21 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        int int4 = timePeriodValues1.getItemCount();
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        timePeriodValues1.setDomainDescription("");
        java.lang.String str4 = timePeriodValues1.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener12);
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues22.setDescription("");
        java.lang.Comparable comparable25 = timePeriodValues22.getKey();
        int int26 = timePeriodValues22.getItemCount();
        boolean boolean27 = timePeriodValues22.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timePeriodValues22.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timePeriodValues22.removeChangeListener(seriesChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timePeriodValues22.addPropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timePeriodValues22.removePropertyChangeListener(propertyChangeListener34);
        timePeriodValues22.setDomainDescription("Time");
        boolean boolean38 = timePeriodValues22.getNotify();
        boolean boolean39 = timePeriodValues1.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 1 + "'", comparable25, 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy(1, (int) (byte) 10);
        int int19 = timePeriodValues18.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setNotify(false);
        boolean boolean15 = timePeriodValues1.equals((java.lang.Object) false);
        int int16 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Object obj19 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        int int16 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        int int23 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertNotNull(timePeriodValues20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        int int16 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod18 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        int int17 = timePeriodValues1.getMaxMiddleIndex();
        int int18 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setRangeDescription("Value");
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        timePeriodValues21.setRangeDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues28.setDescription("");
        java.lang.Comparable comparable31 = timePeriodValues28.getKey();
        int int32 = timePeriodValues28.getItemCount();
        boolean boolean33 = timePeriodValues28.getNotify();
        timePeriodValues28.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues38 = timePeriodValues28.createCopy((int) 'a', (int) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timePeriodValues38.addPropertyChangeListener(propertyChangeListener39);
        timePeriodValues38.setDomainDescription("Value");
        int int43 = timePeriodValues38.getItemCount();
        int int44 = timePeriodValues38.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timePeriodValues38.removePropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = timePeriodValues21.equals((java.lang.Object) propertyChangeListener45);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 1 + "'", comparable31, 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timePeriodValues38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener20);
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        timePeriodValues3.setNotify(true);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        timePeriodValues7.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setDescription("");
        int int11 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) 1, 10);
        int int15 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable17 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1 + "'", comparable17, 1);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMinStartIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        timePeriodValues1.setNotify(false);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str20 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        timePeriodValues16.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        boolean boolean18 = timePeriodValues15.getNotify();
        timePeriodValues15.setRangeDescription("Time");
        timePeriodValues15.setDomainDescription("Value");
        timePeriodValues15.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener25);
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) timePeriodValues15);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        boolean boolean12 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setDomainDescription("Value");
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        java.lang.String str8 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues16.setDescription("");
        java.lang.Comparable comparable19 = timePeriodValues16.getKey();
        timePeriodValues16.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener22);
        int int24 = timePeriodValues16.getMaxStartIndex();
        timePeriodValues16.setKey((java.lang.Comparable) 100L);
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) 100L);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "hi!", "");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.setNotify(false);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        org.jfree.data.time.TimePeriodValues timePeriodValues32 = timePeriodValues25.createCopy((int) ' ', (-1));
        org.jfree.data.time.TimePeriodValue timePeriodValue33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues25.add(timePeriodValue33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
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
        org.junit.Assert.assertNotNull(timePeriodValues32);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        int int11 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener12);
        java.lang.Class<?> wildcardClass14 = timePeriodValues10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        boolean boolean12 = timePeriodValues1.isEmpty();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100, "Time", "");
        timePeriodValues3.setKey((java.lang.Comparable) 'a');
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        timePeriodValues1.setDescription("Value");
        java.lang.Class<?> wildcardClass20 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        java.lang.String str5 = timePeriodValues3.getDescription();
        int int6 = timePeriodValues3.getItemCount();
        boolean boolean7 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues9.setDescription("");
        boolean boolean12 = timePeriodValues9.getNotify();
        timePeriodValues9.setRangeDescription("Time");
        java.lang.Object obj15 = timePeriodValues9.clone();
        int int16 = timePeriodValues9.getMaxEndIndex();
        int int17 = timePeriodValues9.getMaxEndIndex();
        timePeriodValues9.setRangeDescription("");
        boolean boolean20 = timePeriodValues3.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        int int9 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        timePeriodValues1.setNotify(false);
        int int18 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable19 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setKey((java.lang.Comparable) 1L);
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        java.lang.Object obj18 = null;
        boolean boolean19 = timePeriodValues17.equals(obj18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues17.addPropertyChangeListener(propertyChangeListener20);
        timePeriodValues17.setKey((java.lang.Comparable) (-1));
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) (-1));
        org.jfree.data.time.TimePeriodValues timePeriodValues26 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int27 = timePeriodValues26.getMaxEndIndex();
        java.lang.String str28 = timePeriodValues26.getDescription();
        int int29 = timePeriodValues26.getMinEndIndex();
        boolean boolean30 = timePeriodValues1.equals((java.lang.Object) timePeriodValues26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        timePeriodValues1.delete((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriod timePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod23, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        timePeriodValues3.fireSeriesChanged();
        timePeriodValues3.delete(100, 0);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timePeriodValues1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod18 = timePeriodValues11.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        int int5 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setDomainDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        java.lang.String str11 = timePeriodValues8.getRangeDescription();
        java.lang.Object obj12 = timePeriodValues8.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues8.setDescription("");
        boolean boolean11 = timePeriodValues8.getNotify();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) boolean11);
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        int int11 = timePeriodValues7.getMaxStartIndex();
        boolean boolean12 = timePeriodValues7.getNotify();
        boolean boolean13 = timePeriodValues7.isEmpty();
        timePeriodValues7.setKey((java.lang.Comparable) (-2210593619794989709L));
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) timePeriodValues7);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy((int) '4', (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener20);
        java.lang.Class<?> wildcardClass22 = timePeriodValues19.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setDescription("Value");
        java.lang.Object obj12 = null;
        boolean boolean13 = timePeriodValues1.equals(obj12);
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        boolean boolean15 = timePeriodValues1.getNotify();
        int int16 = timePeriodValues1.getMaxMiddleIndex();
        int int17 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        int int9 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setNotify(false);
        int int15 = timePeriodValues11.getMaxMiddleIndex();
        int int16 = timePeriodValues11.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues11.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) timePeriodValues11);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str7 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        java.lang.String str10 = timePeriodValues1.getDescription();
        java.lang.Object obj11 = timePeriodValues1.clone();
        int int12 = timePeriodValues1.getMinStartIndex();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setRangeDescription("Value");
        timePeriodValues3.setKey((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues10.setDescription("");
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues10.addPropertyChangeListener(propertyChangeListener14);
        timePeriodValues10.setDescription("");
        timePeriodValues10.setKey((java.lang.Comparable) 0);
        boolean boolean20 = timePeriodValues10.getNotify();
        int int21 = timePeriodValues10.getMinMiddleIndex();
        boolean boolean22 = timePeriodValues1.equals((java.lang.Object) int21);
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues1.createCopy(0, (int) ' ');
        timePeriodValues1.delete((int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timePeriodValues25);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        int int14 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        timePeriodValues15.setRangeDescription("hi!");
        java.lang.Object obj42 = timePeriodValues15.clone();
        java.lang.Object obj43 = timePeriodValues15.clone();
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
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Time", "");
        timePeriodValues13.setDomainDescription("");
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) "");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        int int9 = timePeriodValues1.getMinStartIndex();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        boolean boolean14 = timePeriodValues12.getNotify();
        boolean boolean15 = timePeriodValues12.isEmpty();
        int int16 = timePeriodValues12.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "", "hi!");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        java.lang.String str12 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue11 = timePeriodValues1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '#', "Value", "hi!");
        timePeriodValues3.fireSeriesChanged();
        java.lang.String str5 = timePeriodValues3.getDomainDescription();
        int int6 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int4 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int7 = timePeriodValues6.getMinEndIndex();
        timePeriodValues6.setKey((java.lang.Comparable) 100L);
        int int10 = timePeriodValues6.getMaxStartIndex();
        boolean boolean11 = timePeriodValues6.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener12);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) "");
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        timePeriodValues1.setDomainDescription("");
        int int16 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        boolean boolean6 = timePeriodValues5.isEmpty();
        int int7 = timePeriodValues5.getMaxMiddleIndex();
        int int8 = timePeriodValues5.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Comparable comparable14 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 1 + "'", comparable14, 1);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
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
        boolean boolean23 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener24);
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        boolean boolean8 = timePeriodValues1.isEmpty();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues1.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        boolean boolean14 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "Value", "");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "Time", "Time");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) 10, (int) (short) 1);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriod15, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 1, 100);
        timePeriodValues1.delete((int) ' ', (int) (byte) 1);
        timePeriodValues1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timePeriodValues1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        java.lang.String str20 = timePeriodValues18.getDomainDescription();
        timePeriodValues18.delete((int) (byte) 100, 1);
        timePeriodValues18.delete((int) '#', (int) (byte) 10);
        int int27 = timePeriodValues18.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(0, (int) (byte) 100);
        int int12 = timePeriodValues1.getMaxEndIndex();
        int int13 = timePeriodValues1.getMinEndIndex();
        boolean boolean14 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        java.lang.String str15 = timePeriodValues10.getRangeDescription();
        java.lang.String str16 = timePeriodValues10.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        int int5 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        boolean boolean5 = timePeriodValues3.isEmpty();
        timePeriodValues3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        boolean boolean14 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "Time", "Value");
        int int4 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMinEndIndex();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        int int5 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.delete((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (int) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener12);
        java.lang.Class<?> wildcardClass14 = timePeriodValues11.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        boolean boolean10 = timePeriodValues9.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        boolean boolean8 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        int int15 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxStartIndex();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        boolean boolean6 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "", "Time");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues8.setDescription("");
        boolean boolean11 = timePeriodValues8.getNotify();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) boolean11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        boolean boolean16 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10);
        timePeriodValues1.fireSeriesChanged();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        int int4 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        boolean boolean10 = timePeriodValues1.getNotify();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        timePeriodValues3.fireSeriesChanged();
        java.lang.Comparable comparable5 = timePeriodValues3.getKey();
        int int6 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy(0, 100);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-1) + "'", comparable5, (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        timePeriodValues1.setNotify(false);
        java.lang.String str17 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue21 = timePeriodValues1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        timePeriodValues1.setNotify(false);
        int int11 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timePeriodValues1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "Time", "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        java.lang.String str7 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        timePeriodValues1.fireSeriesChanged();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "hi!", "");
        timePeriodValues3.setDescription("Time");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        org.jfree.data.time.TimePeriod timePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod29, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "", "");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        java.lang.String str13 = timePeriodValues1.getDescription();
        int int14 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "Time", "hi!");
        timePeriodValues3.fireSeriesChanged();
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        int int12 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timePeriodValues1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 10, (int) ' ');
        boolean boolean14 = timePeriodValues13.isEmpty();
        int int15 = timePeriodValues13.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues13.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue11 = timePeriodValues1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(0, (int) (byte) 100);
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues14.setDescription("");
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        int int18 = timePeriodValues14.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues14.removeChangeListener(seriesChangeListener19);
        timePeriodValues14.setDomainDescription("");
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timePeriodValues14.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1 + "'", comparable17, 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "Value", "hi!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean8 = timePeriodValues1.getNotify();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        int int9 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        timePeriodValues1.setNotify(true);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Time");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((-1), 10);
        java.lang.Class<?> wildcardClass13 = timePeriodValues12.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.Object obj11 = timePeriodValues1.clone();
        boolean boolean12 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        timePeriodValues1.setRangeDescription("");
        int int9 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        int int9 = timePeriodValues1.getMaxStartIndex();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (byte) -1, (int) '#');
        timePeriodValues12.setKey((java.lang.Comparable) 1);
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        int int6 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        boolean boolean17 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        java.lang.Object obj14 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 1, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        java.lang.String str8 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
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
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "", "hi!");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        boolean boolean4 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        boolean boolean10 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("");
        timePeriodValues1.setDescription("Value");
        boolean boolean15 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "", "Time");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        int int14 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        timePeriodValues1.setKey((java.lang.Comparable) (-2210593619794989709L));
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
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 1, "hi!", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int6 = timePeriodValues5.getMinEndIndex();
        timePeriodValues5.setKey((java.lang.Comparable) 100L);
        boolean boolean9 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        int int10 = timePeriodValues5.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        boolean boolean14 = timePeriodValues1.isEmpty();
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timePeriodValues3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L);
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) ' ', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        boolean boolean11 = timePeriodValues1.getNotify();
        boolean boolean12 = timePeriodValues1.getNotify();
        timePeriodValues1.setNotify(true);
        java.lang.String str15 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues17.setDescription("");
        java.lang.Comparable comparable20 = timePeriodValues17.getKey();
        int int21 = timePeriodValues17.getMinMiddleIndex();
        timePeriodValues17.setDomainDescription("hi!");
        int int24 = timePeriodValues17.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues17.addChangeListener(seriesChangeListener25);
        java.lang.Object obj27 = timePeriodValues17.clone();
        boolean boolean28 = timePeriodValues1.equals(obj27);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int8 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 1 + "'", comparable3, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(10, 0);
        timePeriodValues1.setDescription("Time");
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj13 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        java.lang.Object obj7 = timePeriodValues1.clone();
        int int8 = timePeriodValues1.getMaxStartIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.delete((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        java.lang.Object obj5 = null;
        boolean boolean6 = timePeriodValues1.equals(obj5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100);
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(true);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        int int2 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        boolean boolean6 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues10.getDomainDescription();
        int int13 = timePeriodValues10.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.add(timePeriodValue14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) ' ', 0);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        int int15 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues1.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener3);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy(0, 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Value", "hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        boolean boolean6 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '4', 1);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues12.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener15);
        timePeriodValues12.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        boolean boolean14 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy(0, (int) (byte) 10);
        java.lang.String str20 = timePeriodValues19.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        timePeriodValues1.setDomainDescription("hi!");
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
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.delete((int) 'a', (int) '4');
        int int9 = timePeriodValues1.getMinStartIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Value", "");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) ' ', 0);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) -1, 1);
        timePeriodValues1.setNotify(false);
        boolean boolean14 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable15 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass16 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        int int13 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj14 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        timePeriodValues1.delete((int) 'a', (int) '4');
        int int9 = timePeriodValues1.getMinStartIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setKey((java.lang.Comparable) (-2210593619794989709L));
        java.lang.String str11 = timePeriodValues8.getDomainDescription();
        boolean boolean12 = timePeriodValues8.getNotify();
        timePeriodValues8.fireSeriesChanged();
        int int14 = timePeriodValues8.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timePeriodValues19.removeChangeListener(seriesChangeListener28);
        boolean boolean30 = timePeriodValues19.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        java.lang.Object obj10 = timePeriodValues1.clone();
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimePeriod timePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod19, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        timePeriodValues1.fireSeriesChanged();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setDomainDescription("hi!");
        timePeriodValues3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) '#', 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues16.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100, "Time", "");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        java.lang.Comparable comparable15 = timePeriodValues1.getKey();
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        java.lang.String str21 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete((int) '4', 0);
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setKey((java.lang.Comparable) '#');
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, number16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "", "");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(0, (int) (byte) 1);
        int int5 = timePeriodValues4.getMaxStartIndex();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues1.getItemCount();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '4', 1);
        int int13 = timePeriodValues1.getMinEndIndex();
        int int14 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.Object obj11 = timePeriodValues1.clone();
        int int12 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        java.lang.String str10 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(10, 0);
        timePeriodValues15.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        int int11 = timePeriodValues7.getMaxStartIndex();
        boolean boolean12 = timePeriodValues7.getNotify();
        boolean boolean13 = timePeriodValues7.isEmpty();
        timePeriodValues7.setKey((java.lang.Comparable) (-2210593619794989709L));
        boolean boolean16 = timePeriodValues1.equals((java.lang.Object) timePeriodValues7);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy((int) '4', (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimePeriodValue timePeriodValue22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues19.add(timePeriodValue22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timePeriodValues19);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        int int12 = timePeriodValues8.getMaxStartIndex();
        java.lang.String str13 = timePeriodValues8.getDescription();
        int int14 = timePeriodValues8.getMaxStartIndex();
        timePeriodValues8.setDescription("");
        java.lang.String str17 = timePeriodValues8.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinEndIndex();
        int int12 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues14.setDescription("");
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.Object obj18 = timePeriodValues14.clone();
        timePeriodValues14.setNotify(true);
        boolean boolean21 = timePeriodValues14.getNotify();
        int int22 = timePeriodValues14.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues14.createCopy((int) '#', 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues14.removeChangeListener(seriesChangeListener26);
        int int28 = timePeriodValues14.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues31 = timePeriodValues14.createCopy((int) ' ', (int) (short) 10);
        boolean boolean32 = timePeriodValues1.equals((java.lang.Object) ' ');
        int int33 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 100L + "'", comparable12, 100L);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1 + "'", comparable17, 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getItemCount();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        boolean boolean5 = timePeriodValues3.isEmpty();
        java.lang.Object obj6 = timePeriodValues3.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy((int) (byte) 0, (int) '4');
        boolean boolean10 = timePeriodValues9.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        boolean boolean12 = timePeriodValues1.isEmpty();
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean14 = timePeriodValues1.isEmpty();
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues12.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.lang.Object obj16 = timePeriodValues12.clone();
        int int17 = timePeriodValues12.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = timePeriodValues12.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener21);
        java.lang.String str23 = timePeriodValues12.getRangeDescription();
        boolean boolean24 = timePeriodValues12.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues26 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues26.setDescription("");
        java.lang.Comparable comparable29 = timePeriodValues26.getKey();
        int int30 = timePeriodValues26.getItemCount();
        boolean boolean31 = timePeriodValues26.getNotify();
        boolean boolean32 = timePeriodValues26.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timePeriodValues26.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimePeriodValues timePeriodValues37 = timePeriodValues26.createCopy((int) (short) 100, (-1));
        boolean boolean38 = timePeriodValues12.equals((java.lang.Object) timePeriodValues26);
        int int39 = timePeriodValues12.getMaxEndIndex();
        boolean boolean40 = timePeriodValues1.equals((java.lang.Object) int39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 1 + "'", comparable29, 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(timePeriodValues37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        timePeriodValues1.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxStartIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        int int25 = timePeriodValues21.getMaxEndIndex();
        java.lang.Comparable comparable26 = timePeriodValues21.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 100L + "'", comparable26, 100L);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str9 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues12.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        int int16 = timePeriodValues12.getItemCount();
        int int17 = timePeriodValues12.getMinStartIndex();
        timePeriodValues12.setDomainDescription("hi!");
        int int20 = timePeriodValues12.getMaxStartIndex();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        timePeriodValues12.delete(100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues12.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        timePeriodValues12.delete((int) ' ', 0);
        java.lang.Object obj19 = timePeriodValues12.clone();
        timePeriodValues12.setRangeDescription("Value");
        java.lang.Object obj22 = timePeriodValues12.clone();
        boolean boolean23 = timePeriodValues12.getNotify();
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues12.delete(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int14 = timePeriodValues13.getMaxEndIndex();
        timePeriodValues13.fireSeriesChanged();
        int int16 = timePeriodValues13.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues18.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues18.removePropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues18.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues18.removePropertyChangeListener(propertyChangeListener24);
        boolean boolean26 = timePeriodValues13.equals((java.lang.Object) timePeriodValues18);
        java.lang.Comparable comparable27 = timePeriodValues13.getKey();
        java.lang.String str28 = timePeriodValues13.getRangeDescription();
        timePeriodValues13.setNotify(false);
        boolean boolean31 = timePeriodValues1.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 1 + "'", comparable27, 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (byte) 1, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 10, (int) ' ');
        int int14 = timePeriodValues13.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        int int12 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        timePeriodValues3.setDomainDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (-2210593619794989709L));
        boolean boolean11 = timePeriodValues1.getNotify();
        java.lang.Object obj12 = timePeriodValues1.clone();
        int int13 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj10 = timePeriodValues1.clone();
        timePeriodValues1.setDescription("Time");
        timePeriodValues1.delete((int) '4', 10);
        java.lang.Object obj16 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues1.getItemCount();
        java.lang.Object obj12 = timePeriodValues1.clone();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str8 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        int int4 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        timePeriodValues8.fireSeriesChanged();
        int int13 = timePeriodValues8.getMinMiddleIndex();
        int int14 = timePeriodValues8.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '#', (int) (short) -1);
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setRangeDescription("");
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        timePeriodValues1.setNotify(false);
        int int17 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        java.lang.String str12 = timePeriodValues1.getDescription();
        timePeriodValues1.delete((int) (short) 10, (int) (short) 1);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        int int5 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10L, "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        java.lang.String str23 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener26);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertNotNull(timePeriodValues20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        int int12 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1.0f + "'", comparable13, 1.0f);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        java.lang.Object obj16 = timePeriodValues1.clone();
        int int17 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        int int16 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str8 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 100 + "'", comparable9, (short) 100);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        int int17 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "Time", "Value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 100L + "'", comparable12, 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        timePeriodValues1.setNotify(false);
        boolean boolean27 = timePeriodValues1.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        boolean boolean14 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1 + "'", comparable12, 1);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues8.getNotify();
        timePeriodValues8.setDescription("Time");
        java.lang.String str15 = timePeriodValues8.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        int int2 = timePeriodValues1.getItemCount();
        int int3 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

