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
        java.lang.Object obj5 = timeSeries4.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        int int14 = timeSeries13.getMaximumItemCount();
        timeSeries13.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries21);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Class<?> wildcardClass30 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass30;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass30);
        timeSeries4.timePeriodClass = wildcardClass30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj5", timeSeries4.equals(obj5) ? timeSeries4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        timeSeries4.setNotify(true);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class11);
        int int13 = timeSeries12.getMaximumItemCount();
        timeSeries12.setMaximumItemCount(100);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        boolean boolean22 = timeSeries12.equals((java.lang.Object) timeSeries20);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries25.removePropertyChangeListener(propertyChangeListener27);
        java.lang.Class<?> wildcardClass29 = timeSeries25.getClass();
        timeSeries20.timePeriodClass = wildcardClass29;
        timeSeries4.timePeriodClass = wildcardClass29;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj7", timeSeries4.equals(obj7) ? timeSeries4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        int int23 = timeSeries22.getMaximumItemCount();
        long long24 = timeSeries22.getMaximumItemAge();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        int int28 = timeSeries27.getMaximumItemCount();
        timeSeries27.setMaximumItemCount(100);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        boolean boolean37 = timeSeries27.equals((java.lang.Object) timeSeries35);
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class39);
        java.lang.String str41 = timeSeries40.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries40.removePropertyChangeListener(propertyChangeListener42);
        java.lang.Class<?> wildcardClass44 = timeSeries40.getClass();
        timeSeries35.timePeriodClass = wildcardClass44;
        timeSeries22.timePeriodClass = wildcardClass44;
        timeSeries15.timePeriodClass = wildcardClass44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries22", timeSeries4.equals(timeSeries22) ? timeSeries4.hashCode() == timeSeries22.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        java.lang.String str31 = timeSeries29.getDescription();
        boolean boolean33 = timeSeries29.equals((java.lang.Object) 10);
        java.lang.Object obj34 = timeSeries29.clone();
        java.util.Collection collection35 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        int int40 = timeSeries39.getMaximumItemCount();
        timeSeries39.setMaximumItemCount(100);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class46);
        java.lang.String str48 = timeSeries47.getRangeDescription();
        boolean boolean49 = timeSeries39.equals((java.lang.Object) timeSeries47);
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class51);
        java.lang.String str53 = timeSeries52.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        timeSeries52.removePropertyChangeListener(propertyChangeListener54);
        java.lang.Class<?> wildcardClass56 = timeSeries52.getClass();
        timeSeries47.timePeriodClass = wildcardClass56;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass56);
        java.util.Collection collection59 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries47", timeSeries4.equals(timeSeries47) ? timeSeries4.hashCode() == timeSeries47.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy(100, (int) (short) 100);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        int int14 = timeSeries13.getMaximumItemCount();
        timeSeries13.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries21);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Class<?> wildcardClass30 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass30;
        timeSeries10.timePeriodClass = wildcardClass30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries10", timeSeries4.equals(timeSeries10) ? timeSeries4.hashCode() == timeSeries10.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Class<?> wildcardClass20 = timeSeries16.getClass();
        timeSeries11.timePeriodClass = wildcardClass20;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass20);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        int int29 = timeSeries27.getMaximumItemCount();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        timeSeries34.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries27.addAndOrUpdate(timeSeries34);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener39);
        timeSeries38.removeAgedItems(false);
        java.util.Collection collection43 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries11 and timeSeries27", timeSeries11.equals(timeSeries27) ? timeSeries11.hashCode() == timeSeries27.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getItemCount();
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class7);
        int int9 = timeSeries8.getMaximumItemCount();
        long long10 = timeSeries8.getMaximumItemAge();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        int int14 = timeSeries13.getMaximumItemCount();
        timeSeries13.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries21);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Class<?> wildcardClass30 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass30;
        timeSeries8.timePeriodClass = wildcardClass30;
        timeSeries2.timePeriodClass = wildcardClass30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries26", timeSeries2.equals(timeSeries26) ? timeSeries2.hashCode() == timeSeries26.hashCode() : true);
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
        java.lang.Object obj9 = timeSeries4.clone();
        java.lang.String str10 = timeSeries4.getDescription();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        int int15 = timeSeries14.getMaximumItemCount();
        timeSeries14.setMaximumItemCount(100);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        boolean boolean24 = timeSeries14.equals((java.lang.Object) timeSeries22);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener29);
        java.lang.Class<?> wildcardClass31 = timeSeries27.getClass();
        timeSeries22.timePeriodClass = wildcardClass31;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass31);
        timeSeries4.timePeriodClass = wildcardClass31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj9", timeSeries4.equals(obj9) ? timeSeries4.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.String str7 = timeSeries4.getRangeDescription();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        int int11 = timeSeries10.getMaximumItemCount();
        timeSeries10.setMaximumItemCount(100);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        boolean boolean20 = timeSeries10.equals((java.lang.Object) timeSeries18);
        java.lang.Class<?> wildcardClass21 = timeSeries18.getClass();
        timeSeries4.timePeriodClass = wildcardClass21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries18", timeSeries4.equals(timeSeries18) ? timeSeries4.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class47);
        int int49 = timeSeries48.getMaximumItemCount();
        timeSeries48.setMaximumItemCount(100);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class55);
        java.lang.String str57 = timeSeries56.getRangeDescription();
        boolean boolean58 = timeSeries48.equals((java.lang.Object) timeSeries56);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class60);
        java.lang.String str62 = timeSeries61.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries61.removePropertyChangeListener(propertyChangeListener63);
        java.lang.Class<?> wildcardClass65 = timeSeries61.getClass();
        timeSeries56.timePeriodClass = wildcardClass65;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass65);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass65);
        timeSeries43.timePeriodClass = wildcardClass65;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries56", timeSeries4.equals(timeSeries56) ? timeSeries4.hashCode() == timeSeries56.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        int int7 = timeSeries6.getMaximumItemCount();
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        boolean boolean16 = timeSeries6.equals((java.lang.Object) timeSeries14);
        java.lang.Class<?> wildcardClass17 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass17);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        int int26 = timeSeries25.getMaximumItemCount();
        long long27 = timeSeries25.getMaximumItemAge();
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        int int31 = timeSeries30.getMaximumItemCount();
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        boolean boolean40 = timeSeries30.equals((java.lang.Object) timeSeries38);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener45);
        java.lang.Class<?> wildcardClass47 = timeSeries43.getClass();
        timeSeries38.timePeriodClass = wildcardClass47;
        timeSeries25.timePeriodClass = wildcardClass47;
        timeSeries19.timePeriodClass = wildcardClass47;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries14 and timeSeries25", timeSeries14.equals(timeSeries25) ? timeSeries14.hashCode() == timeSeries25.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        int int4 = timeSeries2.getItemCount();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        java.lang.Object obj14 = timeSeries9.clone();
        java.lang.String str15 = timeSeries9.getDescription();
        java.util.Collection collection16 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.Object obj22 = timeSeries21.clone();
        timeSeries21.setRangeDescription("hi!");
        java.util.List list25 = timeSeries21.getItems();
        timeSeries9.data = list25;
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class30);
        int int32 = timeSeries31.getMaximumItemCount();
        long long33 = timeSeries31.getMaximumItemAge();
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        int int37 = timeSeries36.getMaximumItemCount();
        timeSeries36.setMaximumItemCount(100);
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        boolean boolean46 = timeSeries36.equals((java.lang.Object) timeSeries44);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries49.removePropertyChangeListener(propertyChangeListener51);
        java.lang.Class<?> wildcardClass53 = timeSeries49.getClass();
        timeSeries44.timePeriodClass = wildcardClass53;
        timeSeries31.timePeriodClass = wildcardClass53;
        timeSeries9.timePeriodClass = wildcardClass53;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and obj14", timeSeries9.equals(obj14) ? timeSeries9.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        int int23 = timeSeries22.getMaximumItemCount();
        timeSeries22.setMaximumItemCount(100);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class29);
        java.lang.String str31 = timeSeries30.getRangeDescription();
        boolean boolean32 = timeSeries22.equals((java.lang.Object) timeSeries30);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener37);
        java.lang.Class<?> wildcardClass39 = timeSeries35.getClass();
        timeSeries30.timePeriodClass = wildcardClass39;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass39);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries42.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries15.addAndOrUpdate(timeSeries42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries30", timeSeries4.equals(timeSeries30) ? timeSeries4.hashCode() == timeSeries30.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries46.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries4.addAndOrUpdate(timeSeries46);
        timeSeries52.setRangeDescription("Time");
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class62);
        int int64 = timeSeries63.getMaximumItemCount();
        timeSeries63.setMaximumItemCount(100);
        java.lang.Class class70 = null;
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class70);
        java.lang.String str72 = timeSeries71.getRangeDescription();
        boolean boolean73 = timeSeries63.equals((java.lang.Object) timeSeries71);
        java.lang.Class class75 = null;
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class75);
        java.lang.String str77 = timeSeries76.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        timeSeries76.removePropertyChangeListener(propertyChangeListener78);
        java.lang.Class<?> wildcardClass80 = timeSeries76.getClass();
        timeSeries71.timePeriodClass = wildcardClass80;
        org.jfree.data.time.TimeSeries timeSeries82 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass80);
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "hi!", "Time", (java.lang.Class) wildcardClass80);
        timeSeries52.timePeriodClass = wildcardClass80;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries71", timeSeries4.equals(timeSeries71) ? timeSeries4.hashCode() == timeSeries71.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        int int4 = timeSeries2.getItemCount();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        java.lang.Object obj14 = timeSeries9.clone();
        java.lang.String str15 = timeSeries9.getDescription();
        java.util.Collection collection16 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        timeSeries2.fireSeriesChanged();
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener25);
        java.lang.Class<?> wildcardClass27 = timeSeries23.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "Value", (java.lang.Class) wildcardClass27);
        timeSeries2.timePeriodClass = wildcardClass27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries23", timeSeries2.equals(timeSeries23) ? timeSeries2.hashCode() == timeSeries23.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount(100);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        boolean boolean14 = timeSeries4.equals((java.lang.Object) timeSeries12);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Class<?> wildcardClass21 = timeSeries17.getClass();
        timeSeries12.timePeriodClass = wildcardClass21;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass21);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        int int28 = timeSeries27.getMaximumItemCount();
        int int29 = timeSeries27.getItemCount();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        java.lang.String str36 = timeSeries34.getDescription();
        boolean boolean38 = timeSeries34.equals((java.lang.Object) 10);
        java.lang.Object obj39 = timeSeries34.clone();
        java.lang.String str40 = timeSeries34.getDescription();
        java.util.Collection collection41 = timeSeries27.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        boolean boolean42 = timeSeries34.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries34.createCopy((int) (byte) 1, (int) '#');
        java.lang.Object obj46 = timeSeries34.clone();
        timeSeries34.fireSeriesChanged();
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class51);
        java.lang.String str53 = timeSeries52.getRangeDescription();
        java.lang.String str54 = timeSeries52.getDomainDescription();
        java.lang.Object obj55 = timeSeries52.clone();
        java.util.List list56 = timeSeries52.getItems();
        timeSeries34.data = list56;
        timeSeries24.data = list56;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries34", timeSeries12.equals(timeSeries34) ? timeSeries12.hashCode() == timeSeries34.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        timeSeries15.fireSeriesChanged();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class23);
        int int25 = timeSeries24.getMaximumItemCount();
        timeSeries24.setMaximumItemCount(100);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        boolean boolean34 = timeSeries24.equals((java.lang.Object) timeSeries32);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        java.lang.String str38 = timeSeries37.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener39);
        java.lang.Class<?> wildcardClass41 = timeSeries37.getClass();
        timeSeries32.timePeriodClass = wildcardClass41;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass41);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass41);
        timeSeries15.timePeriodClass = wildcardClass41;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries11 and timeSeries32", timeSeries11.equals(timeSeries32) ? timeSeries11.hashCode() == timeSeries32.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries4.setNotify(false);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        int int21 = timeSeries20.getMaximumItemCount();
        int int22 = timeSeries20.getItemCount();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.lang.String str29 = timeSeries27.getDescription();
        boolean boolean31 = timeSeries27.equals((java.lang.Object) 10);
        java.lang.Object obj32 = timeSeries27.clone();
        java.lang.String str33 = timeSeries27.getDescription();
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        boolean boolean35 = timeSeries27.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries27.createCopy((int) (byte) 1, (int) '#');
        java.lang.Object obj39 = timeSeries27.clone();
        timeSeries27.fireSeriesChanged();
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class44);
        java.lang.String str46 = timeSeries45.getRangeDescription();
        java.lang.String str47 = timeSeries45.getDomainDescription();
        java.lang.Object obj48 = timeSeries45.clone();
        java.util.List list49 = timeSeries45.getItems();
        timeSeries27.data = list49;
        java.lang.Class<?> wildcardClass51 = list49.getClass();
        timeSeries4.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries11", timeSeries4.equals(timeSeries11) ? timeSeries4.hashCode() == timeSeries11.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class47);
        int int49 = timeSeries48.getMaximumItemCount();
        long long50 = timeSeries48.getMaximumItemAge();
        java.lang.Class class52 = null;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class52);
        int int54 = timeSeries53.getMaximumItemCount();
        timeSeries53.setMaximumItemCount(100);
        java.lang.Class class60 = null;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class60);
        java.lang.String str62 = timeSeries61.getRangeDescription();
        boolean boolean63 = timeSeries53.equals((java.lang.Object) timeSeries61);
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class65);
        java.lang.String str67 = timeSeries66.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries66.removePropertyChangeListener(propertyChangeListener68);
        java.lang.Class<?> wildcardClass70 = timeSeries66.getClass();
        timeSeries61.timePeriodClass = wildcardClass70;
        timeSeries48.timePeriodClass = wildcardClass70;
        timeSeries43.timePeriodClass = wildcardClass70;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries48", timeSeries4.equals(timeSeries48) ? timeSeries4.hashCode() == timeSeries48.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries4.createCopy((int) (short) 0, (int) (short) 0);
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        int int20 = timeSeries19.getMaximumItemCount();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        boolean boolean29 = timeSeries19.equals((java.lang.Object) timeSeries27);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Class<?> wildcardClass36 = timeSeries32.getClass();
        timeSeries27.timePeriodClass = wildcardClass36;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass36);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass36);
        timeSeries11.timePeriodClass = wildcardClass36;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries11", timeSeries4.equals(timeSeries11) ? timeSeries4.hashCode() == timeSeries11.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        boolean boolean6 = timeSeries4.getNotify();
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        java.lang.Object obj8 = timeSeries4.clone();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.Object obj14 = timeSeries13.clone();
        timeSeries13.setRangeDescription("hi!");
        java.util.List list17 = timeSeries13.getItems();
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        int int24 = timeSeries22.getMaximumItemCount();
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        timeSeries29.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries22.addAndOrUpdate(timeSeries29);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        timeSeries36.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries36.addChangeListener(seriesChangeListener40);
        java.util.Collection collection42 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.Collection collection43 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.lang.Class<?> wildcardClass44 = collection43.getClass();
        timeSeries4.timePeriodClass = wildcardClass44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj8", timeSeries4.equals(obj8) ? timeSeries4.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        java.lang.Class class6 = null;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class6);
        int int8 = timeSeries7.getMaximumItemCount();
        timeSeries7.setMaximumItemCount(100);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        java.lang.String str16 = timeSeries15.getRangeDescription();
        boolean boolean17 = timeSeries7.equals((java.lang.Object) timeSeries15);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Class<?> wildcardClass24 = timeSeries20.getClass();
        timeSeries15.timePeriodClass = wildcardClass24;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass24);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class34);
        int int36 = timeSeries35.getMaximumItemCount();
        timeSeries35.setMaximumItemCount(100);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        boolean boolean45 = timeSeries35.equals((java.lang.Object) timeSeries43);
        java.lang.Class<?> wildcardClass46 = timeSeries43.getClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass46);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass46);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries48.addChangeListener(seriesChangeListener49);
        java.util.Collection collection51 = timeSeries48.getTimePeriods();
        int int52 = timeSeries48.getItemCount();
        java.lang.Class class53 = timeSeries48.getTimePeriodClass();
        timeSeries28.timePeriodClass = class53;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries15 and timeSeries43", timeSeries15.equals(timeSeries43) ? timeSeries15.hashCode() == timeSeries43.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDomainDescription();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        int int13 = timeSeries11.getMaximumItemCount();
        java.lang.String str14 = timeSeries11.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener16);
        int int18 = timeSeries11.getMaximumItemCount();
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        int int27 = timeSeries26.getMaximumItemCount();
        timeSeries26.setMaximumItemCount(100);
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class33);
        java.lang.String str35 = timeSeries34.getRangeDescription();
        boolean boolean36 = timeSeries26.equals((java.lang.Object) timeSeries34);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries39.removePropertyChangeListener(propertyChangeListener41);
        java.lang.Class<?> wildcardClass43 = timeSeries39.getClass();
        timeSeries34.timePeriodClass = wildcardClass43;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass43);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass43);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Time", (java.lang.Class) wildcardClass43);
        timeSeries47.setNotify(true);
        boolean boolean50 = timeSeries11.equals((java.lang.Object) timeSeries47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries34", timeSeries4.equals(timeSeries34) ? timeSeries4.hashCode() == timeSeries34.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Class class5 = null;
        timeSeries4.timePeriodClass = class5;
        timeSeries4.clear();
        int int8 = timeSeries4.getMaximumItemCount();
        java.lang.Class class9 = timeSeries4.getTimePeriodClass();
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        timeSeries14.setNotify(false);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        java.lang.String str24 = timeSeries22.getDescription();
        boolean boolean26 = timeSeries22.equals((java.lang.Object) 10);
        boolean boolean27 = timeSeries14.equals((java.lang.Object) boolean26);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries4.addAndOrUpdate(timeSeries14);
        boolean boolean29 = timeSeries14.getNotify();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        int int33 = timeSeries32.getMaximumItemCount();
        int int34 = timeSeries32.getItemCount();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.String str41 = timeSeries39.getDescription();
        boolean boolean43 = timeSeries39.equals((java.lang.Object) 10);
        java.lang.Object obj44 = timeSeries39.clone();
        java.lang.String str45 = timeSeries39.getDescription();
        java.util.Collection collection46 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        boolean boolean47 = timeSeries39.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries39.createCopy((int) (byte) 1, (int) '#');
        java.lang.Object obj51 = timeSeries39.clone();
        java.lang.Class<?> wildcardClass52 = timeSeries39.getClass();
        timeSeries14.timePeriodClass = wildcardClass52;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries14", timeSeries4.equals(timeSeries14) ? timeSeries4.hashCode() == timeSeries14.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries46.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries4.addAndOrUpdate(timeSeries46);
        long long53 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries4.addAndOrUpdate(timeSeries55);
        java.lang.Class class57 = timeSeries55.timePeriodClass;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries15 and timeSeries56", timeSeries15.equals(timeSeries56) ? timeSeries15.hashCode() == timeSeries56.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener7);
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "Time", "Value", (java.lang.Class) wildcardClass9);
        timeSeries10.setDescription("Value");
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        int int16 = timeSeries15.getMaximumItemCount();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries23);
        timeSeries15.setRangeDescription("hi!");
        timeSeries15.setKey((java.lang.Comparable) 1.0f);
        java.util.List list30 = timeSeries15.getItems();
        boolean boolean31 = timeSeries10.equals((java.lang.Object) timeSeries15);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        int int38 = timeSeries37.getMaximumItemCount();
        timeSeries37.setMaximumItemCount(100);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class44);
        java.lang.String str46 = timeSeries45.getRangeDescription();
        boolean boolean47 = timeSeries37.equals((java.lang.Object) timeSeries45);
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener52);
        java.lang.Class<?> wildcardClass54 = timeSeries50.getClass();
        timeSeries45.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass54);
        timeSeries56.setMaximumItemCount(100);
        java.lang.String str59 = timeSeries56.getDomainDescription();
        timeSeries56.clear();
        timeSeries56.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries10.addAndOrUpdate(timeSeries56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries23 and timeSeries45", timeSeries23.equals(timeSeries45) ? timeSeries23.hashCode() == timeSeries45.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries46.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries4.addAndOrUpdate(timeSeries46);
        long long53 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries4.addAndOrUpdate(timeSeries55);
        timeSeries55.fireSeriesChanged();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries15 and timeSeries56", timeSeries15.equals(timeSeries56) ? timeSeries15.hashCode() == timeSeries56.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        java.util.Collection collection25 = timeSeries4.getTimePeriods();
        java.util.List list26 = timeSeries4.getItems();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        int int33 = timeSeries32.getMaximumItemCount();
        timeSeries32.setMaximumItemCount(100);
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class39);
        java.lang.String str41 = timeSeries40.getRangeDescription();
        boolean boolean42 = timeSeries32.equals((java.lang.Object) timeSeries40);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class44);
        java.lang.String str46 = timeSeries45.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries45.removePropertyChangeListener(propertyChangeListener47);
        java.lang.Class<?> wildcardClass49 = timeSeries45.getClass();
        timeSeries40.timePeriodClass = wildcardClass49;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass49);
        timeSeries51.setMaximumItemCount(100);
        java.lang.String str54 = timeSeries51.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        timeSeries51.addPropertyChangeListener(propertyChangeListener55);
        timeSeries51.setRangeDescription("hi!");
        java.lang.Class class59 = timeSeries51.getTimePeriodClass();
        timeSeries4.timePeriodClass = class59;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries11", timeSeries4.equals(timeSeries11) ? timeSeries4.hashCode() == timeSeries11.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries27.addChangeListener(seriesChangeListener31);
        java.lang.Class class33 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries24.addAndOrUpdate(timeSeries27);
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.Object obj40 = timeSeries39.clone();
        java.util.List list41 = timeSeries39.data;
        boolean boolean42 = timeSeries27.equals((java.lang.Object) list41);
        timeSeries27.setDomainDescription("Overwritten values from: 0.0");
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class51);
        int int53 = timeSeries52.getMaximumItemCount();
        timeSeries52.setMaximumItemCount(100);
        java.lang.Class class59 = null;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class59);
        java.lang.String str61 = timeSeries60.getRangeDescription();
        boolean boolean62 = timeSeries52.equals((java.lang.Object) timeSeries60);
        java.lang.Class class64 = null;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class64);
        java.lang.String str66 = timeSeries65.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries65.removePropertyChangeListener(propertyChangeListener67);
        java.lang.Class<?> wildcardClass69 = timeSeries65.getClass();
        timeSeries60.timePeriodClass = wildcardClass69;
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass69);
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass69);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 0.0", "hi!", (java.lang.Class) wildcardClass69);
        java.lang.Class class74 = timeSeries73.timePeriodClass;
        timeSeries27.timePeriodClass = class74;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries60", timeSeries4.equals(timeSeries60) ? timeSeries4.hashCode() == timeSeries60.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener7);
        java.lang.Class<?> wildcardClass9 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "Value", (java.lang.Class) wildcardClass9);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class14);
        int int16 = timeSeries15.getMaximumItemCount();
        long long17 = timeSeries15.getMaximumItemAge();
        java.util.List list18 = timeSeries15.getItems();
        java.util.List list19 = timeSeries15.getItems();
        timeSeries10.data = list19;
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        boolean boolean38 = timeSeries28.equals((java.lang.Object) timeSeries36);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener43);
        java.lang.Class<?> wildcardClass45 = timeSeries41.getClass();
        timeSeries36.timePeriodClass = wildcardClass45;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 0.0", "hi!", (java.lang.Class) wildcardClass45);
        timeSeries10.timePeriodClass = wildcardClass45;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries15 and timeSeries36", timeSeries15.equals(timeSeries36) ? timeSeries15.hashCode() == timeSeries36.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        java.lang.Class class5 = null;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class5);
        int int7 = timeSeries6.getMaximumItemCount();
        timeSeries6.setMaximumItemCount(100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        boolean boolean16 = timeSeries6.equals((java.lang.Object) timeSeries14);
        java.lang.Class<?> wildcardClass17 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass17);
        java.lang.String str20 = timeSeries19.getDescription();
        timeSeries19.setRangeDescription("");
        int int23 = timeSeries19.getItemCount();
        timeSeries19.setNotify(true);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        int int34 = timeSeries33.getMaximumItemCount();
        timeSeries33.setMaximumItemCount(100);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        boolean boolean43 = timeSeries33.equals((java.lang.Object) timeSeries41);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries46.removePropertyChangeListener(propertyChangeListener48);
        java.lang.Class<?> wildcardClass50 = timeSeries46.getClass();
        timeSeries41.timePeriodClass = wildcardClass50;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass50);
        timeSeries19.timePeriodClass = wildcardClass50;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries14 and timeSeries41", timeSeries14.equals(timeSeries41) ? timeSeries14.hashCode() == timeSeries41.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy(100, (int) (short) 100);
        java.util.Collection collection11 = timeSeries4.getTimePeriods();
        timeSeries4.clear();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        int int21 = timeSeries20.getMaximumItemCount();
        timeSeries20.setMaximumItemCount(100);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        boolean boolean30 = timeSeries20.equals((java.lang.Object) timeSeries28);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Class<?> wildcardClass37 = timeSeries33.getClass();
        timeSeries28.timePeriodClass = wildcardClass37;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass37);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "Overwritten values from: 0.0", "hi!", (java.lang.Class) wildcardClass37);
        timeSeries4.timePeriodClass = wildcardClass37;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries10", timeSeries4.equals(timeSeries10) ? timeSeries4.hashCode() == timeSeries10.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Object obj25 = timeSeries24.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Class class30 = timeSeries15.timePeriodClass;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries29", timeSeries18.equals(timeSeries29) ? timeSeries18.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Object obj5 = timeSeries4.clone();
        timeSeries4.setRangeDescription("hi!");
        java.util.List list8 = timeSeries4.getItems();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        int int15 = timeSeries13.getMaximumItemCount();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        timeSeries27.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries27.addChangeListener(seriesChangeListener31);
        java.util.Collection collection33 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.util.Collection collection34 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        int int38 = timeSeries37.getMaximumItemCount();
        int int39 = timeSeries37.getItemCount();
        java.lang.Class class43 = null;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class43);
        java.lang.String str45 = timeSeries44.getRangeDescription();
        java.lang.String str46 = timeSeries44.getDescription();
        boolean boolean48 = timeSeries44.equals((java.lang.Object) 10);
        java.lang.Object obj49 = timeSeries44.clone();
        java.lang.String str50 = timeSeries44.getDescription();
        java.util.Collection collection51 = timeSeries37.getTimePeriodsUniqueToOtherSeries(timeSeries44);
        boolean boolean52 = timeSeries44.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries44.createCopy((int) (byte) 1, (int) '#');
        java.lang.Object obj56 = timeSeries44.clone();
        timeSeries44.fireSeriesChanged();
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.String str63 = timeSeries62.getRangeDescription();
        java.lang.String str64 = timeSeries62.getDomainDescription();
        java.lang.Object obj65 = timeSeries62.clone();
        java.util.List list66 = timeSeries62.getItems();
        timeSeries44.data = list66;
        java.lang.Class class70 = null;
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class70);
        int int72 = timeSeries71.getMaximumItemCount();
        timeSeries71.setMaximumItemCount(100);
        java.lang.Class class78 = null;
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class78);
        java.lang.String str80 = timeSeries79.getRangeDescription();
        boolean boolean81 = timeSeries71.equals((java.lang.Object) timeSeries79);
        java.lang.Class<?> wildcardClass82 = timeSeries79.getClass();
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass82);
        org.jfree.data.time.TimeSeries timeSeries84 = timeSeries44.addAndOrUpdate(timeSeries83);
        java.lang.Class class85 = timeSeries83.timePeriodClass;
        timeSeries13.timePeriodClass = class85;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and timeSeries13", obj5.equals(timeSeries13) ? obj5.hashCode() == timeSeries13.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount(100);
        boolean boolean6 = timeSeries2.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries2.createCopy((int) (short) 0, (int) '4');
        java.util.List list10 = timeSeries9.data;
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        int int20 = timeSeries19.getMaximumItemCount();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        boolean boolean29 = timeSeries19.equals((java.lang.Object) timeSeries27);
        java.lang.Class<?> wildcardClass30 = timeSeries27.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "Time", "Value", (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "Time", "Value", (java.lang.Class) wildcardClass30);
        timeSeries9.timePeriodClass = wildcardClass30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries9", timeSeries2.equals(timeSeries9) ? timeSeries2.hashCode() == timeSeries9.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Object obj25 = timeSeries24.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Comparable comparable30 = timeSeries15.getKey();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries29", timeSeries18.equals(timeSeries29) ? timeSeries18.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Object obj25 = timeSeries24.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.addAndOrUpdate(timeSeries24);
        java.lang.Object obj30 = timeSeries29.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries29", timeSeries18.equals(timeSeries29) ? timeSeries18.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        int int6 = timeSeries5.getMaximumItemCount();
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        boolean boolean15 = timeSeries5.equals((java.lang.Object) timeSeries13);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Class<?> wildcardClass22 = timeSeries18.getClass();
        timeSeries13.timePeriodClass = wildcardClass22;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, (java.lang.Class) wildcardClass22);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries26.removeChangeListener(seriesChangeListener29);
        java.lang.Class class36 = null;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class36);
        int int38 = timeSeries37.getMaximumItemCount();
        timeSeries37.setMaximumItemCount(100);
        java.lang.Class class44 = null;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class44);
        java.lang.String str46 = timeSeries45.getRangeDescription();
        boolean boolean47 = timeSeries37.equals((java.lang.Object) timeSeries45);
        java.lang.Class<?> wildcardClass48 = timeSeries45.getClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass48);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass48);
        java.lang.String str51 = timeSeries50.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries50.addChangeListener(seriesChangeListener52);
        java.util.List list54 = timeSeries50.getItems();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries26.addAndOrUpdate(timeSeries50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries13 and timeSeries45", timeSeries13.equals(timeSeries45) ? timeSeries13.hashCode() == timeSeries45.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.Object obj5 = timeSeries4.clone();
        java.lang.String str6 = timeSeries4.getRangeDescription();
        timeSeries4.clear();
        java.util.List list8 = timeSeries4.getItems();
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.Object obj17 = timeSeries16.clone();
        timeSeries16.removeAgedItems(true);
        java.lang.Class<?> wildcardClass20 = timeSeries16.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Overwritten values from: 0.0", "Value", (java.lang.Class) wildcardClass20);
        timeSeries4.timePeriodClass = wildcardClass20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj5", timeSeries4.equals(obj5) ? timeSeries4.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        int int6 = timeSeries5.getMaximumItemCount();
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        boolean boolean15 = timeSeries5.equals((java.lang.Object) timeSeries13);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Class<?> wildcardClass22 = timeSeries18.getClass();
        timeSeries13.timePeriodClass = wildcardClass22;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass22);
        timeSeries24.setMaximumItemCount(100);
        java.lang.String str27 = timeSeries24.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener28);
        boolean boolean30 = timeSeries24.getNotify();
        int int31 = timeSeries24.getMaximumItemCount();
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        int int35 = timeSeries34.getMaximumItemCount();
        int int36 = timeSeries34.getItemCount();
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        java.lang.String str43 = timeSeries41.getDescription();
        boolean boolean45 = timeSeries41.equals((java.lang.Object) 10);
        java.lang.Object obj46 = timeSeries41.clone();
        java.lang.String str47 = timeSeries41.getDescription();
        java.util.Collection collection48 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        boolean boolean49 = timeSeries41.isEmpty();
        java.lang.Class class51 = null;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class51);
        int int53 = timeSeries52.getMaximumItemCount();
        int int54 = timeSeries52.getItemCount();
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class58);
        java.lang.String str60 = timeSeries59.getRangeDescription();
        java.lang.String str61 = timeSeries59.getDescription();
        boolean boolean63 = timeSeries59.equals((java.lang.Object) 10);
        java.lang.Object obj64 = timeSeries59.clone();
        java.lang.String str65 = timeSeries59.getDescription();
        java.util.Collection collection66 = timeSeries52.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        boolean boolean67 = timeSeries59.isEmpty();
        java.util.Collection collection68 = timeSeries41.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        long long69 = timeSeries59.getMaximumItemAge();
        java.lang.Class class73 = null;
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class73);
        java.lang.String str75 = timeSeries74.getRangeDescription();
        int int76 = timeSeries74.getMaximumItemCount();
        java.lang.Object obj77 = timeSeries74.clone();
        timeSeries74.setNotify(true);
        java.util.List list80 = timeSeries74.data;
        timeSeries59.data = list80;
        java.lang.String str82 = timeSeries59.getDescription();
        timeSeries59.setNotify(false);
        java.lang.Class<?> wildcardClass85 = timeSeries59.getClass();
        timeSeries24.timePeriodClass = wildcardClass85;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries13 and timeSeries41", timeSeries13.equals(timeSeries41) ? timeSeries13.hashCode() == timeSeries41.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        boolean boolean16 = timeSeries15.isEmpty();
        java.lang.String str17 = timeSeries15.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.createCopy((int) (short) 0, 100);
        boolean boolean21 = timeSeries20.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        java.util.Collection collection26 = timeSeries24.getTimePeriods();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class30);
        int int32 = timeSeries31.getMaximumItemCount();
        long long33 = timeSeries31.getMaximumItemAge();
        java.util.List list34 = timeSeries31.getItems();
        java.util.List list35 = timeSeries31.getItems();
        timeSeries24.data = list35;
        timeSeries20.data = list35;
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        int int42 = timeSeries41.getMaximumItemCount();
        timeSeries41.setMaximumItemCount(100);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        boolean boolean51 = timeSeries41.equals((java.lang.Object) timeSeries49);
        java.lang.Class<?> wildcardClass52 = timeSeries49.getClass();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass52);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries53.addAndOrUpdate(timeSeries55);
        boolean boolean57 = timeSeries53.getNotify();
        java.lang.Class class61 = null;
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class61);
        java.lang.Object obj63 = timeSeries62.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries62.addChangeListener(seriesChangeListener64);
        int int66 = timeSeries62.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries53.addAndOrUpdate(timeSeries62);
        java.util.Collection collection68 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries56 and timeSeries67", timeSeries56.equals(timeSeries67) ? timeSeries56.hashCode() == timeSeries67.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        int int4 = timeSeries2.getItemCount();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        java.lang.Object obj14 = timeSeries9.clone();
        java.lang.String str15 = timeSeries9.getDescription();
        java.util.Collection collection16 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.String str17 = timeSeries2.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries2.createCopy((int) (short) 0, (int) (byte) 1);
        java.util.Collection collection21 = timeSeries2.getTimePeriods();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        timeSeries28.setMaximumItemCount(100);
        java.lang.Class class35 = null;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class35);
        java.lang.String str37 = timeSeries36.getRangeDescription();
        boolean boolean38 = timeSeries28.equals((java.lang.Object) timeSeries36);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener43);
        java.lang.Class<?> wildcardClass45 = timeSeries41.getClass();
        timeSeries36.timePeriodClass = wildcardClass45;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass45);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass45);
        java.lang.Object obj49 = timeSeries48.clone();
        org.jfree.data.time.TimeSeries timeSeries50 = timeSeries2.addAndOrUpdate(timeSeries48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries36", timeSeries9.equals(timeSeries36) ? timeSeries9.hashCode() == timeSeries36.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        java.lang.String str19 = timeSeries15.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        java.lang.String str26 = timeSeries24.getDescription();
        boolean boolean28 = timeSeries24.equals((java.lang.Object) 10);
        java.lang.Object obj29 = timeSeries24.clone();
        java.lang.String str30 = timeSeries24.getDescription();
        long long31 = timeSeries24.getMaximumItemAge();
        int int32 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries15.addAndOrUpdate(timeSeries24);
        int int34 = timeSeries15.getMaximumItemCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries33", timeSeries18.equals(timeSeries33) ? timeSeries18.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.util.List list7 = timeSeries4.getItems();
        java.util.List list8 = timeSeries4.getItems();
        java.lang.String str9 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries4.addChangeListener(seriesChangeListener10);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class13);
        int int15 = timeSeries14.getMaximumItemCount();
        int int16 = timeSeries14.getItemCount();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        java.lang.String str23 = timeSeries21.getDescription();
        boolean boolean25 = timeSeries21.equals((java.lang.Object) 10);
        java.lang.Object obj26 = timeSeries21.clone();
        java.lang.String str27 = timeSeries21.getDescription();
        java.util.Collection collection28 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        boolean boolean29 = timeSeries21.isEmpty();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        int int33 = timeSeries32.getMaximumItemCount();
        int int34 = timeSeries32.getItemCount();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.String str41 = timeSeries39.getDescription();
        boolean boolean43 = timeSeries39.equals((java.lang.Object) 10);
        java.lang.Object obj44 = timeSeries39.clone();
        java.lang.String str45 = timeSeries39.getDescription();
        java.util.Collection collection46 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        boolean boolean47 = timeSeries39.isEmpty();
        java.util.Collection collection48 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        long long49 = timeSeries39.getMaximumItemAge();
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class53);
        java.lang.String str55 = timeSeries54.getRangeDescription();
        int int56 = timeSeries54.getMaximumItemCount();
        java.lang.Object obj57 = timeSeries54.clone();
        timeSeries54.setNotify(true);
        java.util.List list60 = timeSeries54.data;
        timeSeries39.data = list60;
        java.lang.String str62 = timeSeries39.getDescription();
        timeSeries39.setNotify(false);
        java.lang.Class<?> wildcardClass65 = timeSeries39.getClass();
        timeSeries4.timePeriodClass = wildcardClass65;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries21", timeSeries4.equals(timeSeries21) ? timeSeries4.hashCode() == timeSeries21.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class3);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount(100);
        java.lang.Class class11 = null;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class11);
        java.lang.String str13 = timeSeries12.getRangeDescription();
        boolean boolean14 = timeSeries4.equals((java.lang.Object) timeSeries12);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Class<?> wildcardClass21 = timeSeries17.getClass();
        timeSeries12.timePeriodClass = wildcardClass21;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy((int) (byte) 0, 10);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class31);
        java.lang.Class class33 = null;
        timeSeries32.timePeriodClass = class33;
        timeSeries32.setMaximumItemCount(100);
        timeSeries32.setMaximumItemAge((long) '4');
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        int int45 = timeSeries43.getMaximumItemCount();
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class49);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        timeSeries50.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries43.addAndOrUpdate(timeSeries50);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class58);
        java.lang.String str60 = timeSeries59.getRangeDescription();
        timeSeries59.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries43.addAndOrUpdate(timeSeries59);
        java.lang.Class class65 = null;
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class65);
        java.lang.String str67 = timeSeries66.getRangeDescription();
        timeSeries66.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries66.addChangeListener(seriesChangeListener70);
        java.lang.Class class72 = timeSeries66.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries63.addAndOrUpdate(timeSeries66);
        java.lang.Class class77 = null;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class77);
        java.lang.Object obj79 = timeSeries78.clone();
        timeSeries78.setRangeDescription("hi!");
        java.util.List list82 = timeSeries78.getItems();
        timeSeries73.data = list82;
        timeSeries32.data = list82;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener85 = null;
        timeSeries32.removeChangeListener(seriesChangeListener85);
        java.lang.Class<?> wildcardClass87 = timeSeries32.getClass();
        timeSeries24.timePeriodClass = wildcardClass87;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries12 and timeSeries43", timeSeries12.equals(timeSeries43) ? timeSeries12.hashCode() == timeSeries43.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.String str7 = timeSeries4.getRangeDescription();
        timeSeries4.setMaximumItemAge((long) (byte) 100);
        java.lang.Class class13 = null;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class13);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        java.lang.String str16 = timeSeries14.getDomainDescription();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        int int23 = timeSeries21.getMaximumItemCount();
        java.lang.String str24 = timeSeries21.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries14.addAndOrUpdate(timeSeries21);
        boolean boolean26 = timeSeries21.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries4.addAndOrUpdate(timeSeries21);
        java.lang.Class class29 = null;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class29);
        int int31 = timeSeries30.getMaximumItemCount();
        timeSeries30.setMaximumItemCount(100);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        boolean boolean40 = timeSeries30.equals((java.lang.Object) timeSeries38);
        java.lang.Class class42 = null;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class42);
        java.lang.String str44 = timeSeries43.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener45);
        java.lang.Class<?> wildcardClass47 = timeSeries43.getClass();
        timeSeries38.timePeriodClass = wildcardClass47;
        timeSeries4.timePeriodClass = wildcardClass47;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries14 and timeSeries38", timeSeries14.equals(timeSeries38) ? timeSeries14.hashCode() == timeSeries38.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Class<?> wildcardClass20 = timeSeries16.getClass();
        timeSeries11.timePeriodClass = wildcardClass20;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass20);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.lang.String str29 = timeSeries27.getDomainDescription();
        java.lang.Object obj30 = timeSeries27.clone();
        java.util.List list31 = timeSeries27.getItems();
        timeSeries27.removeAgedItems(true);
        java.util.List list34 = timeSeries27.data;
        timeSeries22.data = list34;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries11 and timeSeries27", timeSeries11.equals(timeSeries27) ? timeSeries11.hashCode() == timeSeries27.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener16);
        timeSeries15.removeAgedItems(false);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class24);
        int int26 = timeSeries25.getMaximumItemCount();
        timeSeries25.setMaximumItemCount(100);
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        boolean boolean35 = timeSeries25.equals((java.lang.Object) timeSeries33);
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class37);
        java.lang.String str39 = timeSeries38.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener40);
        java.lang.Class<?> wildcardClass42 = timeSeries38.getClass();
        timeSeries33.timePeriodClass = wildcardClass42;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass42);
        timeSeries44.setMaximumItemCount(100);
        java.lang.String str47 = timeSeries44.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        timeSeries44.addPropertyChangeListener(propertyChangeListener48);
        timeSeries44.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries15.addAndOrUpdate(timeSeries44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries33", timeSeries4.equals(timeSeries33) ? timeSeries4.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount(100);
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class9);
        java.lang.String str11 = timeSeries10.getRangeDescription();
        boolean boolean12 = timeSeries2.equals((java.lang.Object) timeSeries10);
        int int13 = timeSeries10.getItemCount();
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        int int22 = timeSeries21.getMaximumItemCount();
        timeSeries21.setMaximumItemCount(100);
        java.lang.Class class28 = null;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class28);
        java.lang.String str30 = timeSeries29.getRangeDescription();
        boolean boolean31 = timeSeries21.equals((java.lang.Object) timeSeries29);
        java.lang.Class<?> wildcardClass32 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass32);
        timeSeries10.timePeriodClass = wildcardClass32;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries10 and timeSeries29", timeSeries10.equals(timeSeries29) ? timeSeries10.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Object obj25 = timeSeries24.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.addAndOrUpdate(timeSeries24);
        timeSeries24.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries29", timeSeries18.equals(timeSeries29) ? timeSeries18.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        java.lang.Class class2 = null;
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class2);
        int int4 = timeSeries3.getMaximumItemCount();
        timeSeries3.setMaximumItemCount(100);
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        boolean boolean13 = timeSeries3.equals((java.lang.Object) timeSeries11);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries15.addAndOrUpdate(timeSeries17);
        boolean boolean19 = timeSeries15.getNotify();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.Object obj25 = timeSeries24.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        int int28 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.addAndOrUpdate(timeSeries24);
        timeSeries24.setKey((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries18 and timeSeries29", timeSeries18.equals(timeSeries29) ? timeSeries18.hashCode() == timeSeries29.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        java.lang.Class class4 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class4);
        int int6 = timeSeries5.getMaximumItemCount();
        timeSeries5.setMaximumItemCount(100);
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        boolean boolean15 = timeSeries5.equals((java.lang.Object) timeSeries13);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Class<?> wildcardClass22 = timeSeries18.getClass();
        timeSeries13.timePeriodClass = wildcardClass22;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass22);
        timeSeries24.setMaximumItemCount(100);
        java.lang.String str27 = timeSeries24.getDomainDescription();
        timeSeries24.clear();
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        java.lang.String str35 = timeSeries33.getDescription();
        boolean boolean37 = timeSeries33.equals((java.lang.Object) 10);
        java.lang.Object obj38 = timeSeries33.clone();
        java.lang.String str39 = timeSeries33.getDescription();
        boolean boolean40 = timeSeries33.getNotify();
        timeSeries33.setNotify(false);
        java.lang.String str43 = timeSeries33.getDomainDescription();
        java.util.List list44 = timeSeries33.getItems();
        timeSeries24.data = list44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries13 and timeSeries33", timeSeries13.equals(timeSeries33) ? timeSeries13.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class19);
        java.lang.String str21 = timeSeries20.getRangeDescription();
        timeSeries20.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries4.addAndOrUpdate(timeSeries20);
        boolean boolean25 = timeSeries4.isEmpty();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        int int29 = timeSeries28.getMaximumItemCount();
        int int30 = timeSeries28.getItemCount();
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        java.util.Collection collection42 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries28);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        timeSeries46.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries46.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries4.addAndOrUpdate(timeSeries46);
        long long53 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries4.addAndOrUpdate(timeSeries55);
        timeSeries55.removeAgedItems((long) (short) -1, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries15 and timeSeries56", timeSeries15.equals(timeSeries56) ? timeSeries15.hashCode() == timeSeries56.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        java.lang.String str6 = timeSeries4.getDescription();
        boolean boolean8 = timeSeries4.equals((java.lang.Object) 10);
        java.lang.Object obj9 = timeSeries4.clone();
        java.lang.String str10 = timeSeries4.getDescription();
        boolean boolean11 = timeSeries4.getNotify();
        int int12 = timeSeries4.getItemCount();
        boolean boolean13 = timeSeries4.isEmpty();
        java.lang.Class class18 = null;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class18);
        int int20 = timeSeries19.getMaximumItemCount();
        timeSeries19.setMaximumItemCount(100);
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        boolean boolean29 = timeSeries19.equals((java.lang.Object) timeSeries27);
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        java.lang.String str33 = timeSeries32.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Class<?> wildcardClass36 = timeSeries32.getClass();
        timeSeries27.timePeriodClass = wildcardClass36;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass36);
        timeSeries38.setMaximumItemCount(100);
        java.lang.String str41 = timeSeries38.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener42);
        timeSeries38.setRangeDescription("hi!");
        java.lang.Class class46 = timeSeries38.getTimePeriodClass();
        java.util.Collection collection47 = timeSeries38.getTimePeriods();
        boolean boolean48 = timeSeries4.equals((java.lang.Object) collection47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries27", timeSeries4.equals(timeSeries27) ? timeSeries4.hashCode() == timeSeries27.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        java.lang.Class class9 = null;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class9);
        int int11 = timeSeries10.getMaximumItemCount();
        timeSeries10.setMaximumItemCount(100);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        boolean boolean20 = timeSeries10.equals((java.lang.Object) timeSeries18);
        java.lang.Class<?> wildcardClass21 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass21);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass21);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        java.lang.Object obj25 = timeSeries23.clone();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries2.addAndOrUpdate(timeSeries23);
        java.lang.String str27 = timeSeries2.getDescription();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries2.createCopy((int) (short) 0, 0);
        java.lang.Class class34 = null;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class34);
        java.lang.String str36 = timeSeries35.getRangeDescription();
        java.lang.String str37 = timeSeries35.getDescription();
        boolean boolean39 = timeSeries35.equals((java.lang.Object) 10);
        java.lang.Object obj40 = timeSeries35.clone();
        java.lang.String str41 = timeSeries35.getDescription();
        boolean boolean42 = timeSeries35.getNotify();
        timeSeries35.setNotify(false);
        java.lang.String str45 = timeSeries35.getDomainDescription();
        java.lang.Comparable comparable46 = timeSeries35.getKey();
        java.lang.Class<?> wildcardClass47 = comparable46.getClass();
        timeSeries30.timePeriodClass = wildcardClass47;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries30", timeSeries2.equals(timeSeries30) ? timeSeries2.hashCode() == timeSeries30.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        timeSeries11.setMaximumItemCount(2147483647);
        java.lang.String str18 = timeSeries11.getDomainDescription();
        java.lang.String str19 = timeSeries11.getDomainDescription();
        java.lang.Class class23 = null;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class23);
        java.lang.String str25 = timeSeries24.getRangeDescription();
        int int26 = timeSeries24.getMaximumItemCount();
        java.lang.Class class30 = null;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class30);
        java.lang.String str32 = timeSeries31.getRangeDescription();
        timeSeries31.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries24.addAndOrUpdate(timeSeries31);
        timeSeries31.setMaximumItemCount(2147483647);
        java.lang.String str38 = timeSeries31.getDomainDescription();
        java.lang.Comparable comparable39 = timeSeries31.getKey();
        boolean boolean40 = timeSeries11.equals((java.lang.Object) timeSeries31);
        long long41 = timeSeries11.getMaximumItemAge();
        java.lang.Class class42 = timeSeries11.getTimePeriodClass();
        java.lang.Class class54 = null;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class54);
        int int56 = timeSeries55.getMaximumItemCount();
        timeSeries55.setMaximumItemCount(100);
        java.lang.Class class62 = null;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class62);
        java.lang.String str64 = timeSeries63.getRangeDescription();
        boolean boolean65 = timeSeries55.equals((java.lang.Object) timeSeries63);
        java.lang.Class<?> wildcardClass66 = timeSeries63.getClass();
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass66);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass66);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        timeSeries68.addChangeListener(seriesChangeListener69);
        java.util.Collection collection71 = timeSeries68.getTimePeriods();
        java.lang.Class class72 = timeSeries68.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "", "Overwritten values from: 0.0", class72);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "", "Value", class72);
        timeSeries11.timePeriodClass = class72;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries11", timeSeries4.equals(timeSeries11) ? timeSeries4.hashCode() == timeSeries11.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        int int16 = timeSeries15.getMaximumItemCount();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries23);
        java.lang.Class<?> wildcardClass26 = timeSeries23.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass26);
        timeSeries27.setMaximumItemCount((int) '4');
        boolean boolean30 = timeSeries4.equals((java.lang.Object) timeSeries27);
        timeSeries4.setNotify(true);
        java.util.List list33 = timeSeries4.getItems();
        java.lang.Class class37 = null;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class37);
        int int39 = timeSeries38.getMaximumItemCount();
        timeSeries38.setMaximumItemCount(100);
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class45);
        java.lang.String str47 = timeSeries46.getRangeDescription();
        boolean boolean48 = timeSeries38.equals((java.lang.Object) timeSeries46);
        java.lang.Class class50 = null;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class50);
        java.lang.String str52 = timeSeries51.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries51.removePropertyChangeListener(propertyChangeListener53);
        java.lang.Class<?> wildcardClass55 = timeSeries51.getClass();
        timeSeries46.timePeriodClass = wildcardClass55;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass55);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, (java.lang.Class) wildcardClass55);
        timeSeries4.timePeriodClass = wildcardClass55;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj7", timeSeries4.equals(obj7) ? timeSeries4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        long long6 = timeSeries4.getMaximumItemAge();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class8);
        int int10 = timeSeries9.getMaximumItemCount();
        timeSeries9.setMaximumItemCount(100);
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class16);
        java.lang.String str18 = timeSeries17.getRangeDescription();
        boolean boolean19 = timeSeries9.equals((java.lang.Object) timeSeries17);
        java.lang.Class class21 = null;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class21);
        java.lang.String str23 = timeSeries22.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener24);
        java.lang.Class<?> wildcardClass26 = timeSeries22.getClass();
        timeSeries17.timePeriodClass = wildcardClass26;
        timeSeries4.timePeriodClass = wildcardClass26;
        java.lang.Class class32 = null;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class32);
        java.lang.String str34 = timeSeries33.getRangeDescription();
        int int35 = timeSeries33.getMaximumItemCount();
        java.lang.Class class39 = null;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class39);
        java.lang.String str41 = timeSeries40.getRangeDescription();
        timeSeries40.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries33.addAndOrUpdate(timeSeries40);
        java.lang.Class class48 = null;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class48);
        java.lang.String str50 = timeSeries49.getRangeDescription();
        timeSeries49.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries33.addAndOrUpdate(timeSeries49);
        java.lang.Class class55 = null;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class55);
        java.lang.String str57 = timeSeries56.getRangeDescription();
        timeSeries56.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries56.addChangeListener(seriesChangeListener60);
        java.lang.Class class62 = timeSeries56.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries53.addAndOrUpdate(timeSeries56);
        java.lang.Class class67 = null;
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class67);
        java.lang.String str69 = timeSeries68.getRangeDescription();
        int int70 = timeSeries68.getMaximumItemCount();
        java.lang.Class class74 = null;
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class74);
        java.lang.String str76 = timeSeries75.getRangeDescription();
        timeSeries75.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries68.addAndOrUpdate(timeSeries75);
        boolean boolean80 = timeSeries79.isEmpty();
        java.lang.String str81 = timeSeries79.getDescription();
        timeSeries79.fireSeriesChanged();
        java.util.List list83 = timeSeries79.data;
        timeSeries53.data = list83;
        timeSeries4.data = list83;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries33", timeSeries4.equals(timeSeries33) ? timeSeries4.hashCode() == timeSeries33.hashCode() : true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        int int5 = timeSeries4.getMaximumItemCount();
        boolean boolean6 = timeSeries4.getNotify();
        java.util.Collection collection7 = timeSeries4.getTimePeriods();
        java.lang.Object obj8 = timeSeries4.clone();
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.String str10 = timeSeries4.getDomainDescription();
        java.lang.Class class16 = null;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class16);
        int int18 = timeSeries17.getMaximumItemCount();
        timeSeries17.setMaximumItemCount(100);
        java.lang.Class class24 = null;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class24);
        java.lang.String str26 = timeSeries25.getRangeDescription();
        boolean boolean27 = timeSeries17.equals((java.lang.Object) timeSeries25);
        java.lang.Class<?> wildcardClass28 = timeSeries25.getClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, (java.lang.Class) wildcardClass28);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Time", "hi!", (java.lang.Class) wildcardClass28);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        java.util.List list32 = timeSeries30.getItems();
        java.lang.Class<?> wildcardClass33 = list32.getClass();
        timeSeries4.timePeriodClass = wildcardClass33;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj8", timeSeries4.equals(obj8) ? timeSeries4.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        timeSeries4.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Class class14 = null;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class14);
        int int16 = timeSeries15.getMaximumItemCount();
        timeSeries15.setMaximumItemCount(100);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        java.lang.String str24 = timeSeries23.getRangeDescription();
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries23);
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class27);
        java.lang.String str29 = timeSeries28.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener30);
        java.lang.Class<?> wildcardClass32 = timeSeries28.getClass();
        timeSeries23.timePeriodClass = wildcardClass32;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass32);
        timeSeries34.setDescription("Value");
        java.lang.Class<?> wildcardClass37 = timeSeries34.getClass();
        timeSeries4.timePeriodClass = wildcardClass37;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and obj7", timeSeries4.equals(obj7) ? timeSeries4.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        timeSeries2.setMaximumItemCount(100);
        java.util.Collection collection6 = timeSeries2.getTimePeriods();
        java.lang.Class class7 = timeSeries2.getTimePeriodClass();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        java.lang.String str14 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener15);
        java.lang.Class<?> wildcardClass17 = timeSeries13.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "Value", (java.lang.Class) wildcardClass17);
        java.lang.Class class22 = null;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class22);
        int int24 = timeSeries23.getMaximumItemCount();
        long long25 = timeSeries23.getMaximumItemAge();
        java.util.List list26 = timeSeries23.getItems();
        java.util.List list27 = timeSeries23.getItems();
        timeSeries18.data = list27;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries18.removeChangeListener(seriesChangeListener29);
        java.util.Collection collection31 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries18.removeChangeListener(seriesChangeListener32);
        timeSeries18.setRangeDescription("");
        java.lang.Class class45 = null;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class45);
        int int47 = timeSeries46.getMaximumItemCount();
        timeSeries46.setMaximumItemCount(100);
        java.lang.Class class53 = null;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class53);
        java.lang.String str55 = timeSeries54.getRangeDescription();
        boolean boolean56 = timeSeries46.equals((java.lang.Object) timeSeries54);
        java.lang.Class class58 = null;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class58);
        java.lang.String str60 = timeSeries59.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        timeSeries59.removePropertyChangeListener(propertyChangeListener61);
        java.lang.Class<?> wildcardClass63 = timeSeries59.getClass();
        timeSeries54.timePeriodClass = wildcardClass63;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass63);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass63);
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Time", (java.lang.Class) wildcardClass63);
        timeSeries67.setRangeDescription("Time");
        java.lang.Object obj70 = timeSeries67.clone();
        java.lang.Class class71 = timeSeries67.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, "", "Value", class71);
        java.util.Collection collection73 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries23 and timeSeries54", timeSeries23.equals(timeSeries54) ? timeSeries23.hashCode() == timeSeries54.hashCode() : true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        timeSeries2.removeAgedItems(true);
        java.lang.Class class5 = timeSeries2.getTimePeriodClass();
        java.lang.Class class12 = null;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class12);
        int int14 = timeSeries13.getMaximumItemCount();
        timeSeries13.setMaximumItemCount(100);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        boolean boolean23 = timeSeries13.equals((java.lang.Object) timeSeries21);
        java.lang.Class class25 = null;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        java.lang.String str27 = timeSeries26.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener28);
        java.lang.Class<?> wildcardClass30 = timeSeries26.getClass();
        timeSeries21.timePeriodClass = wildcardClass30;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "Time", (java.lang.Class) wildcardClass30);
        java.lang.Class class35 = timeSeries34.getTimePeriodClass();
        timeSeries2.timePeriodClass = class35;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries2 and timeSeries26", timeSeries2.equals(timeSeries26) ? timeSeries2.hashCode() == timeSeries26.hashCode() : true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        java.lang.Class class7 = null;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class7);
        int int9 = timeSeries8.getMaximumItemCount();
        timeSeries8.setMaximumItemCount(100);
        java.lang.Class class15 = null;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class15);
        java.lang.String str17 = timeSeries16.getRangeDescription();
        boolean boolean18 = timeSeries8.equals((java.lang.Object) timeSeries16);
        java.lang.Class class20 = null;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class20);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Class<?> wildcardClass25 = timeSeries21.getClass();
        timeSeries16.timePeriodClass = wildcardClass25;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Time", "Value", (java.lang.Class) wildcardClass25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "hi!", "Time", (java.lang.Class) wildcardClass25);
        timeSeries28.fireSeriesChanged();
        java.lang.Class class31 = null;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class31);
        int int33 = timeSeries32.getMaximumItemCount();
        int int34 = timeSeries32.getItemCount();
        java.lang.Class class38 = null;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class38);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        java.lang.String str41 = timeSeries39.getDescription();
        boolean boolean43 = timeSeries39.equals((java.lang.Object) 10);
        java.lang.Object obj44 = timeSeries39.clone();
        java.lang.String str45 = timeSeries39.getDescription();
        java.util.Collection collection46 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        boolean boolean47 = timeSeries39.isEmpty();
        java.lang.Class class49 = null;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class49);
        int int51 = timeSeries50.getMaximumItemCount();
        int int52 = timeSeries50.getItemCount();
        java.lang.Class class56 = null;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class56);
        java.lang.String str58 = timeSeries57.getRangeDescription();
        java.lang.String str59 = timeSeries57.getDescription();
        boolean boolean61 = timeSeries57.equals((java.lang.Object) 10);
        java.lang.Object obj62 = timeSeries57.clone();
        java.lang.String str63 = timeSeries57.getDescription();
        java.util.Collection collection64 = timeSeries50.getTimePeriodsUniqueToOtherSeries(timeSeries57);
        boolean boolean65 = timeSeries57.isEmpty();
        java.util.Collection collection66 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries57);
        java.lang.Class class67 = timeSeries39.getTimePeriodClass();
        java.util.Collection collection68 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries16 and timeSeries39", timeSeries16.equals(timeSeries39) ? timeSeries16.hashCode() == timeSeries39.hashCode() : true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class3);
        java.lang.String str5 = timeSeries4.getRangeDescription();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Class class10 = null;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries4.addAndOrUpdate(timeSeries11);
        boolean boolean16 = timeSeries15.isEmpty();
        java.lang.String str17 = timeSeries15.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.createCopy((int) (short) 0, 100);
        boolean boolean21 = timeSeries20.getNotify();
        timeSeries20.setRangeDescription("");
        java.lang.Class class33 = null;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class33);
        int int35 = timeSeries34.getMaximumItemCount();
        timeSeries34.setMaximumItemCount(100);
        java.lang.Class class41 = null;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class41);
        java.lang.String str43 = timeSeries42.getRangeDescription();
        boolean boolean44 = timeSeries34.equals((java.lang.Object) timeSeries42);
        java.lang.Class class46 = null;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class46);
        java.lang.String str48 = timeSeries47.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener49);
        java.lang.Class<?> wildcardClass51 = timeSeries47.getClass();
        timeSeries42.timePeriodClass = wildcardClass51;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", (java.lang.Class) wildcardClass51);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "Time", (java.lang.Class) wildcardClass51);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, (java.lang.Class) wildcardClass51);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Overwritten values from: 0.0", "", (java.lang.Class) wildcardClass51);
        timeSeries20.timePeriodClass = wildcardClass51;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries4 and timeSeries42", timeSeries4.equals(timeSeries42) ? timeSeries4.hashCode() == timeSeries42.hashCode() : true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class1);
        int int3 = timeSeries2.getMaximumItemCount();
        int int4 = timeSeries2.getItemCount();
        java.lang.Class class8 = null;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class8);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.lang.String str11 = timeSeries9.getDescription();
        boolean boolean13 = timeSeries9.equals((java.lang.Object) 10);
        java.lang.Object obj14 = timeSeries9.clone();
        java.lang.String str15 = timeSeries9.getDescription();
        java.util.Collection collection16 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        boolean boolean17 = timeSeries9.isEmpty();
        java.lang.Class class19 = null;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class19);
        int int21 = timeSeries20.getMaximumItemCount();
        int int22 = timeSeries20.getItemCount();
        java.lang.Class class26 = null;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        java.lang.String str29 = timeSeries27.getDescription();
        boolean boolean31 = timeSeries27.equals((java.lang.Object) 10);
        java.lang.Object obj32 = timeSeries27.clone();
        java.lang.String str33 = timeSeries27.getDescription();
        java.util.Collection collection34 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        boolean boolean35 = timeSeries27.isEmpty();
        java.util.Collection collection36 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.Class class40 = null;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class40);
        java.lang.String str42 = timeSeries41.getRangeDescription();
        int int43 = timeSeries41.getMaximumItemCount();
        java.lang.Class class47 = null;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "Time", class47);
        java.lang.String str49 = timeSeries48.getRangeDescription();
        timeSeries48.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries41.addAndOrUpdate(timeSeries48);
        boolean boolean53 = timeSeries52.isEmpty();
        java.lang.String str54 = timeSeries52.getDescription();
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries52.createCopy((int) (short) 0, 100);
        boolean boolean58 = timeSeries57.getNotify();
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries9.addAndOrUpdate(timeSeries57);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries61.removeAgedItems(true);
        java.lang.Class<?> wildcardClass64 = timeSeries61.getClass();
        timeSeries57.timePeriodClass = wildcardClass64;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries52 and timeSeries57", timeSeries52.equals(timeSeries57) ? timeSeries52.hashCode() == timeSeries57.hashCode() : true);
    }
}

