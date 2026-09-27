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
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = week2.previous();
        org.jfree.data.time.Year year4 = week2.getYear();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(2569, year4);
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(3, year4);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        long long8 = week7.getFirstMillisecond();
        org.jfree.data.time.Year year9 = week7.getYear();
        java.util.Date date10 = week7.getEnd();
        java.util.Date date11 = week7.getStart();
        boolean boolean12 = week6.equals((java.lang.Object) date11);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week();
        boolean boolean17 = week15.equals((java.lang.Object) 100);
        java.util.Date date18 = week15.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = week15.previous();
        java.util.Date date20 = week15.getStart();
        java.util.TimeZone timeZone21 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass22 = timeZone21.getClass();
        java.util.Date date23 = null;
        java.util.TimeZone timeZone24 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass22, date23, timeZone24);
        java.lang.Class class26 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass22);
        org.jfree.data.time.Week week27 = new org.jfree.data.time.Week();
        boolean boolean29 = week27.equals((java.lang.Object) 100);
        java.util.Date date30 = week27.getEnd();
        java.util.TimeZone timeZone31 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass22, date30, timeZone31);
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week(date20, timeZone31);
        org.jfree.data.time.Week week34 = new org.jfree.data.time.Week();
        boolean boolean36 = week34.equals((java.lang.Object) 100);
        java.util.Date date37 = week34.getEnd();
        org.jfree.data.time.Week week38 = new org.jfree.data.time.Week(date37);
        java.util.TimeZone timeZone39 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week40 = new org.jfree.data.time.Week(date37, timeZone39);
        org.jfree.data.time.Week week41 = new org.jfree.data.time.Week(date20, timeZone39);
        org.jfree.data.time.Year year42 = week41.getYear();
        org.jfree.data.time.Week week43 = new org.jfree.data.time.Week((int) (short) -1, year42);
        org.jfree.data.time.Week week44 = new org.jfree.data.time.Week(0, year42);
        java.util.Date date45 = week44.getEnd();
        org.jfree.data.time.Week week46 = new org.jfree.data.time.Week();
        boolean boolean48 = week46.equals((java.lang.Object) 100);
        java.util.Date date49 = week46.getEnd();
        long long50 = week46.getFirstMillisecond();
        java.util.Date date51 = week46.getStart();
        int int52 = week46.getWeek();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = week46.previous();
        int int54 = week46.getYearValue();
        java.lang.String str55 = week46.toString();
        org.jfree.data.time.Week week57 = new org.jfree.data.time.Week();
        long long58 = week57.getFirstMillisecond();
        org.jfree.data.time.Year year59 = week57.getYear();
        org.jfree.data.time.Year year60 = week57.getYear();
        org.jfree.data.time.Week week61 = new org.jfree.data.time.Week(4, year60);
        org.jfree.data.time.Year year62 = week61.getYear();
        java.util.Date date63 = year62.getEnd();
        int int64 = week46.compareTo((java.lang.Object) date63);
        org.jfree.data.time.Week week65 = new org.jfree.data.time.Week();
        long long66 = week65.getFirstMillisecond();
        org.jfree.data.time.Year year67 = week65.getYear();
        java.util.Date date68 = week65.getEnd();
        org.jfree.data.time.Week week69 = new org.jfree.data.time.Week(date68);
        org.jfree.data.time.Week week70 = new org.jfree.data.time.Week();
        boolean boolean72 = week70.equals((java.lang.Object) 100);
        java.util.Date date73 = week70.getEnd();
        org.jfree.data.time.Week week74 = new org.jfree.data.time.Week(date73);
        java.util.TimeZone timeZone75 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week76 = new org.jfree.data.time.Week(date73, timeZone75);
        org.jfree.data.time.Week week77 = new org.jfree.data.time.Week(date68, timeZone75);
        org.jfree.data.time.Week week78 = new org.jfree.data.time.Week(date63, timeZone75);
        org.jfree.data.time.Week week79 = new org.jfree.data.time.Week(date45, timeZone75);
        org.jfree.data.time.Week week80 = new org.jfree.data.time.Week(date11, timeZone75);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790442000000L + "'", long8 == 1790442000000L);
        org.junit.Assert.assertNotNull(year9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod25);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(year42);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Dec 27 23:59:59 ICT 2025");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1790442000000L + "'", long50 == 1790442000000L);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 40 + "'", int52 == 40);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2569 + "'", int54 == 2569);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Week 40, 2569" + "'", str55, "Week 40, 2569");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1790442000000L + "'", long58 == 1790442000000L);
        org.junit.Assert.assertNotNull(year59);
        org.junit.Assert.assertNotNull(year60);
        org.junit.Assert.assertNotNull(year62);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Dec 31 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1790442000000L + "'", long66 == 1790442000000L);
        org.junit.Assert.assertNotNull(year67);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone75);
        org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        int int6 = week0.compareTo((java.lang.Object) false);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        boolean boolean9 = week7.equals((java.lang.Object) 100);
        long long10 = week7.getFirstMillisecond();
        boolean boolean12 = week7.equals((java.lang.Object) (byte) 1);
        int int13 = week7.getWeek();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = week7.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = week7.next();
        java.lang.String str16 = week7.toString();
        java.util.Date date17 = week7.getEnd();
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(date17);
        long long19 = week18.getLastMillisecond();
        java.util.Date date20 = week18.getEnd();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week(date20);
        int int22 = week0.compareTo((java.lang.Object) week21);
        long long23 = week0.getLastMillisecond();
        java.util.Date date24 = week0.getStart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1790442000000L + "'", long10 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 40 + "'", int13 == 40);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Week 40, 2569" + "'", str16, "Week 40, 2569");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1791046799999L + "'", long19 == 1791046799999L);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1791046799999L + "'", long23 == 1791046799999L);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Sep 27 00:00:00 ICT 2026");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        java.util.Date date4 = week1.getEnd();
        long long5 = week1.getFirstMillisecond();
        int int6 = week1.getYearValue();
        int int7 = week1.getWeek();
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        long long9 = week8.getFirstMillisecond();
        org.jfree.data.time.Year year10 = week8.getYear();
        org.jfree.data.time.Year year11 = week8.getYear();
        boolean boolean12 = week1.equals((java.lang.Object) year11);
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(6, year11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1790442000000L + "'", long5 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2569 + "'", int6 == 2569);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790442000000L + "'", long9 == 1790442000000L);
        org.junit.Assert.assertNotNull(year10);
        org.junit.Assert.assertNotNull(year11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = week0.previous();
        java.util.Date date5 = week0.getStart();
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass7 = timeZone6.getClass();
        java.util.Date date8 = null;
        java.util.TimeZone timeZone9 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date8, timeZone9);
        java.lang.Class class11 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass7);
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week();
        boolean boolean14 = week12.equals((java.lang.Object) 100);
        java.util.Date date15 = week12.getEnd();
        java.util.TimeZone timeZone16 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date15, timeZone16);
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(date5, timeZone16);
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week();
        boolean boolean21 = week19.equals((java.lang.Object) 100);
        java.util.Date date22 = week19.getEnd();
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week(date22);
        java.util.TimeZone timeZone24 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week(date22, timeZone24);
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week(date5, timeZone24);
        org.jfree.data.time.Year year27 = week26.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = week26.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = week26.next();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(year27);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = week0.previous();
        java.lang.Class<?> wildcardClass5 = week0.getClass();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week();
        boolean boolean8 = week6.equals((java.lang.Object) 100);
        java.util.Date date9 = week6.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = week6.previous();
        java.util.Date date11 = week6.getStart();
        java.util.Date date12 = week6.getStart();
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week();
        boolean boolean15 = week13.equals((java.lang.Object) 100);
        java.util.Date date16 = week13.getEnd();
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week(date16);
        java.util.TimeZone timeZone18 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week(date16, timeZone18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass5, date12, timeZone18);
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week();
        boolean boolean23 = week21.equals((java.lang.Object) 100);
        java.util.Date date24 = week21.getEnd();
        long long25 = week21.getFirstMillisecond();
        java.util.Date date26 = week21.getStart();
        java.util.TimeZone timeZone27 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass5, date26, timeZone27);
        java.util.Date date29 = regularTimePeriod28.getStart();
        java.util.Date date30 = regularTimePeriod28.getEnd();
        long long31 = regularTimePeriod28.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1790442000000L + "'", long25 == 1790442000000L);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1790744399999L + "'", long31 == 1790744399999L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        java.util.Date date4 = week1.getEnd();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(date4);
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date4, timeZone6);
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        boolean boolean10 = week8.equals((java.lang.Object) 100);
        java.util.Date date11 = week8.getEnd();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week(date11);
        java.util.TimeZone timeZone13 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date11, timeZone13);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date4, timeZone13);
        long long16 = week15.getLastMillisecond();
        int int17 = week15.getWeek();
        long long18 = week15.getMiddleMillisecond();
        long long19 = week15.getLastMillisecond();
        org.jfree.data.time.Year year20 = week15.getYear();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week((int) (short) 10, year20);
        java.lang.String str22 = week21.toString();
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            week21.peg(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1791046799999L + "'", long16 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1790744399999L + "'", long18 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1791046799999L + "'", long19 == 1791046799999L);
        org.junit.Assert.assertNotNull(year20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Week 10, 2569" + "'", str22, "Week 10, 2569");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        int int6 = week0.compareTo((java.lang.Object) false);
        long long7 = week0.getLastMillisecond();
        long long8 = week0.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1791046799999L + "'", long7 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790744399999L + "'", long8 == 1790744399999L);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        java.util.Date date4 = week1.getEnd();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(date4);
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date4, timeZone6);
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        boolean boolean10 = week8.equals((java.lang.Object) 100);
        java.util.Date date11 = week8.getEnd();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week(date11);
        java.util.TimeZone timeZone13 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date11, timeZone13);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date4, timeZone13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = week15.next();
        long long17 = week15.getMiddleMillisecond();
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week();
        boolean boolean20 = week18.equals((java.lang.Object) 100);
        org.jfree.data.time.Year year21 = week18.getYear();
        boolean boolean22 = week15.equals((java.lang.Object) year21);
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week(0, year21);
        java.util.Date date24 = week23.getEnd();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1790744399999L + "'", long17 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(year21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Dec 27 23:59:59 ICT 2025");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.time.Week week3 = new org.jfree.data.time.Week();
        boolean boolean5 = week3.equals((java.lang.Object) 100);
        java.util.Date date6 = week3.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = week3.previous();
        java.util.Date date8 = week3.getStart();
        java.util.TimeZone timeZone9 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass10 = timeZone9.getClass();
        java.util.Date date11 = null;
        java.util.TimeZone timeZone12 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass10, date11, timeZone12);
        java.lang.Class class14 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass10);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week();
        boolean boolean17 = week15.equals((java.lang.Object) 100);
        java.util.Date date18 = week15.getEnd();
        java.util.TimeZone timeZone19 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass10, date18, timeZone19);
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week(date8, timeZone19);
        org.jfree.data.time.Week week22 = new org.jfree.data.time.Week();
        boolean boolean24 = week22.equals((java.lang.Object) 100);
        java.util.Date date25 = week22.getEnd();
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week(date25);
        java.util.TimeZone timeZone27 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week28 = new org.jfree.data.time.Week(date25, timeZone27);
        org.jfree.data.time.Week week29 = new org.jfree.data.time.Week(date8, timeZone27);
        org.jfree.data.time.Year year30 = week29.getYear();
        org.jfree.data.time.Week week31 = new org.jfree.data.time.Week((int) (short) -1, year30);
        org.jfree.data.time.Week week32 = new org.jfree.data.time.Week(0, year30);
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week((int) (short) 0, year30);
        int int34 = week33.getYearValue();
        org.jfree.data.time.Week week36 = new org.jfree.data.time.Week();
        boolean boolean38 = week36.equals((java.lang.Object) 100);
        java.util.Date date39 = week36.getEnd();
        long long40 = week36.getFirstMillisecond();
        int int41 = week36.getYearValue();
        java.util.Date date42 = week36.getStart();
        org.jfree.data.time.Year year43 = week36.getYear();
        org.jfree.data.time.Week week44 = new org.jfree.data.time.Week(97, year43);
        int int45 = week33.compareTo((java.lang.Object) year43);
        java.lang.String str46 = week33.toString();
        long long47 = week33.getSerialIndex();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(year30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2569 + "'", int34 == 2569);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1790442000000L + "'", long40 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2569 + "'", int41 == 2569);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(year43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Week 0, 2569" + "'", str46, "Week 0, 2569");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 136157L + "'", long47 == 136157L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        java.util.Date date4 = week1.getEnd();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(date4);
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date4, timeZone6);
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        boolean boolean10 = week8.equals((java.lang.Object) 100);
        java.util.Date date11 = week8.getEnd();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week(date11);
        java.util.TimeZone timeZone13 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date11, timeZone13);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date4, timeZone13);
        long long16 = week15.getLastMillisecond();
        int int17 = week15.getWeek();
        long long18 = week15.getMiddleMillisecond();
        long long19 = week15.getLastMillisecond();
        org.jfree.data.time.Year year20 = week15.getYear();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week((int) (short) 10, year20);
        java.lang.String str22 = week21.toString();
        int int23 = week21.getYearValue();
        java.lang.String str24 = week21.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1791046799999L + "'", long16 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1790744399999L + "'", long18 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1791046799999L + "'", long19 == 1791046799999L);
        org.junit.Assert.assertNotNull(year20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Week 10, 2569" + "'", str22, "Week 10, 2569");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2569 + "'", int23 == 2569);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Week 10, 2569" + "'", str24, "Week 10, 2569");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        java.util.Date date5 = week0.getStart();
        int int6 = week0.getWeek();
        long long7 = week0.getFirstMillisecond();
        long long8 = week0.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790442000000L + "'", long7 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790744399999L + "'", long8 == 1790744399999L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = week0.previous();
        long long2 = week0.getFirstMillisecond();
        boolean boolean4 = week0.equals((java.lang.Object) 1L);
        java.util.Date date5 = week0.getStart();
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass7 = timeZone6.getClass();
        java.util.Date date8 = null;
        java.util.TimeZone timeZone9 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date8, timeZone9);
        java.lang.Class class11 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass7);
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week();
        boolean boolean14 = week12.equals((java.lang.Object) 100);
        java.util.Date date15 = week12.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = week12.previous();
        java.util.Date date17 = week12.getStart();
        java.util.Date date18 = week12.getStart();
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week();
        boolean boolean21 = week19.equals((java.lang.Object) 100);
        java.util.Date date22 = week19.getEnd();
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week(date22);
        java.util.TimeZone timeZone24 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week(date22, timeZone24);
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week();
        boolean boolean28 = week26.equals((java.lang.Object) 100);
        java.util.Date date29 = week26.getEnd();
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week(date29);
        java.util.TimeZone timeZone31 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week32 = new org.jfree.data.time.Week(date29, timeZone31);
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week(date22, timeZone31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = org.jfree.data.time.RegularTimePeriod.createInstance(class11, date18, timeZone31);
        boolean boolean35 = week0.equals((java.lang.Object) date18);
        org.jfree.data.time.Week week36 = new org.jfree.data.time.Week();
        long long37 = week36.getFirstMillisecond();
        int int38 = week36.getWeek();
        java.util.Date date39 = week36.getEnd();
        org.jfree.data.time.Week week40 = new org.jfree.data.time.Week();
        boolean boolean42 = week40.equals((java.lang.Object) 100);
        java.util.Date date43 = week40.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = week40.previous();
        java.lang.Class<?> wildcardClass45 = week40.getClass();
        org.jfree.data.time.Week week46 = new org.jfree.data.time.Week();
        boolean boolean48 = week46.equals((java.lang.Object) 100);
        java.util.Date date49 = week46.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = week46.previous();
        java.util.Date date51 = week46.getStart();
        java.util.Date date52 = week46.getStart();
        org.jfree.data.time.Week week53 = new org.jfree.data.time.Week();
        boolean boolean55 = week53.equals((java.lang.Object) 100);
        java.util.Date date56 = week53.getEnd();
        org.jfree.data.time.Week week57 = new org.jfree.data.time.Week(date56);
        java.util.TimeZone timeZone58 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week59 = new org.jfree.data.time.Week(date56, timeZone58);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass45, date52, timeZone58);
        org.jfree.data.time.Week week61 = new org.jfree.data.time.Week(date39, timeZone58);
        org.jfree.data.time.Week week62 = new org.jfree.data.time.Week(date18, timeZone58);
        java.util.TimeZone timeZone63 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass64 = timeZone63.getClass();
        java.util.Date date65 = null;
        java.util.TimeZone timeZone66 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass67 = timeZone66.getClass();
        org.jfree.data.time.Week week68 = new org.jfree.data.time.Week();
        boolean boolean70 = week68.equals((java.lang.Object) 100);
        java.util.Date date71 = week68.getEnd();
        long long72 = week68.getFirstMillisecond();
        java.util.Date date73 = week68.getStart();
        org.jfree.data.time.Week week74 = new org.jfree.data.time.Week();
        boolean boolean76 = week74.equals((java.lang.Object) 100);
        java.util.Date date77 = week74.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod78 = week74.previous();
        java.util.Date date79 = week74.getStart();
        java.util.TimeZone timeZone80 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass81 = timeZone80.getClass();
        java.util.Date date82 = null;
        java.util.TimeZone timeZone83 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod84 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass81, date82, timeZone83);
        java.lang.Class class85 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass81);
        org.jfree.data.time.Week week86 = new org.jfree.data.time.Week();
        boolean boolean88 = week86.equals((java.lang.Object) 100);
        java.util.Date date89 = week86.getEnd();
        java.util.TimeZone timeZone90 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod91 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass81, date89, timeZone90);
        org.jfree.data.time.Week week92 = new org.jfree.data.time.Week(date79, timeZone90);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod93 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass67, date73, timeZone90);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod94 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass64, date65, timeZone90);
        org.jfree.data.time.Week week95 = new org.jfree.data.time.Week(date18, timeZone90);
        int int96 = week95.getYearValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1790442000000L + "'", long2 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1790442000000L + "'", long37 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 40 + "'", int38 == 40);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod50);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod60);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1790442000000L + "'", long72 == 1790442000000L);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod78);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone80);
        org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod84);
        org.junit.Assert.assertNotNull(class85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone90);
        org.junit.Assert.assertEquals(timeZone90.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod91);
        org.junit.Assert.assertNull(regularTimePeriod93);
        org.junit.Assert.assertNull(regularTimePeriod94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2569 + "'", int96 == 2569);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = week0.previous();
        java.util.Date date5 = week0.getStart();
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass7 = timeZone6.getClass();
        java.util.Date date8 = null;
        java.util.TimeZone timeZone9 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date8, timeZone9);
        java.lang.Class class11 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass7);
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week();
        boolean boolean14 = week12.equals((java.lang.Object) 100);
        java.util.Date date15 = week12.getEnd();
        java.util.TimeZone timeZone16 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date15, timeZone16);
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(date5, timeZone16);
        java.util.TimeZone timeZone19 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass20 = timeZone19.getClass();
        java.util.Date date21 = null;
        java.util.TimeZone timeZone22 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass20, date21, timeZone22);
        java.lang.Class class24 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass20);
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week();
        boolean boolean27 = week25.equals((java.lang.Object) 100);
        java.util.Date date28 = week25.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = week25.previous();
        java.util.Date date30 = week25.getStart();
        java.util.Date date31 = week25.getStart();
        org.jfree.data.time.Week week32 = new org.jfree.data.time.Week();
        boolean boolean34 = week32.equals((java.lang.Object) 100);
        java.util.Date date35 = week32.getEnd();
        org.jfree.data.time.Week week36 = new org.jfree.data.time.Week(date35);
        java.util.TimeZone timeZone37 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week38 = new org.jfree.data.time.Week(date35, timeZone37);
        org.jfree.data.time.Week week39 = new org.jfree.data.time.Week();
        boolean boolean41 = week39.equals((java.lang.Object) 100);
        java.util.Date date42 = week39.getEnd();
        org.jfree.data.time.Week week43 = new org.jfree.data.time.Week(date42);
        java.util.TimeZone timeZone44 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week45 = new org.jfree.data.time.Week(date42, timeZone44);
        org.jfree.data.time.Week week46 = new org.jfree.data.time.Week(date35, timeZone44);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = org.jfree.data.time.RegularTimePeriod.createInstance(class24, date31, timeZone44);
        java.util.Date date48 = regularTimePeriod47.getEnd();
        org.jfree.data.time.Week week49 = new org.jfree.data.time.Week();
        boolean boolean51 = week49.equals((java.lang.Object) 100);
        java.util.Date date52 = week49.getEnd();
        long long53 = week49.getFirstMillisecond();
        java.util.Date date54 = week49.getStart();
        org.jfree.data.time.Week week55 = new org.jfree.data.time.Week(date54);
        java.util.Date date56 = week55.getEnd();
        org.jfree.data.time.Week week57 = new org.jfree.data.time.Week();
        boolean boolean59 = week57.equals((java.lang.Object) 100);
        java.util.Date date60 = week57.getEnd();
        org.jfree.data.time.Week week61 = new org.jfree.data.time.Week(date60);
        java.util.TimeZone timeZone62 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass63 = timeZone62.getClass();
        java.util.Date date64 = null;
        java.util.TimeZone timeZone65 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod66 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass63, date64, timeZone65);
        org.jfree.data.time.Week week67 = new org.jfree.data.time.Week(date60, timeZone65);
        org.jfree.data.time.Week week68 = new org.jfree.data.time.Week(date56, timeZone65);
        org.jfree.data.time.Week week69 = new org.jfree.data.time.Week(date48, timeZone65);
        java.util.Locale locale70 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Week week71 = new org.jfree.data.time.Week(date5, timeZone65, locale70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'locale' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod23);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod47);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1790442000000L + "'", long53 == 1790442000000L);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod66);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        boolean boolean5 = week0.equals((java.lang.Object) (byte) 1);
        long long6 = week0.getMiddleMillisecond();
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        long long8 = week7.getFirstMillisecond();
        int int9 = week7.getWeek();
        java.util.Date date10 = week7.getEnd();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week();
        boolean boolean13 = week11.equals((java.lang.Object) 100);
        java.util.Date date14 = week11.getEnd();
        long long15 = week11.getFirstMillisecond();
        java.util.Date date16 = week11.getStart();
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week(date16);
        java.util.Date date18 = week17.getEnd();
        int int19 = week7.compareTo((java.lang.Object) week17);
        java.util.Date date20 = week7.getEnd();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week(date20);
        java.util.Date date22 = week21.getStart();
        boolean boolean23 = week0.equals((java.lang.Object) date22);
        long long24 = week0.getMiddleMillisecond();
        long long25 = week0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1790744399999L + "'", long6 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790442000000L + "'", long8 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1790442000000L + "'", long15 == 1790442000000L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1790744399999L + "'", long24 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1790442000000L + "'", long25 == 1790442000000L);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        java.util.Date date5 = week0.getStart();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date5);
        boolean boolean8 = week6.equals((java.lang.Object) 0.0f);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = week6.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = week0.getYear();
        java.util.Date date5 = week0.getEnd();
        java.util.Date date6 = week0.getEnd();
        int int7 = week0.getWeek();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            week0.peg(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = week0.getYear();
        java.util.Date date5 = week0.getEnd();
        java.lang.String str6 = week0.toString();
        long long7 = week0.getFirstMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Week 40, 2569" + "'", str6, "Week 40, 2569");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790442000000L + "'", long7 == 1790442000000L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        org.jfree.data.time.Year year3 = week0.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = week0.next();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = week5.previous();
        long long7 = week5.getFirstMillisecond();
        int int8 = week5.getWeek();
        boolean boolean9 = week0.equals((java.lang.Object) int8);
        java.util.Date date10 = week0.getEnd();
        java.util.TimeZone timeZone11 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass12 = timeZone11.getClass();
        java.util.Date date13 = null;
        java.util.TimeZone timeZone14 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass12, date13, timeZone14);
        java.lang.Class class16 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass12);
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week();
        long long18 = week17.getFirstMillisecond();
        int int19 = week17.getWeek();
        java.util.Date date20 = week17.getEnd();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week();
        boolean boolean23 = week21.equals((java.lang.Object) 100);
        java.util.Date date24 = week21.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = week21.previous();
        java.util.Date date26 = week21.getStart();
        java.util.TimeZone timeZone27 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass28 = timeZone27.getClass();
        java.util.Date date29 = null;
        java.util.TimeZone timeZone30 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass28, date29, timeZone30);
        java.lang.Class class32 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass28);
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week();
        boolean boolean35 = week33.equals((java.lang.Object) 100);
        java.util.Date date36 = week33.getEnd();
        java.util.TimeZone timeZone37 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass28, date36, timeZone37);
        org.jfree.data.time.Week week39 = new org.jfree.data.time.Week(date26, timeZone37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date20, timeZone37);
        java.util.Date date41 = null;
        java.util.TimeZone timeZone42 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass43 = timeZone42.getClass();
        org.jfree.data.time.Week week44 = new org.jfree.data.time.Week();
        boolean boolean46 = week44.equals((java.lang.Object) 100);
        java.util.Date date47 = week44.getEnd();
        long long48 = week44.getFirstMillisecond();
        java.util.Date date49 = week44.getStart();
        org.jfree.data.time.Week week50 = new org.jfree.data.time.Week();
        boolean boolean52 = week50.equals((java.lang.Object) 100);
        java.util.Date date53 = week50.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = week50.previous();
        java.util.Date date55 = week50.getStart();
        java.util.TimeZone timeZone56 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass57 = timeZone56.getClass();
        java.util.Date date58 = null;
        java.util.TimeZone timeZone59 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass57, date58, timeZone59);
        java.lang.Class class61 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass57);
        org.jfree.data.time.Week week62 = new org.jfree.data.time.Week();
        boolean boolean64 = week62.equals((java.lang.Object) 100);
        java.util.Date date65 = week62.getEnd();
        java.util.TimeZone timeZone66 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass57, date65, timeZone66);
        org.jfree.data.time.Week week68 = new org.jfree.data.time.Week(date55, timeZone66);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod69 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass43, date49, timeZone66);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod70 = org.jfree.data.time.RegularTimePeriod.createInstance(class16, date41, timeZone66);
        org.jfree.data.time.Week week71 = new org.jfree.data.time.Week(date10, timeZone66);
        long long72 = week71.getLastMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790442000000L + "'", long7 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1790442000000L + "'", long18 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod31);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1790442000000L + "'", long48 == 1790442000000L);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod54);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod60);
        org.junit.Assert.assertNotNull(class61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod67);
        org.junit.Assert.assertNull(regularTimePeriod69);
        org.junit.Assert.assertNull(regularTimePeriod70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1791046799999L + "'", long72 == 1791046799999L);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(date3);
        java.util.TimeZone timeZone5 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date3, timeZone5);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        boolean boolean9 = week7.equals((java.lang.Object) 100);
        java.util.Date date10 = week7.getEnd();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week(date10);
        java.util.TimeZone timeZone12 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date10, timeZone12);
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date3, timeZone12);
        long long15 = week14.getLastMillisecond();
        int int16 = week14.getWeek();
        long long17 = week14.getMiddleMillisecond();
        int int18 = week14.getWeek();
        int int19 = week14.getYearValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1791046799999L + "'", long15 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1790744399999L + "'", long17 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2569 + "'", int19 == 2569);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = week0.previous();
        java.util.Date date6 = week0.getEnd();
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 136197L + "'", long4 == 136197L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Oct 03 23:59:59 ICT 2026");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = week1.previous();
        org.jfree.data.time.Year year3 = week1.getYear();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week((int) ' ', year3);
        long long5 = week4.getFirstMillisecond();
        long long6 = week4.getSerialIndex();
        java.util.Date date7 = week4.getEnd();
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week(date7);
        int int9 = week8.getYearValue();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            week8.peg(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1785603600000L + "'", long5 == 1785603600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 136189L + "'", long6 == 136189L);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Aug 08 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2569 + "'", int9 == 2569);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        long long1 = week0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = week0.getYear();
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getMiddleMillisecond();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = week5.previous();
        long long7 = week5.getFirstMillisecond();
        long long8 = week5.getMiddleMillisecond();
        org.jfree.data.time.Week week9 = new org.jfree.data.time.Week();
        boolean boolean11 = week9.equals((java.lang.Object) 100);
        java.util.Date date12 = week9.getEnd();
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date12);
        java.util.TimeZone timeZone14 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date12, timeZone14);
        int int16 = week5.compareTo((java.lang.Object) week15);
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week();
        boolean boolean19 = week17.equals((java.lang.Object) 100);
        java.util.Date date20 = week17.getEnd();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week(date20);
        java.util.TimeZone timeZone22 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week(date20, timeZone22);
        org.jfree.data.time.Week week24 = new org.jfree.data.time.Week();
        boolean boolean26 = week24.equals((java.lang.Object) 100);
        java.util.Date date27 = week24.getEnd();
        org.jfree.data.time.Week week28 = new org.jfree.data.time.Week(date27);
        java.util.TimeZone timeZone29 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week(date27, timeZone29);
        org.jfree.data.time.Week week31 = new org.jfree.data.time.Week(date20, timeZone29);
        long long32 = week31.getLastMillisecond();
        int int33 = week31.getWeek();
        long long34 = week31.getMiddleMillisecond();
        long long35 = week31.getFirstMillisecond();
        long long36 = week31.getSerialIndex();
        int int37 = week5.compareTo((java.lang.Object) week31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = week5.next();
        boolean boolean39 = week0.equals((java.lang.Object) week5);
        long long40 = week0.getFirstMillisecond();
        org.jfree.data.time.Week week41 = new org.jfree.data.time.Week();
        boolean boolean43 = week41.equals((java.lang.Object) 100);
        java.util.Date date44 = week41.getEnd();
        org.jfree.data.time.Week week45 = new org.jfree.data.time.Week(date44);
        java.util.TimeZone timeZone46 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week47 = new org.jfree.data.time.Week(date44, timeZone46);
        org.jfree.data.time.Week week48 = new org.jfree.data.time.Week();
        boolean boolean50 = week48.equals((java.lang.Object) 100);
        java.util.Date date51 = week48.getEnd();
        org.jfree.data.time.Week week52 = new org.jfree.data.time.Week(date51);
        java.util.TimeZone timeZone53 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week54 = new org.jfree.data.time.Week(date51, timeZone53);
        org.jfree.data.time.Week week55 = new org.jfree.data.time.Week(date44, timeZone53);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = week55.next();
        long long57 = week55.getMiddleMillisecond();
        long long58 = week55.getLastMillisecond();
        long long59 = week55.getLastMillisecond();
        org.jfree.data.time.Year year60 = week55.getYear();
        int int61 = week0.compareTo((java.lang.Object) year60);
        java.util.Calendar calendar62 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long63 = week0.getMiddleMillisecond(calendar62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1790442000000L + "'", long1 == 1790442000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790744399999L + "'", long4 == 1790744399999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790442000000L + "'", long7 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790744399999L + "'", long8 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1791046799999L + "'", long32 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1790744399999L + "'", long34 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1790442000000L + "'", long35 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 136197L + "'", long36 == 136197L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1790442000000L + "'", long40 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1790744399999L + "'", long57 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1791046799999L + "'", long58 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1791046799999L + "'", long59 == 1791046799999L);
        org.junit.Assert.assertNotNull(year60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = week0.previous();
        long long2 = week0.getFirstMillisecond();
        boolean boolean4 = week0.equals((java.lang.Object) 1L);
        java.util.Date date5 = week0.getStart();
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass7 = timeZone6.getClass();
        java.util.Date date8 = null;
        java.util.TimeZone timeZone9 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass7, date8, timeZone9);
        java.lang.Class class11 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass7);
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week();
        boolean boolean14 = week12.equals((java.lang.Object) 100);
        java.util.Date date15 = week12.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = week12.previous();
        java.util.Date date17 = week12.getStart();
        java.util.Date date18 = week12.getStart();
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week();
        boolean boolean21 = week19.equals((java.lang.Object) 100);
        java.util.Date date22 = week19.getEnd();
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week(date22);
        java.util.TimeZone timeZone24 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week(date22, timeZone24);
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week();
        boolean boolean28 = week26.equals((java.lang.Object) 100);
        java.util.Date date29 = week26.getEnd();
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week(date29);
        java.util.TimeZone timeZone31 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week32 = new org.jfree.data.time.Week(date29, timeZone31);
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week(date22, timeZone31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = org.jfree.data.time.RegularTimePeriod.createInstance(class11, date18, timeZone31);
        boolean boolean35 = week0.equals((java.lang.Object) date18);
        org.jfree.data.time.Week week37 = new org.jfree.data.time.Week();
        java.lang.String str38 = week37.toString();
        long long39 = week37.getSerialIndex();
        java.util.Date date40 = week37.getEnd();
        org.jfree.data.time.Week week41 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = week41.previous();
        org.jfree.data.time.Year year43 = week41.getYear();
        boolean boolean44 = week37.equals((java.lang.Object) year43);
        org.jfree.data.time.Week week45 = new org.jfree.data.time.Week(0, year43);
        int int46 = week0.compareTo((java.lang.Object) 0);
        org.jfree.data.time.Week week47 = new org.jfree.data.time.Week();
        boolean boolean49 = week47.equals((java.lang.Object) 100);
        java.util.Date date50 = week47.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = week47.previous();
        java.util.Date date52 = week47.getStart();
        java.util.TimeZone timeZone53 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass54 = timeZone53.getClass();
        java.util.Date date55 = null;
        java.util.TimeZone timeZone56 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass54, date55, timeZone56);
        java.lang.Class class58 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass54);
        org.jfree.data.time.Week week59 = new org.jfree.data.time.Week();
        boolean boolean61 = week59.equals((java.lang.Object) 100);
        java.util.Date date62 = week59.getEnd();
        java.util.TimeZone timeZone63 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod64 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass54, date62, timeZone63);
        org.jfree.data.time.Week week65 = new org.jfree.data.time.Week(date52, timeZone63);
        java.lang.String str66 = week65.toString();
        int int67 = week0.compareTo((java.lang.Object) week65);
        org.jfree.data.time.Week week68 = new org.jfree.data.time.Week();
        long long69 = week68.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod70 = week68.next();
        long long71 = week68.getMiddleMillisecond();
        java.util.Date date72 = week68.getEnd();
        org.jfree.data.time.Week week73 = new org.jfree.data.time.Week();
        long long74 = week73.getFirstMillisecond();
        int int75 = week73.getWeek();
        java.util.Date date76 = week73.getEnd();
        org.jfree.data.time.Week week77 = new org.jfree.data.time.Week();
        boolean boolean79 = week77.equals((java.lang.Object) 100);
        java.util.Date date80 = week77.getEnd();
        long long81 = week77.getFirstMillisecond();
        java.util.Date date82 = week77.getStart();
        org.jfree.data.time.Week week83 = new org.jfree.data.time.Week(date82);
        java.util.Date date84 = week83.getEnd();
        int int85 = week73.compareTo((java.lang.Object) week83);
        java.util.Date date86 = week73.getEnd();
        boolean boolean87 = week68.equals((java.lang.Object) date86);
        org.jfree.data.time.Week week88 = new org.jfree.data.time.Week(date86);
        java.util.Date date89 = week88.getStart();
        int int90 = week88.getYearValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod91 = week88.next();
        java.util.Date date92 = regularTimePeriod91.getStart();
        boolean boolean93 = week65.equals((java.lang.Object) regularTimePeriod91);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1790442000000L + "'", long2 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Week 40, 2569" + "'", str38, "Week 40, 2569");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 136197L + "'", long39 == 136197L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod42);
        org.junit.Assert.assertNotNull(year43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod51);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod57);
        org.junit.Assert.assertNotNull(class58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Week 40, 2569" + "'", str66, "Week 40, 2569");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 136197L + "'", long69 == 136197L);
        org.junit.Assert.assertNotNull(regularTimePeriod70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1790744399999L + "'", long71 == 1790744399999L);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1790442000000L + "'", long74 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 40 + "'", int75 == 40);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1790442000000L + "'", long81 == 1790442000000L);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2569 + "'", int90 == 2569);
        org.junit.Assert.assertNotNull(regularTimePeriod91);
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Sun Oct 04 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        org.jfree.data.time.Year year4 = week0.getYear();
        long long5 = week0.getLastMillisecond();
        long long6 = week0.getFirstMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = week0.getMiddleMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1791046799999L + "'", long5 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1790442000000L + "'", long6 == 1790442000000L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        long long4 = week1.getFirstMillisecond();
        org.jfree.data.time.Year year5 = week1.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = week1.previous();
        long long7 = week1.getFirstMillisecond();
        long long8 = week1.getFirstMillisecond();
        java.lang.String str9 = week1.toString();
        org.jfree.data.time.Year year10 = week1.getYear();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week((int) '#', year10);
        java.util.Date date12 = year10.getEnd();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertNotNull(year5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1790442000000L + "'", long7 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1790442000000L + "'", long8 == 1790442000000L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Week 40, 2569" + "'", str9, "Week 40, 2569");
        org.junit.Assert.assertNotNull(year10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Dec 31 23:59:59 ICT 2026");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        java.util.Date date4 = week1.getEnd();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(date4);
        java.util.TimeZone timeZone6 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date4, timeZone6);
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        boolean boolean10 = week8.equals((java.lang.Object) 100);
        java.util.Date date11 = week8.getEnd();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week(date11);
        java.util.TimeZone timeZone13 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date11, timeZone13);
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date4, timeZone13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = week15.next();
        org.jfree.data.time.Year year17 = week15.getYear();
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(2, year17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(year17);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = week0.next();
        long long4 = week0.getMiddleMillisecond();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790744399999L + "'", long4 == 1790744399999L);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(date3);
        java.util.TimeZone timeZone5 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date3, timeZone5);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        boolean boolean9 = week7.equals((java.lang.Object) 100);
        java.util.Date date10 = week7.getEnd();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week(date10);
        java.util.TimeZone timeZone12 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date10, timeZone12);
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date3, timeZone12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = week14.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = week14.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = week14.previous();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week((int) (byte) 10, 60);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week();
        boolean boolean4 = week2.equals((java.lang.Object) 100);
        java.util.Date date5 = week2.getEnd();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date5);
        java.util.TimeZone timeZone7 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week(date5, timeZone7);
        org.jfree.data.time.Week week9 = new org.jfree.data.time.Week();
        boolean boolean11 = week9.equals((java.lang.Object) 100);
        java.util.Date date12 = week9.getEnd();
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date12);
        java.util.TimeZone timeZone14 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date12, timeZone14);
        org.jfree.data.time.Week week16 = new org.jfree.data.time.Week(date5, timeZone14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = week16.next();
        long long18 = week16.getMiddleMillisecond();
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week();
        boolean boolean21 = week19.equals((java.lang.Object) 100);
        org.jfree.data.time.Year year22 = week19.getYear();
        boolean boolean23 = week16.equals((java.lang.Object) year22);
        org.jfree.data.time.Week week24 = new org.jfree.data.time.Week(6, year22);
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week((int) (short) 10, year22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = week25.previous();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1790744399999L + "'", long18 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(year22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week((-1), (int) (byte) 100);
        boolean boolean4 = week2.equals((java.lang.Object) 1790744399999L);
        long long5 = week2.getFirstMillisecond();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week();
        boolean boolean8 = week6.equals((java.lang.Object) 100);
        java.util.Date date9 = week6.getEnd();
        org.jfree.data.time.Week week10 = new org.jfree.data.time.Week(date9);
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week();
        boolean boolean13 = week11.equals((java.lang.Object) 100);
        java.util.Date date14 = week11.getEnd();
        org.jfree.data.time.Week week15 = new org.jfree.data.time.Week(date14);
        java.util.TimeZone timeZone16 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week(date14, timeZone16);
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week();
        boolean boolean20 = week18.equals((java.lang.Object) 100);
        java.util.Date date21 = week18.getEnd();
        org.jfree.data.time.Week week22 = new org.jfree.data.time.Week(date21);
        java.util.TimeZone timeZone23 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week24 = new org.jfree.data.time.Week(date21, timeZone23);
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week(date14, timeZone23);
        long long26 = week25.getLastMillisecond();
        int int27 = week25.getWeek();
        int int28 = week25.getYearValue();
        long long29 = week25.getSerialIndex();
        int int30 = week10.compareTo((java.lang.Object) week25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = week10.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = week10.previous();
        boolean boolean33 = week2.equals((java.lang.Object) regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-76148924400000L) + "'", long5 == (-76148924400000L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1791046799999L + "'", long26 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2569 + "'", int28 == 2569);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 136197L + "'", long29 == 136197L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        boolean boolean3 = week1.equals((java.lang.Object) 100);
        org.jfree.data.time.Year year4 = week1.getYear();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(0, year4);
        int int6 = week5.getYearValue();
        long long7 = week5.getLastMillisecond();
        java.util.Date date8 = week5.getStart();
        java.lang.String str9 = week5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2569 + "'", int6 == 2569);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1766854799999L + "'", long7 == 1766854799999L);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sun Dec 21 00:00:00 ICT 2025");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Week 0, 2569" + "'", str9, "Week 0, 2569");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week((int) '4', 57);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        java.lang.String str1 = week0.toString();
        long long2 = week0.getSerialIndex();
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = week4.previous();
        org.jfree.data.time.Year year6 = week4.getYear();
        boolean boolean7 = week0.equals((java.lang.Object) year6);
        int int8 = week0.getWeek();
        int int9 = week0.getYearValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Week 40, 2569" + "'", str1, "Week 40, 2569");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 136197L + "'", long2 == 136197L);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(year6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2569 + "'", int9 == 2569);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(date3);
        java.util.TimeZone timeZone5 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date3, timeZone5);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        boolean boolean9 = week7.equals((java.lang.Object) 100);
        java.util.Date date10 = week7.getEnd();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week(date10);
        java.util.TimeZone timeZone12 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date10, timeZone12);
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date3, timeZone12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = week14.next();
        long long16 = week14.getMiddleMillisecond();
        long long17 = week14.getLastMillisecond();
        long long18 = week14.getLastMillisecond();
        java.util.Date date19 = week14.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = week14.previous();
        org.jfree.data.time.Week week21 = new org.jfree.data.time.Week();
        boolean boolean23 = week21.equals((java.lang.Object) 100);
        java.util.Date date24 = week21.getEnd();
        long long25 = week21.getFirstMillisecond();
        java.util.Date date26 = week21.getStart();
        org.jfree.data.time.Week week27 = new org.jfree.data.time.Week(date26);
        boolean boolean29 = week27.equals((java.lang.Object) 0);
        boolean boolean30 = week14.equals((java.lang.Object) 0);
        int int31 = week14.getWeek();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = week14.next();
        int int33 = week14.getWeek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1790744399999L + "'", long16 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1791046799999L + "'", long17 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1791046799999L + "'", long18 == 1791046799999L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1790442000000L + "'", long25 == 1790442000000L);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 40 + "'", int31 == 40);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = week1.previous();
        org.jfree.data.time.Year year3 = week1.getYear();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(2569, year3);
        java.lang.String str5 = week4.toString();
        long long6 = week4.getMiddleMillisecond();
        int int8 = week4.compareTo((java.lang.Object) 136165L);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            week4.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Week 9, 2569" + "'", str5, "Week 9, 2569");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1771995599999L + "'", long6 == 1771995599999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.time.Week week2 = new org.jfree.data.time.Week(32, 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = week0.previous();
        long long2 = week0.getFirstMillisecond();
        boolean boolean4 = week0.equals((java.lang.Object) 1L);
        java.util.Date date5 = week0.getStart();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date5);
        java.util.TimeZone timeZone7 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass8 = timeZone7.getClass();
        java.util.Date date9 = null;
        java.util.TimeZone timeZone10 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass8, date9, timeZone10);
        java.lang.Class class12 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass8);
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week();
        boolean boolean15 = week13.equals((java.lang.Object) 100);
        java.util.Date date16 = week13.getEnd();
        java.util.TimeZone timeZone17 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass18 = timeZone17.getClass();
        java.util.Date date19 = null;
        java.util.TimeZone timeZone20 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass18, date19, timeZone20);
        java.lang.Class class22 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass18);
        org.jfree.data.time.Week week23 = new org.jfree.data.time.Week();
        boolean boolean25 = week23.equals((java.lang.Object) 100);
        java.util.Date date26 = week23.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = week23.previous();
        java.util.Date date28 = week23.getStart();
        java.util.Date date29 = week23.getStart();
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week();
        boolean boolean32 = week30.equals((java.lang.Object) 100);
        java.util.Date date33 = week30.getEnd();
        org.jfree.data.time.Week week34 = new org.jfree.data.time.Week(date33);
        java.util.TimeZone timeZone35 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week36 = new org.jfree.data.time.Week(date33, timeZone35);
        org.jfree.data.time.Week week37 = new org.jfree.data.time.Week();
        boolean boolean39 = week37.equals((java.lang.Object) 100);
        java.util.Date date40 = week37.getEnd();
        org.jfree.data.time.Week week41 = new org.jfree.data.time.Week(date40);
        java.util.TimeZone timeZone42 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week43 = new org.jfree.data.time.Week(date40, timeZone42);
        org.jfree.data.time.Week week44 = new org.jfree.data.time.Week(date33, timeZone42);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = org.jfree.data.time.RegularTimePeriod.createInstance(class22, date29, timeZone42);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass8, date16, timeZone42);
        org.jfree.data.time.Week week47 = new org.jfree.data.time.Week(date5, timeZone42);
        org.jfree.data.time.Week week48 = new org.jfree.data.time.Week(date5);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1790442000000L + "'", long2 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod21);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertNull(regularTimePeriod46);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.time.Week week3 = new org.jfree.data.time.Week();
        boolean boolean5 = week3.equals((java.lang.Object) 100);
        java.util.Date date6 = week3.getEnd();
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week(date6);
        java.util.TimeZone timeZone8 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week9 = new org.jfree.data.time.Week(date6, timeZone8);
        org.jfree.data.time.Week week10 = new org.jfree.data.time.Week();
        boolean boolean12 = week10.equals((java.lang.Object) 100);
        java.util.Date date13 = week10.getEnd();
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date13);
        java.util.TimeZone timeZone15 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week16 = new org.jfree.data.time.Week(date13, timeZone15);
        org.jfree.data.time.Week week17 = new org.jfree.data.time.Week(date6, timeZone15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = week17.next();
        long long19 = week17.getMiddleMillisecond();
        org.jfree.data.time.Week week20 = new org.jfree.data.time.Week();
        boolean boolean22 = week20.equals((java.lang.Object) 100);
        org.jfree.data.time.Year year23 = week20.getYear();
        boolean boolean24 = week17.equals((java.lang.Object) year23);
        org.jfree.data.time.Week week25 = new org.jfree.data.time.Week(6, year23);
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week((int) (short) 10, year23);
        org.jfree.data.time.Week week27 = new org.jfree.data.time.Week((int) (byte) 0, year23);
        long long28 = week27.getSerialIndex();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1790744399999L + "'", long19 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(year23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 136157L + "'", long28 == 136157L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        boolean boolean5 = week0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = week0.previous();
        java.util.Date date7 = regularTimePeriod6.getStart();
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = week8.previous();
        long long10 = week8.getFirstMillisecond();
        long long11 = week8.getMiddleMillisecond();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week();
        boolean boolean14 = week12.equals((java.lang.Object) 100);
        java.util.Date date15 = week12.getEnd();
        org.jfree.data.time.Week week16 = new org.jfree.data.time.Week(date15);
        java.util.TimeZone timeZone17 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(date15, timeZone17);
        int int19 = week8.compareTo((java.lang.Object) week18);
        org.jfree.data.time.Week week20 = new org.jfree.data.time.Week();
        boolean boolean22 = week20.equals((java.lang.Object) 100);
        java.util.Date date23 = week20.getEnd();
        org.jfree.data.time.Week week24 = new org.jfree.data.time.Week(date23);
        java.util.TimeZone timeZone25 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week(date23, timeZone25);
        org.jfree.data.time.Week week27 = new org.jfree.data.time.Week();
        boolean boolean29 = week27.equals((java.lang.Object) 100);
        java.util.Date date30 = week27.getEnd();
        org.jfree.data.time.Week week31 = new org.jfree.data.time.Week(date30);
        java.util.TimeZone timeZone32 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week33 = new org.jfree.data.time.Week(date30, timeZone32);
        org.jfree.data.time.Week week34 = new org.jfree.data.time.Week(date23, timeZone32);
        long long35 = week34.getLastMillisecond();
        int int36 = week34.getWeek();
        long long37 = week34.getMiddleMillisecond();
        long long38 = week34.getFirstMillisecond();
        long long39 = week34.getSerialIndex();
        int int40 = week8.compareTo((java.lang.Object) week34);
        long long41 = week34.getMiddleMillisecond();
        org.jfree.data.time.Week week44 = new org.jfree.data.time.Week((int) (short) -1, 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = week44.next();
        boolean boolean46 = week34.equals((java.lang.Object) week44);
        org.jfree.data.time.Year year47 = week34.getYear();
        java.lang.Class<?> wildcardClass48 = year47.getClass();
        java.lang.Class class49 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass48);
        org.jfree.data.time.Week week50 = new org.jfree.data.time.Week();
        boolean boolean52 = week50.equals((java.lang.Object) 100);
        long long53 = week50.getFirstMillisecond();
        java.util.Date date54 = week50.getEnd();
        java.util.Date date55 = week50.getEnd();
        org.jfree.data.time.Week week56 = new org.jfree.data.time.Week();
        boolean boolean58 = week56.equals((java.lang.Object) 100);
        java.util.Date date59 = week56.getEnd();
        org.jfree.data.time.Week week60 = new org.jfree.data.time.Week(date59);
        java.util.TimeZone timeZone61 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week62 = new org.jfree.data.time.Week(date59, timeZone61);
        org.jfree.data.time.Week week63 = new org.jfree.data.time.Week();
        boolean boolean65 = week63.equals((java.lang.Object) 100);
        java.util.Date date66 = week63.getEnd();
        org.jfree.data.time.Week week67 = new org.jfree.data.time.Week(date66);
        java.util.TimeZone timeZone68 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week69 = new org.jfree.data.time.Week(date66, timeZone68);
        org.jfree.data.time.Week week70 = new org.jfree.data.time.Week(date59, timeZone68);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass48, date55, timeZone68);
        org.jfree.data.time.Week week72 = new org.jfree.data.time.Week(date7, timeZone68);
        org.jfree.data.time.Week week73 = new org.jfree.data.time.Week(date7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Sep 20 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1790442000000L + "'", long10 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1790744399999L + "'", long11 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1791046799999L + "'", long35 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 40 + "'", int36 == 40);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1790744399999L + "'", long37 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1790442000000L + "'", long38 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 136197L + "'", long39 == 136197L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1790744399999L + "'", long41 == 1790744399999L);
        org.junit.Assert.assertNotNull(regularTimePeriod45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(year47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1790442000000L + "'", long53 == 1790442000000L);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod71);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        java.util.Date date5 = week0.getStart();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date5);
        java.util.Date date7 = week6.getEnd();
        org.jfree.data.time.Week week8 = new org.jfree.data.time.Week();
        boolean boolean10 = week8.equals((java.lang.Object) 100);
        java.util.Date date11 = week8.getEnd();
        org.jfree.data.time.Week week12 = new org.jfree.data.time.Week(date11);
        java.util.TimeZone timeZone13 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass14 = timeZone13.getClass();
        java.util.Date date15 = null;
        java.util.TimeZone timeZone16 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass14, date15, timeZone16);
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week(date11, timeZone16);
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week(date7, timeZone16);
        java.util.TimeZone timeZone20 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass21 = timeZone20.getClass();
        java.util.Date date22 = null;
        java.util.TimeZone timeZone23 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass21, date22, timeZone23);
        java.lang.Class class25 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass21);
        org.jfree.data.time.Week week26 = new org.jfree.data.time.Week();
        long long27 = week26.getFirstMillisecond();
        int int28 = week26.getWeek();
        java.util.Date date29 = week26.getEnd();
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week();
        boolean boolean32 = week30.equals((java.lang.Object) 100);
        java.util.Date date33 = week30.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = week30.previous();
        java.util.Date date35 = week30.getStart();
        java.util.TimeZone timeZone36 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass37 = timeZone36.getClass();
        java.util.Date date38 = null;
        java.util.TimeZone timeZone39 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass37, date38, timeZone39);
        java.lang.Class class41 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass37);
        org.jfree.data.time.Week week42 = new org.jfree.data.time.Week();
        boolean boolean44 = week42.equals((java.lang.Object) 100);
        java.util.Date date45 = week42.getEnd();
        java.util.TimeZone timeZone46 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass37, date45, timeZone46);
        org.jfree.data.time.Week week48 = new org.jfree.data.time.Week(date35, timeZone46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = org.jfree.data.time.RegularTimePeriod.createInstance(class25, date29, timeZone46);
        java.util.TimeZone timeZone50 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass51 = timeZone50.getClass();
        org.jfree.data.time.Week week52 = new org.jfree.data.time.Week();
        boolean boolean54 = week52.equals((java.lang.Object) 100);
        java.util.Date date55 = week52.getEnd();
        long long56 = week52.getFirstMillisecond();
        java.util.Date date57 = week52.getStart();
        org.jfree.data.time.Week week58 = new org.jfree.data.time.Week();
        boolean boolean60 = week58.equals((java.lang.Object) 100);
        java.util.Date date61 = week58.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = week58.previous();
        java.util.Date date63 = week58.getStart();
        java.util.TimeZone timeZone64 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass65 = timeZone64.getClass();
        java.util.Date date66 = null;
        java.util.TimeZone timeZone67 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass65, date66, timeZone67);
        java.lang.Class class69 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass65);
        org.jfree.data.time.Week week70 = new org.jfree.data.time.Week();
        boolean boolean72 = week70.equals((java.lang.Object) 100);
        java.util.Date date73 = week70.getEnd();
        java.util.TimeZone timeZone74 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass65, date73, timeZone74);
        org.jfree.data.time.Week week76 = new org.jfree.data.time.Week(date63, timeZone74);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass51, date57, timeZone74);
        java.util.TimeZone timeZone78 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass79 = timeZone78.getClass();
        java.util.Date date80 = null;
        java.util.TimeZone timeZone81 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod82 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass79, date80, timeZone81);
        java.lang.Class class83 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass79);
        org.jfree.data.time.Week week84 = new org.jfree.data.time.Week();
        boolean boolean86 = week84.equals((java.lang.Object) 100);
        java.util.Date date87 = week84.getEnd();
        java.util.TimeZone timeZone88 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod89 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass79, date87, timeZone88);
        org.jfree.data.time.Week week90 = new org.jfree.data.time.Week(date57, timeZone88);
        org.jfree.data.time.Week week91 = new org.jfree.data.time.Week(date29, timeZone88);
        org.jfree.data.time.Week week92 = new org.jfree.data.time.Week(date7, timeZone88);
        java.util.Calendar calendar93 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long94 = week92.getMiddleMillisecond(calendar93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod17);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1790442000000L + "'", long27 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 40 + "'", int28 == 40);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod40);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod47);
        org.junit.Assert.assertNotNull(regularTimePeriod49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1790442000000L + "'", long56 == 1790442000000L);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod62);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod68);
        org.junit.Assert.assertNotNull(class69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone74);
        org.junit.Assert.assertEquals(timeZone74.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod75);
        org.junit.Assert.assertNull(regularTimePeriod77);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod82);
        org.junit.Assert.assertNotNull(class83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone88);
        org.junit.Assert.assertEquals(timeZone88.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod89);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        long long2 = week1.getFirstMillisecond();
        org.jfree.data.time.Year year3 = week1.getYear();
        org.jfree.data.time.Year year4 = week1.getYear();
        org.jfree.data.time.Week week5 = new org.jfree.data.time.Week(4, year4);
        java.lang.String str6 = week5.toString();
        int int7 = week5.getWeek();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1790442000000L + "'", long2 == 1790442000000L);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertNotNull(year4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Week 4, 2569" + "'", str6, "Week 4, 2569");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        long long4 = week0.getFirstMillisecond();
        java.util.Date date5 = week0.getStart();
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date5);
        boolean boolean8 = week6.equals((java.lang.Object) 0.0f);
        long long9 = week6.getFirstMillisecond();
        long long10 = week6.getLastMillisecond();
        long long11 = week6.getMiddleMillisecond();
        long long12 = week6.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = week6.next();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1790442000000L + "'", long4 == 1790442000000L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1790442000000L + "'", long9 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1791046799999L + "'", long10 == 1791046799999L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1790744399999L + "'", long11 == 1790744399999L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1790744399999L + "'", long12 == 1790744399999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        long long3 = week0.getFirstMillisecond();
        boolean boolean5 = week0.equals((java.lang.Object) (byte) 1);
        int int6 = week0.getWeek();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = week0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = week0.next();
        java.lang.String str9 = week0.toString();
        java.util.Date date10 = week0.getEnd();
        java.util.TimeZone timeZone11 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass12 = timeZone11.getClass();
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week();
        boolean boolean15 = week13.equals((java.lang.Object) 100);
        java.util.Date date16 = week13.getEnd();
        long long17 = week13.getFirstMillisecond();
        java.util.Date date18 = week13.getStart();
        org.jfree.data.time.Week week19 = new org.jfree.data.time.Week();
        boolean boolean21 = week19.equals((java.lang.Object) 100);
        java.util.Date date22 = week19.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = week19.previous();
        java.util.Date date24 = week19.getStart();
        java.util.TimeZone timeZone25 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass26 = timeZone25.getClass();
        java.util.Date date27 = null;
        java.util.TimeZone timeZone28 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass26, date27, timeZone28);
        java.lang.Class class30 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass26);
        org.jfree.data.time.Week week31 = new org.jfree.data.time.Week();
        boolean boolean33 = week31.equals((java.lang.Object) 100);
        java.util.Date date34 = week31.getEnd();
        java.util.TimeZone timeZone35 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass26, date34, timeZone35);
        org.jfree.data.time.Week week37 = new org.jfree.data.time.Week(date24, timeZone35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass12, date18, timeZone35);
        java.util.TimeZone timeZone39 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass40 = timeZone39.getClass();
        java.util.Date date41 = null;
        java.util.TimeZone timeZone42 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass40, date41, timeZone42);
        java.lang.Class class44 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass40);
        org.jfree.data.time.Week week45 = new org.jfree.data.time.Week();
        boolean boolean47 = week45.equals((java.lang.Object) 100);
        java.util.Date date48 = week45.getEnd();
        java.util.TimeZone timeZone49 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass40, date48, timeZone49);
        org.jfree.data.time.Week week51 = new org.jfree.data.time.Week(date18, timeZone49);
        org.jfree.data.time.Week week52 = new org.jfree.data.time.Week(date10, timeZone49);
        org.jfree.data.time.Week week54 = new org.jfree.data.time.Week();
        boolean boolean56 = week54.equals((java.lang.Object) 100);
        long long57 = week54.getFirstMillisecond();
        org.jfree.data.time.Year year58 = week54.getYear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = week54.previous();
        org.jfree.data.time.Year year60 = week54.getYear();
        org.jfree.data.time.Year year61 = week54.getYear();
        org.jfree.data.time.Week week62 = new org.jfree.data.time.Week(6, year61);
        int int63 = week62.getYearValue();
        boolean boolean64 = week52.equals((java.lang.Object) int63);
        org.jfree.data.time.Year year65 = week52.getYear();
        java.util.Date date66 = week52.getStart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1790442000000L + "'", long3 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Week 40, 2569" + "'", str9, "Week 40, 2569");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1790442000000L + "'", long17 == 1790442000000L);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod29);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod36);
        org.junit.Assert.assertNull(regularTimePeriod38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod43);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1790442000000L + "'", long57 == 1790442000000L);
        org.junit.Assert.assertNotNull(year58);
        org.junit.Assert.assertNotNull(regularTimePeriod59);
        org.junit.Assert.assertNotNull(year60);
        org.junit.Assert.assertNotNull(year61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2569 + "'", int63 == 2569);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(year65);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sun Sep 27 00:00:00 ICT 2026");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        boolean boolean2 = week0.equals((java.lang.Object) 100);
        java.util.Date date3 = week0.getEnd();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(date3);
        java.util.TimeZone timeZone5 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week6 = new org.jfree.data.time.Week(date3, timeZone5);
        org.jfree.data.time.Week week7 = new org.jfree.data.time.Week();
        boolean boolean9 = week7.equals((java.lang.Object) 100);
        java.util.Date date10 = week7.getEnd();
        org.jfree.data.time.Week week11 = new org.jfree.data.time.Week(date10);
        java.util.TimeZone timeZone12 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week13 = new org.jfree.data.time.Week(date10, timeZone12);
        org.jfree.data.time.Week week14 = new org.jfree.data.time.Week(date3, timeZone12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = week14.next();
        org.jfree.data.time.Year year16 = week14.getYear();
        java.util.Date date17 = year16.getStart();
        org.jfree.data.time.Week week18 = new org.jfree.data.time.Week();
        boolean boolean20 = week18.equals((java.lang.Object) 100);
        long long21 = week18.getFirstMillisecond();
        boolean boolean23 = week18.equals((java.lang.Object) (byte) 1);
        int int24 = week18.getWeek();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = week18.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = week18.next();
        java.lang.String str27 = week18.toString();
        java.util.Date date28 = week18.getEnd();
        org.jfree.data.time.Week week29 = new org.jfree.data.time.Week(date28);
        org.jfree.data.time.Week week30 = new org.jfree.data.time.Week();
        boolean boolean32 = week30.equals((java.lang.Object) 100);
        java.util.Date date33 = week30.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = week30.previous();
        java.util.Date date35 = week30.getStart();
        java.util.TimeZone timeZone36 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass37 = timeZone36.getClass();
        java.util.Date date38 = null;
        java.util.TimeZone timeZone39 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass37, date38, timeZone39);
        java.lang.Class class41 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass37);
        org.jfree.data.time.Week week42 = new org.jfree.data.time.Week();
        boolean boolean44 = week42.equals((java.lang.Object) 100);
        java.util.Date date45 = week42.getEnd();
        java.util.TimeZone timeZone46 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass37, date45, timeZone46);
        org.jfree.data.time.Week week48 = new org.jfree.data.time.Week(date35, timeZone46);
        org.jfree.data.time.Week week49 = new org.jfree.data.time.Week();
        boolean boolean51 = week49.equals((java.lang.Object) 100);
        java.util.Date date52 = week49.getEnd();
        org.jfree.data.time.Week week53 = new org.jfree.data.time.Week(date52);
        java.util.TimeZone timeZone54 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.Week week55 = new org.jfree.data.time.Week(date52, timeZone54);
        org.jfree.data.time.Week week56 = new org.jfree.data.time.Week(date35, timeZone54);
        org.jfree.data.time.Week week57 = new org.jfree.data.time.Week();
        boolean boolean59 = week57.equals((java.lang.Object) 100);
        java.util.Date date60 = week57.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod61 = week57.previous();
        java.util.Date date62 = week57.getStart();
        java.util.TimeZone timeZone63 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        java.lang.Class<?> wildcardClass64 = timeZone63.getClass();
        java.util.Date date65 = null;
        java.util.TimeZone timeZone66 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod67 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass64, date65, timeZone66);
        java.lang.Class class68 = org.jfree.data.time.RegularTimePeriod.downsize((java.lang.Class) wildcardClass64);
        org.jfree.data.time.Week week69 = new org.jfree.data.time.Week();
        boolean boolean71 = week69.equals((java.lang.Object) 100);
        java.util.Date date72 = week69.getEnd();
        java.util.TimeZone timeZone73 = org.jfree.data.time.RegularTimePeriod.DEFAULT_TIME_ZONE;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod74 = org.jfree.data.time.RegularTimePeriod.createInstance((java.lang.Class) wildcardClass64, date72, timeZone73);
        org.jfree.data.time.Week week75 = new org.jfree.data.time.Week(date62, timeZone73);
        org.jfree.data.time.Week week76 = new org.jfree.data.time.Week(date35, timeZone73);
        org.jfree.data.time.Week week77 = new org.jfree.data.time.Week(date28, timeZone73);
        org.jfree.data.time.Week week78 = new org.jfree.data.time.Week(date17, timeZone73);
        java.util.Date date79 = week78.getEnd();
        java.util.Calendar calendar80 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long81 = week78.getFirstMillisecond(calendar80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(year16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1790442000000L + "'", long21 == 1790442000000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Week 40, 2569" + "'", str27, "Week 40, 2569");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod40);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod61);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Sep 27 00:00:00 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod67);
        org.junit.Assert.assertNotNull(class68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(regularTimePeriod74);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Sat Jan 03 23:59:59 ICT 2026");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        long long1 = week0.getFirstMillisecond();
        org.jfree.data.time.Year year2 = week0.getYear();
        java.util.Date date3 = week0.getEnd();
        java.lang.String str4 = week0.toString();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = week0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1790442000000L + "'", long1 == 1790442000000L);
        org.junit.Assert.assertNotNull(year2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Oct 03 23:59:59 ICT 2026");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Week 40, 2569" + "'", str4, "Week 40, 2569");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = week1.previous();
        org.jfree.data.time.Year year3 = week1.getYear();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(2569, year3);
        int int6 = week4.compareTo((java.lang.Object) (byte) 10);
        int int7 = week4.getYearValue();
        int int8 = week4.getYearValue();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = week4.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(year3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2569 + "'", int7 == 2569);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2569 + "'", int8 == 2569);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.time.Week week1 = new org.jfree.data.time.Week();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = week1.previous();
        org.jfree.data.time.Year year3 = week1.getYear();
        org.jfree.data.time.Week week4 = new org.jfree.data.time.Week(2569, year3);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = week4.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(year3);
    }
}

