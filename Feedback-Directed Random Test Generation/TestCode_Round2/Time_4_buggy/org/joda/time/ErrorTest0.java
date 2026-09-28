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
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = partial0.isMatch(readableInstant2);
        boolean boolean5 = partial0.equals((java.lang.Object) (-1L));
        org.joda.time.Partial partial6 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology7 = partial6.getChronology();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Partial partial9 = partial6.plus(readablePeriod8);
        org.joda.time.Partial partial10 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology11 = partial10.getChronology();
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        boolean boolean13 = partial10.isEqual((org.joda.time.ReadablePartial) partial12);
        boolean boolean14 = partial6.isEqual((org.joda.time.ReadablePartial) partial12);
        boolean boolean15 = partial0.isAfter((org.joda.time.ReadablePartial) partial12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = partial12.getFieldTypes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray19 = new int[] {};
        org.joda.time.Partial partial20 = new org.joda.time.Partial(chronology17, dateTimeFieldTypeArray18, intArray19);
        org.joda.time.Partial partial21 = new org.joda.time.Partial(dateTimeFieldTypeArray16, intArray19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial20", (partial0.compareTo(partial20) == 0) == partial0.equals(partial20));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = partial0.isMatch(readableInstant2);
        boolean boolean5 = partial0.equals((java.lang.Object) (-1L));
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray8 = new int[] {};
        org.joda.time.Partial partial9 = new org.joda.time.Partial(chronology6, dateTimeFieldTypeArray7, intArray8);
        org.joda.time.Partial partial10 = new org.joda.time.Partial(partial0, intArray8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial9", (partial0.compareTo(partial9) == 0) == partial0.equals(partial9));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Partial partial4 = partial2.minus(readablePeriod3);
        java.lang.String str6 = partial2.toString("[]");
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial2.plus(readablePeriod7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = partial8.getFieldTypes();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray12 = new int[] {};
        org.joda.time.Partial partial13 = new org.joda.time.Partial(chronology10, dateTimeFieldTypeArray11, intArray12);
        org.joda.time.Partial partial14 = new org.joda.time.Partial(dateTimeFieldTypeArray9, intArray12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial13", (partial0.compareTo(partial13) == 0) == partial0.equals(partial13));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial();
        boolean boolean3 = partial0.isEqual((org.joda.time.ReadablePartial) partial2);
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology5 = partial4.getChronology();
        org.joda.time.Partial partial6 = new org.joda.time.Partial(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.Partial partial8 = partial6.minus(readablePeriod7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = partial8.toDateTime(readableInstant9);
        int int11 = partial0.compareTo((org.joda.time.ReadablePartial) partial8);
        java.lang.String str12 = partial0.toStringList();
        java.lang.String str13 = partial0.toStringList();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology15 = partial14.getChronology();
        org.joda.time.Partial partial16 = new org.joda.time.Partial(chronology15);
        java.lang.String str17 = partial16.toString();
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology19 = partial18.getChronology();
        org.joda.time.Partial partial20 = new org.joda.time.Partial();
        boolean boolean21 = partial18.isEqual((org.joda.time.ReadablePartial) partial20);
        boolean boolean23 = partial18.equals((java.lang.Object) "");
        boolean boolean24 = partial16.isMatch((org.joda.time.ReadablePartial) partial18);
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology26 = partial25.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial(chronology26);
        java.lang.String str28 = partial27.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = partial27.isSupported(dateTimeFieldType29);
        int[] intArray31 = partial27.getValues();
        org.joda.time.Partial partial32 = new org.joda.time.Partial(partial18, intArray31);
        int int33 = partial0.compareTo((org.joda.time.ReadablePartial) partial32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        org.joda.time.Partial partial35 = partial0.without(dateTimeFieldType34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = partial35.getFieldTypes();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray39 = new int[] {};
        org.joda.time.Partial partial40 = new org.joda.time.Partial(chronology37, dateTimeFieldTypeArray38, intArray39);
        org.joda.time.Partial partial41 = new org.joda.time.Partial(dateTimeFieldTypeArray36, intArray39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial40", (partial0.compareTo(partial40) == 0) == partial0.equals(partial40));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.Partial partial3 = partial0.plus(readablePeriod2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.Partial partial5 = partial0.plus(readablePeriod4);
        org.joda.time.Partial partial6 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology7 = partial6.getChronology();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Partial partial9 = partial6.plus(readablePeriod8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = partial6.isSupported(dateTimeFieldType10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = partial6.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial6.minus(readablePeriod14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology17 = partial16.getChronology();
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        boolean boolean19 = partial16.isEqual((org.joda.time.ReadablePartial) partial18);
        org.joda.time.Partial partial20 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology21 = partial20.getChronology();
        org.joda.time.Partial partial22 = new org.joda.time.Partial(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.Partial partial24 = partial22.minus(readablePeriod23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = partial24.toDateTime(readableInstant25);
        int int27 = partial16.compareTo((org.joda.time.ReadablePartial) partial24);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology29 = partial28.getChronology();
        org.joda.time.Partial partial30 = new org.joda.time.Partial(chronology29);
        org.joda.time.Chronology chronology31 = partial30.getChronology();
        boolean boolean32 = partial24.isAfter((org.joda.time.ReadablePartial) partial30);
        boolean boolean33 = partial6.isBefore((org.joda.time.ReadablePartial) partial24);
        boolean boolean34 = partial5.isAfter((org.joda.time.ReadablePartial) partial24);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        int int36 = partial5.indexOf(dateTimeFieldType35);
        org.joda.time.Partial partial37 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = partial5.getFormatter();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Partial partial41 = partial5.withPeriodAdded(readablePeriod39, (int) (short) 0);
        org.joda.time.Partial.Property property43 = new org.joda.time.Partial.Property(partial5, (int) '4');
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray46 = new int[] {};
        org.joda.time.Partial partial47 = new org.joda.time.Partial(chronology44, dateTimeFieldTypeArray45, intArray46);
        boolean boolean48 = property43.equals((java.lang.Object) dateTimeFieldTypeArray45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial47", (partial0.compareTo(partial47) == 0) == partial0.equals(partial47));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(chronology1);
        org.joda.time.Chronology chronology3 = partial2.getChronology();
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology6 = partial5.getChronology();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.Partial partial9 = partial7.minus(readablePeriod8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = partial9.getFieldTypes();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology12 = partial11.getChronology();
        org.joda.time.Partial partial13 = new org.joda.time.Partial(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.Partial partial15 = partial13.minus(readablePeriod14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = partial15.getFieldTypes();
        org.joda.time.Partial partial17 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology18 = partial17.getChronology();
        org.joda.time.Partial partial19 = new org.joda.time.Partial();
        boolean boolean20 = partial17.isEqual((org.joda.time.ReadablePartial) partial19);
        org.joda.time.Partial partial21 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology22 = partial21.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = partial21.getFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = partial21.isSupported(dateTimeFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.Partial partial27 = partial21.plus(readablePeriod26);
        boolean boolean28 = partial17.isAfter((org.joda.time.ReadablePartial) partial21);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        org.joda.time.Partial partial30 = partial21.without(dateTimeFieldType29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = partial21.getFieldTypes();
        org.joda.time.Partial partial32 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology33 = partial32.getChronology();
        org.joda.time.Partial partial34 = new org.joda.time.Partial(chronology33);
        org.joda.time.Chronology chronology35 = partial34.getChronology();
        org.joda.time.Partial partial36 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology37 = partial36.getChronology();
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology39 = partial38.getChronology();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.Partial partial42 = partial40.minus(readablePeriod41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = partial42.getFieldTypes();
        org.joda.time.Partial partial44 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology45 = partial44.getChronology();
        org.joda.time.Partial partial46 = new org.joda.time.Partial(chronology45);
        java.lang.String str48 = partial46.toString("[]");
        org.joda.time.Partial partial49 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology50 = partial49.getChronology();
        org.joda.time.Partial partial51 = new org.joda.time.Partial(chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.Partial partial53 = partial51.minus(readablePeriod52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.Partial partial55 = partial51.minus(readablePeriod54);
        boolean boolean56 = partial46.isMatch((org.joda.time.ReadablePartial) partial55);
        int[] intArray57 = partial46.getValues();
        org.joda.time.Partial partial58 = new org.joda.time.Partial(chronology37, dateTimeFieldTypeArray43, intArray57);
        org.joda.time.Partial partial59 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology60 = partial59.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = partial59.getFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = null;
        boolean boolean63 = partial59.isSupported(dateTimeFieldType62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.Partial partial65 = partial59.plus(readablePeriod64);
        org.joda.time.Partial partial66 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology67 = partial66.getChronology();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(chronology67);
        java.lang.String str69 = partial68.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        boolean boolean71 = partial68.isSupported(dateTimeFieldType70);
        int[] intArray72 = partial68.getValues();
        org.joda.time.Partial partial73 = new org.joda.time.Partial(partial59, intArray72);
        org.joda.time.Partial partial74 = new org.joda.time.Partial(chronology35, dateTimeFieldTypeArray43, intArray72);
        org.joda.time.Partial partial75 = new org.joda.time.Partial(dateTimeFieldTypeArray31, intArray72);
        org.joda.time.Partial partial76 = new org.joda.time.Partial(dateTimeFieldTypeArray16, intArray72);
        org.joda.time.Partial partial77 = new org.joda.time.Partial(chronology3, dateTimeFieldTypeArray10, intArray72);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray79 = new org.joda.time.DateTimeFieldType[] {};
        int[] intArray80 = new int[] {};
        org.joda.time.Partial partial81 = new org.joda.time.Partial(chronology78, dateTimeFieldTypeArray79, intArray80);
        int[] intArray82 = null;
        org.joda.time.Partial partial83 = new org.joda.time.Partial(chronology3, dateTimeFieldTypeArray79, intArray82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial0 and partial81", (partial0.compareTo(partial81) == 0) == partial0.equals(partial81));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology2 = partial1.getChronology();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Partial partial4 = partial1.plus(readablePeriod3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = partial1.isSupported(dateTimeFieldType5);
        java.lang.String str7 = partial1.toStringList();
        org.joda.time.Partial partial8 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology9 = partial8.getChronology();
        org.joda.time.Partial partial10 = new org.joda.time.Partial();
        boolean boolean11 = partial8.isEqual((org.joda.time.ReadablePartial) partial10);
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology13 = partial12.getChronology();
        org.joda.time.Partial partial14 = new org.joda.time.Partial(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.Partial partial16 = partial14.minus(readablePeriod15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = partial16.toDateTime(readableInstant17);
        int int19 = partial8.compareTo((org.joda.time.ReadablePartial) partial16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = partial16.toString(dateTimeFormatter20);
        org.joda.time.Partial partial22 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology23 = partial22.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial(chronology23);
        org.joda.time.Partial partial25 = partial16.withChronologyRetainFields(chronology23);
        org.joda.time.Partial partial26 = partial1.withChronologyRetainFields(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = partial1.getFormatter();
        java.util.Locale locale29 = null;
        java.lang.String str30 = partial1.toString("[]", locale29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = partial1.getFieldTypes();
        int[] intArray32 = null;
        org.joda.time.Partial partial33 = new org.joda.time.Partial(chronology0, dateTimeFieldTypeArray31, intArray32);
        org.joda.time.Partial partial34 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology35 = partial34.getChronology();
        org.joda.time.Partial partial36 = new org.joda.time.Partial();
        boolean boolean37 = partial34.isEqual((org.joda.time.ReadablePartial) partial36);
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology39 = partial38.getChronology();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.Partial partial42 = partial40.minus(readablePeriod41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = partial42.toDateTime(readableInstant43);
        int int45 = partial34.compareTo((org.joda.time.ReadablePartial) partial42);
        java.lang.String str46 = partial34.toStringList();
        int int47 = partial34.size();
        org.joda.time.Chronology chronology48 = partial34.getChronology();
        org.joda.time.Partial partial49 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology50 = partial49.getChronology();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.Partial partial52 = partial49.plus(readablePeriod51);
        org.joda.time.Partial partial53 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology54 = partial53.getChronology();
        org.joda.time.Partial partial55 = new org.joda.time.Partial();
        boolean boolean56 = partial53.isEqual((org.joda.time.ReadablePartial) partial55);
        boolean boolean57 = partial49.isEqual((org.joda.time.ReadablePartial) partial55);
        org.joda.time.Partial partial58 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial55);
        int[] intArray59 = partial55.getValues();
        org.joda.time.Partial partial60 = new org.joda.time.Partial(partial34, intArray59);
        org.joda.time.Partial partial61 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology62 = partial61.getChronology();
        org.joda.time.Partial partial63 = new org.joda.time.Partial(chronology62);
        java.lang.String str65 = partial63.toString("[]");
        org.joda.time.Partial partial66 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology67 = partial66.getChronology();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(chronology67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.Partial partial70 = partial68.minus(readablePeriod69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.Partial partial72 = partial68.minus(readablePeriod71);
        boolean boolean73 = partial63.isMatch((org.joda.time.ReadablePartial) partial72);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = null;
        boolean boolean75 = partial63.isSupported(dateTimeFieldType74);
        java.lang.String str76 = partial63.toString();
        org.joda.time.Chronology chronology77 = partial63.getChronology();
        org.joda.time.Partial partial78 = new org.joda.time.Partial(dateTimeFieldTypeArray31, intArray59, chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial1 and partial33", (partial1.compareTo(partial33) == 0) == partial1.equals(partial33));
    }
}

