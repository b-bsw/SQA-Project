package org.jfree.data.time;

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
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.util.List list62 = timeSeries61.getItems();
        java.util.Collection collection63 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries3.addChangeListener(seriesChangeListener64);
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
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 1);
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(100, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getRawDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int65 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener66);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries71.addAndOrUpdate(timeSeries75);
        timeSeries71.removeAgedItems(false);
        java.lang.String str79 = timeSeries71.getDomainDescription();
        java.lang.Object obj80 = timeSeries71.clone();
        timeSeries71.clear();
        java.lang.Class class82 = timeSeries71.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener83);
        java.lang.Class class85 = timeSeries71.timePeriodClass;
        boolean boolean86 = timeSeries71.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener87 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener87);
        boolean boolean89 = timeSeries3.equals((java.lang.Object) propertyChangeListener87);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = timeSeries3.getIndex(regularTimePeriod90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNull(class82);
        org.junit.Assert.assertNull(class85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        java.lang.Comparable comparable11 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (-1.0f) + "'", comparable11, (-1.0f));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries52.setNotify(false);
        java.lang.Comparable comparable55 = timeSeries52.getKey();
        timeSeries52.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries61.addAndOrUpdate(timeSeries65);
        boolean boolean67 = timeSeries65.getNotify();
        double double68 = timeSeries65.getMaxY();
        java.util.List list69 = timeSeries65.getItems();
        timeSeries52.data = list69;
        timeSeries52.setNotify(true);
        timeSeries52.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries48.addAndOrUpdate(timeSeries52);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries52.removeChangeListener(seriesChangeListener76);
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
        org.junit.Assert.assertEquals("'" + comparable55 + "' != '" + (-1.0f) + "'", comparable55, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(timeSeries75);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        double double7 = timeSeries3.getMinY();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDescription("Value");
        timeSeries3.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        boolean boolean49 = timeSeries24.isEmpty();
        timeSeries24.clear();
        timeSeries24.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem54 = timeSeries24.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        boolean boolean60 = timeSeries49.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.String str45 = timeSeries42.getDomainDescription();
        int int46 = timeSeries42.getMaximumItemCount();
        java.lang.String str47 = timeSeries42.getDescription();
        java.util.Collection collection48 = timeSeries42.getTimePeriods();
        double double49 = timeSeries42.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.add(regularTimePeriod50, 1.0d);
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
            org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setRangeDescription("");
        java.lang.String str15 = timeSeries3.getDescription();
        double double16 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.createCopy((int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries7.getTimePeriodClass();
        double double16 = timeSeries7.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setRangeDescription("");
        java.util.List list15 = timeSeries3.data;
        java.lang.String str16 = timeSeries3.getRangeDescription();
        java.util.List list17 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries3.removeChangeListener(seriesChangeListener18);
        int int20 = timeSeries3.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
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
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries7.addOrUpdate(regularTimePeriod12, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        timeSeries15.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        boolean boolean37 = timeSeries27.getNotify();
        java.lang.Object obj38 = timeSeries27.clone();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries44.addAndOrUpdate(timeSeries48);
        timeSeries49.setDomainDescription("Value");
        boolean boolean52 = timeSeries27.equals((java.lang.Object) "Value");
        java.util.List list53 = timeSeries27.getItems();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries27.createCopy((int) (short) 100, 2147483647);
        java.lang.String str57 = timeSeries27.getDescription();
        java.lang.String str58 = timeSeries27.getRangeDescription();
        java.util.Collection collection59 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.String str60 = timeSeries15.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod61, (java.lang.Number) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Time" + "'", str60, "Time");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        timeSeries3.setMaximumItemAge((long) (short) 100);
        timeSeries3.setMaximumItemCount(10);
        timeSeries3.setKey((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.util.List list23 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries3.addOrUpdate(regularTimePeriod24, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries4 = timeSeries1.createCopy(2147483647, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.util.List list62 = timeSeries61.getItems();
        java.util.Collection collection63 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries67.addAndOrUpdate(timeSeries71);
        boolean boolean73 = timeSeries71.getNotify();
        double double74 = timeSeries71.getMaxY();
        java.lang.String str75 = timeSeries71.getRangeDescription();
        timeSeries71.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries78 = timeSeries3.addAndOrUpdate(timeSeries71);
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
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(timeSeries78);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setMaximumItemAge((long) 0);
        double double19 = timeSeries15.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries23.removeChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.lang.Class class40 = timeSeries34.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries34.addPropertyChangeListener(propertyChangeListener41);
        long long43 = timeSeries34.getMaximumItemAge();
        java.util.List list44 = timeSeries34.getItems();
        java.util.Collection collection45 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries23.removeChangeListener(seriesChangeListener46);
        double double48 = timeSeries23.getMinY();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries15.addAndOrUpdate(timeSeries23);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNull(class40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj47 = timeSeries46.clone();
        timeSeries46.clear();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries52.addAndOrUpdate(timeSeries56);
        timeSeries52.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries52.removeChangeListener(seriesChangeListener60);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries46.addAndOrUpdate(timeSeries52);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries66.addAndOrUpdate(timeSeries70);
        boolean boolean72 = timeSeries70.getNotify();
        double double73 = timeSeries70.getMaxY();
        int int74 = timeSeries70.getItemCount();
        timeSeries70.removeAgedItems((long) (short) 0, false);
        java.util.List list78 = timeSeries70.data;
        timeSeries52.data = list78;
        timeSeries52.setMaximumItemCount((int) '#');
        java.lang.Object obj82 = timeSeries52.clone();
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        boolean boolean84 = timeSeries41.equals(obj82);
        java.lang.String str85 = timeSeries41.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "", "Value");
        java.util.List list4 = timeSeries3.data;
        timeSeries3.setRangeDescription("hi!");
        timeSeries3.setDomainDescription("");
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        double double25 = timeSeries3.getMaxY();
        timeSeries3.setRangeDescription("Overwritten values from: -1.0");
        timeSeries3.setMaximumItemAge(0L);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener25);
        timeSeries21.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries21.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        double double40 = timeSeries37.getMinY();
        java.util.Collection collection41 = timeSeries37.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(timeSeriesDataItem42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.String str45 = timeSeries42.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries49.addAndOrUpdate(timeSeries53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries53.addPropertyChangeListener(propertyChangeListener55);
        timeSeries53.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries53.addChangeListener(seriesChangeListener59);
        timeSeries53.setDescription("hi!");
        java.util.Collection collection63 = timeSeries42.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        long long64 = timeSeries53.getMaximumItemAge();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9223372036854775807L + "'", long64 == 9223372036854775807L);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        java.util.List list13 = timeSeries3.getItems();
        boolean boolean14 = timeSeries3.getNotify();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries5.setNotify(false);
        java.lang.Comparable comparable8 = timeSeries5.getKey();
        timeSeries5.removeAgedItems(true);
        timeSeries5.fireSeriesChanged();
        timeSeries5.setMaximumItemAge((long) ' ');
        java.util.Collection collection14 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        timeSeries7.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries22.addAndOrUpdate(timeSeries26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener28);
        int int30 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        timeSeries38.setKey((java.lang.Comparable) 10L);
        java.util.List list44 = timeSeries38.getItems();
        timeSeries22.data = list44;
        boolean boolean46 = timeSeries7.equals((java.lang.Object) list44);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        timeSeries3.setDescription("Time");
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("");
        timeSeries3.setNotify(false);
        timeSeries3.clear();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        java.lang.Object obj30 = timeSeries18.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod31, 0.0d);
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
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setNotify(true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        double double29 = timeSeries18.getMinY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Time", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries3.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        java.util.List list13 = timeSeries7.getItems();
        double double14 = timeSeries7.getMaxY();
        java.lang.Class class15 = timeSeries7.timePeriodClass;
        timeSeries7.setDescription("Overwritten values from: -1.0");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.Object obj12 = timeSeries3.clone();
        java.lang.String str13 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries17.addAndOrUpdate(timeSeries21);
        boolean boolean23 = timeSeries21.getNotify();
        double double24 = timeSeries21.getMaxY();
        timeSeries21.setMaximumItemCount(1);
        java.util.Collection collection27 = timeSeries21.getTimePeriods();
        double double28 = timeSeries21.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean38 = timeSeries36.getNotify();
        double double39 = timeSeries36.getMaxY();
        int int40 = timeSeries36.getItemCount();
        double double41 = timeSeries36.getMinY();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries45.addAndOrUpdate(timeSeries49);
        boolean boolean51 = timeSeries49.getNotify();
        double double52 = timeSeries49.getMaxY();
        int int53 = timeSeries49.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries57.setNotify(false);
        java.lang.Comparable comparable60 = timeSeries57.getKey();
        java.lang.Class<?> wildcardClass61 = comparable60.getClass();
        timeSeries49.timePeriodClass = wildcardClass61;
        timeSeries36.timePeriodClass = wildcardClass61;
        timeSeries21.timePeriodClass = wildcardClass61;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries68.addAndOrUpdate(timeSeries72);
        timeSeries68.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener76 = null;
        timeSeries68.removeChangeListener(seriesChangeListener76);
        timeSeries68.setMaximumItemCount(0);
        timeSeries68.setKey((java.lang.Comparable) "Value");
        java.util.Collection collection82 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries68);
        java.lang.Class class83 = timeSeries21.getTimePeriodClass();
        timeSeries3.timePeriodClass = class83;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + (-1.0f) + "'", comparable60, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(class83);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        timeSeries7.setDomainDescription("hi!");
        java.util.List list12 = timeSeries7.data;
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
            timeSeries7.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "Time");
        timeSeries3.setNotify(false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries24.addOrUpdate(regularTimePeriod49, 10.0d);
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        timeSeries3.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        boolean boolean51 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        java.util.Collection collection54 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj59 = timeSeries58.clone();
        timeSeries58.removeAgedItems(false);
        double double62 = timeSeries58.getMinY();
        java.lang.String str63 = timeSeries58.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries58.removeChangeListener(seriesChangeListener64);
        timeSeries58.setDescription("Value");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener68 = null;
        timeSeries58.removeChangeListener(seriesChangeListener68);
        timeSeries58.setDomainDescription("hi!");
        boolean boolean72 = timeSeries53.equals((java.lang.Object) timeSeries58);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int41 = timeSeries32.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener21);
        timeSeries19.setKey((java.lang.Comparable) 10L);
        java.util.List list25 = timeSeries19.getItems();
        timeSeries3.data = list25;
        java.util.List list27 = timeSeries3.getItems();
        boolean boolean28 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries34.removeChangeListener(seriesChangeListener40);
        timeSeries34.fireSeriesChanged();
        timeSeries34.clear();
        timeSeries34.clear();
        boolean boolean45 = timeSeries34.getNotify();
        java.util.List list46 = timeSeries34.getItems();
        timeSeries30.data = list46;
        timeSeries3.data = list46;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "Overwritten values from: -1.0", "Value");
        java.lang.Class<?> wildcardClass4 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        java.lang.String str12 = timeSeries7.getRangeDescription();
        java.util.List list13 = timeSeries7.data;
        java.util.List list14 = timeSeries7.data;
        timeSeries7.removeAgedItems(100L, false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        double double37 = timeSeries7.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = timeSeries7.getIndex(regularTimePeriod38);
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
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        double double13 = timeSeries3.getMaxY();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries3.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        double double12 = timeSeries3.getMaxY();
        timeSeries3.clear();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        double double15 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.removeChangeListener(seriesChangeListener16);
        timeSeries3.setMaximumItemAge((long) (byte) 100);
        java.lang.String str20 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        long long15 = timeSeries3.getMaximumItemAge();
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, (double) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener11);
        java.util.List list13 = timeSeries7.getItems();
        timeSeries7.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "hi!", "Time");
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.util.List list46 = timeSeries45.getItems();
        timeSeries45.setMaximumItemAge((long) (short) 10);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        int int50 = timeSeries7.getMaximumItemCount();
        java.util.Collection collection51 = timeSeries7.getTimePeriods();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        boolean boolean51 = timeSeries7.getNotify();
        java.lang.String str52 = timeSeries7.getDomainDescription();
        java.lang.Comparable comparable53 = timeSeries7.getKey();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (-1.0f) + "'", comparable53, (-1.0f));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "", "hi!");
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) (byte) 10, true);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries7.removeChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        timeSeries48.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries54.addAndOrUpdate(timeSeries58);
        java.lang.Class class60 = timeSeries54.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries64.addAndOrUpdate(timeSeries68);
        java.lang.Comparable comparable70 = timeSeries68.getKey();
        timeSeries68.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries54.addAndOrUpdate(timeSeries68);
        java.lang.String str74 = timeSeries68.getRangeDescription();
        timeSeries68.setNotify(true);
        java.lang.Comparable comparable77 = timeSeries68.getKey();
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj82 = timeSeries81.clone();
        timeSeries81.clear();
        java.util.List list84 = timeSeries81.getItems();
        double double85 = timeSeries81.getMaxY();
        java.lang.Class class86 = timeSeries81.getTimePeriodClass();
        java.lang.Class<?> wildcardClass87 = timeSeries81.getClass();
        timeSeries68.timePeriodClass = wildcardClass87;
        timeSeries48.timePeriodClass = wildcardClass87;
        timeSeries7.timePeriodClass = wildcardClass87;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNull(class60);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertEquals("'" + comparable70 + "' != '" + (-1.0f) + "'", comparable70, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + comparable77 + "' != '" + (short) 0 + "'", comparable77, (short) 0);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertNull(class86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.String str43 = timeSeries15.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries15.getRawDataItem(regularTimePeriod44);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "", "Value");
        java.util.List list4 = timeSeries3.data;
        timeSeries3.setRangeDescription("hi!");
        double double7 = timeSeries3.getMinY();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        java.util.Collection collection18 = timeSeries3.getTimePeriods();
        int int19 = timeSeries3.getMaximumItemCount();
        java.lang.Class<?> wildcardClass20 = timeSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        java.lang.Class class37 = timeSeries31.timePeriodClass;
        java.util.List list38 = timeSeries31.data;
        timeSeries27.data = list38;
        java.lang.Object obj40 = timeSeries27.clone();
        java.lang.Class class41 = timeSeries27.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries45 = timeSeries27.createCopy(regularTimePeriod43, regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNull(class37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
            java.lang.Number number14 = timeSeries7.getValue(regularTimePeriod13);
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setMaximumItemAge((long) 0);
        java.lang.Comparable comparable19 = timeSeries15.getKey();
        java.lang.String str20 = timeSeries15.getDomainDescription();
        int int21 = timeSeries15.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener22);
        timeSeries15.setRangeDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: -1.0" + "'", comparable19, "Overwritten values from: -1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "hi!", "hi!");
        int int41 = timeSeries40.getItemCount();
        java.util.List list42 = timeSeries40.getItems();
        timeSeries21.data = list42;
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        timeSeries37.fireSeriesChanged();
        java.lang.Object obj44 = timeSeries37.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod45, (java.lang.Number) (byte) 100);
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
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        boolean boolean51 = timeSeries7.getNotify();
        java.lang.Comparable comparable52 = timeSeries7.getKey();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (-1.0f) + "'", comparable52, (-1.0f));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int65 = timeSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener66);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries71.addAndOrUpdate(timeSeries75);
        timeSeries71.removeAgedItems(false);
        java.lang.String str79 = timeSeries71.getDomainDescription();
        java.lang.Object obj80 = timeSeries71.clone();
        timeSeries71.clear();
        java.lang.Class class82 = timeSeries71.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener83);
        java.lang.Class class85 = timeSeries71.timePeriodClass;
        boolean boolean86 = timeSeries71.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener87 = null;
        timeSeries71.addPropertyChangeListener(propertyChangeListener87);
        boolean boolean89 = timeSeries3.equals((java.lang.Object) propertyChangeListener87);
        timeSeries3.setKey((java.lang.Comparable) '#');
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNull(class82);
        org.junit.Assert.assertNull(class85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        timeSeries41.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries41.addOrUpdate(regularTimePeriod45, (double) '#');
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Object obj71 = timeSeries28.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number73 = timeSeries28.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(obj71);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        java.lang.Object obj22 = timeSeries3.clone();
        java.lang.Object obj23 = timeSeries3.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries10.setNotify(false);
        java.lang.Comparable comparable13 = timeSeries10.getKey();
        java.lang.Class<?> wildcardClass14 = comparable13.getClass();
        timeSeries3.timePeriodClass = wildcardClass14;
        java.lang.String str16 = timeSeries3.getDomainDescription();
        boolean boolean17 = timeSeries3.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0f) + "'", comparable13, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.lang.Class class25 = timeSeries21.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener26);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = timeSeries21.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(class25);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        java.util.List list15 = timeSeries7.data;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries19.addAndOrUpdate(timeSeries23);
        timeSeries19.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries30.addAndOrUpdate(timeSeries34);
        java.lang.Class class36 = timeSeries30.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries19.getItems();
        double double39 = timeSeries19.getMinY();
        java.util.List list40 = timeSeries19.data;
        timeSeries7.data = list40;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNull(class36);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        boolean boolean24 = timeSeries16.getNotify();
        java.lang.Object obj25 = timeSeries16.clone();
        boolean boolean26 = timeSeries3.equals(obj25);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        java.lang.String str17 = timeSeries3.getRangeDescription();
        timeSeries3.removeAgedItems(false);
        java.lang.Comparable comparable20 = timeSeries3.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (-1.0f) + "'", comparable20, (-1.0f));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: -1.0");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        timeSeries3.fireSeriesChanged();
        int int10 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "", "Time");
        timeSeries3.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        timeSeries9.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.addAndOrUpdate(timeSeries28);
        java.lang.Class class30 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries9.addAndOrUpdate(timeSeries24);
        double double32 = timeSeries9.getMinY();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.addAndOrUpdate(timeSeries42);
        boolean boolean44 = timeSeries42.getNotify();
        double double45 = timeSeries42.getMaxY();
        int int46 = timeSeries42.getItemCount();
        double double47 = timeSeries42.getMinY();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries51.addAndOrUpdate(timeSeries55);
        boolean boolean57 = timeSeries55.getNotify();
        double double58 = timeSeries55.getMaxY();
        int int59 = timeSeries55.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries63.setNotify(false);
        java.lang.Comparable comparable66 = timeSeries63.getKey();
        java.lang.Class<?> wildcardClass67 = comparable66.getClass();
        timeSeries55.timePeriodClass = wildcardClass67;
        timeSeries42.timePeriodClass = wildcardClass67;
        timeSeries34.timePeriodClass = wildcardClass67;
        double double71 = timeSeries34.getMinY();
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries9.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries3.addAndOrUpdate(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNull(class30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + comparable66 + "' != '" + (-1.0f) + "'", comparable66, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertNotNull(timeSeries73);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        java.lang.Class class10 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(true);
        boolean boolean13 = timeSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(class10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        double double5 = timeSeries1.getMaxY();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 1 + "'", comparable6, (byte) 1);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        timeSeries22.removeAgedItems((long) (short) 100, false);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        java.lang.Object obj31 = timeSeries15.clone();
        timeSeries15.setKey((java.lang.Comparable) 10L);
        double double34 = timeSeries15.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        boolean boolean51 = timeSeries7.getNotify();
        java.lang.String str52 = timeSeries7.getDomainDescription();
        java.lang.String str53 = timeSeries7.getDescription();
        java.lang.Class<?> wildcardClass54 = timeSeries7.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.util.List list10 = timeSeries3.data;
        java.lang.Class class11 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        timeSeries7.setDomainDescription("Time");
        long long14 = timeSeries7.getMaximumItemAge();
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries41.addChangeListener(seriesChangeListener42);
        java.lang.Class class44 = timeSeries41.getTimePeriodClass();
        timeSeries41.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNull(class44);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
            timeSeries3.update(regularTimePeriod59, (java.lang.Number) (byte) 0);
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        java.lang.String str15 = timeSeries7.getDomainDescription();
        double double16 = timeSeries7.getMinY();
        boolean boolean17 = timeSeries7.isEmpty();
        java.lang.Class class18 = timeSeries7.timePeriodClass;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries19.addAndOrUpdate(timeSeries23);
        timeSeries19.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries30.addAndOrUpdate(timeSeries34);
        boolean boolean36 = timeSeries34.getNotify();
        double double37 = timeSeries34.getMaxY();
        java.util.List list38 = timeSeries34.getItems();
        timeSeries19.data = list38;
        timeSeries19.removeAgedItems(1L, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener43);
        boolean boolean45 = timeSeries7.equals((java.lang.Object) propertyChangeListener43);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        timeSeries3.removeAgedItems(true);
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries3.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        boolean boolean49 = timeSeries24.isEmpty();
        timeSeries24.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        int int54 = timeSeries53.getMaximumItemCount();
        timeSeries53.setDescription("Overwritten values from: -1.0");
        boolean boolean57 = timeSeries24.equals((java.lang.Object) "Overwritten values from: -1.0");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy((int) (short) 10, 2147483647);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0f) + "'", comparable10, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.String str23 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        double double25 = timeSeries17.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries17.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        timeSeries7.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod23, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.addAndOrUpdate(timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries3.addAndOrUpdate(timeSeries47);
        timeSeries53.setKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (-1.0f) + "'", comparable38, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries53);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries27.getRawDataItem(regularTimePeriod28);
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
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        timeSeries7.setDomainDescription("");
        java.lang.Object obj18 = timeSeries7.clone();
        timeSeries7.setRangeDescription("Overwritten values from: -1.0");
        double double21 = timeSeries7.getMaxY();
        java.lang.String str22 = timeSeries7.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        int int23 = timeSeries17.getItemCount();
        timeSeries17.removeAgedItems(false);
        java.lang.String str26 = timeSeries17.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries17.addOrUpdate(regularTimePeriod27, (java.lang.Number) (short) 0);
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "Overwritten values from: -1.0");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Overwritten values from: -1.0", "Overwritten values from: -1.0");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        int int65 = timeSeries3.getItemCount();
        double double66 = timeSeries3.getMinY();
        java.lang.Class class67 = timeSeries3.timePeriodClass;
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(class67);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        double double22 = timeSeries3.getMinY();
        timeSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.Comparable comparable26 = timeSeries17.getKey();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries30.addAndOrUpdate(timeSeries34);
        timeSeries30.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries41.addAndOrUpdate(timeSeries45);
        boolean boolean47 = timeSeries45.getNotify();
        double double48 = timeSeries45.getMaxY();
        java.util.List list49 = timeSeries45.getItems();
        timeSeries30.data = list49;
        java.util.List list51 = timeSeries30.getItems();
        boolean boolean52 = timeSeries17.equals((java.lang.Object) list51);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 0 + "'", comparable26, (short) 0);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        java.lang.String str17 = timeSeries3.getRangeDescription();
        timeSeries3.removeAgedItems(false);
        timeSeries3.clear();
        java.util.List list21 = timeSeries3.data;
        java.lang.Class<?> wildcardClass22 = list21.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        java.util.List list26 = timeSeries17.getItems();
        timeSeries17.removeAgedItems((-1L), true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries32 = timeSeries17.createCopy(regularTimePeriod30, regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        timeSeries7.setDomainDescription("");
        java.lang.Object obj18 = timeSeries7.clone();
        timeSeries7.setRangeDescription("Overwritten values from: -1.0");
        boolean boolean22 = timeSeries7.equals((java.lang.Object) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries7.addOrUpdate(timeSeriesDataItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        timeSeries9.setMaximumItemCount((int) '#');
        timeSeries9.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(regularTimePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.util.List list10 = timeSeries7.getItems();
        timeSeries7.removeAgedItems(true);
        boolean boolean13 = timeSeries7.getNotify();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries3.removeChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        java.util.List list29 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries3.getRawDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMinY();
        double double12 = timeSeries3.getMaxY();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        timeSeries3.setDescription("Overwritten values from: -1.0");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        java.lang.String str17 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries3.createCopy((int) (short) 10, (int) '#');
        java.lang.Comparable comparable21 = timeSeries20.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0f) + "'", comparable21, (-1.0f));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        boolean boolean21 = timeSeries17.equals((java.lang.Object) 0L);
        timeSeries17.removeAgedItems(false);
        timeSeries17.clear();
        java.lang.Object obj25 = timeSeries17.clone();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        java.lang.Comparable comparable45 = timeSeries43.getKey();
        timeSeries43.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries29.addAndOrUpdate(timeSeries43);
        java.lang.String str49 = timeSeries43.getRangeDescription();
        timeSeries43.setNotify(true);
        java.lang.Comparable comparable52 = timeSeries43.getKey();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj57 = timeSeries56.clone();
        timeSeries56.clear();
        java.util.List list59 = timeSeries56.getItems();
        double double60 = timeSeries56.getMaxY();
        java.lang.Class class61 = timeSeries56.getTimePeriodClass();
        java.lang.Class<?> wildcardClass62 = timeSeries56.getClass();
        timeSeries43.timePeriodClass = wildcardClass62;
        boolean boolean64 = timeSeries17.equals((java.lang.Object) wildcardClass62);
        timeSeries17.setMaximumItemCount((int) (short) 100);
        boolean boolean67 = timeSeries17.getNotify();
        boolean boolean68 = timeSeries7.equals((java.lang.Object) boolean67);
        java.util.List list69 = timeSeries7.data;
        timeSeries7.setMaximumItemCount((int) (short) 10);
        timeSeries7.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = timeSeries7.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (-1.0f) + "'", comparable45, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (short) 0 + "'", comparable52, (short) 0);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNull(class61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        timeSeries7.setNotify(false);
        timeSeries7.setRangeDescription("Overwritten values from: -1.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.util.List list46 = timeSeries45.data;
        java.util.List list47 = timeSeries45.getItems();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = timeSeries3.data;
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        java.util.List list15 = timeSeries3.data;
        timeSeries3.setDescription("");
        timeSeries3.setMaximumItemAge((long) '4');
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        java.lang.Comparable comparable16 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        timeSeries3.clear();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries3.removeChangeListener(seriesChangeListener50);
        java.util.Collection collection52 = timeSeries3.getTimePeriods();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries3.removeChangeListener(seriesChangeListener53);
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
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        timeSeries7.setDomainDescription("Time");
        java.util.Collection collection14 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        double double25 = timeSeries3.getMaxY();
        timeSeries3.setRangeDescription("Overwritten values from: -1.0");
        timeSeries3.removeAgedItems(false);
        java.util.List list30 = timeSeries3.data;
        java.lang.String str31 = timeSeries3.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        boolean boolean10 = timeSeries3.isEmpty();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.addAndOrUpdate(timeSeries9);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries5.removeChangeListener(seriesChangeListener11);
        timeSeries5.fireSeriesChanged();
        timeSeries5.clear();
        timeSeries5.clear();
        boolean boolean16 = timeSeries5.getNotify();
        java.util.List list17 = timeSeries5.getItems();
        timeSeries1.data = list17;
        java.lang.String str19 = timeSeries1.getRangeDescription();
        java.lang.String str20 = timeSeries1.getDomainDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries1.addChangeListener(seriesChangeListener22);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries1.removeChangeListener(seriesChangeListener24);
        double double26 = timeSeries1.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        long long15 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries19.addAndOrUpdate(timeSeries23);
        timeSeries19.removeAgedItems(false);
        java.lang.String str27 = timeSeries19.getDomainDescription();
        java.lang.Object obj28 = timeSeries19.clone();
        timeSeries19.clear();
        java.lang.Class<?> wildcardClass30 = timeSeries19.getClass();
        timeSeries7.timePeriodClass = wildcardClass30;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.addAndOrUpdate(timeSeries39);
        timeSeries35.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries35.removeChangeListener(seriesChangeListener43);
        timeSeries35.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection48 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        java.util.Collection collection49 = timeSeries35.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int32 = timeSeries3.getMaximumItemCount();
        java.lang.String str33 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((int) (byte) 100, (int) (byte) 100);
        timeSeries16.setDescription("Overwritten values from: -1.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(regularTimePeriod19, (java.lang.Number) Double.NaN, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class13);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        java.lang.String str15 = timeSeries7.getDomainDescription();
        double double16 = timeSeries7.getMinY();
        boolean boolean17 = timeSeries7.isEmpty();
        timeSeries7.fireSeriesChanged();
        timeSeries7.setNotify(true);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries7.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries18.addAndOrUpdate(timeSeries29);
        java.util.Collection collection37 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener38);
        java.util.Collection collection40 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries3.setKey((java.lang.Comparable) false);
        java.util.List list43 = timeSeries3.data;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        java.lang.Object obj22 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge((long) 'a');
        boolean boolean25 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.lang.String str2 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemAge((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.util.List list2 = timeSeries1.getItems();
        java.lang.Class class3 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(class3);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        java.lang.Object obj44 = null;
        boolean boolean45 = timeSeries41.equals(obj44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries41.add(regularTimePeriod46, (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        timeSeries3.removeAgedItems((long) '4', false);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener41);
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        double double15 = timeSeries3.getMinY();
        int int16 = timeSeries3.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener12);
        java.lang.Class class14 = timeSeries7.timePeriodClass;
        java.lang.String str15 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertNull(class14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener36);
        long long38 = timeSeries29.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        timeSeries42.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries42.removeChangeListener(seriesChangeListener50);
        timeSeries42.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass55 = timeSeries42.getClass();
        timeSeries29.timePeriodClass = wildcardClass55;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries60.addAndOrUpdate(timeSeries64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener66);
        java.lang.Object obj68 = timeSeries64.clone();
        java.util.List list69 = timeSeries64.data;
        timeSeries29.data = list69;
        java.lang.String str71 = timeSeries29.getDescription();
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries75.addAndOrUpdate(timeSeries79);
        java.lang.Class class81 = timeSeries75.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener82 = null;
        timeSeries75.removeChangeListener(seriesChangeListener82);
        java.util.List list84 = timeSeries75.data;
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries29.addAndOrUpdate(timeSeries75);
        org.jfree.data.time.TimeSeries timeSeries87 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.util.List list88 = timeSeries87.getItems();
        java.util.Collection collection89 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries87);
        long long90 = timeSeries29.getMaximumItemAge();
        java.lang.Class class91 = timeSeries29.timePeriodClass;
        timeSeries24.timePeriodClass = class91;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod93 = timeSeries24.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNull(class81);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 9223372036854775807L + "'", long90 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class91);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        long long29 = timeSeries18.getMaximumItemAge();
        java.lang.String str30 = timeSeries18.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries18.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj37 = timeSeries36.clone();
        timeSeries36.clear();
        java.util.List list39 = timeSeries36.getItems();
        double double40 = timeSeries36.getMaxY();
        timeSeries36.setDescription("hi!");
        java.util.Collection collection43 = timeSeries36.getTimePeriods();
        timeSeries36.setKey((java.lang.Comparable) "Time");
        java.util.List list46 = timeSeries36.getItems();
        timeSeries36.clear();
        int int48 = timeSeries36.getMaximumItemCount();
        java.util.Collection collection49 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        timeSeries36.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = timeSeries36.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.addAndOrUpdate(timeSeries25);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries21.removeChangeListener(seriesChangeListener27);
        timeSeries21.fireSeriesChanged();
        timeSeries21.clear();
        timeSeries21.clear();
        java.lang.Class<?> wildcardClass32 = timeSeries21.getClass();
        timeSeries3.timePeriodClass = wildcardClass32;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(class17);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        double double15 = timeSeries3.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.removeChangeListener(seriesChangeListener16);
        timeSeries3.setMaximumItemAge((long) (byte) 100);
        timeSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        timeSeries3.removeAgedItems(true);
        boolean boolean14 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        timeSeries22.setMaximumItemCount(1);
        timeSeries22.setNotify(false);
        int int30 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries3.addAndOrUpdate(timeSeries22);
        boolean boolean32 = timeSeries31.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries31.addOrUpdate(regularTimePeriod33, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int25 = timeSeries3.getMaximumItemCount();
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.String str12 = timeSeries3.getDescription();
        java.util.List list13 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        boolean boolean60 = timeSeries59.isEmpty();
        java.util.List list61 = timeSeries59.data;
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        timeSeries3.clear();
        int int5 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries21.removeChangeListener(seriesChangeListener24);
        java.util.Collection collection26 = timeSeries21.getTimePeriods();
        java.lang.String str27 = timeSeries21.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        timeSeries3.setMaximumItemAge((long) 100);
        java.lang.String str29 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        java.lang.Object obj31 = timeSeries15.clone();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.addAndOrUpdate(timeSeries39);
        timeSeries35.removeAgedItems(false);
        java.lang.String str43 = timeSeries35.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener44);
        java.util.List list46 = timeSeries35.data;
        boolean boolean47 = timeSeries15.equals((java.lang.Object) timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        timeSeries3.setDescription("Overwritten values from: -1.0");
        java.lang.Class class28 = timeSeries3.timePeriodClass;
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(class28);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        timeSeries37.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.addAndOrUpdate(timeSeries51);
        timeSeries47.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries58.addAndOrUpdate(timeSeries62);
        java.lang.Class class64 = timeSeries58.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries47.addAndOrUpdate(timeSeries58);
        java.util.List list66 = timeSeries47.getItems();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener67);
        java.util.List list69 = timeSeries47.getItems();
        timeSeries37.data = list69;
        double double71 = timeSeries37.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod72, (java.lang.Number) (byte) 0);
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
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        boolean boolean51 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries59.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener65);
        int int67 = timeSeries59.getMaximumItemCount();
        boolean boolean68 = timeSeries55.equals((java.lang.Object) timeSeries59);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries7.addAndOrUpdate(timeSeries55);
        int int70 = timeSeries69.getItemCount();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        java.lang.String str4 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        timeSeries36.removeAgedItems(true);
        timeSeries36.setRangeDescription("Overwritten values from: -1.0");
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener27);
        java.lang.Class class29 = timeSeries25.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        long long27 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries35.getNotify();
        double double38 = timeSeries35.getMaxY();
        timeSeries35.setMaximumItemCount(1);
        timeSeries35.setNotify(false);
        long long43 = timeSeries35.getMaximumItemAge();
        timeSeries35.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj50 = timeSeries49.clone();
        timeSeries49.clear();
        java.util.List list52 = timeSeries49.getItems();
        double double53 = timeSeries49.getMaxY();
        timeSeries49.setDescription("hi!");
        java.util.Collection collection56 = timeSeries49.getTimePeriods();
        timeSeries49.setKey((java.lang.Comparable) "Time");
        java.util.List list59 = timeSeries49.getItems();
        timeSeries35.data = list59;
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries3.addAndOrUpdate(timeSeries35);
        java.lang.String str62 = timeSeries35.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int64 = timeSeries35.getIndex(regularTimePeriod63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.removeAgedItems((long) (-1), false);
        timeSeries1.clear();
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        double double15 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries3.createCopy((int) '4', 100);
        boolean boolean19 = timeSeries18.getNotify();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        timeSeries7.setDomainDescription("Time");
        long long14 = timeSeries7.getMaximumItemAge();
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        java.lang.String str16 = timeSeries7.getDomainDescription();
        java.lang.Class class17 = timeSeries7.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries7.addChangeListener(seriesChangeListener18);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNull(class17);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        int int65 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries3.addChangeListener(seriesChangeListener66);
        int int68 = timeSeries3.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries7.getTimePeriodClass();
        boolean boolean16 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        java.lang.Class class26 = timeSeries20.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener27);
        java.lang.String str29 = timeSeries20.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries20.addChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.addAndOrUpdate(timeSeries39);
        timeSeries35.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries46.addAndOrUpdate(timeSeries50);
        java.lang.Class class52 = timeSeries46.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries35.addAndOrUpdate(timeSeries46);
        java.util.List list54 = timeSeries35.getItems();
        double double55 = timeSeries35.getMinY();
        double double56 = timeSeries35.getMaxY();
        boolean boolean57 = timeSeries20.equals((java.lang.Object) timeSeries35);
        timeSeries35.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries7.addAndOrUpdate(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(class26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNull(class52);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(timeSeries60);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        boolean boolean43 = timeSeries41.getNotify();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.addAndOrUpdate(timeSeries51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries51.addPropertyChangeListener(propertyChangeListener53);
        timeSeries51.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries51.addChangeListener(seriesChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener59);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries64.addAndOrUpdate(timeSeries68);
        timeSeries64.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries75.addAndOrUpdate(timeSeries79);
        java.lang.Class class81 = timeSeries75.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries64.addAndOrUpdate(timeSeries75);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener83 = null;
        timeSeries75.removeChangeListener(seriesChangeListener83);
        java.util.List list85 = timeSeries75.data;
        timeSeries51.data = list85;
        boolean boolean87 = timeSeries41.equals((java.lang.Object) timeSeries51);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem89 = timeSeries51.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNull(class81);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries19.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        boolean boolean32 = timeSeries30.getNotify();
        double double33 = timeSeries30.getMaxY();
        java.util.List list34 = timeSeries30.getItems();
        timeSeries19.data = list34;
        java.lang.Class<?> wildcardClass36 = list34.getClass();
        timeSeries3.timePeriodClass = wildcardClass36;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem38, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries18.setNotify(false);
        java.lang.Comparable comparable21 = timeSeries18.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        java.util.Collection collection31 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.lang.String str32 = timeSeries18.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries37.addAndOrUpdate(timeSeries41);
        java.lang.Class class43 = timeSeries37.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries37.removeChangeListener(seriesChangeListener44);
        java.util.List list46 = timeSeries37.data;
        timeSeries37.removeAgedItems(true);
        int int49 = timeSeries37.getMaximumItemCount();
        java.util.Collection collection50 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        timeSeries3.removeAgedItems((long) ' ', true);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0f) + "'", comparable21, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        timeSeries15.removeAgedItems(9223372036854775807L, true);
        java.lang.Class<?> wildcardClass22 = timeSeries15.getClass();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "Overwritten values from: -1.0", "Time");
        java.lang.String str4 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Overwritten values from: -1.0" + "'", str4, "Overwritten values from: -1.0");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        java.util.List list12 = timeSeries7.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.removeChangeListener(seriesChangeListener13);
        int int15 = timeSeries7.getItemCount();
        timeSeries7.setRangeDescription("");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        timeSeries37.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.addAndOrUpdate(timeSeries51);
        timeSeries47.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries58.addAndOrUpdate(timeSeries62);
        java.lang.Class class64 = timeSeries58.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries47.addAndOrUpdate(timeSeries58);
        java.util.List list66 = timeSeries47.getItems();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener67);
        java.util.List list69 = timeSeries47.getItems();
        timeSeries37.data = list69;
        double double71 = timeSeries37.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod72, (double) 10.0f);
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
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNull(class64);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries25.setDomainDescription("Value");
        boolean boolean28 = timeSeries3.equals((java.lang.Object) "Value");
        java.util.List list29 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries3.createCopy((int) (short) 100, 2147483647);
        double double33 = timeSeries32.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries32.createCopy(regularTimePeriod34, regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        timeSeries3.setMaximumItemAge((long) (short) 100);
        java.lang.Class class29 = timeSeries3.timePeriodClass;
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        java.util.List list12 = timeSeries7.data;
        java.lang.String str13 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.addOrUpdate(regularTimePeriod14, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        long long11 = timeSeries3.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.removeChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries3.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        java.util.List list13 = timeSeries7.getItems();
        double double14 = timeSeries7.getMaxY();
        java.lang.Class class15 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries19.setNotify(false);
        java.lang.Comparable comparable22 = timeSeries19.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries26.setNotify(false);
        java.lang.Comparable comparable29 = timeSeries26.getKey();
        java.lang.Class<?> wildcardClass30 = comparable29.getClass();
        timeSeries19.timePeriodClass = wildcardClass30;
        timeSeries7.timePeriodClass = wildcardClass30;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (-1.0f) + "'", comparable22, (-1.0f));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        java.lang.String str15 = timeSeries7.getDomainDescription();
        double double16 = timeSeries7.getMinY();
        boolean boolean17 = timeSeries7.isEmpty();
        timeSeries7.fireSeriesChanged();
        timeSeries7.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries7.addOrUpdate(regularTimePeriod21, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        timeSeries7.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.addPropertyChangeListener(propertyChangeListener35);
        timeSeries33.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries33.addChangeListener(seriesChangeListener39);
        java.lang.Class class41 = timeSeries33.getTimePeriodClass();
        java.util.Collection collection42 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        java.lang.Object obj43 = timeSeries7.clone();
        double double44 = timeSeries7.getMinY();
        timeSeries7.setMaximumItemCount(0);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener46);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem49 = timeSeries16.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        java.lang.String str18 = timeSeries7.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.addAndOrUpdate(timeSeries9);
        java.lang.Class class11 = timeSeries5.timePeriodClass;
        java.util.List list12 = timeSeries5.data;
        timeSeries1.data = list12;
        java.lang.Object obj14 = timeSeries1.clone();
        boolean boolean15 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(class11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 1);
        timeSeries3.removeAgedItems(false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.addAndOrUpdate(timeSeries9);
        timeSeries5.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries5.removeChangeListener(seriesChangeListener13);
        timeSeries5.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        java.lang.Class class26 = timeSeries20.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries5.addAndOrUpdate(timeSeries20);
        java.lang.String str28 = timeSeries27.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.lang.Class class38 = timeSeries32.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries32.addPropertyChangeListener(propertyChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries44.addAndOrUpdate(timeSeries48);
        timeSeries44.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries44.removeChangeListener(seriesChangeListener52);
        timeSeries44.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection57 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        timeSeries44.clear();
        timeSeries44.setDomainDescription("Overwritten values from: -1.0");
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries27.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries1.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries66.setNotify(false);
        java.lang.Comparable comparable69 = timeSeries66.getKey();
        java.lang.Class<?> wildcardClass70 = comparable69.getClass();
        timeSeries27.timePeriodClass = wildcardClass70;
        int int72 = timeSeries27.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNull(class26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertEquals("'" + comparable69 + "' != '" + (-1.0f) + "'", comparable69, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        double double23 = timeSeries3.getMinY();
        double double24 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.String str32 = timeSeries28.getRangeDescription();
        java.lang.Comparable comparable33 = timeSeries28.getKey();
        java.lang.String str34 = timeSeries28.getDescription();
        java.lang.Comparable comparable35 = timeSeries28.getKey();
        timeSeries28.setDescription("Time");
        java.util.Collection collection38 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update(regularTimePeriod39, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (-1.0f) + "'", comparable33, (-1.0f));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (-1.0f) + "'", comparable35, (-1.0f));
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        int int8 = timeSeries3.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setMaximumItemAge((long) 0);
        java.lang.Comparable comparable19 = timeSeries15.getKey();
        java.lang.String str20 = timeSeries15.getDomainDescription();
        timeSeries15.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: -1.0" + "'", comparable19, "Overwritten values from: -1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        timeSeries3.fireSeriesChanged();
        int int10 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(1, (int) '4');
        java.lang.String str14 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 1);
        timeSeries3.setNotify(false);
        timeSeries3.setDescription("");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries3.addChangeListener(seriesChangeListener13);
        boolean boolean15 = timeSeries3.isEmpty();
        timeSeries3.setDescription("hi!");
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        timeSeries15.removeAgedItems(9223372036854775807L, true);
        long long22 = timeSeries15.getMaximumItemAge();
        java.util.List list23 = timeSeries15.getItems();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        timeSeries28.setKey((java.lang.Comparable) (-1L));
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        timeSeries3.setMaximumItemAge((long) 'a');
        timeSeries3.setMaximumItemCount((int) (short) 10);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        timeSeries15.setDomainDescription("Value");
        java.lang.Class class32 = timeSeries15.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(class32);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        double double22 = timeSeries21.getMinY();
        timeSeries21.removeAgedItems((long) (short) 10, true);
        timeSeries21.setKey((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        double double15 = timeSeries3.getMaxY();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.addAndOrUpdate(timeSeries25);
        timeSeries21.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.lang.Class class38 = timeSeries32.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries21.addAndOrUpdate(timeSeries32);
        java.util.List list40 = timeSeries21.getItems();
        java.lang.String str41 = timeSeries21.getRangeDescription();
        timeSeries21.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries47.addAndOrUpdate(timeSeries51);
        java.lang.Class class53 = timeSeries47.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener54);
        long long56 = timeSeries47.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries60.addAndOrUpdate(timeSeries64);
        timeSeries60.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener68 = null;
        timeSeries60.removeChangeListener(seriesChangeListener68);
        timeSeries60.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass73 = timeSeries60.getClass();
        timeSeries47.timePeriodClass = wildcardClass73;
        timeSeries21.timePeriodClass = wildcardClass73;
        timeSeries3.timePeriodClass = wildcardClass73;
        java.lang.String str77 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNull(class53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 9223372036854775807L + "'", long56 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        java.lang.String str23 = timeSeries14.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update(regularTimePeriod24, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        long long16 = timeSeries7.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double13 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        boolean boolean26 = timeSeries24.getNotify();
        double double27 = timeSeries24.getMaxY();
        timeSeries24.setMaximumItemCount(1);
        timeSeries24.setNotify(false);
        int int32 = timeSeries24.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries3.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries35.getIndex(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        long long29 = timeSeries18.getMaximumItemAge();
        java.lang.String str30 = timeSeries18.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries18.removeChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj37 = timeSeries36.clone();
        timeSeries36.clear();
        java.util.List list39 = timeSeries36.getItems();
        double double40 = timeSeries36.getMaxY();
        timeSeries36.setDescription("hi!");
        java.util.Collection collection43 = timeSeries36.getTimePeriods();
        timeSeries36.setKey((java.lang.Comparable) "Time");
        java.util.List list46 = timeSeries36.getItems();
        timeSeries36.clear();
        int int48 = timeSeries36.getMaximumItemCount();
        java.util.Collection collection49 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        timeSeries18.setNotify(true);
        java.lang.Comparable comparable52 = timeSeries18.getKey();
        double double53 = timeSeries18.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (-1.0f) + "'", comparable52, (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = timeSeries3.data;
        boolean boolean13 = timeSeries3.getNotify();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries7.getTimePeriodClass();
        boolean boolean16 = timeSeries7.getNotify();
        boolean boolean17 = timeSeries7.getNotify();
        int int18 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries22.addAndOrUpdate(timeSeries26);
        java.lang.Class class28 = timeSeries22.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries22.addPropertyChangeListener(propertyChangeListener29);
        long long31 = timeSeries22.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener32);
        double double34 = timeSeries22.getMaxY();
        timeSeries22.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries7.addAndOrUpdate(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod4, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        timeSeries15.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries15.getRawDataItem(regularTimePeriod45);
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        java.lang.Object obj16 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "Time");
        java.lang.Comparable comparable21 = timeSeries20.getKey();
        java.util.Collection collection22 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries7.removeChangeListener(seriesChangeListener23);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 1.0d + "'", comparable21, 1.0d);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Overwritten values from: -1.0");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        double double12 = timeSeries3.getMaxY();
        timeSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries3.addOrUpdate(regularTimePeriod19, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(false);
        int int14 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries32.removeChangeListener(seriesChangeListener38);
        timeSeries32.setDomainDescription("");
        int int42 = timeSeries32.getItemCount();
        java.lang.Class class43 = timeSeries32.timePeriodClass;
        double double44 = timeSeries32.getMinY();
        java.util.Collection collection45 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries3.removeChangeListener(seriesChangeListener46);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(class43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        timeSeries42.setKey((java.lang.Comparable) ' ');
        java.lang.Object obj46 = timeSeries42.clone();
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
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        int int17 = timeSeries3.getItemCount();
        boolean boolean18 = timeSeries3.isEmpty();
        long long19 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        double double15 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries3.addChangeListener(seriesChangeListener13);
        boolean boolean15 = timeSeries3.isEmpty();
        int int16 = timeSeries3.getMaximumItemCount();
        java.util.List list17 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.String str29 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        timeSeries33.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries33.removeChangeListener(seriesChangeListener41);
        boolean boolean43 = timeSeries33.getNotify();
        java.lang.Object obj44 = timeSeries33.clone();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries33.createCopy((int) (short) 0, (int) ' ');
        long long48 = timeSeries33.getMaximumItemAge();
        boolean boolean49 = timeSeries3.equals((java.lang.Object) timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 9223372036854775807L + "'", long48 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        java.util.List list68 = timeSeries7.data;
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
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        double double15 = timeSeries3.getMaxY();
        timeSeries3.clear();
        timeSeries3.removeAgedItems((long) (byte) 1, false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setRangeDescription("");
        java.util.List list15 = timeSeries3.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod16, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        timeSeries59.setRangeDescription("Time");
        timeSeries59.setMaximumItemAge(9223372036854775807L);
        double double64 = timeSeries59.getMaxY();
        java.util.Collection collection65 = timeSeries59.getTimePeriods();
        double double66 = timeSeries59.getMinY();
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
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries29.setNotify(false);
        java.lang.Comparable comparable32 = timeSeries29.getKey();
        java.lang.String str33 = timeSeries29.getRangeDescription();
        java.lang.Comparable comparable34 = timeSeries29.getKey();
        timeSeries29.setMaximumItemAge((long) (byte) 10);
        java.lang.Class<?> wildcardClass37 = timeSeries29.getClass();
        timeSeries3.timePeriodClass = wildcardClass37;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod39, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (-1.0f) + "'", comparable34, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        timeSeries7.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        boolean boolean51 = timeSeries7.getNotify();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries59.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener65);
        int int67 = timeSeries59.getMaximumItemCount();
        boolean boolean68 = timeSeries55.equals((java.lang.Object) timeSeries59);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries7.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1);
        timeSeries71.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries82 = timeSeries77.addAndOrUpdate(timeSeries81);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener83 = null;
        timeSeries77.removeChangeListener(seriesChangeListener83);
        timeSeries77.fireSeriesChanged();
        boolean boolean86 = timeSeries71.equals((java.lang.Object) timeSeries77);
        org.jfree.data.time.TimeSeries timeSeries87 = timeSeries55.addAndOrUpdate(timeSeries71);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(timeSeries82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(timeSeries87);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int44 = timeSeries41.getItemCount();
        java.lang.Comparable comparable45 = timeSeries41.getKey();
        timeSeries41.setMaximumItemCount(2147483647);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + "Overwritten values from: -1.0" + "'", comparable45, "Overwritten values from: -1.0");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries17.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "hi!");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries7.addAndOrUpdate(timeSeries14);
        java.lang.String str16 = timeSeries14.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries14.addOrUpdate(regularTimePeriod17, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        java.util.Collection collection11 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries3.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        timeSeries24.setNotify(false);
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        boolean boolean26 = timeSeries24.getNotify();
        timeSeries24.setDomainDescription("hi!");
        boolean boolean29 = timeSeries24.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        timeSeries18.setDescription("hi!");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        timeSeries3.setDescription("Time");
        timeSeries3.fireSeriesChanged();
        timeSeries3.setDescription("");
        double double23 = timeSeries3.getMinY();
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        timeSeries15.setMaximumItemAge((long) '4');
        java.lang.String str31 = timeSeries15.getDescription();
        int int32 = timeSeries15.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        double double15 = timeSeries3.getMinY();
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        java.util.List list17 = timeSeries3.data;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        java.lang.Comparable comparable13 = timeSeries3.getKey();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        timeSeries18.removeAgedItems(false);
        java.lang.String str26 = timeSeries18.getDomainDescription();
        java.lang.Object obj27 = timeSeries18.clone();
        timeSeries18.clear();
        java.lang.Class class29 = timeSeries18.getTimePeriodClass();
        java.util.List list30 = timeSeries18.data;
        boolean boolean31 = timeSeries18.isEmpty();
        boolean boolean32 = timeSeries3.equals((java.lang.Object) timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0f) + "'", comparable13, (-1.0f));
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (-1.0f) + "'", comparable14, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.String str10 = timeSeries7.getDescription();
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.removeChangeListener(seriesChangeListener12);
        timeSeries7.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(class11);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        double double5 = timeSeries1.getMaxY();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        boolean boolean7 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 1 + "'", comparable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        timeSeries3.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = timeSeries3.getValue(regularTimePeriod29);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setRangeDescription("Time");
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
        java.util.List list37 = timeSeries30.data;
        timeSeries3.data = list37;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        double double25 = timeSeries3.getMaxY();
        timeSeries3.setRangeDescription("Overwritten values from: -1.0");
        timeSeries3.removeAgedItems(false);
        java.util.List list30 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries3.removeChangeListener(seriesChangeListener31);
        timeSeries3.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = timeSeries3.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries13.removeAgedItems(false);
        java.lang.String str21 = timeSeries13.getDomainDescription();
        java.lang.Object obj22 = timeSeries13.clone();
        timeSeries13.clear();
        timeSeries13.removeAgedItems((long) 1, false);
        boolean boolean27 = timeSeries3.equals((java.lang.Object) timeSeries13);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        java.lang.String str17 = timeSeries3.getRangeDescription();
        timeSeries3.removeAgedItems(false);
        timeSeries3.clear();
        java.util.List list21 = timeSeries3.data;
        java.lang.String str22 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        timeSeries7.setDescription("");
        timeSeries7.clear();
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.util.List list10 = timeSeries3.data;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setDomainDescription("Time");
        java.util.List list15 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        boolean boolean15 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (java.lang.Number) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries7.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries18.addAndOrUpdate(timeSeries29);
        java.util.Collection collection37 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener38);
        java.util.Collection collection40 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        double double41 = timeSeries29.getMinY();
        timeSeries29.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        java.lang.String str30 = timeSeries15.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries15.getDataItem(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        java.util.List list2 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (double) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        int int31 = timeSeries7.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod32, (double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj17 = timeSeries16.clone();
        timeSeries16.clear();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries22.addAndOrUpdate(timeSeries26);
        timeSeries22.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries22.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries16.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries36.addAndOrUpdate(timeSeries40);
        boolean boolean42 = timeSeries40.getNotify();
        double double43 = timeSeries40.getMaxY();
        int int44 = timeSeries40.getItemCount();
        timeSeries40.removeAgedItems((long) (short) 0, false);
        java.util.List list48 = timeSeries40.data;
        timeSeries22.data = list48;
        timeSeries22.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries55.addAndOrUpdate(timeSeries59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries59.addPropertyChangeListener(propertyChangeListener61);
        timeSeries59.setKey((java.lang.Comparable) 10L);
        long long65 = timeSeries59.getMaximumItemAge();
        java.lang.Class<?> wildcardClass66 = timeSeries59.getClass();
        timeSeries22.timePeriodClass = wildcardClass66;
        timeSeries7.timePeriodClass = wildcardClass66;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 9223372036854775807L + "'", long65 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.lang.Object obj36 = null;
        boolean boolean37 = timeSeries3.equals(obj36);
        timeSeries3.setDomainDescription("Value");
        timeSeries3.setKey((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries3.getTimePeriodClass();
        java.lang.Object obj19 = timeSeries3.clone();
        timeSeries3.setNotify(true);
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (-1.0f) + "'", comparable15, (-1.0f));
        org.junit.Assert.assertNull(class18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        timeSeries3.removeAgedItems(false);
        timeSeries3.clear();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "", "hi!");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries7.addAndOrUpdate(timeSeries14);
        timeSeries15.removeAgedItems(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        int int65 = timeSeries3.getItemCount();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries3.addChangeListener(seriesChangeListener66);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener68);
        java.lang.String str70 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries73 = timeSeries3.createCopy(regularTimePeriod71, regularTimePeriod72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        timeSeries3.fireSeriesChanged();
        timeSeries3.setMaximumItemAge((long) (short) 1);
        java.lang.String str30 = timeSeries3.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        timeSeries7.setMaximumItemAge((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDescription("Value");
        java.lang.String str13 = timeSeries3.getDomainDescription();
        timeSeries3.setMaximumItemAge((long) 'a');
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        boolean boolean15 = timeSeries3.isEmpty();
        timeSeries3.removeAgedItems((long) (short) 100, false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        timeSeries3.setMaximumItemAge((long) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        int int7 = timeSeries3.getMaximumItemCount();
        java.util.List list8 = timeSeries3.data;
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.fireSeriesChanged();
        boolean boolean9 = timeSeries3.getNotify();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries3.addChangeListener(seriesChangeListener12);
        timeSeries3.setDescription("Time");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
            timeSeries14.add(timeSeriesDataItem25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = timeSeries3.getKey();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries3.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (-1.0f) + "'", comparable15, (-1.0f));
        org.junit.Assert.assertNull(class18);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "Overwritten values from: -1.0");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener13);
        timeSeries11.setKey((java.lang.Comparable) 10L);
        long long17 = timeSeries11.getMaximumItemAge();
        java.lang.Class<?> wildcardClass18 = timeSeries11.getClass();
        timeSeries3.timePeriodClass = wildcardClass18;
        double double20 = timeSeries3.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.util.List list10 = timeSeries3.data;
        java.lang.String str11 = timeSeries3.getDescription();
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries3.removeChangeListener(seriesChangeListener6);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        double double24 = timeSeries22.getMaxY();
        timeSeries22.setNotify(false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) 'a');
        timeSeries7.removeAgedItems((long) (-1), true);
        java.lang.String str15 = timeSeries7.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener21);
        timeSeries19.setKey((java.lang.Comparable) 10L);
        java.util.List list25 = timeSeries19.getItems();
        timeSeries3.data = list25;
        java.util.List list27 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        timeSeries15.setDomainDescription("Value");
        java.lang.String str32 = timeSeries15.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        double double15 = timeSeries7.getMaxY();
        java.lang.String str16 = timeSeries7.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries7.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        timeSeries3.setDescription("Value");
        java.lang.String str13 = timeSeries3.getDomainDescription();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (-1.0f) + "'", comparable14, (-1.0f));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.String str12 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        boolean boolean29 = timeSeries16.getNotify();
        boolean boolean30 = timeSeries3.equals((java.lang.Object) boolean29);
        java.lang.Comparable comparable31 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries18.setNotify(false);
        java.lang.Comparable comparable21 = timeSeries18.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        java.util.Collection collection31 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.lang.String str32 = timeSeries18.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries3.addAndOrUpdate(timeSeries18);
        double double34 = timeSeries3.getMaxY();
        timeSeries3.setMaximumItemCount(2147483647);
        timeSeries3.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod39, (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0f) + "'", comparable21, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        timeSeries9.setMaximumItemCount((int) '#');
        timeSeries9.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener41);
        java.util.List list43 = timeSeries9.getItems();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        timeSeries1.setRangeDescription("Overwritten values from: -1.0");
        timeSeries1.setRangeDescription("Overwritten values from: -1.0");
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries25.setDomainDescription("Value");
        boolean boolean28 = timeSeries3.equals((java.lang.Object) "Value");
        java.util.List list29 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries3.createCopy((int) (short) 100, 2147483647);
        double double33 = timeSeries32.getMinY();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.removeChangeListener(seriesChangeListener34);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod15, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        long long11 = timeSeries3.getMaximumItemAge();
        int int12 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        int int17 = timeSeries3.getItemCount();
        boolean boolean18 = timeSeries3.isEmpty();
        timeSeries3.removeAgedItems(true);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.setMaximumItemAge((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getRawDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
            timeSeries18.update((int) (byte) -1, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean38 = timeSeries36.getNotify();
        double double39 = timeSeries36.getMaxY();
        int int40 = timeSeries36.getItemCount();
        double double41 = timeSeries36.getMinY();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries45.addAndOrUpdate(timeSeries49);
        boolean boolean51 = timeSeries49.getNotify();
        double double52 = timeSeries49.getMaxY();
        int int53 = timeSeries49.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries57.setNotify(false);
        java.lang.Comparable comparable60 = timeSeries57.getKey();
        java.lang.Class<?> wildcardClass61 = comparable60.getClass();
        timeSeries49.timePeriodClass = wildcardClass61;
        timeSeries36.timePeriodClass = wildcardClass61;
        timeSeries28.timePeriodClass = wildcardClass61;
        double double65 = timeSeries28.getMinY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries3.addAndOrUpdate(timeSeries28);
        java.lang.Class class67 = timeSeries66.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem69 = timeSeries66.getRawDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + (-1.0f) + "'", comparable60, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNull(class67);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        timeSeries3.fireSeriesChanged();
        long long24 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener21);
        java.lang.Object obj23 = timeSeries19.clone();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        java.lang.Class class33 = timeSeries27.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries27.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        timeSeries39.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries39.removeChangeListener(seriesChangeListener47);
        timeSeries39.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection52 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries19.addAndOrUpdate(timeSeries27);
        long long54 = timeSeries19.getMaximumItemAge();
        java.lang.String str55 = timeSeries19.getDescription();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.lang.Class<?> wildcardClass60 = timeSeries57.getClass();
        timeSeries19.timePeriodClass = wildcardClass60;
        java.util.Collection collection62 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.setMaximumItemCount((int) (short) 100);
        timeSeries19.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries68 = timeSeries19.createCopy(regularTimePeriod66, regularTimePeriod67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNull(class33);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9223372036854775807L + "'", long54 == 9223372036854775807L);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries20.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries20.removeChangeListener(seriesChangeListener28);
        timeSeries20.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection33 = timeSeries20.getTimePeriods();
        timeSeries20.setRangeDescription("hi!");
        int int36 = timeSeries20.getMaximumItemCount();
        java.util.Collection collection37 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries20.setMaximumItemAge((long) 100);
        java.lang.Comparable comparable40 = timeSeries20.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (-1.0f) + "'", comparable40, (-1.0f));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries3.getDataItem(regularTimePeriod39);
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) 'a', (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        int int2 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("");
        java.util.Collection collection20 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries7.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        double double23 = timeSeries3.getMinY();
        double double24 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.String str32 = timeSeries28.getRangeDescription();
        java.lang.Comparable comparable33 = timeSeries28.getKey();
        java.lang.String str34 = timeSeries28.getDescription();
        java.lang.Comparable comparable35 = timeSeries28.getKey();
        timeSeries28.setDescription("Time");
        java.util.Collection collection38 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete((int) (short) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (-1.0f) + "'", comparable33, (-1.0f));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (-1.0f) + "'", comparable35, (-1.0f));
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        java.lang.Class class17 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries3.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(class17);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Overwritten values from: -1.0", "Time");
        org.jfree.data.event.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        java.lang.String str45 = timeSeries42.getDomainDescription();
        int int46 = timeSeries42.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = timeSeries42.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj8 = timeSeries7.clone();
        timeSeries7.clear();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        timeSeries13.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries13.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries7.addAndOrUpdate(timeSeries13);
        int int24 = timeSeries13.getMaximumItemCount();
        timeSeries13.removeAgedItems(false);
        boolean boolean27 = timeSeries3.equals((java.lang.Object) timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries7.addChangeListener(seriesChangeListener14);
        timeSeries7.setRangeDescription("Value");
        double double18 = timeSeries7.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        timeSeries3.setKey((java.lang.Comparable) 1.0d);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        timeSeries30.clear();
        timeSeries30.fireSeriesChanged();
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        boolean boolean27 = timeSeries18.getNotify();
        timeSeries18.removeAgedItems((long) 0, false);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        timeSeries25.setDomainDescription("Value");
        boolean boolean28 = timeSeries3.equals((java.lang.Object) "Value");
        java.lang.Object obj29 = timeSeries3.clone();
        timeSeries3.setDescription("");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "");
        timeSeries3.setKey((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        boolean boolean38 = timeSeries36.getNotify();
        double double39 = timeSeries36.getMaxY();
        int int40 = timeSeries36.getItemCount();
        double double41 = timeSeries36.getMinY();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries45.addAndOrUpdate(timeSeries49);
        boolean boolean51 = timeSeries49.getNotify();
        double double52 = timeSeries49.getMaxY();
        int int53 = timeSeries49.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries57.setNotify(false);
        java.lang.Comparable comparable60 = timeSeries57.getKey();
        java.lang.Class<?> wildcardClass61 = comparable60.getClass();
        timeSeries49.timePeriodClass = wildcardClass61;
        timeSeries36.timePeriodClass = wildcardClass61;
        timeSeries28.timePeriodClass = wildcardClass61;
        double double65 = timeSeries28.getMinY();
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries3.addAndOrUpdate(timeSeries28);
        java.lang.Comparable comparable67 = timeSeries28.getKey();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(timeSeries50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + (-1.0f) + "'", comparable60, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertEquals("'" + comparable67 + "' != '" + (byte) 1 + "'", comparable67, (byte) 1);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        timeSeries3.removeAgedItems((long) ' ', true);
        java.lang.Object obj22 = timeSeries3.clone();
        timeSeries3.setMaximumItemAge((long) 'a');
        java.lang.Comparable comparable25 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener36);
        long long38 = timeSeries29.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        java.lang.Class class48 = timeSeries42.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries52.addAndOrUpdate(timeSeries56);
        java.lang.Comparable comparable58 = timeSeries56.getKey();
        timeSeries56.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries42.addAndOrUpdate(timeSeries56);
        java.lang.String str62 = timeSeries56.getRangeDescription();
        timeSeries56.setNotify(true);
        java.lang.Comparable comparable65 = timeSeries56.getKey();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj70 = timeSeries69.clone();
        timeSeries69.clear();
        java.util.List list72 = timeSeries69.getItems();
        double double73 = timeSeries69.getMaxY();
        java.lang.Class class74 = timeSeries69.getTimePeriodClass();
        java.lang.Class<?> wildcardClass75 = timeSeries69.getClass();
        timeSeries56.timePeriodClass = wildcardClass75;
        timeSeries29.timePeriodClass = wildcardClass75;
        timeSeries3.timePeriodClass = wildcardClass75;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Value" + "'", comparable25, "Value");
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNull(class48);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (-1.0f) + "'", comparable58, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + comparable65 + "' != '" + (short) 0 + "'", comparable65, (short) 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNull(class74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        timeSeries24.removeAgedItems(true);
        java.lang.Class class28 = timeSeries24.getTimePeriodClass();
        timeSeries24.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries24.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(class28);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        java.util.List list43 = timeSeries15.getItems();
        double double44 = timeSeries15.getMaxY();
        java.lang.Class class45 = timeSeries15.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNull(class45);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Class<?> wildcardClass42 = timeSeries3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        timeSeries7.setDomainDescription("Time");
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        timeSeries7.removeAgedItems((long) (short) -1, false);
        long long20 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries7.getDataItem(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.util.List list25 = timeSeries3.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        java.lang.Comparable comparable45 = timeSeries43.getKey();
        timeSeries43.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries29.addAndOrUpdate(timeSeries43);
        java.lang.String str49 = timeSeries43.getRangeDescription();
        java.util.List list50 = timeSeries43.data;
        java.lang.Class<?> wildcardClass51 = list50.getClass();
        timeSeries3.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + (-1.0f) + "'", comparable45, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.util.Collection collection35 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener36);
        long long38 = timeSeries29.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        timeSeries42.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries42.removeChangeListener(seriesChangeListener50);
        timeSeries42.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass55 = timeSeries42.getClass();
        timeSeries29.timePeriodClass = wildcardClass55;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries60.addAndOrUpdate(timeSeries64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries64.addPropertyChangeListener(propertyChangeListener66);
        java.lang.Object obj68 = timeSeries64.clone();
        java.util.List list69 = timeSeries64.data;
        timeSeries29.data = list69;
        java.lang.String str71 = timeSeries29.getDescription();
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries75.addAndOrUpdate(timeSeries79);
        java.lang.Class class81 = timeSeries75.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener82 = null;
        timeSeries75.removeChangeListener(seriesChangeListener82);
        java.util.List list84 = timeSeries75.data;
        org.jfree.data.time.TimeSeries timeSeries85 = timeSeries29.addAndOrUpdate(timeSeries75);
        org.jfree.data.time.TimeSeries timeSeries87 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        java.util.List list88 = timeSeries87.getItems();
        java.util.Collection collection89 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries87);
        long long90 = timeSeries29.getMaximumItemAge();
        java.lang.Class class91 = timeSeries29.timePeriodClass;
        timeSeries24.timePeriodClass = class91;
        java.util.List list93 = timeSeries24.data;
        timeSeries24.setNotify(true);
        java.lang.Object obj96 = timeSeries24.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNull(class81);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(timeSeries85);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 9223372036854775807L + "'", long90 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class91);
        org.junit.Assert.assertNotNull(list93);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        java.lang.String str7 = timeSeries3.getDomainDescription();
        timeSeries3.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        java.lang.Comparable comparable18 = timeSeries16.getKey();
        timeSeries16.setKey((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener21);
        double double23 = timeSeries16.getMinY();
        java.util.Collection collection24 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.createCopy(regularTimePeriod25, regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj29 = timeSeries28.clone();
        timeSeries28.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        boolean boolean40 = timeSeries38.getNotify();
        double double41 = timeSeries38.getMaxY();
        int int42 = timeSeries38.getItemCount();
        java.util.Collection collection43 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries17.addAndOrUpdate(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.isEmpty();
        timeSeries7.setMaximumItemCount(10);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        boolean boolean49 = timeSeries24.isEmpty();
        java.lang.String str50 = timeSeries24.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries24.addChangeListener(seriesChangeListener51);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        timeSeries3.setMaximumItemAge((long) 1);
        double double14 = timeSeries3.getMaxY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        java.lang.Class class35 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries18.addAndOrUpdate(timeSeries29);
        java.util.Collection collection37 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener38);
        java.util.Collection collection40 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries44.addAndOrUpdate(timeSeries48);
        timeSeries44.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries44.removeChangeListener(seriesChangeListener52);
        boolean boolean54 = timeSeries44.getNotify();
        java.lang.Object obj55 = timeSeries44.clone();
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries44.addPropertyChangeListener(propertyChangeListener56);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries61.addAndOrUpdate(timeSeries65);
        timeSeries66.setDomainDescription("Value");
        boolean boolean69 = timeSeries44.equals((java.lang.Object) "Value");
        java.util.List list70 = timeSeries44.getItems();
        timeSeries3.data = list70;
        java.lang.Class class72 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem74 = timeSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNull(class35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNull(class72);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "Time", "hi!");
        int int4 = timeSeries3.getMaximumItemCount();
        java.util.Collection collection5 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries18.setNotify(false);
        java.lang.Comparable comparable21 = timeSeries18.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        java.util.Collection collection31 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.lang.String str32 = timeSeries18.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries3.addAndOrUpdate(timeSeries18);
        double double34 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.addAndOrUpdate(timeSeries42);
        java.lang.Class class44 = timeSeries38.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries48.addAndOrUpdate(timeSeries52);
        java.lang.Comparable comparable54 = timeSeries52.getKey();
        timeSeries52.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries38.addAndOrUpdate(timeSeries52);
        java.lang.String str58 = timeSeries52.getRangeDescription();
        timeSeries52.setNotify(true);
        java.lang.Comparable comparable61 = timeSeries52.getKey();
        boolean boolean62 = timeSeries3.equals((java.lang.Object) timeSeries52);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj67 = timeSeries66.clone();
        int int68 = timeSeries66.getMaximumItemCount();
        java.util.Collection collection69 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries66);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0f) + "'", comparable21, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNull(class44);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + (-1.0f) + "'", comparable54, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + comparable61 + "' != '" + (short) 0 + "'", comparable61, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(collection69);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        timeSeries7.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.addAndOrUpdate(timeSeries28);
        timeSeries24.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.addAndOrUpdate(timeSeries39);
        java.lang.Class class41 = timeSeries35.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries24.addAndOrUpdate(timeSeries35);
        java.util.Collection collection43 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        timeSeries20.removeAgedItems(false);
        timeSeries20.setRangeDescription("Overwritten values from: -1.0");
        timeSeries20.removeAgedItems((long) (-1), false);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries15.addAndOrUpdate(timeSeries20);
        java.lang.String str52 = timeSeries20.getDomainDescription();
        timeSeries20.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(class41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        timeSeries18.setRangeDescription("Time");
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        timeSeries18.clear();
        java.lang.Object obj28 = timeSeries18.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        java.lang.Class<?> wildcardClass15 = timeSeries7.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        java.util.Collection collection13 = timeSeries3.getTimePeriods();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        long long11 = timeSeries3.getMaximumItemAge();
        java.lang.Class class12 = timeSeries3.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(class12);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj29 = timeSeries28.clone();
        timeSeries28.clear();
        java.util.List list31 = timeSeries28.getItems();
        double double32 = timeSeries28.getMaxY();
        timeSeries28.setDescription("hi!");
        java.lang.Comparable comparable35 = timeSeries28.getKey();
        timeSeries28.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries3.addAndOrUpdate(timeSeries28);
        timeSeries28.setRangeDescription("Overwritten values from: -1.0");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (-1.0f) + "'", comparable35, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        java.util.Collection collection17 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) 0);
        int int20 = timeSeries3.getMaximumItemCount();
        int int21 = timeSeries3.getItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#');
        java.lang.String str2 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }
}

