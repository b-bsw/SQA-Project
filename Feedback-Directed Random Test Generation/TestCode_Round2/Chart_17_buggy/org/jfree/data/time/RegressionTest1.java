package org.jfree.data.time;

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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries8.getNextTimePeriod();
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
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = timeSeries15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries8.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries4.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries4.createCopy((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.Class class29 = timeSeries4.getTimePeriodClass();
        int int30 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries4.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        timeSeries24.setKey((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries24.getNextTimePeriod();
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
            timeSeries21.update(regularTimePeriod33, (java.lang.Number) 0);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (byte) -1, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod10, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        timeSeries4.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        int int28 = timeSeries27.getMaximumItemCount();
        long long29 = timeSeries27.getMaximumItemAge();
        java.util.List list30 = timeSeries27.getItems();
        timeSeries2.data = list30;
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.Class class37 = null;
        timeSeries36.timePeriodClass = class37;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean42 = timeSeries36.equals((java.lang.Object) "Time");
        java.util.List list43 = timeSeries36.getItems();
        timeSeries2.data = list43;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod45, (java.lang.Number) 1L);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        timeSeries13.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries13.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
            timeSeries12.add(regularTimePeriod19, (double) 0.0f, false);
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries4.getKey();
        java.util.List list12 = timeSeries4.data;
        java.lang.String str13 = timeSeries4.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0f + "'", comparable11, 0.0f);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Overwritten values from: 100", (java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries7.addOrUpdate(regularTimePeriod28, (double) 0L);
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(0, (java.lang.Number) (-1L));
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.String str25 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries4.createCopy(regularTimePeriod26, regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update((int) (byte) 1, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        int int9 = timeSeries4.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.addOrUpdate(regularTimePeriod10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.removeAgedItems((long) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod33, (java.lang.Number) 0L, false);
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries2.addOrUpdate(regularTimePeriod45, (java.lang.Number) (byte) 100);
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        int int14 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        java.lang.String str16 = timeSeries4.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        timeSeries4.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
            java.lang.Number number44 = timeSeries21.getValue(regularTimePeriod43);
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        timeSeries8.setMaximumItemAge((long) '4');
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
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.removeAgedItems(0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setDescription("Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries4.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timeSeries1.getDescription();
        timeSeries1.removeAgedItems(10L, true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
            java.lang.Number number29 = timeSeries26.getValue(regularTimePeriod28);
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
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
        timeSeries4.setMaximumItemAge((long) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod37, (double) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = timeSeries1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        timeSeries4.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod26, (double) '4');
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDescription();
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 10);
        java.lang.String str19 = timeSeries14.getDomainDescription();
        timeSeries14.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class25);
        java.lang.Class class27 = null;
        timeSeries26.timePeriodClass = class27;
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener29);
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass33 = timeSeries26.getClass();
        timeSeries14.timePeriodClass = wildcardClass33;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass33);
        timeSeries4.timePeriodClass = wildcardClass33;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod37, (double) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries4.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 0.0f + "'", comparable5, 0.0f);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        int int15 = timeSeries13.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod16, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.lang.String str26 = timeSeries25.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries25.createCopy(regularTimePeriod27, regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.setNotify(false);
        timeSeries1.setMaximumItemCount((int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod8, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.String str14 = timeSeries4.getDomainDescription();
        timeSeries4.setKey((java.lang.Comparable) (short) -1);
        timeSeries4.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries4.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeSeries4.getIndex(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.util.Collection collection52 = timeSeries4.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener53);
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
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod16, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.Class class24 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) '4');
        java.lang.String str27 = timeSeries4.getRangeDescription();
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        int int10 = timeSeries5.getMaximumItemCount();
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass13 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', (java.lang.Class) wildcardClass13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update(regularTimePeriod17, (java.lang.Number) (-1.0d));
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        timeSeries4.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.setNotify(false);
        timeSeries1.setMaximumItemCount((int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries32);
        java.util.List list37 = timeSeries36.getItems();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener38);
        timeSeries36.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries16.addAndOrUpdate(timeSeries36);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = timeSeries42.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries9.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries4.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        boolean boolean8 = timeSeries4.getNotify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.Comparable comparable30 = timeSeries12.getKey();
        timeSeries12.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod33, 1.0d, false);
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
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 100" + "'", comparable30, "Overwritten values from: 100");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
            timeSeries4.update(regularTimePeriod24, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        timeSeries16.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries16.removeChangeListener(seriesChangeListener19);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.lang.Class class26 = null;
        timeSeries25.timePeriodClass = class26;
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener28);
        timeSeries25.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass32 = timeSeries25.getClass();
        timeSeries16.timePeriodClass = wildcardClass32;
        long long34 = timeSeries16.getMaximumItemAge();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.Class class40 = null;
        timeSeries39.timePeriodClass = class40;
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries39.removePropertyChangeListener(propertyChangeListener42);
        timeSeries39.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries39.addChangeListener(seriesChangeListener46);
        int int48 = timeSeries39.getItemCount();
        timeSeries39.setDescription("Time");
        timeSeries39.clear();
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class53);
        java.lang.String str55 = timeSeries54.getRangeDescription();
        timeSeries54.setMaximumItemCount(100);
        java.lang.Class class59 = null;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class59);
        java.lang.String str61 = timeSeries60.getRangeDescription();
        timeSeries60.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries54.addAndOrUpdate(timeSeries60);
        java.util.List list65 = timeSeries64.getItems();
        java.lang.Class class67 = null;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class67);
        java.lang.String str69 = timeSeries68.getRangeDescription();
        timeSeries68.setMaximumItemCount(100);
        java.lang.Class class73 = null;
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class73);
        java.lang.String str75 = timeSeries74.getRangeDescription();
        timeSeries74.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries68.addAndOrUpdate(timeSeries74);
        java.util.List list79 = timeSeries78.getItems();
        timeSeries64.data = list79;
        java.util.List list81 = timeSeries64.getItems();
        timeSeries64.setDescription("");
        timeSeries64.setDomainDescription("Overwritten values from: 100");
        java.util.Collection collection86 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        java.util.List list87 = timeSeries64.getItems();
        timeSeries16.data = list87;
        timeSeries4.data = list87;
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223372036854775807L + "'", long34 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value" + "'", str55, "Value");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Value" + "'", str61, "Value");
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Value" + "'", str69, "Value");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Value" + "'", str75, "Value");
        org.junit.Assert.assertNotNull(timeSeries78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(list87);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        timeSeries4.setDomainDescription("hi!");
        java.lang.Class class13 = timeSeries4.getTimePeriodClass();
        java.lang.String str14 = timeSeries4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        timeSeries2.fireSeriesChanged();
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod7, (double) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class53);
        java.lang.Class class55 = null;
        timeSeries54.timePeriodClass = class55;
        timeSeries54.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries54.addChangeListener(seriesChangeListener59);
        timeSeries54.clear();
        timeSeries54.setNotify(false);
        java.lang.Class<?> wildcardClass64 = timeSeries54.getClass();
        boolean boolean65 = timeSeries14.equals((java.lang.Object) wildcardClass64);
        timeSeries14.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = timeSeries14.addOrUpdate(regularTimePeriod68, (double) 0.0f);
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
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 0.0f + "'", comparable49, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries1.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        java.lang.String str18 = timeSeries2.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries2.removeChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries2.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        timeSeries4.setKey((java.lang.Comparable) false);
        timeSeries4.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        timeSeries2.setMaximumItemAge(0L);
        org.junit.Assert.assertNull(class3);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.Class class24 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) '4');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        timeSeries2.setDomainDescription("Overwritten values from: 100");
        int int7 = timeSeries2.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries2.addOrUpdate(regularTimePeriod8, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        long long7 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.Class class21 = timeSeries2.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries2.getDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems(10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(0, (int) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod16, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.lang.String str18 = timeSeries2.getRangeDescription();
        timeSeries2.setDescription("Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        int int10 = timeSeries2.getMaximumItemCount();
        long long11 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class7);
        java.lang.Class class9 = null;
        timeSeries8.timePeriodClass = class9;
        timeSeries8.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries8.addChangeListener(seriesChangeListener13);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.Class class20 = null;
        timeSeries19.timePeriodClass = class20;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener22);
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass26 = timeSeries19.getClass();
        timeSeries8.timePeriodClass = wildcardClass26;
        java.lang.Class class28 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", class28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", class28);
        timeSeries30.clear();
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(class28);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.lang.String str18 = timeSeries2.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries2.removeChangeListener(seriesChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries2.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str25 = timeSeries2.getDomainDescription();
        int int26 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Class class27 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries30 = timeSeries21.createCopy(regularTimePeriod28, regularTimePeriod29);
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
        org.junit.Assert.assertNull(class27);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) (short) 0, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.setDescription("");
        java.lang.Class class14 = timeSeries4.getTimePeriodClass();
        java.util.List list15 = timeSeries4.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries4.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        int int19 = timeSeries12.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        java.util.List list26 = timeSeries25.getItems();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.util.List list40 = timeSeries39.getItems();
        timeSeries25.data = list40;
        java.util.List list42 = timeSeries25.getItems();
        boolean boolean43 = timeSeries25.isEmpty();
        java.lang.Class class44 = timeSeries25.getTimePeriodClass();
        java.util.Collection collection45 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.update(regularTimePeriod46, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        boolean boolean6 = timeSeries2.getNotify();
        boolean boolean7 = timeSeries2.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries2.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries2.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.Class class26 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setKey((java.lang.Comparable) "Value");
        boolean boolean10 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries4.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "" + "'", comparable18, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.removeAgedItems((long) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.lang.Comparable comparable6 = timeSeries2.getKey();
        timeSeries2.fireSeriesChanged();
        long long8 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        boolean boolean14 = timeSeries12.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod15, (double) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries4.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        int int13 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries2.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        boolean boolean14 = timeSeries12.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries12.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.removeAgedItems(0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.addAndOrUpdate(timeSeries5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod17, (java.lang.Number) (short) 10);
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = timeSeries13.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy((int) 'a', 10);
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries13.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.lang.Class class14 = timeSeries4.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getItemCount();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod16, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries8.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        timeSeries18.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
            timeSeries4.add(timeSeriesDataItem62, true);
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        timeSeries4.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod15, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries13.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, (java.lang.Number) 9223372036854775807L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener11);
        timeSeries4.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.String str14 = timeSeries4.getDomainDescription();
        java.lang.String str15 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries4.addOrUpdate(regularTimePeriod16, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.List list13 = timeSeries9.getItems();
        java.lang.Comparable comparable14 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Overwritten values from: 100" + "'", comparable14, "Overwritten values from: 100");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries2.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        timeSeries8.setMaximumItemAge((long) '#');
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update(regularTimePeriod15, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        timeSeries4.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries4.getNextTimePeriod();
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        java.lang.String str14 = timeSeries13.getDescription();
        java.util.Collection collection15 = timeSeries13.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        timeSeries5.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener20);
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass24 = timeSeries17.getClass();
        timeSeries5.timePeriodClass = wildcardClass24;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries26.removeChangeListener(seriesChangeListener27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.String str4 = timeSeries2.getRangeDescription();
        long long5 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        java.lang.String str2 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        java.lang.String str9 = timeSeries7.getDescription();
        boolean boolean11 = timeSeries7.equals((java.lang.Object) 10);
        int int12 = timeSeries7.getMaximumItemCount();
        int int13 = timeSeries7.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timeSeries7.getDomainDescription();
        java.lang.Class<?> wildcardClass17 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "hi!", "Time", (java.lang.Class) wildcardClass17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries15.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.setDomainDescription("hi!");
        boolean boolean12 = timeSeries8.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.removeAgedItems((long) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class9);
        java.lang.Class class11 = null;
        timeSeries10.timePeriodClass = class11;
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener13);
        timeSeries10.setMaximumItemCount(100);
        boolean boolean18 = timeSeries10.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass19 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Time", "Value", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 100", "hi!", (java.lang.Class) wildcardClass19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod22, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries21.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(timeSeriesDataItem16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        timeSeries1.setRangeDescription("hi!");
        timeSeries1.setMaximumItemCount((int) ' ');
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setKey((java.lang.Comparable) 100);
        timeSeries19.setMaximumItemAge((long) '#');
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries19.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries4.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(2147483647, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries30.createCopy((int) '#', (-1));
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        timeSeries2.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class1);
        org.jfree.data.time.TimeSeries timeSeries3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries2.addAndOrUpdate(timeSeries3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries4.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.Class class12 = null;
        timeSeries11.timePeriodClass = class12;
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener14);
        timeSeries11.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries11.addChangeListener(seriesChangeListener18);
        int int20 = timeSeries11.getItemCount();
        java.util.List list21 = timeSeries11.getItems();
        timeSeries4.data = list21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod8, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries32);
        java.util.List list37 = timeSeries36.getItems();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener38);
        timeSeries36.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries16.addAndOrUpdate(timeSeries36);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener43);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.lang.Comparable comparable6 = timeSeries2.getKey();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries15);
        java.util.List list20 = timeSeries19.getItems();
        timeSeries2.data = list20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = timeSeries2.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        java.util.List list11 = timeSeries4.data;
        boolean boolean12 = timeSeries4.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        timeSeries4.setMaximumItemCount((int) (short) 1);
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update((int) (byte) 0, number16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        java.lang.String str9 = timeSeries7.getDescription();
        boolean boolean11 = timeSeries7.equals((java.lang.Object) 10);
        java.lang.String str12 = timeSeries7.getDomainDescription();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.util.Collection collection18 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        java.util.Collection collection19 = timeSeries17.getTimePeriods();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries28);
        java.util.List list33 = timeSeries32.getItems();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount(100);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class41);
        java.lang.String str43 = timeSeries42.getRangeDescription();
        timeSeries42.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries36.addAndOrUpdate(timeSeries42);
        java.util.List list47 = timeSeries46.getItems();
        timeSeries32.data = list47;
        timeSeries17.data = list47;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries17.addChangeListener(seriesChangeListener50);
        java.lang.Comparable comparable52 = timeSeries17.getKey();
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class56);
        java.lang.Class class58 = null;
        timeSeries57.timePeriodClass = class58;
        timeSeries57.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries57.addChangeListener(seriesChangeListener62);
        timeSeries57.clear();
        timeSeries57.setNotify(false);
        java.lang.Class<?> wildcardClass67 = timeSeries57.getClass();
        boolean boolean68 = timeSeries17.equals((java.lang.Object) wildcardClass67);
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Time", "Time", (java.lang.Class) wildcardClass67);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod70 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries69.add(regularTimePeriod70, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + 0.0f + "'", comparable52, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries12.getValue(regularTimePeriod18);
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy((int) (short) 0, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries21 = timeSeries1.createCopy(regularTimePeriod19, regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        timeSeries2.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
            timeSeries4.add(regularTimePeriod11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod31);
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod9);
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.lang.Class class31 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(regularTimePeriod32);
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
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
            timeSeries8.add(timeSeriesDataItem29);
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        long long35 = timeSeries34.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.util.List list2 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        timeSeries2.removeAgedItems(true);
        java.util.List list8 = timeSeries2.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries2.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries2.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
            timeSeries7.add(regularTimePeriod14, (double) (byte) -1);
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries4.addOrUpdate(regularTimePeriod11, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
            java.lang.Number number19 = timeSeries13.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        boolean boolean19 = timeSeries4.equals((java.lang.Object) comparable18);
        timeSeries4.setKey((java.lang.Comparable) "Value");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Overwritten values from: 100" + "'", comparable18, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries28.addOrUpdate(regularTimePeriod45, (java.lang.Number) 9223372036854775807L);
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        java.util.List list4 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod10, (double) 10L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries8.addOrUpdate(regularTimePeriod30, (java.lang.Number) (short) 100);
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
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        java.lang.String str23 = timeSeries2.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries2.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
            java.lang.Number number29 = timeSeries12.getValue(regularTimePeriod28);
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.util.List list6 = timeSeries2.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class9);
        java.lang.Class class11 = null;
        timeSeries10.timePeriodClass = class11;
        timeSeries10.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries10.addChangeListener(seriesChangeListener15);
        timeSeries10.clear();
        timeSeries10.setNotify(true);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Class class25 = null;
        timeSeries24.timePeriodClass = class25;
        timeSeries24.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries24.addChangeListener(seriesChangeListener29);
        timeSeries24.clear();
        timeSeries24.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries10.addAndOrUpdate(timeSeries24);
        java.lang.Class<?> wildcardClass35 = timeSeries34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "", "Time", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Time", "", (java.lang.Class) wildcardClass35);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.Comparable comparable30 = timeSeries12.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries12.removeChangeListener(seriesChangeListener31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries12.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 100" + "'", comparable30, "Overwritten values from: 100");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries8.createCopy((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) '#', (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        timeSeries13.removeAgedItems(false);
        timeSeries13.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.removeAgedItems((long) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list2 = timeSeries1.getItems();
        timeSeries1.setDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod5, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.Comparable comparable30 = timeSeries12.getKey();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.util.List list33 = timeSeries32.getItems();
        timeSeries12.data = list33;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + "Overwritten values from: 100" + "'", comparable30, "Overwritten values from: 100");
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        timeSeries4.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries4.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.lang.Class class24 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) '4');
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        timeSeries29.removeAgedItems(true);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries34);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.Class class42 = null;
        timeSeries41.timePeriodClass = class42;
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener44);
        timeSeries41.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries41.addChangeListener(seriesChangeListener48);
        int int50 = timeSeries41.getItemCount();
        java.util.Collection collection51 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.lang.String str52 = timeSeries29.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries4.addAndOrUpdate(timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener54);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Time" + "'", str52, "Time");
        org.junit.Assert.assertNotNull(timeSeries53);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
            timeSeries4.update((int) 'a', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        timeSeries20.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries20.createCopy((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries47 = timeSeries44.createCopy((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        int int10 = timeSeries5.getMaximumItemCount();
        int int11 = timeSeries5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = timeSeries5.getDomainDescription();
        java.lang.Class<?> wildcardClass15 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
            timeSeries2.delete(regularTimePeriod23);
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.getDataItem((int) (byte) 1);
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem62 = timeSeries13.getDataItem(regularTimePeriod61);
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
            java.lang.Object obj31 = timeSeries26.clone();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(1, (int) (short) 100);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        boolean boolean17 = timeSeries15.getNotify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries4.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries4.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
            timeSeries2.delete(regularTimePeriod18);
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        boolean boolean2 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.String str18 = timeSeries2.getRangeDescription();
        timeSeries2.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.util.Collection collection29 = timeSeries8.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries8.addOrUpdate(regularTimePeriod30, (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        timeSeries14.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries51 = timeSeries14.createCopy(regularTimePeriod49, regularTimePeriod50);
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
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries4.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timeSeries4.isEmpty();
        timeSeries4.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        java.util.List list26 = timeSeries25.getItems();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.util.List list40 = timeSeries39.getItems();
        timeSeries25.data = list40;
        java.util.List list42 = timeSeries25.getItems();
        boolean boolean43 = timeSeries25.isEmpty();
        java.lang.Class class44 = timeSeries25.getTimePeriodClass();
        java.util.Collection collection45 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.lang.Class class46 = null;
        timeSeries4.timePeriodClass = class46;
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class55);
        java.lang.String str57 = timeSeries56.getRangeDescription();
        java.lang.String str58 = timeSeries56.getDescription();
        java.lang.Class class59 = timeSeries56.getTimePeriodClass();
        java.lang.Class<?> wildcardClass60 = timeSeries56.getClass();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass60);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Overwritten values from: 100", "Overwritten values from: 100", (java.lang.Class) wildcardClass60);
        boolean boolean63 = timeSeries4.equals((java.lang.Object) "Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Time" + "'", str57, "Time");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(class59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        timeSeries6.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries6.addChangeListener(seriesChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener20);
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass24 = timeSeries17.getClass();
        timeSeries6.timePeriodClass = wildcardClass24;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries27.addOrUpdate(regularTimePeriod28, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        int int28 = timeSeries27.getMaximumItemCount();
        long long29 = timeSeries27.getMaximumItemAge();
        java.util.List list30 = timeSeries27.getItems();
        timeSeries2.data = list30;
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.Class class37 = null;
        timeSeries36.timePeriodClass = class37;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean42 = timeSeries36.equals((java.lang.Object) "Time");
        java.util.List list43 = timeSeries36.getItems();
        timeSeries2.data = list43;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeries2.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        java.lang.String str8 = timeSeries6.getDescription();
        boolean boolean10 = timeSeries6.equals((java.lang.Object) 10);
        java.lang.String str11 = timeSeries6.getDomainDescription();
        timeSeries6.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.Class class19 = null;
        timeSeries18.timePeriodClass = class19;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener21);
        timeSeries18.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass25 = timeSeries18.getClass();
        timeSeries6.timePeriodClass = wildcardClass25;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class<?> wildcardClass7 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = timeSeries9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        boolean boolean19 = timeSeries4.equals((java.lang.Object) comparable18);
        timeSeries4.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Overwritten values from: 100" + "'", comparable18, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str23 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod24, (double) 9223372036854775807L, true);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries7.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        timeSeries7.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries7.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = timeSeries7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        timeSeries4.fireSeriesChanged();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener20);
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass24 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass24);
        int int26 = timeSeries25.getMaximumItemCount();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        java.lang.String str43 = timeSeries41.getDescription();
        boolean boolean45 = timeSeries41.equals((java.lang.Object) 10);
        java.lang.String str46 = timeSeries41.getDomainDescription();
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class50);
        java.util.Collection collection52 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        java.util.Collection collection53 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class57);
        java.lang.String str59 = timeSeries58.getRangeDescription();
        timeSeries58.setMaximumItemCount(100);
        java.lang.Class class63 = null;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class63);
        java.lang.String str65 = timeSeries64.getRangeDescription();
        timeSeries64.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries58.addAndOrUpdate(timeSeries64);
        java.util.List list69 = timeSeries68.getItems();
        timeSeries55.data = list69;
        boolean boolean71 = timeSeries29.equals((java.lang.Object) timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries25.addAndOrUpdate(timeSeries29);
        java.lang.Class class76 = null;
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class76);
        java.lang.String str78 = timeSeries77.getRangeDescription();
        int int79 = timeSeries77.getMaximumItemCount();
        java.util.Collection collection80 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries77);
        int int81 = timeSeries77.getItemCount();
        java.util.List list82 = timeSeries77.getItems();
        timeSeries4.data = list82;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Time" + "'", str42, "Time");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value" + "'", str65, "Value");
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Time" + "'", str78, "Time");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.lang.String str13 = timeSeries7.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        timeSeries8.setMaximumItemAge((long) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod31, (double) 100);
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
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
            timeSeries14.add(timeSeriesDataItem47, true);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries13.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(class8);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        int int14 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries4.addOrUpdate(regularTimePeriod18, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries26.addOrUpdate(regularTimePeriod27, (java.lang.Number) 0);
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.String str14 = timeSeries4.getDomainDescription();
        timeSeries4.setKey((java.lang.Comparable) (short) -1);
        timeSeries4.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries4.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries4.addOrUpdate(regularTimePeriod21, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        java.lang.String str32 = timeSeries26.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = timeSeries26.getValue(regularTimePeriod33);
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.String str16 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod17, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        timeSeries4.setDomainDescription("Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
            timeSeries4.update(regularTimePeriod25, (java.lang.Number) (byte) -1);
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.String str40 = timeSeries35.getDomainDescription();
        timeSeries35.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.lang.Class class48 = null;
        timeSeries47.timePeriodClass = class48;
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener50);
        timeSeries47.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass54 = timeSeries47.getClass();
        timeSeries35.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries26.addAndOrUpdate(timeSeries35);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = timeSeries35.getNextTimePeriod();
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
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.addOrUpdate(regularTimePeriod8, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        timeSeries4.setNotify(true);
        java.lang.Comparable comparable14 = timeSeries4.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod15, (double) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 0.0f + "'", comparable14, 0.0f);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        boolean boolean46 = timeSeries14.equals((java.lang.Object) timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener47);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem50 = timeSeries29.getDataItem(regularTimePeriod49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class class16 = timeSeries4.getTimePeriodClass();
        timeSeries4.setDescription("Value");
        java.lang.String str19 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries4.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries21);
        java.util.List list26 = timeSeries25.getItems();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.util.List list40 = timeSeries39.getItems();
        timeSeries25.data = list40;
        java.util.List list42 = timeSeries25.getItems();
        boolean boolean43 = timeSeries25.isEmpty();
        java.lang.Class class44 = timeSeries25.getTimePeriodClass();
        java.util.Collection collection45 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.lang.Class<?> wildcardClass46 = timeSeries4.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
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
        timeSeries4.setMaximumItemAge((long) 0);
        java.lang.Class class37 = null;
        timeSeries4.timePeriodClass = class37;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        java.lang.String str14 = timeSeries13.getDescription();
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.setKey(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.setNotify(false);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        int int14 = timeSeries9.getMaximumItemCount();
        int int15 = timeSeries9.getItemCount();
        timeSeries9.setDomainDescription("");
        java.util.Collection collection18 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeSeries9.getIndex(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        timeSeries7.setDomainDescription("Time");
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        int int5 = timeSeries4.getItemCount();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "", class6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries7.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        boolean boolean14 = timeSeries12.isEmpty();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        timeSeries17.removeAgedItems(true);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        timeSeries22.removeAgedItems(false);
        java.util.Collection collection27 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(regularTimePeriod28, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries18.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(false);
        long long14 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries4.addOrUpdate(regularTimePeriod15, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
            timeSeries15.add(regularTimePeriod16, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.Class class29 = timeSeries4.getTimePeriodClass();
        int int30 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries4.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries4.getItemCount();
        boolean boolean12 = timeSeries4.getNotify();
        timeSeries4.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.removeChangeListener(seriesChangeListener6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
            timeSeries8.add(regularTimePeriod30, (java.lang.Number) (byte) 100, true);
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        java.util.List list12 = timeSeries9.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries9.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.removeAgedItems((long) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.util.List list10 = timeSeries7.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, (double) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        int int14 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        boolean boolean31 = timeSeries26.getNotify();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        timeSeries14.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod33, (double) (byte) 10);
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.setDescription("");
        java.lang.Class class14 = timeSeries4.getTimePeriodClass();
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod17, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries2.addOrUpdate(regularTimePeriod14, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries4.getDescription();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Overwritten values from: 100", (java.lang.Class) wildcardClass6);
        timeSeries8.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
            timeSeries4.add(regularTimePeriod12, (java.lang.Number) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.Class class8 = null;
        timeSeries7.timePeriodClass = class8;
        timeSeries7.removeAgedItems(false);
        java.lang.Class<?> wildcardClass12 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass12);
        java.util.List list14 = timeSeries13.getItems();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        timeSeries7.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries7.removeChangeListener(seriesChangeListener10);
        timeSeries7.setDescription("Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.lang.Class class26 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.createCopy(regularTimePeriod27, regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0f + "'", comparable11, 0.0f);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.Comparable comparable0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries(comparable0, (java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        java.lang.Class class8 = timeSeries5.getTimePeriodClass();
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener8);
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass12 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass12);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = timeSeries13.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        java.lang.String str8 = timeSeries6.getDescription();
        boolean boolean10 = timeSeries6.equals((java.lang.Object) 10);
        java.lang.String str11 = timeSeries6.getDomainDescription();
        timeSeries6.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.Class class19 = null;
        timeSeries18.timePeriodClass = class19;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener21);
        timeSeries18.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass25 = timeSeries18.getClass();
        timeSeries6.timePeriodClass = wildcardClass25;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries28.addOrUpdate(regularTimePeriod29, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        int int31 = timeSeries12.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries12.removeChangeListener(seriesChangeListener32);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
            timeSeries24.removeAgedItems((long) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.String str25 = timeSeries2.getDomainDescription();
        int int26 = timeSeries2.getMaximumItemCount();
        java.lang.String str27 = timeSeries2.getDomainDescription();
        java.lang.String str28 = timeSeries2.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        timeSeries6.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries6.addChangeListener(seriesChangeListener11);
        timeSeries6.clear();
        timeSeries6.setNotify(false);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.String str22 = timeSeries20.getDescription();
        boolean boolean24 = timeSeries20.equals((java.lang.Object) 10);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.util.Collection collection31 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.util.Collection collection32 = timeSeries30.getTimePeriods();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        timeSeries41.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.addAndOrUpdate(timeSeries41);
        java.util.List list46 = timeSeries45.getItems();
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(100);
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class54);
        java.lang.String str56 = timeSeries55.getRangeDescription();
        timeSeries55.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries49.addAndOrUpdate(timeSeries55);
        java.util.List list60 = timeSeries59.getItems();
        timeSeries45.data = list60;
        timeSeries30.data = list60;
        timeSeries6.data = list60;
        timeSeries1.data = list60;
        java.lang.Class<?> wildcardClass65 = timeSeries1.getClass();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class64);
        java.lang.String str66 = timeSeries65.getRangeDescription();
        int int67 = timeSeries65.getMaximumItemCount();
        java.util.Collection collection68 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        timeSeries65.setDescription("hi!");
        timeSeries65.setNotify(false);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Time" + "'", str66, "Time");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        long long3 = timeSeries2.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries2.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        timeSeries28.setNotify(true);
        timeSeries28.removeAgedItems((long) 2147483647, false);
        timeSeries28.fireSeriesChanged();
        timeSeries28.setMaximumItemAge((long) 0);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.createCopy(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        timeSeries24.setKey((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(timeSeriesDataItem30);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod7, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        int int18 = timeSeries2.getMaximumItemCount();
        timeSeries2.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod21, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        timeSeries9.setMaximumItemAge((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update((int) (short) 1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
            java.lang.Number number15 = timeSeries4.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries4.getValue((-1));
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.Class class21 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries4.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(class21);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
            timeSeries15.add(regularTimePeriod16, (java.lang.Number) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        java.lang.String str14 = timeSeries9.getDescription();
        java.lang.String str15 = timeSeries9.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(10, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 1);
        java.lang.String str7 = timeSeries1.getRangeDescription();
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        timeSeries4.setDomainDescription("hi!");
        java.lang.Class class13 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = timeSeries8.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.createCopy((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries9.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries15.removeChangeListener(seriesChangeListener29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = timeSeries15.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.String str16 = timeSeries14.getDomainDescription();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener31);
        java.util.Collection collection33 = timeSeries12.getTimePeriods();
        timeSeries12.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries12.getValue(regularTimePeriod36);
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
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        long long8 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries4.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        timeSeries4.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.createCopy((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        java.lang.String str14 = timeSeries13.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.lang.String str16 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries4.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class class16 = timeSeries4.getTimePeriodClass();
        int int17 = timeSeries4.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = timeSeries2.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getDomainDescription();
        timeSeries2.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.clear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        java.lang.String str11 = timeSeries4.getDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries20);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount(100);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries20.addAndOrUpdate(timeSeries33);
        timeSeries38.setRangeDescription("hi!");
        int int41 = timeSeries38.getMaximumItemCount();
        java.lang.String str42 = timeSeries38.getDomainDescription();
        long long43 = timeSeries38.getMaximumItemAge();
        java.util.Collection collection44 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries38.addOrUpdate(regularTimePeriod45, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Time" + "'", str42, "Time");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class13 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.String str25 = timeSeries2.getDomainDescription();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        java.lang.String str32 = timeSeries30.getDescription();
        boolean boolean34 = timeSeries30.equals((java.lang.Object) 10);
        int int35 = timeSeries30.getMaximumItemCount();
        int int36 = timeSeries30.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries30.removeChangeListener(seriesChangeListener37);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries30.addChangeListener(seriesChangeListener39);
        boolean boolean41 = timeSeries2.equals((java.lang.Object) timeSeries30);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        long long8 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        timeSeries1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod10, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries12.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries12.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        boolean boolean48 = timeSeries26.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = timeSeries26.getValue(regularTimePeriod49);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
            java.lang.Number number14 = timeSeries7.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        boolean boolean48 = timeSeries26.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = timeSeries26.getIndex(regularTimePeriod49);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        int int11 = timeSeries4.getItemCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        timeSeries4.fireSeriesChanged();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        timeSeries16.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries16.addChangeListener(seriesChangeListener21);
        timeSeries16.setNotify(true);
        java.util.Collection collection25 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = timeSeries16.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy((int) (short) 0, 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries4);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.List list13 = timeSeries9.getItems();
        java.lang.Comparable comparable14 = timeSeries9.getKey();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setKey((java.lang.Comparable) 100);
        timeSeries19.setMaximumItemAge((long) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries9.addAndOrUpdate(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.update((int) (byte) -1, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Overwritten values from: 100" + "'", comparable14, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setKey((java.lang.Comparable) 100);
        timeSeries4.setMaximumItemAge((long) '#');
        int int10 = timeSeries4.getItemCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list2 = timeSeries1.getItems();
        timeSeries1.setDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.lang.Class class31 = timeSeries12.getTimePeriodClass();
        java.util.List list32 = timeSeries12.data;
        timeSeries12.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries12.getDataItem(regularTimePeriod34);
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
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.setNotify(false);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        int int14 = timeSeries9.getMaximumItemCount();
        int int15 = timeSeries9.getItemCount();
        timeSeries9.setDomainDescription("");
        java.util.Collection collection18 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries9.addOrUpdate(regularTimePeriod19, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        timeSeries21.setDescription("");
        java.util.List list29 = timeSeries21.getItems();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setNotify(true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.String str14 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount(10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod17, 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long2 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        timeSeries5.removeAgedItems(true);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        java.lang.String str11 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.util.List list13 = timeSeries10.data;
        timeSeries1.data = list13;
        long long15 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries4.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        long long10 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries4.addOrUpdate(regularTimePeriod17, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries4.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        timeSeries4.setKey((java.lang.Comparable) 'a');
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries4.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        timeSeries28.setNotify(true);
        int int47 = timeSeries28.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = timeSeries8.getIndex(regularTimePeriod30);
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
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries12.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod12, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        timeSeries28.setNotify(true);
        timeSeries28.removeAgedItems((long) 2147483647, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = timeSeries28.getNextTimePeriod();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.String str35 = timeSeries34.getRangeDescription();
        java.util.List list36 = timeSeries34.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries34.getValue(regularTimePeriod37);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
            timeSeries26.update(regularTimePeriod29, (java.lang.Number) (-1.0f));
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        timeSeries26.removePropertyChangeListener(propertyChangeListener27);
        timeSeries26.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.delete((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries4.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.List list13 = timeSeries9.getItems();
        java.lang.Comparable comparable14 = timeSeries9.getKey();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setKey((java.lang.Comparable) 100);
        timeSeries19.setMaximumItemAge((long) '#');
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries9.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Overwritten values from: 100" + "'", comparable14, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.lang.Comparable comparable6 = timeSeries2.getKey();
        boolean boolean7 = timeSeries2.getNotify();
        int int8 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.String str24 = timeSeries16.getDomainDescription();
        java.lang.String str25 = timeSeries16.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = timeSeries24.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.String str26 = timeSeries25.getRangeDescription();
        java.util.List list27 = timeSeries25.data;
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod29, (java.lang.Number) 2147483647);
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
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        timeSeries38.removeAgedItems(false);
        java.lang.Class<?> wildcardClass43 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass43);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "hi!", (java.lang.Class) wildcardClass43);
        java.util.Collection collection46 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries45.add(regularTimePeriod47, (java.lang.Number) (short) 1, true);
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
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries1.addChangeListener(seriesChangeListener28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        boolean boolean46 = timeSeries14.equals((java.lang.Object) timeSeries29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod47, (java.lang.Number) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        int int2 = timeSeries1.getItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.util.List list6 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        boolean boolean17 = timeSeries14.getNotify();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class class27 = timeSeries21.getTimePeriodClass();
        int int28 = timeSeries21.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod29, (java.lang.Number) 10);
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
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = timeSeries2.data;
        java.lang.Class class13 = timeSeries2.getTimePeriodClass();
        int int14 = timeSeries2.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries2.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        int int18 = timeSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update((int) '4', (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.Class class24 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemAge((long) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeSeries4.getIndex(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries13.addOrUpdate(regularTimePeriod18, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries2.removeChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries2.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Comparable comparable31 = timeSeries2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (byte) 100 + "'", comparable31, (byte) 100);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        int int12 = timeSeries7.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timeSeries1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        timeSeries4.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = timeSeries4.getIndex(regularTimePeriod22);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.setNotify(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        int int29 = timeSeries14.getItemCount();
        boolean boolean30 = timeSeries14.getNotify();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timeSeries4.getKey();
        java.util.List list12 = timeSeries4.data;
        java.lang.String str13 = timeSeries4.getDomainDescription();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        int int19 = timeSeries18.getMaximumItemCount();
        long long20 = timeSeries18.getMaximumItemAge();
        java.util.List list21 = timeSeries18.getItems();
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries4.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(timeSeriesDataItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 0.0f + "'", comparable11, 0.0f);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class9);
        java.lang.Class class11 = null;
        timeSeries10.timePeriodClass = class11;
        timeSeries10.removeAgedItems(false);
        java.lang.Class<?> wildcardClass15 = timeSeries10.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "hi!", (java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries17.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        int int26 = timeSeries1.getItemCount();
        java.lang.Class class27 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(class27);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        timeSeries13.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries13.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(regularTimePeriod13, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        timeSeries18.setMaximumItemCount(100);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        timeSeries24.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.addAndOrUpdate(timeSeries24);
        java.util.List list29 = timeSeries28.getItems();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(100);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        timeSeries38.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries32.addAndOrUpdate(timeSeries38);
        java.util.List list43 = timeSeries42.getItems();
        timeSeries28.data = list43;
        java.util.List list45 = timeSeries28.getItems();
        boolean boolean46 = timeSeries28.isEmpty();
        timeSeries28.removeAgedItems(true);
        boolean boolean49 = timeSeries12.equals((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        timeSeries5.removeAgedItems(false);
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.String str14 = timeSeries12.getDescription();
        boolean boolean16 = timeSeries12.equals((java.lang.Object) 10);
        java.lang.String str17 = timeSeries12.getDomainDescription();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.util.Collection collection23 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.util.Collection collection24 = timeSeries22.getTimePeriods();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount(100);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        timeSeries33.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries27.addAndOrUpdate(timeSeries33);
        java.util.List list38 = timeSeries37.getItems();
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        timeSeries41.setMaximumItemCount(100);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class46);
        java.lang.String str48 = timeSeries47.getRangeDescription();
        timeSeries47.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries41.addAndOrUpdate(timeSeries47);
        java.util.List list52 = timeSeries51.getItems();
        timeSeries37.data = list52;
        timeSeries22.data = list52;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries22.addChangeListener(seriesChangeListener55);
        java.lang.Comparable comparable57 = timeSeries22.getKey();
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.Class class63 = null;
        timeSeries62.timePeriodClass = class63;
        timeSeries62.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries62.addChangeListener(seriesChangeListener67);
        timeSeries62.clear();
        timeSeries62.setNotify(false);
        java.lang.Class<?> wildcardClass72 = timeSeries62.getClass();
        boolean boolean73 = timeSeries22.equals((java.lang.Object) wildcardClass72);
        boolean boolean74 = timeSeries4.equals((java.lang.Object) boolean73);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value" + "'", str48, "Value");
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 0.0f + "'", comparable57, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries15.removeChangeListener(seriesChangeListener29);
        java.util.List list31 = timeSeries15.data;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        boolean boolean34 = timeSeries15.equals((java.lang.Object) timeSeries33);
        java.util.Collection collection35 = timeSeries15.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries12.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries12.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        timeSeries34.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = timeSeries34.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
            timeSeries4.add(regularTimePeriod14, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        java.lang.String str14 = timeSeries9.getDomainDescription();
        timeSeries9.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Class class22 = null;
        timeSeries21.timePeriodClass = class22;
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener24);
        timeSeries21.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass28 = timeSeries21.getClass();
        timeSeries9.timePeriodClass = wildcardClass28;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Overwritten values from: 100", "", (java.lang.Class) wildcardClass28);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        java.lang.String str18 = timeSeries2.getRangeDescription();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.Class class24 = null;
        timeSeries23.timePeriodClass = class24;
        timeSeries23.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries23.addChangeListener(seriesChangeListener28);
        timeSeries23.clear();
        timeSeries23.setNotify(false);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class36);
        java.lang.String str38 = timeSeries37.getRangeDescription();
        java.lang.String str39 = timeSeries37.getDescription();
        boolean boolean41 = timeSeries37.equals((java.lang.Object) 10);
        java.lang.String str42 = timeSeries37.getDomainDescription();
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.util.Collection collection48 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        java.util.Collection collection49 = timeSeries47.getTimePeriods();
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class51);
        java.lang.String str53 = timeSeries52.getRangeDescription();
        timeSeries52.setMaximumItemCount(100);
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class57);
        java.lang.String str59 = timeSeries58.getRangeDescription();
        timeSeries58.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries52.addAndOrUpdate(timeSeries58);
        java.util.List list63 = timeSeries62.getItems();
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class65);
        java.lang.String str67 = timeSeries66.getRangeDescription();
        timeSeries66.setMaximumItemCount(100);
        java.lang.Class class71 = null;
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class71);
        java.lang.String str73 = timeSeries72.getRangeDescription();
        timeSeries72.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries66.addAndOrUpdate(timeSeries72);
        java.util.List list77 = timeSeries76.getItems();
        timeSeries62.data = list77;
        timeSeries47.data = list77;
        timeSeries23.data = list77;
        timeSeries2.data = list77;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Time" + "'", str38, "Time");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value" + "'", str67, "Value");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Value" + "'", str73, "Value");
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertNotNull(list77);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        timeSeries7.setDescription("Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) (short) 100, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(false);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        timeSeries24.setNotify(true);
        java.lang.Class<?> wildcardClass31 = timeSeries24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection20 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.lang.String str14 = timeSeries12.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        timeSeries28.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries28.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class64);
        java.lang.String str66 = timeSeries65.getRangeDescription();
        int int67 = timeSeries65.getMaximumItemCount();
        java.util.Collection collection68 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        int int69 = timeSeries65.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries65.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Time" + "'", str66, "Time");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.isEmpty();
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        timeSeries4.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.removeChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(0, (int) 'a');
        timeSeries4.clear();
        timeSeries4.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        long long3 = timeSeries2.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(regularTimePeriod6, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.Class class13 = null;
        timeSeries12.timePeriodClass = class13;
        timeSeries12.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.addAndOrUpdate(timeSeries12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener6);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        timeSeries10.removeAgedItems(true);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries15);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        boolean boolean19 = timeSeries4.equals((java.lang.Object) comparable18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries4.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Overwritten values from: 100" + "'", comparable18, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        timeSeries4.fireSeriesChanged();
        java.lang.String str13 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemAge((long) 2147483647);
        timeSeries4.clear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries27 = timeSeries9.createCopy(regularTimePeriod25, regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 1 + "'", comparable23, (byte) 1);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod14, (double) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        int int17 = timeSeries14.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem18, true);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        timeSeries23.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        boolean boolean19 = timeSeries12.getNotify();
        long long20 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        int int20 = timeSeries15.getMaximumItemCount();
        timeSeries15.setNotify(false);
        java.lang.Class<?> wildcardClass23 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass23);
        timeSeries24.clear();
        java.util.Collection collection26 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        timeSeries1.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.lang.String str25 = timeSeries2.getDomainDescription();
        int int26 = timeSeries2.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries2.createCopy(10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod27, (java.lang.Number) 0);
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class64);
        java.lang.String str66 = timeSeries65.getRangeDescription();
        int int67 = timeSeries65.getMaximumItemCount();
        java.util.Collection collection68 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries65);
        int int69 = timeSeries65.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries65.update((int) (byte) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Time" + "'", str66, "Time");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        boolean boolean21 = timeSeries4.isEmpty();
        java.util.Collection collection22 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        timeSeries1.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 1 + "'", comparable15, (byte) 1);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        timeSeries4.setNotify(true);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries4.getDataItem(regularTimePeriod15);
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
            timeSeries26.add(regularTimePeriod27, (double) 0.0f, false);
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.util.Collection collection27 = timeSeries21.getTimePeriods();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries36);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount(100);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries43.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries36.addAndOrUpdate(timeSeries49);
        timeSeries54.setRangeDescription("hi!");
        int int57 = timeSeries54.getMaximumItemCount();
        java.lang.String str58 = timeSeries54.getDomainDescription();
        timeSeries54.setRangeDescription("Overwritten values from: 100");
        java.util.List list61 = timeSeries54.getItems();
        java.util.Collection collection62 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        java.lang.Comparable comparable63 = timeSeries21.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries21.addOrUpdate(regularTimePeriod64, (double) 2147483647);
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
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Time" + "'", str58, "Time");
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + (byte) 100 + "'", comparable63, (byte) 100);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        timeSeries6.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries6.addChangeListener(seriesChangeListener11);
        timeSeries6.clear();
        timeSeries6.setNotify(false);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.String str22 = timeSeries20.getDescription();
        boolean boolean24 = timeSeries20.equals((java.lang.Object) 10);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.util.Collection collection31 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.util.Collection collection32 = timeSeries30.getTimePeriods();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        timeSeries41.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries35.addAndOrUpdate(timeSeries41);
        java.util.List list46 = timeSeries45.getItems();
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(100);
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class54);
        java.lang.String str56 = timeSeries55.getRangeDescription();
        timeSeries55.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries49.addAndOrUpdate(timeSeries55);
        java.util.List list60 = timeSeries59.getItems();
        timeSeries45.data = list60;
        timeSeries30.data = list60;
        timeSeries6.data = list60;
        timeSeries1.data = list60;
        java.lang.Class class68 = null;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class68);
        java.lang.String str70 = timeSeries69.getRangeDescription();
        java.lang.String str71 = timeSeries69.getDescription();
        boolean boolean73 = timeSeries69.equals((java.lang.Object) 10);
        java.lang.String str74 = timeSeries69.getDomainDescription();
        java.lang.Class class78 = null;
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class78);
        java.util.Collection collection80 = timeSeries69.getTimePeriodsUniqueToOtherSeries(timeSeries79);
        java.lang.Class<?> wildcardClass81 = timeSeries79.getClass();
        timeSeries1.timePeriodClass = wildcardClass81;
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value" + "'", str56, "Value");
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Time" + "'", str70, "Time");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate(regularTimePeriod19, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.String str14 = timeSeries4.getDomainDescription();
        timeSeries4.setMaximumItemCount(10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries4.createCopy(regularTimePeriod17, regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries5.addAndOrUpdate(timeSeries11);
        java.util.List list16 = timeSeries15.getItems();
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
        timeSeries15.data = list30;
        java.util.List list32 = timeSeries15.getItems();
        boolean boolean33 = timeSeries15.isEmpty();
        java.lang.Class class34 = timeSeries15.getTimePeriodClass();
        java.lang.Class<?> wildcardClass35 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "", "hi!", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries36.addOrUpdate(regularTimePeriod37, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
            java.lang.Number number25 = timeSeries4.getValue(regularTimePeriod24);
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getDescription();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setDomainDescription("Value");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        boolean boolean14 = timeSeries1.equals((java.lang.Object) class13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod15, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 1 + "'", comparable6, (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.Class class14 = null;
        timeSeries13.timePeriodClass = class14;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener16);
        timeSeries13.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries13.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries13.getItemCount();
        timeSeries13.setDescription("Time");
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.lang.Class class29 = timeSeries27.getTimePeriodClass();
        java.lang.String str30 = timeSeries27.getDescription();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries13.addAndOrUpdate(timeSeries27);
        timeSeries13.setKey((java.lang.Comparable) 0.0d);
        timeSeries13.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries4.addAndOrUpdate(timeSeries13);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries36);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(true);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        java.lang.String str19 = timeSeries17.getDescription();
        boolean boolean21 = timeSeries17.equals((java.lang.Object) 10);
        java.lang.String str22 = timeSeries17.getDomainDescription();
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.util.List list24 = timeSeries17.data;
        timeSeries7.data = list24;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries7.addOrUpdate(regularTimePeriod26, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        java.util.Collection collection27 = timeSeries21.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries21.getValue(regularTimePeriod28);
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
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        int int7 = timeSeries6.getMaximumItemCount();
        long long8 = timeSeries6.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener9);
        timeSeries6.setKey((java.lang.Comparable) 'a');
        boolean boolean13 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean14 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries32);
        java.util.List list37 = timeSeries36.getItems();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener38);
        timeSeries36.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries16.addAndOrUpdate(timeSeries36);
        int int43 = timeSeries36.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        int int22 = timeSeries21.getMaximumItemCount();
        long long23 = timeSeries21.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener24);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        java.lang.String str33 = timeSeries31.getDescription();
        boolean boolean35 = timeSeries31.equals((java.lang.Object) 10);
        java.lang.String str36 = timeSeries31.getDomainDescription();
        timeSeries31.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class42);
        java.lang.Class class44 = null;
        timeSeries43.timePeriodClass = class44;
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener46);
        timeSeries43.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass50 = timeSeries43.getClass();
        timeSeries31.timePeriodClass = wildcardClass50;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, (java.lang.Class) wildcardClass50);
        timeSeries21.timePeriodClass = wildcardClass50;
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries4.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem57 = timeSeries54.addOrUpdate(regularTimePeriod55, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.String str8 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries4.addOrUpdate(regularTimePeriod9, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.lang.String str14 = timeSeries12.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.createCopy(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.List list13 = timeSeries9.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries9.removeChangeListener(seriesChangeListener14);
        timeSeries9.setRangeDescription("Overwritten values from: 100");
        timeSeries9.setNotify(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries4.addOrUpdate(regularTimePeriod6, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 1, 0);
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        java.util.List list4 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setKey((java.lang.Comparable) 100);
        timeSeries19.setMaximumItemAge((long) '#');
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries19.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries4.addAndOrUpdate(timeSeries19);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.Class class36 = null;
        timeSeries35.timePeriodClass = class36;
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener38);
        timeSeries35.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass42 = timeSeries35.getClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass42);
        long long44 = timeSeries43.getMaximumItemAge();
        timeSeries43.setKey((java.lang.Comparable) 1L);
        timeSeries43.setDescription("hi!");
        timeSeries43.removeAgedItems(false);
        java.util.Collection collection51 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        timeSeries29.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9223372036854775807L + "'", long44 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener31);
        java.util.Collection collection33 = timeSeries12.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries12.addOrUpdate(regularTimePeriod34, (java.lang.Number) (short) -1);
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
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        int int15 = timeSeries13.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod18, (double) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy((int) (short) 0, (int) (short) 0);
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries15.removeChangeListener(seriesChangeListener29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries15.addOrUpdate(regularTimePeriod31, (java.lang.Number) 10.0d);
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
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        int int14 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod15, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        timeSeries8.removeAgedItems(false);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener19);
        timeSeries16.setMaximumItemCount(100);
        boolean boolean24 = timeSeries16.equals((java.lang.Object) 1.0f);
        boolean boolean25 = timeSeries16.getNotify();
        java.lang.String str26 = timeSeries16.getDomainDescription();
        timeSeries16.setKey((java.lang.Comparable) (short) -1);
        timeSeries16.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries16.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries8.addAndOrUpdate(timeSeries16);
        java.lang.Class class34 = timeSeries16.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.update((int) (short) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.lang.String str26 = timeSeries25.getRangeDescription();
        long long27 = timeSeries25.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries25.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.String str16 = timeSeries14.getDomainDescription();
        java.lang.Class<?> wildcardClass17 = timeSeries14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries4.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        timeSeries4.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries9.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries9.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        timeSeries35.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.util.List list40 = timeSeries39.getItems();
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount(100);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        timeSeries49.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries43.addAndOrUpdate(timeSeries49);
        java.util.List list54 = timeSeries53.getItems();
        timeSeries39.data = list54;
        java.util.List list56 = timeSeries39.getItems();
        boolean boolean57 = timeSeries39.isEmpty();
        java.lang.Class class58 = timeSeries39.getTimePeriodClass();
        java.util.Collection collection59 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        int int60 = timeSeries39.getItemCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value" + "'", str36, "Value");
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value" + "'", str44, "Value");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value" + "'", str50, "Value");
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(class58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod12, number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.Class class8 = null;
        timeSeries7.timePeriodClass = class8;
        timeSeries7.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.addChangeListener(seriesChangeListener12);
        timeSeries7.clear();
        timeSeries7.setNotify(true);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Class class22 = null;
        timeSeries21.timePeriodClass = class22;
        timeSeries21.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries21.addChangeListener(seriesChangeListener26);
        timeSeries21.clear();
        timeSeries21.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries7.addAndOrUpdate(timeSeries21);
        java.lang.Class<?> wildcardClass32 = timeSeries31.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "", (java.lang.Class) wildcardClass32);
        timeSeries33.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        timeSeries2.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.add(timeSeriesDataItem26, true);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        int int20 = timeSeries15.getMaximumItemCount();
        timeSeries15.setNotify(false);
        java.lang.Class<?> wildcardClass23 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass23);
        timeSeries24.clear();
        java.util.Collection collection26 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.lang.String str27 = timeSeries4.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries4.getValue(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        timeSeries1.setKey((java.lang.Comparable) 100);
        timeSeries1.setMaximumItemAge((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class class16 = timeSeries4.getTimePeriodClass();
        timeSeries4.setDescription("Value");
        timeSeries4.setMaximumItemAge((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.Collection collection13 = timeSeries9.getTimePeriods();
        java.lang.String str14 = timeSeries9.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries9.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        int int28 = timeSeries27.getMaximumItemCount();
        long long29 = timeSeries27.getMaximumItemAge();
        java.util.List list30 = timeSeries27.getItems();
        timeSeries2.data = list30;
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.Class class37 = null;
        timeSeries36.timePeriodClass = class37;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean42 = timeSeries36.equals((java.lang.Object) "Time");
        java.util.List list43 = timeSeries36.getItems();
        timeSeries2.data = list43;
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener45);
        java.lang.Comparable comparable47 = timeSeries2.getKey();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + (byte) 100 + "'", comparable47, (byte) 100);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        timeSeries2.setDescription("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 100 + "'", comparable16, (byte) 100);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod9, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        java.util.List list11 = timeSeries4.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries4.addOrUpdate(regularTimePeriod12, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class1);
        int int3 = timeSeries2.getItemCount();
        timeSeries2.setMaximumItemCount((int) '#');
        timeSeries2.setNotify(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        timeSeries11.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod20, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = timeSeries4.data;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries12.addOrUpdate(regularTimePeriod32, 0.0d);
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        java.lang.String str28 = timeSeries15.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries7.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(false);
        long long12 = timeSeries4.getMaximumItemAge();
        timeSeries4.setDomainDescription("Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.List list10 = timeSeries8.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        int int5 = timeSeries4.getItemCount();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "Value", "", class6);
        timeSeries7.removeAgedItems((long) (short) 10, true);
        boolean boolean11 = timeSeries7.getNotify();
        java.lang.String str12 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        long long11 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries4.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries10.addOrUpdate(regularTimePeriod13, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries3.addAndOrUpdate(timeSeries9);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        java.lang.Class class15 = timeSeries13.getTimePeriodClass();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.Class class21 = null;
        timeSeries20.timePeriodClass = class21;
        timeSeries20.removeAgedItems(false);
        java.lang.Class<?> wildcardClass25 = timeSeries20.getClass();
        timeSeries13.timePeriodClass = wildcardClass25;
        timeSeries9.timePeriodClass = wildcardClass25;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass25);
        timeSeries28.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(regularTimePeriod30, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
            timeSeries4.delete((int) ' ', 10);
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
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        boolean boolean12 = timeSeries4.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries4.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        timeSeries4.setMaximumItemCount((int) (short) 1);
        java.lang.Class class15 = timeSeries4.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.String str29 = timeSeries21.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries21.createCopy(regularTimePeriod30, regularTimePeriod31);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.setDescription("");
        java.lang.Class class14 = timeSeries4.getTimePeriodClass();
        java.util.List list15 = timeSeries4.data;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.removeAgedItems((long) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        java.lang.Comparable comparable11 = timeSeries9.getKey();
        long long12 = timeSeries9.getMaximumItemAge();
        java.util.List list13 = timeSeries9.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries9.removeChangeListener(seriesChangeListener14);
        timeSeries9.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        timeSeries19.setKey((java.lang.Comparable) 100);
        timeSeries19.setMaximumItemAge((long) '#');
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries19.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries4.addAndOrUpdate(timeSeries19);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.Class class36 = null;
        timeSeries35.timePeriodClass = class36;
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener38);
        timeSeries35.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass42 = timeSeries35.getClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass42);
        long long44 = timeSeries43.getMaximumItemAge();
        timeSeries43.setKey((java.lang.Comparable) 1L);
        timeSeries43.setDescription("hi!");
        timeSeries43.removeAgedItems(false);
        java.util.Collection collection51 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries43.getDataItem(regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9223372036854775807L + "'", long44 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        java.lang.Comparable comparable6 = timeSeries2.getKey();
        timeSeries2.fireSeriesChanged();
        timeSeries2.setRangeDescription("Overwritten values from: 100");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries2.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.Class class33 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Overwritten values from: 100" + "'", comparable28, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertNull(class33);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.lang.String str48 = timeSeries47.getRangeDescription();
        java.lang.String str49 = timeSeries47.getDescription();
        boolean boolean51 = timeSeries47.equals((java.lang.Object) 10);
        java.lang.String str52 = timeSeries47.getDomainDescription();
        timeSeries47.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class58);
        java.lang.Class class60 = null;
        timeSeries59.timePeriodClass = class60;
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener62);
        timeSeries59.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass66 = timeSeries59.getClass();
        timeSeries47.timePeriodClass = wildcardClass66;
        java.util.List list68 = timeSeries47.getItems();
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries31.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod70 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries47.addOrUpdate(regularTimePeriod70, (java.lang.Number) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Time" + "'", str48, "Time");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(timeSeries69);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.lang.String str13 = timeSeries8.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.lang.Class class31 = timeSeries12.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete(2147483647, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        timeSeries14.fireSeriesChanged();
        timeSeries14.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries14.addChangeListener(seriesChangeListener51);
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        java.lang.Class class8 = timeSeries5.getTimePeriodClass();
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass9);
        timeSeries10.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (short) 1, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean9 = timeSeries4.getNotify();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        int int20 = timeSeries15.getMaximumItemCount();
        timeSeries15.setNotify(false);
        java.lang.Class<?> wildcardClass23 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass23);
        timeSeries24.clear();
        java.util.Collection collection26 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.lang.String str27 = timeSeries4.getRangeDescription();
        java.util.List list28 = timeSeries4.data;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries13.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }
}

