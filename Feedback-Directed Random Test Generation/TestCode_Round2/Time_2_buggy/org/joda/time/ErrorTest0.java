package org.joda.time;

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
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = partial2.getFormatter();
        java.lang.String str4 = partial2.toString();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.Partial partial7 = partial2.withPeriodAdded(readablePeriod5, (-1));
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = partial2.getFields();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Partial partial10 = new org.joda.time.Partial(chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Partial partial12 = new org.joda.time.Partial(chronology11);
        int int13 = partial12.size();
        boolean boolean14 = partial10.isEqual((org.joda.time.ReadablePartial) partial12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Partial partial16 = new org.joda.time.Partial(chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Partial partial18 = new org.joda.time.Partial(chronology17);
        int int19 = partial18.size();
        boolean boolean20 = partial16.isEqual((org.joda.time.ReadablePartial) partial18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Partial partial22 = new org.joda.time.Partial(chronology21);
        int int23 = partial22.size();
        boolean boolean24 = partial16.isBefore((org.joda.time.ReadablePartial) partial22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Partial partial26 = new org.joda.time.Partial(chronology25);
        int int27 = partial26.size();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Partial partial29 = new org.joda.time.Partial(chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Partial partial31 = new org.joda.time.Partial(chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Partial partial33 = new org.joda.time.Partial(chronology32);
        int int34 = partial33.size();
        boolean boolean35 = partial31.isEqual((org.joda.time.ReadablePartial) partial33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = partial33.getFormatter();
        boolean boolean37 = partial29.isEqual((org.joda.time.ReadablePartial) partial33);
        boolean boolean38 = partial26.isEqual((org.joda.time.ReadablePartial) partial33);
        boolean boolean39 = partial16.isMatch((org.joda.time.ReadablePartial) partial26);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.Partial partial42 = partial26.withPeriodAdded(readablePeriod40, 100);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = partial26.getFields();
        int int44 = partial10.compareTo((org.joda.time.ReadablePartial) partial26);
        boolean boolean45 = partial2.isEqual((org.joda.time.ReadablePartial) partial26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = partial26.getFieldTypes();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Partial partial48 = new org.joda.time.Partial(chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Partial partial50 = new org.joda.time.Partial(chronology49);
        int int51 = partial50.size();
        boolean boolean52 = partial48.isEqual((org.joda.time.ReadablePartial) partial50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Partial partial54 = new org.joda.time.Partial(chronology53);
        int int55 = partial54.size();
        boolean boolean56 = partial48.isBefore((org.joda.time.ReadablePartial) partial54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Partial partial58 = new org.joda.time.Partial(chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Partial partial60 = new org.joda.time.Partial(chronology59);
        int int61 = partial60.size();
        boolean boolean62 = partial58.isEqual((org.joda.time.ReadablePartial) partial60);
        boolean boolean63 = partial54.isEqual((org.joda.time.ReadablePartial) partial60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = partial54.getFormatter();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Partial partial66 = new org.joda.time.Partial(chronology65);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Partial partial68 = new org.joda.time.Partial(chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Partial partial70 = new org.joda.time.Partial(chronology69);
        int int71 = partial70.size();
        boolean boolean72 = partial68.isEqual((org.joda.time.ReadablePartial) partial70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = partial70.getFormatter();
        boolean boolean74 = partial66.isEqual((org.joda.time.ReadablePartial) partial70);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Partial partial76 = new org.joda.time.Partial(chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = partial76.getFormatter();
        boolean boolean78 = partial70.isMatch((org.joda.time.ReadablePartial) partial76);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = null;
        org.joda.time.Partial partial80 = partial76.without(dateTimeFieldType79);
        org.joda.time.Chronology chronology81 = partial80.getChronology();
        org.joda.time.Partial partial82 = partial54.withChronologyRetainFields(chronology81);
        int[] intArray83 = partial54.getValues();
        org.joda.time.Partial partial84 = new org.joda.time.Partial(chronology0, dateTimeFieldTypeArray46, intArray83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = null;
        java.lang.String str86 = partial84.toString(dateTimeFormatter85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial2 and partial84", (partial2.compareTo(partial84) == 0) == partial2.equals(partial84));
    }
}

