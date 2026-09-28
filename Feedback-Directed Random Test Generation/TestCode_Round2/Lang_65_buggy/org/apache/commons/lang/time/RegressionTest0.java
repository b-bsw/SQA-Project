package org.apache.commons.lang.time;

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
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_MONTH_SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_MONTH_MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_WEEK_SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_WEEK_RELATIVE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.DateUtils.DateIterator dateIterator2 = new org.apache.commons.lang.time.DateUtils.DateIterator(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = org.apache.commons.lang.time.DateUtils.MILLIS_IN_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = org.apache.commons.lang.time.DateUtils.MILLIS_IN_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 86400000 + "'", int0 == 86400000);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.apache.commons.lang.time.DateUtils.MILLIS_IN_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_WEEK_CENTER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 10.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10.0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.apache.commons.lang.time.DateUtils.MILLIS_IN_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3600000 + "'", int0 == 3600000);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100.0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int0 = org.apache.commons.lang.time.DateUtils.SEMI_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1001 + "'", int0 == 1001);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.util.Date date0 = null;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang.time.DateUtils.isSameDay(date0, date1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 10L, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang.time.DateUtils.isSameInstant(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = org.apache.commons.lang.time.DateUtils.RANGE_WEEK_MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on -1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 1000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        long long0 = org.apache.commons.lang.time.DateUtils.MILLIS_PER_MINUTE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(date0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        long long0 = org.apache.commons.lang.time.DateUtils.MILLIS_PER_DAY;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 86400000L + "'", long0 == 86400000L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        long long0 = org.apache.commons.lang.time.DateUtils.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        long long0 = org.apache.commons.lang.time.DateUtils.MILLIS_PER_HOUR;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 3600000L + "'", long0 == 3600000L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: ");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) true, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round true");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.lang.time.DateUtils.isSameDay(calendar0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on hi!");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addSeconds(date0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 2");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator11 = org.apache.commons.lang.time.DateUtils.iterator(date7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator(date7, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 60000 is not valid.");
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
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.lang.time.DateUtils dateUtils0 = new org.apache.commons.lang.time.DateUtils();
        java.lang.Class<?> wildcardClass1 = dateUtils0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator3 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) dateUtils0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on org.apache.commons.lang.time.DateUtils@6bcc2414");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = org.apache.commons.lang.time.DateUtils.add(date7, 3600000, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 1000);
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 4");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date9, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
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
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date25);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date17);
        java.util.Date date28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date28);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 1000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = org.apache.commons.lang.time.DateUtils.round(date7, (int) (short) -1);
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
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date11, 86400000);
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
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date18);
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 1000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date9, 1000);
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
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date17, 6);
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
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Nov 01 00:00:01 ICT 2002");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.lang.Class<?> wildcardClass16 = date15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date29, 60000);
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
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.lang.Class<?> wildcardClass10 = date9.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date11, (int) '4');
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
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
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date17, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 60000 is not valid.");
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date13, 2);
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
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 02:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addWeeks(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100");
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 2070");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 1001, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 1001");
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date26, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3600000 is not supported");
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date11, 60000, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date13, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 02:00:01 ICT 1970");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1");
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date7, 86400000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator26 = org.apache.commons.lang.time.DateUtils.iterator(date24, (int) ' ');
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
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) true, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on true");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date24, 86400000, (int) (byte) 1);
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
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date71 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 4");
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
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date26, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3600000 is not supported");
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
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator(date18, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
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
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator(date15, (int) (byte) 0);
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
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date11, 0);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, (int) 'a');
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date26, 1000);
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date15, 1000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 00:00:13 ICT 1969");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date13, (int) '4');
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on true");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date21, 4);
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameInstant(date8, date16);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, (-1));
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date27);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date27, (int) (byte) 0);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate(date40, 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date44, 4);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, (int) '#');
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMinutes(date44, 60000);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date50);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date59, 1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date61, (-1));
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 2);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date65, (int) (short) 10);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date50, date67);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date0, date50);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date9, (int) 'a');
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 02 00:00:01 ICT 1970");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator52 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) boolean50, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on false");
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.truncate(date7, 1000);
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
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
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
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) 'a', (-1));
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 30 00:00:01 ICT 1970");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date20, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
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
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 0");
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (short) 10, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 4);
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.lang.Class<?> wildcardClass17 = date7.getClass();
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date11, 3);
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
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator56 = org.apache.commons.lang.time.DateUtils.iterator(date49, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 32 is not valid.");
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
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Aug 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Fri Feb 11 17:40:00 ICT 543");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator26 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 3");
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
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addHours(date25, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date28, 6);
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
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:00:00 ICT 1970");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date11, (-1));
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
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 60000);
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
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, (int) '4');
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
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date15, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Apr 11 00:00:00 ICT 2134");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1975");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator(date11, 86400000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) '4');
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date25, 1000);
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
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = org.apache.commons.lang.time.DateUtils.round(date14, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass32 = date7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
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
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date15, 4);
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 00:00:13 ICT 1969");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date18, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 1);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMonths(date31, 3);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date39 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date31, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round(date7, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date21, 3600000, 3600000);
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
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray2);
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unable to parse the date: hi!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 1000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 1.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 1.0");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date52 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date49, (int) (short) 100);
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
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (byte) 1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addDays(date10, 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) '4');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date16, (int) (byte) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date18, 5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date20);
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
        org.junit.Assert.assertEquals(date14.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 30 00:00:01 ICT 1970");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round(date24, (int) (byte) 100);
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
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = org.apache.commons.lang.time.DateUtils.add(date23, (int) '#', 3);
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date61 = org.apache.commons.lang.time.DateUtils.round(date53, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.lang.Class<?> wildcardClass14 = date9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 5");
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date46, 0);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date52 = org.apache.commons.lang.time.DateUtils.truncate(date50, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
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
        org.junit.Assert.assertEquals(date48.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Dec 31 23:59:59 ICT 544");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass30 = date29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator(date15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate(date15, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 01:40:01 ICT 1969");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date28, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 01 01:00:01 ICT 2002");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate(date13, 60000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 1);
        java.lang.Class<?> wildcardClass16 = date11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) '#');
        java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date17, (int) (short) 1);
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
        org.junit.Assert.assertEquals(date17.toString(), "Sat Dec 02 00:00:01 ICT 1972");
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, (int) '#');
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addSeconds(date36, 1);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date36, (int) (short) 0);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, 1);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date40, date48);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMonths(date48, 3);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date48);
        java.lang.Class<?> wildcardClass55 = date28.getClass();
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
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:35 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, 60000);
        java.lang.Class<?> wildcardClass21 = date20.getClass();
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
        org.junit.Assert.assertEquals(date20.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, (-1));
        java.lang.Class<?> wildcardClass22 = date21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate a");
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = org.apache.commons.lang.time.DateUtils.round(date9, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator35 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (short) 10, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 10");
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
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:01 ICT 1970");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 3600000L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 3600000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date56 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 100");
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
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date11, 1000, 3600000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Sep 27 00:00:00 ICT 1972");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 6");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100");
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
        org.junit.Assert.assertEquals(date20.toString(), "Thu Dec 02 00:00:00 ICT 1971");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.Class<?> wildcardClass29 = date28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = org.apache.commons.lang.time.DateUtils.round(date15, 4);
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
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1001);
        java.lang.Class<?> wildcardClass20 = date17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) boolean30, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round false");
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, 1000, 100);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 00:00:01 ICT 1970");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date15, (int) ' ');
        java.lang.Class<?> wildcardClass20 = date19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 6);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date17, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 1000, (int) 'a');
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 13 00:00:00 ICT 1970");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, (-1));
        java.lang.Class<?> wildcardClass32 = date29.getClass();
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
        org.junit.Assert.assertEquals(date31.toString(), "Wed Mar 09 00:00:00 ICT 1988");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date11, (int) 'a', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date17.toString(), "Sat Dec 02 00:00:01 ICT 1972");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Dec 02 00:00:01 ICT 1972");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 3, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 3");
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
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date21, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date25, (int) (short) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addHours(date27, (int) (short) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date27, (int) (byte) -1);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator(date11, 86400000);
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
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 ICT 542");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.truncate(date18, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = date24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, 3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMonths(date51, (int) (byte) 10);
        java.lang.Class<?> wildcardClass55 = date54.getClass();
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
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Nov 01 00:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date7, 3);
        java.lang.Class<?> wildcardClass53 = date52.getClass();
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
        org.junit.Assert.assertEquals(date52.toString(), "Sun Jan 04 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:00 ICT 2005");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.truncate(date11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Aug 13 00:00:00 ICT 1970");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) ' ');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1001);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = org.apache.commons.lang.time.DateUtils.round(date22, 4);
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Mar 09 00:00:01 ICT 2021");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Mar 09 00:00:01 ICT 2021");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round(date31, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
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
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:01 ICT 1970");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.Class<?> wildcardClass60 = date18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date54 = org.apache.commons.lang.time.DateUtils.round(date49, 100);
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator(date7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (byte) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Dec 25 00:00:01 ICT 1969");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date29, 3);
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
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (byte) 1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addDays(date10, 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, 6);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 3);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date16, 1001);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date16);
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
        org.junit.Assert.assertEquals(date14.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 02 00:00:01 ICT 2971");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date15, (-1));
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 03:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 03:03:01 ICT 1970");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, (-1));
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.Class<?> wildcardClass10 = date7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.Class<?> wildcardClass34 = date33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        java.lang.Class<?> wildcardClass16 = date15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 86400000);
        java.lang.Class<?> wildcardClass19 = date15.getClass();
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 28 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.truncate(date43, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date48 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date46, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 1000 is not supported");
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
        org.junit.Assert.assertEquals(date46.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) strArray8, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on [Ljava.lang.String;@24641b2d");
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
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 6);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date17, 5);
        java.lang.Class<?> wildcardClass20 = date19.getClass();
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
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 13 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date17, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
        org.junit.Assert.assertEquals(date23.toString(), "Thu Dec 31 11:00:01 ICT 1970");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date13, (int) (short) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 00:00:00 ICT 542");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) '4');
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.add(date15, (int) (byte) 0, 5);
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
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date25, (int) (short) 0);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) boolean28, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator(date13, (int) '4');
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 05 00:00:00 ICT 1970");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date36, (int) (short) 100, (int) '4');
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
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
        org.junit.Assert.assertEquals(date15.toString(), "Sun Jan 11 00:00:01 ICT 1970");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date46, 0);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date48, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
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
        org.junit.Assert.assertEquals(date48.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Dec 31 23:59:59 ICT 544");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        java.lang.Class<?> wildcardClass17 = date16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date17, (int) 'a');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date19, 0);
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
        org.junit.Assert.assertEquals(date21.toString(), "Thu May 19 16:00:00 ICT 543");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date7, 60000);
        java.lang.Class<?> wildcardClass14 = date13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, (-1));
        java.lang.Class<?> wildcardClass22 = date19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date18, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 22 00:00:00 ICT 1970");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.Class<?> wildcardClass34 = date9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date17, 3600000);
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
        org.junit.Assert.assertEquals(date15.toString(), "Mon Feb 28 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 28 00:10:00 ICT 543");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addDays(date46, 1000);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addSeconds(date56, 1);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addWeeks(date58, (int) (byte) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 1001);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, (int) (byte) -1);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date58, (int) ' ');
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray73);
        boolean boolean75 = org.apache.commons.lang.time.DateUtils.isSameInstant(date66, date74);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addYears(date66, (int) (short) 10);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameInstant(date48, date77);
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
        org.junit.Assert.assertEquals(date48.toString(), "Wed Sep 27 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sun Jan 01 00:00:01 ICT 2012");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Feb 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) iterator15, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on org.apache.commons.lang.time.DateUtils$DateIterator@110341e0");
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
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date21, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date25, (int) (short) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addHours(date27, (int) (short) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date27, (int) (byte) -1);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date27);
        java.lang.Class<?> wildcardClass33 = date11.getClass();
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
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 ICT 542");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Date and Patterns must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date13, 3600000);
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
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate(date15, 3);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, (-1));
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date19, date22);
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
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round(date15, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 1000 is not supported");
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
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date25, (int) (short) 0);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date9, 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) wildcardClass10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round class [Ljava.lang.String;");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 10");
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:10:01 ICT 1970");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on true");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) (short) 10, (int) (short) 10);
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
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:01 ICT 1970");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date28, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date17.toString(), "Tue Jan 01 00:00:01 ICT 2002");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Jan 01 00:00:01 ICT 2012");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Date date0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date8, (int) (short) 0);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addSeconds(date20, 1);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date12, date20);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date12, 60000);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date25, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date25);
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
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Apr 11 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jul 17 00:00:00 ICT 2134");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 'a', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate a");
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date59 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) boolean57, 0);
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
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date54 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) boolean52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round false");
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
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 4);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date15, (int) (short) 100);
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
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:18:22 ICT 1970");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator(date15, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 3600000 is not valid.");
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 28 00:00:00 ICT 1657856");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date21, 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date25, (int) (short) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addHours(date27, (int) (short) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date27, (int) (byte) -1);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 97 is not valid.");
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
        org.junit.Assert.assertEquals(date25.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Jan 01 00:00:00 ICT 542");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date11, 60000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date24, (int) 'a');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 10);
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
        org.junit.Assert.assertEquals(date26.toString(), "Sat Jul 17 00:00:00 ICT 2134");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sun Apr 11 00:00:00 ICT 2134");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1001);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 86400000);
        java.lang.Class<?> wildcardClass21 = date20.getClass();
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
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:16:41 ICT 7201970");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 3600000, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 3600000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date23, 100);
        java.util.Date date28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date28);
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
        org.junit.Assert.assertEquals(date27.toString(), "Tue Dec 30 01:43:01 ICT 2070");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 0);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator53 = org.apache.commons.lang.time.DateUtils.iterator(date51, (int) '4');
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
        org.junit.Assert.assertEquals(date48.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 6);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addHours(date19, 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 02 00:00:01 ICT 2070");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date19, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 6);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) '#');
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator30 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) boolean28, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on false");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Dec 02 00:00:01 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round ");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate(date42, 6);
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
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.truncate(date58, 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.round(date62, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMinutes(date64, (int) (short) 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.truncate(date66, (int) (byte) 10);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, 3600000);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date68);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addHours(date68, 1000);
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
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 01:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Wed Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 10, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 10");
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:10:01 ICT 1970");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.lang.Class<?> wildcardClass20 = date17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.lang.Class<?> wildcardClass20 = date19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, 60000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date17, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date17, 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Feb 11 16:00:00 ICT 543");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 86400000, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 86400000");
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Sep 27 00:00:00 ICT 1972");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.Class<?> wildcardClass26 = date25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 23:00:00 ICT 1969");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!", "" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = org.apache.commons.lang.time.DateUtils.round(date9, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addMinutes(date69, (int) (byte) 10);
        java.lang.Class<?> wildcardClass72 = date69.getClass();
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
        org.junit.Assert.assertEquals(date71.toString(), "Fri Feb 11 16:10:04 ICT 543");
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date19, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 6);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) '#');
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date23);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date23, (int) '4');
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Dec 02 00:00:01 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Fri Dec 03 00:00:01 ICT 1971");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(obj0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date13, 5);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date17, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date21, 1001);
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
        org.junit.Assert.assertEquals(date23.toString(), "Mon May 01 16:41:00 ICT 1978");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (byte) 100);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (-1));
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (byte) 100);
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date18);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 00:00:01 ICT 2070");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator16 = org.apache.commons.lang.time.DateUtils.iterator(date11, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1000 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:00:00 ICT 1969");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, (int) (short) 1);
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date16);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:01:01 ICT 1970");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date42, date50);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date59, 1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date61, (-1));
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date61);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addWeeks(date61, (int) (byte) 0);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray73);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addSeconds(date74, 1);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.truncate(date74, 0);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addWeeks(date78, 4);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date78, (int) '#');
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date78, 60000);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameInstant(date61, date84);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addMonths(date84, 6);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addYears(date87, 3);
        boolean boolean90 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date92 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) boolean90, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Aug 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Mon Aug 11 16:00:00 ICT 540");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date29, 10);
        java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator(date32, 1);
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
        org.junit.Assert.assertEquals(date32.toString(), "Sat Apr 30 00:00:03 ICT 1988");
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(obj0, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addHours(date48, (int) (short) 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addWeeks(date48, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator54 = org.apache.commons.lang.time.DateUtils.iterator(date48, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
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
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 01:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:01 ICT 1970");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 10);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date17, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Apr 04 00:10:00 ICT 543");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) (short) 0);
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date16);
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Mar 12 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:01 ICT 1970");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator(date17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 10:00:00 ICT 1970");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) strArray6, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate [Ljava.lang.String;@53061821");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMonths(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date31, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(date31.toString(), "Wed Mar 09 00:00:00 ICT 1988");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date15, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date15, 4);
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
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Aug 31 00:00:01 ICT 1973");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) 1, (int) (short) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date19, 100);
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
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:01 ICT 543");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMinutes(date11, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addYears(date11, 86400000);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, (-1));
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, 6);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 00:00:00 ICT 86401969");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 86401969");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date11, (int) '#');
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date11, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (-1));
        java.lang.Class<?> wildcardClass20 = date11.getClass();
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
        org.junit.Assert.assertEquals(date19.toString(), "Thu Dec 25 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.Class<?> wildcardClass58 = date56.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addHours(date34, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = date34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date34, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3600000 is not supported");
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
        org.junit.Assert.assertEquals(date34.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Dec 02 01:00:00 ICT 542");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date19, (int) (byte) 0);
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
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.Class<?> wildcardClass87 = date84.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date56 = org.apache.commons.lang.time.DateUtils.truncate(date54, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
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
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 29 00:00:00 ICT 1970");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 1001);
        java.lang.Class<?> wildcardClass28 = date25.getClass();
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
        org.junit.Assert.assertEquals(date27.toString(), "Wed Jul 18 00:16:42 ICT 2153");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date13, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, (int) ' ', 10);
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
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Sep 07 00:00:03 ICT 2380");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = org.apache.commons.lang.time.DateUtils.add(date7, 86400000, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, 3600000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date65 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
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
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 29 00:00:52 ICT 1970");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date18, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate -1");
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
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 22 00:00:00 ICT 1970");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addHours(date28, 60000);
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
        org.junit.Assert.assertEquals(date35.toString(), "Sun Nov 05 00:00:00 ICT 537");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator50 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 1001, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1001");
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
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.util.Iterator iterator56 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date49, 1);
        java.lang.Class<?> wildcardClass57 = iterator56.getClass();
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
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.util.Iterator iterator31 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date7, 4);
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
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator(date29, 0);
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date11, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (short) 0);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 1);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMonths(date31, 3);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date31);
        java.lang.Class<?> wildcardClass38 = date31.getClass();
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
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date9, (-1));
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date13, (int) (short) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date13, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator20 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 0, 1);
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
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass26 = date25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 4);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
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
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, (int) (byte) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 1, 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 5);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator28 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 1");
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
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1975");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Dec 31 00:00:01 ICT 1976");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Feb 04 00:00:01 ICT 1977");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Feb 04 00:01:01 ICT 1977");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 6);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date13, (int) (short) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date13, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
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
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Jan 02 00:00:01 ICT 2971");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) ' ');
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date9, 6);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date25, (int) '#');
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date27, (int) (short) 10);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate(date9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Aug 13 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date23, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Mar 15 01:16:42 ICT 1970");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) (short) -1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date11, 0, 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate(date14, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 23:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 00:00:00 ICT 1969");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date37 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 86400000, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 86400000");
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, 86400000, 1001);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 10:00:00 ICT 1970");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 10);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator23 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date19, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 10:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 10:00:00 ICT 1976");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date25, 1);
        java.lang.Class<?> wildcardClass29 = date25.getClass();
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
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date13, (int) (byte) 100);
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
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = date11.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date13, (int) (short) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date13, 0, 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addHours(date18, (int) '4');
        java.util.Iterator iterator22 = org.apache.commons.lang.time.DateUtils.iterator(date18, 5);
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
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 05 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Jan 03 04:00:00 ICT 543");
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        java.lang.Class<?> wildcardClass27 = date25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 03:03:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 03:03:01 ICT 1970");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (byte) 100);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.round(date9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
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
        org.junit.Assert.assertEquals(date13.toString(), "Mon May 01 00:00:01 ICT 1978");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addYears(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator38 = org.apache.commons.lang.time.DateUtils.iterator(date15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 97 is not valid.");
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
        org.junit.Assert.assertEquals(date34.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, (int) (short) -1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 3600000);
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
        org.junit.Assert.assertEquals(date20.toString(), "Wed Feb 11 16:00:00 ICT 1970");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date33, (int) (byte) 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date33, 1001);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate(date37, 5);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.round(date37, 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addDays(date37, 1001);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 0);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addHours(date45, 0);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator50 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date45, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 100 is not valid.");
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
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Sep 28 00:16:42 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 6);
        java.util.Iterator iterator19 = org.apache.commons.lang.time.DateUtils.iterator(date17, 2);
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
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, 4);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date17, 3);
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
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:16:42 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:18:22 ICT 1970");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addWeeks(date48, (int) (byte) 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date48, 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date48, (int) '4');
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date54, (int) (byte) -1);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 5);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addMinutes(date56, 6);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMinutes(date60, (int) 'a');
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date62, 5);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date62, 100);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date66);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Wed Dec 30 00:06:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Dec 30 01:43:01 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Tue Dec 30 01:43:01 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Tue Aug 23 00:00:00 ICT 543");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(date45.toString(), "Mon Mar 09 00:00:01 ICT 2020");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = date13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.truncate(calendar0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 6);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate(date13, (int) (short) 1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date13, 1001);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 100, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 13 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Jan 02 00:00:01 ICT 2971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 02 00:00:01 ICT 2972");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addHours(date9, 3);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 03:03:01 ICT 1970");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date17, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 08 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 31 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1975");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:10:01 ICT 1975");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.util.Date date98 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, 1000);
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
        org.junit.Assert.assertNotNull(date98);
        org.junit.Assert.assertEquals(date98.toString(), "Thu Jan 01 16:40:01 ICT 1970");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(calendar0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator35 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) boolean33, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on false");
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
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, 1001);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, 10);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, 6);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date19, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator(date23, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 60000 is not valid.");
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 10:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 10:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Dec 01 10:00:00 ICT 1969");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date17, (int) (byte) 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 1, 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, 5);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date24, (int) (short) 0);
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
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 00:00:01 ICT 1975");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:00 ICT 1975");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Dec 31 00:00:01 ICT 1976");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Feb 04 00:00:01 ICT 1977");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Feb 04 00:01:01 ICT 1977");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.add(date70, 3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date77 = org.apache.commons.lang.time.DateUtils.add(date74, 86400000, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Wed Dec 31 00:00:13 ICT 1969");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, (int) (byte) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (byte) 100);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date22, 1000, (-1));
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
        org.junit.Assert.assertEquals(date20.toString(), "Wed Jan 01 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Jan 01 00:00:00 ICT 1969");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMinutes(date0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 100);
        java.util.Iterator iterator13 = org.apache.commons.lang.time.DateUtils.iterator(date11, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) iterator13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate org.apache.commons.lang.time.DateUtils$DateIterator@5fbb7485");
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
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = org.apache.commons.lang.time.DateUtils.round(calendar0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.truncate(date58, 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.round(date62, (int) (short) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMinutes(date64, (int) (short) 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.truncate(date66, (int) (byte) 10);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, 3600000);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date73 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) boolean71, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round false");
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
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 01:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 5);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 6);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) (byte) 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date31, 1);
        java.util.Iterator iterator37 = org.apache.commons.lang.time.DateUtils.iterator(date35, 3);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date35);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate(date17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
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
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 30 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 30 01:00:01 ICT 1970");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = org.apache.commons.lang.time.DateUtils.iterator(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date51, (int) ' ', (int) (byte) -1);
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.add(date0, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) ' ');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (short) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate(date25, (int) (short) 0);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameDay(date9, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date27, 60000);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addWeeks(date30, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator34 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
        org.junit.Assert.assertEquals(date13.toString(), "Mon Feb 02 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Apr 10 00:00:00 ICT 379");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Tue Apr 10 00:00:00 ICT 379");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.truncate(date11, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, (int) (short) 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 1);
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
        org.junit.Assert.assertEquals(date17.toString(), "Thu Mar 12 00:00:01 ICT 1970");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date25, 3);
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
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:35 ICT 1970");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray78);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addSeconds(date79, 1);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addDays(date81, (-1));
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addSeconds(date83, 2);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addMonths(date85, 100);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addHours(date85, 3600000);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date89, 0);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date91);
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
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Wed Dec 31 00:00:03 ICT 1969");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Sun Apr 30 00:00:03 ICT 1978");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Sun Sep 07 00:00:03 ICT 2380");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Sun Sep 07 00:00:03 ICT 2380");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass61 = date60.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator15 = org.apache.commons.lang.time.DateUtils.iterator(date13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 10 is not valid.");
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator35 = org.apache.commons.lang.time.DateUtils.iterator(date11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) (byte) 1);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addDays(date9, 1);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date9, (int) '4');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = date15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (-1));
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 2);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.round(date13, 1001);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date15, 3, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date15, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, 100);
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray6);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addSeconds(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date19);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
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
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 23:59:00 ICT 1969");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date42, date50);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray58);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addSeconds(date59, 1);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date61, (-1));
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date61);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addWeeks(date61, (int) (byte) 0);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray73);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addSeconds(date74, 1);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.truncate(date74, 0);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addWeeks(date78, 4);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date78, (int) '#');
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date78, 60000);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameInstant(date61, date84);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addMonths(date84, 6);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addYears(date87, 3);
        boolean boolean90 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date89);
        java.util.Iterator iterator92 = org.apache.commons.lang.time.DateUtils.iterator(date21, 1);
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 00:00:01 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Sat Jan 29 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Fri Feb 11 16:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Aug 11 16:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Mon Aug 11 16:00:00 ICT 540");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(iterator92);
    }
}

