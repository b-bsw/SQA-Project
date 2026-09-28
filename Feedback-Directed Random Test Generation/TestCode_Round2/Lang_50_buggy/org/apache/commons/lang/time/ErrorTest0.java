package org.apache.commons.lang.time;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("\u0e17\u0e35\u0e48 d MMMM GGGG y", locale7);
        int[] intArray14 = new int[] { (byte) 0, (-1), 'a', 3 };
        java.lang.String str15 = fastDateFormat8.parseToken("r", intArray14);
        java.lang.String str16 = fastDateFormat2.parseToken("HH:mm", intArray14);
        java.lang.String str17 = fastDateFormat2.toString();
        int int18 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone19 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.lang.String str23 = fastDateFormat21.format((long) (byte) -1);
        boolean boolean24 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        java.util.Locale locale26 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = new org.apache.commons.lang.time.FastDateFormat("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z", timeZone19, locale26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = fastDateFormat27.format((long) 49);
    }
}

