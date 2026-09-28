package org.apache.commons.math.stat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency9.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        long long14 = frequency9.getCumFreq((java.lang.Object) "");
        long long15 = frequency0.getCount((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount('#');
        long long20 = frequency16.getCumFreq('a');
        frequency16.addValue(100L);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        boolean boolean25 = frequency23.equals((java.lang.Object) 10L);
        frequency23.clear();
        double double28 = frequency23.getPct((int) (short) 100);
        long long30 = frequency23.getCount('a');
        boolean boolean31 = frequency16.equals((java.lang.Object) frequency23);
        long long32 = frequency0.getCount((java.lang.Object) boolean31);
        long long34 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        boolean boolean6 = frequency0.equals((java.lang.Object) 100);
        double double8 = frequency0.getCumPct(100);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n97\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getCumPct(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        frequency0.addValue((long) 1);
        long long16 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.addValue((-1L));
        double double6 = frequency0.getPct(' ');
        frequency0.addValue((java.lang.Integer) 0);
        long long10 = frequency0.getCount('a');
        long long12 = frequency0.getCumFreq((long) (byte) 10);
        long long14 = frequency0.getCount(1);
        double double16 = frequency0.getCumPct(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct('a');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        boolean boolean15 = frequency10.equals((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        frequency16.addValue((int) 'a');
        long long25 = frequency16.getCumFreq((long) (short) 1);
        double double27 = frequency16.getPct((long) (byte) 100);
        double double29 = frequency16.getPct((long) 'a');
        long long31 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long33 = frequency16.getCount('a');
        boolean boolean34 = frequency10.equals((java.lang.Object) frequency16);
        long long36 = frequency10.getCumFreq('a');
        double double37 = frequency0.getCumPct((java.lang.Object) 'a');
        long long38 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((long) (short) 1);
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getPct((int) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        long long14 = frequency7.getCumFreq('4');
        long long16 = frequency7.getCount((int) (short) 1);
        java.lang.String str17 = frequency7.toString();
        long long19 = frequency7.getCount(' ');
        long long20 = frequency0.getCumFreq((java.lang.Object) long19);
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        boolean boolean25 = frequency23.equals((java.lang.Object) 10L);
        frequency23.clear();
        double double28 = frequency23.getCumPct('4');
        double double29 = frequency0.getPct((java.lang.Object) double28);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        boolean boolean32 = frequency30.equals((java.lang.Object) 10L);
        frequency30.clear();
        double double35 = frequency30.getPct((int) (short) 100);
        double double37 = frequency30.getPct(' ');
        double double39 = frequency30.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        boolean boolean42 = frequency40.equals((java.lang.Object) 10L);
        frequency40.clear();
        double double45 = frequency40.getPct((int) (short) 100);
        long long47 = frequency40.getCumFreq('4');
        double double49 = frequency40.getCumPct((int) (short) 1);
        long long51 = frequency40.getCount(0L);
        double double53 = frequency40.getCumPct((long) (byte) -1);
        double double54 = frequency30.getPct((java.lang.Object) double53);
        long long55 = frequency0.getCount((java.lang.Object) double54);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor56 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency();
        boolean boolean59 = frequency57.equals((java.lang.Object) 10L);
        frequency57.clear();
        double double62 = frequency57.getPct((int) (short) 100);
        long long64 = frequency57.getCumFreq('4');
        long long66 = frequency57.getCount((int) (short) 1);
        double double68 = frequency57.getCumPct('#');
        frequency57.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        long long72 = frequency57.getCumFreq('4');
        long long74 = frequency57.getCount('a');
        long long76 = frequency57.getCumFreq((int) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency77 = new org.apache.commons.math.stat.Frequency();
        long long79 = frequency77.getCount('#');
        long long81 = frequency77.getCumFreq('a');
        frequency77.addValue((long) (short) 0);
        long long85 = frequency77.getCumFreq('a');
        boolean boolean86 = frequency57.equals((java.lang.Object) frequency77);
        long long88 = frequency77.getCount(1L);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) long88);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long12 = frequency0.getCumFreq((long) (byte) -1);
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount(' ');
        long long21 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency17.valuesIterator();
        double double24 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.lang.String str25 = frequency17.toString();
        long long27 = frequency17.getCount((int) (short) 100);
        double double28 = frequency0.getPct((java.lang.Object) long27);
        double double30 = frequency0.getCumPct((java.lang.Object) (-1L));
        long long32 = frequency0.getCumFreq(0L);
        long long34 = frequency0.getCount((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(100L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        long long14 = frequency7.getCount('a');
        boolean boolean15 = frequency0.equals((java.lang.Object) frequency7);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        long long23 = frequency16.getCumFreq('4');
        long long25 = frequency16.getCount((int) (short) 1);
        long long27 = frequency16.getCount((int) (short) 1);
        long long29 = frequency16.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount('#');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        boolean boolean34 = frequency30.equals((java.lang.Object) frequency33);
        long long36 = frequency33.getCumFreq((int) (byte) 0);
        boolean boolean37 = frequency16.equals((java.lang.Object) (byte) 0);
        double double39 = frequency16.getPct((-1));
        frequency7.addValue((java.lang.Object) (-1));
        long long42 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        double double44 = frequency7.getCumPct(' ');
        java.lang.String str45 = frequency7.toString();
        long long47 = frequency7.getCumFreq(0);
        long long49 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCount('a');
        double double8 = frequency0.getPct((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct((int) (short) -1);
        double double13 = frequency9.getCumPct((int) (short) 0);
        boolean boolean14 = frequency0.equals((java.lang.Object) frequency9);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getCumPct(0L);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency0.getCumPct((long) (byte) -1);
        double double17 = frequency0.getPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency18.equals((java.lang.Object) 10L);
        frequency18.clear();
        double double23 = frequency18.getPct((int) (short) 100);
        long long25 = frequency18.getCumFreq('4');
        long long27 = frequency18.getCount((int) (short) 1);
        long long29 = frequency18.getCount((int) (short) 1);
        long long31 = frequency18.getCount((java.lang.Object) (byte) 1);
        frequency18.clear();
        double double34 = frequency18.getPct((int) ' ');
        long long35 = frequency18.getSumFreq();
        double double37 = frequency18.getPct('a');
        double double39 = frequency18.getPct((int) (short) 10);
        long long41 = frequency18.getCumFreq((long) '#');
        long long43 = frequency18.getCumFreq((long) ' ');
        frequency18.addValue('a');
        double double47 = frequency18.getPct(0L);
        boolean boolean48 = frequency0.equals((java.lang.Object) double47);
        double double50 = frequency0.getCumPct(' ');
        long long52 = frequency0.getCount((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount(' ');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long7 = frequency0.getCount((java.lang.Object) 10L);
        frequency0.addValue((long) (byte) 1);
        double double11 = frequency0.getPct((-1));
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        boolean boolean16 = frequency14.equals((java.lang.Object) 10L);
        frequency14.clear();
        double double19 = frequency14.getPct((int) (short) 100);
        long long21 = frequency14.getCumFreq('4');
        double double23 = frequency14.getCumPct((int) (short) 1);
        long long25 = frequency14.getCount(0L);
        double double27 = frequency14.getCumPct(1);
        long long29 = frequency14.getCount(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency14.valuesIterator();
        double double32 = frequency14.getPct((long) (short) 100);
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency14);
        double double37 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long39 = frequency14.getCumFreq((long) 1);
        double double41 = frequency14.getPct((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        frequency0.addValue(10);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        frequency12.addValue((java.lang.Comparable<java.lang.String>) "");
        long long16 = frequency12.getCumFreq((long) (short) -1);
        long long18 = frequency12.getCount(' ');
        long long20 = frequency12.getCount(0);
        double double22 = frequency12.getPct((long) (short) 0);
        long long24 = frequency12.getCumFreq((int) (short) 10);
        long long25 = frequency0.getCumFreq((java.lang.Object) long24);
        double double27 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        boolean boolean30 = frequency28.equals((java.lang.Object) 10L);
        frequency28.clear();
        double double33 = frequency28.getPct((int) (short) 100);
        frequency28.addValue((int) 'a');
        long long37 = frequency28.getCumFreq((long) (short) 1);
        double double39 = frequency28.getPct((long) (byte) 100);
        double double41 = frequency28.getPct((long) 'a');
        long long43 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long45 = frequency28.getCount((int) (byte) 0);
        frequency28.clear();
        double double48 = frequency28.getPct((long) (short) 1);
        double double49 = frequency0.getCumPct((java.lang.Object) double48);
        frequency0.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(' ');
        double double8 = frequency0.getPct((long) (byte) 1);
        frequency0.clear();
        long long11 = frequency0.getCumFreq((long) 1);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        boolean boolean14 = frequency12.equals((java.lang.Object) 10L);
        frequency12.clear();
        double double17 = frequency12.getPct((int) (short) 100);
        long long19 = frequency12.getCumFreq('4');
        long long21 = frequency12.getCount((int) (short) 1);
        java.lang.String str22 = frequency12.toString();
        long long24 = frequency12.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency12.getPct((java.lang.Object) (short) 100);
        double double28 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long30 = frequency12.getCount((long) 0);
        double double32 = frequency12.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        boolean boolean33 = frequency0.equals((java.lang.Object) frequency12);
        frequency12.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long37 = frequency12.getCount((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        boolean boolean40 = frequency38.equals((java.lang.Object) 10L);
        frequency38.clear();
        double double43 = frequency38.getPct((int) (short) 100);
        long long45 = frequency38.getCumFreq('4');
        long long47 = frequency38.getCount((int) (short) 1);
        java.lang.String str48 = frequency38.toString();
        long long50 = frequency38.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double52 = frequency38.getPct((java.lang.Object) (short) 100);
        frequency38.clear();
        double double55 = frequency38.getCumPct((int) (byte) -1);
        double double56 = frequency12.getPct((java.lang.Object) double55);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str48, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((long) (short) 1);
        long long11 = frequency0.getSumFreq();
        java.lang.Object obj12 = null;
        double double13 = frequency0.getCumPct(obj12);
        long long14 = frequency0.getSumFreq();
        long long16 = frequency0.getCount((int) (byte) 1);
        long long18 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        long long16 = frequency0.getCount((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double10 = frequency0.getCumPct((int) (short) -1);
        double double12 = frequency0.getCumPct('#');
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double16 = frequency0.getCumPct('4');
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long22 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getCumPct(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        frequency0.addValue((int) '4');
        long long16 = frequency0.getCumFreq((long) (short) 0);
        java.lang.Class<?> wildcardClass17 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double8 = frequency0.getPct((long) (byte) -1);
        long long10 = frequency0.getCumFreq((long) (byte) 1);
        double double12 = frequency0.getCumPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((int) 'a');
        frequency0.addValue((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCount(' ');
        long long11 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency7.valuesIterator();
        frequency7.addValue((int) (byte) 10);
        long long16 = frequency7.getCumFreq(' ');
        long long18 = frequency7.getCumFreq((long) (byte) 1);
        double double20 = frequency7.getPct((int) (short) 100);
        double double22 = frequency7.getCumPct((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long23 = frequency0.getCumFreq((java.lang.Object) frequency7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency9.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        long long14 = frequency9.getCumFreq((java.lang.Object) "");
        long long15 = frequency0.getCount((java.lang.Object) "");
        double double17 = frequency0.getCumPct((long) '4');
        long long19 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double21 = frequency0.getPct(0L);
        long long23 = frequency0.getCumFreq((long) '4');
        double double25 = frequency0.getPct((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long11 = frequency0.getCumFreq((long) (short) 1);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency16.equals((java.lang.Object) frequency19);
        long long22 = frequency19.getCumFreq((int) (byte) 0);
        double double24 = frequency19.getCumPct((long) 'a');
        long long26 = frequency19.getCumFreq('#');
        long long27 = frequency0.getCount((java.lang.Object) long26);
        frequency0.addValue('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency0.valuesIterator();
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) (-1));
        double double35 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCumFreq(' ');
        double double8 = frequency0.getPct('a');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount('#');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        boolean boolean15 = frequency11.equals((java.lang.Object) frequency14);
        long long17 = frequency14.getCount('#');
        frequency14.addValue((long) 0);
        long long21 = frequency14.getCumFreq((int) (byte) 100);
        double double23 = frequency14.getPct(100L);
        double double24 = frequency0.getCumPct((java.lang.Object) 100L);
        long long26 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        frequency27.addValue((java.lang.Comparable<java.lang.String>) "");
        long long31 = frequency27.getCumFreq((long) (byte) -1);
        frequency27.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long35 = frequency27.getCount((int) '4');
        double double37 = frequency27.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor39 = frequency38.valuesIterator();
        double double41 = frequency38.getCumPct((int) (short) 100);
        long long43 = frequency38.getCount((int) (short) 1);
        long long45 = frequency38.getCumFreq((long) (byte) 0);
        long long47 = frequency38.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency38.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCount('#');
        double double53 = frequency49.getPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean54 = frequency38.equals((java.lang.Object) double53);
        frequency38.clear();
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency();
        boolean boolean58 = frequency56.equals((java.lang.Object) 10L);
        frequency56.clear();
        boolean boolean61 = frequency56.equals((java.lang.Object) 1.0f);
        boolean boolean62 = frequency38.equals((java.lang.Object) 1.0f);
        double double63 = frequency27.getCumPct((java.lang.Object) boolean62);
        boolean boolean64 = frequency0.equals((java.lang.Object) boolean62);
        long long65 = frequency0.getSumFreq();
        java.lang.Class<?> wildcardClass66 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor39);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct(' ');
        double double11 = frequency0.getPct(0);
        frequency0.clear();
        long long14 = frequency0.getCount('a');
        double double16 = frequency0.getCumPct((int) (byte) 1);
        double double18 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        java.lang.Object obj19 = null;
        long long20 = frequency0.getCumFreq(obj19);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency21.valuesIterator();
        double double24 = frequency21.getCumPct((int) (short) 100);
        double double26 = frequency21.getPct('4');
        long long28 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        long long29 = frequency0.getCount((java.lang.Object) long28);
        double double31 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        double double15 = frequency10.getPct((int) (short) 100);
        long long17 = frequency10.getCumFreq('4');
        double double19 = frequency10.getCumPct((int) (short) 1);
        long long21 = frequency10.getCount(0L);
        double double23 = frequency10.getCumPct((long) (byte) -1);
        double double24 = frequency0.getPct((java.lang.Object) double23);
        long long26 = frequency0.getCount(0L);
        double double28 = frequency0.getCumPct((long) (byte) 100);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        java.lang.String str2 = frequency0.toString();
        double double4 = frequency0.getCumPct((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        boolean boolean7 = frequency5.equals((java.lang.Object) 10L);
        frequency5.clear();
        double double10 = frequency5.getPct((int) (short) 100);
        frequency5.clear();
        boolean boolean12 = frequency0.equals((java.lang.Object) frequency5);
        double double14 = frequency5.getCumPct(100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        boolean boolean17 = frequency15.equals((java.lang.Object) 10L);
        frequency15.clear();
        double double20 = frequency15.getPct((int) (short) 100);
        long long22 = frequency15.getCumFreq('4');
        long long24 = frequency15.getCount((int) (short) 1);
        long long26 = frequency15.getCount((int) (short) 1);
        long long28 = frequency15.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCount('#');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        boolean boolean33 = frequency29.equals((java.lang.Object) frequency32);
        long long35 = frequency32.getCumFreq((int) (byte) 0);
        boolean boolean36 = frequency15.equals((java.lang.Object) (byte) 0);
        long long38 = frequency15.getCount('#');
        long long40 = frequency15.getCount('4');
        long long42 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        frequency5.addValue((java.lang.Object) long42);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str2, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        double double5 = frequency0.getPct((long) '#');
        double double7 = frequency0.getPct((int) (short) -1);
        long long9 = frequency0.getCount((long) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double8 = frequency0.getCumPct(100L);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency9.equals((java.lang.Object) 10L);
        frequency9.clear();
        double double14 = frequency9.getPct((int) (short) 100);
        long long16 = frequency9.getCumFreq('4');
        long long18 = frequency9.getCount((int) (short) 1);
        long long20 = frequency9.getCount((int) (short) 1);
        long long22 = frequency9.getCount((java.lang.Object) (byte) 1);
        long long23 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double25 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double27 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.5d + "'", double25 == 0.5d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getPct('a');
        long long15 = frequency0.getCumFreq(2L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        frequency0.addValue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount(' ');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        frequency0.addValue((int) (byte) 10);
        double double9 = frequency0.getPct('4');
        double double11 = frequency0.getPct(1);
        long long13 = frequency0.getCount(' ');
        double double15 = frequency0.getPct('#');
        long long17 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency18.equals((java.lang.Object) 10L);
        frequency18.clear();
        double double23 = frequency18.getPct((int) (short) 100);
        long long25 = frequency18.getCumFreq('4');
        long long27 = frequency18.getCount((int) (short) 1);
        long long29 = frequency18.getCount((int) (short) 1);
        long long31 = frequency18.getCount((java.lang.Object) (byte) 1);
        frequency18.clear();
        double double34 = frequency18.getPct((int) ' ');
        long long36 = frequency18.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double38 = frequency18.getPct(' ');
        double double40 = frequency18.getCumPct((int) (byte) 100);
        frequency18.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double43 = frequency0.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double45 = frequency0.getCumPct(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        long long8 = frequency3.getCumFreq((int) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency3.valuesIterator();
        long long11 = frequency3.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCount('#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        boolean boolean16 = frequency12.equals((java.lang.Object) frequency15);
        long long18 = frequency15.getCount('#');
        long long20 = frequency15.getCumFreq((int) (byte) 10);
        long long22 = frequency15.getCount((int) 'a');
        long long24 = frequency15.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        double double26 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        frequency3.addValue((java.lang.Object) double26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        frequency0.addValue(0L);
        long long11 = frequency0.getCumFreq(' ');
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getCumPct((long) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        boolean boolean7 = frequency5.equals((java.lang.Object) 10L);
        frequency5.clear();
        double double10 = frequency5.getPct((int) (short) 100);
        double double12 = frequency5.getPct(' ');
        long long14 = frequency5.getCumFreq('#');
        double double16 = frequency5.getPct('4');
        double double17 = frequency0.getPct((java.lang.Object) '4');
        long long19 = frequency0.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        frequency0.clear();
        double double16 = frequency0.getPct((int) ' ');
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency0.getPct(' ');
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.lang.String str23 = frequency0.toString();
        double double25 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double27 = frequency0.getCumPct((int) (short) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double31 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long11 = frequency0.getCumFreq((long) (short) 1);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency16.equals((java.lang.Object) frequency19);
        long long22 = frequency19.getCumFreq((int) (byte) 0);
        double double24 = frequency19.getCumPct((long) 'a');
        long long26 = frequency19.getCumFreq('#');
        long long27 = frequency0.getCount((java.lang.Object) long26);
        frequency0.addValue('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency0.valuesIterator();
        frequency0.clear();
        long long33 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getPct((long) (byte) 100);
        double double16 = frequency0.getCumPct((-1));
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double4 = frequency0.getCumPct((long) (byte) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.clear();
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct('a');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        boolean boolean15 = frequency10.equals((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        frequency16.addValue((int) 'a');
        long long25 = frequency16.getCumFreq((long) (short) 1);
        double double27 = frequency16.getPct((long) (byte) 100);
        double double29 = frequency16.getPct((long) 'a');
        long long31 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long33 = frequency16.getCount('a');
        boolean boolean34 = frequency10.equals((java.lang.Object) frequency16);
        long long36 = frequency10.getCumFreq('a');
        double double37 = frequency0.getCumPct((java.lang.Object) 'a');
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        boolean boolean40 = frequency38.equals((java.lang.Object) 10L);
        frequency38.clear();
        double double43 = frequency38.getPct((int) (short) 100);
        double double45 = frequency38.getPct(' ');
        java.lang.String str46 = frequency38.toString();
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency47.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        frequency49.addValue((java.lang.Comparable<java.lang.String>) "");
        long long52 = frequency47.getCumFreq((java.lang.Object) "");
        long long53 = frequency38.getCount((java.lang.Object) "");
        double double55 = frequency38.getCumPct('a');
        double double56 = frequency0.getPct((java.lang.Object) 'a');
        long long58 = frequency0.getCumFreq((long) (short) 0);
        double double60 = frequency0.getCumPct((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency();
        long long63 = frequency61.getCount('#');
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency();
        boolean boolean65 = frequency61.equals((java.lang.Object) frequency64);
        long long67 = frequency61.getCumFreq('a');
        long long69 = frequency61.getCumFreq((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency70 = new org.apache.commons.math.stat.Frequency();
        boolean boolean72 = frequency70.equals((java.lang.Object) 10L);
        frequency70.clear();
        double double75 = frequency70.getPct((int) (short) 100);
        frequency70.addValue((int) 'a');
        long long79 = frequency70.getCumFreq((long) (short) 1);
        double double81 = frequency70.getPct((long) (byte) 100);
        double double83 = frequency70.getCumPct(' ');
        double double85 = frequency70.getCumPct('4');
        double double87 = frequency70.getPct((int) (byte) 0);
        double double89 = frequency70.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long90 = frequency61.getCount((java.lang.Object) double89);
        org.apache.commons.math.stat.Frequency frequency91 = new org.apache.commons.math.stat.Frequency();
        frequency91.addValue((java.lang.Comparable<java.lang.String>) "");
        long long95 = frequency91.getCumFreq((long) (short) -1);
        double double96 = frequency61.getPct((java.lang.Object) (short) -1);
        double double98 = frequency61.getPct((-1L));
        // The following exception was thrown during execution in test generation
        try {
            long long99 = frequency0.getCumFreq((java.lang.Object) frequency61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double96));
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        long long8 = frequency3.getCumFreq((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency9.getCumPct((long) (byte) 100);
        long long15 = frequency9.getCumFreq((long) 'a');
        boolean boolean16 = frequency3.equals((java.lang.Object) long15);
        double double18 = frequency3.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((int) (short) -1);
        double double23 = frequency19.getCumPct((long) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        boolean boolean26 = frequency24.equals((java.lang.Object) 10L);
        frequency24.clear();
        double double29 = frequency24.getPct((int) (short) 100);
        double double31 = frequency24.getPct(' ');
        long long33 = frequency24.getCumFreq('#');
        double double35 = frequency24.getPct('4');
        double double36 = frequency19.getPct((java.lang.Object) '4');
        long long38 = frequency19.getCount('#');
        long long39 = frequency3.getCumFreq((java.lang.Object) long38);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        boolean boolean42 = frequency40.equals((java.lang.Object) 10L);
        frequency40.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        double double47 = frequency45.getCumPct((int) (short) -1);
        double double49 = frequency45.getPct((int) (short) 100);
        long long51 = frequency45.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        frequency52.addValue((java.lang.Comparable<java.lang.String>) "");
        long long56 = frequency52.getCumFreq((long) (short) -1);
        long long58 = frequency52.getCount(' ');
        double double60 = frequency52.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double61 = frequency45.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency45.addValue((java.lang.Integer) 0);
        double double64 = frequency40.getCumPct((java.lang.Object) 0);
        double double65 = frequency3.getCumPct((java.lang.Object) double64);
        frequency3.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        double double9 = frequency0.getPct(0);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency11.equals((java.lang.Object) 10L);
        frequency11.clear();
        double double16 = frequency11.getPct((int) (short) 100);
        long long18 = frequency11.getCumFreq('4');
        long long20 = frequency11.getCount((int) (short) 1);
        long long22 = frequency11.getCount((int) (short) 1);
        double double24 = frequency11.getCumPct(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency11.valuesIterator();
        double double27 = frequency11.getCumPct(' ');
        frequency0.addValue((java.lang.Object) double27);
        long long29 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount('#');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency14.equals((java.lang.Object) frequency17);
        long long20 = frequency17.getCumFreq((int) (byte) 0);
        boolean boolean21 = frequency0.equals((java.lang.Object) (byte) 0);
        double double23 = frequency0.getCumPct((int) 'a');
        java.lang.String str24 = frequency0.toString();
        long long26 = frequency0.getCount((long) 10);
        long long28 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency0.valuesIterator();
        double double32 = frequency0.getCumPct((long) '#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor33 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(wildcardComparableItor33);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        long long8 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency9.getCumFreq((long) (short) -1);
        long long15 = frequency9.getCumFreq(' ');
        long long17 = frequency9.getCumFreq((int) (byte) -1);
        frequency9.clear();
        long long20 = frequency9.getCumFreq((long) ' ');
        long long22 = frequency9.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency9.clear();
        long long25 = frequency9.getCumFreq((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = frequency0.getPct((java.lang.Object) frequency9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        long long8 = frequency3.getCumFreq((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency9.getCumPct((long) (byte) 100);
        long long15 = frequency9.getCumFreq((long) 'a');
        boolean boolean16 = frequency3.equals((java.lang.Object) long15);
        double double18 = frequency3.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((int) (short) -1);
        double double23 = frequency19.getCumPct((long) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        boolean boolean26 = frequency24.equals((java.lang.Object) 10L);
        frequency24.clear();
        double double29 = frequency24.getPct((int) (short) 100);
        double double31 = frequency24.getPct(' ');
        long long33 = frequency24.getCumFreq('#');
        double double35 = frequency24.getPct('4');
        double double36 = frequency19.getPct((java.lang.Object) '4');
        long long38 = frequency19.getCount('#');
        long long39 = frequency3.getCumFreq((java.lang.Object) long38);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        boolean boolean42 = frequency40.equals((java.lang.Object) 10L);
        frequency40.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        double double47 = frequency45.getCumPct((int) (short) -1);
        double double49 = frequency45.getPct((int) (short) 100);
        long long51 = frequency45.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        frequency52.addValue((java.lang.Comparable<java.lang.String>) "");
        long long56 = frequency52.getCumFreq((long) (short) -1);
        long long58 = frequency52.getCount(' ');
        double double60 = frequency52.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double61 = frequency45.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency45.addValue((java.lang.Integer) 0);
        double double64 = frequency40.getCumPct((java.lang.Object) 0);
        double double65 = frequency3.getCumPct((java.lang.Object) double64);
        long long67 = frequency3.getCumFreq((long) (short) 100);
        java.lang.String str68 = frequency3.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str68, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getCumPct((int) (short) 100);
        long long5 = frequency0.getCount((int) (short) 1);
        long long7 = frequency0.getCumFreq((long) (byte) 0);
        long long9 = frequency0.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCount('#');
        double double15 = frequency11.getPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = frequency0.equals((java.lang.Object) double15);
        long long18 = frequency0.getCumFreq(1);
        double double20 = frequency0.getCumPct((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount('#');
        long long25 = frequency21.getCount((java.lang.Object) false);
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency26.valuesIterator();
        frequency26.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor30 = frequency26.valuesIterator();
        long long32 = frequency26.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long33 = frequency21.getCount((java.lang.Object) long32);
        frequency21.addValue((java.lang.Integer) 10);
        long long37 = frequency21.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        double double39 = frequency21.getPct(0L);
        boolean boolean40 = frequency0.equals((java.lang.Object) frequency21);
        long long42 = frequency0.getCumFreq(1);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertNotNull(wildcardComparableItor30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        double double5 = frequency0.getCumPct(1);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency6.equals((java.lang.Object) 10L);
        frequency6.clear();
        double double11 = frequency6.getPct((int) (short) 100);
        long long13 = frequency6.getCumFreq('4');
        long long15 = frequency6.getCount((int) (short) 1);
        java.lang.String str16 = frequency6.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency18.equals((java.lang.Object) frequency21);
        long long24 = frequency21.getCount('#');
        frequency21.addValue((long) 0);
        long long28 = frequency21.getCumFreq((int) (byte) 100);
        boolean boolean29 = frequency0.equals((java.lang.Object) frequency21);
        java.lang.String str30 = frequency0.toString();
        long long32 = frequency0.getCount('#');
        double double34 = frequency0.getCumPct((-1));
        java.lang.String str35 = frequency0.toString();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency14.getCumFreq((long) (short) -1);
        long long20 = frequency14.getCount(' ');
        long long22 = frequency14.getCount(0);
        long long24 = frequency14.getCount((int) ' ');
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency14);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency14.valuesIterator();
        long long28 = frequency14.getCount(' ');
        long long30 = frequency14.getCumFreq(2L);
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor34 = frequency33.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        boolean boolean37 = frequency35.equals((java.lang.Object) 10L);
        frequency35.addValue((-1L));
        double double41 = frequency35.getPct(' ');
        double double42 = frequency33.getPct((java.lang.Object) ' ');
        long long44 = frequency33.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency33.addValue(' ');
        double double48 = frequency33.getPct('a');
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCount(' ');
        long long53 = frequency49.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor54 = frequency49.valuesIterator();
        frequency49.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency();
        boolean boolean59 = frequency57.equals((java.lang.Object) 10L);
        frequency57.addValue((-1L));
        double double63 = frequency57.getPct(' ');
        frequency57.addValue((java.lang.Integer) 0);
        long long67 = frequency57.getCount('a');
        long long68 = frequency49.getCount((java.lang.Object) 'a');
        frequency49.addValue((long) (byte) 0);
        long long72 = frequency49.getCount('a');
        long long74 = frequency49.getCount('a');
        long long75 = frequency49.getSumFreq();
        boolean boolean76 = frequency33.equals((java.lang.Object) frequency49);
        boolean boolean77 = frequency14.equals((java.lang.Object) frequency33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 2L + "'", long75 == 2L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        long long5 = frequency0.getCumFreq((int) (short) -1);
        double double7 = frequency0.getPct(1);
        long long9 = frequency0.getCount('a');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency6.valuesIterator();
        frequency6.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency6.valuesIterator();
        long long12 = frequency6.getCount((long) 100);
        frequency6.clear();
        boolean boolean14 = frequency0.equals((java.lang.Object) frequency6);
        long long16 = frequency0.getCount('#');
        double double18 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCumFreq((int) (byte) 0);
        long long7 = frequency3.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        boolean boolean10 = frequency8.equals((java.lang.Object) 10L);
        frequency8.clear();
        double double13 = frequency8.getPct((int) (short) 100);
        double double15 = frequency8.getPct(' ');
        double double17 = frequency8.getPct('a');
        double double18 = frequency3.getPct((java.lang.Object) double17);
        long long19 = frequency3.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency20.equals((java.lang.Object) 10L);
        frequency20.clear();
        double double25 = frequency20.getPct((int) (short) 100);
        frequency20.addValue((int) 'a');
        long long29 = frequency20.getCumFreq((long) (short) 1);
        double double31 = frequency20.getPct((long) (byte) 100);
        double double33 = frequency20.getCumPct(' ');
        double double35 = frequency20.getCumPct('4');
        frequency20.clear();
        boolean boolean37 = frequency3.equals((java.lang.Object) frequency20);
        double double39 = frequency20.getCumPct((long) (short) -1);
        long long41 = frequency20.getCumFreq((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double8 = frequency0.getPct((long) (byte) -1);
        double double10 = frequency0.getCumPct((int) (short) -1);
        double double12 = frequency0.getPct((long) 10);
        double double14 = frequency0.getPct((long) (byte) 0);
        long long16 = frequency0.getCount((long) (short) 100);
        long long18 = frequency0.getCount((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency5.valuesIterator();
        frequency5.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency5.valuesIterator();
        long long11 = frequency5.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long12 = frequency0.getCount((java.lang.Object) long11);
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.addValue((java.lang.Integer) 0);
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCumFreq((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency14.valuesIterator();
        double double17 = frequency14.getCumPct((int) (short) 100);
        long long19 = frequency14.getCount((int) (short) 1);
        long long21 = frequency14.getCumFreq((long) (byte) 0);
        long long23 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "");
        double double25 = frequency14.getCumPct(' ');
        long long27 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        frequency14.addValue((java.lang.Integer) 1);
        long long30 = frequency14.getSumFreq();
        boolean boolean31 = frequency0.equals((java.lang.Object) long30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount('#');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency14.equals((java.lang.Object) frequency17);
        long long20 = frequency17.getCumFreq((int) (byte) 0);
        boolean boolean21 = frequency0.equals((java.lang.Object) (byte) 0);
        frequency0.addValue((int) '4');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCount(' ');
        long long28 = frequency24.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency24.valuesIterator();
        frequency24.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        boolean boolean34 = frequency32.equals((java.lang.Object) 10L);
        frequency32.addValue((-1L));
        double double38 = frequency32.getPct(' ');
        frequency32.addValue((java.lang.Integer) 0);
        long long42 = frequency32.getCount('a');
        long long43 = frequency24.getCount((java.lang.Object) 'a');
        frequency24.addValue((long) (byte) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor46 = frequency24.valuesIterator();
        boolean boolean47 = frequency0.equals((java.lang.Object) wildcardComparableItor46);
        long long48 = frequency0.getSumFreq();
        long long50 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long11 = frequency0.getCumFreq((long) (short) 1);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency16.equals((java.lang.Object) frequency19);
        long long22 = frequency19.getCumFreq((int) (byte) 0);
        double double24 = frequency19.getCumPct((long) 'a');
        long long26 = frequency19.getCumFreq('#');
        long long27 = frequency0.getCount((java.lang.Object) long26);
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.addValue(100);
        long long33 = frequency0.getCount('#');
        long long35 = frequency0.getCumFreq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(' ');
        double double8 = frequency0.getPct((long) (byte) 1);
        frequency0.clear();
        long long11 = frequency0.getCumFreq((long) 1);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        boolean boolean14 = frequency12.equals((java.lang.Object) 10L);
        frequency12.clear();
        double double17 = frequency12.getPct((int) (short) 100);
        long long19 = frequency12.getCumFreq('4');
        long long21 = frequency12.getCount((int) (short) 1);
        java.lang.String str22 = frequency12.toString();
        long long24 = frequency12.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency12.getPct((java.lang.Object) (short) 100);
        double double28 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long30 = frequency12.getCount((long) 0);
        double double32 = frequency12.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        boolean boolean33 = frequency0.equals((java.lang.Object) frequency12);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        frequency35.addValue((java.lang.Comparable<java.lang.String>) "");
        long long39 = frequency35.getCumFreq((long) (short) -1);
        long long41 = frequency35.getCount(' ');
        double double43 = frequency35.getPct((long) 0);
        double double45 = frequency35.getPct((long) (byte) 0);
        double double46 = frequency0.getCumPct((java.lang.Object) double45);
        double double48 = frequency0.getPct(100);
        java.lang.String str49 = frequency0.toString();
        double double51 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getPct((long) 'a');
        double double15 = frequency0.getCumPct(1);
        double double17 = frequency0.getPct('4');
        long long18 = frequency0.getSumFreq();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(100L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        long long14 = frequency7.getCount('a');
        boolean boolean15 = frequency0.equals((java.lang.Object) frequency7);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        long long23 = frequency16.getCumFreq('4');
        long long25 = frequency16.getCount((int) (short) 1);
        long long27 = frequency16.getCount((int) (short) 1);
        long long29 = frequency16.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount('#');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        boolean boolean34 = frequency30.equals((java.lang.Object) frequency33);
        long long36 = frequency33.getCumFreq((int) (byte) 0);
        boolean boolean37 = frequency16.equals((java.lang.Object) (byte) 0);
        double double39 = frequency16.getPct((-1));
        frequency7.addValue((java.lang.Object) (-1));
        long long42 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        double double44 = frequency7.getCumPct(' ');
        double double46 = frequency7.getPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        java.lang.String str5 = frequency0.toString();
        long long7 = frequency0.getCumFreq(1);
        double double9 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getSumFreq();
        long long12 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getCumPct(1);
        long long9 = frequency0.getCumFreq((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor4 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        boolean boolean7 = frequency5.equals((java.lang.Object) 10L);
        frequency5.clear();
        double double10 = frequency5.getPct((int) (short) 100);
        double double12 = frequency5.getPct(' ');
        java.lang.String str13 = frequency5.toString();
        double double15 = frequency5.getPct(1);
        double double17 = frequency5.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long19 = frequency5.getCumFreq((int) (byte) 0);
        frequency5.addValue((java.lang.Integer) 1);
        long long23 = frequency5.getCumFreq((long) (short) -1);
        double double24 = frequency0.getCumPct((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertNotNull(wildcardComparableItor4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCount(' ');
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCount((int) ' ');
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        boolean boolean16 = frequency14.equals((java.lang.Object) 10L);
        frequency14.clear();
        double double19 = frequency14.getPct((int) (short) 100);
        long long21 = frequency14.getCumFreq('4');
        long long23 = frequency14.getCount((int) (short) 1);
        java.lang.String str24 = frequency14.toString();
        long long26 = frequency14.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency14.addValue((int) '#');
        double double30 = frequency14.getCumPct((int) (short) 0);
        long long32 = frequency14.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount('#');
        long long37 = frequency33.getCumFreq('a');
        long long39 = frequency33.getCumFreq((int) (byte) -1);
        boolean boolean40 = frequency14.equals((java.lang.Object) frequency33);
        long long42 = frequency14.getCumFreq((long) (byte) 1);
        boolean boolean43 = frequency0.equals((java.lang.Object) long42);
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        boolean boolean46 = frequency44.equals((java.lang.Object) 10L);
        frequency44.clear();
        double double49 = frequency44.getPct((int) (short) 100);
        double double51 = frequency44.getPct(' ');
        java.lang.String str52 = frequency44.toString();
        double double54 = frequency44.getPct(1);
        double double56 = frequency44.getCumPct((int) 'a');
        double double58 = frequency44.getPct('a');
        long long59 = frequency0.getCumFreq((java.lang.Object) 'a');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getCumPct((long) 0);
        double double7 = frequency0.getPct((int) (short) 100);
        double double9 = frequency0.getPct('a');
        long long11 = frequency0.getCumFreq((int) ' ');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((int) (short) -1);
        double double16 = frequency12.getPct((int) (short) 100);
        long long18 = frequency12.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean21 = frequency19.equals((java.lang.Object) 10L);
        frequency19.clear();
        double double24 = frequency19.getPct((int) (short) 100);
        long long26 = frequency19.getCumFreq('4');
        long long28 = frequency19.getCount((int) (short) 1);
        java.lang.String str29 = frequency19.toString();
        long long31 = frequency19.getCount(' ');
        long long32 = frequency12.getCumFreq((java.lang.Object) long31);
        frequency12.addValue('a');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        boolean boolean37 = frequency35.equals((java.lang.Object) 10L);
        frequency35.clear();
        double double40 = frequency35.getCumPct('4');
        double double41 = frequency12.getPct((java.lang.Object) double40);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        boolean boolean44 = frequency42.equals((java.lang.Object) 10L);
        frequency42.clear();
        double double47 = frequency42.getPct((int) (short) 100);
        double double49 = frequency42.getPct(' ');
        double double51 = frequency42.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        boolean boolean54 = frequency52.equals((java.lang.Object) 10L);
        frequency52.clear();
        double double57 = frequency52.getPct((int) (short) 100);
        long long59 = frequency52.getCumFreq('4');
        double double61 = frequency52.getCumPct((int) (short) 1);
        long long63 = frequency52.getCount(0L);
        double double65 = frequency52.getCumPct((long) (byte) -1);
        double double66 = frequency42.getPct((java.lang.Object) double65);
        long long67 = frequency12.getCount((java.lang.Object) double66);
        long long69 = frequency12.getCount(0L);
        frequency0.addValue((java.lang.Object) 0L);
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        boolean boolean73 = frequency71.equals((java.lang.Object) 10L);
        frequency71.clear();
        long long76 = frequency71.getCumFreq((int) (short) -1);
        boolean boolean77 = frequency0.equals((java.lang.Object) frequency71);
        frequency0.addValue(2L);
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        boolean boolean6 = frequency4.equals((java.lang.Object) 10L);
        frequency4.clear();
        double double9 = frequency4.getCumPct((long) 0);
        long long10 = frequency0.getCount((java.lang.Object) double9);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        double double15 = frequency11.getPct((int) ' ');
        double double17 = frequency11.getPct((int) 'a');
        long long19 = frequency11.getCumFreq('4');
        double double21 = frequency11.getCumPct('4');
        long long23 = frequency11.getCount((-1L));
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency24.valuesIterator();
        double double27 = frequency24.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        boolean boolean30 = frequency28.equals((java.lang.Object) 10L);
        frequency28.clear();
        double double33 = frequency28.getCumPct((long) 0);
        long long34 = frequency24.getCount((java.lang.Object) double33);
        double double36 = frequency24.getPct((int) (byte) 1);
        frequency24.addValue((java.lang.Integer) (-1));
        double double40 = frequency24.getCumPct((int) (short) -1);
        boolean boolean41 = frequency11.equals((java.lang.Object) (short) -1);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        boolean boolean44 = frequency42.equals((java.lang.Object) 10L);
        frequency42.clear();
        double double47 = frequency42.getPct((int) (short) 100);
        double double49 = frequency42.getPct(' ');
        java.lang.String str50 = frequency42.toString();
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor52 = frequency51.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        frequency53.addValue((java.lang.Comparable<java.lang.String>) "");
        long long56 = frequency51.getCumFreq((java.lang.Object) "");
        long long57 = frequency42.getCount((java.lang.Object) "");
        double double59 = frequency42.getCumPct((long) '4');
        long long61 = frequency42.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double62 = frequency11.getCumPct((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            long long63 = frequency0.getCount((java.lang.Object) frequency11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        frequency0.clear();
        double double16 = frequency0.getPct((int) ' ');
        long long17 = frequency0.getSumFreq();
        double double19 = frequency0.getPct('a');
        java.lang.String str20 = frequency0.toString();
        long long22 = frequency0.getCumFreq(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        boolean boolean5 = frequency0.equals((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency6.equals((java.lang.Object) 10L);
        frequency6.clear();
        double double11 = frequency6.getPct((int) (short) 100);
        frequency6.addValue((int) 'a');
        long long15 = frequency6.getCumFreq((long) (short) 1);
        double double17 = frequency6.getPct((long) (byte) 100);
        double double19 = frequency6.getPct((long) 'a');
        long long21 = frequency6.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long23 = frequency6.getCount('a');
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency6);
        long long26 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        boolean boolean29 = frequency27.equals((java.lang.Object) 10L);
        frequency27.clear();
        double double32 = frequency27.getPct((int) (short) 100);
        double double34 = frequency27.getPct(' ');
        long long36 = frequency27.getCumFreq('#');
        long long37 = frequency0.getCount((java.lang.Object) long36);
        frequency0.clear();
        long long40 = frequency0.getCount((long) '#');
        long long42 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency9.equals((java.lang.Object) 10L);
        frequency9.clear();
        double double14 = frequency9.getPct((int) (short) 100);
        frequency9.addValue((int) 'a');
        long long18 = frequency9.getCumFreq((long) (short) 1);
        double double20 = frequency9.getPct((long) (byte) 100);
        double double22 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "");
        double double23 = frequency0.getCumPct((java.lang.Object) "");
        double double25 = frequency0.getPct('a');
        java.lang.String str26 = frequency0.toString();
        java.lang.String str27 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency28.valuesIterator();
        long long31 = frequency28.getCumFreq((long) ' ');
        double double33 = frequency28.getPct('4');
        double double34 = frequency0.getPct((java.lang.Object) double33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getCumPct((int) 'a');
        double double14 = frequency0.getPct(10L);
        long long16 = frequency0.getCount((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        boolean boolean5 = frequency0.equals((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency6.equals((java.lang.Object) 10L);
        frequency6.clear();
        double double11 = frequency6.getPct((int) (short) 100);
        frequency6.addValue((int) 'a');
        long long15 = frequency6.getCumFreq((long) (short) 1);
        double double17 = frequency6.getPct((long) (byte) 100);
        double double19 = frequency6.getPct((long) 'a');
        long long21 = frequency6.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long23 = frequency6.getCount('a');
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency6);
        double double26 = frequency6.getCumPct('a');
        long long28 = frequency6.getCumFreq('4');
        frequency6.addValue(1L);
        frequency6.clear();
        long long32 = frequency6.getSumFreq();
        frequency6.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double36 = frequency6.getPct('4');
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        boolean boolean39 = frequency37.equals((java.lang.Object) 10L);
        frequency37.clear();
        double double42 = frequency37.getPct((int) (short) 100);
        long long44 = frequency37.getCumFreq('4');
        double double46 = frequency37.getCumPct((int) (short) 1);
        long long48 = frequency37.getCount(0L);
        double double50 = frequency37.getCumPct(1);
        long long52 = frequency37.getCount(0L);
        java.lang.String str53 = frequency37.toString();
        frequency37.clear();
        // The following exception was thrown during execution in test generation
        try {
            frequency6.addValue((java.lang.Object) frequency37);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        double double5 = frequency0.getCumPct(1);
        long long7 = frequency0.getCumFreq((long) (byte) 10);
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double11 = frequency0.getCumPct((-1));
        frequency0.clear();
        double double14 = frequency0.getCumPct((long) (short) 1);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        long long5 = frequency0.getSumFreq();
        frequency0.addValue((-1L));
        double double9 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        double double15 = frequency10.getPct((int) (short) 100);
        long long17 = frequency10.getCumFreq('4');
        long long19 = frequency10.getCount((int) (short) 1);
        java.lang.String str20 = frequency10.toString();
        long long22 = frequency10.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double24 = frequency10.getPct((java.lang.Object) (short) 100);
        double double26 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long28 = frequency10.getCount((long) 0);
        frequency10.clear();
        long long31 = frequency10.getCount(2L);
        double double33 = frequency10.getCumPct(' ');
        double double34 = frequency0.getCumPct((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((long) (short) 1);
        long long11 = frequency0.getSumFreq();
        java.lang.Object obj12 = null;
        double double13 = frequency0.getCumPct(obj12);
        long long14 = frequency0.getSumFreq();
        long long16 = frequency0.getCount(0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean19 = frequency17.equals((java.lang.Object) 10L);
        frequency17.clear();
        double double22 = frequency17.getPct((int) (short) 100);
        double double24 = frequency17.getPct(' ');
        long long26 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long28 = frequency17.getCumFreq((long) (short) 1);
        double double30 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double32 = frequency17.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount('#');
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        boolean boolean37 = frequency33.equals((java.lang.Object) frequency36);
        long long39 = frequency36.getCumFreq((int) (byte) 0);
        double double41 = frequency36.getCumPct((long) 'a');
        long long43 = frequency36.getCumFreq('#');
        long long44 = frequency17.getCount((java.lang.Object) long43);
        frequency17.addValue('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency17.valuesIterator();
        java.lang.String str48 = frequency17.toString();
        double double49 = frequency0.getCumPct((java.lang.Object) str48);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        boolean boolean52 = frequency50.equals((java.lang.Object) 10L);
        frequency50.clear();
        double double55 = frequency50.getPct((int) (short) 100);
        long long57 = frequency50.getCumFreq('4');
        long long59 = frequency50.getCount((int) (short) 1);
        long long61 = frequency50.getCount((int) (short) 1);
        long long63 = frequency50.getCount((java.lang.Object) (byte) 1);
        frequency50.clear();
        double double66 = frequency50.getPct((int) ' ');
        long long68 = frequency50.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double70 = frequency50.getPct(' ');
        double double72 = frequency50.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency50.addValue('a');
        long long76 = frequency50.getCumFreq((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency77 = new org.apache.commons.math.stat.Frequency();
        long long79 = frequency77.getCount('#');
        long long81 = frequency77.getCount((java.lang.Object) false);
        long long83 = frequency77.getCount((long) (-1));
        double double85 = frequency77.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double87 = frequency77.getCumPct(0);
        long long88 = frequency50.getCount((java.lang.Object) 0);
        long long89 = frequency0.getCumFreq((java.lang.Object) long88);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str48, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getPct((int) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getPct(2L);
        double double10 = frequency0.getCumPct(0L);
        long long11 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        frequency0.clear();
        double double16 = frequency0.getPct((int) ' ');
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency0.getPct(' ');
        long long22 = frequency0.getCumFreq('4');
        double double24 = frequency0.getPct((int) (byte) 1);
        frequency0.addValue('4');
        long long28 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t33%\t33%\n97\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getPct((java.lang.Object) (short) 100);
        frequency0.clear();
        double double17 = frequency0.getPct((long) '#');
        long long19 = frequency0.getCount((long) (byte) 1);
        double double21 = frequency0.getCumPct((-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (short) 1);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct(1);
        long long15 = frequency0.getCount(0L);
        long long17 = frequency0.getCumFreq((int) '4');
        long long19 = frequency0.getCumFreq((long) 0);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency20.equals((java.lang.Object) 10L);
        frequency20.clear();
        double double25 = frequency20.getPct((int) (short) 100);
        frequency20.addValue((int) 'a');
        long long29 = frequency20.getCumFreq((long) (short) 1);
        double double31 = frequency20.getPct((long) (byte) 100);
        double double33 = frequency20.getPct((long) 'a');
        long long35 = frequency20.getCumFreq('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor36 = frequency20.valuesIterator();
        frequency20.addValue((int) ' ');
        java.lang.String str39 = frequency20.toString();
        double double40 = frequency0.getCumPct((java.lang.Object) str39);
        long long42 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double4 = frequency0.getCumPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) 'a');
        frequency0.clear();
        double double9 = frequency0.getCumPct((int) '#');
        double double11 = frequency0.getPct((long) (short) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long15 = frequency0.getCumFreq((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getCumPct(' ');
        frequency0.addValue(1);
        double double17 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        double double19 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double21 = frequency0.getCumPct('a');
        long long22 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        boolean boolean5 = frequency0.equals((java.lang.Object) 1.0f);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        boolean boolean8 = frequency6.equals((java.lang.Object) 10L);
        frequency6.clear();
        double double11 = frequency6.getPct((int) (short) 100);
        frequency6.addValue((int) 'a');
        long long15 = frequency6.getCumFreq((long) (short) 1);
        double double17 = frequency6.getPct((long) (byte) 100);
        double double19 = frequency6.getPct((long) 'a');
        long long21 = frequency6.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long23 = frequency6.getCount('a');
        boolean boolean24 = frequency0.equals((java.lang.Object) frequency6);
        long long26 = frequency6.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        frequency6.clear();
        java.lang.String str28 = frequency6.toString();
        double double30 = frequency6.getPct((int) '4');
        long long32 = frequency6.getCount(' ');
        java.lang.String str33 = frequency6.toString();
        long long35 = frequency6.getCount(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getCumPct(1);
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.lang.Object obj9 = null;
        double double10 = frequency0.getPct(obj9);
        double double12 = frequency0.getPct(2L);
        long long14 = frequency0.getCount((long) (byte) 100);
        double double16 = frequency0.getCumPct((int) (byte) 100);
        double double18 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getCumPct((long) (byte) 0);
        double double6 = frequency0.getCumPct((long) (-1));
        long long8 = frequency0.getCumFreq((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency9.getCumFreq((long) (byte) 0);
        long long15 = frequency9.getCount('a');
        boolean boolean16 = frequency0.equals((java.lang.Object) frequency9);
        long long18 = frequency9.getCount((long) '#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount('#');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        boolean boolean23 = frequency19.equals((java.lang.Object) frequency22);
        long long25 = frequency19.getCumFreq('a');
        long long27 = frequency19.getCumFreq((long) (short) 100);
        frequency19.addValue('#');
        long long31 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long32 = frequency19.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCount('#');
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        boolean boolean37 = frequency33.equals((java.lang.Object) frequency36);
        long long39 = frequency33.getCumFreq('a');
        long long41 = frequency33.getCumFreq((long) (short) 100);
        frequency33.addValue('#');
        long long45 = frequency33.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long47 = frequency33.getCount((long) (byte) -1);
        long long49 = frequency33.getCumFreq((long) (byte) 1);
        boolean boolean50 = frequency19.equals((java.lang.Object) (byte) 1);
        long long52 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        boolean boolean53 = frequency9.equals((java.lang.Object) long52);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor4 = frequency0.valuesIterator();
        long long6 = frequency0.getCount((long) 100);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.clear();
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long13 = frequency0.getCumFreq((int) ' ');
        long long15 = frequency0.getCumFreq((int) 'a');
        frequency0.addValue(10);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertNotNull(wildcardComparableItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        double double15 = frequency10.getPct((int) (short) 100);
        long long17 = frequency10.getCumFreq('4');
        double double19 = frequency10.getCumPct((int) (short) 1);
        long long21 = frequency10.getCount(0L);
        double double23 = frequency10.getCumPct((long) (byte) -1);
        double double24 = frequency0.getPct((java.lang.Object) double23);
        double double26 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCount('#');
        long long31 = frequency27.getCumFreq('a');
        frequency27.addValue((long) (short) 0);
        long long35 = frequency27.getCount('a');
        double double37 = frequency27.getPct(100);
        double double39 = frequency27.getPct((long) (byte) -1);
        long long41 = frequency27.getCount(' ');
        double double42 = frequency0.getPct((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (short) 1);
        frequency0.clear();
        long long12 = frequency0.getCumFreq(0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount('#');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean17 = frequency13.equals((java.lang.Object) frequency16);
        long long19 = frequency16.getCumFreq((int) (byte) 0);
        long long20 = frequency16.getSumFreq();
        double double22 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency16.addValue((long) '4');
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency16);
        long long27 = frequency16.getCumFreq((int) ' ');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount('#');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        boolean boolean32 = frequency28.equals((java.lang.Object) frequency31);
        long long34 = frequency31.getCount('#');
        frequency31.addValue((long) 0);
        double double38 = frequency31.getPct((long) 0);
        double double40 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        long long41 = frequency16.getCount((java.lang.Object) double40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getPct((long) 'a');
        double double15 = frequency0.getCumPct(1);
        double double17 = frequency0.getPct('4');
        java.lang.String str18 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue(0L);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency11.equals((java.lang.Object) 10L);
        frequency11.clear();
        double double16 = frequency11.getPct((int) (short) 100);
        long long18 = frequency11.getCumFreq('4');
        long long20 = frequency11.getCount((int) (short) 1);
        long long22 = frequency11.getCount((int) (short) 1);
        long long24 = frequency11.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "");
        long long29 = frequency25.getCumFreq((long) (short) -1);
        long long31 = frequency25.getCount(' ');
        long long33 = frequency25.getCount(0);
        long long35 = frequency25.getCount((int) ' ');
        boolean boolean36 = frequency11.equals((java.lang.Object) frequency25);
        long long37 = frequency11.getSumFreq();
        double double39 = frequency11.getCumPct((long) (byte) 10);
        long long41 = frequency11.getCount((long) (short) 0);
        frequency11.addValue('a');
        // The following exception was thrown during execution in test generation
        try {
            long long44 = frequency0.getCount((java.lang.Object) frequency11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        frequency0.clear();
        double double16 = frequency0.getPct((int) ' ');
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency0.getPct(' ');
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.lang.String str23 = frequency0.toString();
        double double25 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double27 = frequency0.getCumPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        boolean boolean30 = frequency28.equals((java.lang.Object) 10L);
        frequency28.clear();
        double double33 = frequency28.getPct((int) (short) 100);
        long long35 = frequency28.getCumFreq('4');
        long long37 = frequency28.getCount((int) (short) 1);
        java.lang.String str38 = frequency28.toString();
        long long40 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double42 = frequency28.getPct((java.lang.Object) (short) 100);
        double double44 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        frequency45.addValue((java.lang.Comparable<java.lang.String>) "");
        long long49 = frequency45.getCumFreq((long) (short) -1);
        long long51 = frequency45.getCount(' ');
        double double53 = frequency45.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long55 = frequency45.getCount((int) (byte) -1);
        double double57 = frequency45.getPct((long) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor59 = frequency58.valuesIterator();
        frequency58.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor62 = frequency58.valuesIterator();
        long long64 = frequency58.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double65 = frequency45.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long66 = frequency28.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        boolean boolean69 = frequency67.equals((java.lang.Object) 10L);
        frequency67.clear();
        double double72 = frequency67.getPct((int) (short) 100);
        frequency67.addValue((int) 'a');
        long long76 = frequency67.getCumFreq((long) (short) 1);
        double double78 = frequency67.getPct((long) (byte) 100);
        double double80 = frequency67.getCumPct(' ');
        double double82 = frequency67.getCumPct('4');
        double double84 = frequency67.getPct((int) (byte) 0);
        double double86 = frequency67.getPct((int) (byte) 10);
        long long88 = frequency67.getCumFreq((long) (short) 10);
        double double89 = frequency28.getPct((java.lang.Object) long88);
        boolean boolean90 = frequency0.equals((java.lang.Object) frequency28);
        frequency0.addValue((java.lang.Integer) 1);
        long long94 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue(3L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor59);
        org.junit.Assert.assertNotNull(wildcardComparableItor62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getCumPct((int) (short) 100);
        double double5 = frequency0.getPct('4');
        double double7 = frequency0.getCumPct(' ');
        frequency0.addValue('4');
        frequency0.addValue('a');
        long long13 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double8 = frequency0.getPct((long) (short) 100);
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCount(' ');
        double double13 = frequency0.getCumPct((int) (byte) 100);
        double double15 = frequency0.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        frequency3.addValue((java.lang.Integer) 0);
        double double10 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency3.valuesIterator();
        long long13 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency3.valuesIterator();
        double double16 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long11 = frequency0.getCumFreq((long) (short) 1);
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency0.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCount('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency16.equals((java.lang.Object) frequency19);
        long long22 = frequency19.getCumFreq((int) (byte) 0);
        double double24 = frequency19.getCumPct((long) 'a');
        long long26 = frequency19.getCumFreq('#');
        long long27 = frequency0.getCount((java.lang.Object) long26);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency0.valuesIterator();
        java.lang.Comparable<java.lang.String> strComparable29 = null;
        double double30 = frequency0.getPct(strComparable29);
        double double32 = frequency0.getPct(100L);
        long long34 = frequency0.getCumFreq((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        frequency0.clear();
        long long14 = frequency0.getCount((-1));
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount(' ');
        long long21 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency17.valuesIterator();
        long long24 = frequency17.getCount((java.lang.Object) 10L);
        frequency17.addValue((long) (byte) 1);
        double double28 = frequency17.getPct((-1));
        double double30 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        boolean boolean33 = frequency31.equals((java.lang.Object) 10L);
        frequency31.clear();
        double double36 = frequency31.getPct((int) (short) 100);
        long long38 = frequency31.getCumFreq('4');
        double double40 = frequency31.getCumPct((int) (short) 1);
        long long42 = frequency31.getCount(0L);
        double double44 = frequency31.getCumPct(1);
        long long46 = frequency31.getCount(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency31.valuesIterator();
        double double49 = frequency31.getPct((long) (short) 100);
        frequency31.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        boolean boolean52 = frequency17.equals((java.lang.Object) frequency31);
        boolean boolean53 = frequency0.equals((java.lang.Object) frequency31);
        java.lang.String str54 = frequency31.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n\t1\t100%\t100%\n" + "'", str54, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n\t1\t100%\t100%\n");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (short) 1);
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCount((int) (short) 100);
        double double13 = frequency0.getCumPct((int) (short) 0);
        double double15 = frequency0.getPct((int) (byte) 10);
        long long16 = frequency0.getSumFreq();
        double double18 = frequency0.getPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((int) (short) -1);
        double double23 = frequency19.getPct((int) (short) 100);
        long long25 = frequency19.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        boolean boolean28 = frequency26.equals((java.lang.Object) 10L);
        frequency26.clear();
        double double31 = frequency26.getPct((int) (short) 100);
        long long33 = frequency26.getCumFreq('4');
        long long35 = frequency26.getCount((int) (short) 1);
        java.lang.String str36 = frequency26.toString();
        long long38 = frequency26.getCount(' ');
        long long39 = frequency19.getCumFreq((java.lang.Object) long38);
        frequency19.addValue('a');
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        boolean boolean44 = frequency42.equals((java.lang.Object) 10L);
        frequency42.clear();
        double double47 = frequency42.getCumPct('4');
        double double48 = frequency19.getPct((java.lang.Object) double47);
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        boolean boolean51 = frequency49.equals((java.lang.Object) 10L);
        frequency49.clear();
        double double54 = frequency49.getPct((int) (short) 100);
        double double56 = frequency49.getPct(' ');
        double double58 = frequency49.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency();
        boolean boolean61 = frequency59.equals((java.lang.Object) 10L);
        frequency59.clear();
        double double64 = frequency59.getPct((int) (short) 100);
        long long66 = frequency59.getCumFreq('4');
        double double68 = frequency59.getCumPct((int) (short) 1);
        long long70 = frequency59.getCount(0L);
        double double72 = frequency59.getCumPct((long) (byte) -1);
        double double73 = frequency49.getPct((java.lang.Object) double72);
        long long74 = frequency19.getCount((java.lang.Object) double73);
        double double76 = frequency19.getPct('4');
        // The following exception was thrown during execution in test generation
        try {
            long long77 = frequency0.getCumFreq((java.lang.Object) frequency19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double10 = frequency0.getCumPct((int) (short) 10);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double16 = frequency0.getPct((long) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        double double18 = frequency0.getCumPct(strComparable17);
        double double20 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        long long24 = frequency0.getCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCumFreq((int) (byte) 0);
        long long7 = frequency3.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        boolean boolean10 = frequency8.equals((java.lang.Object) 10L);
        frequency8.clear();
        double double13 = frequency8.getPct((int) (short) 100);
        double double15 = frequency8.getPct(' ');
        double double17 = frequency8.getPct('a');
        double double18 = frequency3.getPct((java.lang.Object) double17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency3.valuesIterator();
        double double21 = frequency3.getPct(1);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCount('#');
        double double26 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "");
        long long27 = frequency22.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount(' ');
        long long32 = frequency28.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor33 = frequency28.valuesIterator();
        double double35 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.lang.String str36 = frequency28.toString();
        frequency22.addValue((java.lang.Object) str36);
        double double39 = frequency22.getPct('4');
        double double41 = frequency22.getCumPct((-1));
        // The following exception was thrown during execution in test generation
        try {
            long long42 = frequency3.getCumFreq((java.lang.Object) frequency22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor33);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long8 = frequency0.getCumFreq((long) (-1));
        long long10 = frequency0.getCount((long) 10);
        java.lang.String str11 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getCumPct(' ');
        double double15 = frequency0.getCumPct('4');
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        double double21 = frequency0.getPct((long) 100);
        long long23 = frequency0.getCumFreq('a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n\t1\t100%\t100%\n");
        double double27 = frequency0.getPct('a');
        double double29 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        double double8 = frequency0.getCumPct('#');
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(' ');
        double double8 = frequency0.getPct((long) (byte) 1);
        frequency0.clear();
        long long11 = frequency0.getCumFreq((long) 1);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        boolean boolean14 = frequency12.equals((java.lang.Object) 10L);
        frequency12.clear();
        double double17 = frequency12.getPct((int) (short) 100);
        long long19 = frequency12.getCumFreq('4');
        long long21 = frequency12.getCount((int) (short) 1);
        java.lang.String str22 = frequency12.toString();
        long long24 = frequency12.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency12.getPct((java.lang.Object) (short) 100);
        double double28 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long30 = frequency12.getCount((long) 0);
        double double32 = frequency12.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        boolean boolean33 = frequency0.equals((java.lang.Object) frequency12);
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor40 = frequency39.valuesIterator();
        frequency39.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor43 = frequency39.valuesIterator();
        long long45 = frequency39.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double47 = frequency39.getPct(10);
        double double49 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        boolean boolean52 = frequency50.equals((java.lang.Object) 10L);
        frequency50.clear();
        double double55 = frequency50.getPct((int) (short) 100);
        frequency50.addValue((int) 'a');
        long long59 = frequency50.getCumFreq((long) (short) 1);
        double double61 = frequency50.getPct((long) (byte) 100);
        double double63 = frequency50.getPct((-1));
        java.lang.String str64 = frequency50.toString();
        long long66 = frequency50.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.lang.Class<?> wildcardClass67 = frequency50.getClass();
        boolean boolean68 = frequency39.equals((java.lang.Object) frequency50);
        double double69 = frequency0.getCumPct((java.lang.Object) boolean68);
        org.apache.commons.math.stat.Frequency frequency70 = new org.apache.commons.math.stat.Frequency();
        frequency70.addValue((java.lang.Comparable<java.lang.String>) "");
        long long74 = frequency70.getCumFreq((long) (short) -1);
        long long76 = frequency70.getCount(' ');
        long long78 = frequency70.getCount(0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor79 = frequency70.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long80 = frequency0.getCount((java.lang.Object) frequency70);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardComparableItor40);
        org.junit.Assert.assertNotNull(wildcardComparableItor43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n" + "'", str64, "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor79);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        boolean boolean6 = frequency4.equals((java.lang.Object) 10L);
        frequency4.clear();
        double double9 = frequency4.getCumPct((long) 0);
        long long10 = frequency0.getCount((java.lang.Object) double9);
        double double12 = frequency0.getPct((int) (byte) 1);
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((int) '#');
        double double16 = frequency0.getCumPct((int) (short) 0);
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency0.getCumPct(10L);
        frequency0.addValue(10L);
        double double24 = frequency0.getPct((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getCumPct(' ');
        double double15 = frequency0.getCumPct('4');
        double double17 = frequency0.getPct((int) (byte) 0);
        double double19 = frequency0.getPct((int) (byte) 10);
        long long21 = frequency0.getCumFreq((long) (short) 10);
        double double23 = frequency0.getCumPct((int) (short) 100);
        java.lang.String str24 = frequency0.toString();
        long long26 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        boolean boolean29 = frequency27.equals((java.lang.Object) 10L);
        frequency27.clear();
        double double32 = frequency27.getPct((int) (short) 100);
        double double34 = frequency27.getPct(' ');
        double double36 = frequency27.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        boolean boolean39 = frequency37.equals((java.lang.Object) 10L);
        frequency37.clear();
        double double42 = frequency37.getPct((int) (short) 100);
        long long44 = frequency37.getCumFreq('4');
        double double46 = frequency37.getCumPct((int) (short) 1);
        long long48 = frequency37.getCount(0L);
        double double50 = frequency37.getCumPct((long) (byte) -1);
        double double51 = frequency27.getPct((java.lang.Object) double50);
        double double53 = frequency27.getPct((int) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor54 = frequency27.valuesIterator();
        boolean boolean55 = frequency0.equals((java.lang.Object) frequency27);
        long long57 = frequency0.getCount(' ');
        double double59 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(wildcardComparableItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        double double14 = frequency7.getPct(' ');
        long long16 = frequency7.getCumFreq('#');
        double double18 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = frequency0.equals((java.lang.Object) frequency7);
        long long21 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.lang.String str22 = frequency7.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.addValue((java.lang.Integer) 0);
        long long18 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount('#');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency14.equals((java.lang.Object) frequency17);
        long long20 = frequency17.getCumFreq((int) (byte) 0);
        boolean boolean21 = frequency0.equals((java.lang.Object) (byte) 0);
        double double23 = frequency0.getPct((-1));
        double double25 = frequency0.getCumPct(' ');
        frequency0.addValue(0L);
        double double29 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        long long9 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long11 = frequency0.getCumFreq((long) (short) 1);
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long14 = frequency0.getSumFreq();
        long long16 = frequency0.getCount('4');
        long long18 = frequency0.getCumFreq((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency14.getCumFreq((long) (short) -1);
        long long20 = frequency14.getCount(' ');
        long long22 = frequency14.getCount(0);
        long long24 = frequency14.getCount((int) ' ');
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency14);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency14.valuesIterator();
        long long28 = frequency14.getCount(' ');
        long long30 = frequency14.getCumFreq((int) (short) 100);
        long long32 = frequency14.getCount((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount(' ');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long7 = frequency0.getCount((java.lang.Object) 10L);
        frequency0.addValue((long) (byte) 1);
        double double11 = frequency0.getPct((-1));
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((long) 10);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        long long23 = frequency16.getCumFreq('4');
        long long25 = frequency16.getCount((int) (short) 1);
        long long27 = frequency16.getCount((int) (short) 1);
        long long29 = frequency16.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount('#');
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        boolean boolean34 = frequency30.equals((java.lang.Object) frequency33);
        long long36 = frequency33.getCumFreq((int) (byte) 0);
        boolean boolean37 = frequency16.equals((java.lang.Object) (byte) 0);
        frequency16.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long41 = frequency16.getCumFreq('#');
        double double43 = frequency16.getCumPct((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = frequency0.getCumFreq((java.lang.Object) frequency16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long8 = frequency0.getCumFreq((long) (-1));
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long12 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        boolean boolean15 = frequency13.equals((java.lang.Object) 10L);
        frequency13.clear();
        double double18 = frequency13.getPct((int) (short) 100);
        double double20 = frequency13.getPct(' ');
        long long22 = frequency13.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long24 = frequency13.getCumFreq((long) (short) 1);
        double double26 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double28 = frequency13.getCumPct((long) (short) 0);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCount('#');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        boolean boolean33 = frequency29.equals((java.lang.Object) frequency32);
        long long35 = frequency32.getCumFreq((int) (byte) 0);
        double double37 = frequency32.getCumPct((long) 'a');
        long long39 = frequency32.getCumFreq('#');
        long long40 = frequency13.getCount((java.lang.Object) long39);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor41 = frequency13.valuesIterator();
        java.lang.Comparable<java.lang.String> strComparable42 = null;
        double double43 = frequency13.getPct(strComparable42);
        double double45 = frequency13.getPct(100L);
        long long46 = frequency0.getCount((java.lang.Object) double45);
        long long48 = frequency0.getCumFreq((long) '4');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor41);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(100L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        long long14 = frequency7.getCumFreq('4');
        long long16 = frequency7.getCount((int) (short) 1);
        long long18 = frequency7.getCount((int) (short) 1);
        long long20 = frequency7.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        frequency21.addValue((java.lang.Comparable<java.lang.String>) "");
        long long25 = frequency21.getCumFreq((long) (short) -1);
        long long27 = frequency21.getCount(' ');
        long long29 = frequency21.getCount(0);
        long long31 = frequency21.getCount((int) ' ');
        boolean boolean32 = frequency7.equals((java.lang.Object) frequency21);
        long long33 = frequency7.getSumFreq();
        double double35 = frequency7.getCumPct((long) (byte) 10);
        long long37 = frequency7.getCount((long) (short) 0);
        frequency7.clear();
        double double40 = frequency7.getPct('4');
        long long41 = frequency0.getCount((java.lang.Object) '4');
        double double43 = frequency0.getPct((int) (short) -1);
        double double45 = frequency0.getPct('a');
        double double47 = frequency0.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        boolean boolean50 = frequency48.equals((java.lang.Object) 10L);
        frequency48.clear();
        double double53 = frequency48.getPct((int) (short) 100);
        long long55 = frequency48.getCumFreq('4');
        long long57 = frequency48.getCount((int) (short) 1);
        long long59 = frequency48.getCount((int) (short) 1);
        long long61 = frequency48.getCount((java.lang.Object) (byte) 1);
        frequency48.clear();
        double double64 = frequency48.getPct((int) ' ');
        long long66 = frequency48.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double68 = frequency48.getPct(' ');
        double double70 = frequency48.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double72 = frequency48.getPct('4');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor73 = frequency48.valuesIterator();
        long long75 = frequency48.getCumFreq((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(wildcardComparableItor73);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency14.getCumFreq((long) (short) -1);
        long long20 = frequency14.getCount(' ');
        long long22 = frequency14.getCount(0);
        long long24 = frequency14.getCount((int) ' ');
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency14);
        long long26 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        frequency28.addValue((java.lang.Comparable<java.lang.String>) "");
        long long32 = frequency28.getCumFreq((long) (short) -1);
        long long34 = frequency28.getCumFreq(' ');
        long long36 = frequency28.getCumFreq((int) (byte) -1);
        frequency28.clear();
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor39 = frequency38.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor40 = frequency38.valuesIterator();
        long long41 = frequency38.getSumFreq();
        double double43 = frequency38.getPct((int) '4');
        frequency28.addValue((java.lang.Object) '4');
        frequency28.addValue('4');
        long long48 = frequency28.getCount(0L);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency28);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor39);
        org.junit.Assert.assertNotNull(wildcardComparableItor40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getPct((long) 10);
        double double6 = frequency0.getPct((int) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency9.equals((java.lang.Object) 10L);
        frequency9.clear();
        double double14 = frequency9.getPct((int) (short) 100);
        frequency9.addValue((int) 'a');
        long long18 = frequency9.getCumFreq((long) (short) 1);
        double double20 = frequency9.getPct((long) (byte) 100);
        frequency9.clear();
        long long23 = frequency9.getCumFreq((long) 'a');
        double double25 = frequency9.getPct((int) (byte) -1);
        boolean boolean26 = frequency0.equals((java.lang.Object) frequency9);
        double double28 = frequency0.getCumPct(0L);
        long long30 = frequency0.getCount(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency0.valuesIterator();
        long long33 = frequency0.getCount((int) (short) 10);
        java.lang.String str34 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n" + "'", str34, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        boolean boolean9 = frequency7.equals((java.lang.Object) 10L);
        frequency7.clear();
        double double12 = frequency7.getPct((int) (short) 100);
        double double14 = frequency7.getPct(' ');
        long long16 = frequency7.getCumFreq('#');
        double double18 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = frequency0.equals((java.lang.Object) frequency7);
        double double21 = frequency7.getCumPct((-1));
        long long23 = frequency7.getCumFreq((long) (byte) 1);
        frequency7.addValue((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency14.getCumFreq((long) (short) -1);
        long long20 = frequency14.getCount(' ');
        long long22 = frequency14.getCount(0);
        long long24 = frequency14.getCount((int) ' ');
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency14);
        long long26 = frequency0.getSumFreq();
        double double28 = frequency0.getCumPct((long) (byte) 10);
        long long30 = frequency0.getCount((long) (short) 0);
        frequency0.clear();
        frequency0.addValue(' ');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        boolean boolean36 = frequency34.equals((java.lang.Object) 10L);
        frequency34.clear();
        double double39 = frequency34.getPct((int) (short) 100);
        double double41 = frequency34.getPct(' ');
        java.lang.String str42 = frequency34.toString();
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency43.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        frequency45.addValue((java.lang.Comparable<java.lang.String>) "");
        long long48 = frequency43.getCumFreq((java.lang.Object) "");
        long long49 = frequency34.getCount((java.lang.Object) "");
        double double51 = frequency34.getPct((int) (byte) 100);
        double double53 = frequency34.getPct((long) (byte) -1);
        frequency34.addValue((java.lang.Integer) 0);
        double double56 = frequency0.getPct((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double4 = frequency0.getCumPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) 'a');
        frequency0.clear();
        double double9 = frequency0.getCumPct((int) '#');
        frequency0.addValue((int) (byte) 0);
        frequency0.addValue((-1L));
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        boolean boolean16 = frequency14.equals((java.lang.Object) 10L);
        frequency14.clear();
        double double19 = frequency14.getPct((int) (short) 100);
        double double21 = frequency14.getPct(' ');
        double double23 = frequency14.getPct('a');
        long long25 = frequency14.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj26 = null;
        double double27 = frequency14.getPct(obj26);
        boolean boolean28 = frequency0.equals(obj26);
        double double30 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.Class<?> wildcardClass31 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getCumPct((long) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        boolean boolean7 = frequency5.equals((java.lang.Object) 10L);
        frequency5.clear();
        double double10 = frequency5.getPct((int) (short) 100);
        double double12 = frequency5.getPct(' ');
        long long14 = frequency5.getCumFreq('#');
        double double16 = frequency5.getPct('4');
        double double17 = frequency0.getPct((java.lang.Object) '4');
        long long19 = frequency0.getCount('4');
        long long21 = frequency0.getCumFreq(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getCumPct(' ');
        double double15 = frequency0.getCumPct('4');
        frequency0.clear();
        frequency0.addValue((int) ' ');
        frequency0.clear();
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (short) 1);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct(1);
        long long15 = frequency0.getCount(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        double double18 = frequency0.getPct((long) (short) 100);
        long long20 = frequency0.getCount(' ');
        long long22 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.addValue((long) (byte) 0);
        double double10 = frequency0.getPct(100L);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double14 = frequency0.getCumPct((int) '4');
        double double16 = frequency0.getPct((int) (short) 0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency17.valuesIterator();
        frequency17.addValue((java.lang.Object) 100L);
        double double22 = frequency17.getCumPct(1);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        boolean boolean25 = frequency23.equals((java.lang.Object) 10L);
        frequency23.clear();
        double double28 = frequency23.getPct((int) (short) 100);
        long long30 = frequency23.getCumFreq('4');
        long long32 = frequency23.getCount((int) (short) 1);
        java.lang.String str33 = frequency23.toString();
        boolean boolean34 = frequency17.equals((java.lang.Object) str33);
        long long36 = frequency17.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double37 = frequency0.getPct((java.lang.Object) long36);
        long long39 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long41 = frequency0.getCumFreq((int) (short) 0);
        long long43 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double10 = frequency0.getCumPct((int) (short) 10);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getCumPct((int) (short) 10);
        long long16 = frequency0.getCumFreq((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean19 = frequency17.equals((java.lang.Object) 10L);
        frequency17.clear();
        double double22 = frequency17.getPct((int) (short) 100);
        double double24 = frequency17.getPct(' ');
        java.lang.String str25 = frequency17.toString();
        double double27 = frequency17.getPct(1);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        frequency28.addValue((java.lang.Comparable<java.lang.String>) "");
        double double32 = frequency28.getCumPct((long) (byte) 100);
        long long34 = frequency28.getCumFreq((long) 'a');
        long long36 = frequency28.getCount('4');
        long long37 = frequency17.getCount((java.lang.Object) long36);
        double double39 = frequency17.getCumPct('#');
        boolean boolean40 = frequency0.equals((java.lang.Object) frequency17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCumFreq((int) (byte) 0);
        long long7 = frequency3.getSumFreq();
        double double9 = frequency3.getPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        double double15 = frequency10.getPct((int) (short) 100);
        long long17 = frequency10.getCumFreq('4');
        frequency10.addValue(0L);
        double double21 = frequency10.getPct((long) 100);
        double double22 = frequency3.getPct((java.lang.Object) 100);
        frequency3.addValue(1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor25 = frequency3.valuesIterator();
        java.lang.Class<?> wildcardClass26 = wildcardComparableItor25.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(wildcardComparableItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getCumPct((int) (short) 100);
        double double5 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.addValue(1);
        long long11 = frequency0.getCount((long) 1);
        frequency0.addValue((int) (short) 1);
        long long15 = frequency0.getCumFreq('4');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCumFreq(' ');
        double double8 = frequency0.getPct('a');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct((int) (short) -1);
        long long15 = frequency0.getCount('#');
        long long17 = frequency0.getCount((int) '4');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency();
        long long4 = frequency2.getCount('#');
        boolean boolean5 = frequency0.equals((java.lang.Object) long4);
        double double7 = frequency0.getCumPct(2L);
        frequency0.clear();
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t2\t100%\t100%\n");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n\t1\t100%\t100%\n");
        long long14 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        long long6 = frequency0.getCumFreq((long) (byte) 1);
        java.lang.String str7 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        boolean boolean10 = frequency8.equals((java.lang.Object) 10L);
        frequency8.clear();
        double double13 = frequency8.getPct((int) (short) 100);
        frequency8.addValue((int) 'a');
        long long17 = frequency8.getCumFreq((long) (short) 1);
        double double19 = frequency8.getPct((long) (byte) 100);
        double double21 = frequency8.getCumPct(' ');
        double double23 = frequency8.getCumPct('4');
        frequency8.clear();
        frequency8.addValue((int) ' ');
        long long27 = frequency0.getCumFreq((java.lang.Object) ' ');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        boolean boolean30 = frequency28.equals((java.lang.Object) 10L);
        frequency28.clear();
        double double33 = frequency28.getPct((int) (short) 100);
        frequency28.addValue((int) 'a');
        long long37 = frequency28.getCumFreq((long) (short) 1);
        double double39 = frequency28.getPct((long) (byte) 100);
        double double41 = frequency28.getCumPct(' ');
        double double43 = frequency28.getPct((java.lang.Object) "");
        double double44 = frequency0.getPct((java.lang.Object) double43);
        double double46 = frequency0.getPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency0.valuesIterator();
        long long49 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct((-1));
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCumFreq((int) (short) 0);
        long long15 = frequency0.getCumFreq('4');
        long long17 = frequency0.getCumFreq((int) (byte) 10);
        long long19 = frequency0.getCumFreq((int) (byte) -1);
        double double21 = frequency0.getPct((long) (-1));
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency22.valuesIterator();
        frequency22.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor26 = frequency22.valuesIterator();
        double double28 = frequency22.getCumPct('4');
        long long30 = frequency22.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        double double32 = frequency22.getPct(10);
        double double34 = frequency22.getPct((-1));
        frequency22.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        boolean boolean39 = frequency37.equals((java.lang.Object) 10L);
        frequency37.clear();
        long long42 = frequency37.getCumFreq((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCount('#');
        long long47 = frequency43.getCount((java.lang.Object) false);
        double double48 = frequency37.getCumPct((java.lang.Object) long47);
        boolean boolean49 = frequency22.equals((java.lang.Object) frequency37);
        double double51 = frequency37.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double52 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long54 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertNotNull(wildcardComparableItor26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (short) 1);
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCount((int) (short) 100);
        long long13 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency14.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        boolean boolean20 = frequency18.equals((java.lang.Object) 10L);
        frequency18.clear();
        double double23 = frequency18.getPct((int) (short) 100);
        frequency18.addValue((int) 'a');
        long long27 = frequency18.getCumFreq((long) (short) 1);
        double double29 = frequency18.getPct((long) (byte) 100);
        double double31 = frequency18.getPct('a');
        boolean boolean32 = frequency14.equals((java.lang.Object) 'a');
        java.lang.String str33 = frequency14.toString();
        double double34 = frequency0.getPct((java.lang.Object) str33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCumFreq('a');
        frequency0.addValue(' ');
        double double8 = frequency0.getPct((long) (byte) 1);
        double double10 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        frequency0.addValue(0L);
        double double11 = frequency0.getPct((long) 100);
        frequency0.addValue((long) '#');
        frequency0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) (short) -1);
        double double7 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long8 = frequency0.getSumFreq();
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long12 = frequency0.getCumFreq((long) 10);
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        double double14 = frequency0.getCumPct(strComparable13);
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        frequency0.addValue(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        java.lang.Object obj7 = null;
        double double8 = frequency0.getCumPct(obj7);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        double double12 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        boolean boolean15 = frequency13.equals((java.lang.Object) 10L);
        frequency13.clear();
        double double18 = frequency13.getPct((int) (short) 100);
        long long20 = frequency13.getCumFreq('4');
        long long22 = frequency13.getCount((int) (short) 1);
        java.lang.String str23 = frequency13.toString();
        long long25 = frequency13.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double27 = frequency13.getPct((java.lang.Object) (short) 100);
        frequency13.clear();
        long long29 = frequency13.getSumFreq();
        double double31 = frequency13.getCumPct((long) 'a');
        frequency13.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCount('#');
        long long38 = frequency34.getCount((java.lang.Object) false);
        long long40 = frequency34.getCumFreq((java.lang.Object) (byte) 1);
        frequency34.addValue((long) (byte) 0);
        double double44 = frequency34.getPct(100L);
        long long46 = frequency34.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double48 = frequency34.getCumPct((int) '4');
        double double50 = frequency34.getPct((int) (short) 0);
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor52 = frequency51.valuesIterator();
        frequency51.addValue((java.lang.Object) 100L);
        double double56 = frequency51.getCumPct(1);
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency();
        boolean boolean59 = frequency57.equals((java.lang.Object) 10L);
        frequency57.clear();
        double double62 = frequency57.getPct((int) (short) 100);
        long long64 = frequency57.getCumFreq('4');
        long long66 = frequency57.getCount((int) (short) 1);
        java.lang.String str67 = frequency57.toString();
        boolean boolean68 = frequency51.equals((java.lang.Object) str67);
        long long70 = frequency51.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double71 = frequency34.getPct((java.lang.Object) long70);
        double double72 = frequency13.getCumPct((java.lang.Object) long70);
        long long73 = frequency0.getCumFreq((java.lang.Object) double72);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str67, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        double double9 = frequency0.getCumPct((int) (short) 1);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct(1);
        long long15 = frequency0.getCount(0L);
        java.lang.String str16 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency0.valuesIterator();
        double double19 = frequency0.getCumPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.addValue((-1L));
        double double6 = frequency0.getPct(' ');
        double double8 = frequency0.getCumPct((long) (short) 100);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((int) 'a');
        long long14 = frequency0.getCount(0);
        double double16 = frequency0.getPct(100L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        boolean boolean19 = frequency17.equals((java.lang.Object) 10L);
        frequency17.clear();
        double double22 = frequency17.getPct((int) (short) 100);
        frequency17.addValue((int) 'a');
        long long26 = frequency17.getCumFreq((long) (short) 1);
        double double28 = frequency17.getPct((long) (byte) 100);
        frequency17.clear();
        long long31 = frequency17.getCount((-1));
        frequency17.addValue('#');
        frequency17.clear();
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount('#');
        long long39 = frequency35.getCount((java.lang.Object) false);
        frequency35.clear();
        frequency35.addValue((long) 'a');
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency43.valuesIterator();
        frequency43.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency43.valuesIterator();
        long long49 = frequency43.getCount((long) 100);
        double double51 = frequency43.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double53 = frequency43.getCumPct(10);
        long long55 = frequency43.getCumFreq((long) (-1));
        double double56 = frequency35.getCumPct((java.lang.Object) (-1));
        long long58 = frequency35.getCount((int) '4');
        double double60 = frequency35.getPct((-1));
        double double61 = frequency17.getCumPct((java.lang.Object) (-1));
        long long62 = frequency0.getCount((java.lang.Object) (-1));
        double double64 = frequency0.getPct((int) '4');
        frequency0.addValue((long) 100);
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        frequency67.addValue((java.lang.Comparable<java.lang.String>) "");
        long long71 = frequency67.getCumFreq((long) (short) -1);
        long long73 = frequency67.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor75 = frequency74.valuesIterator();
        double double77 = frequency74.getCumPct((int) (short) 100);
        long long79 = frequency74.getCount((int) (short) 1);
        long long81 = frequency74.getCumFreq((long) (byte) 0);
        long long83 = frequency74.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor84 = frequency74.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency85 = new org.apache.commons.math.stat.Frequency();
        long long87 = frequency85.getCount('#');
        double double89 = frequency85.getPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean90 = frequency74.equals((java.lang.Object) double89);
        double double91 = frequency67.getPct((java.lang.Object) boolean90);
        long long92 = frequency67.getSumFreq();
        long long94 = frequency67.getCumFreq(' ');
        long long95 = frequency0.getCount((java.lang.Object) long94);
        frequency0.addValue(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor75);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor84);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        frequency0.addValue(0L);
        double double11 = frequency0.getPct((long) 100);
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long15 = frequency0.getCount(0);
        double double17 = frequency0.getCumPct((int) (byte) -1);
        frequency0.addValue((long) (byte) 0);
        long long21 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        java.lang.String str12 = frequency0.toString();
        double double14 = frequency0.getPct(' ');
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor24 = frequency21.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        boolean boolean27 = frequency25.equals((java.lang.Object) 10L);
        frequency25.clear();
        double double30 = frequency25.getPct((int) (short) 100);
        frequency25.addValue((int) 'a');
        long long34 = frequency25.getCumFreq((long) (short) 1);
        double double36 = frequency25.getPct((long) (byte) 100);
        double double38 = frequency25.getPct('a');
        boolean boolean39 = frequency21.equals((java.lang.Object) 'a');
        long long41 = frequency21.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n");
        frequency0.addValue((java.lang.Object) long41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        long long5 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long7 = frequency0.getCount((long) 0);
        java.lang.Object obj8 = null;
        double double9 = frequency0.getCumPct(obj8);
        long long11 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long12 = frequency0.getCumFreq((long) (byte) -1);
        long long14 = frequency0.getCumFreq((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((long) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCumFreq(' ');
        double double12 = frequency0.getPct((-1));
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getPct((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        boolean boolean19 = frequency15.equals((java.lang.Object) frequency18);
        long long21 = frequency15.getCumFreq('a');
        long long23 = frequency15.getCumFreq((long) (short) 100);
        frequency15.addValue('#');
        boolean boolean26 = frequency0.equals((java.lang.Object) frequency15);
        long long28 = frequency0.getCount((-1));
        long long30 = frequency0.getCumFreq('a');
        frequency0.addValue(' ');
        double double34 = frequency0.getPct('a');
        double double36 = frequency0.getPct('a');
        long long38 = frequency0.getCount((int) (short) 1);
        double double40 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getCumPct((long) (byte) 0);
        double double6 = frequency0.getCumPct((long) (-1));
        long long8 = frequency0.getCumFreq((long) (short) 10);
        double double10 = frequency0.getPct((long) (short) -1);
        long long12 = frequency0.getCumFreq(0);
        java.lang.String str13 = frequency0.toString();
        long long15 = frequency0.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.addValue((-1L));
        double double6 = frequency0.getCumPct((int) (short) 1);
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        frequency0.addValue((-1));
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        long long11 = frequency0.getCount((int) (short) 1);
        long long13 = frequency0.getCount((java.lang.Object) (byte) 1);
        frequency0.clear();
        long long16 = frequency0.getCumFreq(' ');
        double double18 = frequency0.getPct(' ');
        long long19 = frequency0.getSumFreq();
        java.lang.Class<?> wildcardClass20 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getCumPct((long) 0);
        double double7 = frequency0.getPct((int) (short) 100);
        double double9 = frequency0.getPct('a');
        long long11 = frequency0.getCumFreq((int) ' ');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((int) (short) -1);
        double double16 = frequency12.getPct((int) (short) 100);
        long long18 = frequency12.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        boolean boolean21 = frequency19.equals((java.lang.Object) 10L);
        frequency19.clear();
        double double24 = frequency19.getPct((int) (short) 100);
        long long26 = frequency19.getCumFreq('4');
        long long28 = frequency19.getCount((int) (short) 1);
        java.lang.String str29 = frequency19.toString();
        long long31 = frequency19.getCount(' ');
        long long32 = frequency12.getCumFreq((java.lang.Object) long31);
        frequency12.addValue('a');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        boolean boolean37 = frequency35.equals((java.lang.Object) 10L);
        frequency35.clear();
        double double40 = frequency35.getCumPct('4');
        double double41 = frequency12.getPct((java.lang.Object) double40);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        boolean boolean44 = frequency42.equals((java.lang.Object) 10L);
        frequency42.clear();
        double double47 = frequency42.getPct((int) (short) 100);
        double double49 = frequency42.getPct(' ');
        double double51 = frequency42.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        boolean boolean54 = frequency52.equals((java.lang.Object) 10L);
        frequency52.clear();
        double double57 = frequency52.getPct((int) (short) 100);
        long long59 = frequency52.getCumFreq('4');
        double double61 = frequency52.getCumPct((int) (short) 1);
        long long63 = frequency52.getCount(0L);
        double double65 = frequency52.getCumPct((long) (byte) -1);
        double double66 = frequency42.getPct((java.lang.Object) double65);
        long long67 = frequency12.getCount((java.lang.Object) double66);
        long long69 = frequency12.getCount(0L);
        frequency0.addValue((java.lang.Object) 0L);
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        boolean boolean73 = frequency71.equals((java.lang.Object) 10L);
        frequency71.clear();
        long long76 = frequency71.getCumFreq((int) (short) -1);
        boolean boolean77 = frequency0.equals((java.lang.Object) frequency71);
        double double79 = frequency71.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long80 = frequency71.getSumFreq();
        frequency71.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        double double13 = frequency0.getPct((-1));
        double double15 = frequency0.getPct((-1));
        frequency0.addValue((java.lang.Integer) 1);
        double double19 = frequency0.getCumPct('a');
        double double21 = frequency0.getCumPct((int) (short) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency0.valuesIterator();
        java.lang.Class<?> wildcardClass23 = wildcardComparableItor22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor4 = frequency0.valuesIterator();
        long long6 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double8 = frequency0.getPct(10);
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long12 = frequency0.getCumFreq('a');
        java.lang.String str13 = frequency0.toString();
        double double15 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency18.equals((java.lang.Object) frequency21);
        long long24 = frequency18.getCumFreq((long) ' ');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount('#');
        long long29 = frequency25.getCumFreq('a');
        frequency25.addValue((long) (short) 0);
        double double33 = frequency25.getPct((long) 100);
        double double35 = frequency25.getPct((long) 0);
        long long36 = frequency18.getCumFreq((java.lang.Object) 0);
        double double38 = frequency18.getPct((long) 10);
        long long40 = frequency18.getCumFreq((long) (short) 0);
        double double41 = frequency0.getPct((java.lang.Object) long40);
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertNotNull(wildcardComparableItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        long long8 = frequency3.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency9.getCumFreq((long) (short) -1);
        long long15 = frequency9.getCount(' ');
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str18 = frequency9.toString();
        double double20 = frequency9.getPct((-1));
        long long21 = frequency3.getCumFreq((java.lang.Object) (-1));
        double double23 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nValue \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount(' ');
        long long4 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        frequency0.addValue((int) (byte) 10);
        long long9 = frequency0.getCumFreq(' ');
        long long11 = frequency0.getCumFreq((long) (byte) 1);
        double double13 = frequency0.getPct((int) (short) 100);
        double double15 = frequency0.getCumPct('a');
        frequency0.addValue((java.lang.Integer) 0);
        long long19 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        frequency0.addValue(100);
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getPct((java.lang.Object) (short) 100);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long18 = frequency0.getCount((long) 0);
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount('#');
        long long25 = frequency21.getCount((java.lang.Object) false);
        long long27 = frequency21.getCumFreq((java.lang.Object) (byte) 1);
        boolean boolean28 = frequency0.equals((java.lang.Object) (byte) 1);
        long long30 = frequency0.getCumFreq((long) (-1));
        frequency0.addValue((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor4 = frequency0.valuesIterator();
        long long6 = frequency0.getCount((long) 100);
        frequency0.clear();
        frequency0.addValue(100L);
        double double11 = frequency0.getCumPct(0L);
        java.lang.String str12 = frequency0.toString();
        double double14 = frequency0.getCumPct(0L);
        long long16 = frequency0.getCount((int) (byte) -1);
        long long17 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount(' ');
        long long22 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency18.valuesIterator();
        frequency18.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        boolean boolean28 = frequency26.equals((java.lang.Object) 10L);
        frequency26.clear();
        double double31 = frequency26.getPct((int) (short) 100);
        frequency26.addValue((int) 'a');
        long long35 = frequency26.getCumFreq((long) (short) 1);
        double double37 = frequency26.getCumPct(0L);
        double double39 = frequency26.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double41 = frequency26.getCumPct((long) (byte) -1);
        double double43 = frequency26.getCumPct((int) (short) 1);
        double double45 = frequency26.getCumPct((long) 0);
        long long46 = frequency18.getCumFreq((java.lang.Object) 0);
        long long48 = frequency18.getCount(' ');
        boolean boolean49 = frequency0.equals((java.lang.Object) frequency18);
        frequency0.addValue((int) (byte) 0);
        frequency0.clear();
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertNotNull(wildcardComparableItor4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getCumPct((int) (short) -1);
        double double7 = frequency3.getPct((int) (short) 100);
        long long9 = frequency3.getCumFreq('#');
        boolean boolean10 = frequency0.equals((java.lang.Object) long9);
        frequency0.clear();
        double double13 = frequency0.getPct((int) (short) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((java.lang.Object) (byte) 1);
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue('a');
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getCumPct('4');
        double double15 = frequency0.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        boolean boolean18 = frequency16.equals((java.lang.Object) 10L);
        frequency16.clear();
        double double21 = frequency16.getPct((int) (short) 100);
        frequency16.addValue((int) 'a');
        long long25 = frequency16.getCumFreq((long) (short) 1);
        double double27 = frequency16.getPct((long) (byte) 100);
        double double29 = frequency16.getPct((long) 'a');
        double double31 = frequency16.getCumPct(1);
        long long32 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass33 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCount((long) (-1));
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double10 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        long long8 = frequency0.getCumFreq((long) (short) 100);
        frequency0.addValue('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.lang.String str13 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCount('#');
        long long18 = frequency14.getCumFreq('a');
        long long20 = frequency14.getCumFreq((long) (byte) 1);
        java.lang.String str21 = frequency14.toString();
        long long23 = frequency14.getCumFreq('#');
        long long25 = frequency14.getCount(0);
        double double26 = frequency0.getCumPct((java.lang.Object) 0);
        double double28 = frequency0.getCumPct('a');
        double double30 = frequency0.getCumPct((int) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.clear();
        long long3 = frequency0.getCumFreq((long) (short) 1);
        long long5 = frequency0.getCumFreq(2L);
        long long7 = frequency0.getCumFreq((int) (short) -1);
        frequency0.clear();
        double double10 = frequency0.getCumPct((int) '4');
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t50%\t50%\n97\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((long) (short) 1);
        double double11 = frequency0.getPct((long) (byte) 100);
        long long13 = frequency0.getCount(100);
        double double15 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long19 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        double double21 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        long long8 = frequency0.getCumFreq((long) (short) 100);
        long long10 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency11.equals((java.lang.Object) 10L);
        frequency11.clear();
        double double16 = frequency11.getPct((int) (short) 100);
        long long18 = frequency11.getCumFreq('4');
        long long20 = frequency11.getCount((int) (short) 1);
        long long22 = frequency11.getCount((int) (short) 1);
        long long24 = frequency11.getCount((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount('#');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        boolean boolean29 = frequency25.equals((java.lang.Object) frequency28);
        long long31 = frequency28.getCumFreq((int) (byte) 0);
        boolean boolean32 = frequency11.equals((java.lang.Object) (byte) 0);
        frequency11.addValue((int) '4');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCount(' ');
        long long39 = frequency35.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor40 = frequency35.valuesIterator();
        frequency35.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        boolean boolean45 = frequency43.equals((java.lang.Object) 10L);
        frequency43.addValue((-1L));
        double double49 = frequency43.getPct(' ');
        frequency43.addValue((java.lang.Integer) 0);
        long long53 = frequency43.getCount('a');
        long long54 = frequency35.getCount((java.lang.Object) 'a');
        frequency35.addValue((long) (byte) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor57 = frequency35.valuesIterator();
        boolean boolean58 = frequency11.equals((java.lang.Object) wildcardComparableItor57);
        boolean boolean59 = frequency0.equals((java.lang.Object) boolean58);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCount('#');
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency();
        boolean boolean66 = frequency62.equals((java.lang.Object) frequency65);
        long long68 = frequency65.getCount('#');
        long long70 = frequency65.getCumFreq((int) (byte) 10);
        double double72 = frequency65.getPct('4');
        double double74 = frequency65.getCumPct(10L);
        boolean boolean75 = frequency0.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        long long8 = frequency0.getSumFreq();
        long long10 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        long long6 = frequency0.getCumFreq((long) (short) 1);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency0.getPct((-1));
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCumFreq((int) (short) 0);
        long long15 = frequency0.getCumFreq('4');
        long long17 = frequency0.getCumFreq((int) (byte) 10);
        long long19 = frequency0.getCumFreq((int) (byte) -1);
        double double21 = frequency0.getCumPct('4');
        double double23 = frequency0.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        long long8 = frequency0.getCumFreq((long) (short) 100);
        frequency0.addValue('#');
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue('a');
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        frequency18.addValue((java.lang.Comparable<java.lang.String>) "");
        double double22 = frequency18.getPct(' ');
        double double24 = frequency18.getPct('#');
        double double26 = frequency18.getPct((int) (byte) 100);
        long long27 = frequency0.getCount((java.lang.Object) (byte) 100);
        long long29 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\na\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getCumPct((int) (short) 100);
        double double5 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        boolean boolean10 = frequency8.equals((java.lang.Object) 10L);
        frequency8.clear();
        double double13 = frequency8.getPct((int) (short) 100);
        double double15 = frequency8.getPct(' ');
        java.lang.String str16 = frequency8.toString();
        double double18 = frequency8.getPct(1);
        double double20 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency8.addValue((java.lang.Integer) 10);
        double double24 = frequency8.getCumPct((int) (byte) 100);
        long long26 = frequency8.getCumFreq('#');
        double double28 = frequency8.getPct(' ');
        // The following exception was thrown during execution in test generation
        try {
            double double29 = frequency0.getPct((java.lang.Object) frequency8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        double double7 = frequency0.getPct(' ');
        java.lang.String str8 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor10 = frequency9.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        long long14 = frequency9.getCumFreq((java.lang.Object) "");
        long long15 = frequency0.getCount((java.lang.Object) "");
        double double17 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        boolean boolean22 = frequency18.equals((java.lang.Object) frequency21);
        long long24 = frequency18.getCumFreq('a');
        long long26 = frequency18.getCumFreq((long) (short) 100);
        frequency18.addValue('#');
        double double29 = frequency0.getCumPct((java.lang.Object) '#');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency30.valuesIterator();
        double double33 = frequency30.getCumPct((int) (short) 100);
        long long35 = frequency30.getCount((int) (short) 1);
        frequency30.addValue((long) (byte) 100);
        double double39 = frequency30.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long40 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double42 = frequency0.getCumPct(1);
        double double44 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor6 = frequency5.valuesIterator();
        double double8 = frequency5.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency9.equals((java.lang.Object) 10L);
        frequency9.clear();
        double double14 = frequency9.getCumPct((long) 0);
        long long15 = frequency5.getCount((java.lang.Object) double14);
        double double17 = frequency5.getPct((int) (byte) 1);
        boolean boolean18 = frequency0.equals((java.lang.Object) frequency5);
        frequency5.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount('#');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        boolean boolean25 = frequency21.equals((java.lang.Object) frequency24);
        long long27 = frequency24.getCount('#');
        long long29 = frequency24.getCumFreq((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        frequency30.addValue((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency30.getCumPct((long) (byte) 100);
        long long36 = frequency30.getCumFreq((long) 'a');
        boolean boolean37 = frequency24.equals((java.lang.Object) long36);
        double double39 = frequency24.getCumPct(0);
        double double40 = frequency5.getPct((java.lang.Object) 0);
        frequency5.clear();
        frequency5.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCumFreq(' ');
        long long8 = frequency0.getCount((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCount('#');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency9.equals((java.lang.Object) frequency12);
        long long15 = frequency9.getCumFreq('a');
        long long17 = frequency9.getCumFreq((long) (short) 100);
        frequency9.addValue('#');
        long long21 = frequency9.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency9.addValue('a');
        long long25 = frequency9.getCumFreq(0L);
        double double26 = frequency0.getPct((java.lang.Object) long25);
        double double28 = frequency0.getCumPct(10);
        double double30 = frequency0.getCumPct((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        double double5 = frequency0.getPct((int) (short) 100);
        long long7 = frequency0.getCumFreq('4');
        long long9 = frequency0.getCount((int) (short) 1);
        java.lang.String str10 = frequency0.toString();
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency0.getPct((java.lang.Object) (short) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        boolean boolean17 = frequency15.equals((java.lang.Object) 10L);
        frequency15.clear();
        double double20 = frequency15.getPct((int) (short) 100);
        long long22 = frequency15.getCumFreq('4');
        long long24 = frequency15.getCount((int) (short) 1);
        java.lang.String str25 = frequency15.toString();
        long long27 = frequency15.getCount(' ');
        frequency15.clear();
        long long30 = frequency15.getCount(' ');
        long long31 = frequency0.getCount((java.lang.Object) long30);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        boolean boolean34 = frequency32.equals((java.lang.Object) 10L);
        frequency32.clear();
        double double37 = frequency32.getPct((int) (short) 100);
        long long39 = frequency32.getCumFreq('4');
        long long41 = frequency32.getCount('4');
        long long43 = frequency32.getCount((int) (byte) 1);
        long long45 = frequency32.getCount((int) (short) -1);
        long long47 = frequency32.getCumFreq((long) (short) 10);
        double double49 = frequency32.getCumPct('a');
        long long50 = frequency0.getCount((java.lang.Object) double49);
        double double52 = frequency0.getCumPct((int) (byte) 100);
        double double54 = frequency0.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        long long4 = frequency0.getCount((java.lang.Object) false);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount('#');
        long long10 = frequency6.getCount((java.lang.Object) false);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        long long15 = frequency11.getCumFreq((long) (short) -1);
        boolean boolean17 = frequency11.equals((java.lang.Object) 100);
        double double18 = frequency6.getCumPct((java.lang.Object) 100);
        double double20 = frequency6.getCumPct((int) (short) 0);
        long long22 = frequency6.getCumFreq(10);
        double double23 = frequency0.getCumPct((java.lang.Object) 10);
        frequency0.addValue('4');
        long long27 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (byte) 0);
        long long6 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double8 = frequency0.getCumPct((long) (short) -1);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency11.equals((java.lang.Object) 10L);
        frequency11.clear();
        double double16 = frequency11.getPct((int) (short) 100);
        long long18 = frequency11.getCumFreq('4');
        double double20 = frequency11.getCumPct((int) (short) 1);
        long long22 = frequency11.getCount(0L);
        double double24 = frequency11.getCumPct(1);
        frequency11.addValue(' ');
        double double27 = frequency0.getCumPct((java.lang.Object) ' ');
        boolean boolean29 = frequency0.equals((java.lang.Object) (-1.0f));
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCount('#');
        long long34 = frequency30.getCount((java.lang.Object) false);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor36 = frequency35.valuesIterator();
        double double38 = frequency35.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        boolean boolean41 = frequency39.equals((java.lang.Object) 10L);
        frequency39.clear();
        double double44 = frequency39.getCumPct((long) 0);
        long long45 = frequency35.getCount((java.lang.Object) double44);
        double double47 = frequency35.getPct((int) (byte) 1);
        boolean boolean48 = frequency30.equals((java.lang.Object) frequency35);
        frequency35.addValue((long) 100);
        java.lang.String str51 = frequency35.toString();
        long long53 = frequency35.getCount((long) (short) 1);
        boolean boolean54 = frequency0.equals((java.lang.Object) frequency35);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor36);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency0.getCumFreq('a');
        long long8 = frequency0.getCumFreq((long) (short) 100);
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        boolean boolean13 = frequency11.equals((java.lang.Object) 10L);
        frequency11.clear();
        double double16 = frequency11.getPct((int) (short) 100);
        frequency11.addValue((int) 'a');
        long long20 = frequency11.getCumFreq((long) (short) 1);
        double double22 = frequency11.getPct((long) (byte) 100);
        double double24 = frequency11.getPct((long) 'a');
        long long26 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long28 = frequency11.getCount('a');
        double double29 = frequency0.getPct((java.lang.Object) long28);
        double double31 = frequency0.getPct((int) (byte) 0);
        long long33 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        long long34 = frequency0.getSumFreq();
        double double36 = frequency0.getPct((int) (short) 100);
        long long38 = frequency0.getCount(100);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        boolean boolean41 = frequency39.equals((java.lang.Object) 10L);
        frequency39.clear();
        double double44 = frequency39.getPct((int) (short) 100);
        frequency39.addValue((int) 'a');
        long long48 = frequency39.getCumFreq((long) (short) 1);
        double double50 = frequency39.getPct((long) (byte) 100);
        long long52 = frequency39.getCount(100);
        long long54 = frequency39.getCumFreq((-1));
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCount(' ');
        long long59 = frequency55.getCount((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor60 = frequency55.valuesIterator();
        frequency55.addValue((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency();
        boolean boolean65 = frequency63.equals((java.lang.Object) 10L);
        frequency63.addValue((-1L));
        double double69 = frequency63.getPct(' ');
        frequency63.addValue((java.lang.Integer) 0);
        long long73 = frequency63.getCount('a');
        long long74 = frequency55.getCount((java.lang.Object) 'a');
        frequency55.addValue((long) (byte) 0);
        double double78 = frequency55.getPct((int) (short) 10);
        double double79 = frequency39.getCumPct((java.lang.Object) double78);
        double double81 = frequency39.getCumPct('a');
        long long83 = frequency39.getCumFreq((long) 10);
        boolean boolean84 = frequency0.equals((java.lang.Object) 10);
        double double86 = frequency0.getPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.5d + "'", double78 == 0.5d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        long long6 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor8 = frequency7.valuesIterator();
        double double10 = frequency7.getCumPct((int) (short) 100);
        long long12 = frequency7.getCount((int) (short) 1);
        long long14 = frequency7.getCumFreq((long) (byte) 0);
        long long16 = frequency7.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor17 = frequency7.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount('#');
        double double22 = frequency18.getPct((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = frequency7.equals((java.lang.Object) double22);
        double double24 = frequency0.getPct((java.lang.Object) boolean23);
        long long26 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency27.valuesIterator();
        double double30 = frequency27.getCumPct((int) (short) 100);
        frequency27.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor32 = frequency27.valuesIterator();
        boolean boolean33 = frequency0.equals((java.lang.Object) wildcardComparableItor32);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardComparableItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor1 = frequency0.valuesIterator();
        double double3 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        boolean boolean6 = frequency4.equals((java.lang.Object) 10L);
        frequency4.clear();
        double double9 = frequency4.getCumPct((long) 0);
        long long10 = frequency0.getCount((java.lang.Object) double9);
        double double12 = frequency0.getPct((int) (byte) 1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCount('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        boolean boolean19 = frequency15.equals((java.lang.Object) frequency18);
        long long21 = frequency15.getCumFreq((long) ' ');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCount('#');
        long long26 = frequency22.getCumFreq('a');
        frequency22.addValue((long) (short) 0);
        double double30 = frequency22.getPct((long) 100);
        double double32 = frequency22.getPct((long) 0);
        long long33 = frequency15.getCumFreq((java.lang.Object) 0);
        double double35 = frequency15.getPct((long) 10);
        boolean boolean36 = frequency0.equals((java.lang.Object) double35);
        double double38 = frequency0.getPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        boolean boolean41 = frequency39.equals((java.lang.Object) 10L);
        frequency39.clear();
        double double44 = frequency39.getPct((int) (short) 100);
        long long46 = frequency39.getCumFreq('4');
        long long48 = frequency39.getCount((int) (short) 1);
        java.lang.String str49 = frequency39.toString();
        long long51 = frequency39.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        frequency39.addValue((int) '#');
        double double55 = frequency39.getPct((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor57 = frequency56.valuesIterator();
        frequency56.addValue((java.lang.Object) 100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor60 = frequency56.valuesIterator();
        long long62 = frequency56.getCount((long) 100);
        double double64 = frequency56.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double66 = frequency56.getCumPct(10);
        long long68 = frequency56.getCumFreq((long) (-1));
        long long69 = frequency39.getCount((java.lang.Object) (-1));
        double double70 = frequency0.getCumPct((java.lang.Object) (-1));
        long long72 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n97\t1\t50%\t100%\n");
        long long74 = frequency0.getCount((long) (short) 1);
        frequency0.addValue('4');
        org.junit.Assert.assertNotNull(wildcardComparableItor1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor57);
        org.junit.Assert.assertNotNull(wildcardComparableItor60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        double double4 = frequency0.getCumPct((long) (byte) 100);
        long long6 = frequency0.getCumFreq((long) 'a');
        frequency0.clear();
        double double9 = frequency0.getCumPct((int) '#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        long long4 = frequency0.getCumFreq((long) (short) -1);
        boolean boolean6 = frequency0.equals((java.lang.Object) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor7 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((int) (short) -1);
        double double12 = frequency8.getCumPct((long) (byte) 0);
        double double14 = frequency8.getCumPct((long) (-1));
        long long16 = frequency8.getCumFreq((long) (short) 10);
        long long17 = frequency0.getCumFreq((java.lang.Object) long16);
        long long19 = frequency0.getCumFreq((-1));
        java.lang.Class<?> wildcardClass20 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor7);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        long long8 = frequency3.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency9.getCumFreq((long) (short) -1);
        long long15 = frequency9.getCount(' ');
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str18 = frequency9.toString();
        double double20 = frequency9.getPct((-1));
        long long21 = frequency3.getCumFreq((java.lang.Object) (-1));
        frequency3.addValue((java.lang.Integer) 0);
        double double25 = frequency3.getPct((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) (byte) 100);
        frequency0.addValue((int) 'a');
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        double double11 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        boolean boolean14 = frequency12.equals((java.lang.Object) 10L);
        frequency12.clear();
        double double17 = frequency12.getPct((int) (short) 100);
        long long19 = frequency12.getCumFreq('4');
        long long21 = frequency12.getCount((int) (short) 1);
        long long23 = frequency12.getCount((int) (short) 1);
        long long25 = frequency12.getCount((java.lang.Object) (byte) 1);
        frequency12.clear();
        long long28 = frequency12.getCumFreq(' ');
        long long30 = frequency12.getCount((int) (short) 100);
        double double31 = frequency0.getPct((java.lang.Object) (short) 100);
        long long33 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getPct((long) 10);
        double double6 = frequency0.getPct((int) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n");
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCount((long) 'a');
        long long15 = frequency0.getCumFreq(10L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double8 = frequency0.getPct((long) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) 0);
        long long12 = frequency0.getCount((long) (short) 0);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((int) (short) -1);
        double double4 = frequency0.getCumPct((long) (byte) 0);
        double double6 = frequency0.getCumPct((long) (-1));
        long long8 = frequency0.getCumFreq((long) (short) 10);
        long long9 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean12 = frequency10.equals((java.lang.Object) 10L);
        frequency10.clear();
        double double15 = frequency10.getPct((int) (short) 100);
        frequency10.addValue((int) 'a');
        long long19 = frequency10.getCumFreq((long) (short) 1);
        double double21 = frequency10.getCumPct(0L);
        double double23 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long24 = frequency10.getSumFreq();
        boolean boolean25 = frequency0.equals((java.lang.Object) frequency10);
        double double27 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        frequency0.addValue(0L);
        long long31 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        boolean boolean4 = frequency0.equals((java.lang.Object) frequency3);
        long long6 = frequency3.getCount('#');
        frequency3.addValue((long) 0);
        long long10 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long12 = frequency3.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        boolean boolean2 = frequency0.equals((java.lang.Object) 10L);
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        long long8 = frequency0.getSumFreq();
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long12 = frequency0.getCount('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }
}

