package org.apache.commons.math.stat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct('4');
        java.lang.String str7 = frequency1.toString();
        double double9 = frequency1.getPct('4');
        long long11 = frequency1.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        frequency1.addValue(0);
        frequency1.clear();
        java.lang.String str25 = frequency1.toString();
        long long27 = frequency1.getCumFreq((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct((int) (short) 1);
        double double35 = frequency31.getPct((long) (byte) 100);
        frequency31.addValue((java.lang.Integer) 0);
        double double38 = frequency1.getCumPct((java.lang.Object) frequency31);
        double double40 = frequency1.getPct((long) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue(10);
        java.util.Iterator iterator7 = frequency1.valuesIterator();
        long long9 = frequency1.getCumFreq('a');
        frequency1.clear();
        double double12 = frequency1.getCumPct('a');
        long long13 = frequency1.getSumFreq();
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Object) ' ');
        double double23 = frequency15.getCumPct((long) (short) 1);
        long long25 = frequency15.getCount('a');
        double double26 = frequency1.getCumPct((java.lang.Object) frequency15);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getPct((int) (short) 1);
        frequency28.addValue((int) '#');
        double double34 = frequency28.getCumPct((int) (byte) 1);
        frequency28.addValue((java.lang.Integer) 100);
        double double38 = frequency28.getPct((long) (short) 100);
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount(' ');
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        long long51 = frequency44.getCount((java.lang.Object) ' ');
        frequency44.clear();
        long long53 = frequency40.getCumFreq((java.lang.Object) frequency44);
        long long55 = frequency44.getCumFreq('4');
        long long57 = frequency44.getCount((int) (short) 1);
        java.util.Comparator comparator58 = null;
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency(comparator58);
        double double61 = frequency59.getPct((int) (short) 1);
        double double63 = frequency59.getPct((long) (byte) 100);
        double double65 = frequency59.getCumPct('a');
        long long66 = frequency59.getSumFreq();
        long long68 = frequency59.getCount((java.lang.Object) '4');
        double double70 = frequency59.getPct(' ');
        double double71 = frequency44.getPct((java.lang.Object) frequency59);
        long long72 = frequency28.getCumFreq((java.lang.Object) frequency44);
        frequency44.clear();
        // The following exception was thrown during execution in test generation
        try {
            frequency15.addValue((java.lang.Object) frequency44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.5d + "'", double38 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue(10);
        java.util.Iterator iterator7 = frequency1.valuesIterator();
        long long9 = frequency1.getCumFreq('a');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        frequency11.addValue((java.lang.Object) (-1L));
        double double15 = frequency11.getPct(' ');
        long long17 = frequency11.getCumFreq(' ');
        long long19 = frequency11.getCumFreq((long) '#');
        frequency11.addValue((java.lang.Integer) 0);
        long long22 = frequency1.getCumFreq((java.lang.Object) 0);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        java.util.Iterator iterator27 = frequency24.valuesIterator();
        long long29 = frequency24.getCumFreq(100);
        long long30 = frequency1.getCount((java.lang.Object) frequency24);
        frequency24.addValue((int) (byte) 0);
        java.util.Iterator iterator33 = frequency24.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long16 = frequency12.getCumFreq((int) '4');
        frequency12.addValue((java.lang.Integer) (-1));
        long long19 = frequency1.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        long long28 = frequency21.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct(1);
        frequency30.addValue((int) '#');
        double double35 = frequency21.getPct((java.lang.Object) frequency30);
        double double37 = frequency21.getPct((int) (short) -1);
        double double39 = frequency21.getPct(100L);
        frequency21.addValue(' ');
        double double42 = frequency1.getCumPct((java.lang.Object) frequency21);
        double double44 = frequency1.getPct(1);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        long long56 = frequency54.getCount(' ');
        long long57 = frequency50.getCount((java.lang.Object) ' ');
        frequency50.clear();
        long long59 = frequency46.getCumFreq((java.lang.Object) frequency50);
        long long61 = frequency50.getCumFreq('4');
        long long63 = frequency50.getCount((int) (short) 1);
        java.util.Comparator comparator64 = null;
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency(comparator64);
        double double67 = frequency65.getPct((int) (short) 1);
        double double69 = frequency65.getPct((long) (byte) 100);
        double double71 = frequency65.getCumPct('a');
        long long72 = frequency65.getSumFreq();
        long long74 = frequency65.getCount((java.lang.Object) '4');
        double double76 = frequency65.getPct(' ');
        double double77 = frequency50.getPct((java.lang.Object) frequency65);
        java.util.Comparator comparator78 = null;
        org.apache.commons.math.stat.Frequency frequency79 = new org.apache.commons.math.stat.Frequency(comparator78);
        long long81 = frequency79.getCount(' ');
        java.util.Comparator comparator82 = null;
        org.apache.commons.math.stat.Frequency frequency83 = new org.apache.commons.math.stat.Frequency(comparator82);
        long long85 = frequency83.getCount(' ');
        long long86 = frequency79.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator87 = null;
        org.apache.commons.math.stat.Frequency frequency88 = new org.apache.commons.math.stat.Frequency(comparator87);
        double double90 = frequency88.getPct(1);
        frequency88.addValue((int) '#');
        double double93 = frequency79.getPct((java.lang.Object) frequency88);
        frequency65.addValue((java.lang.Object) double93);
        java.util.Iterator iterator95 = frequency65.valuesIterator();
        java.lang.Class<?> wildcardClass96 = frequency65.getClass();
        long long97 = frequency1.getCount((java.lang.Object) frequency65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency1.getPct((int) (short) -1);
        double double19 = frequency1.getCumPct((int) ' ');
        long long21 = frequency1.getCount((-1L));
        long long23 = frequency1.getCount((int) (byte) -1);
        long long25 = frequency1.getCount(3L);
        frequency1.addValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue((java.lang.Object) (-1L));
        double double17 = frequency13.getPct(' ');
        java.lang.Class<?> wildcardClass18 = frequency13.getClass();
        double double19 = frequency1.getCumPct((java.lang.Object) wildcardClass18);
        frequency1.addValue('a');
        frequency1.clear();
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        java.util.Iterator iterator27 = frequency24.valuesIterator();
        long long29 = frequency24.getCount('a');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        double double35 = frequency31.getPct('4');
        long long36 = frequency24.getCount((java.lang.Object) '4');
        long long37 = frequency1.getCount((java.lang.Object) '4');
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Iterator iterator40 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        java.util.Iterator iterator14 = frequency11.valuesIterator();
        long long16 = frequency11.getCumFreq(100);
        double double18 = frequency11.getPct((-1L));
        long long20 = frequency11.getCumFreq((int) (short) 10);
        double double21 = frequency1.getCumPct((java.lang.Object) (short) 10);
        double double23 = frequency1.getCumPct(' ');
        long long25 = frequency1.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        frequency1.addValue((int) (byte) 10);
        double double14 = frequency1.getPct((int) (byte) 0);
        frequency1.clear();
        long long16 = frequency1.getSumFreq();
        double double18 = frequency1.getPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        long long18 = frequency10.getSumFreq();
        frequency10.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getPct((int) (short) 1);
        double double26 = frequency22.getPct((long) (byte) 100);
        frequency22.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount(' ');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount(' ');
        long long37 = frequency30.getCount((java.lang.Object) ' ');
        double double39 = frequency30.getCumPct('a');
        long long40 = frequency22.getCount((java.lang.Object) double39);
        double double42 = frequency22.getCumPct('#');
        long long44 = frequency22.getCumFreq((long) (short) 0);
        double double46 = frequency22.getCumPct((long) (byte) 1);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        frequency48.addValue('#');
        long long52 = frequency48.getCumFreq((java.lang.Object) 1.0f);
        long long54 = frequency48.getCumFreq('a');
        long long55 = frequency48.getSumFreq();
        java.util.Iterator iterator56 = frequency48.valuesIterator();
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        double double60 = frequency58.getPct(1);
        frequency58.addValue((int) '#');
        java.lang.String str63 = frequency58.toString();
        long long64 = frequency48.getCumFreq((java.lang.Object) frequency58);
        double double65 = frequency22.getPct((java.lang.Object) frequency58);
        long long66 = frequency10.getCumFreq((java.lang.Object) frequency58);
        long long68 = frequency58.getCumFreq((int) ' ');
        java.util.Comparator comparator69 = null;
        org.apache.commons.math.stat.Frequency frequency70 = new org.apache.commons.math.stat.Frequency(comparator69);
        double double72 = frequency70.getPct((int) (short) 1);
        frequency70.addValue((int) '#');
        double double76 = frequency70.getPct(' ');
        double double78 = frequency70.getPct(1);
        double double80 = frequency70.getPct(10L);
        double double82 = frequency70.getCumPct(1L);
        long long84 = frequency70.getCumFreq((long) 100);
        long long85 = frequency58.getCount((java.lang.Object) frequency70);
        java.util.Comparator comparator86 = null;
        org.apache.commons.math.stat.Frequency frequency87 = new org.apache.commons.math.stat.Frequency(comparator86);
        double double89 = frequency87.getPct((long) (-1));
        double double90 = frequency58.getCumPct((java.lang.Object) frequency87);
        long long92 = frequency87.getCumFreq((long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str63, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        double double15 = frequency1.getCumPct('4');
        frequency1.clear();
        double double18 = frequency1.getCumPct('#');
        double double20 = frequency1.getPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency1.getCount((long) (short) 100);
        java.lang.String str39 = frequency1.toString();
        long long41 = frequency1.getCount('4');
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        frequency43.addValue((java.lang.Object) (-1L));
        double double47 = frequency43.getPct(' ');
        long long49 = frequency43.getCumFreq(' ');
        java.util.Iterator iterator50 = frequency43.valuesIterator();
        frequency43.clear();
        long long53 = frequency43.getCumFreq((long) (byte) 0);
        double double54 = frequency1.getPct((java.lang.Object) long53);
        long long56 = frequency1.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.5d + "'", double54 == 0.5d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        long long16 = frequency5.getCumFreq((long) (short) -1);
        long long18 = frequency5.getCount((int) (short) -1);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        long long22 = frequency20.getCount(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount(' ');
        long long27 = frequency20.getCount((java.lang.Object) ' ');
        frequency20.addValue((long) 0);
        frequency20.addValue((int) (byte) 10);
        double double33 = frequency20.getPct((int) (byte) 0);
        double double35 = frequency20.getPct((int) (short) -1);
        frequency5.addValue((java.lang.Object) (short) -1);
        double double38 = frequency5.getCumPct((int) '4');
        long long40 = frequency5.getCount((int) ' ');
        long long42 = frequency5.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getPct((int) (short) 1);
        double double48 = frequency44.getPct((long) (byte) 100);
        java.util.Iterator iterator49 = frequency44.valuesIterator();
        frequency44.clear();
        frequency44.addValue((long) 'a');
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        long long56 = frequency54.getCount(' ');
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        long long60 = frequency58.getCount(' ');
        long long61 = frequency54.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        double double65 = frequency63.getPct(1);
        frequency63.addValue((int) '#');
        double double68 = frequency54.getPct((java.lang.Object) frequency63);
        java.util.Comparator comparator69 = null;
        org.apache.commons.math.stat.Frequency frequency70 = new org.apache.commons.math.stat.Frequency(comparator69);
        long long72 = frequency70.getCount(' ');
        java.util.Comparator comparator73 = null;
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency(comparator73);
        long long76 = frequency74.getCount(' ');
        long long77 = frequency70.getCount((java.lang.Object) ' ');
        long long79 = frequency70.getCumFreq('#');
        long long81 = frequency70.getCumFreq((java.lang.Object) (-1));
        long long82 = frequency63.getCumFreq((java.lang.Object) (-1));
        frequency63.addValue((java.lang.Integer) (-1));
        long long85 = frequency44.getCount((java.lang.Object) frequency63);
        long long87 = frequency63.getCumFreq('a');
        frequency63.addValue((int) 'a');
        frequency63.addValue(0L);
        double double92 = frequency5.getPct((java.lang.Object) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        long long16 = frequency5.getCumFreq('4');
        long long18 = frequency5.getCount((int) (short) 1);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        double double26 = frequency20.getCumPct('a');
        long long27 = frequency20.getSumFreq();
        long long29 = frequency20.getCount((java.lang.Object) '4');
        double double31 = frequency20.getPct(' ');
        double double32 = frequency5.getPct((java.lang.Object) frequency20);
        double double34 = frequency20.getCumPct((int) (byte) -1);
        double double36 = frequency20.getPct((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCount('a');
        java.lang.String str7 = frequency1.toString();
        java.lang.String str8 = frequency1.toString();
        double double10 = frequency1.getCumPct((int) (short) 100);
        long long12 = frequency1.getCount(1);
        long long14 = frequency1.getCumFreq('4');
        double double16 = frequency1.getCumPct('4');
        frequency1.addValue('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        frequency1.clear();
        long long12 = frequency1.getCount((long) (short) 10);
        double double14 = frequency1.getCumPct('a');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        double double20 = frequency16.getPct((long) (byte) 100);
        double double22 = frequency16.getCumPct('a');
        long long23 = frequency16.getSumFreq();
        long long25 = frequency16.getCount(100);
        long long26 = frequency1.getCumFreq((java.lang.Object) frequency16);
        java.util.Iterator iterator27 = frequency16.valuesIterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        frequency1.addValue((long) (short) 1);
        double double28 = frequency1.getCumPct((int) (short) 1);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount(' ');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount(' ');
        long long37 = frequency30.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        double double41 = frequency39.getPct(1);
        frequency39.addValue((int) '#');
        double double44 = frequency30.getPct((java.lang.Object) frequency39);
        double double46 = frequency30.getPct((int) (short) -1);
        double double48 = frequency30.getCumPct((int) ' ');
        long long50 = frequency30.getCount((-1L));
        long long52 = frequency30.getCount((int) (byte) -1);
        frequency30.addValue((int) (byte) 100);
        double double55 = frequency1.getPct((java.lang.Object) (byte) 100);
        java.util.Iterator iterator56 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(iterator56);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCount('a');
        long long7 = frequency1.getSumFreq();
        frequency1.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct(1);
        frequency9.addValue((int) '#');
        long long14 = frequency1.getCount((java.lang.Object) frequency9);
        java.util.Iterator iterator15 = frequency9.valuesIterator();
        double double17 = frequency9.getPct(1);
        long long19 = frequency9.getCount('4');
        long long21 = frequency9.getCumFreq((int) 'a');
        long long23 = frequency9.getCumFreq((int) (short) -1);
        double double25 = frequency9.getCumPct(10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        double double23 = frequency1.getCumPct((int) (byte) 0);
        long long25 = frequency1.getCumFreq((long) 10);
        long long26 = frequency1.getSumFreq();
        frequency1.clear();
        long long29 = frequency1.getCount((int) '#');
        long long30 = frequency1.getSumFreq();
        long long32 = frequency1.getCount((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount((long) (byte) 1);
        long long12 = frequency1.getCumFreq((-1L));
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        double double18 = frequency14.getPct((long) (byte) 100);
        long long20 = frequency14.getCount(100);
        double double22 = frequency14.getCumPct((int) (short) 100);
        double double24 = frequency14.getCumPct((int) (byte) 100);
        frequency14.clear();
        double double26 = frequency1.getPct((java.lang.Object) frequency14);
        long long28 = frequency1.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        long long4 = frequency0.getCumFreq('a');
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct(0L);
        double double10 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        java.util.Iterator iterator17 = frequency14.valuesIterator();
        long long19 = frequency14.getCumFreq(100);
        long long20 = frequency1.getCumFreq((java.lang.Object) 100);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        frequency22.addValue((java.lang.Object) (-1L));
        double double26 = frequency22.getPct(' ');
        long long28 = frequency22.getCumFreq(' ');
        double double30 = frequency22.getPct(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        frequency32.addValue('#');
        long long36 = frequency32.getCount(' ');
        long long38 = frequency32.getCumFreq((int) '4');
        double double39 = frequency22.getCumPct((java.lang.Object) long38);
        frequency22.addValue((int) (byte) 100);
        double double42 = frequency1.getCumPct((java.lang.Object) frequency22);
        double double44 = frequency22.getPct((-1));
        double double46 = frequency22.getCumPct((long) 'a');
        frequency22.addValue((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.5d + "'", double44 == 0.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct('4');
        frequency1.addValue(1);
        frequency1.addValue((int) (byte) 0);
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getPct((int) (short) 1);
        double double16 = frequency12.getPct((long) (byte) 100);
        java.util.Iterator iterator17 = frequency12.valuesIterator();
        long long19 = frequency12.getCumFreq(1L);
        long long20 = frequency1.getCount((java.lang.Object) 1L);
        frequency1.clear();
        long long23 = frequency1.getCount('#');
        java.lang.String str24 = frequency1.toString();
        java.lang.Class<?> wildcardClass25 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('a');
        long long10 = frequency1.getCumFreq(' ');
        long long12 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        long long5 = frequency1.getCumFreq((int) '4');
        double double7 = frequency1.getCumPct((int) (short) -1);
        double double9 = frequency1.getCumPct((int) ' ');
        long long11 = frequency1.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCount(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        java.util.Iterator iterator37 = frequency32.valuesIterator();
        frequency32.clear();
        frequency32.addValue((long) 'a');
        long long41 = frequency1.getCumFreq((java.lang.Object) frequency32);
        frequency1.clear();
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getPct((int) (short) 1);
        double double48 = frequency44.getPct((long) (byte) 100);
        java.util.Iterator iterator49 = frequency44.valuesIterator();
        long long51 = frequency44.getCount((-1));
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        frequency53.addValue((java.lang.Object) (-1L));
        long long57 = frequency53.getCumFreq((-1));
        long long59 = frequency53.getCumFreq('a');
        double double61 = frequency53.getPct('a');
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        double double65 = frequency63.getPct((int) (short) 1);
        double double67 = frequency63.getPct((long) (byte) 100);
        long long69 = frequency63.getCount((int) (short) 1);
        long long71 = frequency63.getCumFreq((long) ' ');
        double double72 = frequency53.getCumPct((java.lang.Object) long71);
        double double73 = frequency44.getCumPct((java.lang.Object) frequency53);
        double double74 = frequency1.getCumPct((java.lang.Object) double73);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        frequency1.addValue((java.lang.Integer) 100);
        long long11 = frequency1.getCumFreq((long) (byte) 1);
        frequency1.addValue((long) '#');
        frequency1.addValue(10L);
        long long17 = frequency1.getCumFreq((long) 1);
        java.lang.Class<?> wildcardClass18 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((long) '4');
        long long14 = frequency1.getCumFreq('4');
        double double16 = frequency1.getPct((long) 0);
        long long18 = frequency1.getCumFreq(' ');
        frequency1.addValue('#');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getPct((int) (short) 1);
        frequency22.addValue((int) '#');
        double double28 = frequency22.getPct(' ');
        double double30 = frequency22.getPct(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        java.util.Iterator iterator35 = frequency32.valuesIterator();
        long long37 = frequency32.getCumFreq(100);
        double double39 = frequency32.getPct((-1L));
        long long41 = frequency32.getCumFreq((int) (short) 10);
        double double42 = frequency22.getCumPct((java.lang.Object) (short) 10);
        double double44 = frequency22.getPct(' ');
        java.lang.String str45 = frequency22.toString();
        long long46 = frequency22.getSumFreq();
        long long47 = frequency1.getCount((java.lang.Object) frequency22);
        double double49 = frequency1.getPct((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct(1);
        frequency9.addValue((int) '#');
        long long14 = frequency1.getCount((java.lang.Object) frequency9);
        double double16 = frequency9.getCumPct('4');
        long long18 = frequency9.getCount(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCount(' ');
        frequency1.addValue((java.lang.Integer) 1);
        double double34 = frequency1.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        long long17 = frequency10.getCumFreq((int) (byte) 100);
        double double19 = frequency10.getPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCount(' ');
        double double9 = frequency1.getPct('#');
        long long11 = frequency1.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getPct((long) 100);
        java.util.Iterator iterator57 = frequency1.valuesIterator();
        long long59 = frequency1.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount(100);
        double double9 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        long long17 = frequency11.getCount((int) (short) 1);
        frequency11.addValue((java.lang.Object) 1);
        double double21 = frequency11.getCumPct('4');
        long long23 = frequency11.getCumFreq((long) (short) 1);
        frequency1.addValue((java.lang.Object) long23);
        double double26 = frequency1.getPct((int) (short) 10);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getPct((int) (short) 1);
        double double32 = frequency28.getPct((long) (byte) 100);
        long long34 = frequency28.getCount((int) (short) 1);
        long long36 = frequency28.getCumFreq((long) ' ');
        long long38 = frequency28.getCumFreq(10);
        frequency28.addValue('4');
        double double42 = frequency28.getCumPct('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) double42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('a');
        long long10 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getPct((int) (short) 1);
        double double16 = frequency12.getPct((long) (byte) 100);
        double double18 = frequency12.getCumPct('a');
        long long19 = frequency12.getSumFreq();
        long long21 = frequency12.getCount((java.lang.Object) '4');
        double double23 = frequency12.getPct(' ');
        double double24 = frequency1.getPct((java.lang.Object) ' ');
        long long25 = frequency1.getSumFreq();
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        long long34 = frequency27.getCount((java.lang.Object) ' ');
        long long36 = frequency27.getCumFreq('#');
        long long38 = frequency27.getCumFreq((java.lang.Object) (-1));
        java.lang.String str39 = frequency27.toString();
        long long40 = frequency27.getSumFreq();
        long long42 = frequency27.getCount(100);
        double double44 = frequency27.getPct((int) (byte) -1);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCount(' ');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        long long53 = frequency46.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getPct(1);
        frequency55.addValue((int) '#');
        double double60 = frequency46.getPct((java.lang.Object) frequency55);
        double double62 = frequency55.getCumPct(10);
        java.util.Comparator comparator63 = null;
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency(comparator63);
        double double66 = frequency64.getPct((int) (short) 1);
        double double68 = frequency64.getPct((long) (byte) 100);
        frequency64.addValue((java.lang.Integer) 0);
        long long72 = frequency64.getCount('a');
        long long73 = frequency55.getCount((java.lang.Object) long72);
        java.util.Comparator comparator74 = null;
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency(comparator74);
        frequency75.addValue((java.lang.Object) (-1L));
        long long79 = frequency75.getCumFreq((-1));
        long long81 = frequency75.getCumFreq('a');
        double double83 = frequency75.getPct('a');
        double double85 = frequency75.getCumPct(2L);
        double double86 = frequency55.getPct((java.lang.Object) frequency75);
        java.lang.Class<?> wildcardClass87 = frequency75.getClass();
        double double88 = frequency27.getPct((java.lang.Object) wildcardClass87);
        long long89 = frequency1.getCumFreq((java.lang.Object) frequency27);
        frequency1.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long4 = frequency0.getCumFreq(10L);
        long long6 = frequency0.getCount('a');
        double double8 = frequency0.getCumPct('#');
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        long long15 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) (-1));
        java.lang.String str20 = frequency1.toString();
        frequency1.addValue((long) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t50%\t50%\n0\t1\t25%\t75%\n1\t1\t25%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t50%\t50%\n0\t1\t25%\t75%\n1\t1\t25%\t100%\n");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        frequency10.addValue(' ');
        java.util.Iterator iterator27 = frequency10.valuesIterator();
        long long29 = frequency10.getCount(1L);
        // The following exception was thrown during execution in test generation
        try {
            frequency10.addValue((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount(' ');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount(' ');
        long long14 = frequency7.getCount((java.lang.Object) ' ');
        long long16 = frequency7.getCount((int) '4');
        long long18 = frequency7.getCumFreq((long) (byte) -1);
        java.util.Iterator iterator19 = frequency7.valuesIterator();
        double double21 = frequency7.getCumPct(' ');
        double double22 = frequency1.getCumPct((java.lang.Object) double21);
        java.lang.String str23 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        double double10 = frequency1.getCumPct('a');
        frequency1.addValue((int) ' ');
        java.util.Iterator iterator13 = frequency1.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq((-1L));
        frequency14.addValue(100L);
        java.util.Iterator iterator19 = frequency14.valuesIterator();
        long long21 = frequency14.getCount((long) (short) 100);
        long long23 = frequency14.getCount('a');
        double double24 = frequency1.getPct((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        long long7 = frequency1.getCumFreq('a');
        long long8 = frequency1.getSumFreq();
        java.util.Iterator iterator9 = frequency1.valuesIterator();
        double double11 = frequency1.getCumPct(10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency1.getCount((long) (short) 100);
        double double40 = frequency1.getPct((int) (byte) 100);
        frequency1.addValue((long) ' ');
        double double44 = frequency1.getCumPct(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.6666666666666666d + "'", double44 == 0.6666666666666666d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount((java.lang.Object) (byte) 100);
        long long15 = frequency11.getCumFreq('a');
        double double16 = frequency1.getCumPct((java.lang.Object) frequency11);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        long long22 = frequency18.getCumFreq((int) '4');
        long long23 = frequency1.getCumFreq((java.lang.Object) long22);
        frequency1.addValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('4');
        long long12 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        frequency14.addValue((java.lang.Object) (-1L));
        double double18 = frequency14.getPct(' ');
        long long20 = frequency14.getCumFreq(' ');
        double double22 = frequency14.getPct(1);
        frequency14.addValue((long) (byte) -1);
        long long26 = frequency14.getCumFreq(' ');
        java.lang.String str27 = frequency14.toString();
        long long29 = frequency14.getCount(' ');
        long long30 = frequency1.getCount((java.lang.Object) long29);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        frequency1.addValue((int) (short) 1);
        java.lang.String str16 = frequency1.toString();
        double double18 = frequency1.getCumPct(0L);
        long long19 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n1\t2\t67%\t100%\n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n1\t2\t67%\t100%\n");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3333333333333333d + "'", double18 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        long long25 = frequency1.getSumFreq();
        long long27 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        long long12 = frequency1.getCumFreq((long) (byte) -1);
        frequency1.addValue((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass15 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct((int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getPct((int) (short) 1);
        double double11 = frequency7.getPct((long) (byte) 100);
        java.util.Iterator iterator12 = frequency7.valuesIterator();
        frequency7.clear();
        frequency7.addValue((long) 'a');
        long long16 = frequency1.getCount((java.lang.Object) frequency7);
        double double18 = frequency7.getPct(10L);
        double double20 = frequency7.getCumPct((long) 'a');
        frequency7.addValue((java.lang.Integer) (-1));
        java.util.Iterator iterator23 = frequency7.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        double double23 = frequency1.getCumPct((int) (byte) 0);
        long long25 = frequency1.getCumFreq((long) 10);
        long long26 = frequency1.getSumFreq();
        frequency1.clear();
        frequency1.addValue((long) (short) 10);
        long long31 = frequency1.getCount((long) '#');
        double double33 = frequency1.getCumPct(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getPct((int) (short) 1);
        java.util.Iterator iterator20 = frequency17.valuesIterator();
        frequency17.addValue(10);
        double double24 = frequency17.getPct('a');
        frequency17.addValue(1);
        long long27 = frequency10.getCount((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency10.addValue('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long16 = frequency12.getCumFreq((int) '4');
        frequency12.addValue((java.lang.Integer) (-1));
        long long19 = frequency1.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        long long28 = frequency21.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct(1);
        frequency30.addValue((int) '#');
        double double35 = frequency21.getPct((java.lang.Object) frequency30);
        double double37 = frequency21.getPct((int) (short) -1);
        double double39 = frequency21.getPct(100L);
        frequency21.addValue(' ');
        double double42 = frequency1.getCumPct((java.lang.Object) frequency21);
        double double44 = frequency1.getPct(1);
        long long46 = frequency1.getCount(1);
        long long48 = frequency1.getCount((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue('#');
        double double17 = frequency13.getPct((java.lang.Object) 1);
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        frequency20.addValue((java.lang.Object) ' ');
        double double28 = frequency20.getCumPct((long) ' ');
        long long30 = frequency20.getCount(0L);
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        double double32 = frequency1.getPct((java.lang.Object) frequency20);
        double double34 = frequency1.getCumPct(100);
        double double36 = frequency1.getPct((long) '#');
        java.lang.String str37 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        double double23 = frequency1.getCumPct((int) (byte) 100);
        double double25 = frequency1.getPct(' ');
        double double27 = frequency1.getCumPct(' ');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getPct((int) (short) 1);
        double double33 = frequency29.getPct((long) (byte) 100);
        java.util.Iterator iterator34 = frequency29.valuesIterator();
        long long36 = frequency29.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        long long39 = frequency37.getCumFreq((-1L));
        long long40 = frequency37.getSumFreq();
        double double42 = frequency37.getCumPct((int) (byte) 100);
        long long43 = frequency29.getCumFreq((java.lang.Object) double42);
        long long44 = frequency1.getCount((java.lang.Object) frequency29);
        double double46 = frequency29.getCumPct('4');
        long long48 = frequency29.getCumFreq((int) (short) 0);
        frequency29.addValue(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        long long8 = frequency1.getCumFreq(1L);
        long long10 = frequency1.getCumFreq((long) '4');
        double double12 = frequency1.getPct((int) (short) 1);
        long long14 = frequency1.getCount((long) (byte) -1);
        frequency1.addValue((int) (byte) -1);
        double double18 = frequency1.getPct(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCount(' ');
        long long9 = frequency1.getCount((long) 0);
        long long11 = frequency1.getCumFreq('4');
        java.lang.String str12 = frequency1.toString();
        long long14 = frequency1.getCumFreq((int) (byte) 10);
        frequency1.addValue((long) 10);
        frequency1.addValue((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCount(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        java.util.Iterator iterator37 = frequency32.valuesIterator();
        frequency32.clear();
        frequency32.addValue((long) 'a');
        long long41 = frequency1.getCumFreq((java.lang.Object) frequency32);
        long long43 = frequency32.getCumFreq((int) (byte) 1);
        long long45 = frequency32.getCumFreq((int) (short) 10);
        long long47 = frequency32.getCumFreq((int) (byte) 0);
        java.util.Iterator iterator48 = frequency32.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator48);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        frequency1.addValue((long) (short) 10);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount(' ');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount(' ');
        long long14 = frequency7.getCount((java.lang.Object) ' ');
        long long16 = frequency7.getCumFreq('#');
        long long18 = frequency7.getCumFreq((java.lang.Object) (-1));
        java.lang.String str19 = frequency7.toString();
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        frequency21.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator24 = frequency21.valuesIterator();
        double double25 = frequency7.getPct((java.lang.Object) frequency21);
        long long27 = frequency21.getCumFreq((int) (short) 0);
        long long29 = frequency21.getCumFreq(0);
        long long31 = frequency21.getCount((long) 0);
        double double33 = frequency21.getCumPct((long) (short) 0);
        double double35 = frequency21.getCumPct((long) (byte) -1);
        long long36 = frequency21.getSumFreq();
        double double38 = frequency21.getPct((-1));
        long long40 = frequency21.getCount((long) 0);
        frequency1.addValue((java.lang.Object) long40);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long16 = frequency12.getCumFreq((int) '4');
        frequency12.addValue((java.lang.Integer) (-1));
        long long19 = frequency1.getCumFreq((java.lang.Object) frequency12);
        long long21 = frequency1.getCumFreq((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getCumPct(10);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        frequency19.addValue((java.lang.Integer) 0);
        long long27 = frequency19.getCount('a');
        long long28 = frequency10.getCount((java.lang.Object) long27);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        frequency30.addValue((java.lang.Object) (-1L));
        long long34 = frequency30.getCumFreq((-1));
        long long36 = frequency30.getCumFreq('a');
        double double38 = frequency30.getPct('a');
        double double40 = frequency30.getCumPct(2L);
        double double41 = frequency10.getPct((java.lang.Object) frequency30);
        double double43 = frequency10.getPct((long) (byte) 1);
        java.lang.Class<?> wildcardClass44 = frequency10.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        long long11 = frequency1.getCumFreq((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getPct((int) (short) 1);
        double double32 = frequency28.getPct((long) (byte) 100);
        frequency28.addValue((java.lang.Integer) 0);
        double double35 = frequency1.getCumPct((java.lang.Object) frequency28);
        java.util.Iterator iterator36 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getPct((int) (short) 1);
        frequency40.addValue((int) '#');
        double double46 = frequency40.getCumPct((int) (byte) 1);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount(' ');
        long long55 = frequency48.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        double double59 = frequency57.getPct(1);
        frequency57.addValue((int) '#');
        double double62 = frequency48.getPct((java.lang.Object) frequency57);
        double double64 = frequency57.getCumPct(10);
        long long65 = frequency40.getCount((java.lang.Object) 10);
        double double66 = frequency1.getCumPct((java.lang.Object) long65);
        frequency1.addValue(4L);
        long long70 = frequency1.getCumFreq((int) (byte) 0);
        java.util.Comparator comparator71 = null;
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency(comparator71);
        double double74 = frequency72.getPct((int) (short) 1);
        java.util.Iterator iterator75 = frequency72.valuesIterator();
        long long77 = frequency72.getCount('a');
        long long78 = frequency72.getSumFreq();
        frequency72.addValue((java.lang.Integer) 10);
        double double81 = frequency1.getPct((java.lang.Object) frequency72);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.5d + "'", double66 == 0.5d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        frequency1.addValue(0);
        frequency1.addValue((int) '4');
        frequency1.addValue((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        double double60 = frequency1.getPct((long) 1);
        long long62 = frequency1.getCumFreq(' ');
        double double64 = frequency1.getCumPct((long) 100);
        frequency1.addValue((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        double double23 = frequency1.getCumPct((int) (byte) 100);
        double double25 = frequency1.getPct(' ');
        double double27 = frequency1.getCumPct((int) (short) 1);
        double double29 = frequency1.getPct(100);
        double double31 = frequency1.getPct((int) (short) -1);
        long long33 = frequency1.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long9 = frequency1.getCumFreq((long) (byte) 100);
        long long11 = frequency1.getCumFreq((long) (byte) 1);
        double double13 = frequency1.getCumPct((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct('4');
        frequency1.addValue(1);
        long long10 = frequency1.getCount((long) 'a');
        frequency1.addValue((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCumFreq(100);
        double double23 = frequency16.getPct((-1L));
        java.lang.Class<?> wildcardClass24 = frequency16.getClass();
        long long25 = frequency1.getCumFreq((java.lang.Object) wildcardClass24);
        double double27 = frequency1.getCumPct((int) (byte) 10);
        double double29 = frequency1.getPct('a');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        frequency31.addValue((java.lang.Object) (-1L));
        double double35 = frequency31.getPct(' ');
        long long37 = frequency31.getCumFreq(' ');
        long long39 = frequency31.getCumFreq((long) '#');
        frequency31.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getPct((int) (short) 1);
        java.util.Iterator iterator46 = frequency43.valuesIterator();
        long long48 = frequency43.getCumFreq(100);
        long long49 = frequency31.getCumFreq((java.lang.Object) frequency43);
        frequency43.addValue((java.lang.Integer) 1);
        double double52 = frequency1.getPct((java.lang.Object) 1);
        java.lang.String str53 = frequency1.toString();
        java.util.Iterator iterator54 = frequency1.valuesIterator();
        double double56 = frequency1.getCumPct((int) (byte) 0);
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        frequency1.addValue((long) 'a');
        long long11 = frequency1.getCumFreq(0);
        long long13 = frequency1.getCount((long) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        frequency1.addValue(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        frequency9.addValue('#');
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0f);
        long long15 = frequency9.getCumFreq('a');
        long long16 = frequency9.getSumFreq();
        java.util.Iterator iterator17 = frequency9.valuesIterator();
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct(1);
        frequency19.addValue((int) '#');
        java.lang.String str24 = frequency19.toString();
        long long25 = frequency9.getCumFreq((java.lang.Object) frequency19);
        long long27 = frequency19.getCount((long) ' ');
        long long28 = frequency1.getCount((java.lang.Object) ' ');
        long long30 = frequency1.getCount((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        long long26 = frequency17.getCumFreq('#');
        long long28 = frequency17.getCumFreq((java.lang.Object) (-1));
        long long29 = frequency10.getCumFreq((java.lang.Object) (-1));
        long long31 = frequency10.getCount(' ');
        double double33 = frequency10.getPct(100);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getPct(1);
        frequency44.addValue((int) '#');
        double double49 = frequency35.getPct((java.lang.Object) frequency44);
        double double51 = frequency44.getPct((long) (byte) 100);
        double double53 = frequency44.getPct('4');
        long long54 = frequency10.getCount((java.lang.Object) frequency44);
        frequency44.addValue((java.lang.Integer) (-1));
        frequency44.clear();
        frequency44.addValue((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((java.lang.Object) '4');
        double double12 = frequency1.getPct('#');
        double double14 = frequency1.getPct(100);
        long long16 = frequency1.getCumFreq(4L);
        frequency1.addValue((java.lang.Integer) 10);
        long long20 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCount((long) 0);
        long long11 = frequency1.getCumFreq('#');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue((java.lang.Object) (-1L));
        double double17 = frequency13.getPct(' ');
        long long19 = frequency13.getCumFreq(' ');
        long long21 = frequency13.getCumFreq((long) '#');
        frequency13.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getPct((int) (short) 1);
        java.util.Iterator iterator28 = frequency25.valuesIterator();
        long long30 = frequency25.getCumFreq(100);
        long long31 = frequency13.getCumFreq((java.lang.Object) frequency25);
        double double32 = frequency1.getPct((java.lang.Object) frequency13);
        frequency13.addValue((java.lang.Integer) 100);
        long long36 = frequency13.getCumFreq((long) (short) 100);
        long long38 = frequency13.getCount(10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3L + "'", long36 == 3L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        double double20 = frequency16.getPct('4');
        frequency16.clear();
        double double22 = frequency1.getCumPct((java.lang.Object) frequency16);
        long long24 = frequency16.getCumFreq('a');
        long long26 = frequency16.getCumFreq((int) (short) -1);
        long long27 = frequency16.getSumFreq();
        double double29 = frequency16.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct('4');
        frequency1.addValue((int) (byte) 10);
        double double15 = frequency1.getCumPct((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        long long20 = frequency8.getCount(100L);
        long long22 = frequency8.getCumFreq('a');
        double double24 = frequency8.getPct(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCount(' ');
        double double9 = frequency1.getPct('#');
        double double11 = frequency1.getPct(10L);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        long long12 = frequency1.getCount((long) '4');
        frequency1.addValue(0L);
        long long16 = frequency1.getCount((int) (short) 10);
        double double18 = frequency1.getCumPct('a');
        java.util.Iterator iterator19 = frequency1.valuesIterator();
        java.util.Iterator iterator20 = frequency1.valuesIterator();
        long long22 = frequency1.getCount(1);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.lang.String str29 = frequency24.toString();
        double double31 = frequency24.getPct(' ');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        java.util.Iterator iterator38 = frequency33.valuesIterator();
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount(' ');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount(' ');
        long long47 = frequency40.getCount((java.lang.Object) ' ');
        double double49 = frequency40.getPct(' ');
        double double50 = frequency33.getPct((java.lang.Object) frequency40);
        double double51 = frequency24.getPct((java.lang.Object) double50);
        java.lang.String str52 = frequency24.toString();
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        double double56 = frequency54.getPct((int) (short) 1);
        double double58 = frequency54.getPct((long) (byte) 100);
        frequency54.addValue((java.lang.Object) ' ');
        double double62 = frequency54.getCumPct((long) ' ');
        long long64 = frequency54.getCount(0L);
        java.util.Iterator iterator65 = frequency54.valuesIterator();
        double double67 = frequency54.getPct(100);
        frequency24.addValue((java.lang.Object) double67);
        frequency24.clear();
        double double70 = frequency1.getPct((java.lang.Object) frequency24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long3 = frequency0.getSumFreq();
        double double5 = frequency0.getCumPct((int) (byte) 100);
        double double7 = frequency0.getCumPct((int) ' ');
        double double9 = frequency0.getCumPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq((long) (byte) -1);
        double double12 = frequency1.getCumPct((int) (byte) -1);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        double double18 = frequency14.getPct((long) (byte) 100);
        frequency14.addValue((java.lang.Object) ' ');
        double double22 = frequency14.getCumPct((long) ' ');
        double double24 = frequency14.getCumPct((long) '#');
        double double25 = frequency1.getPct((java.lang.Object) double24);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        long long34 = frequency27.getCount((java.lang.Object) ' ');
        long long36 = frequency27.getCumFreq('#');
        long long38 = frequency27.getCumFreq((java.lang.Object) (-1));
        java.lang.String str39 = frequency27.toString();
        long long40 = frequency27.getSumFreq();
        long long42 = frequency27.getCount(100);
        double double44 = frequency27.getPct((int) (byte) -1);
        long long46 = frequency27.getCumFreq('#');
        double double47 = frequency1.getPct((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        frequency1.clear();
        long long21 = frequency1.getCount((int) (short) 10);
        java.lang.String str22 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct((int) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        java.lang.String str14 = frequency9.toString();
        double double16 = frequency9.getPct(' ');
        long long18 = frequency9.getCumFreq('a');
        long long19 = frequency9.getSumFreq();
        java.util.Iterator iterator20 = frequency9.valuesIterator();
        double double21 = frequency1.getPct((java.lang.Object) iterator20);
        double double23 = frequency1.getPct(' ');
        long long24 = frequency1.getSumFreq();
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getPct((int) (short) 1);
        double double30 = frequency26.getPct((long) (byte) 100);
        frequency26.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount(' ');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount(' ');
        long long41 = frequency34.getCount((java.lang.Object) ' ');
        double double43 = frequency34.getCumPct('a');
        long long44 = frequency26.getCount((java.lang.Object) double43);
        double double46 = frequency26.getCumPct((long) (short) 1);
        frequency26.addValue(0);
        long long50 = frequency26.getCumFreq((int) (short) -1);
        frequency26.clear();
        long long53 = frequency26.getCumFreq((long) (-1));
        long long54 = frequency1.getCount((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        long long15 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Integer) (-1));
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        long long25 = frequency19.getCount((int) (short) 1);
        frequency19.addValue((java.lang.Object) 1);
        frequency19.addValue((int) (short) 0);
        frequency19.addValue((java.lang.Integer) (-1));
        frequency19.addValue((long) ' ');
        long long35 = frequency19.getCount((int) (byte) 10);
        double double36 = frequency1.getPct((java.lang.Object) frequency19);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        frequency38.addValue((int) '#');
        double double44 = frequency38.getCumPct((int) (byte) 1);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCount(' ');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        long long53 = frequency46.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getPct(1);
        frequency55.addValue((int) '#');
        double double60 = frequency46.getPct((java.lang.Object) frequency55);
        double double62 = frequency55.getCumPct(10);
        long long63 = frequency38.getCount((java.lang.Object) 10);
        long long65 = frequency38.getCumFreq((int) (short) 10);
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        long long69 = frequency67.getCount(' ');
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        long long73 = frequency71.getCount(' ');
        long long74 = frequency67.getCount((java.lang.Object) ' ');
        long long76 = frequency67.getCumFreq('#');
        long long78 = frequency67.getCumFreq((java.lang.Object) (-1));
        java.lang.String str79 = frequency67.toString();
        long long80 = frequency67.getSumFreq();
        frequency38.addValue((java.lang.Object) long80);
        long long82 = frequency1.getCumFreq((java.lang.Object) frequency38);
        frequency38.addValue((long) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str79, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct((int) (short) 1);
        double double34 = frequency30.getPct((long) (byte) 100);
        java.util.Iterator iterator35 = frequency30.valuesIterator();
        frequency30.clear();
        frequency30.addValue((long) 'a');
        frequency30.clear();
        long long40 = frequency1.getCumFreq((java.lang.Object) frequency30);
        long long42 = frequency1.getCumFreq('#');
        double double44 = frequency1.getPct((int) (byte) 10);
        frequency1.addValue((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct((int) (short) 1);
        double double35 = frequency31.getPct((long) (byte) 100);
        frequency31.addValue((java.lang.Integer) 0);
        double double38 = frequency1.getCumPct((java.lang.Object) frequency31);
        double double40 = frequency1.getPct((long) (short) 10);
        java.lang.String str41 = frequency1.toString();
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        long long7 = frequency1.getCount((int) '4');
        double double9 = frequency1.getPct((long) (byte) 10);
        frequency1.clear();
        double double12 = frequency1.getPct(' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCumFreq(100);
        frequency1.clear();
        double double9 = frequency1.getPct('a');
        long long11 = frequency1.getCumFreq((-1));
        long long13 = frequency1.getCount((long) (short) -1);
        double double15 = frequency1.getCumPct((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCount(' ');
        java.lang.String str6 = frequency1.toString();
        frequency1.addValue(' ');
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCount(0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCount((long) 0);
        long long11 = frequency1.getCumFreq((int) ' ');
        long long13 = frequency1.getCumFreq(' ');
        double double15 = frequency1.getPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue('#');
        double double17 = frequency13.getPct((java.lang.Object) 1);
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        frequency20.addValue((java.lang.Object) ' ');
        double double28 = frequency20.getCumPct((long) ' ');
        long long30 = frequency20.getCount(0L);
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        double double32 = frequency1.getPct((java.lang.Object) frequency20);
        long long34 = frequency20.getCount(0L);
        // The following exception was thrown during execution in test generation
        try {
            frequency20.addValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        long long7 = frequency1.getCount((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency9.getCumPct((java.lang.Object) 10.0d);
        long long26 = frequency1.getCumFreq((java.lang.Object) frequency9);
        java.lang.Class<?> wildcardClass27 = frequency9.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        frequency10.addValue((java.lang.Object) (-1L));
        long long14 = frequency10.getCumFreq((-1));
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        double double21 = frequency16.getPct('4');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue('#');
        long long27 = frequency23.getCount(' ');
        java.lang.Class<?> wildcardClass28 = frequency23.getClass();
        double double29 = frequency16.getPct((java.lang.Object) wildcardClass28);
        double double30 = frequency10.getCumPct((java.lang.Object) frequency16);
        long long31 = frequency1.getCumFreq((java.lang.Object) double30);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        double double39 = frequency33.getCumPct('a');
        long long40 = frequency33.getSumFreq();
        double double42 = frequency33.getPct((int) (short) 0);
        frequency33.clear();
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        long long46 = frequency44.getCount((java.lang.Object) (byte) 100);
        double double47 = frequency33.getPct((java.lang.Object) (byte) 100);
        java.util.Iterator iterator48 = frequency33.valuesIterator();
        double double50 = frequency33.getPct((long) '#');
        double double51 = frequency1.getPct((java.lang.Object) double50);
        java.lang.String str52 = frequency1.toString();
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        long long56 = frequency54.getCount(' ');
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        long long60 = frequency58.getCount(' ');
        long long61 = frequency54.getCount((java.lang.Object) ' ');
        long long63 = frequency54.getCount((int) '4');
        long long65 = frequency54.getCumFreq((long) (byte) -1);
        frequency54.addValue('4');
        double double69 = frequency54.getPct('a');
        java.util.Iterator iterator70 = frequency54.valuesIterator();
        double double71 = frequency1.getCumPct((java.lang.Object) iterator70);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        long long17 = frequency10.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        frequency19.addValue((java.lang.Object) (-1L));
        double double23 = frequency19.getPct(' ');
        frequency19.addValue((java.lang.Integer) 1);
        double double27 = frequency19.getPct((long) ' ');
        frequency10.addValue((java.lang.Object) double27);
        long long29 = frequency1.getCount((java.lang.Object) frequency10);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        frequency35.clear();
        long long44 = frequency31.getCumFreq((java.lang.Object) frequency35);
        long long46 = frequency35.getCumFreq((long) (short) -1);
        long long47 = frequency1.getCumFreq((java.lang.Object) (short) -1);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        double double51 = frequency49.getPct((int) (short) 1);
        double double53 = frequency49.getPct((long) (byte) 100);
        java.util.Iterator iterator54 = frequency49.valuesIterator();
        frequency49.clear();
        frequency49.addValue((long) 'a');
        frequency49.addValue((long) (byte) 100);
        frequency49.addValue((int) '4');
        double double62 = frequency1.getCumPct((java.lang.Object) frequency49);
        double double64 = frequency1.getPct((long) (byte) 10);
        double double66 = frequency1.getPct((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long3 = frequency0.getSumFreq();
        double double5 = frequency0.getPct((long) (byte) 1);
        frequency0.addValue((int) (short) -1);
        double double9 = frequency0.getCumPct((long) 1);
        double double11 = frequency0.getCumPct(0L);
        java.util.Iterator iterator12 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        frequency1.addValue(1);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        frequency33.addValue((int) '#');
        double double39 = frequency33.getCumPct((int) (byte) 1);
        frequency33.addValue((java.lang.Integer) 100);
        double double42 = frequency1.getCumPct((java.lang.Object) frequency33);
        long long44 = frequency33.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        frequency1.addValue(1);
        long long33 = frequency1.getCumFreq('4');
        long long35 = frequency1.getCount('4');
        double double37 = frequency1.getPct((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Integer) (-1));
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        double double10 = frequency8.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        long long19 = frequency12.getCount((java.lang.Object) ' ');
        frequency12.clear();
        long long21 = frequency8.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        double double27 = frequency23.getPct('4');
        frequency23.clear();
        double double29 = frequency8.getCumPct((java.lang.Object) frequency23);
        long long31 = frequency23.getCumFreq('a');
        double double32 = frequency1.getCumPct((java.lang.Object) long31);
        java.lang.String str33 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        frequency1.addValue(1);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        frequency33.addValue((int) '#');
        double double39 = frequency33.getCumPct((int) (byte) 1);
        frequency33.addValue((java.lang.Integer) 100);
        double double42 = frequency1.getCumPct((java.lang.Object) frequency33);
        frequency33.clear();
        double double45 = frequency33.getCumPct((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Comparator comparator1 = null;
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency(comparator1);
        long long4 = frequency2.getCount(' ');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        long long8 = frequency6.getCount(' ');
        long long9 = frequency2.getCount((java.lang.Object) ' ');
        double double11 = frequency2.getPct(' ');
        double double13 = frequency2.getPct(' ');
        long long15 = frequency2.getCumFreq((int) (byte) 10);
        frequency0.addValue((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        long long4 = frequency0.getCumFreq('a');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        double double8 = frequency6.getPct((int) (short) 1);
        double double10 = frequency6.getPct((long) (byte) 100);
        frequency6.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        long long21 = frequency14.getCount((java.lang.Object) ' ');
        double double23 = frequency14.getCumPct('a');
        long long24 = frequency6.getCount((java.lang.Object) double23);
        double double26 = frequency6.getCumPct((long) (short) 1);
        double double28 = frequency6.getCumPct((int) (byte) 100);
        double double30 = frequency6.getPct(' ');
        double double32 = frequency6.getCumPct(' ');
        long long33 = frequency0.getCount((java.lang.Object) frequency6);
        long long34 = frequency0.getSumFreq();
        java.lang.String str35 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        double double19 = frequency10.getPct(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getPct((int) (short) 1);
        double double25 = frequency21.getPct((long) (byte) 100);
        java.util.Iterator iterator26 = frequency21.valuesIterator();
        frequency21.clear();
        frequency21.addValue((long) 'a');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getPct(1);
        frequency40.addValue((int) '#');
        double double45 = frequency31.getPct((java.lang.Object) frequency40);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount(' ');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount(' ');
        long long54 = frequency47.getCount((java.lang.Object) ' ');
        long long56 = frequency47.getCumFreq('#');
        long long58 = frequency47.getCumFreq((java.lang.Object) (-1));
        long long59 = frequency40.getCumFreq((java.lang.Object) (-1));
        frequency40.addValue((java.lang.Integer) (-1));
        long long62 = frequency21.getCount((java.lang.Object) frequency40);
        long long64 = frequency40.getCumFreq('a');
        java.util.Comparator comparator65 = null;
        org.apache.commons.math.stat.Frequency frequency66 = new org.apache.commons.math.stat.Frequency(comparator65);
        frequency66.addValue((java.lang.Object) (-1L));
        double double70 = frequency66.getPct(' ');
        frequency66.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator73 = frequency66.valuesIterator();
        java.util.Comparator comparator74 = null;
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency(comparator74);
        double double77 = frequency75.getPct((int) (short) 1);
        double double79 = frequency75.getPct((long) (byte) 100);
        frequency75.addValue((java.lang.Integer) 0);
        long long83 = frequency75.getCount('a');
        double double84 = frequency66.getPct((java.lang.Object) frequency75);
        double double85 = frequency40.getPct((java.lang.Object) frequency75);
        double double86 = frequency10.getPct((java.lang.Object) frequency75);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        frequency10.addValue(' ');
        java.lang.String str27 = frequency10.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        double double12 = frequency1.getCumPct((int) '#');
        double double14 = frequency1.getCumPct((int) (short) -1);
        long long15 = frequency1.getSumFreq();
        long long17 = frequency1.getCount((-1));
        java.lang.Object obj18 = null;
        long long19 = frequency1.getCumFreq(obj18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct(1);
        frequency9.addValue((int) '#');
        long long14 = frequency1.getCount((java.lang.Object) frequency9);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        double double20 = frequency16.getPct((long) (byte) 100);
        frequency16.addValue((java.lang.Object) ' ');
        double double24 = frequency16.getCumPct((long) ' ');
        long long26 = frequency16.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getPct(100);
        double double31 = frequency27.getPct(3L);
        long long33 = frequency27.getCount((long) '4');
        long long35 = frequency27.getCount((-1L));
        double double36 = frequency16.getPct((java.lang.Object) long35);
        double double38 = frequency16.getCumPct('a');
        double double39 = frequency9.getPct((java.lang.Object) frequency16);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        frequency41.addValue((java.lang.Object) (-1L));
        double double45 = frequency41.getPct(' ');
        long long47 = frequency41.getCumFreq(' ');
        double double49 = frequency41.getPct(1);
        frequency41.clear();
        long long52 = frequency41.getCount((long) (short) 10);
        double double54 = frequency41.getCumPct('a');
        long long56 = frequency41.getCount('4');
        long long58 = frequency41.getCount((long) '4');
        double double60 = frequency41.getCumPct(10);
        long long61 = frequency16.getCumFreq((java.lang.Object) frequency41);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        java.util.Iterator iterator17 = frequency14.valuesIterator();
        long long19 = frequency14.getCumFreq(100);
        long long20 = frequency1.getCumFreq((java.lang.Object) 100);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        frequency22.addValue((java.lang.Object) (-1L));
        double double26 = frequency22.getPct(' ');
        long long28 = frequency22.getCumFreq(' ');
        double double30 = frequency22.getPct(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        frequency32.addValue('#');
        long long36 = frequency32.getCount(' ');
        long long38 = frequency32.getCumFreq((int) '4');
        double double39 = frequency22.getCumPct((java.lang.Object) long38);
        frequency22.addValue((int) (byte) 100);
        double double42 = frequency1.getCumPct((java.lang.Object) frequency22);
        double double44 = frequency22.getPct((-1));
        double double46 = frequency22.getCumPct((long) 'a');
        double double48 = frequency22.getPct('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.5d + "'", double44 == 0.5d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.5d + "'", double46 == 0.5d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        long long7 = frequency1.getCount((int) '4');
        double double9 = frequency1.getPct((long) (byte) 10);
        frequency1.clear();
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        long long19 = frequency12.getCount((java.lang.Object) ' ');
        long long21 = frequency12.getCumFreq('#');
        long long23 = frequency12.getCumFreq((java.lang.Object) (-1));
        long long24 = frequency1.getCount((java.lang.Object) (-1));
        long long26 = frequency1.getCumFreq((int) (short) 0);
        java.util.Iterator iterator27 = frequency1.valuesIterator();
        double double29 = frequency1.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency1.getCount((long) (short) 100);
        java.lang.String str39 = frequency1.toString();
        long long41 = frequency1.getCumFreq((long) (short) 10);
        double double43 = frequency1.getPct((long) 0);
        long long45 = frequency1.getCumFreq((long) ' ');
        double double47 = frequency1.getCumPct(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2L + "'", long41 == 2L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.5d + "'", double43 == 0.5d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) ' ');
        long long11 = frequency1.getCount(0L);
        long long13 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        java.lang.String str4 = frequency1.toString();
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        double double8 = frequency6.getPct((int) (short) 1);
        double double10 = frequency6.getPct((long) (byte) 100);
        long long12 = frequency6.getCount((int) (short) 1);
        java.lang.String str13 = frequency6.toString();
        frequency6.addValue('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(100);
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        double double6 = frequency4.getPct((int) (short) 1);
        double double8 = frequency4.getPct((long) (byte) 100);
        long long10 = frequency4.getCount(100);
        double double12 = frequency4.getCumPct('4');
        frequency4.addValue((int) (byte) 1);
        long long15 = frequency0.getCumFreq((java.lang.Object) frequency4);
        frequency4.clear();
        long long18 = frequency4.getCount((int) (byte) 10);
        long long20 = frequency4.getCount((int) (short) 100);
        frequency4.addValue((java.lang.Integer) 100);
        double double24 = frequency4.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        long long18 = frequency10.getSumFreq();
        long long20 = frequency10.getCount('#');
        double double22 = frequency10.getPct(100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct(1);
        frequency9.addValue((int) '#');
        long long14 = frequency1.getCount((java.lang.Object) frequency9);
        java.util.Iterator iterator15 = frequency9.valuesIterator();
        double double17 = frequency9.getPct((int) (short) 100);
        long long19 = frequency9.getCount((long) (short) -1);
        double double21 = frequency9.getCumPct((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        double double23 = frequency1.getCumPct((int) (byte) 100);
        double double25 = frequency1.getPct(' ');
        double double27 = frequency1.getCumPct(' ');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getPct((int) (short) 1);
        double double33 = frequency29.getPct((long) (byte) 100);
        double double35 = frequency29.getCumPct('a');
        double double37 = frequency29.getCumPct('a');
        long long39 = frequency29.getCount((long) (short) 100);
        long long41 = frequency29.getCount(10L);
        long long43 = frequency29.getCumFreq((int) (short) 1);
        long long44 = frequency1.getCount((java.lang.Object) frequency29);
        long long45 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        long long8 = frequency1.getCumFreq(1L);
        frequency1.addValue('a');
        java.util.Iterator iterator11 = frequency1.valuesIterator();
        frequency1.addValue('#');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        frequency15.addValue((java.lang.Object) (-1L));
        double double19 = frequency15.getPct(' ');
        long long21 = frequency15.getCumFreq(' ');
        java.util.Iterator iterator22 = frequency15.valuesIterator();
        frequency15.clear();
        double double25 = frequency15.getCumPct('4');
        long long27 = frequency15.getCumFreq('a');
        double double28 = frequency1.getCumPct((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        java.lang.String str16 = frequency1.toString();
        long long18 = frequency1.getCount('4');
        double double20 = frequency1.getCumPct(10L);
        double double22 = frequency1.getCumPct((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency1.getPct((int) (short) -1);
        double double19 = frequency1.getCumPct((int) ' ');
        long long21 = frequency1.getCount((-1L));
        frequency1.addValue((java.lang.Object) 10.0f);
        frequency1.clear();
        long long26 = frequency1.getCumFreq('#');
        double double28 = frequency1.getCumPct((long) (short) 1);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct((int) (short) 1);
        double double34 = frequency30.getPct((long) (byte) 100);
        long long36 = frequency30.getCount((int) (short) 1);
        long long38 = frequency30.getCumFreq((long) ' ');
        long long40 = frequency30.getCumFreq(10);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getPct((int) (short) 1);
        frequency42.addValue((int) '#');
        double double48 = frequency42.getPct(' ');
        double double50 = frequency42.getPct(1);
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        double double54 = frequency52.getPct((int) (short) 1);
        java.util.Iterator iterator55 = frequency52.valuesIterator();
        long long57 = frequency52.getCumFreq(100);
        double double59 = frequency52.getPct((-1L));
        long long61 = frequency52.getCumFreq((int) (short) 10);
        double double62 = frequency42.getCumPct((java.lang.Object) (short) 10);
        long long64 = frequency42.getCumFreq((int) (byte) 100);
        frequency42.clear();
        long long67 = frequency42.getCount((long) 100);
        double double68 = frequency30.getCumPct((java.lang.Object) 100);
        frequency30.addValue('a');
        long long71 = frequency1.getCount((java.lang.Object) frequency30);
        double double73 = frequency30.getCumPct((-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        long long12 = frequency1.getCount((long) '4');
        frequency1.addValue(0L);
        long long16 = frequency1.getCount((int) (short) 10);
        double double18 = frequency1.getCumPct('a');
        java.util.Iterator iterator19 = frequency1.valuesIterator();
        double double21 = frequency1.getPct((long) 1);
        long long23 = frequency1.getCount(100L);
        long long25 = frequency1.getCount((long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        long long23 = frequency1.getCumFreq((long) (short) 0);
        long long25 = frequency1.getCumFreq((long) 10);
        double double27 = frequency1.getPct((int) 'a');
        double double29 = frequency1.getPct((long) (-1));
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        long long40 = frequency31.getCumFreq('#');
        long long42 = frequency31.getCumFreq((java.lang.Object) (-1));
        java.lang.String str43 = frequency31.toString();
        double double45 = frequency31.getCumPct('4');
        frequency31.clear();
        long long47 = frequency1.getCumFreq((java.lang.Object) frequency31);
        double double49 = frequency1.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str43, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCount('a');
        java.lang.String str7 = frequency1.toString();
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct((int) (short) 1);
        double double13 = frequency9.getPct((long) (byte) 100);
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        double double16 = frequency9.getPct('a');
        long long18 = frequency9.getCumFreq(' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        double double26 = frequency20.getCumPct('a');
        long long27 = frequency20.getSumFreq();
        long long29 = frequency20.getCount((java.lang.Object) '4');
        double double31 = frequency20.getPct(' ');
        double double32 = frequency9.getPct((java.lang.Object) ' ');
        long long33 = frequency1.getCount((java.lang.Object) double32);
        frequency1.addValue((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        frequency1.addValue(100);
        long long7 = frequency1.getCount(0);
        double double9 = frequency1.getCumPct((int) (short) 10);
        double double11 = frequency1.getPct((int) (byte) -1);
        long long13 = frequency1.getCount('4');
        long long15 = frequency1.getCount((long) (-1));
        double double17 = frequency1.getCumPct(' ');
        long long19 = frequency1.getCumFreq(' ');
        double double21 = frequency1.getCumPct((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((java.lang.Object) '4');
        double double12 = frequency1.getPct(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        long long21 = frequency14.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getPct(1);
        frequency23.addValue((int) '#');
        double double28 = frequency14.getPct((java.lang.Object) frequency23);
        double double30 = frequency23.getPct((long) (byte) 100);
        long long31 = frequency23.getSumFreq();
        frequency23.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        double double37 = frequency35.getPct((int) (short) 1);
        double double39 = frequency35.getPct((long) (byte) 100);
        frequency35.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        long long45 = frequency43.getCount(' ');
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount(' ');
        long long50 = frequency43.getCount((java.lang.Object) ' ');
        double double52 = frequency43.getCumPct('a');
        long long53 = frequency35.getCount((java.lang.Object) double52);
        double double55 = frequency35.getCumPct('#');
        long long57 = frequency35.getCumFreq((long) (short) 0);
        double double59 = frequency35.getCumPct((long) (byte) 1);
        java.util.Comparator comparator60 = null;
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency(comparator60);
        frequency61.addValue('#');
        long long65 = frequency61.getCumFreq((java.lang.Object) 1.0f);
        long long67 = frequency61.getCumFreq('a');
        long long68 = frequency61.getSumFreq();
        java.util.Iterator iterator69 = frequency61.valuesIterator();
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        double double73 = frequency71.getPct(1);
        frequency71.addValue((int) '#');
        java.lang.String str76 = frequency71.toString();
        long long77 = frequency61.getCumFreq((java.lang.Object) frequency71);
        double double78 = frequency35.getPct((java.lang.Object) frequency71);
        long long79 = frequency23.getCumFreq((java.lang.Object) frequency71);
        frequency1.addValue((java.lang.Object) long79);
        long long82 = frequency1.getCumFreq((int) (short) -1);
        long long84 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str76, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency1.getCount((long) (short) 100);
        double double40 = frequency1.getPct((int) (byte) 100);
        java.lang.String str41 = frequency1.toString();
        long long43 = frequency1.getCount((long) '#');
        double double45 = frequency1.getCumPct((int) (byte) 100);
        double double47 = frequency1.getPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        double double60 = frequency1.getPct((long) 0);
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        double double64 = frequency62.getPct((int) (short) 1);
        double double66 = frequency62.getPct((long) (byte) 100);
        java.util.Iterator iterator67 = frequency62.valuesIterator();
        long long69 = frequency62.getCumFreq(1L);
        frequency62.addValue('a');
        java.util.Iterator iterator72 = frequency62.valuesIterator();
        double double73 = frequency1.getCumPct((java.lang.Object) frequency62);
        java.util.Iterator iterator74 = frequency62.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(iterator74);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        double double4 = frequency0.getCumPct((int) ' ');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        frequency6.addValue((java.lang.Object) (-1L));
        double double10 = frequency6.getPct(' ');
        frequency6.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator13 = frequency6.valuesIterator();
        long long14 = frequency0.getCount((java.lang.Object) frequency6);
        java.util.Iterator iterator15 = frequency0.valuesIterator();
        double double17 = frequency0.getPct((long) 'a');
        long long19 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((-1L));
        long long24 = frequency20.getCount((-1L));
        long long26 = frequency20.getCount('a');
        double double27 = frequency0.getCumPct((java.lang.Object) 'a');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        frequency29.addValue((java.lang.Object) (-1L));
        double double33 = frequency29.getPct(' ');
        long long35 = frequency29.getCount(' ');
        double double37 = frequency29.getPct('#');
        frequency29.clear();
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount(' ');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount(' ');
        long long47 = frequency40.getCount((java.lang.Object) ' ');
        long long49 = frequency40.getCumFreq('#');
        long long51 = frequency40.getCumFreq((java.lang.Object) (-1));
        java.lang.String str52 = frequency40.toString();
        long long53 = frequency40.getSumFreq();
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getPct((int) (short) 1);
        java.util.Iterator iterator58 = frequency55.valuesIterator();
        long long60 = frequency55.getCumFreq(100);
        double double62 = frequency55.getPct((-1L));
        java.lang.Class<?> wildcardClass63 = frequency55.getClass();
        long long64 = frequency40.getCumFreq((java.lang.Object) wildcardClass63);
        frequency40.addValue((long) (byte) 1);
        long long68 = frequency40.getCumFreq((long) (short) -1);
        long long69 = frequency40.getSumFreq();
        double double70 = frequency29.getPct((java.lang.Object) long69);
        double double72 = frequency29.getCumPct('4');
        frequency0.addValue((java.lang.Object) double72);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCumFreq('4');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        frequency32.addValue((java.lang.Object) (-1L));
        double double36 = frequency32.getPct(' ');
        frequency32.addValue((java.lang.Integer) 1);
        long long39 = frequency1.getCumFreq((java.lang.Object) frequency32);
        long long41 = frequency1.getCount('#');
        double double43 = frequency1.getPct('#');
        double double45 = frequency1.getCumPct(1);
        frequency1.clear();
        long long48 = frequency1.getCount((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        frequency1.clear();
        frequency1.clear();
        frequency1.clear();
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getPct((int) (short) 1);
        long long27 = frequency23.getCumFreq((int) (short) 0);
        double double29 = frequency23.getPct((long) (byte) -1);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct(1);
        frequency31.addValue((int) '#');
        long long36 = frequency23.getCount((java.lang.Object) frequency31);
        double double38 = frequency31.getCumPct((long) (byte) 10);
        long long39 = frequency1.getCount((java.lang.Object) double38);
        double double41 = frequency1.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(100);
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        double double6 = frequency4.getPct((int) (short) 1);
        double double8 = frequency4.getPct((long) (byte) 100);
        long long10 = frequency4.getCount(100);
        double double12 = frequency4.getCumPct('4');
        frequency4.addValue((int) (byte) 1);
        long long15 = frequency0.getCumFreq((java.lang.Object) frequency4);
        frequency4.clear();
        long long18 = frequency4.getCount((int) (byte) 10);
        long long20 = frequency4.getCount((int) (short) 100);
        long long22 = frequency4.getCumFreq((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        double double4 = frequency0.getCumPct((int) ' ');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        frequency6.addValue((java.lang.Object) (-1L));
        double double10 = frequency6.getPct(' ');
        frequency6.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator13 = frequency6.valuesIterator();
        long long14 = frequency0.getCount((java.lang.Object) frequency6);
        java.util.Iterator iterator15 = frequency0.valuesIterator();
        double double17 = frequency0.getPct((long) 'a');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        java.util.Iterator iterator24 = frequency19.valuesIterator();
        double double25 = frequency0.getCumPct((java.lang.Object) frequency19);
        double double27 = frequency0.getCumPct((int) '4');
        long long29 = frequency0.getCount((int) (byte) 100);
        long long31 = frequency0.getCumFreq((int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((long) '4');
        long long14 = frequency1.getCumFreq('4');
        long long16 = frequency1.getCumFreq(' ');
        long long18 = frequency1.getCount(' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        java.util.Iterator iterator23 = frequency20.valuesIterator();
        double double25 = frequency20.getPct('4');
        frequency20.addValue(1);
        frequency20.addValue((int) (byte) 0);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct((int) (short) 1);
        double double35 = frequency31.getPct((long) (byte) 100);
        java.util.Iterator iterator36 = frequency31.valuesIterator();
        long long38 = frequency31.getCumFreq(1L);
        long long39 = frequency20.getCount((java.lang.Object) 1L);
        frequency20.clear();
        long long42 = frequency20.getCount('#');
        java.lang.String str43 = frequency20.toString();
        long long44 = frequency1.getCount((java.lang.Object) frequency20);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str43, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        double double23 = frequency1.getCumPct((int) (byte) 0);
        long long25 = frequency1.getCumFreq((long) 10);
        long long26 = frequency1.getSumFreq();
        long long28 = frequency1.getCumFreq((long) (short) 10);
        frequency1.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        double double13 = frequency1.getCumPct((long) 100);
        java.lang.String str14 = frequency1.toString();
        frequency1.addValue((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        double double31 = frequency1.getCumPct((int) 'a');
        double double33 = frequency1.getCumPct('a');
        long long35 = frequency1.getCount(' ');
        double double37 = frequency1.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        double double13 = frequency1.getPct((long) (-1));
        long long15 = frequency1.getCumFreq((long) 'a');
        java.lang.Class<?> wildcardClass16 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(100);
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        double double6 = frequency4.getPct((int) (short) 1);
        double double8 = frequency4.getPct((long) (byte) 100);
        long long10 = frequency4.getCount(100);
        double double12 = frequency4.getCumPct('4');
        frequency4.addValue((int) (byte) 1);
        long long15 = frequency0.getCumFreq((java.lang.Object) frequency4);
        long long17 = frequency4.getCount('4');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        frequency19.addValue((java.lang.Object) (-1L));
        double double23 = frequency19.getPct(' ');
        long long25 = frequency19.getCumFreq(' ');
        double double27 = frequency19.getPct(1);
        double double29 = frequency19.getCumPct(' ');
        frequency19.addValue((int) '#');
        double double33 = frequency19.getCumPct(0);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        double double37 = frequency35.getPct((int) (short) 1);
        java.util.Iterator iterator38 = frequency35.valuesIterator();
        long long40 = frequency35.getCount('a');
        java.lang.String str41 = frequency35.toString();
        java.lang.String str42 = frequency35.toString();
        frequency35.addValue('4');
        long long46 = frequency35.getCumFreq('a');
        long long47 = frequency19.getCumFreq((java.lang.Object) frequency35);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        double double51 = frequency49.getPct((int) (short) 1);
        java.util.Iterator iterator52 = frequency49.valuesIterator();
        long long54 = frequency49.getCumFreq(100);
        double double56 = frequency49.getPct((-1L));
        long long58 = frequency49.getCumFreq((int) (short) 10);
        long long59 = frequency19.getCount((java.lang.Object) (short) 10);
        double double60 = frequency4.getPct((java.lang.Object) frequency19);
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        double double64 = frequency62.getPct((int) (short) 1);
        double double66 = frequency62.getPct((long) (byte) 100);
        frequency62.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator69 = null;
        org.apache.commons.math.stat.Frequency frequency70 = new org.apache.commons.math.stat.Frequency(comparator69);
        long long72 = frequency70.getCount(' ');
        java.util.Comparator comparator73 = null;
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency(comparator73);
        long long76 = frequency74.getCount(' ');
        long long77 = frequency70.getCount((java.lang.Object) ' ');
        double double79 = frequency70.getCumPct('a');
        long long80 = frequency62.getCount((java.lang.Object) double79);
        double double82 = frequency62.getCumPct((long) (short) 1);
        double double84 = frequency62.getCumPct((int) (byte) 100);
        double double86 = frequency62.getPct(' ');
        double double88 = frequency62.getCumPct((int) (short) 1);
        frequency62.addValue((long) (byte) -1);
        frequency62.addValue((-1));
        frequency4.addValue((java.lang.Object) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long12 = frequency1.getSumFreq();
        java.util.Iterator iterator13 = frequency1.valuesIterator();
        long long15 = frequency1.getCount((int) (byte) 10);
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long16 = frequency12.getCumFreq((int) '4');
        frequency12.addValue((java.lang.Integer) (-1));
        long long19 = frequency1.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        long long28 = frequency21.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct(1);
        frequency30.addValue((int) '#');
        double double35 = frequency21.getPct((java.lang.Object) frequency30);
        double double37 = frequency21.getPct((int) (short) -1);
        double double39 = frequency21.getPct(100L);
        frequency21.addValue(' ');
        double double42 = frequency1.getCumPct((java.lang.Object) frequency21);
        double double44 = frequency1.getCumPct(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        long long8 = frequency1.getCount((-1));
        frequency1.addValue((java.lang.Integer) 100);
        long long12 = frequency1.getCumFreq('4');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        double double18 = frequency14.getPct((long) (byte) 100);
        double double20 = frequency14.getCumPct('a');
        double double22 = frequency14.getCumPct('a');
        long long24 = frequency14.getCumFreq(2L);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        double double19 = frequency13.getCumPct('a');
        long long20 = frequency13.getSumFreq();
        long long22 = frequency13.getCount((java.lang.Object) '4');
        double double24 = frequency13.getPct((int) (byte) 0);
        long long25 = frequency1.getCount((java.lang.Object) frequency13);
        frequency13.addValue((long) (byte) 0);
        double double29 = frequency13.getPct('4');
        double double31 = frequency13.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        double double16 = frequency1.getPct((long) (byte) 100);
        double double18 = frequency1.getPct('#');
        double double20 = frequency1.getPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        double double9 = frequency1.getPct((java.lang.Object) (-1.0d));
        double double11 = frequency1.getCumPct((int) (short) -1);
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        long long5 = frequency1.getCumFreq((-1));
        long long7 = frequency1.getCumFreq('a');
        double double9 = frequency1.getPct('a');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        long long17 = frequency11.getCount((int) (short) 1);
        long long19 = frequency11.getCumFreq((long) ' ');
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        long long22 = frequency1.getCumFreq((long) (short) -1);
        double double24 = frequency1.getCumPct('4');
        double double26 = frequency1.getPct('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((int) (short) -1);
        long long11 = frequency1.getCount((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct('4');
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        frequency8.addValue('#');
        long long12 = frequency8.getCount(' ');
        java.lang.Class<?> wildcardClass13 = frequency8.getClass();
        double double14 = frequency1.getPct((java.lang.Object) wildcardClass13);
        double double16 = frequency1.getPct((-1));
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount(' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount(' ');
        long long29 = frequency22.getCount((java.lang.Object) ' ');
        frequency22.clear();
        long long31 = frequency18.getCumFreq((java.lang.Object) frequency22);
        long long33 = frequency18.getCumFreq(0);
        double double34 = frequency1.getCumPct((java.lang.Object) frequency18);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getPct((int) (short) 1);
        double double40 = frequency36.getPct((long) (byte) 100);
        long long42 = frequency36.getCount((int) (short) 1);
        frequency36.addValue((java.lang.Object) 1);
        frequency36.addValue((int) (short) 0);
        frequency36.addValue((java.lang.Integer) (-1));
        frequency36.addValue((long) ' ');
        long long52 = frequency36.getCount((int) (byte) 10);
        double double54 = frequency36.getCumPct((int) (byte) 10);
        long long56 = frequency36.getCount('a');
        double double57 = frequency18.getPct((java.lang.Object) frequency36);
        double double59 = frequency18.getPct(0L);
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency();
        double double62 = frequency60.getPct(100);
        java.util.Comparator comparator63 = null;
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency(comparator63);
        double double66 = frequency64.getPct((int) (short) 1);
        double double68 = frequency64.getPct((long) (byte) 100);
        long long70 = frequency64.getCount(100);
        double double72 = frequency64.getCumPct('4');
        frequency64.addValue((int) (byte) 1);
        long long75 = frequency60.getCumFreq((java.lang.Object) frequency64);
        frequency64.clear();
        java.lang.String str77 = frequency64.toString();
        double double78 = frequency18.getPct((java.lang.Object) frequency64);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.75d + "'", double54 == 0.75d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str77, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double78));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0f);
        long long7 = frequency1.getCount((int) '4');
        double double9 = frequency1.getPct((long) (byte) 10);
        frequency1.clear();
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        long long19 = frequency12.getCount((java.lang.Object) ' ');
        long long21 = frequency12.getCumFreq('#');
        long long23 = frequency12.getCumFreq((java.lang.Object) (-1));
        java.lang.String str24 = frequency12.toString();
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        frequency26.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator29 = frequency26.valuesIterator();
        double double30 = frequency12.getPct((java.lang.Object) frequency26);
        long long32 = frequency26.getCumFreq((int) (short) 0);
        frequency26.addValue((java.lang.Integer) 100);
        long long35 = frequency1.getCumFreq((java.lang.Object) frequency26);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((long) '4');
        java.lang.String str13 = frequency1.toString();
        java.lang.String str14 = frequency1.toString();
        double double16 = frequency1.getPct('a');
        frequency1.addValue((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        double double26 = frequency10.getPct((int) (byte) 1);
        double double28 = frequency10.getCumPct(0L);
        double double30 = frequency10.getPct((long) (byte) -1);
        long long32 = frequency10.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCumFreq(100);
        double double23 = frequency16.getPct((-1L));
        java.lang.Class<?> wildcardClass24 = frequency16.getClass();
        long long25 = frequency1.getCumFreq((java.lang.Object) wildcardClass24);
        double double27 = frequency1.getCumPct((int) (byte) 10);
        double double29 = frequency1.getPct('a');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        frequency31.addValue((java.lang.Object) (-1L));
        double double35 = frequency31.getPct(' ');
        long long37 = frequency31.getCumFreq(' ');
        long long39 = frequency31.getCumFreq((long) '#');
        frequency31.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getPct((int) (short) 1);
        java.util.Iterator iterator46 = frequency43.valuesIterator();
        long long48 = frequency43.getCumFreq(100);
        long long49 = frequency31.getCumFreq((java.lang.Object) frequency43);
        frequency43.addValue((java.lang.Integer) 1);
        double double52 = frequency1.getPct((java.lang.Object) 1);
        java.lang.String str53 = frequency1.toString();
        long long55 = frequency1.getCount((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct((int) (short) 1);
        double double34 = frequency30.getPct((long) (byte) 100);
        java.util.Iterator iterator35 = frequency30.valuesIterator();
        frequency30.clear();
        frequency30.addValue((long) 'a');
        frequency30.clear();
        long long40 = frequency1.getCumFreq((java.lang.Object) frequency30);
        long long42 = frequency1.getCumFreq('#');
        double double44 = frequency1.getPct((int) (byte) 10);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCumFreq((long) (byte) 1);
        double double11 = frequency1.getCumPct((long) (short) 0);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        long long17 = frequency13.getCumFreq((int) (short) 0);
        double double19 = frequency13.getPct((long) (byte) -1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getPct(1);
        frequency21.addValue((int) '#');
        long long26 = frequency13.getCount((java.lang.Object) frequency21);
        double double28 = frequency21.getCumPct((long) (byte) 10);
        double double30 = frequency21.getCumPct(10);
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency21);
        long long32 = frequency1.getSumFreq();
        frequency1.addValue((long) 10);
        double double36 = frequency1.getPct('4');
        long long37 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCumFreq((long) (byte) 1);
        double double11 = frequency1.getCumPct((long) (short) 0);
        long long12 = frequency1.getSumFreq();
        frequency1.addValue((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        double double20 = frequency8.getCumPct((long) 'a');
        java.lang.Class<?> wildcardClass21 = frequency8.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long3 = frequency0.getSumFreq();
        double double5 = frequency0.getPct((long) (byte) 1);
        frequency0.addValue((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        frequency1.addValue((java.lang.Integer) 0);
        frequency1.addValue((java.lang.Integer) 1);
        double double32 = frequency1.getPct(0L);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        frequency34.addValue('#');
        long long38 = frequency34.getCumFreq((java.lang.Object) 1.0f);
        long long40 = frequency34.getCount((int) '4');
        long long42 = frequency34.getCount('4');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount(' ');
        long long55 = frequency48.getCount((java.lang.Object) ' ');
        frequency48.clear();
        long long57 = frequency44.getCumFreq((java.lang.Object) frequency48);
        frequency44.addValue('4');
        double double61 = frequency44.getPct((int) (short) -1);
        java.util.Iterator iterator62 = frequency44.valuesIterator();
        long long63 = frequency34.getCumFreq((java.lang.Object) iterator62);
        double double64 = frequency1.getPct((java.lang.Object) iterator62);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.3333333333333333d + "'", double32 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        double double16 = frequency1.getPct((long) (byte) 100);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount(' ');
        long long25 = frequency18.getCount((java.lang.Object) ' ');
        long long27 = frequency18.getCount((int) '4');
        long long29 = frequency18.getCount((int) (short) 100);
        double double31 = frequency18.getPct('4');
        long long33 = frequency18.getCount('#');
        java.util.Iterator iterator34 = frequency18.valuesIterator();
        double double35 = frequency1.getPct((java.lang.Object) frequency18);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('4');
        long long12 = frequency1.getCumFreq((int) (byte) 1);
        java.lang.String str13 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        frequency15.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator18 = frequency15.valuesIterator();
        double double19 = frequency1.getPct((java.lang.Object) frequency15);
        long long21 = frequency15.getCumFreq((int) (short) 0);
        long long23 = frequency15.getCumFreq(0);
        long long25 = frequency15.getCount((long) 0);
        java.util.Iterator iterator26 = frequency15.valuesIterator();
        frequency15.addValue(0);
        double double30 = frequency15.getPct(10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue('#');
        double double17 = frequency13.getPct((java.lang.Object) 1);
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        frequency20.addValue((java.lang.Object) ' ');
        double double28 = frequency20.getCumPct((long) ' ');
        long long30 = frequency20.getCount(0L);
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        double double32 = frequency1.getPct((java.lang.Object) frequency20);
        double double34 = frequency1.getCumPct(100);
        double double36 = frequency1.getPct((long) '#');
        double double38 = frequency1.getPct((int) ' ');
        long long40 = frequency1.getCumFreq(4L);
        long long42 = frequency1.getCumFreq(0L);
        long long44 = frequency1.getCumFreq((long) 1);
        long long46 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        long long23 = frequency1.getCumFreq((long) (short) 0);
        double double25 = frequency1.getCumPct((long) (byte) 1);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        frequency27.addValue('#');
        long long31 = frequency27.getCumFreq((java.lang.Object) 1.0f);
        long long33 = frequency27.getCumFreq('a');
        long long34 = frequency27.getSumFreq();
        java.util.Iterator iterator35 = frequency27.valuesIterator();
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getPct(1);
        frequency37.addValue((int) '#');
        java.lang.String str42 = frequency37.toString();
        long long43 = frequency27.getCumFreq((java.lang.Object) frequency37);
        double double44 = frequency1.getPct((java.lang.Object) frequency37);
        double double46 = frequency1.getPct(' ');
        long long47 = frequency1.getSumFreq();
        double double49 = frequency1.getPct('#');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getPct((int) (short) 1);
        double double55 = frequency51.getPct((long) (byte) 100);
        long long57 = frequency51.getCount((int) (short) 1);
        frequency51.addValue((java.lang.Object) 1);
        frequency51.addValue((int) (short) 0);
        long long63 = frequency51.getCumFreq((long) (short) 0);
        long long65 = frequency51.getCumFreq((java.lang.Object) 10.0d);
        frequency51.addValue((java.lang.Integer) (-1));
        frequency51.addValue((java.lang.Integer) (-1));
        long long71 = frequency51.getCumFreq((-1));
        double double72 = frequency1.getCumPct((java.lang.Object) long71);
        double double74 = frequency1.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 2L + "'", long71 == 2L);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) ' ');
        double double11 = frequency1.getCumPct((long) '#');
        java.lang.String str12 = frequency1.toString();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        frequency14.addValue((int) '#');
        double double20 = frequency14.getPct(' ');
        double double22 = frequency14.getCumPct((long) 0);
        double double24 = frequency14.getCumPct('4');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        frequency26.addValue((java.lang.Object) (-1L));
        double double30 = frequency26.getPct(' ');
        long long32 = frequency26.getCumFreq(' ');
        java.util.Iterator iterator33 = frequency26.valuesIterator();
        long long35 = frequency26.getCount((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        long long38 = frequency36.getCount((java.lang.Object) (byte) 100);
        long long40 = frequency36.getCumFreq('a');
        double double41 = frequency26.getCumPct((java.lang.Object) frequency36);
        long long43 = frequency36.getCount((long) '4');
        long long44 = frequency14.getCount((java.lang.Object) '4');
        long long45 = frequency14.getSumFreq();
        double double46 = frequency1.getCumPct((java.lang.Object) long45);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        long long23 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        long long31 = frequency29.getCount(' ');
        long long32 = frequency25.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        frequency34.addValue((java.lang.Object) (-1L));
        double double38 = frequency34.getPct(' ');
        frequency34.addValue((java.lang.Integer) 1);
        double double42 = frequency34.getPct((long) ' ');
        frequency25.addValue((java.lang.Object) double42);
        double double45 = frequency25.getPct((java.lang.Object) false);
        long long47 = frequency25.getCumFreq((int) (byte) -1);
        double double49 = frequency25.getCumPct((long) (short) 10);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        frequency51.addValue((java.lang.Object) (-1L));
        long long55 = frequency51.getCumFreq((-1));
        long long57 = frequency51.getCumFreq('a');
        double double59 = frequency51.getPct('a');
        double double60 = frequency25.getCumPct((java.lang.Object) double59);
        double double61 = frequency1.getCumPct((java.lang.Object) frequency25);
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        long long65 = frequency63.getCount(' ');
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        long long69 = frequency67.getCount(' ');
        long long70 = frequency63.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator71 = null;
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency(comparator71);
        double double74 = frequency72.getPct(1);
        frequency72.addValue((int) '#');
        double double77 = frequency63.getPct((java.lang.Object) frequency72);
        double double79 = frequency72.getPct((long) (byte) 100);
        long long80 = frequency72.getSumFreq();
        double double82 = frequency72.getPct(0);
        frequency72.addValue((long) (short) 1);
        double double86 = frequency72.getCumPct((long) (short) 100);
        double double87 = frequency25.getCumPct((java.lang.Object) double86);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCount(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        java.util.Iterator iterator37 = frequency32.valuesIterator();
        frequency32.clear();
        frequency32.addValue((long) 'a');
        long long41 = frequency1.getCumFreq((java.lang.Object) frequency32);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getPct(1);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount(' ');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount(' ');
        long long54 = frequency47.getCount((java.lang.Object) ' ');
        frequency47.addValue((long) 0);
        double double58 = frequency47.getCumPct((long) (short) 0);
        double double60 = frequency47.getCumPct(' ');
        double double61 = frequency43.getCumPct((java.lang.Object) double60);
        java.lang.String str62 = frequency43.toString();
        double double64 = frequency43.getPct((long) (short) 100);
        long long65 = frequency1.getCount((java.lang.Object) frequency43);
        long long67 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        long long22 = frequency1.getSumFreq();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        java.util.Iterator iterator14 = frequency11.valuesIterator();
        long long16 = frequency11.getCumFreq(100);
        double double18 = frequency11.getPct((-1L));
        long long20 = frequency11.getCumFreq((int) (short) 10);
        double double21 = frequency1.getCumPct((java.lang.Object) (short) 10);
        frequency1.addValue((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        frequency10.addValue(' ');
        java.util.Iterator iterator27 = frequency10.valuesIterator();
        double double29 = frequency10.getPct((long) (byte) 10);
        double double31 = frequency10.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct((long) (short) -1);
        long long8 = frequency1.getCumFreq('4');
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        double double60 = frequency1.getPct((long) 0);
        long long62 = frequency1.getCount(10);
        java.util.Iterator iterator63 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(iterator63);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        double double4 = frequency0.getCumPct((int) ' ');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        frequency6.addValue((java.lang.Object) (-1L));
        double double10 = frequency6.getPct(' ');
        frequency6.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator13 = frequency6.valuesIterator();
        long long14 = frequency0.getCount((java.lang.Object) frequency6);
        double double16 = frequency6.getPct(10L);
        double double18 = frequency6.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        frequency15.addValue((int) (short) 0);
        java.util.Iterator iterator48 = frequency15.valuesIterator();
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        double double52 = frequency50.getPct((int) (short) 1);
        double double54 = frequency50.getPct((long) (byte) 100);
        long long56 = frequency50.getCount((int) (short) 1);
        long long58 = frequency50.getCumFreq((long) ' ');
        frequency50.clear();
        long long60 = frequency15.getCumFreq((java.lang.Object) frequency50);
        java.lang.String str61 = frequency15.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str61, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue(10);
        long long8 = frequency1.getCumFreq('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        long long17 = frequency10.getCumFreq(1L);
        long long19 = frequency10.getCumFreq((long) '4');
        double double21 = frequency10.getPct((long) (byte) 100);
        java.lang.String str22 = frequency10.toString();
        long long23 = frequency1.getCount((java.lang.Object) frequency10);
        long long25 = frequency10.getCount((-1L));
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getPct((int) (short) 1);
        double double31 = frequency27.getPct((long) (byte) 100);
        long long33 = frequency27.getCount((int) (short) 1);
        frequency27.addValue((java.lang.Object) 1);
        frequency27.addValue((int) (short) 0);
        long long39 = frequency27.getCumFreq((long) (short) 0);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getPct((int) (short) 1);
        double double45 = frequency41.getPct((long) (byte) 100);
        java.lang.String str46 = frequency41.toString();
        double double48 = frequency41.getPct(' ');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        double double52 = frequency50.getPct((int) (short) 1);
        double double54 = frequency50.getPct((long) (byte) 100);
        java.util.Iterator iterator55 = frequency50.valuesIterator();
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        long long59 = frequency57.getCount(' ');
        java.util.Comparator comparator60 = null;
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency(comparator60);
        long long63 = frequency61.getCount(' ');
        long long64 = frequency57.getCount((java.lang.Object) ' ');
        double double66 = frequency57.getPct(' ');
        double double67 = frequency50.getPct((java.lang.Object) frequency57);
        double double68 = frequency41.getPct((java.lang.Object) double67);
        double double70 = frequency41.getPct((int) (byte) 0);
        double double71 = frequency27.getPct((java.lang.Object) frequency41);
        java.util.Comparator comparator72 = null;
        org.apache.commons.math.stat.Frequency frequency73 = new org.apache.commons.math.stat.Frequency(comparator72);
        double double75 = frequency73.getPct((int) (short) 1);
        double double77 = frequency73.getPct((long) (byte) 100);
        frequency73.addValue((java.lang.Integer) 0);
        long long80 = frequency27.getCount((java.lang.Object) 0);
        double double81 = frequency10.getCumPct((java.lang.Object) long80);
        long long83 = frequency10.getCount((long) (short) 0);
        java.lang.String str84 = frequency10.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str84, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        double double16 = frequency1.getPct((long) (byte) 100);
        double double18 = frequency1.getCumPct((long) (short) 1);
        double double20 = frequency1.getCumPct((int) '4');
        java.util.Iterator iterator21 = frequency1.valuesIterator();
        double double23 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        double double13 = frequency1.getPct((long) (-1));
        long long15 = frequency1.getCumFreq((long) 'a');
        long long17 = frequency1.getCount((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getPct(100);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getPct((int) (short) 1);
        double double26 = frequency22.getPct((long) (byte) 100);
        java.util.Iterator iterator27 = frequency22.valuesIterator();
        frequency22.clear();
        frequency22.addValue((long) 'a');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount(' ');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount(' ');
        long long39 = frequency32.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getPct(1);
        frequency41.addValue((int) '#');
        double double46 = frequency32.getPct((java.lang.Object) frequency41);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount(' ');
        long long55 = frequency48.getCount((java.lang.Object) ' ');
        long long57 = frequency48.getCumFreq('#');
        long long59 = frequency48.getCumFreq((java.lang.Object) (-1));
        long long60 = frequency41.getCumFreq((java.lang.Object) (-1));
        frequency41.addValue((java.lang.Integer) (-1));
        long long63 = frequency22.getCount((java.lang.Object) frequency41);
        long long65 = frequency41.getCumFreq('a');
        frequency18.addValue((java.lang.Object) long65);
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        long long69 = frequency67.getCount((java.lang.Object) (byte) 100);
        long long71 = frequency67.getCumFreq('a');
        frequency67.addValue((int) (short) 0);
        long long74 = frequency18.getCumFreq((java.lang.Object) (short) 0);
        java.util.Iterator iterator75 = frequency18.valuesIterator();
        double double76 = frequency1.getCumPct((java.lang.Object) iterator75);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        frequency1.addValue((int) (byte) 10);
        long long14 = frequency1.getCumFreq('#');
        double double16 = frequency1.getCumPct('4');
        double double18 = frequency1.getCumPct((long) ' ');
        double double20 = frequency1.getCumPct((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        double double31 = frequency1.getCumPct((int) 'a');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        java.util.Iterator iterator36 = frequency33.valuesIterator();
        long long38 = frequency33.getCumFreq(100);
        double double40 = frequency33.getPct((-1L));
        long long42 = frequency33.getCumFreq((int) (short) 10);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getPct((int) (short) 1);
        double double48 = frequency44.getPct((long) (byte) 100);
        long long50 = frequency44.getCount((int) (short) 1);
        frequency44.addValue((long) 'a');
        frequency33.addValue((java.lang.Object) 'a');
        double double54 = frequency1.getCumPct((java.lang.Object) 'a');
        java.util.Iterator iterator55 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(iterator55);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        long long26 = frequency17.getCumFreq('#');
        long long28 = frequency17.getCumFreq((java.lang.Object) (-1));
        long long29 = frequency10.getCumFreq((java.lang.Object) (-1));
        long long31 = frequency10.getCount((int) '4');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getPct((int) (short) 1);
        double double37 = frequency33.getPct((long) (byte) 100);
        long long39 = frequency33.getCount((int) (short) 1);
        frequency33.addValue((long) 'a');
        double double43 = frequency33.getCumPct(' ');
        long long45 = frequency33.getCumFreq((long) (short) -1);
        double double46 = frequency10.getPct((java.lang.Object) (short) -1);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        double double50 = frequency48.getPct((int) (short) 1);
        double double52 = frequency48.getPct((long) (byte) 100);
        double double54 = frequency48.getCumPct('a');
        double double56 = frequency48.getPct('4');
        java.lang.String str57 = frequency48.toString();
        long long58 = frequency48.getSumFreq();
        long long59 = frequency10.getCount((java.lang.Object) long58);
        java.lang.String str60 = frequency10.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str57, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str60, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        frequency1.addValue((int) (byte) 10);
        double double14 = frequency1.getPct((int) (byte) 0);
        frequency1.clear();
        long long17 = frequency1.getCount(3L);
        long long19 = frequency1.getCumFreq('4');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getPct((int) (short) 1);
        frequency21.addValue((int) '#');
        double double27 = frequency21.getPct(' ');
        double double29 = frequency21.getPct(1);
        double double31 = frequency21.getCumPct((int) '#');
        double double33 = frequency21.getCumPct((long) 100);
        long long34 = frequency1.getCount((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.5d + "'", double14 == 0.5d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        frequency1.addValue((long) 'a');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount(' ');
        long long18 = frequency11.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct(1);
        frequency20.addValue((int) '#');
        double double25 = frequency11.getPct((java.lang.Object) frequency20);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        long long34 = frequency27.getCount((java.lang.Object) ' ');
        long long36 = frequency27.getCumFreq('#');
        long long38 = frequency27.getCumFreq((java.lang.Object) (-1));
        long long39 = frequency20.getCumFreq((java.lang.Object) (-1));
        frequency20.addValue((java.lang.Integer) (-1));
        long long42 = frequency1.getCount((java.lang.Object) frequency20);
        frequency1.addValue((int) (byte) 0);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        frequency46.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator49 = frequency46.valuesIterator();
        long long51 = frequency46.getCumFreq('4');
        frequency46.addValue((java.lang.Integer) 100);
        long long54 = frequency1.getCount((java.lang.Object) frequency46);
        double double56 = frequency1.getPct(100L);
        java.util.Iterator iterator57 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator57);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        double double47 = frequency15.getCumPct((int) ' ');
        double double49 = frequency15.getPct(4L);
        double double51 = frequency15.getCumPct('a');
        double double53 = frequency15.getPct(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        long long15 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue(100);
        long long21 = frequency1.getCount('4');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct(1);
        frequency32.addValue((int) '#');
        double double37 = frequency23.getPct((java.lang.Object) frequency32);
        double double39 = frequency32.getPct((long) (byte) 100);
        long long41 = frequency32.getCount('4');
        java.lang.Class<?> wildcardClass42 = frequency32.getClass();
        long long43 = frequency1.getCumFreq((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency1.getCumFreq((int) (short) 10);
        long long39 = frequency1.getSumFreq();
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getPct((int) (short) 1);
        frequency41.addValue((int) '#');
        double double47 = frequency41.getPct(' ');
        double double49 = frequency41.getPct(1);
        double double51 = frequency41.getCumPct((int) '#');
        double double52 = frequency1.getCumPct((java.lang.Object) double51);
        long long53 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2L + "'", long38 == 2L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 2L + "'", long53 == 2L);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((java.lang.Object) '4');
        double double12 = frequency1.getPct((int) (byte) 0);
        long long14 = frequency1.getCumFreq(0);
        frequency1.addValue('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        double double4 = frequency0.getCumPct((int) ' ');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        frequency6.addValue((java.lang.Object) (-1L));
        double double10 = frequency6.getPct(' ');
        frequency6.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator13 = frequency6.valuesIterator();
        long long14 = frequency0.getCount((java.lang.Object) frequency6);
        double double16 = frequency0.getCumPct((long) 100);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount(' ');
        long long25 = frequency18.getCount((java.lang.Object) ' ');
        frequency18.addValue((long) 0);
        long long29 = frequency18.getCount((long) '4');
        frequency18.addValue(0L);
        long long32 = frequency0.getCount((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount(100);
        double double9 = frequency1.getCumPct((int) (short) 100);
        double double11 = frequency1.getCumPct((int) (byte) 100);
        frequency1.clear();
        double double14 = frequency1.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        double double47 = frequency15.getPct((long) 10);
        long long49 = frequency15.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        long long15 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue(100);
        double double21 = frequency1.getCumPct((long) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5d + "'", double21 == 0.5d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue((java.lang.Object) (-1L));
        double double17 = frequency13.getPct(' ');
        java.lang.Class<?> wildcardClass18 = frequency13.getClass();
        double double19 = frequency1.getCumPct((java.lang.Object) wildcardClass18);
        frequency1.addValue((int) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getPct((int) (short) 1);
        double double27 = frequency23.getPct((long) (byte) 100);
        java.util.Iterator iterator28 = frequency23.valuesIterator();
        frequency23.clear();
        frequency23.addValue((long) 'a');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount(' ');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount(' ');
        long long40 = frequency33.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getPct(1);
        frequency42.addValue((int) '#');
        double double47 = frequency33.getPct((java.lang.Object) frequency42);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCount(' ');
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        long long55 = frequency53.getCount(' ');
        long long56 = frequency49.getCount((java.lang.Object) ' ');
        long long58 = frequency49.getCumFreq('#');
        long long60 = frequency49.getCumFreq((java.lang.Object) (-1));
        long long61 = frequency42.getCumFreq((java.lang.Object) (-1));
        frequency42.addValue((java.lang.Integer) (-1));
        long long64 = frequency23.getCount((java.lang.Object) frequency42);
        double double66 = frequency23.getPct(0);
        long long68 = frequency23.getCumFreq(0);
        long long69 = frequency1.getCumFreq((java.lang.Object) frequency23);
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        frequency71.addValue((java.lang.Object) (-1L));
        double double75 = frequency71.getPct(' ');
        long long77 = frequency71.getCumFreq(' ');
        double double79 = frequency71.getPct(1);
        double double81 = frequency71.getCumPct(' ');
        frequency71.addValue((int) '#');
        double double85 = frequency71.getPct((long) '#');
        java.lang.Class<?> wildcardClass86 = frequency71.getClass();
        long long87 = frequency1.getCumFreq((java.lang.Object) wildcardClass86);
        long long89 = frequency1.getCount('a');
        frequency1.addValue((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.5d + "'", double85 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        frequency1.addValue((java.lang.Integer) 100);
        long long11 = frequency1.getCumFreq((long) (byte) 1);
        frequency1.addValue((long) '#');
        frequency1.addValue(10L);
        long long17 = frequency1.getCumFreq((long) 1);
        long long19 = frequency1.getCumFreq((int) (byte) 100);
        long long21 = frequency1.getCount(1);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getPct((int) (short) 1);
        java.util.Iterator iterator26 = frequency23.valuesIterator();
        long long28 = frequency23.getCumFreq(100);
        double double29 = frequency1.getCumPct((java.lang.Object) long28);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        frequency15.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        long long30 = frequency23.getCount((java.lang.Object) ' ');
        double double32 = frequency23.getCumPct('a');
        long long33 = frequency15.getCount((java.lang.Object) double32);
        double double35 = frequency15.getCumPct((long) (short) 1);
        double double36 = frequency1.getPct((java.lang.Object) frequency15);
        long long38 = frequency15.getCount((long) (byte) 1);
        double double40 = frequency15.getPct('#');
        double double42 = frequency15.getCumPct(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue((long) (byte) -1);
        long long8 = frequency1.getCumFreq((int) (short) -1);
        long long10 = frequency1.getCount(100L);
        long long11 = frequency1.getSumFreq();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        frequency13.clear();
        frequency13.addValue((int) 'a');
        double double23 = frequency13.getCumPct((long) (short) 0);
        double double24 = frequency1.getPct((java.lang.Object) frequency13);
        double double26 = frequency13.getPct(3L);
        java.lang.Class<?> wildcardClass27 = frequency13.getClass();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCumFreq((long) '#');
        double double11 = frequency1.getPct((long) (byte) 10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        long long20 = frequency13.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getPct(1);
        frequency22.addValue((int) '#');
        double double27 = frequency13.getPct((java.lang.Object) frequency22);
        double double29 = frequency13.getPct((int) (short) -1);
        double double31 = frequency13.getCumPct((int) ' ');
        long long33 = frequency13.getCount((-1L));
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        long long44 = frequency35.getCount((int) '4');
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getPct((int) (short) 1);
        java.util.Iterator iterator49 = frequency46.valuesIterator();
        double double51 = frequency46.getPct('4');
        long long52 = frequency35.getCount((java.lang.Object) '4');
        long long54 = frequency35.getCumFreq('#');
        long long55 = frequency13.getCumFreq((java.lang.Object) long54);
        long long56 = frequency1.getCumFreq((java.lang.Object) frequency13);
        frequency1.addValue((java.lang.Integer) 0);
        double double60 = frequency1.getPct((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCount(' ');
        double double9 = frequency1.getPct('#');
        frequency1.clear();
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        long long19 = frequency12.getCount((java.lang.Object) ' ');
        long long21 = frequency12.getCumFreq('#');
        long long23 = frequency12.getCumFreq((java.lang.Object) (-1));
        java.lang.String str24 = frequency12.toString();
        long long25 = frequency12.getSumFreq();
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getPct((int) (short) 1);
        java.util.Iterator iterator30 = frequency27.valuesIterator();
        long long32 = frequency27.getCumFreq(100);
        double double34 = frequency27.getPct((-1L));
        java.lang.Class<?> wildcardClass35 = frequency27.getClass();
        long long36 = frequency12.getCumFreq((java.lang.Object) wildcardClass35);
        frequency12.addValue((long) (byte) 1);
        long long40 = frequency12.getCumFreq((long) (short) -1);
        long long41 = frequency12.getSumFreq();
        double double42 = frequency1.getPct((java.lang.Object) long41);
        java.util.Iterator iterator43 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(iterator43);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(100);
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        double double6 = frequency4.getPct((int) (short) 1);
        double double8 = frequency4.getPct((long) (byte) 100);
        long long10 = frequency4.getCount(100);
        double double12 = frequency4.getCumPct('4');
        frequency4.addValue((int) (byte) 1);
        long long15 = frequency0.getCumFreq((java.lang.Object) frequency4);
        frequency4.clear();
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct((int) (short) 1);
        double double22 = frequency18.getPct((long) (byte) 100);
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        frequency18.clear();
        frequency18.addValue((long) 'a');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount(' ');
        long long35 = frequency28.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getPct(1);
        frequency37.addValue((int) '#');
        double double42 = frequency28.getPct((java.lang.Object) frequency37);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount(' ');
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        long long51 = frequency44.getCount((java.lang.Object) ' ');
        long long53 = frequency44.getCumFreq('#');
        long long55 = frequency44.getCumFreq((java.lang.Object) (-1));
        long long56 = frequency37.getCumFreq((java.lang.Object) (-1));
        frequency37.addValue((java.lang.Integer) (-1));
        long long59 = frequency18.getCount((java.lang.Object) frequency37);
        java.lang.Class<?> wildcardClass60 = frequency18.getClass();
        double double61 = frequency4.getCumPct((java.lang.Object) wildcardClass60);
        frequency4.addValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency4.addValue((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        double double19 = frequency10.getPct(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getPct((int) (short) 1);
        double double25 = frequency21.getPct((long) (byte) 100);
        java.util.Iterator iterator26 = frequency21.valuesIterator();
        frequency21.clear();
        frequency21.addValue((long) 'a');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getPct(1);
        frequency40.addValue((int) '#');
        double double45 = frequency31.getPct((java.lang.Object) frequency40);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount(' ');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount(' ');
        long long54 = frequency47.getCount((java.lang.Object) ' ');
        long long56 = frequency47.getCumFreq('#');
        long long58 = frequency47.getCumFreq((java.lang.Object) (-1));
        long long59 = frequency40.getCumFreq((java.lang.Object) (-1));
        frequency40.addValue((java.lang.Integer) (-1));
        long long62 = frequency21.getCount((java.lang.Object) frequency40);
        long long63 = frequency10.getCumFreq((java.lang.Object) frequency21);
        long long65 = frequency21.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq((long) (byte) -1);
        java.lang.String str11 = frequency1.toString();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        frequency13.addValue((java.lang.Object) ' ');
        double double21 = frequency13.getCumPct((long) (short) 1);
        long long23 = frequency13.getCount('a');
        long long24 = frequency1.getCount((java.lang.Object) frequency13);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        long long16 = frequency5.getCumFreq('4');
        long long18 = frequency5.getCount((int) (short) 1);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        double double26 = frequency20.getCumPct('a');
        long long27 = frequency20.getSumFreq();
        long long29 = frequency20.getCount((java.lang.Object) '4');
        double double31 = frequency20.getPct(' ');
        double double32 = frequency5.getPct((java.lang.Object) frequency20);
        frequency20.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) ' ');
        long long11 = frequency1.getCount(0L);
        long long13 = frequency1.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCount('a');
        frequency1.clear();
        double double9 = frequency1.getPct(0);
        java.lang.Class<?> wildcardClass10 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        double double5 = frequency1.getPct('4');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq((-1L));
        long long10 = frequency6.getCumFreq(10L);
        long long12 = frequency6.getCount('a');
        java.lang.String str13 = frequency6.toString();
        long long15 = frequency6.getCount((long) (-1));
        long long17 = frequency6.getCumFreq((int) (short) 100);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        java.lang.String str24 = frequency19.toString();
        double double26 = frequency19.getPct(' ');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getPct((int) (short) 1);
        double double32 = frequency28.getPct((long) (byte) 100);
        java.util.Iterator iterator33 = frequency28.valuesIterator();
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        double double44 = frequency35.getPct(' ');
        double double45 = frequency28.getPct((java.lang.Object) frequency35);
        double double46 = frequency19.getPct((java.lang.Object) double45);
        java.lang.String str47 = frequency19.toString();
        double double49 = frequency19.getCumPct((int) 'a');
        double double50 = frequency6.getPct((java.lang.Object) 'a');
        long long52 = frequency6.getCount('4');
        long long53 = frequency1.getCumFreq((java.lang.Object) frequency6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCount(' ');
        long long9 = frequency1.getCount((long) 0);
        long long11 = frequency1.getCumFreq('4');
        java.lang.String str12 = frequency1.toString();
        frequency1.addValue((-1L));
        long long16 = frequency1.getCount((int) (byte) 0);
        long long18 = frequency1.getCumFreq((int) (byte) 0);
        double double20 = frequency1.getCumPct((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getCumPct(10);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        double double23 = frequency19.getPct((long) (byte) 100);
        frequency19.addValue((java.lang.Integer) 0);
        long long27 = frequency19.getCount('a');
        long long28 = frequency10.getCount((java.lang.Object) long27);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        frequency30.addValue((java.lang.Object) (-1L));
        long long34 = frequency30.getCumFreq((-1));
        long long36 = frequency30.getCumFreq('a');
        double double38 = frequency30.getPct('a');
        double double40 = frequency30.getCumPct(2L);
        double double41 = frequency10.getPct((java.lang.Object) frequency30);
        long long43 = frequency10.getCount(0L);
        frequency10.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        double double19 = frequency13.getCumPct('a');
        long long20 = frequency13.getSumFreq();
        long long22 = frequency13.getCount((java.lang.Object) '4');
        double double24 = frequency13.getPct((int) (byte) 0);
        long long25 = frequency1.getCount((java.lang.Object) frequency13);
        long long27 = frequency1.getCount('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        frequency1.addValue(100);
        long long7 = frequency1.getCount(0);
        double double9 = frequency1.getCumPct((int) (short) 10);
        double double11 = frequency1.getPct((int) (byte) -1);
        long long13 = frequency1.getCount('4');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getPct((int) (short) 1);
        double double50 = frequency46.getPct((long) (byte) 100);
        long long52 = frequency46.getCount((int) (short) 1);
        long long54 = frequency46.getCumFreq((long) ' ');
        long long56 = frequency46.getCumFreq(10);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        frequency58.addValue((java.lang.Object) (-1L));
        double double62 = frequency58.getPct(' ');
        java.lang.Class<?> wildcardClass63 = frequency58.getClass();
        double double64 = frequency46.getCumPct((java.lang.Object) wildcardClass63);
        long long65 = frequency15.getCumFreq((java.lang.Object) frequency46);
        frequency46.addValue((java.lang.Object) 0.0d);
        long long69 = frequency46.getCumFreq('4');
        long long70 = frequency1.getCount((java.lang.Object) long69);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency1.getPct((int) (short) -1);
        double double19 = frequency1.getCumPct((int) ' ');
        long long21 = frequency1.getCount((-1L));
        long long23 = frequency1.getCount((int) (byte) -1);
        long long25 = frequency1.getCount(3L);
        frequency1.addValue((-1L));
        long long29 = frequency1.getCumFreq((java.lang.Object) (byte) -1);
        long long31 = frequency1.getCumFreq(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        frequency1.clear();
        long long6 = frequency1.getCount((long) (byte) 0);
        double double8 = frequency1.getCumPct((int) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        long long7 = frequency1.getCumFreq(' ');
        frequency1.addValue(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount((long) (byte) 1);
        double double12 = frequency1.getCumPct((long) (short) 100);
        long long14 = frequency1.getCount((long) (byte) 100);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCount('a');
        java.lang.String str22 = frequency16.toString();
        long long24 = frequency16.getCumFreq((int) '4');
        long long25 = frequency16.getSumFreq();
        double double27 = frequency16.getCumPct(' ');
        long long29 = frequency16.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getPct(1);
        frequency40.addValue((int) '#');
        double double45 = frequency31.getPct((java.lang.Object) frequency40);
        double double47 = frequency40.getCumPct(10);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        double double51 = frequency49.getPct((int) (short) 1);
        double double53 = frequency49.getPct((long) (byte) 100);
        frequency49.addValue((java.lang.Integer) 0);
        long long57 = frequency49.getCount('a');
        long long58 = frequency40.getCount((java.lang.Object) long57);
        java.util.Comparator comparator59 = null;
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency(comparator59);
        frequency60.addValue((java.lang.Object) (-1L));
        long long64 = frequency60.getCumFreq((-1));
        long long66 = frequency60.getCumFreq('a');
        double double68 = frequency60.getPct('a');
        double double70 = frequency60.getCumPct(2L);
        double double71 = frequency40.getPct((java.lang.Object) frequency60);
        double double73 = frequency40.getPct((long) (byte) 1);
        frequency40.clear();
        long long75 = frequency16.getCount((java.lang.Object) frequency40);
        frequency1.addValue((java.lang.Object) long75);
        double double78 = frequency1.getCumPct((int) (byte) 1);
        frequency1.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        long long5 = frequency1.getCumFreq((-1));
        long long7 = frequency1.getCumFreq('a');
        double double9 = frequency1.getPct('a');
        double double11 = frequency1.getCumPct(2L);
        java.lang.String str12 = frequency1.toString();
        frequency1.addValue(1L);
        java.lang.String str15 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        double double5 = frequency1.getPct('4');
        long long7 = frequency1.getCount((java.lang.Object) 10.0f);
        double double9 = frequency1.getCumPct(' ');
        double double11 = frequency1.getPct((-1L));
        double double13 = frequency1.getCumPct((long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        frequency1.clear();
        long long12 = frequency1.getCount((long) (short) 10);
        double double14 = frequency1.getCumPct('a');
        long long16 = frequency1.getCount('4');
        long long18 = frequency1.getCount((long) '4');
        double double20 = frequency1.getCumPct(10);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        frequency1.addValue((java.lang.Integer) 100);
        double double11 = frequency1.getPct((long) (short) 100);
        frequency1.clear();
        double double14 = frequency1.getPct('4');
        long long16 = frequency1.getCumFreq((long) (byte) -1);
        java.lang.Object obj17 = null;
        long long18 = frequency1.getCumFreq(obj17);
        long long20 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount(' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount(' ');
        long long29 = frequency22.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct(1);
        frequency31.addValue((int) '#');
        double double36 = frequency22.getPct((java.lang.Object) frequency31);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount(' ');
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        long long44 = frequency42.getCount(' ');
        long long45 = frequency38.getCount((java.lang.Object) ' ');
        long long47 = frequency38.getCumFreq('#');
        long long49 = frequency38.getCumFreq((java.lang.Object) (-1));
        long long50 = frequency31.getCumFreq((java.lang.Object) (-1));
        long long51 = frequency31.getSumFreq();
        long long52 = frequency1.getCumFreq((java.lang.Object) frequency31);
        double double54 = frequency1.getPct((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        long long12 = frequency1.getCount((long) '4');
        frequency1.addValue(0L);
        long long16 = frequency1.getCount((int) (short) 10);
        double double18 = frequency1.getCumPct('a');
        long long20 = frequency1.getCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long12 = frequency1.getSumFreq();
        frequency1.addValue((long) 'a');
        long long16 = frequency1.getCount('#');
        double double18 = frequency1.getPct(' ');
        frequency1.addValue((int) ' ');
        java.lang.Class<?> wildcardClass21 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        double double6 = frequency1.getPct('4');
        frequency1.addValue(1);
        frequency1.addValue((int) (byte) 0);
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getPct((int) (short) 1);
        double double16 = frequency12.getPct((long) (byte) 100);
        java.util.Iterator iterator17 = frequency12.valuesIterator();
        long long19 = frequency12.getCumFreq(1L);
        long long20 = frequency1.getCount((java.lang.Object) 1L);
        long long22 = frequency1.getCount((int) (byte) 100);
        long long24 = frequency1.getCumFreq((int) '#');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        frequency26.addValue((java.lang.Object) (-1L));
        long long30 = frequency26.getCumFreq((-1));
        long long32 = frequency26.getCumFreq('a');
        double double34 = frequency26.getPct('a');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getPct((int) (short) 1);
        double double40 = frequency36.getPct((long) (byte) 100);
        long long42 = frequency36.getCount((int) (short) 1);
        long long44 = frequency36.getCumFreq((long) ' ');
        double double45 = frequency26.getCumPct((java.lang.Object) long44);
        long long47 = frequency26.getCumFreq((long) (short) -1);
        double double49 = frequency26.getCumPct('4');
        long long50 = frequency1.getCount((java.lang.Object) double49);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long3 = frequency0.getSumFreq();
        double double5 = frequency0.getPct((long) (byte) 1);
        java.util.Iterator iterator6 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getPct(1L);
        long long13 = frequency1.getCount((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) ' ');
        long long11 = frequency1.getCount(0L);
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        frequency1.addValue('#');
        long long16 = frequency1.getCumFreq('a');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct((int) (short) 1);
        double double22 = frequency18.getPct((long) (byte) 100);
        long long24 = frequency18.getCount((int) (short) 1);
        long long26 = frequency18.getCumFreq((long) ' ');
        frequency18.clear();
        double double29 = frequency18.getPct((long) 100);
        java.util.Iterator iterator30 = frequency18.valuesIterator();
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency18);
        long long33 = frequency18.getCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        double double5 = frequency1.getPct('4');
        frequency1.clear();
        long long8 = frequency1.getCumFreq('a');
        long long10 = frequency1.getCount((int) (short) 100);
        double double12 = frequency1.getPct(10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct('#');
        double double23 = frequency1.getCumPct((int) (byte) 0);
        long long25 = frequency1.getCumFreq((long) 10);
        long long26 = frequency1.getSumFreq();
        long long28 = frequency1.getCumFreq((int) (byte) 10);
        frequency1.addValue(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        long long10 = frequency1.getCumFreq('a');
        long long11 = frequency1.getSumFreq();
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        long long14 = frequency1.getCumFreq((long) (short) -1);
        double double16 = frequency1.getCumPct((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long12 = frequency1.getSumFreq();
        frequency1.addValue((long) 'a');
        long long16 = frequency1.getCount('#');
        double double18 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 1);
        double double24 = frequency1.getPct(1);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getPct((int) (short) 1);
        frequency26.addValue((int) '#');
        double double32 = frequency26.getPct(' ');
        long long34 = frequency26.getCount((long) 0);
        long long36 = frequency26.getCumFreq('#');
        java.util.Iterator iterator37 = frequency26.valuesIterator();
        long long38 = frequency1.getCumFreq((java.lang.Object) iterator37);
        double double40 = frequency1.getCumPct((int) (short) 1);
        frequency1.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.25d + "'", double24 == 0.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.5d + "'", double40 == 0.5d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        frequency15.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator18 = frequency15.valuesIterator();
        double double19 = frequency1.getPct((java.lang.Object) frequency15);
        long long21 = frequency15.getCumFreq((int) (short) 0);
        long long23 = frequency15.getCumFreq(0);
        long long25 = frequency15.getCount((long) 0);
        double double27 = frequency15.getCumPct((long) (short) 0);
        double double29 = frequency15.getCumPct((long) (byte) -1);
        long long30 = frequency15.getSumFreq();
        double double32 = frequency15.getPct((-1));
        long long34 = frequency15.getCount((long) 0);
        frequency15.addValue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long12 = frequency1.getSumFreq();
        frequency1.addValue((long) 'a');
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(100);
        long long4 = frequency0.getCount('#');
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        long long8 = frequency6.getCount(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount(' ');
        long long13 = frequency6.getCount((java.lang.Object) ' ');
        long long15 = frequency6.getCumFreq('#');
        long long17 = frequency6.getCumFreq((java.lang.Object) (-1));
        java.lang.String str18 = frequency6.toString();
        long long19 = frequency6.getSumFreq();
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getPct((int) (short) 1);
        java.util.Iterator iterator24 = frequency21.valuesIterator();
        long long26 = frequency21.getCumFreq(100);
        double double28 = frequency21.getPct((-1L));
        java.lang.Class<?> wildcardClass29 = frequency21.getClass();
        long long30 = frequency6.getCumFreq((java.lang.Object) wildcardClass29);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount(' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount(' ');
        long long43 = frequency36.getCount((java.lang.Object) ' ');
        frequency36.clear();
        long long45 = frequency32.getCumFreq((java.lang.Object) frequency36);
        long long47 = frequency36.getCumFreq('4');
        long long49 = frequency36.getCount((int) (short) 1);
        double double50 = frequency6.getPct((java.lang.Object) frequency36);
        long long52 = frequency36.getCount((-1L));
        double double53 = frequency0.getPct((java.lang.Object) (-1L));
        java.lang.String str54 = frequency0.toString();
        java.util.Comparator comparator55 = null;
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency(comparator55);
        double double58 = frequency56.getCumPct((java.lang.Object) 0);
        frequency56.addValue(100);
        long long62 = frequency56.getCount(0);
        double double63 = frequency0.getPct((java.lang.Object) long62);
        java.util.Comparator comparator64 = null;
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency(comparator64);
        double double67 = frequency65.getPct((int) (short) 1);
        double double69 = frequency65.getPct((long) (byte) 100);
        long long71 = frequency65.getCount((int) (short) 1);
        frequency65.addValue((java.lang.Object) 1);
        frequency65.addValue((int) (short) 0);
        long long76 = frequency65.getSumFreq();
        long long78 = frequency65.getCumFreq((long) '4');
        long long80 = frequency65.getCount('a');
        long long81 = frequency0.getCumFreq((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str54, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 2L + "'", long76 == 2L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 2L + "'", long78 == 2L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCumFreq(100);
        double double23 = frequency16.getPct((-1L));
        java.lang.Class<?> wildcardClass24 = frequency16.getClass();
        long long25 = frequency1.getCumFreq((java.lang.Object) wildcardClass24);
        double double27 = frequency1.getCumPct((int) (byte) 10);
        double double29 = frequency1.getPct(100L);
        frequency1.clear();
        frequency1.clear();
        long long33 = frequency1.getCumFreq((int) (byte) 100);
        long long35 = frequency1.getCount((long) (byte) -1);
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount(' ');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount(' ');
        long long44 = frequency37.getCount((java.lang.Object) ' ');
        long long46 = frequency37.getCumFreq('#');
        long long48 = frequency37.getCumFreq((java.lang.Object) (-1));
        java.lang.String str49 = frequency37.toString();
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        frequency51.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator54 = frequency51.valuesIterator();
        double double55 = frequency37.getPct((java.lang.Object) frequency51);
        frequency37.addValue((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass58 = frequency37.getClass();
        long long59 = frequency1.getCumFreq((java.lang.Object) wildcardClass58);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue((int) (short) 0);
        java.util.Iterator iterator7 = frequency0.valuesIterator();
        double double9 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        frequency1.addValue((long) 'a');
        frequency1.addValue((long) (byte) 100);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        long long19 = frequency13.getCount((int) (short) 1);
        frequency13.addValue((java.lang.Object) 1);
        frequency13.addValue((int) (short) 0);
        long long25 = frequency13.getCumFreq(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getPct((int) (short) 1);
        double double31 = frequency27.getPct((long) (byte) 100);
        frequency27.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        double double44 = frequency35.getCumPct('a');
        long long45 = frequency27.getCount((java.lang.Object) double44);
        double double47 = frequency27.getCumPct((long) (short) 1);
        double double48 = frequency13.getPct((java.lang.Object) frequency27);
        long long50 = frequency13.getCount((long) (short) 100);
        java.lang.String str51 = frequency13.toString();
        long long52 = frequency1.getCumFreq((java.lang.Object) str51);
        java.lang.String str53 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t50%\t50%\n100\t1\t50%\t100%\n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t50%\t50%\n100\t1\t50%\t100%\n");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        long long16 = frequency1.getCount(100);
        double double18 = frequency1.getPct((int) (byte) -1);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        long long22 = frequency20.getCount(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount(' ');
        long long27 = frequency20.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getPct(1);
        frequency29.addValue((int) '#');
        double double34 = frequency20.getPct((java.lang.Object) frequency29);
        double double36 = frequency29.getCumPct(10);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        double double42 = frequency38.getPct((long) (byte) 100);
        frequency38.addValue((java.lang.Integer) 0);
        long long46 = frequency38.getCount('a');
        long long47 = frequency29.getCount((java.lang.Object) long46);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        frequency49.addValue((java.lang.Object) (-1L));
        long long53 = frequency49.getCumFreq((-1));
        long long55 = frequency49.getCumFreq('a');
        double double57 = frequency49.getPct('a');
        double double59 = frequency49.getCumPct(2L);
        double double60 = frequency29.getPct((java.lang.Object) frequency49);
        java.lang.Class<?> wildcardClass61 = frequency49.getClass();
        double double62 = frequency1.getPct((java.lang.Object) wildcardClass61);
        java.util.Comparator comparator63 = null;
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency(comparator63);
        double double66 = frequency64.getPct((int) (short) 1);
        double double68 = frequency64.getPct((long) (byte) 100);
        double double70 = frequency64.getCumPct('a');
        long long71 = frequency64.getSumFreq();
        java.util.Comparator comparator72 = null;
        org.apache.commons.math.stat.Frequency frequency73 = new org.apache.commons.math.stat.Frequency(comparator72);
        double double75 = frequency73.getPct((int) (short) 1);
        java.util.Iterator iterator76 = frequency73.valuesIterator();
        double double78 = frequency73.getPct('4');
        java.util.Comparator comparator79 = null;
        org.apache.commons.math.stat.Frequency frequency80 = new org.apache.commons.math.stat.Frequency(comparator79);
        frequency80.addValue('#');
        long long84 = frequency80.getCount(' ');
        java.lang.Class<?> wildcardClass85 = frequency80.getClass();
        double double86 = frequency73.getPct((java.lang.Object) wildcardClass85);
        long long87 = frequency64.getCumFreq((java.lang.Object) frequency73);
        long long88 = frequency64.getSumFreq();
        java.util.Iterator iterator89 = frequency64.valuesIterator();
        long long91 = frequency64.getCumFreq((int) '#');
        java.util.Iterator iterator92 = frequency64.valuesIterator();
        long long93 = frequency1.getCount((java.lang.Object) frequency64);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('a');
        long long10 = frequency1.getCumFreq(' ');
        double double12 = frequency1.getCumPct(1);
        long long14 = frequency1.getCount(4L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        long long18 = frequency10.getSumFreq();
        frequency10.addValue((java.lang.Integer) 10);
        double double22 = frequency10.getCumPct('4');
        double double24 = frequency10.getPct('4');
        long long26 = frequency10.getCount('a');
        long long28 = frequency10.getCumFreq((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        double double5 = frequency1.getPct('4');
        frequency1.clear();
        long long8 = frequency1.getCumFreq('a');
        long long9 = frequency1.getSumFreq();
        double double11 = frequency1.getPct('4');
        frequency1.addValue((java.lang.Integer) (-1));
        double double15 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.clear();
        long long14 = frequency1.getCumFreq((java.lang.Object) frequency5);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        double double20 = frequency16.getPct('4');
        frequency16.clear();
        double double22 = frequency1.getCumPct((java.lang.Object) frequency16);
        double double24 = frequency16.getPct((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((long) '4');
        long long14 = frequency1.getCumFreq((int) '4');
        java.util.Iterator iterator15 = frequency1.valuesIterator();
        long long17 = frequency1.getCumFreq((int) (short) -1);
        long long19 = frequency1.getCount((int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) (short) 1);
        long long11 = frequency1.getCount('a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        long long20 = frequency13.getCount((java.lang.Object) ' ');
        double double22 = frequency13.getPct(' ');
        double double24 = frequency13.getCumPct('a');
        long long26 = frequency13.getCumFreq(2L);
        frequency13.addValue((long) (short) 1);
        double double29 = frequency1.getCumPct((java.lang.Object) frequency13);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        frequency0.addValue(100L);
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        long long7 = frequency0.getCount((long) (short) 100);
        long long9 = frequency0.getCount((-1L));
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        frequency11.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCount(' ');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount(' ');
        long long26 = frequency19.getCount((java.lang.Object) ' ');
        double double28 = frequency19.getCumPct('a');
        long long29 = frequency11.getCount((java.lang.Object) double28);
        double double31 = frequency11.getCumPct('#');
        long long33 = frequency11.getCumFreq((long) (short) 0);
        double double35 = frequency11.getCumPct((long) (byte) 1);
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        frequency37.addValue('#');
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0f);
        long long43 = frequency37.getCumFreq('a');
        long long44 = frequency37.getSumFreq();
        java.util.Iterator iterator45 = frequency37.valuesIterator();
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct(1);
        frequency47.addValue((int) '#');
        java.lang.String str52 = frequency47.toString();
        long long53 = frequency37.getCumFreq((java.lang.Object) frequency47);
        double double54 = frequency11.getPct((java.lang.Object) frequency47);
        long long55 = frequency0.getCount((java.lang.Object) double54);
        long long57 = frequency0.getCumFreq(1);
        long long59 = frequency0.getCumFreq(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        frequency4.addValue((java.lang.Object) (-1L));
        java.util.Iterator iterator7 = frequency4.valuesIterator();
        frequency4.addValue((long) (byte) -1);
        long long11 = frequency4.getCumFreq((int) (short) -1);
        long long13 = frequency4.getCount(100L);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        long long24 = frequency15.getCumFreq('a');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getPct((int) (short) 1);
        double double30 = frequency26.getPct((long) (byte) 100);
        long long32 = frequency26.getCount((int) (short) 1);
        frequency26.addValue((java.lang.Object) 1);
        frequency26.addValue((int) (short) 0);
        long long38 = frequency26.getCumFreq(' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getPct((int) (short) 1);
        double double44 = frequency40.getPct((long) (byte) 100);
        frequency40.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount(' ');
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount(' ');
        long long55 = frequency48.getCount((java.lang.Object) ' ');
        double double57 = frequency48.getCumPct('a');
        long long58 = frequency40.getCount((java.lang.Object) double57);
        double double60 = frequency40.getCumPct((long) (short) 1);
        double double61 = frequency26.getPct((java.lang.Object) frequency40);
        long long63 = frequency26.getCount((long) (short) 100);
        java.lang.String str64 = frequency26.toString();
        long long66 = frequency26.getCumFreq((long) (short) 10);
        long long67 = frequency15.getCumFreq((java.lang.Object) frequency26);
        double double68 = frequency4.getPct((java.lang.Object) frequency15);
        double double69 = frequency0.getCumPct((java.lang.Object) frequency15);
        frequency15.clear();
        java.lang.Class<?> wildcardClass71 = frequency15.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str64, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 2L + "'", long66 == 2L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        java.lang.String str2 = frequency1.toString();
        frequency1.addValue((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str2, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        long long5 = frequency1.getCumFreq((-1));
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getPct((int) (short) 1);
        java.util.Iterator iterator10 = frequency7.valuesIterator();
        double double12 = frequency7.getPct('4');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        frequency14.addValue('#');
        long long18 = frequency14.getCount(' ');
        java.lang.Class<?> wildcardClass19 = frequency14.getClass();
        double double20 = frequency7.getPct((java.lang.Object) wildcardClass19);
        double double21 = frequency1.getCumPct((java.lang.Object) frequency7);
        double double23 = frequency7.getCumPct('a');
        frequency7.addValue((int) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct('a');
        frequency1.clear();
        long long10 = frequency1.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        double double30 = frequency1.getPct((int) (byte) 0);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        long long38 = frequency32.getCount((int) (short) 1);
        long long40 = frequency32.getCumFreq((long) ' ');
        long long42 = frequency32.getCumFreq(10);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        frequency44.addValue((java.lang.Object) (-1L));
        double double48 = frequency44.getPct(' ');
        java.lang.Class<?> wildcardClass49 = frequency44.getClass();
        double double50 = frequency32.getCumPct((java.lang.Object) wildcardClass49);
        long long51 = frequency1.getCumFreq((java.lang.Object) frequency32);
        frequency32.addValue((java.lang.Object) 0.0d);
        long long54 = frequency32.getSumFreq();
        long long56 = frequency32.getCumFreq((int) (short) 10);
        double double58 = frequency32.getPct((long) (-1));
        long long59 = frequency32.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((long) (-1));
        frequency1.addValue((java.lang.Integer) 0);
        double double7 = frequency1.getCumPct(1);
        frequency1.addValue((long) 1);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        double double7 = frequency5.getPct((int) (short) 1);
        double double9 = frequency5.getPct((long) (byte) 100);
        long long11 = frequency5.getCount(100);
        double double12 = frequency1.getCumPct((java.lang.Object) frequency5);
        long long14 = frequency1.getCount(2L);
        long long16 = frequency1.getCount((long) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCumFreq(100);
        double double23 = frequency16.getPct((-1L));
        java.lang.Class<?> wildcardClass24 = frequency16.getClass();
        long long25 = frequency1.getCumFreq((java.lang.Object) wildcardClass24);
        double double27 = frequency1.getCumPct((int) (byte) 10);
        long long29 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct((int) (short) 1);
        double double35 = frequency31.getPct((long) (byte) 100);
        frequency31.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        long long45 = frequency43.getCount(' ');
        long long46 = frequency39.getCount((java.lang.Object) ' ');
        double double48 = frequency39.getCumPct('a');
        long long49 = frequency31.getCount((java.lang.Object) double48);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        frequency51.addValue('#');
        long long55 = frequency51.getCumFreq((java.lang.Object) 1.0f);
        long long57 = frequency51.getCumFreq('a');
        long long58 = frequency51.getSumFreq();
        double double59 = frequency31.getCumPct((java.lang.Object) frequency51);
        long long61 = frequency31.getCumFreq((int) (byte) 0);
        long long63 = frequency31.getCount((int) '4');
        frequency1.addValue((java.lang.Object) long63);
        java.util.Comparator comparator65 = null;
        org.apache.commons.math.stat.Frequency frequency66 = new org.apache.commons.math.stat.Frequency(comparator65);
        double double68 = frequency66.getPct((int) (short) 1);
        double double70 = frequency66.getPct((long) (byte) 100);
        double double72 = frequency66.getCumPct('a');
        double double74 = frequency66.getPct('4');
        java.lang.String str75 = frequency66.toString();
        double double76 = frequency1.getCumPct((java.lang.Object) frequency66);
        long long78 = frequency66.getCumFreq((int) (byte) 10);
        frequency66.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str75, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue('#');
        double double17 = frequency13.getPct((java.lang.Object) 1);
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        frequency20.addValue((java.lang.Object) ' ');
        double double28 = frequency20.getCumPct((long) ' ');
        long long30 = frequency20.getCount(0L);
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        double double32 = frequency1.getPct((java.lang.Object) frequency20);
        double double34 = frequency1.getCumPct(100);
        double double36 = frequency1.getPct((long) '#');
        double double38 = frequency1.getPct((int) ' ');
        double double40 = frequency1.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('4');
        long long12 = frequency1.getCumFreq((long) (short) 0);
        long long13 = frequency1.getSumFreq();
        frequency1.addValue((long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        long long5 = frequency1.getCumFreq((int) (byte) 0);
        double double7 = frequency1.getCumPct((long) 10);
        double double9 = frequency1.getPct((int) (short) 100);
        long long11 = frequency1.getCount(1L);
        double double13 = frequency1.getCumPct((int) (short) 0);
        double double15 = frequency1.getCumPct('a');
        long long17 = frequency1.getCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct(' ');
        frequency1.addValue((int) '#');
        double double15 = frequency1.getPct((long) '#');
        double double17 = frequency1.getPct('a');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((int) (short) 1);
        java.util.Iterator iterator22 = frequency19.valuesIterator();
        double double24 = frequency19.getPct('4');
        frequency19.addValue(1);
        long long28 = frequency19.getCount((long) 'a');
        double double29 = frequency1.getPct((java.lang.Object) frequency19);
        long long31 = frequency1.getCumFreq((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        frequency1.addValue((long) 0);
        frequency1.addValue((int) (byte) 10);
        long long14 = frequency1.getCumFreq('#');
        double double16 = frequency1.getCumPct(100L);
        double double18 = frequency1.getCumPct(0L);
        long long20 = frequency1.getCount('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount((long) (byte) 1);
        double double12 = frequency1.getCumPct((long) (short) 100);
        long long14 = frequency1.getCount((long) (byte) 100);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        frequency16.addValue((java.lang.Object) (-1L));
        long long19 = frequency1.getCumFreq((java.lang.Object) (-1L));
        long long21 = frequency1.getCumFreq((long) (byte) 10);
        long long23 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getPct((int) (short) 1);
        double double32 = frequency28.getPct((long) (byte) 100);
        frequency28.addValue((java.lang.Integer) 0);
        double double35 = frequency1.getCumPct((java.lang.Object) frequency28);
        java.lang.String str36 = frequency1.toString();
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        double double42 = frequency38.getPct((long) (byte) 100);
        frequency38.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCount(' ');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        long long53 = frequency46.getCount((java.lang.Object) ' ');
        double double55 = frequency46.getCumPct('a');
        long long56 = frequency38.getCount((java.lang.Object) double55);
        double double58 = frequency38.getCumPct('#');
        double double60 = frequency38.getCumPct((int) (byte) 0);
        long long62 = frequency38.getCumFreq((long) 10);
        long long63 = frequency38.getSumFreq();
        long long65 = frequency38.getCumFreq((int) (byte) 10);
        long long66 = frequency1.getCount((java.lang.Object) frequency38);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        long long23 = frequency1.getCount((long) (byte) 100);
        long long25 = frequency1.getCount((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        long long5 = frequency1.getCumFreq((int) '4');
        double double7 = frequency1.getCumPct((int) (short) -1);
        double double9 = frequency1.getCumPct((int) ' ');
        frequency1.addValue('4');
        double double13 = frequency1.getCumPct((int) 'a');
        double double15 = frequency1.getPct(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long12 = frequency1.getSumFreq();
        frequency1.addValue((long) 'a');
        long long16 = frequency1.getCount('#');
        double double18 = frequency1.getPct(' ');
        long long20 = frequency1.getCount((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        double double15 = frequency10.getPct('4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        frequency17.addValue('#');
        long long21 = frequency17.getCount(' ');
        java.lang.Class<?> wildcardClass22 = frequency17.getClass();
        double double23 = frequency10.getPct((java.lang.Object) wildcardClass22);
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        long long25 = frequency10.getSumFreq();
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getPct((int) (short) 1);
        double double31 = frequency27.getPct((long) (byte) 100);
        frequency27.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        double double44 = frequency35.getCumPct('a');
        long long45 = frequency27.getCount((java.lang.Object) double44);
        double double47 = frequency27.getCumPct('#');
        double double49 = frequency27.getCumPct((int) (byte) 0);
        double double50 = frequency10.getCumPct((java.lang.Object) double49);
        long long52 = frequency10.getCount('a');
        java.lang.String str53 = frequency10.toString();
        long long54 = frequency10.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        long long5 = frequency1.getCumFreq((-1));
        long long7 = frequency1.getCumFreq('a');
        double double9 = frequency1.getPct('a');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        double double15 = frequency11.getPct((long) (byte) 100);
        long long17 = frequency11.getCount((int) (short) 1);
        long long19 = frequency11.getCumFreq((long) ' ');
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        long long22 = frequency1.getCumFreq((long) (short) -1);
        double double24 = frequency1.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct(' ');
        long long13 = frequency1.getCount('#');
        double double15 = frequency1.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq((long) (byte) -1);
        long long12 = frequency1.getCumFreq('#');
        double double14 = frequency1.getCumPct('#');
        long long16 = frequency1.getCumFreq((long) 100);
        frequency1.addValue((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct(' ');
        frequency1.addValue((int) '#');
        frequency1.addValue((java.lang.Integer) 0);
        long long17 = frequency1.getCount((int) (short) -1);
        long long18 = frequency1.getSumFreq();
        frequency1.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        double double9 = frequency1.getCumPct((int) ' ');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        frequency11.addValue((java.lang.Object) (-1L));
        double double15 = frequency11.getPct(' ');
        long long17 = frequency11.getCumFreq(' ');
        double double19 = frequency11.getPct(1);
        double double21 = frequency11.getCumPct(' ');
        frequency11.addValue((int) '#');
        double double25 = frequency11.getPct((long) '#');
        java.lang.Class<?> wildcardClass26 = frequency11.getClass();
        long long27 = frequency1.getCount((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        frequency11.addValue('#');
        long long15 = frequency11.getCount(' ');
        long long17 = frequency11.getCumFreq((int) '4');
        double double18 = frequency1.getCumPct((java.lang.Object) long17);
        frequency1.addValue((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getPct(100);
        double double25 = frequency21.getPct(3L);
        long long27 = frequency21.getCount((long) '4');
        java.util.Iterator iterator28 = frequency21.valuesIterator();
        long long29 = frequency1.getCumFreq((java.lang.Object) frequency21);
        long long30 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct(1);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        long long12 = frequency5.getCount((java.lang.Object) ' ');
        frequency5.addValue((long) 0);
        double double16 = frequency5.getCumPct((long) (short) 0);
        double double18 = frequency5.getCumPct(' ');
        double double19 = frequency1.getCumPct((java.lang.Object) double18);
        long long21 = frequency1.getCount(10L);
        frequency1.addValue('#');
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = frequency1.getCount(obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        double double5 = frequency1.getPct('4');
        long long7 = frequency1.getCumFreq(1);
        double double9 = frequency1.getCumPct((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct(' ');
        frequency1.addValue((int) '#');
        double double15 = frequency1.getCumPct(0);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        long long28 = frequency21.getCount((java.lang.Object) ' ');
        frequency21.clear();
        long long30 = frequency17.getCumFreq((java.lang.Object) frequency21);
        long long32 = frequency21.getCumFreq('4');
        long long34 = frequency21.getCount((int) (short) 1);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getPct((int) (short) 1);
        double double40 = frequency36.getPct((long) (byte) 100);
        double double42 = frequency36.getCumPct('a');
        long long43 = frequency36.getSumFreq();
        long long45 = frequency36.getCount((java.lang.Object) '4');
        double double47 = frequency36.getPct(' ');
        double double48 = frequency21.getPct((java.lang.Object) frequency36);
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        long long56 = frequency54.getCount(' ');
        long long57 = frequency50.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator58 = null;
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency(comparator58);
        double double61 = frequency59.getPct(1);
        frequency59.addValue((int) '#');
        double double64 = frequency50.getPct((java.lang.Object) frequency59);
        frequency36.addValue((java.lang.Object) double64);
        java.util.Iterator iterator66 = frequency36.valuesIterator();
        double double67 = frequency1.getPct((java.lang.Object) frequency36);
        long long68 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 2L + "'", long68 == 2L);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCumFreq(100);
        long long8 = frequency1.getCount((java.lang.Object) (-1L));
        long long10 = frequency1.getCount(10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency1.getPct((int) (short) -1);
        double double19 = frequency1.getCumPct((int) ' ');
        long long21 = frequency1.getCount((-1L));
        long long23 = frequency1.getCount((int) (byte) -1);
        long long25 = frequency1.getCount(3L);
        double double27 = frequency1.getCumPct((int) (byte) 0);
        frequency1.addValue((-1));
        long long31 = frequency1.getCount((-1));
        frequency1.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((long) '4');
        java.lang.String str13 = frequency1.toString();
        frequency1.addValue((int) (byte) 1);
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        long long18 = frequency1.getCount((int) (short) 1);
        long long20 = frequency1.getCount((-1));
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCumFreq(100);
        double double8 = frequency1.getPct((-1L));
        long long10 = frequency1.getCumFreq((int) (short) 10);
        double double12 = frequency1.getPct(' ');
        long long14 = frequency1.getCount('4');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq((-1L));
        double double18 = frequency1.getCumPct((java.lang.Object) (-1L));
        java.util.Iterator iterator19 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        long long8 = frequency1.getCumFreq(1L);
        long long10 = frequency1.getCumFreq((long) '4');
        double double12 = frequency1.getPct((long) (byte) 100);
        java.lang.Class<?> wildcardClass13 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        long long12 = frequency1.getCount((int) (short) 100);
        long long13 = frequency1.getSumFreq();
        double double15 = frequency1.getCumPct(100);
        double double17 = frequency1.getPct((long) 'a');
        java.lang.String str18 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        double double60 = frequency1.getPct((long) 0);
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        double double64 = frequency62.getPct((int) (short) 1);
        double double66 = frequency62.getPct((long) (byte) 100);
        java.util.Iterator iterator67 = frequency62.valuesIterator();
        long long69 = frequency62.getCumFreq(1L);
        frequency62.addValue('a');
        java.util.Iterator iterator72 = frequency62.valuesIterator();
        double double73 = frequency1.getCumPct((java.lang.Object) frequency62);
        java.util.Comparator comparator74 = null;
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency(comparator74);
        double double77 = frequency75.getPct((int) (short) 1);
        double double79 = frequency75.getPct((long) (byte) 100);
        java.util.Iterator iterator80 = frequency75.valuesIterator();
        long long82 = frequency75.getCount((-1));
        frequency75.addValue((java.lang.Integer) 100);
        long long86 = frequency75.getCumFreq('4');
        frequency75.clear();
        long long88 = frequency62.getCount((java.lang.Object) frequency75);
        long long90 = frequency62.getCount((long) (byte) 1);
        double double92 = frequency62.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        long long20 = frequency8.getCount(100L);
        double double22 = frequency8.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        frequency1.addValue((java.lang.Integer) 100);
        double double11 = frequency1.getPct((long) (short) 100);
        frequency1.clear();
        double double14 = frequency1.getPct('4');
        frequency1.addValue('#');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        frequency18.addValue((java.lang.Object) (-1L));
        double double22 = frequency18.getPct(' ');
        long long24 = frequency18.getCumFreq(' ');
        double double26 = frequency18.getPct(1);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        frequency28.addValue('#');
        long long32 = frequency28.getCount(' ');
        long long34 = frequency28.getCumFreq((int) '4');
        double double35 = frequency18.getCumPct((java.lang.Object) long34);
        frequency18.addValue((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        double double40 = frequency38.getPct(100);
        double double42 = frequency38.getPct(3L);
        long long44 = frequency38.getCount((long) '4');
        java.util.Iterator iterator45 = frequency38.valuesIterator();
        long long46 = frequency18.getCumFreq((java.lang.Object) frequency38);
        long long47 = frequency1.getCount((java.lang.Object) frequency38);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct('4');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        frequency13.addValue((int) '#');
        double double19 = frequency13.getCumPct((int) (byte) 1);
        frequency13.addValue((java.lang.Integer) 100);
        double double23 = frequency13.getPct((long) (short) 100);
        frequency13.clear();
        long long25 = frequency1.getCumFreq((java.lang.Object) frequency13);
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq((-1L));
        long long29 = frequency26.getSumFreq();
        double double31 = frequency26.getCumPct((int) (byte) 100);
        long long33 = frequency26.getCumFreq(100L);
        long long35 = frequency26.getCumFreq('4');
        java.lang.String str36 = frequency26.toString();
        long long37 = frequency13.getCount((java.lang.Object) str36);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.5d + "'", double23 == 0.5d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        frequency1.clear();
        long long12 = frequency1.getCount((long) (short) 10);
        double double14 = frequency1.getCumPct('a');
        long long16 = frequency1.getCount('4');
        double double18 = frequency1.getCumPct(0L);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        frequency20.addValue((int) '#');
        double double26 = frequency20.getCumPct((int) (byte) 1);
        frequency20.addValue((java.lang.Integer) 100);
        double double30 = frequency20.getPct((long) (short) 100);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount(' ');
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount(' ');
        long long43 = frequency36.getCount((java.lang.Object) ' ');
        frequency36.clear();
        long long45 = frequency32.getCumFreq((java.lang.Object) frequency36);
        long long47 = frequency36.getCumFreq('4');
        long long49 = frequency36.getCount((int) (short) 1);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getPct((int) (short) 1);
        double double55 = frequency51.getPct((long) (byte) 100);
        double double57 = frequency51.getCumPct('a');
        long long58 = frequency51.getSumFreq();
        long long60 = frequency51.getCount((java.lang.Object) '4');
        double double62 = frequency51.getPct(' ');
        double double63 = frequency36.getPct((java.lang.Object) frequency51);
        long long64 = frequency20.getCumFreq((java.lang.Object) frequency36);
        double double65 = frequency1.getCumPct((java.lang.Object) frequency20);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.5d + "'", double30 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        frequency1.addValue((long) 'a');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount(' ');
        long long18 = frequency11.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct(1);
        frequency20.addValue((int) '#');
        double double25 = frequency11.getPct((java.lang.Object) frequency20);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        long long34 = frequency27.getCount((java.lang.Object) ' ');
        long long36 = frequency27.getCumFreq('#');
        long long38 = frequency27.getCumFreq((java.lang.Object) (-1));
        long long39 = frequency20.getCumFreq((java.lang.Object) (-1));
        frequency20.addValue((java.lang.Integer) (-1));
        long long42 = frequency1.getCount((java.lang.Object) frequency20);
        long long44 = frequency20.getCumFreq('a');
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        frequency46.addValue((java.lang.Object) (-1L));
        double double50 = frequency46.getPct(' ');
        frequency46.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator53 = frequency46.valuesIterator();
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getPct((int) (short) 1);
        double double59 = frequency55.getPct((long) (byte) 100);
        frequency55.addValue((java.lang.Integer) 0);
        long long63 = frequency55.getCount('a');
        double double64 = frequency46.getPct((java.lang.Object) frequency55);
        double double65 = frequency20.getPct((java.lang.Object) frequency55);
        long long67 = frequency55.getCount((long) '4');
        long long69 = frequency55.getCount((int) (byte) -1);
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        double double73 = frequency71.getPct((int) (short) 1);
        double double75 = frequency71.getPct((long) (byte) 100);
        java.util.Iterator iterator76 = frequency71.valuesIterator();
        long long77 = frequency55.getCumFreq((java.lang.Object) frequency71);
        java.util.Iterator iterator78 = frequency71.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(iterator78);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        long long16 = frequency1.getCount(100);
        double double18 = frequency1.getPct((int) (byte) -1);
        java.lang.String str19 = frequency1.toString();
        double double21 = frequency1.getCumPct(0);
        frequency1.addValue(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        frequency1.addValue((java.lang.Integer) (-1));
        double double62 = frequency1.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency();
        long long65 = frequency63.getCount((java.lang.Object) (byte) 100);
        double double67 = frequency63.getCumPct((int) ' ');
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        frequency69.addValue((java.lang.Object) (-1L));
        double double73 = frequency69.getPct(' ');
        frequency69.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator76 = frequency69.valuesIterator();
        long long77 = frequency63.getCount((java.lang.Object) frequency69);
        java.util.Iterator iterator78 = frequency63.valuesIterator();
        double double80 = frequency63.getPct((long) 'a');
        long long82 = frequency63.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency83 = new org.apache.commons.math.stat.Frequency();
        long long85 = frequency83.getCumFreq((-1L));
        long long87 = frequency83.getCount((-1L));
        long long89 = frequency83.getCount('a');
        double double90 = frequency63.getCumPct((java.lang.Object) 'a');
        double double92 = frequency63.getCumPct('#');
        double double94 = frequency63.getPct((int) (short) 1);
        frequency63.clear();
        long long96 = frequency1.getCount((java.lang.Object) frequency63);
        java.util.Iterator iterator97 = frequency63.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue(Double.isNaN(double94));
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertNotNull(iterator97);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        long long5 = frequency1.getCumFreq((int) (short) 0);
        double double7 = frequency1.getPct((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getPct(1);
        frequency9.addValue((int) '#');
        long long14 = frequency1.getCount((java.lang.Object) frequency9);
        java.util.Iterator iterator15 = frequency9.valuesIterator();
        double double17 = frequency9.getPct((int) (short) 100);
        long long19 = frequency9.getCount((long) (short) -1);
        long long21 = frequency9.getCount((int) (short) 1);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue((java.lang.Object) (-1L));
        long long27 = frequency23.getCumFreq((-1));
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getPct((int) (short) 1);
        java.util.Iterator iterator32 = frequency29.valuesIterator();
        double double34 = frequency29.getPct('4');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        frequency36.addValue('#');
        long long40 = frequency36.getCount(' ');
        java.lang.Class<?> wildcardClass41 = frequency36.getClass();
        double double42 = frequency29.getPct((java.lang.Object) wildcardClass41);
        double double43 = frequency23.getCumPct((java.lang.Object) frequency29);
        java.lang.Class<?> wildcardClass44 = frequency29.getClass();
        long long45 = frequency9.getCumFreq((java.lang.Object) frequency29);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        frequency1.addValue(100L);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount(' ');
        double double15 = frequency11.getPct('4');
        long long17 = frequency11.getCount((java.lang.Object) 10.0f);
        double double18 = frequency1.getPct((java.lang.Object) frequency11);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        frequency20.addValue((java.lang.Object) (-1L));
        double double24 = frequency20.getPct(' ');
        long long26 = frequency20.getCumFreq(' ');
        double double28 = frequency20.getPct(1);
        double double30 = frequency20.getCumPct('4');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        frequency32.addValue((int) '#');
        double double38 = frequency32.getCumPct((int) (byte) 1);
        frequency32.addValue((java.lang.Integer) 100);
        double double42 = frequency32.getPct((long) (short) 100);
        frequency32.clear();
        long long44 = frequency20.getCumFreq((java.lang.Object) frequency32);
        frequency32.clear();
        long long46 = frequency11.getCount((java.lang.Object) frequency32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.5d + "'", double42 == 0.5d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getCumPct((int) (byte) 1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getPct(1);
        frequency18.addValue((int) '#');
        double double23 = frequency9.getPct((java.lang.Object) frequency18);
        double double25 = frequency18.getCumPct(10);
        long long26 = frequency1.getCount((java.lang.Object) 10);
        long long28 = frequency1.getCumFreq((int) (short) 10);
        long long30 = frequency1.getCount(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getPct((int) (short) 1);
        double double36 = frequency32.getPct((long) (byte) 100);
        java.util.Iterator iterator37 = frequency32.valuesIterator();
        frequency32.clear();
        frequency32.addValue((long) 'a');
        long long41 = frequency1.getCumFreq((java.lang.Object) frequency32);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getPct(1);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount(' ');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount(' ');
        long long54 = frequency47.getCount((java.lang.Object) ' ');
        frequency47.addValue((long) 0);
        double double58 = frequency47.getCumPct((long) (short) 0);
        double double60 = frequency47.getCumPct(' ');
        double double61 = frequency43.getCumPct((java.lang.Object) double60);
        java.lang.String str62 = frequency43.toString();
        double double64 = frequency43.getPct((long) (short) 100);
        long long65 = frequency1.getCount((java.lang.Object) frequency43);
        long long67 = frequency43.getCount('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        long long17 = frequency10.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        frequency19.addValue((java.lang.Object) (-1L));
        double double23 = frequency19.getPct(' ');
        frequency19.addValue((java.lang.Integer) 1);
        double double27 = frequency19.getPct((long) ' ');
        frequency10.addValue((java.lang.Object) double27);
        long long29 = frequency1.getCount((java.lang.Object) frequency10);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount(' ');
        long long42 = frequency35.getCount((java.lang.Object) ' ');
        frequency35.clear();
        long long44 = frequency31.getCumFreq((java.lang.Object) frequency35);
        long long46 = frequency35.getCumFreq((long) (short) -1);
        long long47 = frequency1.getCumFreq((java.lang.Object) (short) -1);
        long long49 = frequency1.getCount('#');
        long long51 = frequency1.getCumFreq(1L);
        frequency1.addValue((long) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCount((long) 0);
        long long11 = frequency1.getCumFreq('#');
        frequency1.clear();
        frequency1.addValue('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        frequency10.addValue((java.lang.Object) (-1L));
        double double14 = frequency10.getPct(' ');
        frequency10.addValue((java.lang.Integer) 1);
        double double18 = frequency10.getPct((long) ' ');
        frequency1.addValue((java.lang.Object) double18);
        double double21 = frequency1.getPct((java.lang.Object) false);
        long long23 = frequency1.getCumFreq((int) (byte) -1);
        double double25 = frequency1.getCumPct((long) (short) 10);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        frequency27.addValue((java.lang.Object) (-1L));
        long long31 = frequency27.getCumFreq((-1));
        long long33 = frequency27.getCumFreq('a');
        double double35 = frequency27.getPct('a');
        double double36 = frequency1.getCumPct((java.lang.Object) double35);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        double double42 = frequency38.getPct((long) (byte) 100);
        java.util.Iterator iterator43 = frequency38.valuesIterator();
        double double45 = frequency38.getPct('a');
        long long47 = frequency38.getCumFreq(' ');
        double double48 = frequency1.getPct((java.lang.Object) frequency38);
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount(' ');
        double double54 = frequency50.getPct('4');
        frequency50.clear();
        long long56 = frequency1.getCount((java.lang.Object) frequency50);
        long long58 = frequency1.getCount('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        long long12 = frequency1.getCount((int) (short) 100);
        double double14 = frequency1.getPct('4');
        long long16 = frequency1.getCount('#');
        frequency1.addValue((long) ' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        long long26 = frequency20.getCount((int) (short) 1);
        long long28 = frequency20.getCumFreq((long) ' ');
        frequency20.clear();
        frequency20.addValue('4');
        long long33 = frequency20.getCount((int) (short) 0);
        long long35 = frequency20.getCumFreq((long) 1);
        java.util.Iterator iterator36 = frequency20.valuesIterator();
        long long37 = frequency1.getCumFreq((java.lang.Object) iterator36);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        double double10 = frequency1.getPct(' ');
        java.util.Iterator iterator11 = frequency1.valuesIterator();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        frequency13.addValue((int) '#');
        double double19 = frequency13.getCumPct((int) (byte) 1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount(' ');
        long long28 = frequency21.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getPct(1);
        frequency30.addValue((int) '#');
        double double35 = frequency21.getPct((java.lang.Object) frequency30);
        double double37 = frequency30.getCumPct(10);
        long long38 = frequency13.getCount((java.lang.Object) 10);
        long long40 = frequency13.getCumFreq((int) (short) 10);
        long long42 = frequency13.getCumFreq('4');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        frequency44.addValue((java.lang.Object) (-1L));
        double double48 = frequency44.getPct(' ');
        frequency44.addValue((java.lang.Integer) 1);
        long long51 = frequency13.getCumFreq((java.lang.Object) frequency44);
        long long52 = frequency44.getSumFreq();
        frequency44.addValue((int) (byte) -1);
        double double55 = frequency1.getCumPct((java.lang.Object) (byte) -1);
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        frequency57.addValue('#');
        long long61 = frequency57.getCount(' ');
        long long63 = frequency57.getCumFreq((int) '4');
        double double65 = frequency57.getPct('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 2L + "'", long52 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        long long26 = frequency17.getCumFreq('#');
        long long28 = frequency17.getCumFreq((java.lang.Object) (-1));
        long long29 = frequency10.getCumFreq((java.lang.Object) (-1));
        long long31 = frequency10.getCount(4L);
        // The following exception was thrown during execution in test generation
        try {
            frequency10.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        long long6 = frequency1.getCumFreq(100);
        double double8 = frequency1.getPct((-1L));
        long long10 = frequency1.getCumFreq((int) (short) 10);
        double double12 = frequency1.getPct(' ');
        long long14 = frequency1.getCount('4');
        java.lang.String str15 = frequency1.toString();
        frequency1.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Object) ' ');
        double double9 = frequency1.getCumPct((long) ' ');
        long long11 = frequency1.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getPct(100);
        double double16 = frequency12.getPct(3L);
        long long18 = frequency12.getCount((long) '4');
        long long20 = frequency12.getCount((-1L));
        double double21 = frequency1.getPct((java.lang.Object) long20);
        double double23 = frequency1.getPct((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency1.getPct((int) (short) -1);
        double double19 = frequency1.getCumPct((int) ' ');
        long long21 = frequency1.getCount((-1L));
        frequency1.addValue((java.lang.Object) 10.0f);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getPct((int) (short) 1);
        double double29 = frequency25.getPct((long) (byte) 100);
        double double31 = frequency25.getCumPct('a');
        java.lang.String str32 = frequency25.toString();
        frequency25.addValue((java.lang.Integer) (-1));
        double double35 = frequency1.getPct((java.lang.Object) (-1));
        frequency1.clear();
        long long38 = frequency1.getCount(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        java.lang.String str29 = frequency1.toString();
        frequency1.addValue(1);
        long long33 = frequency1.getCumFreq('4');
        double double35 = frequency1.getCumPct((int) '4');
        double double37 = frequency1.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        double double9 = frequency1.getPct((java.lang.Object) (-1.0d));
        double double11 = frequency1.getCumPct(10);
        double double13 = frequency1.getCumPct((int) (byte) 100);
        frequency1.addValue((int) (byte) 100);
        long long16 = frequency1.getSumFreq();
        long long18 = frequency1.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        double double12 = frequency1.getCumPct((int) '#');
        double double14 = frequency1.getCumPct((int) (short) -1);
        frequency1.addValue('4');
        double double18 = frequency1.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((-1L));
        long long23 = frequency19.getCumFreq(10L);
        long long25 = frequency19.getCount('a');
        java.lang.String str26 = frequency19.toString();
        long long28 = frequency19.getCount((long) (-1));
        long long29 = frequency1.getCount((java.lang.Object) (-1));
        double double31 = frequency1.getCumPct('4');
        double double33 = frequency1.getCumPct(' ');
        frequency1.addValue(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        long long5 = frequency1.getCount(' ');
        java.lang.String str6 = frequency1.toString();
        frequency1.addValue(' ');
        double double10 = frequency1.getPct(100);
        long long12 = frequency1.getCount((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.lang.String str6 = frequency1.toString();
        double double8 = frequency1.getPct(' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        double double26 = frequency17.getPct(' ');
        double double27 = frequency10.getPct((java.lang.Object) frequency17);
        double double28 = frequency1.getPct((java.lang.Object) double27);
        double double30 = frequency1.getPct((int) (byte) 0);
        long long32 = frequency1.getCumFreq((int) (short) 10);
        frequency1.clear();
        frequency1.clear();
        long long36 = frequency1.getCumFreq((int) (short) 0);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        double double42 = frequency38.getPct((long) (byte) 100);
        long long44 = frequency38.getCount(100);
        double double46 = frequency38.getCumPct((int) (short) 100);
        double double48 = frequency38.getCumPct((int) (byte) 100);
        double double49 = frequency1.getCumPct((java.lang.Object) double48);
        frequency1.addValue((java.lang.Integer) 0);
        long long53 = frequency1.getCumFreq((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCount((long) (short) -1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        java.util.Iterator iterator14 = frequency11.valuesIterator();
        double double16 = frequency11.getPct('4');
        long long18 = frequency11.getCount('4');
        frequency1.addValue((java.lang.Object) long18);
        long long21 = frequency1.getCumFreq(1L);
        java.util.Iterator iterator22 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        long long8 = frequency1.getCumFreq(1L);
        frequency1.addValue('a');
        java.util.Iterator iterator11 = frequency1.valuesIterator();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getPct((int) (short) 1);
        double double17 = frequency13.getPct((long) (byte) 100);
        long long19 = frequency13.getCount(100);
        double double21 = frequency13.getCumPct('4');
        frequency13.addValue((int) (byte) 1);
        frequency13.addValue((long) '4');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        long long34 = frequency27.getCount((java.lang.Object) ' ');
        long long36 = frequency27.getCount((int) '4');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getPct((int) (short) 1);
        java.util.Iterator iterator41 = frequency38.valuesIterator();
        double double43 = frequency38.getPct('4');
        long long44 = frequency27.getCount((java.lang.Object) '4');
        double double46 = frequency27.getCumPct((int) (short) -1);
        double double47 = frequency13.getPct((java.lang.Object) (short) -1);
        long long48 = frequency1.getCumFreq((java.lang.Object) frequency13);
        double double50 = frequency13.getPct((int) ' ');
        double double52 = frequency13.getCumPct(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.5d + "'", double52 == 0.5d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        long long17 = frequency10.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        frequency19.addValue((java.lang.Object) (-1L));
        double double23 = frequency19.getPct(' ');
        frequency19.addValue((java.lang.Integer) 1);
        double double27 = frequency19.getPct((long) ' ');
        frequency10.addValue((java.lang.Object) double27);
        long long29 = frequency1.getCount((java.lang.Object) frequency10);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getPct((int) (short) 1);
        java.util.Iterator iterator34 = frequency31.valuesIterator();
        long long36 = frequency31.getCumFreq(100);
        double double38 = frequency31.getPct((-1L));
        long long40 = frequency31.getCumFreq((int) (short) 10);
        long long42 = frequency31.getCount((int) '4');
        double double43 = frequency1.getPct((java.lang.Object) frequency31);
        java.util.Iterator iterator44 = frequency31.valuesIterator();
        frequency31.clear();
        double double47 = frequency31.getCumPct(0);
        long long48 = frequency31.getSumFreq();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCount((long) (short) 100);
        long long13 = frequency1.getCount(10L);
        long long15 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount(' ');
        long long24 = frequency17.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getPct(1);
        frequency26.addValue((int) '#');
        double double31 = frequency17.getPct((java.lang.Object) frequency26);
        double double33 = frequency17.getPct((int) (short) -1);
        double double35 = frequency17.getCumPct((int) ' ');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount(' ');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount(' ');
        long long44 = frequency37.getCount((java.lang.Object) ' ');
        long long46 = frequency37.getCumFreq('#');
        long long48 = frequency37.getCumFreq((java.lang.Object) (-1));
        java.lang.String str49 = frequency37.toString();
        long long50 = frequency37.getSumFreq();
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        double double54 = frequency52.getPct((int) (short) 1);
        java.util.Iterator iterator55 = frequency52.valuesIterator();
        long long57 = frequency52.getCumFreq(100);
        double double59 = frequency52.getPct((-1L));
        java.lang.Class<?> wildcardClass60 = frequency52.getClass();
        long long61 = frequency37.getCumFreq((java.lang.Object) wildcardClass60);
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        double double65 = frequency63.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        long long69 = frequency67.getCount(' ');
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        long long73 = frequency71.getCount(' ');
        long long74 = frequency67.getCount((java.lang.Object) ' ');
        frequency67.clear();
        long long76 = frequency63.getCumFreq((java.lang.Object) frequency67);
        long long78 = frequency67.getCumFreq('4');
        long long80 = frequency67.getCount((int) (short) 1);
        double double81 = frequency37.getPct((java.lang.Object) frequency67);
        double double83 = frequency67.getCumPct('a');
        long long84 = frequency17.getCumFreq((java.lang.Object) frequency67);
        long long85 = frequency1.getCumFreq((java.lang.Object) frequency17);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq((long) (byte) -1);
        double double12 = frequency1.getCumPct((int) (byte) -1);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount(' ');
        long long21 = frequency14.getCount((java.lang.Object) ' ');
        long long23 = frequency14.getCumFreq('#');
        long long25 = frequency14.getCumFreq((java.lang.Object) (-1));
        java.lang.String str26 = frequency14.toString();
        long long27 = frequency14.getSumFreq();
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getPct((int) (short) 1);
        java.util.Iterator iterator32 = frequency29.valuesIterator();
        long long34 = frequency29.getCumFreq(100);
        double double36 = frequency29.getPct((-1L));
        java.lang.Class<?> wildcardClass37 = frequency29.getClass();
        long long38 = frequency14.getCumFreq((java.lang.Object) wildcardClass37);
        long long39 = frequency1.getCumFreq((java.lang.Object) long38);
        double double41 = frequency1.getPct('4');
        long long43 = frequency1.getCumFreq((-1L));
        java.lang.Class<?> wildcardClass44 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((java.lang.Object) (byte) 100);
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue((int) (short) 0);
        double double8 = frequency0.getCumPct(100L);
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        double double16 = frequency10.getCumPct('a');
        long long17 = frequency10.getSumFreq();
        long long19 = frequency10.getCount((java.lang.Object) '4');
        double double21 = frequency10.getPct((int) (byte) 0);
        long long23 = frequency10.getCumFreq(0);
        long long25 = frequency10.getCount((int) (short) 0);
        frequency10.addValue((java.lang.Integer) 0);
        java.util.Iterator iterator28 = frequency10.valuesIterator();
        frequency10.addValue(10);
        double double31 = frequency0.getPct((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.clear();
        double double9 = frequency1.getPct((java.lang.Object) (-1.0d));
        double double11 = frequency1.getCumPct(10);
        double double13 = frequency1.getCumPct((int) (byte) 100);
        double double15 = frequency1.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        double double20 = frequency16.getPct((long) (byte) 100);
        double double22 = frequency16.getCumPct('a');
        long long23 = frequency16.getSumFreq();
        long long25 = frequency16.getCumFreq('#');
        long long27 = frequency16.getCumFreq((long) '4');
        java.lang.String str28 = frequency16.toString();
        long long29 = frequency1.getCumFreq((java.lang.Object) str28);
        double double31 = frequency1.getCumPct('#');
        long long32 = frequency1.getSumFreq();
        double double34 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((int) ' ');
        long long60 = frequency1.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        long long5 = frequency1.getCumFreq((-1));
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getPct((int) (short) 1);
        java.util.Iterator iterator10 = frequency7.valuesIterator();
        double double12 = frequency7.getPct('4');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        frequency14.addValue('#');
        long long18 = frequency14.getCount(' ');
        java.lang.Class<?> wildcardClass19 = frequency14.getClass();
        double double20 = frequency7.getPct((java.lang.Object) wildcardClass19);
        double double21 = frequency1.getCumPct((java.lang.Object) frequency7);
        java.util.Iterator iterator22 = frequency7.valuesIterator();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount(' ');
        long long15 = frequency8.getCount((java.lang.Object) ' ');
        double double17 = frequency8.getPct(' ');
        double double18 = frequency1.getPct((java.lang.Object) frequency8);
        long long20 = frequency8.getCount(100L);
        long long22 = frequency8.getCount(100);
        frequency8.addValue('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        double double23 = frequency1.getCumPct((int) (byte) 100);
        double double25 = frequency1.getPct(' ');
        double double27 = frequency1.getCumPct((int) (short) 1);
        double double29 = frequency1.getPct(100);
        frequency1.clear();
        double double32 = frequency1.getPct('#');
        frequency1.addValue((long) 'a');
        frequency1.addValue((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long3 = frequency0.getSumFreq();
        double double5 = frequency0.getPct((long) (byte) 1);
        frequency0.addValue((int) (short) -1);
        java.lang.String str8 = frequency0.toString();
        long long10 = frequency0.getCumFreq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount(' ');
        long long17 = frequency10.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        frequency19.addValue((java.lang.Object) (-1L));
        double double23 = frequency19.getPct(' ');
        frequency19.addValue((java.lang.Integer) 1);
        double double27 = frequency19.getPct((long) ' ');
        frequency10.addValue((java.lang.Object) double27);
        long long29 = frequency1.getCount((java.lang.Object) frequency10);
        double double31 = frequency1.getCumPct(0L);
        double double33 = frequency1.getCumPct((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        double double23 = frequency1.getCumPct((int) (byte) 100);
        double double25 = frequency1.getPct(' ');
        double double27 = frequency1.getCumPct((int) (short) 1);
        double double29 = frequency1.getPct(100);
        frequency1.clear();
        double double32 = frequency1.getPct('#');
        long long34 = frequency1.getCumFreq((int) (byte) 10);
        long long36 = frequency1.getCount('#');
        double double38 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue('#');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        double double7 = frequency5.getPct((int) (short) 1);
        double double9 = frequency5.getPct((long) (byte) 100);
        long long11 = frequency5.getCount(100);
        double double12 = frequency1.getCumPct((java.lang.Object) frequency5);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getPct((int) (short) 1);
        double double18 = frequency14.getPct((long) (byte) 100);
        frequency14.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount(' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount(' ');
        long long29 = frequency22.getCount((java.lang.Object) ' ');
        double double31 = frequency22.getCumPct('a');
        long long32 = frequency14.getCount((java.lang.Object) double31);
        double double34 = frequency14.getCumPct((long) (short) 1);
        double double36 = frequency14.getCumPct((int) (byte) 100);
        double double38 = frequency14.getPct(' ');
        double double40 = frequency14.getCumPct(' ');
        double double41 = frequency5.getPct((java.lang.Object) ' ');
        long long43 = frequency5.getCount((int) (byte) 0);
        double double45 = frequency5.getPct((int) '4');
        long long47 = frequency5.getCumFreq((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        double double16 = frequency1.getPct(' ');
        double double18 = frequency1.getCumPct(0L);
        double double20 = frequency1.getCumPct('4');
        java.lang.Class<?> wildcardClass21 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct(1);
        frequency10.addValue((int) '#');
        double double15 = frequency1.getPct((java.lang.Object) frequency10);
        double double17 = frequency10.getPct((long) (byte) 100);
        long long18 = frequency10.getSumFreq();
        long long20 = frequency10.getCount('#');
        double double22 = frequency10.getPct(4L);
        long long24 = frequency10.getCount(' ');
        double double26 = frequency10.getCumPct((int) (short) 100);
        long long28 = frequency10.getCumFreq((-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        frequency11.addValue('#');
        long long15 = frequency11.getCount(' ');
        long long17 = frequency11.getCumFreq((int) '4');
        double double18 = frequency1.getCumPct((java.lang.Object) long17);
        long long19 = frequency1.getSumFreq();
        double double21 = frequency1.getPct((long) (byte) -1);
        long long23 = frequency1.getCount((int) (byte) 10);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getPct((int) (short) 1);
        double double29 = frequency25.getPct((long) (byte) 100);
        double double31 = frequency25.getCumPct('a');
        long long33 = frequency25.getCumFreq(0);
        long long34 = frequency1.getCumFreq((java.lang.Object) frequency25);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getCumPct((java.lang.Object) 0);
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount(' ');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount(' ');
        long long47 = frequency40.getCount((java.lang.Object) ' ');
        frequency40.clear();
        long long49 = frequency36.getCumFreq((java.lang.Object) frequency40);
        double double51 = frequency36.getPct((long) (byte) 100);
        double double53 = frequency36.getPct('#');
        frequency36.clear();
        frequency36.clear();
        java.lang.String str56 = frequency36.toString();
        double double58 = frequency36.getPct((int) (short) 1);
        long long59 = frequency1.getCount((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str56, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue((java.lang.Object) (-1L));
        double double17 = frequency13.getPct(' ');
        java.lang.Class<?> wildcardClass18 = frequency13.getClass();
        double double19 = frequency1.getCumPct((java.lang.Object) wildcardClass18);
        frequency1.addValue((int) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getPct((int) (short) 1);
        double double27 = frequency23.getPct((long) (byte) 100);
        java.util.Iterator iterator28 = frequency23.valuesIterator();
        frequency23.clear();
        frequency23.addValue((long) 'a');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount(' ');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount(' ');
        long long40 = frequency33.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getPct(1);
        frequency42.addValue((int) '#');
        double double47 = frequency33.getPct((java.lang.Object) frequency42);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCount(' ');
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        long long55 = frequency53.getCount(' ');
        long long56 = frequency49.getCount((java.lang.Object) ' ');
        long long58 = frequency49.getCumFreq('#');
        long long60 = frequency49.getCumFreq((java.lang.Object) (-1));
        long long61 = frequency42.getCumFreq((java.lang.Object) (-1));
        frequency42.addValue((java.lang.Integer) (-1));
        long long64 = frequency23.getCount((java.lang.Object) frequency42);
        double double66 = frequency23.getPct(0);
        long long68 = frequency23.getCumFreq(0);
        long long69 = frequency1.getCumFreq((java.lang.Object) frequency23);
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        frequency71.addValue((java.lang.Object) (-1L));
        double double75 = frequency71.getPct(' ');
        long long77 = frequency71.getCumFreq(' ');
        double double79 = frequency71.getPct(1);
        double double81 = frequency71.getCumPct(' ');
        frequency71.addValue((int) '#');
        double double85 = frequency71.getPct((long) '#');
        java.lang.Class<?> wildcardClass86 = frequency71.getClass();
        long long87 = frequency1.getCumFreq((java.lang.Object) wildcardClass86);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.5d + "'", double85 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCount((int) '4');
        double double12 = frequency1.getCumPct((int) '#');
        double double14 = frequency1.getCumPct((int) (short) -1);
        frequency1.addValue((java.lang.Object) 0);
        long long18 = frequency1.getCount((long) '4');
        java.lang.String str19 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((long) 'a');
        double double11 = frequency1.getCumPct(' ');
        long long13 = frequency1.getCount('4');
        double double15 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        frequency1.clear();
        frequency1.clear();
        long long7 = frequency1.getCount(2L);
        long long8 = frequency1.getSumFreq();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getPct((int) (short) 1);
        double double14 = frequency10.getPct((long) (byte) 100);
        java.util.Iterator iterator15 = frequency10.valuesIterator();
        frequency10.clear();
        double double18 = frequency10.getPct((java.lang.Object) (-1.0d));
        double double20 = frequency10.getCumPct((int) (short) -1);
        double double21 = frequency1.getPct((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        java.util.Iterator iterator14 = frequency11.valuesIterator();
        long long16 = frequency11.getCumFreq(100);
        double double18 = frequency11.getPct((-1L));
        long long20 = frequency11.getCumFreq((int) (short) 10);
        double double21 = frequency1.getCumPct((java.lang.Object) (short) 10);
        double double23 = frequency1.getPct(' ');
        java.lang.String str24 = frequency1.toString();
        double double26 = frequency1.getCumPct((-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        double double7 = frequency1.getCumPct('a');
        java.lang.String str8 = frequency1.toString();
        double double10 = frequency1.getCumPct('#');
        long long11 = frequency1.getSumFreq();
        frequency1.addValue((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        double double9 = frequency1.getPct(1);
        double double11 = frequency1.getCumPct((int) '#');
        double double13 = frequency1.getCumPct((long) 100);
        java.lang.String str14 = frequency1.toString();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount(' ');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        long long22 = frequency20.getCount(' ');
        long long23 = frequency16.getCount((java.lang.Object) ' ');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getPct(1);
        frequency25.addValue((int) '#');
        double double30 = frequency16.getPct((java.lang.Object) frequency25);
        double double32 = frequency25.getCumPct(10);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getPct((int) (short) 1);
        double double38 = frequency34.getPct((long) (byte) 100);
        frequency34.addValue((java.lang.Integer) 0);
        long long42 = frequency34.getCount('a');
        long long43 = frequency25.getCount((java.lang.Object) long42);
        java.util.Comparator comparator44 = null;
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency(comparator44);
        frequency45.addValue((java.lang.Object) (-1L));
        long long49 = frequency45.getCumFreq((-1));
        long long51 = frequency45.getCumFreq('a');
        double double53 = frequency45.getPct('a');
        double double55 = frequency45.getCumPct(2L);
        double double56 = frequency25.getPct((java.lang.Object) frequency45);
        double double58 = frequency25.getPct((long) (byte) 1);
        double double59 = frequency1.getPct((java.lang.Object) (byte) 1);
        double double61 = frequency1.getCumPct((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount(' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount(' ');
        long long16 = frequency9.getCount((java.lang.Object) ' ');
        double double18 = frequency9.getCumPct('a');
        long long19 = frequency1.getCount((java.lang.Object) double18);
        double double21 = frequency1.getCumPct((long) (short) 1);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue('#');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getPct((int) (short) 1);
        double double31 = frequency27.getPct((long) (byte) 100);
        long long33 = frequency27.getCount(100);
        double double34 = frequency23.getCumPct((java.lang.Object) frequency27);
        long long35 = frequency1.getCount((java.lang.Object) frequency23);
        long long37 = frequency1.getCount((-1));
        long long39 = frequency1.getCumFreq('4');
        long long41 = frequency1.getCount((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getPct((int) (short) 1);
        double double19 = frequency15.getPct((long) (byte) 100);
        java.lang.String str20 = frequency15.toString();
        double double22 = frequency15.getPct(' ');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getPct((int) (short) 1);
        double double28 = frequency24.getPct((long) (byte) 100);
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount(' ');
        long long38 = frequency31.getCount((java.lang.Object) ' ');
        double double40 = frequency31.getPct(' ');
        double double41 = frequency24.getPct((java.lang.Object) frequency31);
        double double42 = frequency15.getPct((java.lang.Object) double41);
        double double44 = frequency15.getPct((int) (byte) 0);
        double double45 = frequency1.getPct((java.lang.Object) frequency15);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getPct((int) (short) 1);
        double double51 = frequency47.getPct((long) (byte) 100);
        frequency47.addValue((java.lang.Integer) 0);
        long long54 = frequency1.getCount((java.lang.Object) 0);
        double double56 = frequency1.getCumPct((long) 1);
        long long58 = frequency1.getCumFreq((long) (short) 1);
        double double60 = frequency1.getPct((long) 1);
        long long62 = frequency1.getCumFreq(' ');
        frequency1.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.5d + "'", double60 == 0.5d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        frequency1.addValue((int) '#');
        double double7 = frequency1.getPct(' ');
        long long9 = frequency1.getCount((long) (short) -1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getPct((int) (short) 1);
        java.util.Iterator iterator14 = frequency11.valuesIterator();
        double double16 = frequency11.getPct('4');
        long long18 = frequency11.getCount('4');
        frequency1.addValue((java.lang.Object) long18);
        long long21 = frequency1.getCumFreq(1L);
        double double23 = frequency1.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) ' ');
        long long11 = frequency1.getCumFreq(10);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        frequency13.addValue('#');
        double double17 = frequency13.getPct((java.lang.Object) 1);
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getPct((int) (short) 1);
        double double24 = frequency20.getPct((long) (byte) 100);
        frequency20.addValue((java.lang.Object) ' ');
        double double28 = frequency20.getCumPct((long) ' ');
        long long30 = frequency20.getCount(0L);
        java.util.Iterator iterator31 = frequency20.valuesIterator();
        double double32 = frequency1.getPct((java.lang.Object) frequency20);
        double double34 = frequency1.getCumPct(100);
        double double36 = frequency1.getPct((long) '#');
        double double38 = frequency1.getPct((int) ' ');
        long long40 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long13 = frequency1.getCumFreq((long) (short) 0);
        long long15 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        double double17 = frequency1.getPct((long) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((int) (short) 1);
        double double5 = frequency1.getPct((long) (byte) 100);
        long long7 = frequency1.getCount((int) (short) 1);
        frequency1.addValue((java.lang.Object) 1);
        frequency1.addValue((int) (short) 0);
        long long12 = frequency1.getSumFreq();
        double double14 = frequency1.getCumPct((int) '#');
        long long16 = frequency1.getCumFreq((long) (short) 10);
        double double18 = frequency1.getPct((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1L));
        long long4 = frequency0.getCumFreq(10L);
        long long6 = frequency0.getCount('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((long) (-1));
        long long11 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((java.lang.Object) (-1L));
        double double5 = frequency1.getPct(' ');
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        frequency11.addValue('#');
        long long15 = frequency11.getCount(' ');
        long long17 = frequency11.getCumFreq((int) '4');
        double double18 = frequency1.getCumPct((java.lang.Object) long17);
        long long20 = frequency1.getCount(10L);
        double double22 = frequency1.getCumPct('4');
        double double24 = frequency1.getPct('4');
        long long25 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        double double14 = frequency1.getPct(0);
        frequency1.addValue('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount(' ');
        long long8 = frequency1.getCount((java.lang.Object) ' ');
        long long10 = frequency1.getCumFreq('#');
        long long12 = frequency1.getCumFreq((java.lang.Object) (-1));
        java.lang.String str13 = frequency1.toString();
        long long14 = frequency1.getSumFreq();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getPct((int) (short) 1);
        java.util.Iterator iterator19 = frequency16.valuesIterator();
        long long21 = frequency16.getCumFreq(100);
        double double23 = frequency16.getPct((-1L));
        java.lang.Class<?> wildcardClass24 = frequency16.getClass();
        long long25 = frequency1.getCumFreq((java.lang.Object) wildcardClass24);
        frequency1.addValue((long) (byte) 1);
        long long29 = frequency1.getCumFreq((long) (short) -1);
        long long30 = frequency1.getSumFreq();
        frequency1.clear();
        double double33 = frequency1.getPct((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }
}

