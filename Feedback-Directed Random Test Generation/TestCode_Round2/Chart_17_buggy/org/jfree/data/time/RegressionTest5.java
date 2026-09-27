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
        boolean boolean47 = timeSeries45.getNotify();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setNotify(false);
        java.util.List list4 = timeSeries1.data;
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.Class class10 = null;
        timeSeries9.timePeriodClass = class10;
        timeSeries9.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries9.addChangeListener(seriesChangeListener14);
        java.lang.Comparable comparable16 = timeSeries9.getKey();
        java.util.List list17 = timeSeries9.data;
        java.lang.String str18 = timeSeries9.getDomainDescription();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        int int24 = timeSeries23.getMaximumItemCount();
        long long25 = timeSeries23.getMaximumItemAge();
        java.util.List list26 = timeSeries23.getItems();
        java.lang.Class class27 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries9.addAndOrUpdate(timeSeries23);
        timeSeries9.clear();
        java.lang.Class class30 = timeSeries9.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries9);
        java.lang.Class class32 = timeSeries9.getTimePeriodClass();
        java.lang.Class<?> wildcardClass33 = timeSeries9.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNull(class32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
            timeSeries4.add(regularTimePeriod11, 0.0d, true);
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
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        boolean boolean8 = timeSeries4.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries4.getItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        int int17 = timeSeries4.getItemCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.lang.String str18 = timeSeries11.getRangeDescription();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        java.lang.String str27 = timeSeries25.getDescription();
        boolean boolean29 = timeSeries25.equals((java.lang.Object) 10);
        int int30 = timeSeries25.getMaximumItemCount();
        int int31 = timeSeries25.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener32);
        java.lang.String str34 = timeSeries25.getDomainDescription();
        java.lang.Class<?> wildcardClass35 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass35);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries11.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries39.addOrUpdate(regularTimePeriod40, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries39);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        timeSeries8.clear();
        java.util.List list31 = timeSeries8.getItems();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        java.lang.String str40 = timeSeries38.getDescription();
        java.lang.Class class41 = timeSeries38.getTimePeriodClass();
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.lang.Class class48 = null;
        timeSeries47.timePeriodClass = class48;
        timeSeries47.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries47.addChangeListener(seriesChangeListener52);
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class57);
        java.lang.Class class59 = null;
        timeSeries58.timePeriodClass = class59;
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries58.removePropertyChangeListener(propertyChangeListener61);
        timeSeries58.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass65 = timeSeries58.getClass();
        timeSeries47.timePeriodClass = wildcardClass65;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass65);
        timeSeries38.timePeriodClass = wildcardClass65;
        java.lang.Class class69 = timeSeries38.getTimePeriodClass();
        java.util.Collection collection70 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(regularTimePeriod71, (double) 2147483647, false);
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
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Time" + "'", str39, "Time");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(class69);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        timeSeries14.setDomainDescription("");
        java.lang.String str19 = timeSeries14.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        java.util.List list11 = timeSeries4.data;
        boolean boolean12 = timeSeries4.isEmpty();
        timeSeries4.setMaximumItemCount((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries4.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        timeSeries8.clear();
        java.util.List list31 = timeSeries8.getItems();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setMaximumItemCount(100);
        timeSeries34.setNotify(true);
        timeSeries34.clear();
        java.util.Collection collection41 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class45);
        java.lang.Class class47 = null;
        timeSeries46.timePeriodClass = class47;
        timeSeries46.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries46.addChangeListener(seriesChangeListener51);
        java.lang.Comparable comparable53 = timeSeries46.getKey();
        java.util.List list54 = timeSeries46.data;
        java.lang.String str55 = timeSeries46.getDomainDescription();
        java.lang.Class class59 = null;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class59);
        int int61 = timeSeries60.getMaximumItemCount();
        long long62 = timeSeries60.getMaximumItemAge();
        java.util.List list63 = timeSeries60.getItems();
        java.lang.Class class64 = timeSeries60.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries46.addAndOrUpdate(timeSeries60);
        timeSeries65.setKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries34.addAndOrUpdate(timeSeries65);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = timeSeries68.getDataItem(regularTimePeriod69);
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
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + 0.0f + "'", comparable53, 0.0f);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9223372036854775807L + "'", long62 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(timeSeries68);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getDescription();
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class10);
        timeSeries11.removeAgedItems(true);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries16);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.Class class24 = null;
        timeSeries23.timePeriodClass = class24;
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener26);
        timeSeries23.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries23.addChangeListener(seriesChangeListener30);
        int int32 = timeSeries23.getItemCount();
        java.util.Collection collection33 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        java.lang.Class<?> wildcardClass34 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass34);
        timeSeries1.timePeriodClass = wildcardClass34;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        timeSeries22.setKey((java.lang.Comparable) 0L);
        boolean boolean25 = timeSeries22.isEmpty();
        java.lang.Comparable comparable26 = timeSeries22.getKey();
        timeSeries22.fireSeriesChanged();
        java.lang.Class<?> wildcardClass28 = timeSeries22.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "", "", (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass28);
        timeSeries1.timePeriodClass = wildcardClass28;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 1 + "'", comparable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + 0L + "'", comparable26, 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        java.util.List list26 = timeSeries25.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        timeSeries25.setMaximumItemCount(100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Overwritten values from: 100" + "'", comparable14, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.util.List list14 = timeSeries7.getItems();
        java.lang.String str15 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        timeSeries4.setDescription("");
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Class class22 = null;
        timeSeries21.timePeriodClass = class22;
        timeSeries21.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries21.addChangeListener(seriesChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        java.lang.Class class33 = null;
        timeSeries32.timePeriodClass = class33;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener35);
        timeSeries32.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass39 = timeSeries32.getClass();
        timeSeries21.timePeriodClass = wildcardClass39;
        java.lang.Class class41 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", class41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        timeSeries4.timePeriodClass = class41;
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class49);
        java.lang.Class class51 = null;
        timeSeries50.timePeriodClass = class51;
        timeSeries50.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries50.addChangeListener(seriesChangeListener55);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class60);
        java.lang.Class class62 = null;
        timeSeries61.timePeriodClass = class62;
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries61.removePropertyChangeListener(propertyChangeListener64);
        timeSeries61.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass68 = timeSeries61.getClass();
        timeSeries50.timePeriodClass = wildcardClass68;
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass68);
        timeSeries70.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries4.addAndOrUpdate(timeSeries70);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries70.add(timeSeriesDataItem74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        timeSeries2.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = timeSeries2.getValue((int) (short) 0);
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener18);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        java.lang.Class class24 = timeSeries22.getTimePeriodClass();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.Class class30 = null;
        timeSeries29.timePeriodClass = class30;
        timeSeries29.removeAgedItems(false);
        java.lang.Class<?> wildcardClass34 = timeSeries29.getClass();
        timeSeries22.timePeriodClass = wildcardClass34;
        timeSeries17.timePeriodClass = wildcardClass34;
        java.lang.String str37 = timeSeries17.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries17.removeChangeListener(seriesChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener40);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update((int) (byte) 10, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        long long8 = timeSeries4.getMaximumItemAge();
        java.util.List list9 = timeSeries4.getItems();
        java.lang.String str10 = timeSeries4.getDescription();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.setDescription("Overwritten values from: 100");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        timeSeries18.clear();
        java.lang.Class class25 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.createCopy(regularTimePeriod26, regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNull(class25);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        timeSeries2.setRangeDescription("Time");
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        timeSeries21.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries21.removeChangeListener(seriesChangeListener24);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.Class class31 = null;
        timeSeries30.timePeriodClass = class31;
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener33);
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass37 = timeSeries30.getClass();
        timeSeries21.timePeriodClass = wildcardClass37;
        long long39 = timeSeries21.getMaximumItemAge();
        java.lang.Class class40 = timeSeries21.timePeriodClass;
        java.util.List list41 = timeSeries21.data;
        timeSeries2.data = list41;
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.lang.Class class48 = null;
        timeSeries47.timePeriodClass = class48;
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener50);
        boolean boolean52 = timeSeries2.equals((java.lang.Object) propertyChangeListener50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        java.lang.String str29 = timeSeries8.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.lang.Comparable comparable7 = timeSeries4.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries4.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 0.0f + "'", comparable7, 0.0f);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener15);
        timeSeries2.clear();
        java.lang.Class class18 = timeSeries2.getTimePeriodClass();
        java.lang.String str19 = timeSeries2.getRangeDescription();
        java.lang.Class class20 = timeSeries2.getTimePeriodClass();
        java.util.List list21 = timeSeries2.getItems();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries39 = timeSeries4.createCopy(regularTimePeriod37, regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timeSeries17.isEmpty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        boolean boolean15 = timeSeries9.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries9.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries9.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        java.util.List list24 = timeSeries4.data;
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        timeSeries27.removeAgedItems(true);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries27.addAndOrUpdate(timeSeries32);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener35);
        int int37 = timeSeries34.getMaximumItemCount();
        timeSeries34.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries4.addAndOrUpdate(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.lang.Class class27 = timeSeries21.timePeriodClass;
        timeSeries21.setMaximumItemCount((int) '#');
        java.util.Collection collection30 = timeSeries21.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
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
        timeSeries12.data = list26;
        timeSeries4.data = list26;
        java.lang.String str29 = timeSeries4.getDomainDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries4.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.Class class28 = null;
        timeSeries12.timePeriodClass = class28;
        int int30 = timeSeries12.getItemCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        int int34 = timeSeries12.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = timeSeries12.getIndex(regularTimePeriod35);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.addOrUpdate(regularTimePeriod7, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        int int13 = timeSeries9.getItemCount();
        timeSeries9.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        timeSeries4.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.removeChangeListener(seriesChangeListener13);
        long long15 = timeSeries4.getMaximumItemAge();
        java.lang.String str16 = timeSeries4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.Class class61 = timeSeries13.timePeriodClass;
        java.lang.Class class62 = null;
        timeSeries13.timePeriodClass = class62;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod64, (double) (short) 1);
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
        org.junit.Assert.assertNotNull(class61);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        long long23 = timeSeries5.getMaximumItemAge();
        java.lang.Class class24 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: 100", "Value", class24);
        java.lang.Class class26 = timeSeries25.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries2.addChangeListener(seriesChangeListener6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
            timeSeries13.removeAgedItems(100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        timeSeries15.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries15.removeChangeListener(seriesChangeListener18);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Class class25 = null;
        timeSeries24.timePeriodClass = class25;
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener27);
        timeSeries24.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass31 = timeSeries24.getClass();
        timeSeries15.timePeriodClass = wildcardClass31;
        long long33 = timeSeries15.getMaximumItemAge();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries38.addChangeListener(seriesChangeListener45);
        int int47 = timeSeries38.getItemCount();
        timeSeries38.setDescription("Time");
        timeSeries38.clear();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class52);
        java.lang.String str54 = timeSeries53.getRangeDescription();
        timeSeries53.setMaximumItemCount(100);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class58);
        java.lang.String str60 = timeSeries59.getRangeDescription();
        timeSeries59.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries53.addAndOrUpdate(timeSeries59);
        java.util.List list64 = timeSeries63.getItems();
        java.lang.Class class66 = null;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class66);
        java.lang.String str68 = timeSeries67.getRangeDescription();
        timeSeries67.setMaximumItemCount(100);
        java.lang.Class class72 = null;
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class72);
        java.lang.String str74 = timeSeries73.getRangeDescription();
        timeSeries73.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries67.addAndOrUpdate(timeSeries73);
        java.util.List list78 = timeSeries77.getItems();
        timeSeries63.data = list78;
        java.util.List list80 = timeSeries63.getItems();
        timeSeries63.setDescription("");
        timeSeries63.setDomainDescription("Overwritten values from: 100");
        java.util.Collection collection85 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries63);
        java.util.List list86 = timeSeries63.getItems();
        timeSeries15.data = list86;
        timeSeries8.data = list86;
        org.jfree.data.time.TimeSeries timeSeries91 = timeSeries8.createCopy((int) (byte) 10, (int) ' ');
        int int92 = timeSeries8.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod93 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value" + "'", str60, "Value");
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value" + "'", str68, "Value");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Value" + "'", str74, "Value");
        org.junit.Assert.assertNotNull(timeSeries77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(timeSeries91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class58);
        int int60 = timeSeries59.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries59.addPropertyChangeListener(propertyChangeListener61);
        java.lang.Class class67 = null;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class67);
        java.lang.Class class69 = null;
        timeSeries68.timePeriodClass = class69;
        timeSeries68.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        timeSeries68.addChangeListener(seriesChangeListener73);
        java.lang.Class class78 = null;
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class78);
        java.lang.Class class80 = null;
        timeSeries79.timePeriodClass = class80;
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        timeSeries79.removePropertyChangeListener(propertyChangeListener82);
        timeSeries79.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass86 = timeSeries79.getClass();
        timeSeries68.timePeriodClass = wildcardClass86;
        org.jfree.data.time.TimeSeries timeSeries88 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass86);
        timeSeries59.timePeriodClass = wildcardClass86;
        java.util.Collection collection90 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.lang.Class<?> wildcardClass91 = collection90.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        java.lang.Class class61 = timeSeries17.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = timeSeries17.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
        org.junit.Assert.assertNull(class61);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        timeSeries16.setKey((java.lang.Comparable) 10.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(regularTimePeriod45, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        long long11 = timeSeries4.getMaximumItemAge();
        timeSeries4.setKey((java.lang.Comparable) false);
        timeSeries4.clear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        timeSeries2.removeAgedItems(true);
        java.lang.String str8 = timeSeries2.getRangeDescription();
        java.lang.String str9 = timeSeries2.getDescription();
        java.util.Collection collection10 = timeSeries2.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems((long) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = timeSeries4.getValue(regularTimePeriod62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setNotify(false);
        java.util.List list4 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeSeries1.getIndex(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1);
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        java.lang.String str8 = timeSeries6.getDescription();
        boolean boolean10 = timeSeries6.equals((java.lang.Object) 10);
        java.lang.String str11 = timeSeries6.getDomainDescription();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.util.Collection collection17 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Class class18 = timeSeries6.getTimePeriodClass();
        timeSeries6.setDescription("Value");
        java.lang.String str21 = timeSeries6.getDomainDescription();
        java.util.Collection collection22 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.Class class6 = null;
        timeSeries5.timePeriodClass = class6;
        timeSeries5.removeAgedItems(false);
        java.lang.Class<?> wildcardClass10 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass10);
        timeSeries11.setKey((java.lang.Comparable) 100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Class class22 = null;
        timeSeries21.timePeriodClass = class22;
        timeSeries21.removeAgedItems(false);
        java.lang.Class<?> wildcardClass26 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass26);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries11.addAndOrUpdate(timeSeries27);
        int int30 = timeSeries29.getMaximumItemCount();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        timeSeries25.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        timeSeries15.setMaximumItemCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        long long16 = timeSeries4.getMaximumItemAge();
        java.lang.Comparable comparable17 = timeSeries4.getKey();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 0.0f + "'", comparable17, 0.0f);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        java.util.Collection collection15 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean7 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries4.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timeSeries4.getDescription();
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
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        timeSeries6.setKey((java.lang.Comparable) 0L);
        boolean boolean9 = timeSeries6.isEmpty();
        java.lang.Comparable comparable10 = timeSeries6.getKey();
        timeSeries6.fireSeriesChanged();
        java.lang.Class<?> wildcardClass12 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "", "", (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass12);
        boolean boolean15 = timeSeries14.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.removeChangeListener(seriesChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.setDomainDescription("Overwritten values from: 100");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 0.0f + "'", comparable5, 0.0f);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        int int35 = timeSeries4.getMaximumItemCount();
        timeSeries4.setDomainDescription("Overwritten values from: 100");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries4.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries42 = timeSeries4.createCopy(regularTimePeriod40, regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.Class class27 = timeSeries21.timePeriodClass;
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        timeSeries30.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.String str41 = timeSeries39.getDescription();
        java.lang.Class class42 = timeSeries39.getTimePeriodClass();
        timeSeries39.setMaximumItemCount(0);
        boolean boolean45 = timeSeries30.equals((java.lang.Object) timeSeries39);
        boolean boolean46 = timeSeries39.isEmpty();
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries21.addAndOrUpdate(timeSeries39);
        timeSeries39.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries39.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertNull(class27);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Time" + "'", str40, "Time");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timeSeries4.isEmpty();
        timeSeries4.clear();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        timeSeries4.setDescription("");
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Class class22 = null;
        timeSeries21.timePeriodClass = class22;
        timeSeries21.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries21.addChangeListener(seriesChangeListener26);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        java.lang.Class class33 = null;
        timeSeries32.timePeriodClass = class33;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener35);
        timeSeries32.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass39 = timeSeries32.getClass();
        timeSeries21.timePeriodClass = wildcardClass39;
        java.lang.Class class41 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", class41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class41);
        timeSeries4.timePeriodClass = class41;
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class49);
        java.lang.Class class51 = null;
        timeSeries50.timePeriodClass = class51;
        timeSeries50.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries50.addChangeListener(seriesChangeListener55);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class60);
        java.lang.Class class62 = null;
        timeSeries61.timePeriodClass = class62;
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries61.removePropertyChangeListener(propertyChangeListener64);
        timeSeries61.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass68 = timeSeries61.getClass();
        timeSeries50.timePeriodClass = wildcardClass68;
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass68);
        timeSeries70.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries4.addAndOrUpdate(timeSeries70);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries70.add(timeSeriesDataItem74, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        java.lang.Class class15 = timeSeries13.getTimePeriodClass();
        java.lang.String str16 = timeSeries13.getDomainDescription();
        timeSeries13.setNotify(false);
        java.util.Collection collection19 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        timeSeries2.setNotify(true);
        java.util.Collection collection10 = timeSeries2.getTimePeriods();
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        java.lang.String str20 = timeSeries15.getDomainDescription();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.util.Collection collection26 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.util.Collection collection27 = timeSeries25.getTimePeriods();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries36);
        java.util.List list41 = timeSeries40.getItems();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        timeSeries44.setMaximumItemCount(100);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries44.addAndOrUpdate(timeSeries50);
        java.util.List list55 = timeSeries54.getItems();
        timeSeries40.data = list55;
        timeSeries25.data = list55;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries25.addChangeListener(seriesChangeListener58);
        timeSeries25.fireSeriesChanged();
        timeSeries25.setNotify(true);
        timeSeries25.setMaximumItemCount(0);
        java.lang.Class class68 = null;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class68);
        java.lang.String str70 = timeSeries69.getRangeDescription();
        java.lang.String str71 = timeSeries69.getDescription();
        java.lang.Class class72 = timeSeries69.getTimePeriodClass();
        timeSeries69.setMaximumItemCount(0);
        timeSeries69.setRangeDescription("");
        java.lang.Class class77 = null;
        timeSeries69.timePeriodClass = class77;
        java.util.List list79 = timeSeries69.getItems();
        timeSeries25.data = list79;
        boolean boolean81 = timeSeries2.equals((java.lang.Object) timeSeries25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Time" + "'", str70, "Time");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(class72);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        java.util.List list24 = timeSeries4.data;
        timeSeries4.setNotify(false);
        timeSeries4.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = timeSeries4.getIndex(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.createCopy(1, (int) 'a');
        java.lang.Class class16 = timeSeries4.getTimePeriodClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        java.util.List list47 = timeSeries7.data;
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener48);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        java.lang.String str25 = timeSeries23.getDescription();
        java.lang.Class class26 = timeSeries23.getTimePeriodClass();
        timeSeries23.setMaximumItemCount(0);
        timeSeries23.setRangeDescription("");
        java.lang.Class class31 = null;
        timeSeries23.timePeriodClass = class31;
        timeSeries23.fireSeriesChanged();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        timeSeries38.setKey((java.lang.Comparable) 100);
        timeSeries38.setMaximumItemAge((long) '#');
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener44);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries38.addChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries23.addAndOrUpdate(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class54);
        java.lang.Class class56 = null;
        timeSeries55.timePeriodClass = class56;
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries55.removePropertyChangeListener(propertyChangeListener58);
        timeSeries55.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries55.addChangeListener(seriesChangeListener62);
        int int64 = timeSeries55.getItemCount();
        timeSeries55.setDescription("Time");
        java.lang.Class class68 = null;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class68);
        java.lang.String str70 = timeSeries69.getRangeDescription();
        java.lang.Class class71 = timeSeries69.getTimePeriodClass();
        java.lang.String str72 = timeSeries69.getDescription();
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries55.addAndOrUpdate(timeSeries69);
        boolean boolean74 = timeSeries50.equals((java.lang.Object) timeSeries55);
        java.lang.Class class75 = timeSeries50.timePeriodClass;
        java.util.Collection collection76 = timeSeries48.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        java.lang.Class class77 = timeSeries50.getTimePeriodClass();
        timeSeries1.timePeriodClass = class77;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(class26);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Time" + "'", str39, "Time");
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Value" + "'", str70, "Value");
        org.junit.Assert.assertNull(class71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(class75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(class77);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        timeSeries4.setDomainDescription("");
        timeSeries4.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        timeSeries31.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        int int46 = timeSeries45.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries31.addAndOrUpdate(timeSeries45);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        java.lang.Class class52 = timeSeries50.getTimePeriodClass();
        java.lang.String str53 = timeSeries50.getDomainDescription();
        timeSeries50.setNotify(false);
        timeSeries50.setNotify(true);
        timeSeries50.setDescription("Value");
        java.lang.Class<?> wildcardClass60 = timeSeries50.getClass();
        timeSeries31.timePeriodClass = wildcardClass60;
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Time" + "'", str53, "Time");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount(100);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries23.addAndOrUpdate(timeSeries29);
        java.util.List list34 = timeSeries33.getItems();
        timeSeries19.data = list34;
        java.util.List list36 = timeSeries19.getItems();
        boolean boolean37 = timeSeries19.isEmpty();
        java.lang.Class class38 = timeSeries19.getTimePeriodClass();
        java.lang.Class<?> wildcardClass39 = timeSeries19.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "Value", "Overwritten values from: 100", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Value", "", (java.lang.Class) wildcardClass39);
        int int43 = timeSeries42.getItemCount();
        timeSeries42.setDescription("hi!");
        long long46 = timeSeries42.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries8.addOrUpdate(regularTimePeriod31, (double) '#');
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.lang.String str7 = timeSeries5.getDescription();
        boolean boolean9 = timeSeries5.equals((java.lang.Object) 10);
        int int10 = timeSeries5.getMaximumItemCount();
        timeSeries5.setNotify(false);
        java.lang.Class<?> wildcardClass13 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass13);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        java.lang.String str21 = timeSeries19.getDescription();
        boolean boolean23 = timeSeries19.equals((java.lang.Object) 10);
        java.lang.String str24 = timeSeries19.getDomainDescription();
        timeSeries19.setMaximumItemCount((int) (byte) 0);
        timeSeries19.setNotify(true);
        java.lang.Class<?> wildcardClass29 = timeSeries19.getClass();
        timeSeries14.timePeriodClass = wildcardClass29;
        java.lang.String str31 = timeSeries14.getDescription();
        long long32 = timeSeries14.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        timeSeries4.setMaximumItemCount(100);
        boolean boolean12 = timeSeries4.equals((java.lang.Object) 1.0f);
        java.util.Collection collection13 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(false);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.String str22 = timeSeries20.getDescription();
        boolean boolean24 = timeSeries20.equals((java.lang.Object) 10);
        int int25 = timeSeries20.getMaximumItemCount();
        int int26 = timeSeries20.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener27);
        java.lang.String str29 = timeSeries20.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries4.addAndOrUpdate(timeSeries20);
        java.lang.Class class31 = timeSeries20.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        timeSeries12.clear();
        timeSeries12.setRangeDescription("Overwritten values from: 100");
        timeSeries12.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem39, true);
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.Class class12 = null;
        timeSeries11.timePeriodClass = class12;
        timeSeries11.removeAgedItems(false);
        java.lang.Class<?> wildcardClass16 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Value", "", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Time", "", (java.lang.Class) wildcardClass16);
        java.lang.String str20 = timeSeries19.getDomainDescription();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.util.Collection collection19 = timeSeries1.getTimePeriods();
        java.util.List list20 = timeSeries1.data;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries13.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries13.getTimePeriodClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        timeSeries1.removeAgedItems((long) (short) 100, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        java.lang.Comparable comparable16 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries4.addOrUpdate(regularTimePeriod19, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setNotify(false);
        java.lang.String str8 = timeSeries4.getDescription();
        timeSeries4.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod11, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        timeSeries18.fireSeriesChanged();
        timeSeries18.setDomainDescription("hi!");
        java.util.List list26 = timeSeries18.data;
        int int27 = timeSeries18.getItemCount();
        int int28 = timeSeries18.getItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        boolean boolean6 = timeSeries2.getNotify();
        timeSeries2.setNotify(false);
        java.lang.String str9 = timeSeries2.getRangeDescription();
        int int10 = timeSeries2.getMaximumItemCount();
        java.lang.Class class11 = timeSeries2.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        java.util.Collection collection16 = timeSeries9.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Overwritten values from: 100" + "'", comparable10, "Overwritten values from: 100");
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Overwritten values from: 100" + "'", comparable11, "Overwritten values from: 100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        timeSeries31.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries25.addAndOrUpdate(timeSeries31);
        java.util.List list36 = timeSeries35.getItems();
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        java.lang.String str43 = timeSeries41.getDescription();
        boolean boolean45 = timeSeries41.equals((java.lang.Object) 10);
        int int46 = timeSeries41.getMaximumItemCount();
        int int47 = timeSeries41.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries41.addPropertyChangeListener(propertyChangeListener48);
        java.util.Collection collection50 = timeSeries35.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        timeSeries35.setMaximumItemAge((long) (short) 10);
        java.util.Collection collection53 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Time" + "'", str42, "Time");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
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
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.String str22 = timeSeries20.getDescription();
        boolean boolean24 = timeSeries20.equals((java.lang.Object) 10);
        int int25 = timeSeries20.getMaximumItemCount();
        int int26 = timeSeries20.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener27);
        java.util.Collection collection29 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        boolean boolean30 = timeSeries14.isEmpty();
        int int31 = timeSeries14.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.addAndOrUpdate(timeSeries14);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.Class class27 = timeSeries21.timePeriodClass;
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        timeSeries30.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries30.removeChangeListener(seriesChangeListener33);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.String str41 = timeSeries39.getDescription();
        java.lang.Class class42 = timeSeries39.getTimePeriodClass();
        timeSeries39.setMaximumItemCount(0);
        boolean boolean45 = timeSeries30.equals((java.lang.Object) timeSeries39);
        boolean boolean46 = timeSeries39.isEmpty();
        timeSeries39.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries21.addAndOrUpdate(timeSeries39);
        java.lang.Class class49 = timeSeries48.getTimePeriodClass();
        long long50 = timeSeries48.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries48.add(regularTimePeriod51, (double) (short) 1, false);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Time" + "'", str40, "Time");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(class49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 9223372036854775807L + "'", long50 == 9223372036854775807L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        java.lang.String str9 = timeSeries7.getDescription();
        java.lang.Class class10 = timeSeries7.getTimePeriodClass();
        timeSeries7.setMaximumItemCount(0);
        timeSeries7.setRangeDescription("");
        java.lang.Class class15 = timeSeries7.timePeriodClass;
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        timeSeries19.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries19.removeChangeListener(seriesChangeListener22);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class27);
        java.lang.Class class29 = null;
        timeSeries28.timePeriodClass = class29;
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener31);
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass35 = timeSeries28.getClass();
        timeSeries19.timePeriodClass = wildcardClass35;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass35);
        timeSeries7.timePeriodClass = wildcardClass35;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", (java.lang.Class) wildcardClass35);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        java.lang.Comparable comparable16 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener17);
        java.lang.Class<?> wildcardClass19 = timeSeries4.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.lang.String str55 = timeSeries54.getDomainDescription();
        timeSeries54.clear();
        java.util.List list57 = timeSeries54.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries54.removeChangeListener(seriesChangeListener58);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        java.lang.String str32 = timeSeries30.getDescription();
        boolean boolean34 = timeSeries30.equals((java.lang.Object) 10);
        java.lang.String str35 = timeSeries30.getDomainDescription();
        timeSeries30.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class41);
        java.lang.Class class43 = null;
        timeSeries42.timePeriodClass = class43;
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener45);
        timeSeries42.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass49 = timeSeries42.getClass();
        timeSeries30.timePeriodClass = wildcardClass49;
        timeSeries30.clear();
        java.lang.String str52 = timeSeries30.getDomainDescription();
        java.util.Collection collection53 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.setKey((java.lang.Comparable) 0L);
        boolean boolean5 = timeSeries2.isEmpty();
        boolean boolean6 = timeSeries2.getNotify();
        int int7 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener51);
        java.util.List list53 = timeSeries7.getItems();
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
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        java.lang.Comparable comparable16 = timeSeries4.getKey();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener17);
        long long19 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries4.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0.0f + "'", comparable16, 0.0f);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.util.List list26 = timeSeries25.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class32);
        java.lang.Class class34 = null;
        timeSeries33.timePeriodClass = class34;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener36);
        timeSeries33.setMaximumItemCount(100);
        boolean boolean41 = timeSeries33.equals((java.lang.Object) 1.0f);
        boolean boolean42 = timeSeries33.getNotify();
        java.lang.String str43 = timeSeries33.getDomainDescription();
        timeSeries33.setKey((java.lang.Comparable) (short) -1);
        timeSeries33.setRangeDescription("Value");
        int int48 = timeSeries33.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries25.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries33.add(regularTimePeriod50, (double) (byte) 10);
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
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        int int8 = timeSeries4.getItemCount();
        timeSeries4.setRangeDescription("hi!");
        timeSeries4.setDomainDescription("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        java.lang.String str8 = timeSeries6.getDescription();
        boolean boolean10 = timeSeries6.equals((java.lang.Object) 10);
        int int11 = timeSeries6.getMaximumItemCount();
        int int12 = timeSeries6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        java.lang.String str15 = timeSeries6.getDomainDescription();
        java.lang.Class<?> wildcardClass16 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass16);
        java.lang.String str19 = timeSeries18.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod20, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries4.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        timeSeries4.setRangeDescription("Overwritten values from: 100");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L);
        java.lang.String str13 = timeSeries12.getDomainDescription();
        timeSeries12.setKey((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries4.addAndOrUpdate(timeSeries12);
        java.lang.Class class17 = null;
        timeSeries16.timePeriodClass = class17;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries4.getItemCount();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        java.lang.String str18 = timeSeries16.getDescription();
        boolean boolean20 = timeSeries16.equals((java.lang.Object) 10);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        timeSeries23.setMaximumItemCount(100);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries23.addAndOrUpdate(timeSeries29);
        java.util.List list31 = timeSeries29.getItems();
        timeSeries16.data = list31;
        timeSeries4.data = list31;
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries4.createCopy((int) (byte) 0, 10);
        java.util.Collection collection37 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        timeSeries2.fireSeriesChanged();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        int int19 = timeSeries18.getMaximumItemCount();
        timeSeries18.setNotify(true);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries2.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        java.util.List list11 = timeSeries4.getItems();
        timeSeries4.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries4.getIndex(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries2.removeChangeListener(seriesChangeListener5);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        timeSeries15.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries9.addAndOrUpdate(timeSeries15);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        timeSeries22.setMaximumItemCount(100);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        timeSeries28.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries22.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries15.addAndOrUpdate(timeSeries28);
        boolean boolean35 = timeSeries15.equals((java.lang.Object) (-1.0f));
        java.util.List list36 = timeSeries15.data;
        timeSeries2.data = list36;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.String str55 = timeSeries54.getDomainDescription();
        boolean boolean56 = timeSeries54.getNotify();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        timeSeries13.removeAgedItems(true);
        java.lang.Class<?> wildcardClass34 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass34);
        java.lang.String str36 = timeSeries35.getDomainDescription();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        java.lang.String str20 = timeSeries15.getDomainDescription();
        timeSeries15.setMaximumItemCount((int) (byte) 0);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.Class class28 = null;
        timeSeries27.timePeriodClass = class28;
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener30);
        timeSeries27.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass34 = timeSeries27.getClass();
        timeSeries15.timePeriodClass = wildcardClass34;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Time", "Value", (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Value", (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 100", "Value", "", (java.lang.Class) wildcardClass34);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        java.lang.String str9 = timeSeries7.getDescription();
        boolean boolean11 = timeSeries7.equals((java.lang.Object) 10);
        java.lang.String str12 = timeSeries7.getDomainDescription();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.util.Collection collection18 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        java.lang.Class<?> wildcardClass19 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "", "", (java.lang.Class) wildcardClass19);
        java.lang.Comparable comparable21 = timeSeries20.getKey();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 0.0f + "'", comparable21, 0.0f);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.addChangeListener(seriesChangeListener5);
        boolean boolean7 = timeSeries4.getNotify();
        java.lang.Class<?> wildcardClass8 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "Time", "Time", (java.lang.Class) wildcardClass8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1L) + "'", comparable10, (-1L));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.String str21 = timeSeries4.getDescription();
        timeSeries4.removeAgedItems(true);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        timeSeries32.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries26.addAndOrUpdate(timeSeries32);
        timeSeries26.clear();
        java.util.List list38 = timeSeries26.getItems();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener39);
        timeSeries26.clear();
        java.lang.Class class42 = timeSeries26.getTimePeriodClass();
        java.util.List list43 = timeSeries26.getItems();
        java.util.Collection collection44 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.setNotify(false);
        boolean boolean47 = timeSeries26.isEmpty();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value" + "'", str33, "Value");
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(class42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        timeSeries13.setKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.lang.Class class7 = timeSeries4.getTimePeriodClass();
        timeSeries4.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNull(class7);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long3 = timeSeries2.getMaximumItemAge();
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        java.lang.String str7 = timeSeries6.getRangeDescription();
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries6.addAndOrUpdate(timeSeries12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.String str20 = timeSeries18.getDescription();
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 10);
        java.lang.String str23 = timeSeries18.getDomainDescription();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class27);
        java.util.Collection collection29 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.util.Collection collection30 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries28);
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
        java.util.List list60 = timeSeries43.getItems();
        boolean boolean61 = timeSeries43.isEmpty();
        java.lang.Class class62 = timeSeries43.getTimePeriodClass();
        java.util.Collection collection63 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        java.lang.Class<?> wildcardClass64 = timeSeries28.getClass();
        timeSeries2.timePeriodClass = wildcardClass64;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), (java.lang.Class) wildcardClass64);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(timeSeries13);
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
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(class62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        java.lang.String str10 = timeSeries8.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Value", "Value", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass11);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        timeSeries24.setDescription("Time");
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        java.lang.String str4 = timeSeries3.getRangeDescription();
        java.lang.String str5 = timeSeries3.getRangeDescription();
        java.lang.Class<?> wildcardClass6 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries7.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        java.lang.String str2 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        timeSeries4.clear();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        timeSeries9.setMaximumItemCount(100);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries15);
        timeSeries15.setDomainDescription("hi!");
        timeSeries15.setMaximumItemAge((long) '#');
        java.util.List list21 = timeSeries15.getItems();
        timeSeries4.data = list21;
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        timeSeries25.setMaximumItemCount(100);
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries25.addAndOrUpdate(timeSeries31);
        timeSeries31.removeAgedItems(false);
        java.lang.Class class35 = timeSeries31.getTimePeriodClass();
        timeSeries31.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries4.addAndOrUpdate(timeSeries31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries38.removeChangeListener(seriesChangeListener39);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        timeSeries2.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.removeAgedItems(100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries8);
        java.util.Collection collection10 = timeSeries8.getTimePeriods();
        java.lang.Class class11 = timeSeries8.timePeriodClass;
        timeSeries8.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.util.List list28 = timeSeries2.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries2.addChangeListener(seriesChangeListener29);
        long long31 = timeSeries2.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.setNotify(true);
        timeSeries4.setDescription("hi!");
        boolean boolean15 = timeSeries4.isEmpty();
        int int16 = timeSeries4.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.Class class37 = null;
        timeSeries36.timePeriodClass = class37;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener39);
        timeSeries36.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries36.addChangeListener(seriesChangeListener43);
        int int45 = timeSeries36.getItemCount();
        timeSeries36.setDescription("Time");
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        java.lang.Class class52 = timeSeries50.getTimePeriodClass();
        java.lang.String str53 = timeSeries50.getDescription();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries36.addAndOrUpdate(timeSeries50);
        boolean boolean55 = timeSeries31.equals((java.lang.Object) timeSeries36);
        java.lang.Class class56 = timeSeries31.timePeriodClass;
        java.util.Collection collection57 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(regularTimePeriod58, (double) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(class7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        timeSeries6.setKey((java.lang.Comparable) 0L);
        boolean boolean9 = timeSeries6.isEmpty();
        java.lang.Comparable comparable10 = timeSeries6.getKey();
        timeSeries6.fireSeriesChanged();
        java.lang.Class<?> wildcardClass12 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "", "", (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass12);
        boolean boolean15 = timeSeries14.isEmpty();
        timeSeries14.clear();
        java.util.List list17 = timeSeries14.getItems();
        java.lang.Class class18 = timeSeries14.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class18);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        java.lang.String str21 = timeSeries19.getDescription();
        boolean boolean23 = timeSeries19.equals((java.lang.Object) 10);
        java.lang.String str24 = timeSeries19.getDomainDescription();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.util.Collection collection30 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.lang.Class class31 = timeSeries19.getTimePeriodClass();
        timeSeries19.setDescription("Value");
        java.lang.String str34 = timeSeries19.getDomainDescription();
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        timeSeries37.removeAgedItems(true);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class41);
        java.lang.String str43 = timeSeries42.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.addAndOrUpdate(timeSeries42);
        int int45 = timeSeries37.getMaximumItemCount();
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        java.lang.String str52 = timeSeries50.getDescription();
        boolean boolean54 = timeSeries50.equals((java.lang.Object) 10);
        timeSeries50.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries37.addAndOrUpdate(timeSeries50);
        java.util.List list58 = timeSeries50.data;
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries19.addAndOrUpdate(timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries12.addAndOrUpdate(timeSeries50);
        boolean boolean61 = timeSeries50.getNotify();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(class31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Time" + "'", str51, "Time");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries31.addChangeListener(seriesChangeListener32);
        boolean boolean34 = timeSeries26.equals((java.lang.Object) seriesChangeListener32);
        java.lang.Class class35 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries26.delete(regularTimePeriod36);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(class35);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setNotify(false);
        timeSeries4.setKey((java.lang.Comparable) "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries4.addOrUpdate(regularTimePeriod10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries35.removeChangeListener(seriesChangeListener57);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class60);
        java.lang.String str62 = timeSeries61.getRangeDescription();
        timeSeries61.setMaximumItemCount(100);
        java.lang.Class class66 = null;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class66);
        org.jfree.data.time.TimeSeries timeSeries68 = timeSeries61.addAndOrUpdate(timeSeries67);
        java.lang.Class class72 = null;
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class72);
        java.lang.String str74 = timeSeries73.getRangeDescription();
        java.lang.String str75 = timeSeries73.getDescription();
        boolean boolean77 = timeSeries73.equals((java.lang.Object) 10);
        java.lang.String str78 = timeSeries73.getDomainDescription();
        java.lang.Class class82 = null;
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class82);
        java.util.Collection collection84 = timeSeries73.getTimePeriodsUniqueToOtherSeries(timeSeries83);
        java.util.Collection collection85 = timeSeries61.getTimePeriodsUniqueToOtherSeries(timeSeries83);
        java.lang.Class<?> wildcardClass86 = collection85.getClass();
        timeSeries35.timePeriodClass = wildcardClass86;
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value" + "'", str62, "Value");
        org.junit.Assert.assertNotNull(timeSeries68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Time" + "'", str74, "Time");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        timeSeries26.setMaximumItemAge((long) 10);
        java.lang.Class class51 = timeSeries26.timePeriodClass;
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
        org.junit.Assert.assertNull(class51);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        timeSeries1.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class4 = timeSeries2.getTimePeriodClass();
        java.lang.String str5 = timeSeries2.getDomainDescription();
        timeSeries2.setNotify(false);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        timeSeries2.setMaximumItemCount((int) (short) 0);
        java.lang.String str11 = timeSeries2.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries2.update(regularTimePeriod12, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 100 + "'", comparable8, (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        java.lang.String str20 = timeSeries15.getDomainDescription();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.util.Collection collection26 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.util.Collection collection27 = timeSeries25.getTimePeriods();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.addAndOrUpdate(timeSeries36);
        java.util.List list41 = timeSeries40.getItems();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        timeSeries44.setMaximumItemCount(100);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        timeSeries50.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries44.addAndOrUpdate(timeSeries50);
        java.util.List list55 = timeSeries54.getItems();
        timeSeries40.data = list55;
        timeSeries25.data = list55;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries25.addChangeListener(seriesChangeListener58);
        java.lang.Comparable comparable60 = timeSeries25.getKey();
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class64);
        java.lang.Class class66 = null;
        timeSeries65.timePeriodClass = class66;
        timeSeries65.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries65.addChangeListener(seriesChangeListener70);
        timeSeries65.clear();
        timeSeries65.setNotify(false);
        java.lang.Class<?> wildcardClass75 = timeSeries65.getClass();
        boolean boolean76 = timeSeries25.equals((java.lang.Object) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Time", "Time", (java.lang.Class) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Overwritten values from: 100", "", (java.lang.Class) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', "", "", (java.lang.Class) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, (java.lang.Class) wildcardClass75);
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass75);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value" + "'", str37, "Value");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + 0.0f + "'", comparable60, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        java.lang.String str10 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.createCopy(1, (int) (short) 1);
        java.lang.String str14 = timeSeries13.getDescription();
        java.lang.String str15 = timeSeries13.getRangeDescription();
        java.util.Collection collection16 = timeSeries13.getTimePeriods();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        timeSeries12.setKey((java.lang.Comparable) true);
        boolean boolean22 = timeSeries12.isEmpty();
        timeSeries12.setNotify(false);
        boolean boolean25 = timeSeries12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries12.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
        timeSeries4.clear();
        timeSeries4.setNotify(false);
        timeSeries4.setRangeDescription("");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.Class class37 = null;
        timeSeries36.timePeriodClass = class37;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries36.removePropertyChangeListener(propertyChangeListener39);
        timeSeries36.setMaximumItemCount(100);
        java.util.Collection collection43 = timeSeries36.getTimePeriods();
        timeSeries36.setDescription("");
        java.lang.Class class46 = timeSeries36.getTimePeriodClass();
        java.util.List list47 = timeSeries36.data;
        timeSeries26.data = list47;
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Object obj51 = null;
        boolean boolean52 = timeSeries26.equals(obj51);
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
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(class46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        boolean boolean10 = timeSeries4.equals((java.lang.Object) "Time");
        timeSeries4.fireSeriesChanged();
        timeSeries4.clear();
        timeSeries4.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod15, number16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener7);
        java.util.Collection collection9 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(timeSeries9);
    }
}

