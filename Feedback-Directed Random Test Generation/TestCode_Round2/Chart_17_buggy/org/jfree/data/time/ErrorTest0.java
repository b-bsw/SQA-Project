package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.lang.Class class20 = timeSeries18.getTimePeriodClass();
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.lang.Class class26 = null;
        timeSeries25.timePeriodClass = class26;
        timeSeries25.removeAgedItems(false);
        java.lang.Class<?> wildcardClass30 = timeSeries25.getClass();
        timeSeries18.timePeriodClass = wildcardClass30;
        timeSeries14.timePeriodClass = wildcardClass30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries14", timeSeries4.equals(timeSeries14) ? timeSeries4.hashCode() == timeSeries14.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        java.lang.Class class12 = timeSeries9.getTimePeriodClass();
        java.lang.Class<?> wildcardClass13 = timeSeries9.getClass();
        timeSeries4.timePeriodClass = wildcardClass13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries9", timeSeries4.equals(timeSeries9) ? timeSeries4.hashCode() == timeSeries9.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.Class class35 = null;
        timeSeries34.timePeriodClass = class35;
        timeSeries34.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries34.addChangeListener(seriesChangeListener39);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class44);
        java.lang.Class class46 = null;
        timeSeries45.timePeriodClass = class46;
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries45.removePropertyChangeListener(propertyChangeListener48);
        timeSeries45.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass52 = timeSeries45.getClass();
        timeSeries34.timePeriodClass = wildcardClass52;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass52);
        timeSeries4.timePeriodClass = wildcardClass52;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries18", timeSeries4.equals(timeSeries18) ? timeSeries4.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries7.removeAgedItems(false);
        int int12 = timeSeries7.getMaximumItemCount();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        java.lang.String str19 = timeSeries17.getDescription();
        java.lang.Class class20 = timeSeries17.getTimePeriodClass();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class25);
        java.lang.Class class27 = null;
        timeSeries26.timePeriodClass = class27;
        timeSeries26.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries26.addChangeListener(seriesChangeListener31);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class36);
        java.lang.Class class38 = null;
        timeSeries37.timePeriodClass = class38;
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener40);
        timeSeries37.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass44 = timeSeries37.getClass();
        timeSeries26.timePeriodClass = wildcardClass44;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass44);
        timeSeries17.timePeriodClass = wildcardClass44;
        timeSeries7.timePeriodClass = wildcardClass44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries7", timeSeries2.equals(timeSeries7) ? timeSeries2.hashCode() == timeSeries7.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.Class class41 = timeSeries39.getTimePeriodClass();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class45);
        java.lang.Class class47 = null;
        timeSeries46.timePeriodClass = class47;
        timeSeries46.removeAgedItems(false);
        java.lang.Class<?> wildcardClass51 = timeSeries46.getClass();
        timeSeries39.timePeriodClass = wildcardClass51;
        timeSeries35.timePeriodClass = wildcardClass51;
        timeSeries8.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries8", timeSeries2.equals(timeSeries8) ? timeSeries2.hashCode() == timeSeries8.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.util.Collection collection15 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries17.setMaximumItemCount((int) (byte) 100);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        java.lang.String str26 = timeSeries24.getDescription();
        java.lang.Class class27 = timeSeries24.getTimePeriodClass();
        java.lang.Class<?> wildcardClass28 = timeSeries24.getClass();
        timeSeries17.timePeriodClass = wildcardClass28;
        timeSeries14.timePeriodClass = wildcardClass28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries14", timeSeries4.equals(timeSeries14) ? timeSeries4.hashCode() == timeSeries14.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        java.lang.String str27 = timeSeries25.getRangeDescription();
        java.lang.Class<?> wildcardClass28 = timeSeries25.getClass();
        timeSeries18.timePeriodClass = wildcardClass28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries25", timeSeries18.equals(timeSeries25) ? timeSeries18.hashCode() == timeSeries25.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        int int9 = timeSeries4.getMaximumItemCount();
        int int10 = timeSeries4.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.addChangeListener(seriesChangeListener11);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        java.lang.String str19 = timeSeries17.getDescription();
        java.lang.Class class20 = timeSeries17.getTimePeriodClass();
        java.lang.Class<?> wildcardClass21 = timeSeries17.getClass();
        timeSeries4.timePeriodClass = wildcardClass21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries17", timeSeries4.equals(timeSeries17) ? timeSeries4.hashCode() == timeSeries17.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        int int31 = timeSeries29.getMaximumItemCount();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.util.List list37 = timeSeries36.getItems();
        timeSeries29.data = list37;
        java.lang.Class<?> wildcardClass39 = list37.getClass();
        timeSeries4.timePeriodClass = wildcardClass39;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries29", timeSeries4.equals(timeSeries29) ? timeSeries4.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        java.lang.String str8 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        timeSeries12.setMaximumItemCount(100);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries12.addAndOrUpdate(timeSeries18);
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
        timeSeries18.timePeriodClass = wildcardClass34;
        timeSeries9.timePeriodClass = wildcardClass34;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries18", timeSeries2.equals(timeSeries18) ? timeSeries2.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        java.lang.String str17 = timeSeries15.getDescription();
        boolean boolean19 = timeSeries15.equals((java.lang.Object) 10);
        int int20 = timeSeries15.getMaximumItemCount();
        java.lang.String str21 = timeSeries15.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries15.createCopy(1, (int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries4.addAndOrUpdate(timeSeries15);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries29.addAndOrUpdate(timeSeries35);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.Class class41 = timeSeries39.getTimePeriodClass();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class45);
        java.lang.Class class47 = null;
        timeSeries46.timePeriodClass = class47;
        timeSeries46.removeAgedItems(false);
        java.lang.Class<?> wildcardClass51 = timeSeries46.getClass();
        timeSeries39.timePeriodClass = wildcardClass51;
        timeSeries35.timePeriodClass = wildcardClass51;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass51);
        timeSeries15.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries15", timeSeries4.equals(timeSeries15) ? timeSeries4.hashCode() == timeSeries15.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class6);
        java.lang.Class class8 = null;
        timeSeries7.timePeriodClass = class8;
        timeSeries7.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.addChangeListener(seriesChangeListener12);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.Class class19 = null;
        timeSeries18.timePeriodClass = class19;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener21);
        timeSeries18.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass25 = timeSeries18.getClass();
        timeSeries7.timePeriodClass = wildcardClass25;
        java.lang.Class class27 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", class27);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class32);
        java.lang.Class class34 = null;
        timeSeries33.timePeriodClass = class34;
        boolean boolean36 = timeSeries28.equals((java.lang.Object) class34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries7 and timeSeries33", timeSeries7.equals(timeSeries33) ? timeSeries7.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries9.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        timeSeries17.removeAgedItems(true);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        timeSeries22.removeAgedItems(true);
        boolean boolean27 = timeSeries22.getNotify();
        java.lang.Class<?> wildcardClass28 = timeSeries22.getClass();
        timeSeries4.timePeriodClass = wildcardClass28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries17", timeSeries9.equals(timeSeries17) ? timeSeries9.hashCode() == timeSeries17.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class30);
        timeSeries31.removeAgedItems(true);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries31.addAndOrUpdate(timeSeries36);
        int int39 = timeSeries31.getMaximumItemCount();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        java.lang.String str46 = timeSeries44.getDescription();
        boolean boolean48 = timeSeries44.equals((java.lang.Object) 10);
        timeSeries44.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries31.addAndOrUpdate(timeSeries44);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class55);
        int int57 = timeSeries56.getMaximumItemCount();
        long long58 = timeSeries56.getMaximumItemAge();
        java.util.List list59 = timeSeries56.getItems();
        timeSeries31.data = list59;
        timeSeries28.data = list59;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries31", timeSeries9.equals(timeSeries31) ? timeSeries9.hashCode() == timeSeries31.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass45 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries47);
        timeSeries2.removeAgedItems(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries48", timeSeries9.equals(timeSeries48) ? timeSeries9.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        int int39 = timeSeries38.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class43);
        timeSeries44.removeAgedItems(true);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries44.addAndOrUpdate(timeSeries49);
        java.lang.Comparable comparable52 = timeSeries51.getKey();
        boolean boolean53 = timeSeries38.equals((java.lang.Object) comparable52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries26.addAndOrUpdate(timeSeries38);
        timeSeries26.clear();
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.Class class63 = null;
        timeSeries62.timePeriodClass = class63;
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries62.removePropertyChangeListener(propertyChangeListener65);
        timeSeries62.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass69 = timeSeries62.getClass();
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass69);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass69);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries26.addAndOrUpdate(timeSeries71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries18.addAndOrUpdate(timeSeries26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries33 and timeSeries72", timeSeries33.equals(timeSeries72) ? timeSeries33.hashCode() == timeSeries72.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries9.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        timeSeries17.removeAgedItems(true);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries22);
        int int25 = timeSeries17.getMaximumItemCount();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        java.lang.String str32 = timeSeries30.getDescription();
        boolean boolean34 = timeSeries30.equals((java.lang.Object) 10);
        timeSeries30.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries17.addAndOrUpdate(timeSeries30);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class41);
        int int43 = timeSeries42.getMaximumItemCount();
        long long44 = timeSeries42.getMaximumItemAge();
        java.util.List list45 = timeSeries42.getItems();
        timeSeries17.data = list45;
        timeSeries9.data = list45;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries17", timeSeries9.equals(timeSeries17) ? timeSeries9.hashCode() == timeSeries17.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass45 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries47);
        java.lang.String str49 = timeSeries2.getRangeDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries48", timeSeries9.equals(timeSeries48) ? timeSeries9.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.addChangeListener(seriesChangeListener31);
        boolean boolean33 = timeSeries30.getNotify();
        java.lang.Class<?> wildcardClass34 = timeSeries30.getClass();
        timeSeries21.timePeriodClass = wildcardClass34;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries21", timeSeries2.equals(timeSeries21) ? timeSeries2.hashCode() == timeSeries21.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass45 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries47);
        java.lang.String str49 = timeSeries2.getDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries48", timeSeries9.equals(timeSeries48) ? timeSeries9.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries4.addChangeListener(seriesChangeListener9);
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
        timeSeries4.timePeriodClass = wildcardClass75;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries15", timeSeries4.equals(timeSeries15) ? timeSeries4.hashCode() == timeSeries15.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
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
        timeSeries25.setDescription("");
        timeSeries25.setDomainDescription("hi!");
        java.lang.Class<?> wildcardClass65 = timeSeries25.getClass();
        timeSeries4.timePeriodClass = wildcardClass65;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries15", timeSeries4.equals(timeSeries15) ? timeSeries4.hashCode() == timeSeries15.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries48.addChangeListener(seriesChangeListener49);
        boolean boolean51 = timeSeries48.getNotify();
        java.lang.Class<?> wildcardClass52 = timeSeries48.getClass();
        timeSeries29.timePeriodClass = wildcardClass52;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries29 and timeSeries43", timeSeries29.equals(timeSeries43) ? timeSeries29.hashCode() == timeSeries43.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.Class class36 = null;
        timeSeries35.timePeriodClass = class36;
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener38);
        timeSeries35.setMaximumItemCount(100);
        boolean boolean43 = timeSeries35.equals((java.lang.Object) 1.0f);
        timeSeries35.setMaximumItemCount((int) (short) 1);
        java.lang.Class class46 = timeSeries35.getTimePeriodClass();
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class50);
        java.lang.Class class52 = null;
        timeSeries51.timePeriodClass = class52;
        timeSeries51.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries51.addChangeListener(seriesChangeListener56);
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.Class class63 = null;
        timeSeries62.timePeriodClass = class63;
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries62.removePropertyChangeListener(propertyChangeListener65);
        timeSeries62.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass69 = timeSeries62.getClass();
        timeSeries51.timePeriodClass = wildcardClass69;
        timeSeries35.timePeriodClass = wildcardClass69;
        timeSeries18.timePeriodClass = wildcardClass69;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries18", timeSeries4.equals(timeSeries18) ? timeSeries4.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass45 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries48", timeSeries9.equals(timeSeries48) ? timeSeries9.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        timeSeries4.removeAgedItems(false);
        java.lang.String str28 = timeSeries4.getDomainDescription();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getDomainDescription();
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
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class54);
        java.lang.String str56 = timeSeries55.getRangeDescription();
        timeSeries55.setMaximumItemCount(100);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class60);
        java.lang.String str62 = timeSeries61.getRangeDescription();
        timeSeries61.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries55.addAndOrUpdate(timeSeries61);
        java.util.List list66 = timeSeries65.getItems();
        timeSeries51.data = list66;
        java.util.List list68 = timeSeries51.getItems();
        boolean boolean69 = timeSeries51.isEmpty();
        java.lang.Class class70 = timeSeries51.getTimePeriodClass();
        java.lang.Class<?> wildcardClass71 = timeSeries51.getClass();
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, "", "hi!", (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass71);
        timeSeries33.timePeriodClass = wildcardClass71;
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, (java.lang.Class) wildcardClass71);
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass71);
        timeSeries4.timePeriodClass = wildcardClass71;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries33", timeSeries18.equals(timeSeries33) ? timeSeries18.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        java.lang.String str23 = timeSeries21.getDescription();
        boolean boolean25 = timeSeries21.equals((java.lang.Object) 10);
        int int26 = timeSeries21.getMaximumItemCount();
        int int27 = timeSeries21.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener28);
        java.lang.String str30 = timeSeries21.getDomainDescription();
        java.lang.Class<?> wildcardClass31 = timeSeries21.getClass();
        timeSeries15.timePeriodClass = wildcardClass31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries15", timeSeries4.equals(timeSeries15) ? timeSeries4.hashCode() == timeSeries15.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class42);
        int int44 = timeSeries43.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener45);
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class50);
        java.lang.Class class52 = null;
        timeSeries51.timePeriodClass = class52;
        timeSeries51.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries51.addChangeListener(seriesChangeListener56);
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.Class class63 = null;
        timeSeries62.timePeriodClass = class63;
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries62.removePropertyChangeListener(propertyChangeListener65);
        timeSeries62.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass69 = timeSeries62.getClass();
        timeSeries51.timePeriodClass = wildcardClass69;
        java.lang.Class class71 = timeSeries51.getTimePeriodClass();
        timeSeries43.timePeriodClass = class71;
        timeSeries12.timePeriodClass = class71;
        java.lang.Class class80 = null;
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class80);
        java.lang.Class class82 = null;
        timeSeries81.timePeriodClass = class82;
        timeSeries81.removeAgedItems(false);
        java.lang.Class<?> wildcardClass86 = timeSeries81.getClass();
        org.jfree.data.time.TimeSeries timeSeries87 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "hi!", "", (java.lang.Class) wildcardClass86);
        java.util.Collection collection88 = timeSeries87.getTimePeriods();
        java.util.List list89 = timeSeries87.data;
        timeSeries12.data = list89;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries43 and timeSeries81", timeSeries43.equals(timeSeries81) ? timeSeries43.hashCode() == timeSeries81.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        int int19 = timeSeries18.getMaximumItemCount();
        long long20 = timeSeries18.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener21);
        int int23 = timeSeries18.getItemCount();
        boolean boolean24 = timeSeries4.equals((java.lang.Object) timeSeries18);
        java.util.Collection collection25 = timeSeries18.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass35 = timeSeries34.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Overwritten values from: 100", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "", "Overwritten values from: 100", (java.lang.Class) wildcardClass35);
        timeSeries18.timePeriodClass = wildcardClass35;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries18", timeSeries4.equals(timeSeries18) ? timeSeries4.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
        java.lang.Class class26 = timeSeries6.timePeriodClass;
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
        timeSeries55.setNotify(true);
        timeSeries55.removeAgedItems((long) 2147483647, false);
        timeSeries55.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries6.addAndOrUpdate(timeSeries55);
        java.lang.Class class83 = null;
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class83);
        java.lang.String str85 = timeSeries84.getRangeDescription();
        timeSeries84.setNotify(false);
        java.lang.String str88 = timeSeries84.getDescription();
        boolean boolean89 = timeSeries79.equals((java.lang.Object) str88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries24 and timeSeries79", timeSeries24.equals(timeSeries79) ? timeSeries24.hashCode() == timeSeries79.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        int int6 = timeSeries4.getItemCount();
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.String str14 = timeSeries12.getDescription();
        boolean boolean16 = timeSeries12.equals((java.lang.Object) 10);
        int int17 = timeSeries12.getMaximumItemCount();
        int int18 = timeSeries12.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener19);
        java.lang.String str21 = timeSeries12.getDomainDescription();
        java.lang.Class<?> wildcardClass22 = timeSeries12.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass22);
        timeSeries4.timePeriodClass = wildcardClass22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries12", timeSeries4.equals(timeSeries12) ? timeSeries4.hashCode() == timeSeries12.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long5 = timeSeries4.getMaximumItemAge();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        java.lang.String str9 = timeSeries8.getRangeDescription();
        timeSeries8.setMaximumItemCount(100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries14);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.lang.String str22 = timeSeries20.getDescription();
        boolean boolean24 = timeSeries20.equals((java.lang.Object) 10);
        java.lang.String str25 = timeSeries20.getDomainDescription();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.util.Collection collection31 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.util.Collection collection32 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries30);
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
        java.util.List list62 = timeSeries45.getItems();
        boolean boolean63 = timeSeries45.isEmpty();
        java.lang.Class class64 = timeSeries45.getTimePeriodClass();
        java.util.Collection collection65 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        java.lang.Class<?> wildcardClass66 = timeSeries30.getClass();
        timeSeries4.timePeriodClass = wildcardClass66;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Overwritten values from: 100", (java.lang.Class) wildcardClass66);
        timeSeries68.setRangeDescription("Time");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries20 and timeSeries68", timeSeries20.equals(timeSeries68) ? timeSeries20.hashCode() == timeSeries68.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
        long long23 = timeSeries22.getMaximumItemAge();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries26.addAndOrUpdate(timeSeries32);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        java.lang.String str40 = timeSeries38.getDescription();
        boolean boolean42 = timeSeries38.equals((java.lang.Object) 10);
        java.lang.String str43 = timeSeries38.getDomainDescription();
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class47);
        java.util.Collection collection49 = timeSeries38.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        java.util.Collection collection50 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries48);
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
        boolean boolean81 = timeSeries63.isEmpty();
        java.lang.Class class82 = timeSeries63.getTimePeriodClass();
        java.util.Collection collection83 = timeSeries48.getTimePeriodsUniqueToOtherSeries(timeSeries63);
        java.lang.Class<?> wildcardClass84 = timeSeries48.getClass();
        timeSeries22.timePeriodClass = wildcardClass84;
        org.jfree.data.time.TimeSeries timeSeries86 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Overwritten values from: 100", (java.lang.Class) wildcardClass84);
        timeSeries12.timePeriodClass = wildcardClass84;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries33", timeSeries12.equals(timeSeries33) ? timeSeries12.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class51);
        java.lang.Class class53 = null;
        timeSeries52.timePeriodClass = class53;
        timeSeries52.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries52.addChangeListener(seriesChangeListener57);
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class62);
        java.lang.Class class64 = null;
        timeSeries63.timePeriodClass = class64;
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries63.removePropertyChangeListener(propertyChangeListener66);
        timeSeries63.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass70 = timeSeries63.getClass();
        timeSeries52.timePeriodClass = wildcardClass70;
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0, (java.lang.Class) wildcardClass70);
        java.lang.String str73 = timeSeries72.getRangeDescription();
        java.util.List list74 = timeSeries72.data;
        timeSeries14.data = list74;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries52", timeSeries4.equals(timeSeries52) ? timeSeries4.hashCode() == timeSeries52.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        long long31 = timeSeries8.getMaximumItemAge();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        timeSeries35.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries35.removeChangeListener(seriesChangeListener38);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.lang.Class class45 = null;
        timeSeries44.timePeriodClass = class45;
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries44.removePropertyChangeListener(propertyChangeListener47);
        timeSeries44.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass51 = timeSeries44.getClass();
        timeSeries35.timePeriodClass = wildcardClass51;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass51);
        timeSeries8.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries8", timeSeries2.equals(timeSeries8) ? timeSeries2.hashCode() == timeSeries8.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        java.util.Collection collection28 = timeSeries26.getTimePeriods();
        java.lang.Class class29 = timeSeries26.timePeriodClass;
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.Comparable comparable35 = timeSeries34.getKey();
        java.lang.String str36 = timeSeries34.getDomainDescription();
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        java.lang.String str48 = timeSeries46.getDescription();
        java.lang.Class class49 = timeSeries46.getTimePeriodClass();
        timeSeries46.setMaximumItemCount(0);
        timeSeries46.setRangeDescription("");
        java.lang.Class class54 = timeSeries46.timePeriodClass;
        java.lang.Class class57 = null;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class57);
        timeSeries58.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener61 = null;
        timeSeries58.removeChangeListener(seriesChangeListener61);
        java.lang.Class class66 = null;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class66);
        java.lang.Class class68 = null;
        timeSeries67.timePeriodClass = class68;
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        timeSeries67.removePropertyChangeListener(propertyChangeListener70);
        timeSeries67.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass74 = timeSeries67.getClass();
        timeSeries58.timePeriodClass = wildcardClass74;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass74);
        timeSeries46.timePeriodClass = wildcardClass74;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", (java.lang.Class) wildcardClass74);
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass74);
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass74);
        timeSeries34.timePeriodClass = wildcardClass74;
        timeSeries26.timePeriodClass = wildcardClass74;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries26", timeSeries12.equals(timeSeries26) ? timeSeries12.hashCode() == timeSeries26.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setNotify(true);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        java.lang.String str11 = timeSeries10.getRangeDescription();
        java.lang.Class class12 = timeSeries10.getTimePeriodClass();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.Class class18 = null;
        timeSeries17.timePeriodClass = class18;
        timeSeries17.removeAgedItems(false);
        java.lang.Class<?> wildcardClass22 = timeSeries17.getClass();
        timeSeries10.timePeriodClass = wildcardClass22;
        java.lang.Comparable comparable24 = timeSeries10.getKey();
        java.util.List list25 = timeSeries10.getItems();
        timeSeries4.data = list25;
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        java.lang.Comparable comparable33 = timeSeries32.getKey();
        java.lang.String str34 = timeSeries32.getDomainDescription();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        java.lang.String str46 = timeSeries44.getDescription();
        java.lang.Class class47 = timeSeries44.getTimePeriodClass();
        timeSeries44.setMaximumItemCount(0);
        timeSeries44.setRangeDescription("");
        java.lang.Class class52 = timeSeries44.timePeriodClass;
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class55);
        timeSeries56.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries56.removeChangeListener(seriesChangeListener59);
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class64);
        java.lang.Class class66 = null;
        timeSeries65.timePeriodClass = class66;
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries65.removePropertyChangeListener(propertyChangeListener68);
        timeSeries65.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass72 = timeSeries65.getClass();
        timeSeries56.timePeriodClass = wildcardClass72;
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass72);
        timeSeries44.timePeriodClass = wildcardClass72;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass72);
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass72);
        timeSeries32.timePeriodClass = wildcardClass72;
        org.jfree.data.time.TimeSeries timeSeries80 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass72);
        java.util.Collection collection81 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries32", timeSeries4.equals(timeSeries32) ? timeSeries4.hashCode() == timeSeries32.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.Class class13 = null;
        timeSeries12.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
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
        timeSeries20.data = list34;
        timeSeries12.data = list34;
        timeSeries4.data = list34;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries40.setMaximumItemCount((int) (byte) 100);
        timeSeries40.clear();
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class47);
        java.lang.Class class49 = null;
        timeSeries48.timePeriodClass = class49;
        timeSeries48.removeAgedItems(false);
        boolean boolean53 = timeSeries40.equals((java.lang.Object) false);
        java.lang.Class class54 = timeSeries40.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class54);
        timeSeries4.timePeriodClass = class54;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries12", timeSeries4.equals(timeSeries12) ? timeSeries4.hashCode() == timeSeries12.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class5);
        java.lang.Class class7 = null;
        timeSeries6.timePeriodClass = class7;
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener9);
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass13 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass13);
        int int15 = timeSeries14.getMaximumItemCount();
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        timeSeries18.setMaximumItemCount(100);
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries18.addAndOrUpdate(timeSeries24);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        java.lang.String str32 = timeSeries30.getDescription();
        boolean boolean34 = timeSeries30.equals((java.lang.Object) 10);
        java.lang.String str35 = timeSeries30.getDomainDescription();
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class39);
        java.util.Collection collection41 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.util.Collection collection42 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value");
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
        timeSeries44.data = list58;
        boolean boolean60 = timeSeries18.equals((java.lang.Object) timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class65);
        java.lang.String str67 = timeSeries66.getRangeDescription();
        java.lang.String str68 = timeSeries66.getDescription();
        boolean boolean70 = timeSeries66.equals((java.lang.Object) 10);
        int int71 = timeSeries66.getMaximumItemCount();
        timeSeries66.setNotify(false);
        java.lang.Class<?> wildcardClass74 = timeSeries66.getClass();
        timeSeries61.timePeriodClass = wildcardClass74;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass74);
        timeSeries76.setKey((java.lang.Comparable) "Overwritten values from: 100");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries25 and timeSeries76", timeSeries25.equals(timeSeries76) ? timeSeries25.hashCode() == timeSeries76.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.Class class39 = null;
        timeSeries38.timePeriodClass = class39;
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener41);
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass45 = timeSeries38.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries2.addAndOrUpdate(timeSeries47);
        timeSeries2.setNotify(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries48", timeSeries9.equals(timeSeries48) ? timeSeries9.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        boolean boolean19 = timeSeries2.getNotify();
        timeSeries2.setMaximumItemCount((int) (short) 100);
        timeSeries2.fireSeriesChanged();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.lang.String str29 = timeSeries27.getDescription();
        boolean boolean31 = timeSeries27.equals((java.lang.Object) 10);
        java.lang.String str32 = timeSeries27.getDomainDescription();
        java.lang.String str33 = timeSeries27.getRangeDescription();
        long long34 = timeSeries27.getMaximumItemAge();
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        java.lang.String str38 = timeSeries37.getRangeDescription();
        timeSeries37.setMaximumItemCount(100);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        timeSeries43.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries37.addAndOrUpdate(timeSeries43);
        java.util.List list48 = timeSeries47.getItems();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener49);
        java.util.Collection collection51 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        java.util.Collection collection52 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries37", timeSeries2.equals(timeSeries37) ? timeSeries2.hashCode() == timeSeries37.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        java.lang.String str33 = timeSeries12.getDescription();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount(100);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class41);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries36.addAndOrUpdate(timeSeries42);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        java.lang.Class class48 = timeSeries46.getTimePeriodClass();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class52);
        java.lang.Class class54 = null;
        timeSeries53.timePeriodClass = class54;
        timeSeries53.removeAgedItems(false);
        java.lang.Class<?> wildcardClass58 = timeSeries53.getClass();
        timeSeries46.timePeriodClass = wildcardClass58;
        timeSeries42.timePeriodClass = wildcardClass58;
        timeSeries42.clear();
        java.util.List list62 = timeSeries42.data;
        java.lang.Class<?> wildcardClass63 = timeSeries42.getClass();
        timeSeries12.timePeriodClass = wildcardClass63;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries26", timeSeries12.equals(timeSeries26) ? timeSeries12.hashCode() == timeSeries26.hashCode() : true);
    }
}

