package org.joda.time.format;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray5 = savedState4.iSavedFields;
        org.joda.time.DateTimeZone dateTimeZone6 = savedState4.iZone;
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale9);
        int int11 = dateTimeParserBucket10.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState12 = dateTimeParserBucket10.new SavedState();
        long long14 = dateTimeParserBucket10.computeMillis(true);
        java.lang.Object obj15 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket10.saveField(dateTimeField16, (int) 'a');
        org.joda.time.Chronology chronology19 = dateTimeParserBucket10.getChronology();
        boolean boolean20 = savedState4.restoreState(dateTimeParserBucket10);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology24, locale25);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology29, locale30);
        java.util.Locale locale32 = dateTimeParserBucket31.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology27, locale32, (java.lang.Integer) 10);
        long long36 = dateTimeParserBucket34.computeMillis(false);
        java.util.Locale locale37 = dateTimeParserBucket34.getLocale();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology39, locale40);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState42 = dateTimeParserBucket41.new SavedState();
        java.lang.Class<?> wildcardClass43 = dateTimeParserBucket41.getClass();
        boolean boolean44 = dateTimeParserBucket34.restoreState((java.lang.Object) wildcardClass43);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket34.getChronology();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology48, locale49);
        int int51 = dateTimeParserBucket50.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState52 = dateTimeParserBucket50.new SavedState();
        long long54 = dateTimeParserBucket50.computeMillis(true);
        java.lang.Object obj55 = dateTimeParserBucket50.saveState();
        org.joda.time.DateTimeField dateTimeField56 = null;
        dateTimeParserBucket50.saveField(dateTimeField56, (int) 'a');
        org.joda.time.Chronology chronology59 = dateTimeParserBucket50.getChronology();
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology64, locale65);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        java.util.Locale locale68 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology67, locale68);
        java.util.Locale locale70 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology67, locale70);
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology74, locale75);
        org.joda.time.Chronology chronology77 = dateTimeParserBucket76.getChronology();
        org.joda.time.Chronology chronology79 = null;
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology79, locale80);
        java.util.Locale locale82 = dateTimeParserBucket81.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology77, locale82, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology67, locale82, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket((-17L), chronology59, locale82, (java.lang.Integer) 1, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((-25200001L), chronology45, locale82);
        boolean boolean92 = savedState4.restoreState(dateTimeParserBucket91);
        org.junit.Assert.assertNotNull(savedFieldArray5);
        org.junit.Assert.assertArrayEquals(savedFieldArray5, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199965L) + "'", long14 == (-25199965L));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-25199965L) + "'", long54 == (-25199965L));
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale9);
        long long11 = dateTimeParserBucket10.computeMillis();
        dateTimeParserBucket10.setOffset((int) (short) 0);
        boolean boolean14 = savedState6.restoreState(dateTimeParserBucket10);
        long long17 = dateTimeParserBucket10.computeMillis(false, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket10.saveField(dateTimeFieldType18, "hi!", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199965L) + "'", long11 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        int int6 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket11.saveField(dateTimeField12, (int) 'a');
        java.util.Locale locale15 = dateTimeParserBucket11.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology7, locale15, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology21, locale22);
        int int24 = dateTimeParserBucket23.getOffset();
        org.joda.time.Chronology chronology25 = dateTimeParserBucket23.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket29.saveField(dateTimeField30, (int) 'a');
        java.util.Locale locale33 = dateTimeParserBucket29.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology25, locale33, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale33, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField39 = null;
        dateTimeParserBucket38.saveField(dateTimeField39, (int) 'a');
        org.joda.time.format.DateTimeParserBucket.SavedState savedState42 = dateTimeParserBucket38.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone43 = savedState42.iZone;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone43);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale7);
        int int9 = dateTimeParserBucket8.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale13);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) 'a');
        java.util.Locale locale18 = dateTimeParserBucket14.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology10, locale18, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology24, locale25);
        int int27 = dateTimeParserBucket26.getOffset();
        org.joda.time.Chronology chronology28 = dateTimeParserBucket26.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology30, locale31);
        org.joda.time.DateTimeField dateTimeField33 = null;
        dateTimeParserBucket32.saveField(dateTimeField33, (int) 'a');
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology28, locale36, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale36, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology45, locale46);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology50, locale51);
        java.util.Locale locale53 = dateTimeParserBucket52.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology48, locale53, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology58, locale59);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale64 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology63, locale64);
        java.util.Locale locale66 = dateTimeParserBucket65.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology61, locale66, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology48, locale66, (java.lang.Integer) 1);
        java.util.Locale locale72 = dateTimeParserBucket71.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale72, (java.lang.Integer) (-1), 100);
        java.util.Locale locale76 = dateTimeParserBucket75.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology1, locale76, (java.lang.Integer) 100, 100);
        dateTimeParserBucket79.setPivotYear((java.lang.Integer) (-1));
        long long83 = dateTimeParserBucket79.computeMillis(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-25199999L) + "'", long83 == (-25199999L));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket3.new SavedState();
        long long7 = dateTimeParserBucket3.computeMillis(true);
        long long9 = dateTimeParserBucket3.computeMillis(true);
        long long10 = dateTimeParserBucket3.computeMillis();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState12 = dateTimeParserBucket3.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone13 = savedState12.iZone;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199965L) + "'", long9 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199965L) + "'", long10 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199965L) + "'", long11 == (-25199965L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        long long7 = dateTimeParserBucket3.computeMillis(false);
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState9 = dateTimeParserBucket3.new SavedState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        long long15 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199990L) + "'", long7 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199990L) + "'", long8 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199990L) + "'", long11 == (-25199990L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199990L) + "'", long15 == (-25199990L));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology17, locale18);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 10);
        java.lang.Object obj25 = dateTimeParserBucket24.saveState();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket24.getZone();
        long long28 = dateTimeParserBucket24.computeMillis(false);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology33, locale34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology38, locale39);
        java.util.Locale locale41 = dateTimeParserBucket40.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology36, locale41, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology46, locale47);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology51, locale52);
        java.util.Locale locale54 = dateTimeParserBucket53.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology49, locale54, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology36, locale54, (java.lang.Integer) 1);
        java.util.Locale locale60 = dateTimeParserBucket59.getLocale();
        java.util.Locale locale61 = dateTimeParserBucket59.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((-25199965L), chronology29, locale61, (java.lang.Integer) 1, (int) (byte) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology13, locale61);
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology67, locale68);
        org.joda.time.Chronology chronology70 = dateTimeParserBucket69.getChronology();
        java.util.Locale locale71 = dateTimeParserBucket69.getLocale();
        org.joda.time.Chronology chronology72 = dateTimeParserBucket69.getChronology();
        java.util.Locale locale73 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(1L, chronology13, locale73, (java.lang.Integer) 1, (int) (short) 0);
        long long79 = dateTimeParserBucket76.computeMillis(true, "hi!");
        int int80 = dateTimeParserBucket76.getOffset();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        int int11 = dateTimeParserBucket3.getOffset();
        long long14 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 2);
        long long18 = dateTimeParserBucket3.computeMillis(true);
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-17L) + "'", long14 == (-17L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-17L) + "'", long18 == (-17L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) (short) 0);
        int int7 = dateTimeParserBucket3.getOffset();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        long long12 = dateTimeParserBucket11.computeMillis();
        dateTimeParserBucket11.setOffset((int) (short) 0);
        boolean boolean15 = savedState7.restoreState(dateTimeParserBucket11);
        java.util.Locale locale16 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        long long20 = dateTimeParserBucket11.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology22 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((-98L), chronology22, locale23, (java.lang.Integer) 100, (int) (short) 100);
        int int27 = dateTimeParserBucket26.getOffset();
        int int28 = dateTimeParserBucket26.getOffset();
        java.lang.Class<?> wildcardClass29 = dateTimeParserBucket26.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199990L) + "'", long6 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket13.saveField(dateTimeField14, (int) (byte) 100);
        dateTimeParserBucket13.setOffset((int) (byte) 1);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState19 = dateTimeParserBucket13.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone20 = savedState19.iZone;
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone20);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        int int5 = dateTimeParserBucket4.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket4.new SavedState();
        long long8 = dateTimeParserBucket4.computeMillis(true);
        java.lang.Object obj9 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket4.saveField(dateTimeField10, (int) 'a');
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology18, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology21, locale24);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale29);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale34);
        java.util.Locale locale36 = dateTimeParserBucket35.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology31, locale36, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology21, locale36, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-17L), chronology13, locale36, (java.lang.Integer) 1, (int) '4');
        java.util.Locale locale45 = dateTimeParserBucket44.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState46 = dateTimeParserBucket44.new SavedState();
        int int47 = savedState46.iSavedFieldsCount;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Object obj4 = dateTimeParserBucket3.saveState();
        int int5 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale6 = dateTimeParserBucket3.getLocale();
        long long7 = dateTimeParserBucket3.computeMillis();
        int int8 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale10, (java.lang.Integer) 10);
        long long14 = dateTimeParserBucket12.computeMillis(false);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState15 = dateTimeParserBucket12.new SavedState();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, (int) 'a');
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        int int6 = dateTimeParserBucket5.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket5.new SavedState();
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) 'a');
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology19, locale20);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket21.getChronology();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale23);
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology22, locale25);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology29, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology34, locale35);
        java.util.Locale locale37 = dateTimeParserBucket36.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology32, locale37, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology22, locale37, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((-17L), chronology14, locale37, (java.lang.Integer) 1, (int) '4');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology51, locale52);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology56, locale57);
        java.util.Locale locale59 = dateTimeParserBucket58.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology54, locale59, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology64, locale65);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology69, locale70);
        int int72 = dateTimeParserBucket71.getOffset();
        org.joda.time.Chronology chronology73 = dateTimeParserBucket71.getChronology();
        java.util.Locale locale74 = dateTimeParserBucket71.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology67, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology54, locale74, (java.lang.Integer) 1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology47, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale74, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = null;
        java.util.Locale locale83 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket80.saveField(dateTimeFieldType81, "", locale83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199965L) + "'", long9 == (-25199965L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        int int5 = dateTimeParserBucket3.getOffset();
        long long7 = dateTimeParserBucket3.computeMillis(false);
        long long9 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology18, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology21, locale22);
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology21, locale24);
        int int26 = dateTimeParserBucket25.getOffset();
        java.lang.Object obj27 = null;
        boolean boolean28 = dateTimeParserBucket25.restoreState(obj27);
        long long29 = dateTimeParserBucket25.computeMillis();
        long long30 = dateTimeParserBucket25.computeMillis();
        boolean boolean31 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199990L) + "'", long7 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199990L) + "'", long9 == (-25199990L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199990L) + "'", long14 == (-25199990L));
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket3.saveField(dateTimeField7, (int) '4');
        int int10 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        int int7 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) 'a');
        java.util.Locale locale16 = dateTimeParserBucket12.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology8, locale16, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology22, locale23);
        int int25 = dateTimeParserBucket24.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) 'a');
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology26, locale34, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale34, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology43, locale44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology48, locale49);
        java.util.Locale locale51 = dateTimeParserBucket50.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology46, locale51, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology56, locale57);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology61, locale62);
        java.util.Locale locale64 = dateTimeParserBucket63.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology59, locale64, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology46, locale64, (java.lang.Integer) 1);
        java.util.Locale locale70 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale70, (java.lang.Integer) (-1), 100);
        java.util.Locale locale74 = dateTimeParserBucket73.getLocale();
        org.joda.time.Chronology chronology75 = dateTimeParserBucket73.getChronology();
        dateTimeParserBucket73.setOffset((int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology75);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (-1));
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        long long14 = dateTimeParserBucket13.computeMillis();
        java.lang.Object obj15 = dateTimeParserBucket13.saveState();
        dateTimeParserBucket13.setOffset(1);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology5 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket9.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = null;
        boolean boolean12 = savedState10.restoreState(dateTimeParserBucket11);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray13 = savedState10.iSavedFields;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale24, (java.lang.Integer) 10);
        long long28 = dateTimeParserBucket26.computeMillis(false);
        boolean boolean29 = savedState10.restoreState(dateTimeParserBucket26);
        org.joda.time.DateTimeZone dateTimeZone30 = savedState10.iZone;
        dateTimeParserBucket3.setZone(dateTimeZone30);
        java.lang.Integer int32 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(savedFieldArray13);
        org.junit.Assert.assertArrayEquals(savedFieldArray13, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNull(int32);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        int int5 = savedState4.iOffset;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology7, locale8);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket9.saveField(dateTimeField10, (int) 'a');
        java.util.Locale locale13 = dateTimeParserBucket9.getLocale();
        boolean boolean14 = savedState4.restoreState(dateTimeParserBucket9);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray15 = savedState4.iSavedFields;
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology18, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket25.saveField(dateTimeField27, 10);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket25.getZone();
        boolean boolean32 = savedState4.restoreState(dateTimeParserBucket25);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray33 = savedState4.iSavedFields;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(savedFieldArray15);
        org.junit.Assert.assertArrayEquals(savedFieldArray15, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(savedFieldArray33);
        org.junit.Assert.assertArrayEquals(savedFieldArray33, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        boolean boolean8 = dateTimeParserBucket3.restoreState((java.lang.Object) 'a');
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-17L) + "'", long11 == (-17L));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        long long7 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((int) '4');
        boolean boolean11 = dateTimeParserBucket6.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology12 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale15);
        java.lang.Integer int17 = dateTimeParserBucket16.getPivotYear();
        java.lang.Object obj18 = dateTimeParserBucket16.saveState();
        dateTimeParserBucket16.setOffset(52);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket16.getChronology();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 52);
        java.util.Locale locale24 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology12, locale24, (java.lang.Integer) 0);
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale27);
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology31, locale32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology39 = dateTimeParserBucket38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket38.saveField(dateTimeField40, 10);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket38.getChronology();
        java.util.Locale locale44 = dateTimeParserBucket38.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology12, locale44, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket.SavedState savedState47 = dateTimeParserBucket46.new SavedState();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "th_TH");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199965L) + "'", long10 == (-25199965L));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) 'a');
        java.util.Locale locale7 = dateTimeParserBucket3.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState8 = dateTimeParserBucket3.new SavedState();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        long long5 = dateTimeParserBucket4.computeMillis();
        dateTimeParserBucket4.setOffset((int) '4');
        boolean boolean9 = dateTimeParserBucket4.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology11, locale12);
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket13.saveField(dateTimeField16, 0);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket13.saveField(dateTimeField19, (int) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology7, locale8);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology7, locale10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology14, locale15);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState17 = dateTimeParserBucket16.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray18 = savedState17.iSavedFields;
        org.joda.time.DateTimeZone dateTimeZone19 = savedState17.iZone;
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology23, locale24);
        int int26 = dateTimeParserBucket25.getOffset();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket25.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology29, locale30);
        org.joda.time.DateTimeField dateTimeField32 = null;
        dateTimeParserBucket31.saveField(dateTimeField32, (int) 'a');
        java.util.Locale locale35 = dateTimeParserBucket31.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology27, locale35, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology41, locale42);
        int int44 = dateTimeParserBucket43.getOffset();
        org.joda.time.Chronology chronology45 = dateTimeParserBucket43.getChronology();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology47, locale48);
        org.joda.time.DateTimeField dateTimeField50 = null;
        dateTimeParserBucket49.saveField(dateTimeField50, (int) 'a');
        java.util.Locale locale53 = dateTimeParserBucket49.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology45, locale53, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale53, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField59 = null;
        dateTimeParserBucket58.saveField(dateTimeField59, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeParserBucket58.getZone();
        boolean boolean63 = savedState17.restoreState(dateTimeParserBucket58);
        java.util.Locale locale64 = dateTimeParserBucket58.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((-25200001L), chronology12, locale64, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(savedFieldArray18);
        org.junit.Assert.assertArrayEquals(savedFieldArray18, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState8 = dateTimeParserBucket3.new SavedState();
        int int9 = savedState8.iOffset;
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 10);
        java.lang.Object obj10 = dateTimeParserBucket9.saveState();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket9.getZone();
        long long13 = dateTimeParserBucket9.computeMillis(false);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket9.getChronology();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket9.getChronology();
        java.lang.Integer int16 = dateTimeParserBucket9.getPivotYear();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale7);
        int int9 = dateTimeParserBucket8.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket8.new SavedState();
        long long12 = dateTimeParserBucket8.computeMillis(true);
        java.lang.Object obj13 = dateTimeParserBucket8.saveState();
        long long14 = dateTimeParserBucket8.computeMillis();
        boolean boolean15 = savedState4.restoreState(dateTimeParserBucket8);
        long long18 = dateTimeParserBucket8.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket8.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket8.saveField(dateTimeFieldType20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199965L) + "'", long14 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199965L) + "'", long18 == (-25199965L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Object obj4 = dateTimeParserBucket3.saveState();
        int int5 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale6 = dateTimeParserBucket3.getLocale();
        long long7 = dateTimeParserBucket3.computeMillis();
        java.util.Locale locale8 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        long long6 = dateTimeParserBucket4.computeMillis();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale12);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale15 = dateTimeParserBucket13.getLocale();
        org.joda.time.Chronology chronology16 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale17 = dateTimeParserBucket13.getLocale();
        long long18 = dateTimeParserBucket13.computeMillis();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket13.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology21, locale22);
        int int24 = dateTimeParserBucket23.getOffset();
        org.joda.time.Chronology chronology25 = dateTimeParserBucket23.getChronology();
        java.util.Locale locale26 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology19, locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-25199948L), chronology8, locale26, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199965L) + "'", long18 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale10, (java.lang.Integer) 10);
        long long14 = dateTimeParserBucket12.computeMillis(false);
        java.util.Locale locale15 = dateTimeParserBucket12.getLocale();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology17, locale18);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState20 = dateTimeParserBucket19.new SavedState();
        java.lang.Class<?> wildcardClass21 = dateTimeParserBucket19.getClass();
        boolean boolean22 = dateTimeParserBucket12.restoreState((java.lang.Object) wildcardClass21);
        dateTimeParserBucket12.setOffset(10);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket12.getChronology();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket13.saveField(dateTimeField14, (int) (byte) 100);
        dateTimeParserBucket13.setOffset((int) (byte) 1);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState19 = dateTimeParserBucket13.new SavedState();
        java.lang.Object obj20 = dateTimeParserBucket13.saveState();
        org.joda.time.Chronology chronology21 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket13.getZone();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNull(dateTimeZone22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology5, locale10, (java.lang.Integer) 10);
        dateTimeParserBucket12.setPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState15 = dateTimeParserBucket12.new SavedState();
        long long17 = dateTimeParserBucket12.computeMillis(false);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState18 = dateTimeParserBucket12.new SavedState();
        java.lang.Class<?> wildcardClass19 = savedState18.getClass();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long7 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        long long14 = dateTimeParserBucket13.computeMillis();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState15 = dateTimeParserBucket13.new SavedState();
        int int16 = savedState15.iSavedFieldsCount;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray17 = savedState15.iSavedFields;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology20, locale21);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale26);
        java.util.Locale locale28 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology23, locale28, (java.lang.Integer) 10);
        long long32 = dateTimeParserBucket30.computeMillis(false);
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.lang.Object obj34 = dateTimeParserBucket30.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState35 = dateTimeParserBucket30.new SavedState();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 1);
        boolean boolean38 = savedState15.restoreState(dateTimeParserBucket30);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray17);
        org.junit.Assert.assertArrayEquals(savedFieldArray17, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology5, locale6);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology10, locale11);
        java.util.Locale locale13 = dateTimeParserBucket12.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology8, locale13, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology18, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology23, locale24);
        int int26 = dateTimeParserBucket25.getOffset();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket25.getChronology();
        java.util.Locale locale28 = dateTimeParserBucket25.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology21, locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology8, locale28, (java.lang.Integer) 1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale28);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology34, locale35);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState37 = dateTimeParserBucket36.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = null;
        boolean boolean39 = savedState37.restoreState(dateTimeParserBucket38);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray40 = savedState37.iSavedFields;
        int int41 = savedState37.iSavedFieldsCount;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray42 = savedState37.iSavedFields;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray43 = savedState37.iSavedFields;
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology45, locale46);
        long long48 = dateTimeParserBucket47.computeMillis();
        dateTimeParserBucket47.setOffset((int) '4');
        boolean boolean52 = dateTimeParserBucket47.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology53 = dateTimeParserBucket47.getChronology();
        boolean boolean54 = savedState37.restoreState(dateTimeParserBucket47);
        int int55 = savedState37.iSavedFieldsCount;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray56 = savedState37.iSavedFields;
        org.joda.time.DateTimeZone dateTimeZone57 = savedState37.iZone;
        dateTimeParserBucket32.setZone(dateTimeZone57);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(savedFieldArray40);
        org.junit.Assert.assertArrayEquals(savedFieldArray40, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray42);
        org.junit.Assert.assertArrayEquals(savedFieldArray42, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(savedFieldArray43);
        org.junit.Assert.assertArrayEquals(savedFieldArray43, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-25199965L) + "'", long48 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray56);
        org.junit.Assert.assertArrayEquals(savedFieldArray56, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(dateTimeZone57);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology5 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale6 = dateTimeParserBucket3.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        long long7 = dateTimeParserBucket3.computeMillis(false);
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState9 = dateTimeParserBucket3.new SavedState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199990L) + "'", long7 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199990L) + "'", long8 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199990L) + "'", long11 == (-25199990L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        boolean boolean8 = dateTimeParserBucket3.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        long long14 = dateTimeParserBucket13.computeMillis();
        long long15 = dateTimeParserBucket13.computeMillis();
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 52);
        dateTimeParserBucket13.setOffset((int) 'a');
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState24 = dateTimeParserBucket23.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = null;
        boolean boolean26 = savedState24.restoreState(dateTimeParserBucket25);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray27 = savedState24.iSavedFields;
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology30, locale31);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology35, locale36);
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology33, locale38, (java.lang.Integer) 10);
        long long42 = dateTimeParserBucket40.computeMillis(false);
        boolean boolean43 = savedState24.restoreState(dateTimeParserBucket40);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray44 = savedState24.iSavedFields;
        org.joda.time.DateTimeZone dateTimeZone45 = savedState24.iZone;
        boolean boolean46 = dateTimeParserBucket13.restoreState((java.lang.Object) savedState24);
        org.joda.time.DateTimeField dateTimeField47 = null;
        dateTimeParserBucket13.saveField(dateTimeField47, (int) 'a');
        org.joda.time.DateTimeField dateTimeField50 = null;
        dateTimeParserBucket13.saveField(dateTimeField50, 35);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(savedFieldArray27);
        org.junit.Assert.assertArrayEquals(savedFieldArray27, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(savedFieldArray44);
        org.junit.Assert.assertArrayEquals(savedFieldArray44, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale9);
        int int11 = dateTimeParserBucket10.getOffset();
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeParserBucket10.restoreState(obj12);
        long long16 = dateTimeParserBucket10.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset(52);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        java.util.Locale locale23 = dateTimeParserBucket20.getLocale();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale26);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState28 = dateTimeParserBucket27.new SavedState();
        java.lang.Class<?> wildcardClass29 = dateTimeParserBucket27.getClass();
        boolean boolean30 = dateTimeParserBucket20.restoreState((java.lang.Object) wildcardClass29);
        dateTimeParserBucket20.setOffset((int) (short) 10);
        boolean boolean33 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket20);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket20.getZone();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(dateTimeZone34);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 10);
        java.lang.Object obj10 = dateTimeParserBucket9.saveState();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket9.getZone();
        long long13 = dateTimeParserBucket9.computeMillis(false);
        dateTimeParserBucket9.setPivotYear((java.lang.Integer) 10);
        java.util.Locale locale16 = dateTimeParserBucket9.getLocale();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(32L, chronology6, locale9, (java.lang.Integer) 10, (int) (byte) -1);
        java.lang.Integer int13 = dateTimeParserBucket12.getPivotYear();
        dateTimeParserBucket12.setPivotYear((java.lang.Integer) 100);
        long long18 = dateTimeParserBucket12.computeMillis(false, "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket3.new SavedState();
        long long7 = dateTimeParserBucket3.computeMillis(true);
        long long8 = dateTimeParserBucket3.computeMillis();
        long long9 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        int int11 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199965L) + "'", long9 == (-25199965L));
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset(52);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        java.util.Locale locale23 = dateTimeParserBucket20.getLocale();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale26);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState28 = dateTimeParserBucket27.new SavedState();
        java.lang.Class<?> wildcardClass29 = dateTimeParserBucket27.getClass();
        boolean boolean30 = dateTimeParserBucket20.restoreState((java.lang.Object) wildcardClass29);
        dateTimeParserBucket20.setOffset((int) (short) 10);
        boolean boolean33 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket20);
        long long35 = dateTimeParserBucket20.computeMillis(false);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-11L) + "'", long35 == (-11L));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket3.new SavedState();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        int int7 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) 'a');
        java.util.Locale locale16 = dateTimeParserBucket12.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology8, locale16, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology22, locale23);
        int int25 = dateTimeParserBucket24.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) 'a');
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology26, locale34, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale34, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology43, locale44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology48, locale49);
        java.util.Locale locale51 = dateTimeParserBucket50.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology46, locale51, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology56, locale57);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology61, locale62);
        java.util.Locale locale64 = dateTimeParserBucket63.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology59, locale64, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology46, locale64, (java.lang.Integer) 1);
        java.util.Locale locale70 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale70, (java.lang.Integer) (-1), 100);
        java.util.Locale locale74 = dateTimeParserBucket73.getLocale();
        org.joda.time.Chronology chronology75 = dateTimeParserBucket73.getChronology();
        java.lang.Integer int76 = dateTimeParserBucket73.getPivotYear();
        dateTimeParserBucket73.setPivotYear((java.lang.Integer) 100);
        long long80 = dateTimeParserBucket73.computeMillis(true);
        java.lang.Integer int81 = dateTimeParserBucket73.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        dateTimeParserBucket73.setZone(dateTimeZone82);
        org.joda.time.Chronology chronology84 = dateTimeParserBucket73.getChronology();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 35L + "'", long80 == 35L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        int int10 = dateTimeParserBucket3.getOffset();
        long long11 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) ' ');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-17L) + "'", long11 == (-17L));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long6 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) (short) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket11.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray14 = savedState13.iSavedFields;
        boolean boolean15 = dateTimeParserBucket3.restoreState((java.lang.Object) savedState13);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        long long19 = dateTimeParserBucket3.computeMillis(true, "");
        java.util.Locale locale20 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray14);
        org.junit.Assert.assertArrayEquals(savedFieldArray14, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-25199965L) + "'", long19 == (-25199965L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        boolean boolean8 = dateTimeParserBucket3.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket13.new SavedState();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale24, (java.lang.Integer) 0);
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale30, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket.SavedState savedState33 = dateTimeParserBucket32.new SavedState();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        long long6 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((int) '4');
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) '4');
        java.util.Locale locale12 = dateTimeParserBucket5.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(10L, chronology1, locale12, (java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket14.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale9);
        long long11 = dateTimeParserBucket10.computeMillis();
        dateTimeParserBucket10.setOffset((int) (short) 0);
        boolean boolean14 = savedState6.restoreState(dateTimeParserBucket10);
        int int15 = savedState6.iOffset;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray16 = savedState6.iSavedFields;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199965L) + "'", long11 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray16);
        org.junit.Assert.assertArrayEquals(savedFieldArray16, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        long long12 = dateTimeParserBucket11.computeMillis();
        dateTimeParserBucket11.setOffset((int) (short) 0);
        boolean boolean15 = savedState7.restoreState(dateTimeParserBucket11);
        java.util.Locale locale16 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        long long20 = dateTimeParserBucket11.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology22 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((-98L), chronology22, locale23, (java.lang.Integer) 100, (int) (short) 100);
        int int27 = dateTimeParserBucket26.getOffset();
        int int28 = dateTimeParserBucket26.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket26.saveField(dateTimeFieldType29, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199990L) + "'", long6 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        boolean boolean23 = savedState4.restoreState(dateTimeParserBucket20);
        org.joda.time.DateTimeZone dateTimeZone24 = savedState4.iZone;
        org.joda.time.DateTimeZone dateTimeZone25 = savedState4.iZone;
        int int26 = savedState4.iSavedFieldsCount;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray27 = savedState4.iSavedFields;
        int int28 = savedState4.iSavedFieldsCount;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = null;
        boolean boolean30 = savedState4.restoreState(dateTimeParserBucket29);
        int int31 = savedState4.iSavedFieldsCount;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray27);
        org.junit.Assert.assertArrayEquals(savedFieldArray27, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 35);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState11 = dateTimeParserBucket3.new SavedState();
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        int int8 = savedState4.iSavedFieldsCount;
        int int9 = savedState4.iOffset;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket3.new SavedState();
        long long7 = dateTimeParserBucket3.computeMillis(true);
        long long8 = dateTimeParserBucket3.computeMillis();
        long long9 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199965L) + "'", long9 == (-25199965L));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology7, locale8);
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology7, locale10);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology19, locale20);
        java.util.Locale locale22 = dateTimeParserBucket21.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology17, locale22, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale22, (java.lang.Integer) 0);
        long long30 = dateTimeParserBucket27.computeMillis(false, "hi!");
        java.lang.Object obj31 = dateTimeParserBucket27.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState32 = dateTimeParserBucket27.new SavedState();
        int int33 = dateTimeParserBucket27.getOffset();
        java.util.Locale locale34 = dateTimeParserBucket27.getLocale();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        long long5 = dateTimeParserBucket4.computeMillis();
        dateTimeParserBucket4.setOffset((int) '4');
        boolean boolean9 = dateTimeParserBucket4.restoreState((java.lang.Object) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology15, locale16);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology18, locale19);
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology18, locale21);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology25, locale26);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology30, locale31);
        java.util.Locale locale33 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology28, locale33, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale33, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology10, locale33, (java.lang.Integer) 52);
        java.lang.Integer int41 = dateTimeParserBucket40.getPivotYear();
        org.joda.time.DateTimeField dateTimeField42 = null;
        dateTimeParserBucket40.saveField(dateTimeField42, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        long long14 = dateTimeParserBucket13.computeMillis();
        java.lang.Integer int15 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState16 = dateTimeParserBucket13.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray17 = savedState16.iSavedFields;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology21, locale22);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale27);
        java.util.Locale locale29 = dateTimeParserBucket28.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology24, locale29, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology34, locale35);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology39, locale40);
        java.util.Locale locale42 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology37, locale42, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology24, locale42, (java.lang.Integer) 1);
        java.util.Locale locale48 = dateTimeParserBucket47.getLocale();
        java.util.Locale locale49 = dateTimeParserBucket47.getLocale();
        org.joda.time.DateTimeField dateTimeField50 = null;
        dateTimeParserBucket47.saveField(dateTimeField50, (int) (short) 10);
        dateTimeParserBucket47.setOffset((int) (byte) -1);
        dateTimeParserBucket47.setOffset((int) '#');
        org.joda.time.format.DateTimeParserBucket.SavedState savedState57 = dateTimeParserBucket47.new SavedState();
        boolean boolean58 = savedState16.restoreState(dateTimeParserBucket47);
        java.lang.Class<?> wildcardClass59 = savedState16.getClass();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(savedFieldArray17);
        org.junit.Assert.assertArrayEquals(savedFieldArray17, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        java.lang.Object obj6 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setOffset(52);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale12);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology16, locale17);
        java.util.Locale locale19 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology14, locale19, (java.lang.Integer) 10);
        long long23 = dateTimeParserBucket21.computeMillis(false);
        java.util.Locale locale24 = dateTimeParserBucket21.getLocale();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale27);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState29 = dateTimeParserBucket28.new SavedState();
        java.lang.Class<?> wildcardClass30 = dateTimeParserBucket28.getClass();
        boolean boolean31 = dateTimeParserBucket21.restoreState((java.lang.Object) wildcardClass30);
        dateTimeParserBucket21.setOffset((int) (short) 10);
        boolean boolean34 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeParserBucket21);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket21.saveField(dateTimeField35, (int) '#');
        org.joda.time.Chronology chronology38 = dateTimeParserBucket21.getChronology();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology42, locale43);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 0, 10);
        java.lang.Object obj50 = dateTimeParserBucket49.saveState();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeParserBucket49.getZone();
        long long53 = dateTimeParserBucket49.computeMillis(false);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket49.getChronology();
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology57, locale58);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology62, locale63);
        java.util.Locale locale65 = dateTimeParserBucket64.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology60, locale65, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField69 = null;
        dateTimeParserBucket68.saveField(dateTimeField69, (int) (byte) 100);
        int int72 = dateTimeParserBucket68.getOffset();
        org.joda.time.DateTimeField dateTimeField73 = null;
        dateTimeParserBucket68.saveField(dateTimeField73, (int) (byte) -1);
        java.util.Locale locale76 = dateTimeParserBucket68.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(0L, chronology54, locale76, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology38, locale76, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket.SavedState savedState82 = dateTimeParserBucket81.new SavedState();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 97L + "'", long53 == 97L);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "th_TH");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket3.new SavedState();
        long long7 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        int int5 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale7 = dateTimeParserBucket4.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState8 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology13, locale14);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology18, locale19);
        java.util.Locale locale21 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology16, locale21, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology26, locale27);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology31, locale32);
        java.util.Locale locale34 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology29, locale34, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology16, locale34, (java.lang.Integer) 1);
        java.util.Locale locale40 = dateTimeParserBucket39.getLocale();
        java.util.Locale locale41 = dateTimeParserBucket39.getLocale();
        java.util.Locale locale42 = dateTimeParserBucket39.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-25199900L), chronology9, locale42, (java.lang.Integer) 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        long long9 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199990L) + "'", long9 == (-25199990L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology8, locale9);
        java.util.Locale locale11 = dateTimeParserBucket10.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology6, locale11, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale24, (java.lang.Integer) 1);
        java.util.Locale locale30 = dateTimeParserBucket29.getLocale();
        java.util.Locale locale31 = dateTimeParserBucket29.getLocale();
        org.joda.time.DateTimeField dateTimeField32 = null;
        dateTimeParserBucket29.saveField(dateTimeField32, (int) (short) 10);
        dateTimeParserBucket29.setOffset((int) (byte) -1);
        dateTimeParserBucket29.setOffset((int) '#');
        org.joda.time.format.DateTimeParserBucket.SavedState savedState39 = dateTimeParserBucket29.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone40 = savedState39.iZone;
        int int41 = savedState39.iSavedFieldsCount;
        org.joda.time.DateTimeZone dateTimeZone42 = savedState39.iZone;
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(dateTimeZone42);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        org.joda.time.Chronology chronology4 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale5 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale7 = dateTimeParserBucket3.getLocale();
        int int8 = dateTimeParserBucket3.getOffset();
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) '#');
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        int int6 = dateTimeParserBucket5.getOffset();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale12);
        int int14 = dateTimeParserBucket13.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState15 = dateTimeParserBucket13.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray16 = savedState15.iSavedFields;
        boolean boolean17 = dateTimeParserBucket5.restoreState((java.lang.Object) savedState15);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology22, locale23);
        int int25 = dateTimeParserBucket24.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) 'a');
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology26, locale34, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology40, locale41);
        int int43 = dateTimeParserBucket42.getOffset();
        org.joda.time.Chronology chronology44 = dateTimeParserBucket42.getChronology();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology46, locale47);
        org.joda.time.DateTimeField dateTimeField49 = null;
        dateTimeParserBucket48.saveField(dateTimeField49, (int) 'a');
        java.util.Locale locale52 = dateTimeParserBucket48.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology44, locale52, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale52, (java.lang.Integer) 0);
        long long59 = dateTimeParserBucket57.computeMillis(false);
        java.util.Locale locale60 = dateTimeParserBucket57.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 35, chronology18, locale60);
        java.util.Locale locale62 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((-65L), chronology18, locale62);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray16);
        org.junit.Assert.assertArrayEquals(savedFieldArray16, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 97L + "'", long59 == 97L);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "th_TH");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        int int7 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket6.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket6.new SavedState();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology15, locale16);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology20, locale21);
        java.util.Locale locale23 = dateTimeParserBucket22.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale23, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale29);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale34);
        java.util.Locale locale36 = dateTimeParserBucket35.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology31, locale36, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology18, locale36, (java.lang.Integer) 1);
        java.util.Locale locale42 = dateTimeParserBucket41.getLocale();
        java.util.Locale locale43 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology11, locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 2, chronology1, locale43, (java.lang.Integer) 100, 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "th_TH");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        boolean boolean23 = savedState4.restoreState(dateTimeParserBucket20);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket20.getZone();
        java.lang.Integer int25 = dateTimeParserBucket20.getPivotYear();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology8, locale9);
        java.util.Locale locale11 = dateTimeParserBucket10.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology6, locale11, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale24, (java.lang.Integer) 1);
        java.util.Locale locale30 = dateTimeParserBucket29.getLocale();
        java.util.Locale locale31 = dateTimeParserBucket29.getLocale();
        java.util.Locale locale32 = dateTimeParserBucket29.getLocale();
        long long33 = dateTimeParserBucket29.computeMillis();
        long long35 = dateTimeParserBucket29.computeMillis(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket29.saveField(dateTimeFieldType36, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        int int6 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket11.saveField(dateTimeField12, (int) 'a');
        java.util.Locale locale15 = dateTimeParserBucket11.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology7, locale15, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology21, locale22);
        int int24 = dateTimeParserBucket23.getOffset();
        org.joda.time.Chronology chronology25 = dateTimeParserBucket23.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket29.saveField(dateTimeField30, (int) 'a');
        java.util.Locale locale33 = dateTimeParserBucket29.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology25, locale33, (java.lang.Integer) (-1), (int) (byte) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale33, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField39 = null;
        dateTimeParserBucket38.saveField(dateTimeField39, (int) 'a');
        org.joda.time.Chronology chronology42 = dateTimeParserBucket38.getChronology();
        dateTimeParserBucket38.setOffset(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale9);
        long long12 = dateTimeParserBucket10.computeMillis(true);
        java.lang.Object obj13 = dateTimeParserBucket10.saveState();
        long long16 = dateTimeParserBucket10.computeMillis(true, "hi!");
        dateTimeParserBucket10.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket10.setOffset(100);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket13.saveField(dateTimeField14, (int) (byte) 100);
        dateTimeParserBucket13.setOffset((int) (byte) 1);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState19 = dateTimeParserBucket13.new SavedState();
        java.lang.Object obj20 = dateTimeParserBucket13.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType21, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket3.new SavedState();
        long long7 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis();
        int int10 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199965L) + "'", long9 == (-25199965L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        java.util.Locale locale4 = dateTimeParserBucket3.getLocale();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        java.util.Locale locale6 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 10);
        java.lang.Object obj10 = dateTimeParserBucket9.saveState();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket9.getZone();
        long long13 = dateTimeParserBucket9.computeMillis(false);
        dateTimeParserBucket9.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket9.getZone();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNull(dateTimeZone16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale7);
        int int9 = dateTimeParserBucket8.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket8.new SavedState();
        long long12 = dateTimeParserBucket8.computeMillis(true);
        java.lang.Object obj13 = dateTimeParserBucket8.saveState();
        long long14 = dateTimeParserBucket8.computeMillis();
        boolean boolean15 = savedState4.restoreState(dateTimeParserBucket8);
        dateTimeParserBucket8.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket8.setOffset((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199965L) + "'", long14 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket3.getZone();
        int int8 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        long long12 = dateTimeParserBucket11.computeMillis();
        dateTimeParserBucket11.setOffset((int) (short) 0);
        boolean boolean15 = savedState7.restoreState(dateTimeParserBucket11);
        java.util.Locale locale16 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        long long20 = dateTimeParserBucket11.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology22 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology26, locale27);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology29, locale30);
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology29, locale32);
        int int34 = dateTimeParserBucket33.getOffset();
        java.lang.Object obj35 = null;
        boolean boolean36 = dateTimeParserBucket33.restoreState(obj35);
        long long37 = dateTimeParserBucket33.computeMillis();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology39, locale40);
        java.lang.Integer int42 = dateTimeParserBucket41.getPivotYear();
        long long43 = dateTimeParserBucket41.computeMillis();
        long long44 = dateTimeParserBucket41.computeMillis();
        dateTimeParserBucket41.setOffset((int) (short) 1);
        java.lang.Object obj47 = dateTimeParserBucket41.saveState();
        long long48 = dateTimeParserBucket41.computeMillis();
        org.joda.time.Chronology chronology49 = dateTimeParserBucket41.getChronology();
        boolean boolean50 = dateTimeParserBucket33.restoreState((java.lang.Object) dateTimeParserBucket41);
        java.util.Locale locale51 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((-98L), chronology22, locale51);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199990L) + "'", long6 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-25199965L) + "'", long43 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-25199965L) + "'", long44 == (-25199965L));
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 34L + "'", long48 == 34L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        int int8 = savedState4.iSavedFieldsCount;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) 'a');
        java.util.Locale locale16 = dateTimeParserBucket12.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState17 = dateTimeParserBucket12.new SavedState();
        java.util.Locale locale18 = dateTimeParserBucket12.getLocale();
        boolean boolean19 = savedState4.restoreState(dateTimeParserBucket12);
        org.joda.time.DateTimeZone dateTimeZone20 = savedState4.iZone;
        org.joda.time.DateTimeZone dateTimeZone21 = savedState4.iZone;
        int int22 = savedState4.iSavedFieldsCount;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeParserBucket3.getZone();
        int int6 = dateTimeParserBucket3.getOffset();
        int int7 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        int int5 = dateTimeParserBucket3.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        boolean boolean23 = savedState4.restoreState(dateTimeParserBucket20);
        org.joda.time.DateTimeZone dateTimeZone24 = savedState4.iZone;
        org.joda.time.DateTimeZone dateTimeZone25 = savedState4.iZone;
        int int26 = savedState4.iSavedFieldsCount;
        int int27 = savedState4.iSavedFieldsCount;
        org.joda.time.DateTimeZone dateTimeZone28 = savedState4.iZone;
        int int29 = savedState4.iOffset;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray30 = savedState4.iSavedFields;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray30);
        org.junit.Assert.assertArrayEquals(savedFieldArray30, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket11.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray14 = savedState13.iSavedFields;
        boolean boolean15 = dateTimeParserBucket3.restoreState((java.lang.Object) savedState13);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray14);
        org.junit.Assert.assertArrayEquals(savedFieldArray14, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        java.lang.Object obj6 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setOffset(52);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology17, locale18);
        java.util.Locale locale20 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology15, locale20, (java.lang.Integer) 10);
        long long24 = dateTimeParserBucket22.computeMillis(false);
        java.lang.Integer int25 = dateTimeParserBucket22.getPivotYear();
        java.util.Locale locale26 = dateTimeParserBucket22.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(10L, chronology9, locale26, (java.lang.Integer) (-1), (int) (byte) 10);
        int int30 = dateTimeParserBucket29.getOffset();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) 'a');
        java.util.Locale locale7 = dateTimeParserBucket3.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState8 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState9 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale12);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket13.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        boolean boolean16 = savedState14.restoreState(dateTimeParserBucket15);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray17 = savedState14.iSavedFields;
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology20, locale21);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale26);
        java.util.Locale locale28 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology23, locale28, (java.lang.Integer) 10);
        long long32 = dateTimeParserBucket30.computeMillis(false);
        boolean boolean33 = savedState14.restoreState(dateTimeParserBucket30);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray34 = savedState14.iSavedFields;
        org.joda.time.DateTimeZone dateTimeZone35 = savedState14.iZone;
        dateTimeParserBucket3.setZone(dateTimeZone35);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(savedFieldArray17);
        org.junit.Assert.assertArrayEquals(savedFieldArray17, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(savedFieldArray34);
        org.junit.Assert.assertArrayEquals(savedFieldArray34, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        long long12 = dateTimeParserBucket11.computeMillis();
        dateTimeParserBucket11.setOffset((int) (short) 0);
        boolean boolean15 = savedState7.restoreState(dateTimeParserBucket11);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17);
        java.lang.Object obj19 = dateTimeParserBucket18.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199990L) + "'", long6 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket11.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray14 = savedState13.iSavedFields;
        boolean boolean15 = dateTimeParserBucket3.restoreState((java.lang.Object) savedState13);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj17 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray14);
        org.junit.Assert.assertArrayEquals(savedFieldArray14, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        long long14 = dateTimeParserBucket10.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        org.joda.time.Chronology chronology4 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale5 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        long long7 = dateTimeParserBucket3.computeMillis();
        long long10 = dateTimeParserBucket3.computeMillis(true, "hi!");
        dateTimeParserBucket3.setOffset((int) '#');
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, 35);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199965L) + "'", long10 == (-25199965L));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        boolean boolean6 = savedState4.restoreState(dateTimeParserBucket5);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState4.iSavedFields;
        int int8 = savedState4.iSavedFieldsCount;
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket12.saveField(dateTimeField13, (int) 'a');
        java.util.Locale locale16 = dateTimeParserBucket12.getLocale();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState17 = dateTimeParserBucket12.new SavedState();
        java.util.Locale locale18 = dateTimeParserBucket12.getLocale();
        boolean boolean19 = savedState4.restoreState(dateTimeParserBucket12);
        org.joda.time.DateTimeZone dateTimeZone20 = savedState4.iZone;
        org.joda.time.DateTimeZone dateTimeZone21 = savedState4.iZone;
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray22 = savedState4.iSavedFields;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(savedFieldArray22);
        org.junit.Assert.assertArrayEquals(savedFieldArray22, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket11.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray14 = savedState13.iSavedFields;
        boolean boolean15 = dateTimeParserBucket3.restoreState((java.lang.Object) savedState13);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState16 = dateTimeParserBucket3.new SavedState();
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset(10);
        int int20 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray14);
        org.junit.Assert.assertArrayEquals(savedFieldArray14, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology8, locale9);
        long long11 = dateTimeParserBucket10.computeMillis();
        dateTimeParserBucket10.setOffset((int) (short) 0);
        boolean boolean14 = savedState6.restoreState(dateTimeParserBucket10);
        java.util.Locale locale15 = dateTimeParserBucket10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket10.getZone();
        long long19 = dateTimeParserBucket10.computeMillis(true, "");
        dateTimeParserBucket10.setPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket10.saveField(dateTimeField22, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199990L) + "'", long5 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-25199965L) + "'", long11 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-25199965L) + "'", long10 == (-25199965L));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        int int5 = dateTimeParserBucket3.getOffset();
        long long7 = dateTimeParserBucket3.computeMillis(false);
        long long9 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        long long15 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199990L) + "'", long7 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-25199990L) + "'", long9 == (-25199990L));
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199990L) + "'", long12 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199990L) + "'", long15 == (-25199990L));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 0, 10);
        java.lang.Object obj22 = dateTimeParserBucket21.saveState();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket21.getZone();
        long long25 = dateTimeParserBucket21.computeMillis(false);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket21.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology30, locale31);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology35, locale36);
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology33, locale38, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology43, locale44);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology48, locale49);
        java.util.Locale locale51 = dateTimeParserBucket50.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology46, locale51, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology33, locale51, (java.lang.Integer) 1);
        java.util.Locale locale57 = dateTimeParserBucket56.getLocale();
        java.util.Locale locale58 = dateTimeParserBucket56.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((-25199965L), chronology26, locale58, (java.lang.Integer) 1, (int) (byte) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(97L, chronology6, locale58, (java.lang.Integer) (-1));
        int int64 = dateTimeParserBucket63.getOffset();
        long long66 = dateTimeParserBucket63.computeMillis(false);
        java.lang.Integer int67 = dateTimeParserBucket63.getPivotYear();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 97L + "'", long66 == 97L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState7 = dateTimeParserBucket4.new SavedState();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        long long12 = dateTimeParserBucket11.computeMillis();
        dateTimeParserBucket11.setOffset((int) (short) 0);
        boolean boolean15 = savedState7.restoreState(dateTimeParserBucket11);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology16, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket18.getZone();
        java.lang.Object obj20 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setOffset(2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199990L) + "'", long6 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale2);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState4 = dateTimeParserBucket3.new SavedState();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale7);
        int int9 = dateTimeParserBucket8.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState10 = dateTimeParserBucket8.new SavedState();
        long long12 = dateTimeParserBucket8.computeMillis(true);
        java.lang.Object obj13 = dateTimeParserBucket8.saveState();
        long long14 = dateTimeParserBucket8.computeMillis();
        boolean boolean15 = savedState4.restoreState(dateTimeParserBucket8);
        boolean boolean17 = dateTimeParserBucket8.restoreState((java.lang.Object) (-1.0d));
        java.util.Locale locale18 = dateTimeParserBucket8.getLocale();
        dateTimeParserBucket8.setOffset((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-25199965L) + "'", long12 == (-25199965L));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-25199965L) + "'", long14 == (-25199965L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        org.joda.time.Chronology chronology5 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology7, locale8);
        java.util.Locale locale10 = dateTimeParserBucket9.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology5, locale10, (java.lang.Integer) 10, (int) (byte) 0);
        long long14 = dateTimeParserBucket13.computeMillis();
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket13.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset(52);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale11);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale16);
        java.util.Locale locale18 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology13, locale18, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket20.computeMillis(false);
        java.util.Locale locale23 = dateTimeParserBucket20.getLocale();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale26);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState28 = dateTimeParserBucket27.new SavedState();
        java.lang.Class<?> wildcardClass29 = dateTimeParserBucket27.getClass();
        boolean boolean30 = dateTimeParserBucket20.restoreState((java.lang.Object) wildcardClass29);
        dateTimeParserBucket20.setOffset((int) (short) 10);
        boolean boolean33 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket20);
        java.util.Locale locale34 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket3.getZone();
        java.lang.Integer int36 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int37 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(int37);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket3.saveField(dateTimeField9, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-25199965L) + "'", long5 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology8, locale9);
        java.util.Locale locale11 = dateTimeParserBucket10.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology6, locale11, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale24, (java.lang.Integer) 1);
        java.util.Locale locale30 = dateTimeParserBucket29.getLocale();
        java.util.Locale locale31 = dateTimeParserBucket29.getLocale();
        dateTimeParserBucket29.setOffset((int) 'a');
        long long36 = dateTimeParserBucket29.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket29.getZone();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-98L) + "'", long36 == (-98L));
        org.junit.Assert.assertNull(dateTimeZone37);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) (short) 0);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset(100);
        long long10 = dateTimeParserBucket3.computeMillis();
        int int11 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket3.new SavedState();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-25199965L) + "'", long4 == (-25199965L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology6, locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology6, locale9);
        long long12 = dateTimeParserBucket10.computeMillis(true);
        java.lang.Object obj13 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket10.getZone();
        long long15 = dateTimeParserBucket10.computeMillis();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        org.joda.time.Chronology chronology4 = dateTimeParserBucket3.getChronology();
        int int5 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket3.saveField(dateTimeField7, (int) (short) 0);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology2, locale3);
        java.lang.Integer int5 = dateTimeParserBucket4.getPivotYear();
        long long6 = dateTimeParserBucket4.computeMillis();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale12);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology16, locale17);
        java.util.Locale locale19 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology14, locale19, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology8, locale19, (java.lang.Integer) 1);
        java.lang.Object obj25 = dateTimeParserBucket24.saveState();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology27, locale28);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState30 = dateTimeParserBucket29.new SavedState();
        int int31 = dateTimeParserBucket29.getOffset();
        long long33 = dateTimeParserBucket29.computeMillis(false);
        long long35 = dateTimeParserBucket29.computeMillis(true);
        java.lang.Integer int36 = dateTimeParserBucket29.getPivotYear();
        long long38 = dateTimeParserBucket29.computeMillis(false);
        long long41 = dateTimeParserBucket29.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket29.getZone();
        dateTimeParserBucket24.setZone(dateTimeZone42);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-25199990L) + "'", long33 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-25199990L) + "'", long35 == (-25199990L));
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-25199990L) + "'", long38 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-25199990L) + "'", long41 == (-25199990L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        long long6 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState13 = dateTimeParserBucket11.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray14 = savedState13.iSavedFields;
        boolean boolean15 = dateTimeParserBucket3.restoreState((java.lang.Object) savedState13);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState17 = dateTimeParserBucket3.new SavedState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-25199965L) + "'", long6 == (-25199965L));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray14);
        org.junit.Assert.assertArrayEquals(savedFieldArray14, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale5);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket11.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology13, locale24, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology33, locale34);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology45, locale46);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 0, 10);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket52.getChronology();
        org.joda.time.Chronology chronology54 = dateTimeParserBucket52.getChronology();
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology57, locale58);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology62, locale63);
        java.util.Locale locale65 = dateTimeParserBucket64.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology60, locale65, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology54, locale65, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(32L, chronology41, locale65, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((-25200001L), chronology13, locale65);
        dateTimeParserBucket74.setOffset(52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "th_TH");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology8, locale9);
        java.util.Locale locale11 = dateTimeParserBucket10.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology6, locale11, (java.lang.Integer) 10);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale17);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology19, locale24, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale24, (java.lang.Integer) 1);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState30 = dateTimeParserBucket29.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone31 = savedState30.iZone;
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNull(dateTimeZone31);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        long long7 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology12, locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology17, locale18);
        java.util.Locale locale20 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology15, locale20, (java.lang.Integer) 10, (int) (byte) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology9, locale20, (java.lang.Integer) 1);
        java.lang.Object obj26 = dateTimeParserBucket25.saveState();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket25.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology30, locale31);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 10);
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((-50400001L), chronology27, locale38, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-25199965L) + "'", long7 == (-25199965L));
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "th_TH");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket3.saveField(dateTimeField6, 52);
        dateTimeParserBucket3.setOffset((int) (short) 100);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (-1));
        dateTimeParserBucket3.setOffset(1);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale12);
        long long15 = dateTimeParserBucket13.computeMillis(true);
        long long17 = dateTimeParserBucket13.computeMillis(false);
        long long18 = dateTimeParserBucket13.computeMillis();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState19 = dateTimeParserBucket13.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone20 = savedState19.iZone;
        dateTimeParserBucket3.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25199990L) + "'", long15 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-25199990L) + "'", long17 == (-25199990L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199990L) + "'", long18 == (-25199990L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology3, locale4);
        int int6 = dateTimeParserBucket5.getOffset();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale12);
        int int14 = dateTimeParserBucket13.getOffset();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState15 = dateTimeParserBucket13.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray16 = savedState15.iSavedFields;
        boolean boolean17 = dateTimeParserBucket5.restoreState((java.lang.Object) savedState15);
        long long18 = dateTimeParserBucket5.computeMillis();
        java.lang.Integer int19 = dateTimeParserBucket5.getPivotYear();
        java.util.Locale locale20 = dateTimeParserBucket5.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((-17L), chronology1, locale20);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState22 = dateTimeParserBucket21.new SavedState();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-25199965L) + "'", long8 == (-25199965L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(savedFieldArray16);
        org.junit.Assert.assertArrayEquals(savedFieldArray16, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-25199965L) + "'", long18 == (-25199965L));
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }
}

