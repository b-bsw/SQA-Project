package org.apache.commons.lang.time;

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
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date11, 3600000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 08 00:00:00 ICT 2380");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1001);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMonths(date32, 2);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Aug 28 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Feb 02 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Feb 02 00:00:00 ICT 1972");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date21, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon May 01 00:26:42 ICT 1978");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Mar 05 00:26:42 ICT 1985");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (-1));
        java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date20, 3);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Jan 07 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 07 23:59:59 ICT 1975");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (byte) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 0, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date17, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = org.apache.commons.lang.time.DateUtils.round(date22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 00:00:00 ICT 1969");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 08 00:00:00 ICT 1970");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date11, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date11, 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, 4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:04:00 ICT 543");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, (int) (byte) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 1001);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date31, 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1001);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMinutes(date37, 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 86400000);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator44 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 28 00:10:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Nov 25 00:16:42 ICT 1657858");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date15, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, (int) (short) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date19, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date21, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jun 14 00:00:00 ICT 9314");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1001);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (byte) 100);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date32);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:16:41 ICT 1970");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, (int) (short) 10);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 1001);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, 4);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (byte) 100);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date33, 3600000);
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addHours(date15, (int) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:18:22 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:18:22 ICT 3601970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Jan 02 11:00:00 ICT 1970");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date17, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date17, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 1000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date15, (int) ' ');
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.truncate(date27, 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, 4);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, (int) '#');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 60000);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date37, 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, (int) (byte) 1);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date39);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Aug 31 00:00:01 ICT 1973");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Feb 11 16:00:01 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (-1));
        java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date20, 3);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, 5);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date24, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator30 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 97 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Jan 07 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Jan 07 23:59:59 ICT 1975");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Apr 10 23:59:59 ICT 70965");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date26, 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date38, date46);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addDays(date57, (-1));
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date57);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, (int) (byte) 0);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addSeconds(date70, 1);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.truncate(date70, 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addWeeks(date74, 4);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date74, (int) '#');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date74, 60000);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date57, date80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addSeconds(date57, (int) (short) -1);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (byte) 10);
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date57);
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date26);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addHours(date26, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Tue Jan 01 00:00:01 ICT 1980");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date17);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 1001);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date7, 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Apr 11 00:00:00 ICT 1970");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date18, (int) (short) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate(date20, 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addWeeks(date24, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Nov 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Jan 01 16:40:00 ICT 543");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Dec 02 16:40:00 ICT 542");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date21, (int) (byte) 100);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (-1));
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (byte) 100);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date21);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Jan 01 00:00:01 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:00:01 ICT 1969");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 6);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date23, 1);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date33, date41);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date41);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, (int) '4');
        java.util.Iterator iterator47 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date41, 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 15 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:52 ICT 1970");
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (byte) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 0, (int) (byte) -1);
        java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date20, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.Class<?> wildcardClass17 = date15.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date23, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 30 01:43:01 ICT 1970");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate(date13, (int) (byte) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date17, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date20, 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date22, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 01 00:00:00 ICT 544");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (-1));
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, 6);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) (byte) 1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 1001);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date36, 4);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMinutes(date40, (int) (short) 0);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date22, date40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date22, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 23:59:59 ICT 1975");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Dec 02 00:16:42 ICT 1971");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Dec 02 00:16:42 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 3600000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) '#');
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date23, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 578");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Jan 01 05:00:00 ICT 578");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 05:00:00 ICT 578");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(obj0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) '#');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date31, (int) (short) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date31, 4);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Apr 01 00:00:00 ICT 1973");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Dec 01 00:00:00 ICT 2072");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 4);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, 6);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date33);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addSeconds(date42, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, (-1));
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date44);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, (int) (byte) 1);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.round(date57, (int) (byte) 1);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 1001);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date25, 1001);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, (int) 'a');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addDays(date25, 3);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addDays(date70, (int) ' ');
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date72);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:16:42 ICT 1976");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sun Jan 04 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date23, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, 4);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date27, (int) '#');
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date27);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 100);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date15, 0);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date44, 1);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameInstant(date54, date62);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date44, date54);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addWeeks(date44, 1001);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.round(date66, (int) (short) 1);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date68);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addHours(date36, (int) (short) 0);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 3600000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sun Jan 01 00:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 60000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 60000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 16:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 04 00:00:00 ICT 3119");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (short) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 1000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date15, 1000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 5);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date21, 2);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 0);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date31, (int) (short) -1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date35, (int) (byte) 1, 6);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate(date46, 0);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date50, (int) (short) 0);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date50, (int) 'a');
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, 1);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date62, 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addWeeks(date66, 4);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date66, (int) '#');
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date54, date66);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.round(date54, (int) (short) 0);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addMinutes(date54, (int) (short) -1);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameInstant(date38, date75);
        boolean boolean77 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date75);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addMonths(date21, (int) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Mar 01 01:40:01 ICT 1989");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Feb 10 17:40:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Feb 10 17:40:06 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 23:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Fri Dec 31 23:59:00 ICT 544");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Wed Jan 10 17:40:06 ICT 1973");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date17, 2, 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, 5);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date39, date47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1001);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addSeconds(date50, (int) (byte) 100);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) (short) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date50, (int) 'a', 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date50, (int) (short) 10);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addWeeks(date50, 5);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.round(date50, (int) (byte) 0);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date63);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.add(date63, (int) (byte) 0, (int) (short) 100);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.add(date67, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Nov 01 00:00:00 ICT 2002");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Jan 11 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Feb 05 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Jan 01 00:00:00 ICT 643");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator(date19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun May 21 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Apr 22 00:00:03 ICT 3128");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date19, 2);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) (short) 0);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 1);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date46);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMonths(date46, 3);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date51, (int) (short) 0);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) (byte) 0);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.truncate(date26, 1001);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (byte) 100);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date9, 5);
        java.lang.Class<?> wildcardClass18 = date17.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date15, 3, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date15, 0, (int) (short) 1);
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 2);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 02:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 02:00:01 ICT 1969");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date9, 5);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, 2, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:01:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jun 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Jun 01 00:00:01 ICT 1970");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 4);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, (int) '#');
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 60000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, (int) (short) -1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addYears(date26, (int) (byte) 10);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, 1);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addDays(date64, (-1));
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addSeconds(date66, 2);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addSeconds(date68, (int) (short) 10);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date70);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.truncate(date70, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Tue Jan 01 00:00:01 ICT 1980");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Mon Dec 01 00:00:00 ICT 1969");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, (int) (short) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 32 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 00:00:01 ICT 1970");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, 6);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (short) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Feb 10 00:06:00 ICT 1971");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) '#');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 0);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, (int) 'a');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date33, 60000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 01:37:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 61970");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date27, (int) (short) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, 4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jan 05 00:00:00 ICT 1971");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date13, 0, 1);
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) (byte) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) (short) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date11, 4, (int) '4');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) '#');
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date24, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Jan 11 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Dec 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, 6);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) '#');
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addSeconds(date50, 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, (int) (byte) 1);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date52, 1);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 6);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addMonths(date58, 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addHours(date58, 6);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addWeeks(date62, (int) '#');
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Fri Jan 02 06:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Fri Sep 04 06:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date26, 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date38, date46);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addDays(date57, (-1));
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date57);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, (int) (byte) 0);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addSeconds(date70, 1);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.truncate(date70, 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addWeeks(date74, 4);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date74, (int) '#');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date74, 60000);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date57, date80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addSeconds(date57, (int) (short) -1);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (byte) 10);
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date57);
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date26);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Tue Jan 01 00:00:01 ICT 1980");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Sep 03 00:00:00 ICT 1970");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date11, 5);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addYears(date25, (int) (short) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date37);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date37, 3);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addDays(date37, 2);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date52, 1);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addYears(date52, (int) (short) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date64, 1);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date56, date64);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addMonths(date64, 3);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date69, (int) (short) 0);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameInstant(date44, date71);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addDays(date44, 1001);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) ' ');
        boolean boolean77 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date44);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Dec 31 00:00:01 ICT 2069");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sat Sep 30 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 03 00:00:00 ICT 2002");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date19, 2);
        java.util.Iterator iterator28 = org.apache.commons.lang.time.DateUtils.iterator(date19, 1);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, (-1));
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, (int) (byte) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addDays(date38, (int) (short) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameInstant(date52, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMinutes(date60, (int) (byte) 0);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (byte) 100);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameDay(date44, date65);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray73);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addSeconds(date74, 1);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addYears(date74, (int) (short) 0);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date78, (int) (byte) 1);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameDay(date65, date80);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.add(date80, 3, 2);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date84);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 15 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1001);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) (byte) 1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) '4');
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, (int) (byte) -1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date38, (int) ' ');
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMonths(date42, (int) '#');
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMinutes(date45, (int) (short) 10);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Mar 09 00:00:01 ICT 2021");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Mar 09 00:00:01 ICT 2021");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Aug 31 00:00:01 ICT 1973");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jul 31 00:00:01 ICT 1976");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jul 31 00:10:01 ICT 1976");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Jul 31 00:00:01 ICT 1976");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1000);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date31, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator37 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Sep 27 00:00:01 ICT 1972");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (byte) 100);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (-1));
        java.lang.Class<?> wildcardClass16 = date9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date7, 0, 3);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMonths(date7, 1000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date7, 1, 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 0, 5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu May 01 00:00:00 ICT 2053");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 4);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, (int) '#');
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 60000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date49, 4);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 60000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.round(date49, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Feb 11 16:00:00 ICT 539");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Feb 12 08:40:00 ICT 543");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 86400000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Sep 28 00:00:01 ICT 1972");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date24, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator30 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date28, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 86400000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue May 12 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date17, 2, 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round(date31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jan 01 00:00:01 ICT 2002");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date27, (int) (short) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Jan 11 00:00:00 ICT 1971");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date11, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date11, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date19, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, (int) (short) -1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date23, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Feb 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (byte) 100);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date36);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 1);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date45, (int) (short) 0);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, (int) (byte) 1);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date51);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date51, 3, 2);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.add(date51, 5, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 15 00:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sun Jan 11 00:01:00 ICT 1970");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date15, 3, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date15, 0, (int) (short) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) '4');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) (short) 10);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 6);
        java.lang.Class<?> wildcardClass28 = date23.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Feb 22 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Iterator iterator40 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date35, 3);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date35, 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addSeconds(date50, 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate(date50, 0);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, (int) ' ');
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date64, 1);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addWeeks(date66, (int) (byte) 1);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addDays(date66, 1);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addWeeks(date66, (int) '4');
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addDays(date72, (int) (byte) -1);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date74, 5);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMinutes(date74, 6);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date78, (int) 'a');
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date56, date78);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addWeeks(date78, 6);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date83, (int) (short) 1);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date83, 3600000);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addWeeks(date87, 6);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addMonths(date87, 0);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date91);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Dec 31 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Wed Feb 10 01:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Wed Mar 24 01:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Wed Feb 10 01:06:01 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, 0, 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date17);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 1001);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) (short) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 1);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date49);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date41, 60000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date54, (int) 'a');
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date56);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date29, 0, 5);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date29, 1001);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Jul 17 00:00:00 ICT 2134");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Mar 09 00:00:00 ICT 2990");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (-1));
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date21);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 2);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 5);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date28, 5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:05:01 ICT 1970");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (byte) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date13, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date13, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:16:43 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) '4');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMinutes(date20, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator24 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Apr 04 16:00:00 ICT 1970");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 100);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) -1);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Dec 31 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Nov 30 00:00:03 ICT 1973");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date7, (int) (byte) 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, (int) (byte) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addDays(date32, (-1));
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addHours(date34, 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date36);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 10:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Nov 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Feb 28 00:00:00 ICT 543");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1001);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, 86400000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, (int) (short) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date47, 1);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addDays(date49, (-1));
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addWeeks(date49, (int) (byte) 10);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date49, (int) (short) 0);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray70);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameInstant(date63, date71);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMinutes(date71, (int) (byte) 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addYears(date71, (int) (byte) 100);
        boolean boolean77 = org.apache.commons.lang.time.DateUtils.isSameDay(date55, date76);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray84);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addSeconds(date85, 1);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addYears(date85, (int) (short) 0);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addMinutes(date89, (int) (byte) 1);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameDay(date76, date91);
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addWeeks(date76, 3600000);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addSeconds(date94, 3600000);
        boolean boolean97 = org.apache.commons.lang.time.DateUtils.isSameInstant(date39, date96);
        java.util.Date date99 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, 6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 28 00:00:00 ICT 1657858");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 28 00:35:00 ICT 1657858");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 28 00:35:00 ICT 1657858");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Jan 01 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Wed Apr 05 00:00:00 ICT 71065");
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Tue May 16 16:00:00 ICT 71065");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(date99);
        org.junit.Assert.assertEquals(date99.toString(), "Thu Jan 28 00:35:00 ICT 1657858");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1001);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1000);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addDays(date45, (-1));
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date47, 2);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date47);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date47, 2);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMonths(date52, (int) (short) 10);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date52, 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Aug 28 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Oct 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 00:00:01 ICT 1969");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) '4');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date17, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 2022");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) (byte) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) (short) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date11, 4, (int) '4');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) '#');
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date24, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Jan 11 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Dec 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 00:00:00 ICT 1980");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameInstant(date8, date16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, (int) (byte) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) (short) 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round(date19, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Jan 11 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 3);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date33);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addSeconds(date42, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, (-1));
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addWeeks(date44, (int) (byte) 0);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addSeconds(date57, 1);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.truncate(date57, 0);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addWeeks(date61, 4);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date61, (int) '#');
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMinutes(date61, 60000);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date44, date67);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addSeconds(date76, 1);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addDays(date78, (-1));
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addSeconds(date80, 2);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addSeconds(date82, (int) (short) 10);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameInstant(date67, date84);
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date84);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addHours(date84, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date90 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 6");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 03:03:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Wed Dec 31 06:00:13 ICT 1969");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 6);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date17, 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:09 ICT 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Apr 10 00:00:03 ICT 1970");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 6);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date23, 1);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date33, date41);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date41);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date51, date59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 1001);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, (int) (byte) 100);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMonths(date62, 86400000);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.truncate(date62, (int) (short) 1);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.round(date62, (int) (byte) 0);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addDays(date62, 1001);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date62);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date62, (int) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 15 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Sep 28 00:16:41 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:16:41 ICT 1970");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (byte) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date13, 5);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date43, date51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1001);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, (int) (byte) 100);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.truncate(date35, (int) (byte) 0);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date59);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator62 = org.apache.commons.lang.time.DateUtils.iterator(date13, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:16:43 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date31, (int) (byte) 100);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date15, 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.round(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date41, 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addDays(date43, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date45, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Tue Jun 20 00:00:00 ICT 11826");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date20, 60000);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (short) -1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addDays(date38, 60000);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 1);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date53, (-1));
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 2);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMinutes(date55, (int) (short) 100);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMonths(date59, (int) 'a');
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date59);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameInstant(date22, date38);
        java.util.Iterator iterator65 = org.apache.commons.lang.time.DateUtils.iterator(date22, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date67 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 02 00:01:00 ICT 1971");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Jan 31 01:40:01 ICT 1978");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator65);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, (int) (short) 10);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date28, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date30, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:10 ICT 543");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:10 ICT 543");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, (int) (byte) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 1001);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date31, 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1001);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMinutes(date37, 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 86400000);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date39);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameInstant(date50, date58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date58, (int) (short) -1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.truncate(date61, (int) (byte) 1);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray70);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addSeconds(date71, 1);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addDays(date73, (-1));
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addSeconds(date75, 2);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addSeconds(date77, (int) (short) 10);
        boolean boolean80 = org.apache.commons.lang.time.DateUtils.isSameDay(date63, date77);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addWeeks(date77, (int) (short) -1);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addHours(date82, 3);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addMonths(date84, 0);
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date86);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 28 00:10:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Nov 25 00:16:42 ICT 1657858");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Dec 24 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Wed Dec 24 03:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Wed Dec 24 03:00:03 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) '4');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 5);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Nov 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri May 29 00:00:00 ICT 539");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Mar 05 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 06 00:00:00 ICT 543");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date17, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (byte) 100);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round(date21, (int) (short) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 1001);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon May 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun May 01 00:00:00 ICT 2078");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Jan 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Jun 01 00:00:00 ICT 2061");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, (int) (byte) 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date39, (int) (byte) 1);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 1001);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 1001);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, (int) 'a');
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date7, (int) (short) 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 4);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, (int) (short) 1);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date64, 1);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.truncate(date64, 0);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.round(date68, (int) (short) 0);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addHours(date70, (int) (short) 100);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date70, 0, 0);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameInstant(date54, date70);
        java.util.Iterator iterator78 = org.apache.commons.lang.time.DateUtils.iterator(date54, 3);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addDays(date54, (int) (byte) 1);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addDays(date80, (-1));
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date82, 10);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addMonths(date82, (int) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Fri Jan 30 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 29 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Tue Feb 28 00:00:00 ICT 1978");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (short) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, (int) 'a');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date17, 1001);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) ' ');
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, 1);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addYears(date41, (int) (short) 0);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate(date45, (int) (short) 0);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addDays(date47, 60000);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addHours(date47, 10);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addHours(date47, 86400000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date47, (int) (short) 10);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date47);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 31 01:40:01 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jun 30 01:40:01 ICT 2061");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Tue Apr 10 00:00:00 ICT 379");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Jan 01 10:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jun 14 00:00:00 ICT 9314");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Dec 31 00:00:03 ICT 2004");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Apr 07 00:00:03 ICT 1970");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun May 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun May 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Jan 01 10:00:00 ICT 543");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date13, 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, (-1));
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date13, 2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date26, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:01:01 ICT 1970");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date17, 2, 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, 5);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, (int) (byte) 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date41, date49);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addDays(date60, (-1));
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date60);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMonths(date41, (int) '#');
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date65, (int) (short) 10);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.round(date67, 2);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addDays(date69, (int) '4');
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameInstant(date29, date69);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Nov 01 00:00:00 ICT 2002");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Nov 01 00:01:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Mon Jan 22 00:00:00 ICT 1973");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 10);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date25, 1);
        java.util.Iterator iterator31 = org.apache.commons.lang.time.DateUtils.iterator(date29, 3);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, 6);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date33, 5);
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date35);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray63);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameInstant(date56, date64);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, 1001);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addWeeks(date56, (int) (byte) 100);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date48, date69);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date69);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addWeeks(date69, (int) (byte) -1);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.add(date69, (int) (byte) 100, (int) (short) 0);
        java.lang.String[] strArray83 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray83);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addSeconds(date84, 1);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.truncate(date84, 0);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.addWeeks(date88, 4);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date88, (int) '#');
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addMinutes(date88, 60000);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addSeconds(date88, (int) (byte) 1);
        java.util.Date date98 = org.apache.commons.lang.time.DateUtils.truncate(date88, 0);
        boolean boolean99 = org.apache.commons.lang.time.DateUtils.isSameInstant(date76, date88);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Jan 11 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Feb 13 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Nov 25 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Sat Jan 01 00:00:01 ICT 543");
        org.junit.Assert.assertNotNull(date98);
        org.junit.Assert.assertEquals(date98.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, (-1));
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date27, 100);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, (int) '4');
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date32, 3600000);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date34, 1000);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, (int) (byte) 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date38, (int) (byte) 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Apr 30 00:52:03 ICT 1978");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sun Apr 30 01:52:03 ICT 1978");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Apr 30 01:52:04 ICT 1978");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Apr 30 01:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Jan 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Dec 31 23:59:59 ICT 1977");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date15, 6);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date15, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 02 06:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:02 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 10:00:01 ICT 1970");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (byte) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 6);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (short) -1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date43);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date52, 1);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date54, (-1));
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date54);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray64);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date65, 1);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addWeeks(date67, (int) (byte) 1);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.round(date67, (int) (byte) 1);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date71);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date35, 1001);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date35, 1001);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) 'a');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.round(date35, (int) (short) 1);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date80);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 28 00:10:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Feb 28 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Feb 28 00:00:06 ICT 543");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Feb 28 00:00:06 ICT 543");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Mon Feb 21 00:00:06 ICT 543");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) (byte) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator35 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 30 01:43:01 ICT 1971");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 01:43:02 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 01:43:12 ICT 1970");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (short) 100);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) (byte) 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) '4');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date37, 5);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date39, (int) (byte) 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, (int) (short) 1, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date44, 5);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addYears(date44, (int) (byte) 10);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date48, 0);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date48);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 31 00:00:01 ICT 1975");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 00:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Fri Dec 31 00:00:01 ICT 1976");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Feb 04 00:00:01 ICT 1977");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 00:00:01 ICT 1986");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (short) 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date7, (int) (short) -1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 2, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator30 = org.apache.commons.lang.time.DateUtils.iterator(date25, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:00 ICT 301969");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (short) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (-1));
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 2);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date33, 1001);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date35, 3, (int) (short) 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.add(date35, 0, (int) (short) 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '4');
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, (int) (short) 10);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addWeeks(date45, 1000);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date47);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:41 ICT 1978");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Feb 22 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sun Apr 23 00:10:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, (-1));
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, (int) (short) 10);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date27);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) 10);
        java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator(date9, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date39, (int) (short) 100);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date51, date59);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray67);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addSeconds(date68, 1);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addDays(date70, (-1));
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date51, date70);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addSeconds(date81, 1);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addWeeks(date83, (int) (byte) 1);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.round(date83, (int) (byte) 1);
        boolean boolean88 = org.apache.commons.lang.time.DateUtils.isSameInstant(date51, date87);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date51, 1001);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addDays(date90, 1000);
        boolean boolean93 = org.apache.commons.lang.time.DateUtils.isSameInstant(date39, date92);
        boolean boolean94 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date39);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) '4');
        java.lang.Class<?> wildcardClass97 = date96.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Thu Jan 01 00:52:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date7, (int) (byte) 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, (int) (byte) 10);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date28, (int) (short) -1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.add(date32, (int) (byte) 1, 6);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate(date43, 0);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.round(date47, (int) (short) 0);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date47, (int) 'a');
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date59, 1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.truncate(date59, 0);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addWeeks(date63, 4);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date63, (int) '#');
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date51, date63);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.round(date51, (int) (short) 0);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMinutes(date51, (int) (short) -1);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date72);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameInstant(date20, date35);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addHours(date35, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Fri Dec 31 23:59:00 ICT 544");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 ICT 1976");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (byte) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Sep 28 00:00:00 ICT 1972");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 1);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date35);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date27);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date15, 6, 3);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray61);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date62, date70);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, 1001);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addWeeks(date62, (int) (byte) 100);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date54, date75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.truncate(date54, (int) (byte) 0);
        boolean boolean79 = org.apache.commons.lang.time.DateUtils.isSameInstant(date42, date54);
        java.util.Iterator iterator81 = org.apache.commons.lang.time.DateUtils.iterator(date54, 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Jan 04 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(iterator81);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) '4');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (short) 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 10);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 3600000);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (byte) 1, (int) (byte) 10);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Feb 11 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Feb 11 16:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Feb 11 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Feb 11 16:00:00 ICT 1970");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) -1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addSeconds(date20, (int) 'a');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (-1));
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 22 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 22 00:01:36 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 22 00:01:37 ICT 1970");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date17);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 1001);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, 86400000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri May 08 00:00:00 ICT 238544");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Mar 09 00:00:03 ICT 1989");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date19, (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Nov 30 00:00:01 ICT 1970");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (short) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 1000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, (int) ' ');
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Mar 01 01:40:01 ICT 1989");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Aug 12 01:40:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Aug 12 01:41:38 ICT 1970");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date11, 86400000);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (-1));
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 00:00:00 ICT 86401969");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 02:00:00 ICT 86401969");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 60000);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Aug 13 00:00:00 ICT 4458");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Aug 13 00:00:00 ICT 4458");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Aug 13 00:00:00 ICT 4458");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, 6);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (short) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 3600000);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date44, 6);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, 1000);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.round(date44, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Feb 10 01:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Mar 24 01:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Feb 10 01:06:02 ICT 1971");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Mon Feb 01 00:00:00 ICT 1971");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, (int) (byte) 10);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round(date21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun May 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:10 ICT 543");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 100);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, (-1));
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date38);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addWeeks(date51, (int) (byte) 1);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date51, (int) (byte) 1);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date19, 1001);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addDays(date58, 1000);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date65 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 6, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 6");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Feb 12 00:00:00 ICT 1970");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date23, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, 4);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date27, (int) '#');
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date27);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date15, (int) (short) 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date34, (int) 'a', 0);
        java.lang.Class<?> wildcardClass38 = date34.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Dec 31 23:59:59 ICT 544");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date23, 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, 4);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date27, (int) '#');
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date27);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 01 00:01:00 ICT 543");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, 6);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (short) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addDays(date42, 4);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date42, (int) (short) -1);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date42, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date50 = org.apache.commons.lang.time.DateUtils.round(date42, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Feb 14 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Feb 10 00:06:01 ICT 1971");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Feb 10 00:00:00 ICT 1971");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, 1000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 1001);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Nov 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat May 29 00:00:00 ICT 460");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 25 00:00:00 ICT 541");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 29 00:00:01 ICT 543");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date42, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 30 00:06:11 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 30 00:06:11 ICT 3601970");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date25, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date18, 1001);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, (int) (byte) 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 1001);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate(date42, 5);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date42, (int) (short) 100);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date46, (int) (byte) 0);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.round(date46, (int) (byte) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date50, (int) (byte) 100);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addMinutes(date52, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date58 = org.apache.commons.lang.time.DateUtils.add(date52, 1001, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Sep 28 00:16:41 ICT 1972");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Mon May 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sun May 01 00:00:00 ICT 2078");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Mon Mar 05 00:00:00 ICT 2085");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun May 21 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Jan 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Apr 30 00:00:03 ICT 1978");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 86400000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date17, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date21, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, (int) (byte) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (short) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date19, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 533");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:01:40 ICT 533");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Dec 01 00:01:40 ICT 532");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat May 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat May 28 00:10:00 ICT 543");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 00:00:00 ICT 1970");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, (int) (byte) 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date39, (int) (byte) 1);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 1001);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 10, (int) '4');
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addDays(date51, (-1));
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addHours(date53, 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Jan 03 04:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Jan 07 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Jan 11 04:00:00 ICT 1970");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date19, 2);
        java.util.Iterator iterator28 = org.apache.commons.lang.time.DateUtils.iterator(date19, 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) 'a');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addDays(date30, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Apr 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Fri Jul 17 00:00:00 ICT 1970");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator(date19, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 3600000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:01 ICT 543");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) '#');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date31, (int) (short) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (byte) -1);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date43, date51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1001);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, (int) (byte) 100);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date43);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date43, (int) (short) 100);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addDays(date43, 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Nov 30 23:59:59 ICT 1972");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Mon Jan 05 04:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Jan 07 00:00:00 ICT 1970");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 4);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, (int) '#');
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 60000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date49);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addDays(date60, (-1));
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date62, 2);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date64, (int) (short) 10);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameInstant(date49, date66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 4);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addDays(date49, (int) (short) -1);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addHours(date71, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date75 = org.apache.commons.lang.time.DateUtils.truncate(date73, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Feb 11 16:00:04 ICT 543");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Feb 10 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Feb 10 16:00:00 ICT 543");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 6);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, (int) (byte) 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 6);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMonths(date39, 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date41, 1001);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date41);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 15 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Jan 02 00:00:02 ICT 1970");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date18, (int) (short) 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date18, (int) 'a', 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date18, (int) '#', 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date18, 4);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, (int) (byte) 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 60000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Jan 11 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 04:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 04:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Mon Jan 01 04:16:41 ICT 6970");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 4);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, (int) '#');
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 60000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMonths(date49, 6);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, (int) (byte) 100);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date49, 6);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMonths(date56, (int) ' ');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Aug 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Fri Feb 11 17:40:00 ICT 543");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Feb 17 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Oct 17 16:00:00 ICT 541");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date7, (int) (byte) 1);
        java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator(date18, 6);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addDays(date30, (-1));
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 2);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, (int) (short) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date34);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date34, (int) (short) -1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addHours(date39, 3);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 24 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 24 03:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 24 00:00:06 ICT 1969");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, (-1));
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, (int) (short) 10);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date27);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date9, 4, 0);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 100);
        java.lang.Class<?> wildcardClass36 = date9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Apr 11 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) (short) 0);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 1);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date35);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date27);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date27, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date27, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (byte) 1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 1001);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate(date14, 5);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.round(date14, 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date14, 1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, (int) (byte) -1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, 6);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date24, 1);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, 0);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addHours(date34, (int) (short) -1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (short) 1, (int) (short) 10);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) '#');
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.truncate(date34, (int) (byte) 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date34, (int) (byte) 10);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) (short) 0);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date24, date34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Mar 15 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date17, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Jan 11 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:01:01 ICT 1970");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date26, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round(date31, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date33, 6);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addWeeks(date45, (int) (byte) 1);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 1001);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, (int) (byte) -1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date45, (int) ' ');
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameInstant(date53, date61);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.add(date53, 2, 10);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.add(date65, (int) (short) 0, 4);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator71 = org.apache.commons.lang.time.DateUtils.iterator(date33, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Apr 11 00:00:01 ICT 2134");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Oct 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 100);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) -1);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date13, (int) (short) 1, (int) (byte) 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (byte) -1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Dec 31 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Nov 30 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Dec 31 00:02:03 ICT 1969");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date17, (int) 'a');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date21, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu May 19 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Apr 18 16:00:00 ICT 541");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date15, 86400000);
        java.lang.Class<?> wildcardClass18 = date17.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jun 14 00:00:00 ICT 9314");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date21, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:01 ICT 1970");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date28, 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date32, (int) (short) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addHours(date34, (int) (short) 100);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) (byte) -1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date38, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date41, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Jan 01 00:00:00 ICT 542");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, (int) (short) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, 3600000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date17, 1000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date17, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:00 ICT 3600543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:00:00 ICT 3600626");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 04:00:00 ICT 3600543");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 3600000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date15, 0, 60000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date20, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 01:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator12 = org.apache.commons.lang.time.DateUtils.iterator(date10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, (int) (byte) 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date39, (int) (byte) 1);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 1001);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 1001);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, (int) 'a');
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date7, (int) (short) 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 4);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, (int) (short) 1);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.truncate(date56, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Feb 05 00:00:00 ICT 1970");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addDays(date30, (-1));
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 2);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, (int) (short) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date34);
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator(date34, 6);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 00:52:03 ICT 1969");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) -1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date25, 0, 1);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date25);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date25, 1001);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate(date31, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Aug 13 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Sep 27 23:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Sep 27 23:00:00 ICT 1972");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date28, 3600000);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.round(date30, 10);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMonths(date30, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 01:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 01:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Mon Dec 01 01:16:41 ICT 1969");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) '4');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, (-1));
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date31, (-1));
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date31, (int) (short) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date45, date53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, (int) (byte) 0);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addYears(date53, (int) (byte) 100);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addYears(date37, 0);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date37);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 02:59:01 ICT 2022");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (byte) 1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addDays(date10, (int) ' ');
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date22, (int) (short) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date26, (int) (short) 0);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date28, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addHours(date28, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, 3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Apr 10 00:00:00 ICT 379");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Jan 01 10:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Jan 01 10:03:00 ICT 543");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 10);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 10:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 10:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 11:37:00 ICT 1976");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 01 00:00:00 ICT 544");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) (byte) 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (byte) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 30 01:43:01 ICT 1971");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 01:43:02 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 01:43:12 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Nov 29 01:43:12 ICT 1972");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date26, 0);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date38, date46);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addDays(date57, (-1));
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date57);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, (int) (byte) 0);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addSeconds(date70, 1);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.truncate(date70, 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addWeeks(date74, 4);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date74, (int) '#');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date74, 60000);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date57, date80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addSeconds(date57, (int) (short) -1);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (byte) 10);
        boolean boolean86 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date57);
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date26);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addYears(date18, 100);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addHours(date89, 1);
        java.util.Date date93 = org.apache.commons.lang.time.DateUtils.addMinutes(date91, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator95 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date93, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Tue Jan 01 00:00:01 ICT 1980");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Wed Jan 29 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Wed Jan 29 01:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date93);
        org.junit.Assert.assertEquals(date93.toString(), "Wed Jan 29 01:10:00 ICT 2070");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) (short) 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date11, 60000);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 533");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Nov 05 00:00:00 ICT 537");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (short) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date33, (int) (byte) 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date35, 1000);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date37, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Mon Jan 01 00:10:01 ICT 2970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Apr 11 00:10:01 ICT 2970");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (byte) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) (byte) -1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, (int) 'a');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date42 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) boolean40, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate false");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 100);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) '#');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 4);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 1000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Sep 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Mar 02 00:00:00 ICT 1989");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 11 00:00:00 ICT 1970");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (byte) 100);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date13, 86400000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 30 00:00:01 ICT 238533");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date17, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1969");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate(date7, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date7, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Apr 11 00:00:00 ICT 1970");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 0, (int) (byte) 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon May 01 00:16:41 ICT 1978");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date20, 60000);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (short) -1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addDays(date38, 60000);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 1);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date53, (-1));
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 2);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMinutes(date55, (int) (short) 100);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMonths(date59, (int) 'a');
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date59);
        boolean boolean63 = org.apache.commons.lang.time.DateUtils.isSameInstant(date22, date38);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 02 00:01:00 ICT 1971");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 01:40:01 ICT 1969");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Tue Jan 31 01:40:01 ICT 1978");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addDays(date30, (-1));
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 2);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, (int) (short) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date34);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 1);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addWeeks(date47, (int) (byte) 1);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date47, 1001);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date59, 1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date61, (-1));
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 2);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date65, (int) (short) 10);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date65);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date47, 4, 0);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addDays(date47, (int) (short) 100);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.round(date47, 5);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameInstant(date20, date75);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Sat Apr 11 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate(date7, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date7, 1001);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) '#');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date31, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (short) 10, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Dec 01 00:00:00 ICT 1972");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, (-1));
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.truncate(date33, 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMonths(date36, 5);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMinutes(date38, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date42 = org.apache.commons.lang.time.DateUtils.round(date38, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 31 23:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Jun 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Mon Jun 01 00:06:00 ICT 1970");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, 1001);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date13, 2, (int) ' ');
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) (byte) 1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 1001);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.truncate(date36, 5);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date36, 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMonths(date36, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addHours(date42, (-1));
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameInstant(date44, date56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addHours(date56, 1001);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date22, date59);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Sep 01 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 31 23:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Feb 11 17:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (-1));
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date21);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 2);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (byte) 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) -1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Jan 01 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:01 ICT 1970");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 3600000L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 3600000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date18, (int) (short) 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date18, (int) 'a', 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date18, (int) (short) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Jan 11 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Feb 05 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) ' ');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date13, (int) (byte) 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, (int) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Sep 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:52 ICT 543");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) '4');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date17, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, 2);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date23, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 03:00:01 ICT 2022");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 03:00:00 ICT 2022");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 03 03:00:00 ICT 2022");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.truncate(date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on -1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Mar 11 00:00:00 ICT 1970");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, (int) 'a');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, 5);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date23, 3);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator33 = org.apache.commons.lang.time.DateUtils.iterator(date23, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 86400000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 30 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 02 01:43:01 ICT 1971");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 30 01:53:01 ICT 1970");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 3600000);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date26, 1001);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMonths(date28, 5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue May 12 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri May 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Oct 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (-1));
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date21);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 2);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 5);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date30, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date30, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Feb 01 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 03:06:01 ICT 1970");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1001);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1000);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addDays(date45, (-1));
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date47, 2);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date47);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date47, 2);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addHours(date47, 10);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Aug 28 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Wed Dec 31 10:00:01 ICT 1969");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) 'a');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, 6);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) (short) 100);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date24, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 01:37:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 12 01:37:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Feb 16 05:37:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 16 05:37:00 ICT 1970");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date26, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round(date31, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date33, 6);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addWeeks(date45, (int) (byte) 1);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 1001);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, (int) (byte) -1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date45, (int) ' ');
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameInstant(date53, date61);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.add(date53, 2, 10);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.add(date65, (int) (short) 0, 4);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date33, date65);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sun Apr 11 00:00:01 ICT 2134");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Oct 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Fri Nov 01 00:00:01 ICT 2002");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sun Apr 18 00:00:00 ICT 2134");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) '4');
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (short) 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 10);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 10);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 1);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, (-1));
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 2);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMonths(date42, 100);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date42, 0);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, (int) (short) 10);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMonths(date49, 4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Feb 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Nov 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Apr 30 00:00:13 ICT 1970");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Mar 09 00:00:01 ICT 2021");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Mar 09 00:00:05 ICT 2021");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, (int) (short) -1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, 86400000);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date19, (int) (short) -1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator31 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed May 12 00:16:42 ICT 2134");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Feb 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Apr 09 00:16:41 ICT 1989");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 10);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date29, date37);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addDays(date48, (-1));
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date48);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addWeeks(date48, (int) (byte) 0);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, (int) (short) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date55, (int) (byte) 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date57, 86400000);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.truncate(date60, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon May 01 00:26:42 ICT 1978");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:10:01 ICT 86401970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 86401970");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate(date39, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 4);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, (int) '#');
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 60000);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date49);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date49, (int) (short) 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate(date49, (int) (byte) 10);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date54, 10);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMonths(date54, (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Fri Feb 11 16:10:00 ICT 543");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Tue Jan 11 16:00:00 ICT 543");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addDays(date30, (-1));
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 2);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addSeconds(date34, (int) (short) 10);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date20, date34);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date20, 6);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMinutes(date39, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date41, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Jan 01 00:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Jan 01 01:40:00 ICT 1975");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (short) 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, (int) (short) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date15, 0);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) (byte) 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) '4');
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date31);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date7, 60000);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date13, (int) (short) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date13, 6, (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 61970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 61970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 00:00:00 ICT 61969");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date29);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date40, (-1));
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date40);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date21, 0, 3);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 00:00:08 ICT 1969");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date18, 1001);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date28, (int) '4');
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 1);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, (int) (byte) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 1001);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.truncate(date44, 5);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (short) 100);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, (int) (byte) 0);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date48, (int) (short) 0, (int) (byte) 0);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addSeconds(date61, 1);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addWeeks(date63, (int) (byte) 1);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 1001);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.truncate(date67, 5);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.round(date67, 0);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addDays(date67, 1001);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date67, (int) (byte) 1);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.round(date67, 5);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameDay(date53, date67);
        boolean boolean79 = org.apache.commons.lang.time.DateUtils.isSameDay(date28, date67);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date28, 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:18:21 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Sep 28 00:16:41 ICT 1972");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Sep 27 00:16:41 ICT 1973");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:16:43 ICT 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Sep 28 00:16:41 ICT 1972");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, (-1));
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 2);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date27, 100);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, (int) '4');
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addDays(date29, 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, 4);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date36, 86400000);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Apr 30 00:52:03 ICT 1978");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Apr 30 00:04:03 ICT 1978");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Apr 30 00:04:03 ICT 86401978");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sun Apr 30 00:05:43 ICT 86401978");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (-1));
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date21);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date21, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) (short) -1);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addHours(date21, 1000);
        java.lang.Class<?> wildcardClass33 = date21.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Feb 11 16:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.truncate(date22, 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date26, (int) (short) 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMinutes(date28, (int) (short) 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date30, (int) (byte) 10);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date32, 3600000);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date32);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (short) 1);
        java.lang.Class<?> wildcardClass38 = date37.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 01:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date11, (int) (short) 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date11, 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date19, (int) (short) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round(date21, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Apr 11 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 11:00:00 ICT 543");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (-1));
        java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date20, 3);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, 10);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addHours(date20, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addHours(date28, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator32 = org.apache.commons.lang.time.DateUtils.iterator(date28, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Jan 07 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Mar 11 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 09:59:59 ICT 1970");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, (int) (byte) 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date39, (int) (byte) 1);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 1001);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 1001);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, (int) 'a');
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '4');
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 1000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date56 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Jan 01 00:00:00 ICT 2022");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Mar 02 00:00:00 ICT 2041");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addYears(date19, 3600000);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 3601970");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date13, 3600000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 0);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addHours(date27, (int) (short) -1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 1, (int) (short) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date27, (int) '#');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.truncate(date27, (int) (byte) 1);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addWeeks(date48, (int) (byte) 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date48, (int) ' ');
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addSeconds(date60, 1);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date60, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date64, (int) (short) 0);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date48, date66);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date38, date66);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date66);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addYears(date17, 1001);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date71, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 07 00:00:03 ICT 2380");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Sep 07 00:00:03 ICT 2380");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Fri Sep 07 00:00:03 ICT 3381");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Fri Sep 07 00:00:03 ICT 3381");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) ' ');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date19, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 00:00:00 ICT 1969");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 60000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 16:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Feb 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray23);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (-1));
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date26);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, (int) (byte) 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (short) 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addSeconds(date33, 1000);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date33, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:26:41 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1001);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1000);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addDays(date45, (-1));
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date47, 2);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date35, date47);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date35, (int) (byte) 10);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date35, 1001);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:16:41 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Aug 28 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Aug 28 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Wed May 25 00:00:00 ICT 1977");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date17, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (byte) 100);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round(date21, (int) (short) 1);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addSeconds(date33, 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date33, (int) (short) 0);
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 86400000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMinutes(date37, 4);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date37, 5, 6);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date25, date46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate(date25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon May 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon May 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun May 01 00:00:00 ICT 2078");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Jan 01 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:04:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Jan 07 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date7, (int) (byte) 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, (int) (byte) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date7, (int) (short) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 1);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) (byte) 1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addDays(date32, 1);
        java.util.Iterator iterator38 = org.apache.commons.lang.time.DateUtils.iterator(date36, 3);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameInstant(date46, date54);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 1);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addDays(date65, (-1));
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date65);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMonths(date46, (int) '#');
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date70, (int) (short) 10);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date72);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date36);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.add(date36, 0, 60000);
        java.lang.Class<?> wildcardClass78 = date36.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Fri Dec 01 00:00:00 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, 1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date13, 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date19, (int) 'a');
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date39);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date50, (-1));
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date50);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addWeeks(date50, (int) (byte) 0);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 1);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.truncate(date63, 0);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addWeeks(date67, 4);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date67, (int) '#');
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addMinutes(date67, 60000);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameInstant(date50, date73);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray81);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addSeconds(date82, 1);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addDays(date84, (-1));
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addSeconds(date86, 2);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.addSeconds(date88, (int) (short) 10);
        boolean boolean91 = org.apache.commons.lang.time.DateUtils.isSameInstant(date73, date90);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date73);
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1000);
        java.util.Date date97 = org.apache.commons.lang.time.DateUtils.add(date23, (int) (short) 10, (int) (short) -1);
        java.util.Date date99 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date97, 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Feb 01 00:16:42 ICT 1969");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Mar 01 00:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Wed Dec 31 00:00:13 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Wed Mar 01 00:16:43 ICT 1978");
        org.junit.Assert.assertNotNull(date97);
        org.junit.Assert.assertEquals(date97.toString(), "Tue Feb 28 23:16:42 ICT 1978");
        org.junit.Assert.assertNotNull(date99);
        org.junit.Assert.assertEquals(date99.toString(), "Sun Jan 01 00:00:00 ICT 1978");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator(date19, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:16:42 ICT 1970");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMinutes(date36, (int) (byte) 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date36, (int) (byte) 100);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addYears(date49, (int) (short) 0);
        java.util.Iterator iterator55 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date53, 1);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addWeeks(date53, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date36, date53);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date53);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) 0);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date18, 1);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (short) 10);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 5);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addYears(date67, 2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Fri Jan 30 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Apr 09 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Mon Jun 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jun 29 00:00:00 ICT 1972");
    }
}

