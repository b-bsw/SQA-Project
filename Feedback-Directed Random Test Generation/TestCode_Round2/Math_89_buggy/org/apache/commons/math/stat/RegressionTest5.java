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
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        double double49 = frequency30.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        double double54 = frequency50.getPct((-1));
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency30.getCumFreq((java.lang.Object) frequency50);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        long long62 = frequency58.getCumFreq((long) (byte) 100);
        double double64 = frequency58.getPct(' ');
        double double65 = frequency50.getPct((java.lang.Object) double64);
        double double66 = frequency0.getCumPct((java.lang.Object) frequency50);
        double double68 = frequency0.getCumPct(100L);
        long long70 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        long long73 = frequency71.getCumFreq((java.lang.Object) 100L);
        long long75 = frequency71.getCount('#');
        double double77 = frequency71.getPct('#');
        frequency71.addValue((int) (short) 10);
        double double81 = frequency71.getCumPct((int) ' ');
        java.util.Iterator iterator82 = frequency71.valuesIterator();
        long long83 = frequency0.getCumFreq((java.lang.Object) frequency71);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        double double6 = frequency0.getPct('#');
        frequency0.addValue((java.lang.Object) 100.0f);
        long long10 = frequency0.getCumFreq((int) (short) 0);
        long long12 = frequency0.getCumFreq((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) (-1));
        java.util.Iterator iterator7 = frequency0.valuesIterator();
        java.lang.Class<?> wildcardClass8 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) 1);
        long long17 = frequency0.getCumFreq((long) (short) 0);
        long long18 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double26 = frequency0.getPct((int) (byte) 1);
        double double28 = frequency0.getCumPct(' ');
        double double30 = frequency0.getPct((long) 0);
        long long31 = frequency0.getSumFreq();
        double double33 = frequency0.getPct((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) "");
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        frequency16.addValue(0);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long29 = frequency16.getCount((java.lang.Object) frequency21);
        double double30 = frequency11.getPct((java.lang.Object) frequency21);
        java.lang.String str31 = frequency11.toString();
        double double33 = frequency11.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        double double38 = frequency34.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((long) '4');
        frequency39.addValue(0);
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        long long46 = frequency44.getCumFreq((java.lang.Object) 100L);
        double double48 = frequency44.getCumPct(0);
        double double50 = frequency44.getCumPct('a');
        java.lang.String str51 = frequency44.toString();
        long long52 = frequency39.getCount((java.lang.Object) frequency44);
        double double53 = frequency34.getPct((java.lang.Object) frequency39);
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        long long56 = frequency54.getCumFreq((java.lang.Object) 100L);
        long long58 = frequency54.getCount('#');
        long long60 = frequency54.getCount('4');
        frequency54.addValue((java.lang.Integer) 100);
        double double63 = frequency34.getCumPct((java.lang.Object) frequency54);
        double double65 = frequency54.getCumPct((int) (short) 100);
        double double66 = frequency11.getCumPct((java.lang.Object) (short) 100);
        double double68 = frequency11.getPct('a');
        long long70 = frequency11.getCount('#');
        double double72 = frequency11.getPct((int) (byte) 1);
        java.lang.String str73 = frequency11.toString();
        frequency11.addValue(100L);
        double double76 = frequency0.getCumPct((java.lang.Object) 100L);
        frequency0.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str73, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCumFreq(100L);
        long long12 = frequency0.getCount((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double28 = frequency18.getCumPct(0L);
        double double29 = frequency0.getCumPct((java.lang.Object) 0L);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getCumPct('#');
        long long34 = frequency30.getCumFreq((long) (byte) 100);
        long long36 = frequency30.getCount(' ');
        double double38 = frequency30.getCumPct((long) 1);
        long long40 = frequency30.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        double double43 = frequency41.getCumPct('#');
        long long45 = frequency41.getCumFreq((long) (byte) 100);
        long long47 = frequency41.getCount(' ');
        double double49 = frequency41.getCumPct((long) 1);
        long long50 = frequency30.getCumFreq((java.lang.Object) 1);
        long long52 = frequency30.getCumFreq((long) (byte) 100);
        frequency30.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        double double56 = frequency30.getCumPct((int) (short) 100);
        double double58 = frequency30.getCumPct((int) 'a');
        double double60 = frequency30.getCumPct((int) (short) 10);
        frequency0.addValue((java.lang.Object) (short) 10);
        long long63 = frequency0.getCumFreq((-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        java.lang.String str5 = frequency0.toString();
        frequency0.addValue((int) (byte) 100);
        java.util.Iterator iterator8 = frequency0.valuesIterator();
        double double10 = frequency0.getCumPct((long) (short) 100);
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        double double8 = frequency0.getPct((int) (byte) 0);
        long long10 = frequency0.getCount((int) (byte) 100);
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCount((long) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct(' ');
        long long19 = frequency0.getCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        double double24 = frequency20.getPct((-1));
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long27 = frequency0.getCumFreq((java.lang.Object) frequency20);
        long long29 = frequency20.getCumFreq((java.lang.Object) "hi!");
        long long31 = frequency20.getCount((long) (byte) 10);
        long long33 = frequency20.getCount(0);
        long long35 = frequency20.getCumFreq((long) '4');
        double double37 = frequency20.getCumPct(2L);
        long long39 = frequency20.getCount('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency20.addValue((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((long) '4');
        double double17 = frequency13.getPct((java.lang.Object) 100L);
        long long19 = frequency13.getCount((long) (-1));
        long long21 = frequency13.getCount((long) (-1));
        long long22 = frequency0.getCumFreq((java.lang.Object) (-1));
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((java.lang.Object) 100L);
        long long27 = frequency23.getCount('#');
        double double29 = frequency23.getPct('#');
        frequency23.addValue((int) (short) 10);
        long long32 = frequency0.getCount((java.lang.Object) frequency23);
        double double34 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct('#');
        double double39 = frequency35.getPct((-1));
        frequency35.addValue((long) ' ');
        java.lang.String str42 = frequency35.toString();
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        double double48 = frequency46.getPct((long) '4');
        double double50 = frequency46.getPct((long) 1);
        double double51 = frequency43.getCumPct((java.lang.Object) 1);
        frequency43.addValue((java.lang.Integer) 0);
        double double54 = frequency35.getPct((java.lang.Object) frequency43);
        long long56 = frequency43.getCumFreq('a');
        long long57 = frequency0.getCount((java.lang.Object) frequency43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCumFreq(100L);
        long long12 = frequency0.getCount((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double28 = frequency18.getCumPct(0L);
        double double29 = frequency0.getCumPct((java.lang.Object) 0L);
        long long30 = frequency0.getSumFreq();
        double double32 = frequency0.getPct((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCount((java.lang.Object) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        frequency0.addValue((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getCumPct(0);
        double double13 = frequency7.getCumPct('a');
        java.lang.String str14 = frequency7.toString();
        double double16 = frequency7.getCumPct((long) 10);
        double double18 = frequency7.getPct((int) ' ');
        java.util.Iterator iterator19 = frequency7.valuesIterator();
        long long21 = frequency7.getCount('4');
        double double22 = frequency0.getPct((java.lang.Object) '4');
        long long24 = frequency0.getCount((int) (short) -1);
        double double26 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCumFreq(0);
        long long25 = frequency0.getCumFreq((int) (byte) 100);
        frequency0.clear();
        double double28 = frequency0.getPct('#');
        double double30 = frequency0.getCumPct((int) 'a');
        java.util.Iterator iterator31 = frequency0.valuesIterator();
        java.lang.String str32 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        long long8 = frequency0.getCount((-1L));
        double double10 = frequency0.getPct((long) (short) -1);
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.clear();
        long long15 = frequency0.getCumFreq((long) 1);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        java.lang.String str23 = frequency16.toString();
        double double25 = frequency16.getCumPct((int) (byte) -1);
        double double27 = frequency16.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getPct((long) '4');
        double double35 = frequency31.getPct((long) 1);
        double double36 = frequency28.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator37 = frequency28.valuesIterator();
        long long39 = frequency28.getCumFreq('a');
        long long40 = frequency28.getSumFreq();
        double double42 = frequency28.getPct(10);
        long long44 = frequency28.getCount(10L);
        frequency28.clear();
        double double47 = frequency28.getCumPct('a');
        long long48 = frequency16.getCount((java.lang.Object) double47);
        long long50 = frequency16.getCount(1);
        frequency0.addValue((java.lang.Object) long50);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        long long10 = frequency0.getCumFreq(100);
        double double12 = frequency0.getPct((int) (byte) -1);
        long long14 = frequency0.getCumFreq((int) (byte) 0);
        double double16 = frequency0.getCumPct((long) (byte) 100);
        double double18 = frequency0.getPct(0L);
        double double20 = frequency0.getCumPct(' ');
        double double22 = frequency0.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        double double24 = frequency20.getPct((-1));
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long27 = frequency0.getCumFreq((java.lang.Object) frequency20);
        long long29 = frequency20.getCumFreq((java.lang.Object) "hi!");
        long long31 = frequency20.getCount((long) (byte) 10);
        long long33 = frequency20.getCumFreq((long) (short) 10);
        long long35 = frequency20.getCount('4');
        double double37 = frequency20.getCumPct('4');
        long long39 = frequency20.getCount(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((long) 1);
        long long6 = frequency0.getCount(0L);
        frequency0.addValue((java.lang.Object) (-1.0f));
        long long10 = frequency0.getCumFreq((long) (short) 0);
        long long12 = frequency0.getCumFreq(1L);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        double double17 = frequency13.getPct((-1));
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        long long20 = frequency13.getCumFreq('4');
        double double22 = frequency13.getCumPct((long) (short) 10);
        long long23 = frequency13.getSumFreq();
        double double24 = frequency0.getPct((java.lang.Object) long23);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCumFreq((java.lang.Object) 100L);
        long long29 = frequency25.getCount('#');
        long long31 = frequency25.getCount('4');
        frequency25.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getCumPct('#');
        double double38 = frequency34.getPct((-1));
        java.util.Iterator iterator39 = frequency34.valuesIterator();
        frequency34.addValue(10L);
        double double43 = frequency34.getCumPct((int) '#');
        double double45 = frequency34.getPct((long) 1);
        long long46 = frequency25.getCumFreq((java.lang.Object) frequency34);
        double double47 = frequency0.getCumPct((java.lang.Object) frequency25);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        long long7 = frequency0.getCount((-1L));
        frequency0.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        frequency0.addValue((int) (short) 100);
        long long16 = frequency0.getCount('a');
        frequency0.addValue((int) (short) -1);
        java.util.Iterator iterator19 = frequency0.valuesIterator();
        long long21 = frequency0.getCount('4');
        double double23 = frequency0.getPct(4L);
        frequency0.addValue((long) 0);
        frequency0.addValue((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq((java.lang.Object) 100L);
        double double18 = frequency14.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((long) '4');
        frequency19.addValue(0);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq((java.lang.Object) 100L);
        double double28 = frequency24.getCumPct(0);
        double double30 = frequency24.getCumPct('a');
        java.lang.String str31 = frequency24.toString();
        long long32 = frequency19.getCount((java.lang.Object) frequency24);
        double double33 = frequency14.getPct((java.lang.Object) frequency19);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        long long38 = frequency34.getCount('#');
        long long40 = frequency34.getCount('4');
        frequency34.addValue((java.lang.Integer) 100);
        double double43 = frequency14.getCumPct((java.lang.Object) frequency34);
        java.util.Iterator iterator44 = frequency14.valuesIterator();
        long long45 = frequency0.getCount((java.lang.Object) iterator44);
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        long long48 = frequency46.getCumFreq((-1));
        double double50 = frequency46.getCumPct((long) (byte) 100);
        double double52 = frequency46.getPct('4');
        long long54 = frequency46.getCount('a');
        frequency46.addValue((java.lang.Integer) 10);
        long long57 = frequency0.getCount((java.lang.Object) frequency46);
        double double59 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct('#');
        long long13 = frequency9.getCumFreq((long) (byte) 100);
        frequency9.addValue((java.lang.Integer) (-1));
        double double17 = frequency9.getPct('4');
        double double19 = frequency9.getPct((long) 100);
        double double21 = frequency9.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct('#');
        long long26 = frequency22.getCumFreq((long) (byte) 100);
        long long28 = frequency22.getCount(' ');
        double double30 = frequency22.getPct(0);
        long long31 = frequency9.getCount((java.lang.Object) 0);
        java.lang.String str32 = frequency9.toString();
        long long34 = frequency9.getCount((long) ' ');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((java.lang.Object) 100L);
        long long39 = frequency35.getCount('#');
        long long41 = frequency35.getCount('4');
        double double43 = frequency35.getPct((int) (byte) 0);
        long long45 = frequency35.getCount((int) (byte) 100);
        double double47 = frequency35.getCumPct((int) (short) 100);
        long long48 = frequency9.getCount((java.lang.Object) frequency35);
        long long50 = frequency35.getCount(' ');
        frequency0.addValue((java.lang.Object) long50);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n100\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        long long4 = frequency0.getCount((int) (short) 1);
        double double6 = frequency0.getCumPct((long) (short) 10);
        long long8 = frequency0.getCumFreq((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        double double12 = frequency0.getCumPct(0);
        java.lang.String str13 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        frequency10.addValue('4');
        long long23 = frequency10.getCumFreq('a');
        long long25 = frequency10.getCount((int) 'a');
        long long26 = frequency10.getSumFreq();
        long long28 = frequency10.getCount((long) ' ');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        long long33 = frequency29.getCumFreq((long) (byte) 100);
        double double35 = frequency29.getPct(' ');
        long long36 = frequency29.getSumFreq();
        // The following exception was thrown during execution in test generation
        try {
            frequency10.addValue((java.lang.Object) frequency29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        long long26 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getCumPct('#');
        long long31 = frequency27.getCumFreq((long) (byte) 100);
        long long33 = frequency27.getCount((long) '4');
        long long35 = frequency27.getCumFreq((long) 100);
        double double37 = frequency27.getPct((long) ' ');
        long long39 = frequency27.getCount((int) (short) 10);
        double double41 = frequency27.getCumPct(100);
        long long43 = frequency27.getCount('a');
        frequency0.addValue((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        frequency0.addValue((long) (short) 0);
        long long9 = frequency0.getSumFreq();
        long long11 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((java.lang.Object) 100L);
        double double16 = frequency12.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((long) '4');
        frequency17.addValue(0);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((java.lang.Object) 100L);
        double double26 = frequency22.getCumPct(0);
        double double28 = frequency22.getCumPct('a');
        java.lang.String str29 = frequency22.toString();
        long long30 = frequency17.getCount((java.lang.Object) frequency22);
        double double31 = frequency12.getPct((java.lang.Object) frequency22);
        java.lang.String str32 = frequency12.toString();
        double double34 = frequency12.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((java.lang.Object) 100L);
        double double39 = frequency35.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getPct((long) '4');
        frequency40.addValue(0);
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        long long47 = frequency45.getCumFreq((java.lang.Object) 100L);
        double double49 = frequency45.getCumPct(0);
        double double51 = frequency45.getCumPct('a');
        java.lang.String str52 = frequency45.toString();
        long long53 = frequency40.getCount((java.lang.Object) frequency45);
        double double54 = frequency35.getPct((java.lang.Object) frequency40);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCumFreq((java.lang.Object) 100L);
        long long59 = frequency55.getCount('#');
        long long61 = frequency55.getCount('4');
        frequency55.addValue((java.lang.Integer) 100);
        double double64 = frequency35.getCumPct((java.lang.Object) frequency55);
        double double66 = frequency55.getCumPct((int) (short) 100);
        double double67 = frequency12.getCumPct((java.lang.Object) (short) 100);
        double double69 = frequency12.getPct('a');
        long long71 = frequency12.getCount('#');
        long long72 = frequency0.getCumFreq((java.lang.Object) frequency12);
        long long74 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        frequency0.clear();
        double double11 = frequency0.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        double double8 = frequency0.getCumPct('a');
        double double10 = frequency0.getPct('a');
        double double12 = frequency0.getPct((-1L));
        long long13 = frequency0.getSumFreq();
        java.util.Iterator iterator14 = frequency0.valuesIterator();
        double double16 = frequency0.getPct(4L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        frequency0.addValue((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        java.lang.Class<?> wildcardClass13 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        long long13 = frequency9.getCount('#');
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        frequency9.addValue((java.lang.Object) "");
        frequency9.clear();
        frequency9.addValue(0L);
        double double20 = frequency0.getCumPct((java.lang.Object) frequency9);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct('#');
        double double25 = frequency21.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq((java.lang.Object) 100L);
        double double30 = frequency26.getCumPct(0);
        double double32 = frequency26.getCumPct('a');
        java.lang.String str33 = frequency26.toString();
        frequency26.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator36 = frequency26.valuesIterator();
        long long37 = frequency21.getCount((java.lang.Object) frequency26);
        double double38 = frequency0.getPct((java.lang.Object) frequency21);
        long long40 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('4');
        frequency0.clear();
        long long9 = frequency0.getCount(' ');
        long long11 = frequency0.getCumFreq(0L);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        long long14 = frequency12.getCumFreq((java.lang.Object) 100L);
        double double16 = frequency12.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((long) '4');
        frequency17.addValue(0);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((java.lang.Object) 100L);
        double double26 = frequency22.getCumPct(0);
        double double28 = frequency22.getCumPct('a');
        java.lang.String str29 = frequency22.toString();
        long long30 = frequency17.getCount((java.lang.Object) frequency22);
        double double31 = frequency12.getPct((java.lang.Object) frequency17);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        long long34 = frequency32.getCumFreq((java.lang.Object) 100L);
        long long36 = frequency32.getCount('#');
        long long38 = frequency32.getCount('4');
        frequency32.addValue((java.lang.Integer) 100);
        double double41 = frequency12.getCumPct((java.lang.Object) frequency32);
        java.util.Iterator iterator42 = frequency12.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        double double45 = frequency43.getCumPct('#');
        frequency43.clear();
        long long47 = frequency12.getCumFreq((java.lang.Object) frequency43);
        double double49 = frequency43.getCumPct('4');
        double double51 = frequency43.getCumPct('a');
        double double52 = frequency0.getPct((java.lang.Object) double51);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        long long55 = frequency53.getCumFreq((java.lang.Object) 100L);
        long long57 = frequency53.getCount('#');
        java.util.Iterator iterator58 = frequency53.valuesIterator();
        long long60 = frequency53.getCount((int) (short) 100);
        frequency53.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long64 = frequency53.getCumFreq(' ');
        frequency0.addValue((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        long long22 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        double double26 = frequency0.getPct((long) (byte) 10);
        java.util.Iterator iterator27 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((long) '4');
        double double11 = frequency7.getPct((java.lang.Object) 100L);
        long long13 = frequency7.getCount((long) (-1));
        long long15 = frequency7.getCount((long) (-1));
        double double16 = frequency0.getPct((java.lang.Object) frequency7);
        long long18 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((java.lang.Object) 100L);
        long long23 = frequency19.getCount('#');
        double double25 = frequency19.getPct('#');
        frequency19.addValue((java.lang.Object) 100.0f);
        double double29 = frequency19.getPct(0L);
        java.lang.String str30 = frequency19.toString();
        double double32 = frequency19.getPct((int) (short) 100);
        java.util.Iterator iterator33 = frequency19.valuesIterator();
        double double34 = frequency0.getPct((java.lang.Object) iterator33);
        double double36 = frequency0.getCumPct((int) ' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100.0\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n100.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        long long7 = frequency0.getCumFreq((-1));
        double double9 = frequency0.getCumPct((int) (byte) 0);
        long long11 = frequency0.getCumFreq(1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n0\t1\t33%\t67%\n100\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        long long21 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double23 = frequency0.getCumPct('a');
        double double25 = frequency0.getCumPct(10);
        long long27 = frequency0.getCumFreq(5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Object) true);
        double double4 = frequency0.getCumPct((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(2L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((long) '4');
        double double11 = frequency7.getPct((java.lang.Object) 100L);
        long long13 = frequency7.getCount((long) (-1));
        long long15 = frequency7.getCount((long) (-1));
        double double16 = frequency0.getPct((java.lang.Object) frequency7);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        double double21 = frequency17.getCumPct(0);
        double double23 = frequency17.getCumPct('a');
        long long25 = frequency17.getCount(100);
        double double27 = frequency17.getCumPct(0);
        double double29 = frequency17.getPct('4');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getPct((long) '4');
        double double34 = frequency30.getPct((java.lang.Object) 100L);
        long long36 = frequency30.getCount((long) (-1));
        long long38 = frequency30.getCount((long) (-1));
        long long39 = frequency17.getCumFreq((java.lang.Object) (-1));
        java.lang.String str40 = frequency17.toString();
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        double double43 = frequency41.getCumPct((java.lang.Object) (byte) 10);
        frequency41.clear();
        java.lang.String str45 = frequency41.toString();
        frequency17.addValue((java.lang.Object) str45);
        long long47 = frequency7.getCount((java.lang.Object) frequency17);
        long long48 = frequency17.getSumFreq();
        double double50 = frequency17.getPct('#');
        java.lang.Class<?> wildcardClass51 = frequency17.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('4');
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        long long15 = frequency11.getCount('#');
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        double double18 = frequency11.getPct((long) (short) 10);
        double double20 = frequency11.getPct((long) (byte) 10);
        frequency11.addValue((int) (byte) 0);
        double double23 = frequency0.getPct((java.lang.Object) frequency11);
        double double25 = frequency0.getCumPct((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        java.lang.String str7 = frequency0.toString();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(0L);
        double double12 = frequency0.getCumPct(2L);
        frequency0.addValue(' ');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct('#');
        long long19 = frequency15.getCumFreq((long) (byte) 100);
        double double21 = frequency15.getPct((java.lang.Object) Double.NaN);
        long long23 = frequency15.getCount((java.lang.Object) (byte) -1);
        frequency15.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) frequency15);
        frequency15.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        double double29 = frequency0.getPct(0);
        long long31 = frequency0.getCount(10);
        java.util.Iterator iterator32 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct(' ');
        frequency0.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount(' ');
        double double21 = frequency13.getPct(0);
        long long22 = frequency0.getCount((java.lang.Object) 0);
        java.lang.String str23 = frequency0.toString();
        long long25 = frequency0.getCount((long) ' ');
        long long27 = frequency0.getCount(1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100.0\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount(' ');
        double double10 = frequency0.getPct(100L);
        java.util.Iterator iterator11 = frequency0.valuesIterator();
        frequency0.addValue(0);
        double double15 = frequency0.getPct('#');
        long long17 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        frequency0.addValue((long) (short) 0);
        frequency0.clear();
        frequency0.addValue(0);
        java.lang.String str12 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct((long) (short) 100);
        double double13 = frequency0.getCumPct(0);
        long long15 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        java.lang.String str14 = frequency5.toString();
        java.util.Iterator iterator15 = frequency5.valuesIterator();
        java.lang.String str16 = frequency5.toString();
        long long18 = frequency5.getCount((long) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount(' ');
        double double21 = frequency13.getPct(0);
        long long22 = frequency0.getCount((java.lang.Object) 0);
        double double24 = frequency0.getCumPct('4');
        long long26 = frequency0.getCumFreq('4');
        double double28 = frequency0.getCumPct(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        frequency0.addValue((int) (short) 100);
        long long16 = frequency0.getCount('a');
        frequency0.addValue((int) (short) -1);
        long long20 = frequency0.getCumFreq((int) (short) 0);
        double double22 = frequency0.getCumPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.6666666666666666d + "'", double22 == 0.6666666666666666d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        long long15 = frequency0.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        long long24 = frequency16.getCount(100);
        double double26 = frequency16.getCumPct(0);
        long long27 = frequency16.getSumFreq();
        long long28 = frequency0.getCount((java.lang.Object) frequency16);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        long long33 = frequency29.getCumFreq((long) (byte) 100);
        double double35 = frequency29.getPct((java.lang.Object) Double.NaN);
        long long36 = frequency29.getSumFreq();
        frequency29.addValue((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        long long43 = frequency39.getCumFreq((long) (byte) 100);
        frequency39.clear();
        long long46 = frequency39.getCount((int) (short) 10);
        long long48 = frequency39.getCount(10);
        double double49 = frequency29.getPct((java.lang.Object) frequency39);
        double double50 = frequency16.getPct((java.lang.Object) frequency39);
        double double52 = frequency39.getCumPct((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        double double31 = frequency20.getCumPct((int) (short) 100);
        long long33 = frequency20.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        long long38 = frequency34.getCount('#');
        java.util.Iterator iterator39 = frequency34.valuesIterator();
        frequency34.addValue((java.lang.Object) "");
        frequency34.clear();
        long long44 = frequency34.getCumFreq((java.lang.Object) "");
        frequency34.clear();
        long long47 = frequency34.getCumFreq(' ');
        frequency34.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        long long50 = frequency20.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        double double52 = frequency20.getCumPct((long) (byte) -1);
        double double54 = frequency20.getPct(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        frequency5.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator15 = frequency5.valuesIterator();
        long long16 = frequency0.getCount((java.lang.Object) frequency5);
        long long17 = frequency0.getSumFreq();
        java.lang.String str18 = frequency0.toString();
        double double20 = frequency0.getCumPct(0L);
        long long22 = frequency0.getCount(0);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((-1));
        frequency23.addValue((int) (short) -1);
        frequency23.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        long long34 = frequency30.getCount('#');
        long long36 = frequency30.getCount('4');
        frequency30.addValue((java.lang.Integer) 100);
        long long39 = frequency30.getSumFreq();
        double double40 = frequency23.getCumPct((java.lang.Object) frequency30);
        double double42 = frequency23.getPct('a');
        long long43 = frequency0.getCount((java.lang.Object) frequency23);
        long long45 = frequency23.getCumFreq((int) (byte) -1);
        java.util.Iterator iterator46 = frequency23.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((long) 1);
        long long6 = frequency0.getCount(0L);
        double double8 = frequency0.getPct((long) (byte) 10);
        double double10 = frequency0.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) (-1));
        double double17 = frequency0.getCumPct((-1L));
        frequency0.addValue((int) '4');
        double double21 = frequency0.getPct((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        long long24 = frequency22.getCumFreq((java.lang.Object) 100L);
        long long26 = frequency22.getCount('#');
        long long28 = frequency22.getCount('4');
        long long30 = frequency22.getCount((-1L));
        frequency0.addValue((java.lang.Object) (-1L));
        double double33 = frequency0.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.75d + "'", double33 == 0.75d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        double double15 = frequency0.getCumPct('a');
        java.util.Iterator iterator16 = frequency0.valuesIterator();
        long long18 = frequency0.getCumFreq((int) '4');
        frequency0.clear();
        long long21 = frequency0.getCount((long) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCumFreq(100L);
        long long12 = frequency0.getCount((-1));
        long long14 = frequency0.getCount((long) (byte) 0);
        double double16 = frequency0.getPct('a');
        frequency0.addValue(10L);
        frequency0.addValue((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        long long25 = frequency21.getCount('#');
        long long27 = frequency21.getCount('4');
        frequency21.addValue((java.lang.Integer) 100);
        frequency21.addValue((long) 1);
        long long33 = frequency21.getCumFreq(0L);
        long long34 = frequency0.getCount((java.lang.Object) long33);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((java.lang.Object) 100L);
        double double39 = frequency35.getCumPct(0);
        frequency35.clear();
        long long41 = frequency0.getCumFreq((java.lang.Object) frequency35);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        frequency5.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator15 = frequency5.valuesIterator();
        long long16 = frequency0.getCount((java.lang.Object) frequency5);
        long long17 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        frequency18.clear();
        long long23 = frequency18.getCumFreq((int) '#');
        double double24 = frequency0.getPct((java.lang.Object) frequency18);
        java.lang.String str25 = frequency18.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCumFreq((long) 'a');
        frequency0.addValue('a');
        long long18 = frequency0.getCount((int) (short) 100);
        java.util.Iterator iterator19 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        long long24 = frequency20.getCumFreq((long) (byte) 100);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) (-1));
        long long30 = frequency20.getCount((int) (byte) -1);
        frequency20.addValue((int) (short) 0);
        double double34 = frequency20.getCumPct((int) (byte) 100);
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency20);
        frequency20.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((long) '4');
        double double7 = frequency3.getPct((long) 1);
        double double8 = frequency0.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator9 = frequency0.valuesIterator();
        long long11 = frequency0.getCumFreq('a');
        long long12 = frequency0.getSumFreq();
        double double14 = frequency0.getPct(10);
        long long16 = frequency0.getCumFreq(2L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        long long21 = frequency17.getCount('#');
        double double23 = frequency17.getPct('#');
        frequency17.addValue((java.lang.Object) 100.0f);
        long long27 = frequency17.getCumFreq((int) (short) 0);
        long long29 = frequency17.getCumFreq((long) (byte) 0);
        java.util.Iterator iterator30 = frequency17.valuesIterator();
        double double31 = frequency0.getCumPct((java.lang.Object) frequency17);
        double double33 = frequency0.getCumPct(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((long) '4');
        frequency8.addValue(0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        double double19 = frequency13.getCumPct('a');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency8.getCount((java.lang.Object) frequency13);
        long long23 = frequency8.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        long long28 = frequency24.getCumFreq((long) (byte) 100);
        long long30 = frequency24.getCount((int) ' ');
        double double32 = frequency24.getPct((long) 1);
        double double33 = frequency8.getCumPct((java.lang.Object) double32);
        double double34 = frequency0.getPct((java.lang.Object) double33);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        long long50 = frequency35.getCount((int) (short) 100);
        frequency35.addValue((int) (short) 1);
        long long53 = frequency0.getCount((java.lang.Object) frequency35);
        double double55 = frequency0.getCumPct('4');
        frequency0.addValue((java.lang.Integer) 0);
        double double59 = frequency0.getPct(' ');
        long long60 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        long long21 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('a');
        long long25 = frequency0.getCumFreq((long) ' ');
        java.util.Iterator iterator26 = frequency0.valuesIterator();
        long long28 = frequency0.getCumFreq('#');
        long long29 = frequency0.getSumFreq();
        double double31 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getCumPct('#');
        long long36 = frequency32.getCumFreq((long) (byte) 100);
        long long38 = frequency32.getCount(' ');
        double double40 = frequency32.getCumPct((long) 1);
        long long42 = frequency32.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        double double45 = frequency43.getCumPct('#');
        long long47 = frequency43.getCumFreq((long) (byte) 100);
        long long49 = frequency43.getCount(' ');
        double double51 = frequency43.getCumPct((long) 1);
        long long52 = frequency32.getCumFreq((java.lang.Object) 1);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        double double55 = frequency53.getCumPct('#');
        long long57 = frequency53.getCumFreq((long) (byte) 100);
        frequency53.addValue((java.lang.Integer) (-1));
        double double61 = frequency53.getPct('4');
        double double63 = frequency53.getPct((long) 100);
        long long64 = frequency32.getCount((java.lang.Object) double63);
        long long66 = frequency32.getCount(' ');
        double double67 = frequency0.getCumPct((java.lang.Object) long66);
        java.lang.String str68 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str68, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        long long15 = frequency0.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        long long24 = frequency16.getCount(100);
        double double26 = frequency16.getCumPct(0);
        long long27 = frequency16.getSumFreq();
        long long28 = frequency0.getCount((java.lang.Object) frequency16);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        long long33 = frequency29.getCumFreq((long) (byte) 100);
        double double35 = frequency29.getPct((java.lang.Object) Double.NaN);
        long long36 = frequency29.getSumFreq();
        frequency29.addValue((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        long long43 = frequency39.getCumFreq((long) (byte) 100);
        frequency39.clear();
        long long46 = frequency39.getCount((int) (short) 10);
        long long48 = frequency39.getCount(10);
        double double49 = frequency29.getPct((java.lang.Object) frequency39);
        double double50 = frequency16.getPct((java.lang.Object) frequency39);
        double double52 = frequency16.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((long) '4');
        frequency8.addValue(0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        double double19 = frequency13.getCumPct('a');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency8.getCount((java.lang.Object) frequency13);
        long long23 = frequency8.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        long long28 = frequency24.getCumFreq((long) (byte) 100);
        long long30 = frequency24.getCount((int) ' ');
        double double32 = frequency24.getPct((long) 1);
        double double33 = frequency8.getCumPct((java.lang.Object) double32);
        double double34 = frequency0.getPct((java.lang.Object) double33);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        long long50 = frequency35.getCount((int) (short) 100);
        frequency35.addValue((int) (short) 1);
        long long53 = frequency0.getCount((java.lang.Object) frequency35);
        double double55 = frequency0.getCumPct('4');
        frequency0.addValue((java.lang.Integer) 0);
        double double59 = frequency0.getCumPct((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency();
        long long62 = frequency60.getCumFreq((java.lang.Object) 100L);
        double double64 = frequency60.getCumPct(0);
        double double66 = frequency60.getCumPct('a');
        java.lang.String str67 = frequency60.toString();
        double double69 = frequency60.getCumPct((long) 10);
        double double71 = frequency60.getPct((int) ' ');
        java.util.Iterator iterator72 = frequency60.valuesIterator();
        long long73 = frequency0.getCumFreq((java.lang.Object) iterator72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str67, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        double double6 = frequency0.getPct('4');
        double double8 = frequency0.getCumPct((int) 'a');
        frequency0.addValue((java.lang.Integer) 0);
        double double12 = frequency0.getCumPct((int) (short) 10);
        double double14 = frequency0.getCumPct(4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        frequency0.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator10 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((long) '4');
        double double15 = frequency11.getPct((java.lang.Object) 100L);
        long long17 = frequency11.getCount((long) (-1));
        long long19 = frequency11.getCount(' ');
        double double21 = frequency11.getPct(100L);
        frequency11.addValue('a');
        long long25 = frequency11.getCumFreq((long) (byte) 0);
        double double27 = frequency11.getPct(100);
        double double28 = frequency0.getPct((java.lang.Object) 100);
        long long30 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCount((long) (byte) 10);
        double double35 = frequency31.getPct((java.lang.Object) 10);
        double double37 = frequency31.getPct((java.lang.Object) 10L);
        double double39 = frequency31.getCumPct((int) (byte) 1);
        double double41 = frequency31.getPct('a');
        frequency31.addValue((-1));
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        double double46 = frequency44.getCumPct('#');
        double double48 = frequency44.getPct((-1));
        long long50 = frequency44.getCount('a');
        frequency44.addValue((long) (short) 0);
        long long53 = frequency44.getSumFreq();
        long long55 = frequency44.getCumFreq('#');
        long long56 = frequency31.getCount((java.lang.Object) long55);
        long long58 = frequency31.getCount((long) (short) 0);
        long long60 = frequency31.getCumFreq((int) 'a');
        double double61 = frequency0.getPct((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        double double21 = frequency0.getPct((long) 100);
        frequency0.addValue(0L);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq((java.lang.Object) 100L);
        double double28 = frequency24.getCumPct(0);
        double double30 = frequency24.getCumPct('a');
        java.lang.String str31 = frequency24.toString();
        long long33 = frequency24.getCount((int) (byte) 10);
        long long35 = frequency24.getCount('4');
        frequency24.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        double double40 = frequency38.getCumPct('#');
        long long42 = frequency38.getCumFreq((long) (byte) 100);
        long long44 = frequency38.getCount(' ');
        double double46 = frequency38.getCumPct((long) 1);
        long long48 = frequency38.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        double double51 = frequency49.getCumPct('#');
        long long53 = frequency49.getCumFreq((long) (byte) 100);
        long long55 = frequency49.getCount(' ');
        double double57 = frequency49.getCumPct((long) 1);
        long long58 = frequency38.getCumFreq((java.lang.Object) 1);
        long long60 = frequency38.getCumFreq((long) (byte) 100);
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        double double63 = frequency24.getCumPct((java.lang.Object) frequency38);
        double double64 = frequency0.getPct((java.lang.Object) frequency24);
        long long66 = frequency24.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        double double69 = frequency67.getCumPct('#');
        long long71 = frequency67.getCumFreq((long) (byte) 100);
        long long73 = frequency67.getCount(' ');
        double double75 = frequency67.getCumPct((long) 1);
        long long77 = frequency67.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency78 = new org.apache.commons.math.stat.Frequency();
        double double80 = frequency78.getCumPct('#');
        long long82 = frequency78.getCumFreq((long) (byte) 100);
        long long84 = frequency78.getCount(' ');
        double double86 = frequency78.getCumPct((long) 1);
        long long87 = frequency67.getCumFreq((java.lang.Object) 1);
        long long89 = frequency67.getCumFreq((long) (byte) 100);
        java.lang.String str90 = frequency67.toString();
        double double92 = frequency67.getPct('#');
        long long93 = frequency24.getCumFreq((java.lang.Object) frequency67);
        frequency24.addValue((int) (byte) 10);
        long long97 = frequency24.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str90, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((long) '4');
        double double7 = frequency3.getPct((long) 1);
        double double8 = frequency0.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator9 = frequency0.valuesIterator();
        long long11 = frequency0.getCumFreq('a');
        long long12 = frequency0.getSumFreq();
        double double14 = frequency0.getPct(10);
        double double16 = frequency0.getPct('a');
        long long18 = frequency0.getCumFreq(0);
        double double20 = frequency0.getCumPct((long) 0);
        long long22 = frequency0.getCumFreq(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCumFreq(0);
        long long25 = frequency0.getCumFreq((int) (byte) 100);
        long long27 = frequency0.getCumFreq(100);
        long long29 = frequency0.getCumFreq((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        double double19 = frequency13.getCumPct('a');
        java.lang.String str20 = frequency13.toString();
        long long22 = frequency13.getCount((int) (byte) 10);
        double double24 = frequency13.getPct((int) (short) 100);
        java.util.Iterator iterator25 = frequency13.valuesIterator();
        frequency13.addValue(0L);
        double double29 = frequency13.getPct((long) 0);
        long long30 = frequency0.getCumFreq((java.lang.Object) frequency13);
        double double32 = frequency0.getPct((-1L));
        double double34 = frequency0.getPct(3L);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct('#');
        long long39 = frequency35.getCumFreq((long) (byte) 100);
        frequency35.addValue((java.lang.Integer) (-1));
        double double43 = frequency35.getPct('4');
        double double45 = frequency35.getPct((long) 100);
        double double47 = frequency35.getCumPct((long) '4');
        long long49 = frequency35.getCumFreq(' ');
        java.lang.String str50 = frequency35.toString();
        frequency35.addValue((long) 0);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        long long55 = frequency53.getCumFreq((java.lang.Object) 100L);
        double double57 = frequency53.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        double double62 = frequency58.getPct((-1));
        java.util.Iterator iterator63 = frequency58.valuesIterator();
        double double64 = frequency53.getPct((java.lang.Object) frequency58);
        frequency53.addValue((java.lang.Integer) 10);
        long long68 = frequency53.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency();
        long long71 = frequency69.getCumFreq((java.lang.Object) 100L);
        double double73 = frequency69.getCumPct(0);
        double double75 = frequency69.getCumPct('a');
        long long77 = frequency69.getCount(100);
        double double79 = frequency69.getCumPct(0);
        long long80 = frequency69.getSumFreq();
        long long81 = frequency53.getCount((java.lang.Object) frequency69);
        long long82 = frequency35.getCount((java.lang.Object) frequency69);
        long long84 = frequency35.getCumFreq('a');
        double double85 = frequency0.getPct((java.lang.Object) frequency35);
        double double87 = frequency0.getPct((long) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        java.lang.String str7 = frequency0.toString();
        java.lang.String str8 = frequency0.toString();
        double double10 = frequency0.getPct(0L);
        double double12 = frequency0.getCumPct(2L);
        frequency0.addValue(' ');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct('#');
        long long19 = frequency15.getCumFreq((long) (byte) 100);
        double double21 = frequency15.getPct((java.lang.Object) Double.NaN);
        long long23 = frequency15.getCount((java.lang.Object) (byte) -1);
        frequency15.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getCumFreq((java.lang.Object) frequency15);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getCumPct('#');
        long long31 = frequency27.getCumFreq((long) (byte) 100);
        long long33 = frequency27.getCount((int) ' ');
        double double35 = frequency27.getPct((long) 1);
        long long37 = frequency27.getCumFreq(100L);
        long long39 = frequency27.getCount((-1));
        long long41 = frequency27.getCount((long) (byte) 0);
        double double43 = frequency27.getPct('a');
        frequency27.addValue(10L);
        java.util.Iterator iterator46 = frequency27.valuesIterator();
        long long47 = frequency0.getCount((java.lang.Object) iterator46);
        double double49 = frequency0.getPct((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double26 = frequency0.getPct((int) (byte) 1);
        double double28 = frequency0.getCumPct(' ');
        double double30 = frequency0.getPct((long) 0);
        frequency0.addValue((long) (-1));
        java.lang.String str33 = frequency0.toString();
        double double35 = frequency0.getPct('a');
        long long37 = frequency0.getCumFreq(4L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        double double6 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct('#');
        long long11 = frequency7.getCumFreq((long) (byte) 100);
        long long13 = frequency7.getCount(' ');
        double double15 = frequency7.getCumPct((long) 1);
        long long17 = frequency7.getCount((long) (short) -1);
        long long19 = frequency7.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        double double24 = frequency20.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getCumPct('#');
        double double29 = frequency25.getPct((-1));
        java.util.Iterator iterator30 = frequency25.valuesIterator();
        double double31 = frequency20.getPct((java.lang.Object) frequency25);
        frequency20.addValue((-1L));
        double double34 = frequency7.getCumPct((java.lang.Object) (-1L));
        double double36 = frequency7.getCumPct(2L);
        java.lang.Class<?> wildcardClass37 = frequency7.getClass();
        long long38 = frequency0.getCumFreq((java.lang.Object) wildcardClass37);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        long long42 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        frequency0.addValue((int) (short) 100);
        long long16 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Object) (byte) 10);
        frequency17.clear();
        java.lang.String str21 = frequency17.toString();
        java.lang.Object obj22 = null;
        double double23 = frequency17.getCumPct(obj22);
        long long24 = frequency0.getCumFreq((java.lang.Object) double23);
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        java.lang.String str20 = frequency0.toString();
        double double22 = frequency0.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((-1));
        double double27 = frequency23.getCumPct((long) (byte) 100);
        frequency23.addValue('4');
        frequency23.clear();
        frequency23.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str33 = frequency23.toString();
        double double34 = frequency0.getPct((java.lang.Object) str33);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((java.lang.Object) 100L);
        long long39 = frequency35.getCount('#');
        long long41 = frequency35.getCount('4');
        double double43 = frequency35.getPct((int) (byte) 0);
        long long45 = frequency35.getCount((int) (byte) 100);
        long long46 = frequency0.getCumFreq((java.lang.Object) frequency35);
        java.lang.Object obj47 = null;
        long long48 = frequency35.getCumFreq(obj47);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        frequency16.addValue(0);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long29 = frequency16.getCount((java.lang.Object) frequency21);
        double double30 = frequency11.getPct((java.lang.Object) frequency16);
        frequency11.addValue((long) '#');
        double double33 = frequency0.getPct((java.lang.Object) frequency11);
        long long35 = frequency0.getCount((long) (-1));
        frequency0.addValue((java.lang.Integer) 1);
        double double39 = frequency0.getPct((long) (byte) 100);
        long long41 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((java.lang.Object) true);
        double double4 = frequency0.getCumPct('a');
        double double6 = frequency0.getPct((long) (short) 100);
        double double8 = frequency0.getPct(' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((long) 1);
        double double6 = frequency0.getCumPct((long) 0);
        frequency0.addValue((long) '4');
        frequency0.addValue((int) (short) -1);
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        double double24 = frequency20.getCumPct(0);
        java.lang.String str25 = frequency20.toString();
        double double26 = frequency13.getPct((java.lang.Object) frequency20);
        long long27 = frequency0.getCount((java.lang.Object) frequency13);
        java.lang.Class<?> wildcardClass28 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getCumPct((int) (short) 1);
        double double19 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        java.lang.Object obj20 = null;
        double double21 = frequency0.getCumPct(obj20);
        long long23 = frequency0.getCount((int) (short) 1);
        frequency0.addValue((long) (byte) 1);
        long long27 = frequency0.getCount(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        double double9 = frequency0.getCumPct('4');
        frequency0.addValue((int) (byte) 1);
        long long13 = frequency0.getCount((int) (short) 0);
        long long15 = frequency0.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        frequency0.addValue((int) (short) -1);
        frequency0.addValue(0);
        long long8 = frequency0.getCount('4');
        frequency0.addValue(100L);
        long long12 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        frequency0.addValue((long) 1);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct('#');
        long long11 = frequency7.getCumFreq((long) (byte) 100);
        frequency7.addValue((java.lang.Integer) (-1));
        double double15 = frequency7.getPct('4');
        double double17 = frequency7.getPct((long) 100);
        double double19 = frequency7.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        long long24 = frequency20.getCumFreq((long) (byte) 100);
        long long26 = frequency20.getCount(' ');
        double double28 = frequency20.getPct(0);
        long long29 = frequency7.getCount((java.lang.Object) 0);
        java.lang.String str30 = frequency7.toString();
        long long32 = frequency7.getCount((int) (byte) 1);
        double double34 = frequency7.getPct('4');
        double double36 = frequency7.getPct((long) ' ');
        double double37 = frequency0.getCumPct((java.lang.Object) double36);
        long long39 = frequency0.getCumFreq((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        long long44 = frequency40.getCount('#');
        java.util.Iterator iterator45 = frequency40.valuesIterator();
        double double47 = frequency40.getPct((long) (short) 10);
        double double49 = frequency40.getPct((long) (byte) 10);
        java.util.Iterator iterator50 = frequency40.valuesIterator();
        frequency40.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        long long55 = frequency53.getCumFreq((java.lang.Object) 100L);
        double double57 = frequency53.getPct((int) (byte) 0);
        long long59 = frequency53.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency();
        double double62 = frequency60.getPct((long) '4');
        double double64 = frequency60.getPct((java.lang.Object) 100L);
        long long66 = frequency60.getCount((long) (-1));
        long long68 = frequency60.getCount((long) (-1));
        double double69 = frequency53.getPct((java.lang.Object) frequency60);
        long long70 = frequency40.getCount((java.lang.Object) frequency53);
        frequency53.addValue((java.lang.Comparable<java.lang.String>) "");
        long long74 = frequency53.getCumFreq(0L);
        double double75 = frequency0.getCumPct((java.lang.Object) frequency53);
        long long77 = frequency53.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        frequency5.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator15 = frequency5.valuesIterator();
        long long16 = frequency0.getCount((java.lang.Object) frequency5);
        long long17 = frequency0.getSumFreq();
        java.util.Iterator iterator18 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((long) (byte) 10);
        double double23 = frequency19.getPct((java.lang.Object) 10);
        long long25 = frequency19.getCount(10L);
        frequency19.addValue('a');
        double double29 = frequency19.getPct('4');
        long long31 = frequency19.getCumFreq((long) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getPct((long) '4');
        frequency32.addValue(0);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        long long39 = frequency37.getCumFreq((java.lang.Object) 100L);
        double double41 = frequency37.getCumPct(0);
        double double43 = frequency37.getCumPct('a');
        java.lang.String str44 = frequency37.toString();
        long long45 = frequency32.getCount((java.lang.Object) frequency37);
        long long47 = frequency32.getCount((int) (short) 100);
        frequency32.clear();
        java.util.Iterator iterator49 = frequency32.valuesIterator();
        double double50 = frequency19.getPct((java.lang.Object) iterator49);
        java.lang.Class<?> wildcardClass51 = frequency19.getClass();
        double double52 = frequency0.getCumPct((java.lang.Object) wildcardClass51);
        double double54 = frequency0.getCumPct(1);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCount((long) (byte) 10);
        double double59 = frequency55.getPct((java.lang.Object) 10);
        long long61 = frequency55.getCount(10L);
        frequency55.addValue((int) (byte) -1);
        long long64 = frequency55.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency();
        double double67 = frequency65.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator68 = frequency65.valuesIterator();
        long long69 = frequency55.getCount((java.lang.Object) frequency65);
        double double71 = frequency55.getCumPct((long) 1);
        double double72 = frequency0.getCumPct((java.lang.Object) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str44, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        long long5 = frequency0.getCumFreq((java.lang.Object) Double.NaN);
        java.lang.String str6 = frequency0.toString();
        double double8 = frequency0.getCumPct((long) (short) 1);
        long long10 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getCumPct((long) '#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct('#');
        double double20 = frequency16.getPct((-1));
        java.util.Iterator iterator21 = frequency16.valuesIterator();
        double double22 = frequency11.getPct((java.lang.Object) frequency16);
        frequency11.addValue((java.lang.Integer) 10);
        long long26 = frequency11.getCount((long) (short) 10);
        long long27 = frequency0.getCount((java.lang.Object) long26);
        long long29 = frequency0.getCumFreq(10);
        long long31 = frequency0.getCumFreq('a');
        java.lang.String str32 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n\t1\t100%\t100%\n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n\t1\t100%\t100%\n");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        double double8 = frequency0.getPct((long) (short) 10);
        double double10 = frequency0.getCumPct('#');
        long long12 = frequency0.getCumFreq(' ');
        double double14 = frequency0.getCumPct('a');
        java.lang.String str15 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        double double8 = frequency0.getPct((int) (byte) 0);
        long long10 = frequency0.getCount((int) (byte) 100);
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCount((long) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        double double17 = frequency0.getCumPct(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        java.lang.Class<?> wildcardClass20 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        frequency0.addValue(10L);
        double double9 = frequency0.getCumPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((long) '4');
        double double14 = frequency10.getPct((java.lang.Object) 100L);
        long long16 = frequency10.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        double double21 = frequency17.getPct((int) (byte) 0);
        java.lang.String str22 = frequency17.toString();
        frequency17.addValue((java.lang.Integer) 1);
        long long25 = frequency10.getCount((java.lang.Object) frequency17);
        double double27 = frequency17.getCumPct((int) (short) 0);
        double double28 = frequency0.getPct((java.lang.Object) double27);
        long long30 = frequency0.getCount(' ');
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        double double35 = frequency33.getCumPct('#');
        double double37 = frequency33.getPct((-1));
        java.util.Iterator iterator38 = frequency33.valuesIterator();
        long long40 = frequency33.getCumFreq('4');
        frequency33.addValue(' ');
        long long44 = frequency33.getCumFreq('#');
        long long45 = frequency0.getCount((java.lang.Object) '#');
        long long47 = frequency0.getCumFreq((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        double double29 = frequency0.getPct(0);
        double double31 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue('a');
        double double10 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        frequency11.addValue((java.lang.Integer) (-1));
        double double19 = frequency11.getPct('4');
        double double21 = frequency11.getPct((long) 100);
        double double23 = frequency11.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        long long28 = frequency24.getCumFreq((long) (byte) 100);
        long long30 = frequency24.getCount(' ');
        double double32 = frequency24.getPct(0);
        long long33 = frequency11.getCount((java.lang.Object) 0);
        double double34 = frequency0.getPct((java.lang.Object) frequency11);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        long long50 = frequency35.getCount((int) (short) 100);
        java.util.Iterator iterator51 = frequency35.valuesIterator();
        double double53 = frequency35.getPct('4');
        double double54 = frequency0.getCumPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        long long57 = frequency55.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getPct((long) '4');
        double double62 = frequency58.getPct((long) 1);
        double double63 = frequency55.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator64 = frequency55.valuesIterator();
        long long66 = frequency55.getCumFreq('a');
        long long67 = frequency55.getSumFreq();
        frequency55.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        java.util.Iterator iterator70 = frequency55.valuesIterator();
        double double71 = frequency0.getPct((java.lang.Object) iterator70);
        frequency0.addValue('#');
        double double75 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        long long8 = frequency0.getCumFreq(0L);
        double double10 = frequency0.getCumPct((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        double double6 = frequency0.getPct('4');
        double double8 = frequency0.getCumPct((int) 'a');
        frequency0.addValue((java.lang.Integer) 0);
        double double12 = frequency0.getCumPct((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        java.util.Iterator iterator25 = frequency20.valuesIterator();
        double double27 = frequency20.getPct((long) (short) 10);
        double double29 = frequency20.getPct((long) (byte) 10);
        java.util.Iterator iterator30 = frequency20.valuesIterator();
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long33 = frequency13.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double35 = frequency13.getPct(' ');
        long long36 = frequency0.getCumFreq((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        long long14 = frequency0.getCumFreq(' ');
        java.lang.String str15 = frequency0.toString();
        frequency0.addValue((long) 0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((java.lang.Object) 100L);
        double double22 = frequency18.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        double double25 = frequency23.getCumPct('#');
        double double27 = frequency23.getPct((-1));
        java.util.Iterator iterator28 = frequency23.valuesIterator();
        double double29 = frequency18.getPct((java.lang.Object) frequency23);
        frequency18.addValue((java.lang.Integer) 10);
        long long33 = frequency18.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        double double38 = frequency34.getCumPct(0);
        double double40 = frequency34.getCumPct('a');
        long long42 = frequency34.getCount(100);
        double double44 = frequency34.getCumPct(0);
        long long45 = frequency34.getSumFreq();
        long long46 = frequency18.getCount((java.lang.Object) frequency34);
        long long47 = frequency0.getCount((java.lang.Object) frequency34);
        long long49 = frequency0.getCumFreq('a');
        long long51 = frequency0.getCount((long) (short) 10);
        double double53 = frequency0.getCumPct((long) (short) 100);
        long long55 = frequency0.getCount('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.String str21 = frequency0.toString();
        double double23 = frequency0.getPct((int) '#');
        long long25 = frequency0.getCumFreq((int) (byte) 100);
        long long27 = frequency0.getCumFreq((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct(2L);
        long long9 = frequency0.getCumFreq((int) ' ');
        long long10 = frequency0.getSumFreq();
        double double12 = frequency0.getPct((long) (short) 0);
        double double14 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq(10);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct('#');
        long long11 = frequency7.getCumFreq((long) (byte) 100);
        long long13 = frequency7.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq((java.lang.Object) 100L);
        double double18 = frequency14.getCumPct(0);
        java.lang.String str19 = frequency14.toString();
        double double20 = frequency7.getPct((java.lang.Object) frequency14);
        java.util.Iterator iterator21 = frequency7.valuesIterator();
        long long22 = frequency0.getCount((java.lang.Object) iterator21);
        long long24 = frequency0.getCumFreq(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Object) (byte) 10);
        long long12 = frequency8.getCumFreq((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        double double17 = frequency13.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((java.lang.Object) 100L);
        double double22 = frequency18.getCumPct(0);
        double double24 = frequency18.getCumPct('a');
        java.lang.String str25 = frequency18.toString();
        frequency18.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator28 = frequency18.valuesIterator();
        long long29 = frequency13.getCount((java.lang.Object) frequency18);
        long long30 = frequency13.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct('#');
        frequency31.clear();
        long long36 = frequency31.getCumFreq((int) '#');
        double double37 = frequency13.getPct((java.lang.Object) frequency31);
        long long38 = frequency8.getCumFreq((java.lang.Object) double37);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((long) '4');
        double double43 = frequency39.getPct((java.lang.Object) 100L);
        long long45 = frequency39.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        long long48 = frequency46.getCumFreq((java.lang.Object) 100L);
        double double50 = frequency46.getPct((int) (byte) 0);
        java.lang.String str51 = frequency46.toString();
        frequency46.addValue((java.lang.Integer) 1);
        long long54 = frequency39.getCount((java.lang.Object) frequency46);
        java.lang.String str55 = frequency46.toString();
        long long56 = frequency8.getCount((java.lang.Object) frequency46);
        double double58 = frequency46.getCumPct(1);
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency();
        double double61 = frequency59.getCumPct('#');
        long long63 = frequency59.getCumFreq((long) (byte) 100);
        long long65 = frequency59.getCount((int) ' ');
        double double67 = frequency59.getPct((long) 1);
        long long69 = frequency59.getCount(' ');
        long long70 = frequency46.getCumFreq((java.lang.Object) ' ');
        double double71 = frequency0.getCumPct((java.lang.Object) long70);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str55, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        double double31 = frequency20.getCumPct((int) (short) 100);
        long long33 = frequency20.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        long long38 = frequency34.getCount('#');
        java.util.Iterator iterator39 = frequency34.valuesIterator();
        frequency34.addValue((java.lang.Object) "");
        frequency34.clear();
        long long44 = frequency34.getCumFreq((java.lang.Object) "");
        frequency34.clear();
        long long47 = frequency34.getCumFreq(' ');
        frequency34.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        long long50 = frequency20.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount((long) 'a');
        frequency52.addValue((java.lang.Integer) 10);
        frequency52.addValue((java.lang.Integer) 10);
        double double59 = frequency20.getCumPct((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        double double24 = frequency20.getPct((-1));
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long27 = frequency0.getCumFreq((java.lang.Object) frequency20);
        long long29 = frequency20.getCumFreq((java.lang.Object) "hi!");
        long long31 = frequency20.getCount((long) (byte) 10);
        long long33 = frequency20.getCount(0);
        long long35 = frequency20.getCumFreq((long) '4');
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getPct((long) '4');
        frequency36.addValue(0);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCumFreq((java.lang.Object) 100L);
        double double45 = frequency41.getCumPct(0);
        double double47 = frequency41.getCumPct('a');
        java.lang.String str48 = frequency41.toString();
        long long49 = frequency36.getCount((java.lang.Object) frequency41);
        long long51 = frequency36.getCount((int) (short) 100);
        frequency36.addValue((int) (short) 1);
        long long54 = frequency20.getCumFreq((java.lang.Object) frequency36);
        frequency20.clear();
        long long57 = frequency20.getCumFreq((long) (-1));
        double double59 = frequency20.getPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str48, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getCumPct(0);
        double double13 = frequency7.getCumPct('a');
        java.lang.String str14 = frequency7.toString();
        long long16 = frequency7.getCount((int) (byte) 10);
        double double18 = frequency7.getPct((int) (short) 100);
        java.util.Iterator iterator19 = frequency7.valuesIterator();
        frequency7.addValue(0L);
        long long23 = frequency7.getCount('4');
        long long24 = frequency0.getCount((java.lang.Object) '4');
        long long25 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long14 = frequency5.getSumFreq();
        long long15 = frequency5.getSumFreq();
        double double17 = frequency5.getCumPct('a');
        long long19 = frequency5.getCount('4');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((long) '4');
        frequency20.addValue(0);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCumFreq((java.lang.Object) 100L);
        double double29 = frequency25.getCumPct(0);
        double double31 = frequency25.getCumPct('a');
        java.lang.String str32 = frequency25.toString();
        long long33 = frequency20.getCount((java.lang.Object) frequency25);
        java.lang.String str34 = frequency25.toString();
        java.util.Iterator iterator35 = frequency25.valuesIterator();
        java.lang.String str36 = frequency25.toString();
        long long37 = frequency5.getCount((java.lang.Object) str36);
        frequency5.addValue(' ');
        double double41 = frequency5.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str34, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount(' ');
        double double21 = frequency13.getPct(0);
        long long22 = frequency0.getCount((java.lang.Object) 0);
        java.lang.String str23 = frequency0.toString();
        long long25 = frequency0.getCount((int) (byte) 1);
        double double27 = frequency0.getPct('4');
        long long29 = frequency0.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getPct((long) '4');
        double double34 = frequency30.getPct((java.lang.Object) 100L);
        long long36 = frequency30.getCount((long) (-1));
        long long38 = frequency30.getCount(' ');
        double double40 = frequency30.getPct(100L);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCumFreq((java.lang.Object) 100L);
        double double45 = frequency41.getCumPct(0);
        double double47 = frequency41.getCumPct('a');
        long long49 = frequency41.getCount(100);
        double double51 = frequency41.getCumPct(0);
        double double53 = frequency41.getPct('4');
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        double double56 = frequency54.getPct((long) '4');
        double double58 = frequency54.getPct((java.lang.Object) 100L);
        long long60 = frequency54.getCount((long) (-1));
        long long62 = frequency54.getCount((long) (-1));
        long long63 = frequency41.getCumFreq((java.lang.Object) (-1));
        java.lang.String str64 = frequency41.toString();
        double double65 = frequency30.getPct((java.lang.Object) frequency41);
        java.util.Iterator iterator66 = frequency30.valuesIterator();
        long long67 = frequency0.getCount((java.lang.Object) iterator66);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str64, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        java.lang.String str7 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((long) '4');
        double double15 = frequency11.getPct((long) 1);
        double double16 = frequency8.getCumPct((java.lang.Object) 1);
        frequency8.addValue((java.lang.Integer) 0);
        double double19 = frequency0.getPct((java.lang.Object) frequency8);
        double double21 = frequency0.getPct((long) (short) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) (short) 10);
        double double9 = frequency0.getPct((long) (byte) 10);
        frequency0.addValue((int) (byte) 0);
        double double13 = frequency0.getPct((int) '#');
        double double15 = frequency0.getPct(0L);
        long long17 = frequency0.getCumFreq('a');
        long long19 = frequency0.getCumFreq((long) '#');
        long long21 = frequency0.getCount((int) ' ');
        long long23 = frequency0.getCumFreq((int) (byte) 1);
        long long24 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct((java.lang.Object) 100.0f);
        long long8 = frequency0.getCount((java.lang.Object) 0.0d);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator12 = frequency9.valuesIterator();
        double double13 = frequency0.getPct((java.lang.Object) iterator12);
        long long15 = frequency0.getCumFreq('4');
        double double17 = frequency0.getCumPct((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        long long15 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        double double20 = frequency16.getPct((long) 1);
        double double22 = frequency16.getCumPct((long) 0);
        frequency16.addValue((long) '4');
        long long26 = frequency16.getCount('4');
        double double27 = frequency0.getCumPct((java.lang.Object) frequency16);
        long long29 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct('#');
        long long13 = frequency9.getCumFreq((long) (byte) 100);
        long long15 = frequency9.getCount((int) ' ');
        double double17 = frequency9.getPct((long) 1);
        double double19 = frequency9.getCumPct((int) (byte) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) double19);
        double double22 = frequency0.getCumPct((int) 'a');
        double double24 = frequency0.getCumPct('a');
        frequency0.addValue(0L);
        long long28 = frequency0.getCumFreq(10);
        double double30 = frequency0.getCumPct(3L);
        double double32 = frequency0.getPct(1L);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((java.lang.Object) 100L);
        long long37 = frequency33.getCount('#');
        frequency33.addValue(0L);
        long long40 = frequency0.getCumFreq((java.lang.Object) frequency33);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct((java.lang.Object) 100.0f);
        long long8 = frequency0.getCount((java.lang.Object) 0.0d);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator12 = frequency9.valuesIterator();
        double double13 = frequency0.getPct((java.lang.Object) iterator12);
        long long15 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct('#');
        long long20 = frequency16.getCumFreq((long) (byte) 100);
        long long22 = frequency16.getCount(' ');
        double double24 = frequency16.getCumPct((long) 1);
        long long26 = frequency16.getCount((long) (short) -1);
        long long28 = frequency16.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCumFreq((java.lang.Object) 100L);
        double double33 = frequency29.getCumPct(0);
        double double35 = frequency29.getCumPct('a');
        java.lang.String str36 = frequency29.toString();
        long long38 = frequency29.getCount((int) (byte) 10);
        double double40 = frequency29.getPct((int) (short) 100);
        java.util.Iterator iterator41 = frequency29.valuesIterator();
        frequency29.addValue(0L);
        double double45 = frequency29.getPct((long) 0);
        long long46 = frequency16.getCumFreq((java.lang.Object) frequency29);
        long long47 = frequency0.getCount((java.lang.Object) long46);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        long long21 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('a');
        long long25 = frequency0.getCumFreq((long) ' ');
        java.util.Iterator iterator26 = frequency0.valuesIterator();
        long long28 = frequency0.getCount((int) '#');
        double double30 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        double double5 = frequency0.getPct((long) 100);
        frequency0.addValue((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        frequency10.addValue('4');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct('#');
        long long26 = frequency22.getCumFreq((long) (byte) 100);
        long long28 = frequency22.getCount((int) ' ');
        double double30 = frequency22.getPct((long) 1);
        long long32 = frequency22.getCumFreq(100L);
        long long33 = frequency10.getCount((java.lang.Object) long32);
        double double35 = frequency10.getPct(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount(' ');
        double double21 = frequency13.getPct(0);
        long long22 = frequency0.getCount((java.lang.Object) 0);
        java.lang.String str23 = frequency0.toString();
        long long25 = frequency0.getCount((int) (byte) 1);
        double double27 = frequency0.getPct('4');
        double double29 = frequency0.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getCumPct('#');
        long long34 = frequency30.getCumFreq((long) (byte) 100);
        long long36 = frequency30.getCount(' ');
        double double38 = frequency30.getCumPct((long) 1);
        long long40 = frequency30.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        double double43 = frequency41.getCumPct('#');
        long long45 = frequency41.getCumFreq((long) (byte) 100);
        long long47 = frequency41.getCount(' ');
        double double49 = frequency41.getCumPct((long) 1);
        long long50 = frequency30.getCumFreq((java.lang.Object) 1);
        java.lang.String str51 = frequency30.toString();
        long long53 = frequency30.getCumFreq(0);
        long long55 = frequency30.getCumFreq((int) (byte) 100);
        frequency30.clear();
        long long57 = frequency0.getCount((java.lang.Object) frequency30);
        long long58 = frequency30.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        java.lang.String str4 = frequency0.toString();
        long long6 = frequency0.getCount((long) '#');
        double double8 = frequency0.getCumPct('a');
        long long10 = frequency0.getCount((java.lang.Object) 'a');
        long long11 = frequency0.getSumFreq();
        long long12 = frequency0.getSumFreq();
        long long14 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((long) '4');
        double double7 = frequency3.getPct((long) 1);
        double double8 = frequency0.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator9 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        java.lang.String str15 = frequency10.toString();
        java.lang.String str16 = frequency10.toString();
        double double17 = frequency0.getPct((java.lang.Object) str16);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount((long) (byte) 10);
        double double22 = frequency18.getPct((java.lang.Object) 10);
        long long24 = frequency18.getCount(10L);
        frequency18.addValue((int) (byte) -1);
        long long28 = frequency18.getCount((int) (byte) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency18);
        java.lang.String str30 = frequency18.toString();
        frequency18.addValue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        double double9 = frequency0.getCumPct('4');
        long long11 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long13 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((long) '4');
        double double7 = frequency3.getPct((long) 1);
        double double8 = frequency0.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator9 = frequency0.valuesIterator();
        long long11 = frequency0.getCumFreq('a');
        long long12 = frequency0.getSumFreq();
        double double14 = frequency0.getPct(10);
        java.util.Iterator iterator15 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getPct((int) (byte) 0);
        java.lang.String str12 = frequency7.toString();
        frequency7.addValue((java.lang.Integer) 1);
        long long15 = frequency0.getCount((java.lang.Object) frequency7);
        java.lang.String str16 = frequency7.toString();
        double double18 = frequency7.getPct((int) '4');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((long) (byte) 10);
        double double23 = frequency19.getPct((java.lang.Object) 10);
        long long25 = frequency19.getCount(10L);
        long long26 = frequency19.getSumFreq();
        double double27 = frequency7.getCumPct((java.lang.Object) long26);
        // The following exception was thrown during execution in test generation
        try {
            frequency7.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('a');
        long long8 = frequency0.getCumFreq((int) (short) 1);
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCount(0L);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) (short) 10);
        double double9 = frequency0.getPct((long) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct('#');
        double double19 = frequency15.getPct((-1));
        java.util.Iterator iterator20 = frequency15.valuesIterator();
        double double21 = frequency10.getPct((java.lang.Object) frequency15);
        frequency10.addValue((-1L));
        frequency10.addValue((java.lang.Integer) (-1));
        long long26 = frequency0.getCount((java.lang.Object) (-1));
        double double28 = frequency0.getCumPct((-1L));
        java.util.Iterator iterator29 = frequency0.valuesIterator();
        long long31 = frequency0.getCumFreq((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getCumPct((long) '#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getCumPct(0);
        double double13 = frequency7.getCumPct('a');
        java.lang.String str14 = frequency7.toString();
        long long16 = frequency7.getCount((int) (byte) 10);
        double double18 = frequency7.getCumPct('4');
        long long19 = frequency0.getCount((java.lang.Object) double18);
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        double double21 = frequency0.getPct((long) 100);
        frequency0.addValue(0L);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq((java.lang.Object) 100L);
        double double28 = frequency24.getCumPct(0);
        double double30 = frequency24.getCumPct('a');
        java.lang.String str31 = frequency24.toString();
        long long33 = frequency24.getCount((int) (byte) 10);
        long long35 = frequency24.getCount('4');
        frequency24.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        double double40 = frequency38.getCumPct('#');
        long long42 = frequency38.getCumFreq((long) (byte) 100);
        long long44 = frequency38.getCount(' ');
        double double46 = frequency38.getCumPct((long) 1);
        long long48 = frequency38.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        double double51 = frequency49.getCumPct('#');
        long long53 = frequency49.getCumFreq((long) (byte) 100);
        long long55 = frequency49.getCount(' ');
        double double57 = frequency49.getCumPct((long) 1);
        long long58 = frequency38.getCumFreq((java.lang.Object) 1);
        long long60 = frequency38.getCumFreq((long) (byte) 100);
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        double double63 = frequency24.getCumPct((java.lang.Object) frequency38);
        double double64 = frequency0.getPct((java.lang.Object) frequency24);
        long long66 = frequency24.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        double double69 = frequency67.getCumPct('#');
        long long71 = frequency67.getCumFreq((long) (byte) 100);
        long long73 = frequency67.getCount(' ');
        double double75 = frequency67.getCumPct((long) 1);
        long long77 = frequency67.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency78 = new org.apache.commons.math.stat.Frequency();
        double double80 = frequency78.getCumPct('#');
        long long82 = frequency78.getCumFreq((long) (byte) 100);
        long long84 = frequency78.getCount(' ');
        double double86 = frequency78.getCumPct((long) 1);
        long long87 = frequency67.getCumFreq((java.lang.Object) 1);
        long long89 = frequency67.getCumFreq((long) (byte) 100);
        java.lang.String str90 = frequency67.toString();
        double double92 = frequency67.getPct('#');
        long long93 = frequency24.getCumFreq((java.lang.Object) frequency67);
        double double95 = frequency67.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str90, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        double double6 = frequency0.getPct('#');
        frequency0.addValue((int) (short) 10);
        double double10 = frequency0.getCumPct((int) ' ');
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((long) '4');
        frequency13.addValue(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCumFreq((java.lang.Object) 100L);
        double double22 = frequency18.getCumPct(0);
        double double24 = frequency18.getCumPct('a');
        java.lang.String str25 = frequency18.toString();
        long long26 = frequency13.getCount((java.lang.Object) frequency18);
        long long28 = frequency13.getCount((int) (short) 100);
        frequency13.clear();
        java.lang.String str30 = frequency13.toString();
        double double32 = frequency13.getCumPct((int) (byte) 1);
        double double33 = frequency0.getPct((java.lang.Object) double32);
        long long35 = frequency0.getCount(4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        java.lang.String str5 = frequency0.toString();
        java.util.Iterator iterator6 = frequency0.valuesIterator();
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct('#');
        long long12 = frequency8.getCumFreq((long) (byte) 100);
        frequency8.addValue((java.lang.Integer) (-1));
        double double16 = frequency8.getPct('4');
        double double18 = frequency8.getPct((long) 100);
        double double20 = frequency8.getCumPct((long) '4');
        double double22 = frequency8.getCumPct('#');
        long long24 = frequency8.getCumFreq('#');
        long long26 = frequency8.getCumFreq((long) 1);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq((java.lang.Object) 100L);
        long long31 = frequency27.getCount('#');
        long long33 = frequency27.getCount('4');
        double double35 = frequency27.getPct((int) (byte) 0);
        long long37 = frequency27.getCount((int) (byte) 100);
        java.lang.String str38 = frequency27.toString();
        long long40 = frequency27.getCount((long) 100);
        double double42 = frequency27.getCumPct((int) (byte) 0);
        double double43 = frequency8.getCumPct((java.lang.Object) (byte) 0);
        double double44 = frequency0.getPct((java.lang.Object) frequency8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('a');
        double double8 = frequency0.getCumPct('a');
        long long10 = frequency0.getCumFreq((long) (byte) 10);
        double double12 = frequency0.getPct((long) (short) -1);
        double double14 = frequency0.getCumPct(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount((int) ' ');
        double double19 = frequency11.getPct((long) 1);
        double double21 = frequency11.getCumPct((int) (byte) 1);
        double double22 = frequency0.getPct((java.lang.Object) (byte) 1);
        long long24 = frequency0.getCount((int) ' ');
        long long25 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq((-1));
        double double30 = frequency26.getCumPct((long) (byte) 100);
        frequency26.addValue('4');
        frequency26.clear();
        frequency26.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long36 = frequency26.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        long long39 = frequency37.getCumFreq((java.lang.Object) 100L);
        long long41 = frequency37.getCount('#');
        java.util.Iterator iterator42 = frequency37.valuesIterator();
        double double44 = frequency37.getPct((long) (short) 10);
        double double46 = frequency37.getPct((long) (byte) 10);
        frequency37.addValue((int) (byte) 0);
        double double49 = frequency26.getPct((java.lang.Object) frequency37);
        double double51 = frequency26.getCumPct((long) (short) 10);
        long long52 = frequency0.getCount((java.lang.Object) double51);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct(2L);
        long long9 = frequency0.getCumFreq((int) ' ');
        long long10 = frequency0.getSumFreq();
        long long12 = frequency0.getCount((long) (byte) 10);
        double double14 = frequency0.getPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) "");
        frequency0.clear();
        long long10 = frequency0.getCumFreq((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        frequency16.addValue(0);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long29 = frequency16.getCount((java.lang.Object) frequency21);
        double double30 = frequency11.getPct((java.lang.Object) frequency16);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq((java.lang.Object) 100L);
        long long35 = frequency31.getCount('#');
        long long37 = frequency31.getCount('4');
        frequency31.addValue((java.lang.Integer) 100);
        double double40 = frequency11.getCumPct((java.lang.Object) frequency31);
        long long42 = frequency31.getCount('#');
        long long44 = frequency31.getCount(1);
        long long45 = frequency0.getCount((java.lang.Object) frequency31);
        long long47 = frequency31.getCumFreq((long) '4');
        double double49 = frequency31.getPct((int) (byte) 100);
        frequency31.clear();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((long) '4');
        double double12 = frequency8.getPct((java.lang.Object) 100L);
        long long14 = frequency8.getCount((long) (-1));
        long long16 = frequency8.getCount(' ');
        frequency8.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double20 = frequency8.getCumPct((int) '4');
        frequency8.clear();
        double double23 = frequency8.getPct(0L);
        double double24 = frequency0.getCumPct((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        long long10 = frequency0.getCount((int) (byte) 100);
        double double12 = frequency0.getCumPct((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double12 = frequency0.getCumPct((int) '4');
        frequency0.clear();
        double double15 = frequency0.getPct(0L);
        frequency0.addValue((-1));
        long long19 = frequency0.getCount((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        long long15 = frequency0.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        long long24 = frequency16.getCount(100);
        double double26 = frequency16.getCumPct(0);
        long long27 = frequency16.getSumFreq();
        long long28 = frequency0.getCount((java.lang.Object) frequency16);
        frequency0.clear();
        java.util.Iterator iterator30 = frequency0.valuesIterator();
        long long32 = frequency0.getCumFreq('#');
        java.lang.String str33 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        java.lang.String str20 = frequency0.toString();
        double double22 = frequency0.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        long long25 = frequency23.getCumFreq((java.lang.Object) 100L);
        double double27 = frequency23.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((long) '4');
        frequency28.addValue(0);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        long long35 = frequency33.getCumFreq((java.lang.Object) 100L);
        double double37 = frequency33.getCumPct(0);
        double double39 = frequency33.getCumPct('a');
        java.lang.String str40 = frequency33.toString();
        long long41 = frequency28.getCount((java.lang.Object) frequency33);
        double double42 = frequency23.getPct((java.lang.Object) frequency28);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        long long45 = frequency43.getCumFreq((java.lang.Object) 100L);
        long long47 = frequency43.getCount('#');
        long long49 = frequency43.getCount('4');
        frequency43.addValue((java.lang.Integer) 100);
        double double52 = frequency23.getCumPct((java.lang.Object) frequency43);
        double double54 = frequency43.getCumPct((int) (short) 100);
        double double55 = frequency0.getCumPct((java.lang.Object) (short) 100);
        double double57 = frequency0.getPct('a');
        long long59 = frequency0.getCount('#');
        double double61 = frequency0.getPct((int) (byte) 1);
        java.lang.String str62 = frequency0.toString();
        frequency0.addValue(100L);
        double double66 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        frequency0.addValue((java.lang.Integer) (-1));
        long long10 = frequency0.getCount((int) (byte) -1);
        frequency0.addValue((int) (short) 0);
        double double14 = frequency0.getCumPct((int) (byte) 100);
        double double16 = frequency0.getPct((int) (byte) 10);
        java.lang.String str17 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        long long10 = frequency0.getCumFreq((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((long) '4');
        double double17 = frequency13.getPct((long) 1);
        double double19 = frequency13.getCumPct((long) 0);
        double double21 = frequency13.getCumPct('#');
        frequency13.addValue(' ');
        long long24 = frequency0.getCount((java.lang.Object) frequency13);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getPct((long) '4');
        frequency25.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        double double36 = frequency30.getCumPct('a');
        java.lang.String str37 = frequency30.toString();
        long long38 = frequency25.getCount((java.lang.Object) frequency30);
        long long39 = frequency30.getSumFreq();
        long long41 = frequency30.getCumFreq((long) 1);
        java.lang.String str42 = frequency30.toString();
        double double43 = frequency0.getCumPct((java.lang.Object) frequency30);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        java.lang.String str4 = frequency0.toString();
        long long6 = frequency0.getCount((long) '#');
        double double8 = frequency0.getCumPct('a');
        long long10 = frequency0.getCount((java.lang.Object) 'a');
        long long11 = frequency0.getSumFreq();
        long long13 = frequency0.getCount((int) '4');
        java.util.Iterator iterator14 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCount((long) (byte) 10);
        double double21 = frequency17.getPct((java.lang.Object) 10);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct('#');
        long long26 = frequency22.getCumFreq((long) (byte) 100);
        long long28 = frequency22.getCount((int) ' ');
        frequency17.addValue((java.lang.Object) long28);
        long long30 = frequency0.getCumFreq((java.lang.Object) frequency17);
        java.lang.Comparable<java.lang.String> strComparable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency17.addValue(strComparable31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        long long15 = frequency0.getCount((long) (short) 10);
        long long17 = frequency0.getCumFreq((int) (short) -1);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        long long22 = frequency18.getCumFreq((long) (byte) 100);
        frequency18.addValue((java.lang.Integer) (-1));
        frequency18.addValue((java.lang.Integer) (-1));
        double double28 = frequency18.getPct((int) '4');
        double double30 = frequency18.getCumPct('a');
        double double32 = frequency18.getPct(' ');
        double double34 = frequency18.getPct((long) 0);
        frequency0.addValue((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getCumPct('#');
        double double10 = frequency6.getPct((-1));
        java.util.Iterator iterator11 = frequency6.valuesIterator();
        long long12 = frequency0.getCumFreq((java.lang.Object) iterator11);
        long long14 = frequency0.getCumFreq((int) (byte) 10);
        long long16 = frequency0.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct('#');
        double double21 = frequency17.getPct((-1));
        frequency17.addValue((long) ' ');
        java.lang.String str24 = frequency17.toString();
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((long) '4');
        double double32 = frequency28.getPct((long) 1);
        double double33 = frequency25.getCumPct((java.lang.Object) 1);
        frequency25.addValue((java.lang.Integer) 0);
        double double36 = frequency17.getPct((java.lang.Object) frequency25);
        long long37 = frequency0.getCount((java.lang.Object) frequency17);
        long long39 = frequency0.getCumFreq((long) (short) 10);
        double double41 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        frequency0.addValue((int) '4');
        long long14 = frequency0.getCount((long) 100);
        double double16 = frequency0.getCumPct('4');
        double double18 = frequency0.getCumPct(0L);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCumFreq((java.lang.Object) 100L);
        double double23 = frequency19.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        double double28 = frequency24.getPct((-1));
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        double double30 = frequency19.getPct((java.lang.Object) frequency24);
        frequency19.addValue((-1L));
        frequency19.addValue((java.lang.Integer) (-1));
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency19);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.5d + "'", double18 == 0.5d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        frequency0.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct('#');
        long long13 = frequency9.getCumFreq((long) (byte) 100);
        long long15 = frequency9.getCount((int) ' ');
        double double17 = frequency9.getPct((long) 1);
        double double19 = frequency9.getCumPct((int) (byte) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) double19);
        double double22 = frequency0.getCumPct((int) 'a');
        double double24 = frequency0.getCumPct('a');
        frequency0.addValue(0L);
        frequency0.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCumFreq((java.lang.Object) 100L);
        double double33 = frequency29.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getPct((long) '4');
        frequency34.addValue(0);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq((java.lang.Object) 100L);
        double double43 = frequency39.getCumPct(0);
        double double45 = frequency39.getCumPct('a');
        java.lang.String str46 = frequency39.toString();
        long long47 = frequency34.getCount((java.lang.Object) frequency39);
        double double48 = frequency29.getPct((java.lang.Object) frequency39);
        java.lang.String str49 = frequency29.toString();
        double double51 = frequency29.getCumPct((long) 10);
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        long long54 = frequency52.getCumFreq((-1));
        double double56 = frequency52.getCumPct((long) (byte) 100);
        frequency52.addValue('4');
        frequency52.clear();
        frequency52.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.lang.String str62 = frequency52.toString();
        double double63 = frequency29.getPct((java.lang.Object) str62);
        double double64 = frequency0.getCumPct((java.lang.Object) str62);
        long long66 = frequency0.getCount((long) (byte) 1);
        double double68 = frequency0.getCumPct('#');
        long long70 = frequency0.getCumFreq(10L);
        java.util.Comparator comparator71 = null;
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency(comparator71);
        org.apache.commons.math.stat.Frequency frequency73 = new org.apache.commons.math.stat.Frequency();
        long long75 = frequency73.getCumFreq((java.lang.Object) 100L);
        long long77 = frequency73.getCount('#');
        java.util.Iterator iterator78 = frequency73.valuesIterator();
        frequency73.addValue((java.lang.Object) "");
        long long81 = frequency72.getCount((java.lang.Object) frequency73);
        long long83 = frequency72.getCumFreq(0);
        double double84 = frequency0.getPct((java.lang.Object) 0);
        double double86 = frequency0.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 4L + "'", long70 == 4L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.25d + "'", double84 == 0.25d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        double double15 = frequency11.getPct((-1));
        frequency11.addValue((long) ' ');
        long long19 = frequency11.getCumFreq('a');
        java.lang.Class<?> wildcardClass20 = frequency11.getClass();
        double double21 = frequency0.getCumPct((java.lang.Object) wildcardClass20);
        java.lang.String str22 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        double double10 = frequency0.getPct('4');
        long long11 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 0);
        long long15 = frequency0.getCount(' ');
        java.util.Iterator iterator16 = frequency0.valuesIterator();
        double double18 = frequency0.getPct((int) (byte) 10);
        double double20 = frequency0.getCumPct('4');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct('#');
        long long25 = frequency21.getCumFreq((long) (byte) 100);
        long long27 = frequency21.getCount(' ');
        double double29 = frequency21.getCumPct((long) 1);
        long long31 = frequency21.getCount((long) (short) -1);
        long long33 = frequency21.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCumFreq((java.lang.Object) 100L);
        double double38 = frequency34.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        double double43 = frequency39.getPct((-1));
        java.util.Iterator iterator44 = frequency39.valuesIterator();
        double double45 = frequency34.getPct((java.lang.Object) frequency39);
        frequency34.addValue((-1L));
        double double48 = frequency21.getCumPct((java.lang.Object) (-1L));
        double double50 = frequency21.getCumPct(2L);
        java.lang.Class<?> wildcardClass51 = frequency21.getClass();
        double double52 = frequency0.getCumPct((java.lang.Object) wildcardClass51);
        long long54 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        frequency16.addValue(0);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long29 = frequency16.getCount((java.lang.Object) frequency21);
        double double30 = frequency11.getPct((java.lang.Object) frequency16);
        frequency11.addValue((long) '#');
        double double33 = frequency0.getPct((java.lang.Object) frequency11);
        long long35 = frequency11.getCount((long) (byte) 100);
        long long37 = frequency11.getCount((int) '4');
        frequency11.addValue((long) (byte) 100);
        java.lang.Class<?> wildcardClass40 = frequency11.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (short) 1);
        frequency0.addValue(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Object) (byte) 10);
        frequency11.clear();
        java.lang.String str15 = frequency11.toString();
        long long16 = frequency0.getCumFreq((java.lang.Object) frequency11);
        double double18 = frequency0.getPct((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        java.lang.String str7 = frequency0.toString();
        java.lang.String str8 = frequency0.toString();
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        double double12 = frequency0.getPct('#');
        double double14 = frequency0.getPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        double double9 = frequency0.getCumPct('4');
        frequency0.addValue((int) (byte) 1);
        long long13 = frequency0.getCount((int) (short) 0);
        double double15 = frequency0.getCumPct('4');
        double double17 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) (short) 10);
        long long9 = frequency0.getCumFreq((long) (-1));
        long long11 = frequency0.getCumFreq(1);
        frequency0.addValue((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator11 = frequency8.valuesIterator();
        double double12 = frequency0.getPct((java.lang.Object) frequency8);
        long long14 = frequency0.getCumFreq('a');
        double double16 = frequency0.getCumPct(10);
        long long18 = frequency0.getCumFreq(' ');
        long long20 = frequency0.getCumFreq((long) 0);
        double double22 = frequency0.getPct((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct((java.lang.Object) Double.NaN);
        long long8 = frequency0.getCount((java.lang.Object) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        double double13 = frequency9.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getCumPct('#');
        double double18 = frequency14.getPct((-1));
        java.util.Iterator iterator19 = frequency14.valuesIterator();
        double double20 = frequency9.getPct((java.lang.Object) frequency14);
        frequency9.addValue((-1L));
        double double24 = frequency9.getCumPct(100);
        java.util.Iterator iterator25 = frequency9.valuesIterator();
        long long26 = frequency0.getCumFreq((java.lang.Object) iterator25);
        java.lang.String str27 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        frequency0.addValue((java.lang.Integer) (-1));
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        double double49 = frequency30.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        double double54 = frequency50.getPct((-1));
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency30.getCumFreq((java.lang.Object) frequency50);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        long long62 = frequency58.getCumFreq((long) (byte) 100);
        double double64 = frequency58.getPct(' ');
        double double65 = frequency50.getPct((java.lang.Object) double64);
        double double66 = frequency0.getCumPct((java.lang.Object) frequency50);
        double double68 = frequency0.getCumPct(100L);
        long long70 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        long long73 = frequency71.getCumFreq((java.lang.Object) 100L);
        long long75 = frequency71.getCount('#');
        double double77 = frequency71.getPct('#');
        frequency71.addValue((int) (short) 10);
        double double81 = frequency71.getCumPct((int) ' ');
        java.util.Iterator iterator82 = frequency71.valuesIterator();
        long long83 = frequency0.getCumFreq((java.lang.Object) frequency71);
        double double85 = frequency0.getCumPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        long long11 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        long long15 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str13 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n100\t1\t33%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t33%\t33%\n10\t1\t33%\t67%\n100\t1\t33%\t100%\n");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        long long13 = frequency5.getCumFreq('a');
        double double15 = frequency5.getPct((int) (byte) 1);
        double double17 = frequency5.getPct(' ');
        frequency5.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        long long13 = frequency9.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Object) '#');
        long long16 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        double double21 = frequency17.getCumPct(0);
        double double23 = frequency17.getCumPct('a');
        java.lang.String str24 = frequency17.toString();
        frequency17.addValue((java.lang.Object) 100.0d);
        long long27 = frequency0.getCount((java.lang.Object) 100.0d);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double31 = frequency0.getCumPct(0);
        long long33 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        frequency0.addValue((long) (-1));
        long long14 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        double double10 = frequency0.getPct('4');
        double double12 = frequency0.getCumPct(2L);
        frequency0.addValue((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency15.getCumFreq((java.lang.Object) 100L);
        double double19 = frequency15.getCumPct(0);
        double double21 = frequency15.getCumPct('a');
        long long23 = frequency15.getCount(100);
        double double25 = frequency15.getCumPct(0);
        double double27 = frequency15.getPct('4');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((long) '4');
        double double32 = frequency28.getPct((java.lang.Object) 100L);
        long long34 = frequency28.getCount((long) (-1));
        long long36 = frequency28.getCount((long) (-1));
        long long37 = frequency15.getCumFreq((java.lang.Object) (-1));
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        long long40 = frequency38.getCumFreq((java.lang.Object) 100L);
        long long42 = frequency38.getCount('#');
        double double44 = frequency38.getPct('#');
        frequency38.addValue((int) (short) 10);
        long long47 = frequency15.getCount((java.lang.Object) frequency38);
        double double48 = frequency0.getPct((java.lang.Object) frequency38);
        double double50 = frequency38.getCumPct((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency38.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((long) 1);
        double double6 = frequency0.getCumPct((long) 0);
        double double8 = frequency0.getPct((long) 1);
        java.util.Iterator iterator9 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getPct(0);
        double double10 = frequency0.getCumPct((long) 'a');
        long long12 = frequency0.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        double double5 = frequency0.getPct((long) 100);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCumFreq((java.lang.Object) 100L);
        double double10 = frequency6.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((long) '4');
        frequency11.addValue(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        java.lang.String str23 = frequency16.toString();
        long long24 = frequency11.getCount((java.lang.Object) frequency16);
        double double25 = frequency6.getPct((java.lang.Object) frequency16);
        frequency16.addValue('4');
        long long29 = frequency16.getCumFreq('a');
        java.lang.String str30 = frequency16.toString();
        double double32 = frequency16.getPct((long) 100);
        double double33 = frequency0.getPct((java.lang.Object) frequency16);
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = frequency16.getCount(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        double double49 = frequency30.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        double double54 = frequency50.getPct((-1));
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency30.getCumFreq((java.lang.Object) frequency50);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        long long62 = frequency58.getCumFreq((long) (byte) 100);
        double double64 = frequency58.getPct(' ');
        double double65 = frequency50.getPct((java.lang.Object) double64);
        double double66 = frequency0.getCumPct((java.lang.Object) frequency50);
        java.lang.String str67 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str67, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount(' ');
        double double21 = frequency13.getPct(0);
        long long22 = frequency0.getCount((java.lang.Object) 0);
        java.lang.String str23 = frequency0.toString();
        long long25 = frequency0.getCount((int) (byte) 1);
        double double27 = frequency0.getPct('4');
        long long29 = frequency0.getCount((int) (short) 100);
        double double31 = frequency0.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq(10);
        double double8 = frequency0.getPct((long) (short) 0);
        double double10 = frequency0.getPct('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCumFreq(0);
        frequency0.clear();
        long long25 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue(' ');
        java.util.Iterator iterator29 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        frequency6.addValue((long) (byte) -1);
        double double9 = frequency0.getCumPct((java.lang.Object) frequency6);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((long) '4');
        double double14 = frequency10.getPct((java.lang.Object) 100L);
        long long16 = frequency10.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        double double21 = frequency17.getPct((int) (byte) 0);
        java.lang.String str22 = frequency17.toString();
        frequency17.addValue((java.lang.Integer) 1);
        long long25 = frequency10.getCount((java.lang.Object) frequency17);
        long long27 = frequency17.getCumFreq((-1));
        double double29 = frequency17.getCumPct('a');
        java.lang.String str30 = frequency17.toString();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq((java.lang.Object) 100L);
        double double35 = frequency31.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getPct((long) '4');
        frequency36.addValue(0);
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCumFreq((java.lang.Object) 100L);
        double double45 = frequency41.getCumPct(0);
        double double47 = frequency41.getCumPct('a');
        java.lang.String str48 = frequency41.toString();
        long long49 = frequency36.getCount((java.lang.Object) frequency41);
        double double50 = frequency31.getPct((java.lang.Object) frequency36);
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        long long53 = frequency51.getCumFreq((java.lang.Object) 100L);
        long long55 = frequency51.getCount('#');
        long long57 = frequency51.getCount('4');
        frequency51.addValue((java.lang.Integer) 100);
        double double60 = frequency31.getCumPct((java.lang.Object) frequency51);
        double double62 = frequency51.getCumPct((int) (short) 100);
        long long64 = frequency51.getCount((int) '4');
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency();
        long long67 = frequency65.getCumFreq((java.lang.Object) 100L);
        long long69 = frequency65.getCount('#');
        java.util.Iterator iterator70 = frequency65.valuesIterator();
        frequency65.addValue((java.lang.Object) "");
        frequency65.clear();
        long long75 = frequency65.getCumFreq((java.lang.Object) "");
        frequency65.clear();
        long long78 = frequency65.getCumFreq(' ');
        frequency65.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        long long81 = frequency51.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        long long82 = frequency17.getCumFreq((java.lang.Object) frequency51);
        long long83 = frequency0.getCumFreq((java.lang.Object) long82);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str48, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) 100);
        long long10 = frequency0.getCumFreq((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        frequency0.clear();
        long long5 = frequency0.getCumFreq((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long15 = frequency0.getCount((int) (short) 100);
        frequency0.clear();
        double double18 = frequency0.getCumPct((-1));
        double double20 = frequency0.getPct((int) (byte) 100);
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass23 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getPct((int) '#');
        double double19 = frequency0.getPct((int) (byte) 0);
        long long20 = frequency0.getSumFreq();
        frequency0.addValue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        long long10 = frequency0.getCumFreq(100);
        double double12 = frequency0.getPct((int) (byte) -1);
        long long14 = frequency0.getCumFreq((int) (byte) 0);
        double double16 = frequency0.getCumPct((long) (byte) 100);
        double double18 = frequency0.getPct(0L);
        double double20 = frequency0.getCumPct(' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        long long15 = frequency0.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long18 = frequency16.getCumFreq((java.lang.Object) 100L);
        double double20 = frequency16.getCumPct(0);
        double double22 = frequency16.getCumPct('a');
        long long24 = frequency16.getCount(100);
        double double26 = frequency16.getCumPct(0);
        long long27 = frequency16.getSumFreq();
        long long28 = frequency0.getCount((java.lang.Object) frequency16);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        long long33 = frequency29.getCumFreq((long) (byte) 100);
        double double35 = frequency29.getPct((java.lang.Object) Double.NaN);
        long long36 = frequency29.getSumFreq();
        frequency29.addValue((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        long long43 = frequency39.getCumFreq((long) (byte) 100);
        frequency39.clear();
        long long46 = frequency39.getCount((int) (short) 10);
        long long48 = frequency39.getCount(10);
        double double49 = frequency29.getPct((java.lang.Object) frequency39);
        double double50 = frequency16.getPct((java.lang.Object) frequency39);
        long long52 = frequency39.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq(10);
        double double8 = frequency0.getPct((int) (short) 0);
        long long10 = frequency0.getCount((long) (short) -1);
        java.lang.String str11 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getPct((java.lang.Object) 100.0f);
        long long8 = frequency0.getCount((java.lang.Object) 0.0d);
        long long10 = frequency0.getCumFreq('a');
        long long12 = frequency0.getCumFreq('#');
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (byte) 10);
        double double11 = frequency0.getPct((int) (short) 100);
        long long13 = frequency0.getCount('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        frequency5.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator15 = frequency5.valuesIterator();
        long long16 = frequency0.getCount((java.lang.Object) frequency5);
        long long17 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        frequency18.clear();
        long long23 = frequency18.getCumFreq((int) '#');
        double double24 = frequency0.getPct((java.lang.Object) frequency18);
        long long26 = frequency0.getCumFreq(1);
        java.lang.String str27 = frequency0.toString();
        double double29 = frequency0.getPct(1);
        frequency0.addValue(100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCumFreq(100L);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct((int) (byte) 100);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        double double17 = frequency0.getPct((int) (byte) 1);
        long long19 = frequency0.getCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount((int) ' ');
        double double19 = frequency11.getPct((long) 1);
        double double21 = frequency11.getCumPct((int) (byte) 1);
        double double22 = frequency0.getPct((java.lang.Object) (byte) 1);
        double double24 = frequency0.getPct('a');
        double double26 = frequency0.getPct((int) '4');
        long long28 = frequency0.getCount(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCumFreq('a');
        long long10 = frequency0.getCumFreq((long) ' ');
        long long11 = frequency0.getSumFreq();
        frequency0.addValue((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        double double9 = frequency0.getCumPct('4');
        long long11 = frequency0.getCumFreq((int) (byte) 1);
        frequency0.clear();
        frequency0.addValue((java.lang.Integer) 10);
        long long16 = frequency0.getCumFreq((int) (short) 10);
        frequency0.clear();
        long long18 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (byte) 10);
        double double11 = frequency0.getPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct('#');
        long long16 = frequency12.getCumFreq((long) (byte) 100);
        long long18 = frequency12.getCount((int) ' ');
        double double20 = frequency12.getPct((long) 1);
        double double22 = frequency12.getCumPct((int) (byte) 1);
        frequency12.addValue(10);
        long long26 = frequency12.getCount(2L);
        double double28 = frequency12.getCumPct('a');
        double double29 = frequency0.getCumPct((java.lang.Object) 'a');
        double double31 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        long long13 = frequency9.getCount('#');
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        frequency9.addValue((java.lang.Object) "");
        frequency9.clear();
        frequency9.addValue(0L);
        double double20 = frequency0.getCumPct((java.lang.Object) frequency9);
        double double22 = frequency9.getPct((java.lang.Object) '#');
        double double24 = frequency9.getPct(' ');
        frequency9.addValue((java.lang.Integer) 0);
        double double28 = frequency9.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double26 = frequency0.getPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getCumPct('#');
        long long31 = frequency27.getCumFreq((long) (byte) 100);
        frequency27.addValue((java.lang.Integer) (-1));
        double double35 = frequency27.getPct('4');
        double double37 = frequency27.getPct((long) 100);
        double double39 = frequency27.getCumPct((long) '4');
        double double41 = frequency27.getCumPct('#');
        long long43 = frequency27.getCumFreq('#');
        long long45 = frequency27.getCumFreq((long) 1);
        double double46 = frequency0.getPct((java.lang.Object) frequency27);
        double double48 = frequency27.getCumPct((long) (short) 1);
        long long50 = frequency27.getCount(1);
        // The following exception was thrown during execution in test generation
        try {
            frequency27.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue('#');
        double double6 = frequency0.getPct(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('4');
        double double8 = frequency0.getPct(' ');
        java.lang.String str9 = frequency0.toString();
        double double11 = frequency0.getPct((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double26 = frequency0.getPct((int) (byte) 1);
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.clear();
        long long31 = frequency0.getCumFreq((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        long long12 = frequency0.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct('#');
        long long17 = frequency13.getCumFreq((long) (byte) 100);
        long long19 = frequency13.getCount((int) ' ');
        double double21 = frequency13.getPct((long) 1);
        double double23 = frequency13.getCumPct((int) (byte) 1);
        long long24 = frequency0.getCount((java.lang.Object) (byte) 1);
        double double26 = frequency0.getCumPct('a');
        frequency0.addValue(0L);
        frequency0.addValue((int) (short) -1);
        long long32 = frequency0.getCount(' ');
        long long34 = frequency0.getCount((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        java.lang.String str5 = frequency0.toString();
        java.lang.String str6 = frequency0.toString();
        long long8 = frequency0.getCount('a');
        long long10 = frequency0.getCumFreq((long) 100);
        double double12 = frequency0.getPct('a');
        double double14 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((long) 1);
        double double6 = frequency0.getCumPct((long) 0);
        frequency0.addValue((long) '4');
        long long10 = frequency0.getCount('4');
        frequency0.addValue(0L);
        java.lang.String str13 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n52\t1\t50%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n52\t1\t50%\t100%\n");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        long long15 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        double double20 = frequency16.getPct((long) 1);
        double double22 = frequency16.getCumPct((long) 0);
        frequency16.addValue((long) '4');
        long long26 = frequency16.getCount('4');
        double double27 = frequency0.getCumPct((java.lang.Object) frequency16);
        double double29 = frequency16.getCumPct((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((long) '#');
        double double23 = frequency0.getCumPct(' ');
        long long24 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        long long27 = frequency25.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        long long30 = frequency28.getCount((int) '#');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getPct((long) '4');
        double double35 = frequency31.getPct((long) 1);
        double double36 = frequency28.getCumPct((java.lang.Object) 1);
        java.util.Iterator iterator37 = frequency28.valuesIterator();
        long long39 = frequency28.getCumFreq('a');
        long long40 = frequency28.getSumFreq();
        frequency28.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        java.util.Iterator iterator43 = frequency28.valuesIterator();
        long long44 = frequency25.getCount((java.lang.Object) iterator43);
        long long46 = frequency25.getCount(' ');
        long long47 = frequency0.getCumFreq((java.lang.Object) frequency25);
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        long long50 = frequency48.getCumFreq((-1));
        double double52 = frequency48.getCumPct((long) (byte) 100);
        long long54 = frequency48.getCount((long) '#');
        long long55 = frequency0.getCumFreq((java.lang.Object) long54);
        double double57 = frequency0.getCumPct((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCumFreq(0);
        frequency0.clear();
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        double double28 = frequency26.getCumPct('#');
        double double30 = frequency26.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        long long33 = frequency31.getCumFreq((java.lang.Object) 100L);
        double double35 = frequency31.getCumPct(0);
        double double37 = frequency31.getCumPct('a');
        java.lang.String str38 = frequency31.toString();
        long long40 = frequency31.getCount((int) (byte) 10);
        double double41 = frequency26.getCumPct((java.lang.Object) frequency31);
        double double42 = frequency0.getCumPct((java.lang.Object) frequency26);
        long long44 = frequency26.getCount((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        frequency0.addValue((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        double double14 = frequency0.getCumPct('#');
        java.lang.String str15 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((java.lang.Integer) 10);
        double double15 = frequency0.getPct(' ');
        long long17 = frequency0.getCumFreq(2L);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        long long20 = frequency18.getCount('4');
        double double22 = frequency18.getPct((long) 100);
        long long23 = frequency0.getCount((java.lang.Object) double22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        java.util.Iterator iterator30 = frequency0.valuesIterator();
        long long32 = frequency0.getCount((int) (short) 0);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        double double35 = frequency33.getCumPct((java.lang.Object) (byte) 10);
        frequency33.clear();
        long long38 = frequency33.getCumFreq('a');
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        long long43 = frequency39.getCumFreq((long) (byte) 100);
        long long45 = frequency39.getCount((long) '4');
        long long47 = frequency39.getCumFreq((long) 100);
        double double49 = frequency39.getPct((long) ' ');
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        long long54 = frequency50.getCumFreq((long) (byte) 100);
        long long56 = frequency50.getCount((int) ' ');
        double double58 = frequency50.getPct((long) 1);
        double double60 = frequency50.getCumPct((int) (byte) 1);
        double double61 = frequency39.getPct((java.lang.Object) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency();
        long long64 = frequency62.getCumFreq((java.lang.Object) 100L);
        double double66 = frequency62.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        double double69 = frequency67.getPct((long) '4');
        frequency67.addValue(0);
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency();
        long long74 = frequency72.getCumFreq((java.lang.Object) 100L);
        double double76 = frequency72.getCumPct(0);
        double double78 = frequency72.getCumPct('a');
        java.lang.String str79 = frequency72.toString();
        long long80 = frequency67.getCount((java.lang.Object) frequency72);
        double double81 = frequency62.getPct((java.lang.Object) frequency67);
        org.apache.commons.math.stat.Frequency frequency82 = new org.apache.commons.math.stat.Frequency();
        double double84 = frequency82.getCumPct('#');
        double double86 = frequency82.getPct((-1));
        frequency82.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long89 = frequency62.getCumFreq((java.lang.Object) frequency82);
        long long90 = frequency39.getCount((java.lang.Object) frequency62);
        double double91 = frequency33.getCumPct((java.lang.Object) long90);
        frequency0.addValue((java.lang.Object) long90);
        double double94 = frequency0.getPct((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str79, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getCumPct(10);
        double double6 = frequency0.getPct((int) 'a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCumFreq((long) 0);
        java.util.Iterator iterator10 = frequency0.valuesIterator();
        long long12 = frequency0.getCumFreq('4');
        long long14 = frequency0.getCumFreq((long) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        frequency0.addValue((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getCumPct(0);
        double double13 = frequency7.getCumPct('a');
        java.lang.String str14 = frequency7.toString();
        double double16 = frequency7.getCumPct((long) 10);
        double double18 = frequency7.getPct((int) ' ');
        java.util.Iterator iterator19 = frequency7.valuesIterator();
        long long21 = frequency7.getCount('4');
        double double22 = frequency0.getPct((java.lang.Object) '4');
        double double24 = frequency0.getPct(1L);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        frequency0.addValue(0L);
        frequency0.addValue((long) (-1));
        double double18 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        long long21 = frequency19.getCount((long) (byte) 10);
        frequency19.addValue((long) (byte) 1);
        long long24 = frequency0.getCumFreq((java.lang.Object) frequency19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getPct((int) (byte) 0);
        java.lang.String str12 = frequency7.toString();
        frequency7.addValue((java.lang.Integer) 1);
        long long15 = frequency0.getCount((java.lang.Object) frequency7);
        long long16 = frequency0.getSumFreq();
        long long18 = frequency0.getCount('4');
        long long20 = frequency0.getCount((int) '#');
        double double22 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCumFreq((long) 'a');
        frequency0.addValue('a');
        long long18 = frequency0.getCount((int) (short) 100);
        java.util.Iterator iterator19 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        long long24 = frequency20.getCumFreq((long) (byte) 100);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) (-1));
        long long30 = frequency20.getCount((int) (byte) -1);
        frequency20.addValue((int) (short) 0);
        double double34 = frequency20.getCumPct((int) (byte) 100);
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency20);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getCumPct('#');
        long long40 = frequency36.getCumFreq((long) (byte) 100);
        long long42 = frequency36.getCount(' ');
        double double44 = frequency36.getCumPct((long) 1);
        long long46 = frequency36.getCount((long) (short) -1);
        long long48 = frequency36.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCumFreq((java.lang.Object) 100L);
        double double53 = frequency49.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        double double56 = frequency54.getCumPct('#');
        double double58 = frequency54.getPct((-1));
        java.util.Iterator iterator59 = frequency54.valuesIterator();
        double double60 = frequency49.getPct((java.lang.Object) frequency54);
        frequency49.addValue((-1L));
        double double63 = frequency36.getCumPct((java.lang.Object) (-1L));
        frequency36.addValue('4');
        double double67 = frequency36.getPct((int) (byte) 10);
        long long69 = frequency36.getCount((int) (byte) 10);
        long long70 = frequency0.getCumFreq((java.lang.Object) frequency36);
        frequency36.addValue('#');
        double double74 = frequency36.getCumPct((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        double double11 = frequency7.getPct((int) (byte) 0);
        java.lang.String str12 = frequency7.toString();
        frequency7.addValue((java.lang.Integer) 1);
        long long15 = frequency0.getCount((java.lang.Object) frequency7);
        long long17 = frequency7.getCumFreq((-1));
        frequency7.clear();
        double double20 = frequency7.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long15 = frequency0.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct('#');
        long long20 = frequency16.getCumFreq((long) (byte) 100);
        long long22 = frequency16.getCount((int) ' ');
        double double24 = frequency16.getPct((long) 1);
        double double25 = frequency0.getCumPct((java.lang.Object) double24);
        java.util.Iterator iterator26 = frequency0.valuesIterator();
        double double28 = frequency0.getPct((int) (short) 1);
        double double30 = frequency0.getPct('#');
        frequency0.addValue(0);
        frequency0.addValue((int) (byte) 100);
        long long36 = frequency0.getCount('#');
        long long38 = frequency0.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2L + "'", long38 == 2L);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        long long21 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('a');
        long long25 = frequency0.getCumFreq((long) ' ');
        java.lang.String str26 = frequency0.toString();
        frequency0.addValue('4');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        long long31 = frequency29.getCumFreq((java.lang.Object) 100L);
        long long33 = frequency29.getCount('#');
        double double35 = frequency29.getPct('#');
        java.util.Iterator iterator36 = frequency29.valuesIterator();
        long long37 = frequency0.getCumFreq((java.lang.Object) frequency29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        long long14 = frequency0.getCumFreq((long) 'a');
        frequency0.addValue('a');
        long long18 = frequency0.getCount((int) (short) 100);
        java.util.Iterator iterator19 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        long long24 = frequency20.getCumFreq((long) (byte) 100);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) (-1));
        long long30 = frequency20.getCount((int) (byte) -1);
        frequency20.addValue((int) (short) 0);
        double double34 = frequency20.getCumPct((int) (byte) 100);
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency20);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getCumPct('#');
        long long40 = frequency36.getCumFreq((long) (byte) 100);
        long long42 = frequency36.getCount(' ');
        double double44 = frequency36.getCumPct((long) 1);
        long long46 = frequency36.getCount((long) (short) -1);
        long long48 = frequency36.getCount((int) 'a');
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        long long51 = frequency49.getCumFreq((java.lang.Object) 100L);
        double double53 = frequency49.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        double double56 = frequency54.getCumPct('#');
        double double58 = frequency54.getPct((-1));
        java.util.Iterator iterator59 = frequency54.valuesIterator();
        double double60 = frequency49.getPct((java.lang.Object) frequency54);
        frequency49.addValue((-1L));
        double double63 = frequency36.getCumPct((java.lang.Object) (-1L));
        frequency36.addValue('4');
        double double67 = frequency36.getPct((int) (byte) 10);
        long long69 = frequency36.getCount((int) (byte) 10);
        long long70 = frequency0.getCumFreq((java.lang.Object) frequency36);
        frequency36.addValue('#');
        double double74 = frequency36.getCumPct((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        long long13 = frequency9.getCount('#');
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        frequency9.addValue((java.lang.Object) "");
        frequency9.clear();
        frequency9.addValue(0L);
        double double20 = frequency0.getCumPct((java.lang.Object) frequency9);
        double double22 = frequency9.getPct((java.lang.Object) '#');
        long long24 = frequency9.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCumFreq(100L);
        long long12 = frequency0.getCount((-1));
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double28 = frequency18.getCumPct(0L);
        double double29 = frequency0.getCumPct((java.lang.Object) 0L);
        long long30 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct('#');
        long long35 = frequency31.getCumFreq((long) (byte) 100);
        long long37 = frequency31.getCount((int) ' ');
        double double39 = frequency31.getPct((long) 1);
        long long41 = frequency31.getCumFreq(100L);
        long long43 = frequency31.getCount((-1));
        double double45 = frequency31.getCumPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n");
        double double47 = frequency31.getCumPct((long) (byte) 10);
        long long48 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency10);
        frequency10.addValue('4');
        long long23 = frequency10.getCumFreq('a');
        long long25 = frequency10.getCount((int) 'a');
        long long27 = frequency10.getCount(' ');
        double double29 = frequency10.getPct((long) 1);
        double double31 = frequency10.getCumPct(100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        double double6 = frequency0.getPct('#');
        frequency0.addValue((java.lang.Object) 100.0f);
        long long10 = frequency0.getCumFreq((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        java.lang.String str14 = frequency5.toString();
        long long16 = frequency5.getCount('#');
        long long18 = frequency5.getCumFreq('a');
        double double20 = frequency5.getCumPct('#');
        double double22 = frequency5.getCumPct('a');
        double double24 = frequency5.getPct('a');
        long long26 = frequency5.getCount(0);
        double double28 = frequency5.getPct(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getPct((int) '#');
        java.lang.String str18 = frequency0.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t50%\t50%\n100\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        double double10 = frequency0.getPct('4');
        long long11 = frequency0.getSumFreq();
        frequency0.clear();
        frequency0.addValue((int) (short) 10);
        frequency0.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long15 = frequency0.getCount((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct('#');
        long long20 = frequency16.getCumFreq((long) (byte) 100);
        long long22 = frequency16.getCount((int) ' ');
        double double24 = frequency16.getPct((long) 1);
        double double25 = frequency0.getCumPct((java.lang.Object) double24);
        java.util.Iterator iterator26 = frequency0.valuesIterator();
        double double28 = frequency0.getPct((long) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        long long33 = frequency29.getCumFreq((long) (byte) 100);
        long long35 = frequency29.getCount((long) '4');
        long long37 = frequency29.getCumFreq((long) 100);
        double double39 = frequency29.getPct((long) ' ');
        long long41 = frequency29.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency();
        long long44 = frequency42.getCumFreq((java.lang.Object) 100L);
        double double46 = frequency42.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency();
        double double49 = frequency47.getCumPct('#');
        double double51 = frequency47.getPct((-1));
        java.util.Iterator iterator52 = frequency47.valuesIterator();
        double double53 = frequency42.getPct((java.lang.Object) frequency47);
        long long55 = frequency47.getCumFreq('a');
        double double56 = frequency29.getPct((java.lang.Object) 'a');
        long long58 = frequency29.getCumFreq((int) (byte) 0);
        frequency29.addValue('a');
        long long61 = frequency0.getCount((java.lang.Object) 'a');
        double double63 = frequency0.getCumPct((long) 100);
        frequency0.addValue((int) (short) 0);
        long long67 = frequency0.getCumFreq((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 2L + "'", long67 == 2L);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        long long14 = frequency0.getCumFreq(' ');
        frequency0.addValue((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        long long17 = frequency11.getCount(' ');
        double double19 = frequency11.getCumPct((long) 1);
        long long20 = frequency0.getCumFreq((java.lang.Object) 1);
        long long22 = frequency0.getCumFreq((long) (byte) 100);
        java.lang.String str23 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        long long28 = frequency24.getCumFreq((long) (byte) 100);
        frequency24.clear();
        frequency24.addValue((int) ' ');
        frequency24.addValue(100);
        frequency24.addValue((java.lang.Integer) 100);
        double double37 = frequency24.getPct((long) (short) 100);
        long long38 = frequency0.getCount((java.lang.Object) frequency24);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.6666666666666666d + "'", double37 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount(' ');
        double double8 = frequency0.getCumPct((long) 1);
        long long10 = frequency0.getCumFreq('4');
        long long12 = frequency0.getCumFreq((long) (byte) 100);
        long long14 = frequency0.getCount((long) (short) 1);
        double double16 = frequency0.getCumPct((long) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        long long8 = frequency0.getCount((-1L));
        double double10 = frequency0.getPct((long) (short) -1);
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCount((long) (byte) 10);
        java.util.Iterator iterator16 = frequency13.valuesIterator();
        double double18 = frequency13.getPct('a');
        double double20 = frequency13.getPct('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator24 = frequency21.valuesIterator();
        double double25 = frequency13.getPct((java.lang.Object) frequency21);
        long long27 = frequency13.getCumFreq('a');
        double double29 = frequency13.getCumPct(10);
        long long31 = frequency13.getCount((int) (short) -1);
        double double32 = frequency0.getPct((java.lang.Object) (short) -1);
        frequency0.addValue(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.clear();
        frequency0.addValue((int) ' ');
        frequency0.addValue(100);
        double double11 = frequency0.getCumPct('4');
        double double13 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        long long5 = frequency0.getCumFreq('4');
        double double7 = frequency0.getPct((java.lang.Object) 0);
        double double9 = frequency0.getCumPct((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCumFreq('a');
        frequency0.addValue((long) (byte) 0);
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getCumPct('4');
        java.util.Iterator iterator15 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct('#');
        long long6 = frequency0.getCount((long) 0);
        long long8 = frequency0.getCount('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        long long7 = frequency0.getCount((long) (short) 0);
        frequency0.addValue('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n0\t1\t33%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        frequency0.addValue((long) ' ');
        long long8 = frequency0.getCount(' ');
        long long10 = frequency0.getCumFreq((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        double double14 = frequency0.getCumPct((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        long long6 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) 100);
        frequency0.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        java.util.Iterator iterator30 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct('#');
        frequency31.clear();
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency31);
        double double37 = frequency31.getCumPct('4');
        java.util.Iterator iterator38 = frequency31.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        long long41 = frequency39.getCumFreq((java.lang.Object) 100L);
        double double43 = frequency39.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        double double46 = frequency44.getCumPct('#');
        double double48 = frequency44.getPct((-1));
        java.util.Iterator iterator49 = frequency44.valuesIterator();
        double double50 = frequency39.getPct((java.lang.Object) frequency44);
        frequency39.addValue((-1L));
        long long54 = frequency39.getCount('a');
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        double double57 = frequency55.getPct((long) '4');
        double double59 = frequency55.getPct((long) 1);
        double double61 = frequency55.getCumPct((long) 0);
        frequency55.addValue((long) '4');
        long long65 = frequency55.getCount('4');
        double double66 = frequency39.getCumPct((java.lang.Object) frequency55);
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        long long69 = frequency67.getCumFreq((java.lang.Object) 100L);
        double double71 = frequency67.getCumPct(0);
        double double73 = frequency67.getCumPct('a');
        long long75 = frequency67.getCount(100);
        double double77 = frequency67.getCumPct(0);
        double double79 = frequency67.getPct('4');
        org.apache.commons.math.stat.Frequency frequency80 = new org.apache.commons.math.stat.Frequency();
        double double82 = frequency80.getPct((long) '4');
        double double84 = frequency80.getPct((java.lang.Object) 100L);
        long long86 = frequency80.getCount((long) (-1));
        long long88 = frequency80.getCount((long) (-1));
        long long89 = frequency67.getCumFreq((java.lang.Object) (-1));
        java.lang.String str90 = frequency67.toString();
        frequency67.addValue(1L);
        long long93 = frequency55.getCount((java.lang.Object) frequency67);
        double double95 = frequency55.getCumPct('#');
        frequency55.addValue((java.lang.Integer) 0);
        double double98 = frequency31.getCumPct((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str90, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(100);
        double double10 = frequency0.getCumPct(0);
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getCumPct('a');
        long long16 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        frequency0.addValue(0L);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct('#');
        long long11 = frequency7.getCumFreq((long) (byte) 100);
        frequency7.clear();
        long long14 = frequency7.getCount((int) (short) 10);
        long long16 = frequency7.getCount(10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.math.stat.Frequency cannot be cast to class java.lang.Comparable (org.apache.commons.math.stat.Frequency is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        double double8 = frequency0.getPct((long) (short) 10);
        double double10 = frequency0.getCumPct('#');
        long long12 = frequency0.getCumFreq(' ');
        double double14 = frequency0.getCumPct('a');
        double double16 = frequency0.getPct((long) (short) -1);
        double double18 = frequency0.getPct((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue((int) (byte) -1);
        long long9 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator13 = frequency10.valuesIterator();
        long long14 = frequency0.getCount((java.lang.Object) frequency10);
        double double16 = frequency0.getCumPct((long) 1);
        double double18 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct('#');
        long long23 = frequency19.getCumFreq((long) (byte) 100);
        long long25 = frequency19.getCount((int) ' ');
        double double27 = frequency19.getPct((long) 1);
        long long29 = frequency19.getCumFreq((long) (byte) 10);
        double double30 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        double double7 = frequency0.getPct((long) (short) 10);
        double double9 = frequency0.getPct((long) (byte) 10);
        frequency0.addValue((int) (byte) 0);
        double double13 = frequency0.getPct((int) '#');
        double double15 = frequency0.getPct(0L);
        long long17 = frequency0.getCumFreq('a');
        long long19 = frequency0.getCount(100);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        double double24 = frequency20.getCumPct(0);
        double double26 = frequency20.getCumPct('a');
        java.lang.String str27 = frequency20.toString();
        long long29 = frequency20.getCount((int) (byte) 10);
        double double31 = frequency20.getPct((int) (short) 100);
        java.util.Iterator iterator32 = frequency20.valuesIterator();
        frequency20.addValue(0L);
        double double36 = frequency20.getPct((long) 0);
        double double37 = frequency0.getPct((java.lang.Object) frequency20);
        long long39 = frequency20.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        long long4 = frequency0.getCumFreq((long) (short) 10);
        double double6 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        frequency0.addValue((int) (short) -1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        long long9 = frequency7.getCumFreq((java.lang.Object) 100L);
        long long11 = frequency7.getCount('#');
        long long13 = frequency7.getCount('4');
        frequency7.addValue((java.lang.Integer) 100);
        long long16 = frequency7.getSumFreq();
        double double17 = frequency0.getCumPct((java.lang.Object) frequency7);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        long long22 = frequency18.getCumFreq((long) (byte) 100);
        long long24 = frequency18.getCount(' ');
        double double26 = frequency18.getCumPct((long) 1);
        double double28 = frequency18.getPct(0L);
        frequency18.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n52\t1\t50%\t100%\n");
        long long32 = frequency18.getCumFreq((long) 'a');
        long long33 = frequency7.getCumFreq((java.lang.Object) frequency18);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        long long36 = frequency34.getCount((long) (byte) 10);
        double double38 = frequency34.getPct((java.lang.Object) 10);
        long long40 = frequency34.getCount(10L);
        frequency34.addValue((int) (byte) -1);
        long long43 = frequency34.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        double double46 = frequency44.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator47 = frequency44.valuesIterator();
        long long48 = frequency34.getCount((java.lang.Object) frequency44);
        java.lang.String str49 = frequency44.toString();
        long long51 = frequency44.getCumFreq((long) (byte) -1);
        double double52 = frequency7.getCumPct((java.lang.Object) long51);
        long long54 = frequency7.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (byte) 10);
        double double11 = frequency0.getPct((int) (short) 100);
        java.util.Iterator iterator12 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        double double16 = frequency0.getPct((long) 0);
        long long18 = frequency0.getCount((int) (short) 1);
        long long20 = frequency0.getCumFreq((int) 'a');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long30 = frequency21.getCount((int) (byte) 10);
        long long32 = frequency21.getCount('4');
        frequency21.addValue((java.lang.Integer) 10);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct('#');
        long long39 = frequency35.getCumFreq((long) (byte) 100);
        long long41 = frequency35.getCount(' ');
        double double43 = frequency35.getCumPct((long) 1);
        long long45 = frequency35.getCount((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        double double48 = frequency46.getCumPct('#');
        long long50 = frequency46.getCumFreq((long) (byte) 100);
        long long52 = frequency46.getCount(' ');
        double double54 = frequency46.getCumPct((long) 1);
        long long55 = frequency35.getCumFreq((java.lang.Object) 1);
        long long57 = frequency35.getCumFreq((long) (byte) 100);
        frequency35.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t100%\t100%\n");
        double double60 = frequency21.getCumPct((java.lang.Object) frequency35);
        double double62 = frequency21.getCumPct((long) (short) 10);
        double double63 = frequency0.getCumPct((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        long long11 = frequency9.getCumFreq((java.lang.Object) 100L);
        long long13 = frequency9.getCount('#');
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        frequency9.addValue((java.lang.Object) "");
        frequency9.clear();
        frequency9.addValue(0L);
        double double20 = frequency0.getCumPct((java.lang.Object) frequency9);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct('#');
        double double25 = frequency21.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        long long28 = frequency26.getCumFreq((java.lang.Object) 100L);
        double double30 = frequency26.getCumPct(0);
        double double32 = frequency26.getCumPct('a');
        java.lang.String str33 = frequency26.toString();
        frequency26.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator36 = frequency26.valuesIterator();
        long long37 = frequency21.getCount((java.lang.Object) frequency26);
        double double38 = frequency0.getPct((java.lang.Object) frequency21);
        double double40 = frequency21.getPct((long) 100);
        double double42 = frequency21.getPct((long) '4');
        long long44 = frequency21.getCumFreq((long) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        double double6 = frequency0.getCumPct((long) '#');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long10 = frequency0.getCumFreq((int) (short) 1);
        double double12 = frequency0.getPct((int) (short) 0);
        double double14 = frequency0.getPct((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        java.lang.String str7 = frequency0.toString();
        java.lang.String str8 = frequency0.toString();
        frequency0.addValue((java.lang.Integer) (-1));
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getPct((int) '#');
        long long15 = frequency0.getCount((int) (short) 1);
        long long17 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        double double9 = frequency0.getCumPct('4');
        long long11 = frequency0.getCumFreq((int) (byte) 1);
        frequency0.clear();
        long long14 = frequency0.getCumFreq(10L);
        long long16 = frequency0.getCumFreq((int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        double double8 = frequency0.getPct((long) (short) 10);
        long long10 = frequency0.getCumFreq(1);
        long long12 = frequency0.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((long) '4');
        frequency16.addValue(0);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCumFreq((java.lang.Object) 100L);
        double double25 = frequency21.getCumPct(0);
        double double27 = frequency21.getCumPct('a');
        java.lang.String str28 = frequency21.toString();
        long long29 = frequency16.getCount((java.lang.Object) frequency21);
        double double30 = frequency11.getPct((java.lang.Object) frequency16);
        frequency11.addValue((long) '#');
        double double33 = frequency0.getPct((java.lang.Object) frequency11);
        long long35 = frequency11.getCount((long) (byte) 100);
        frequency11.addValue(100L);
        long long39 = frequency11.getCount(5L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        long long10 = frequency0.getCount('4');
        double double12 = frequency0.getPct('4');
        double double14 = frequency0.getPct((int) (byte) 0);
        long long16 = frequency0.getCount((int) '4');
        double double18 = frequency0.getCumPct((int) ' ');
        long long20 = frequency0.getCount(100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        long long23 = frequency21.getCount((int) '#');
        long long25 = frequency21.getCumFreq((long) '#');
        double double26 = frequency0.getCumPct((java.lang.Object) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('4');
        frequency0.clear();
        long long9 = frequency0.getCount(' ');
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct('#');
        long long16 = frequency12.getCumFreq((long) (byte) 100);
        double double18 = frequency12.getPct((java.lang.Object) 100.0f);
        frequency12.addValue('a');
        long long22 = frequency12.getCumFreq((int) 'a');
        long long23 = frequency0.getCount((java.lang.Object) 'a');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        long long26 = frequency24.getCumFreq((-1));
        double double28 = frequency24.getCumPct((long) (byte) 100);
        frequency24.addValue('4');
        frequency24.clear();
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long34 = frequency24.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        long long37 = frequency35.getCumFreq((java.lang.Object) 100L);
        long long39 = frequency35.getCount('#');
        java.util.Iterator iterator40 = frequency35.valuesIterator();
        double double42 = frequency35.getPct((long) (short) 10);
        double double44 = frequency35.getPct((long) (byte) 10);
        frequency35.addValue((int) (byte) 0);
        double double47 = frequency24.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        long long50 = frequency48.getCumFreq((java.lang.Object) 100L);
        long long52 = frequency48.getCount('#');
        java.util.Iterator iterator53 = frequency48.valuesIterator();
        double double55 = frequency48.getPct((long) (short) 10);
        double double57 = frequency48.getPct((long) (byte) 10);
        frequency48.addValue((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency();
        long long62 = frequency60.getCount((long) (byte) 10);
        double double64 = frequency60.getPct((java.lang.Object) 10);
        long long65 = frequency48.getCumFreq((java.lang.Object) frequency60);
        long long66 = frequency35.getCount((java.lang.Object) frequency48);
        long long67 = frequency0.getCount((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency68 = new org.apache.commons.math.stat.Frequency();
        long long70 = frequency68.getCount((long) (byte) 10);
        double double72 = frequency68.getPct((java.lang.Object) 10);
        java.util.Iterator iterator73 = frequency68.valuesIterator();
        long long75 = frequency68.getCount('4');
        java.lang.String str76 = frequency68.toString();
        frequency68.addValue('#');
        long long80 = frequency68.getCount((long) 'a');
        long long81 = frequency35.getCumFreq((java.lang.Object) frequency68);
        double double83 = frequency68.getPct('a');
        double double85 = frequency68.getPct(' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str76, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Object) (byte) 10);
        frequency11.clear();
        java.lang.String str15 = frequency11.toString();
        long long16 = frequency0.getCumFreq((java.lang.Object) frequency11);
        frequency11.addValue((-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount((long) (-1));
        long long10 = frequency0.getCumFreq((int) ' ');
        double double12 = frequency0.getPct((-1));
        double double14 = frequency0.getCumPct((long) (byte) -1);
        frequency0.addValue(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        frequency0.addValue((int) (short) 100);
        long long16 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Object) (byte) 10);
        frequency17.clear();
        java.lang.String str21 = frequency17.toString();
        java.lang.Object obj22 = null;
        double double23 = frequency17.getCumPct(obj22);
        long long24 = frequency0.getCumFreq((java.lang.Object) double23);
        long long26 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct('#');
        double double24 = frequency20.getPct((-1));
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long27 = frequency0.getCumFreq((java.lang.Object) frequency20);
        double double29 = frequency20.getPct('4');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        double double36 = frequency30.getCumPct('a');
        java.lang.String str37 = frequency30.toString();
        long long39 = frequency30.getCount((int) (byte) 10);
        double double41 = frequency30.getPct((int) (short) 100);
        java.util.Iterator iterator42 = frequency30.valuesIterator();
        long long43 = frequency20.getCount((java.lang.Object) iterator42);
        double double45 = frequency20.getCumPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long15 = frequency0.getCount((int) (short) 100);
        java.util.Iterator iterator16 = frequency0.valuesIterator();
        long long18 = frequency0.getCount((long) '#');
        long long20 = frequency0.getCumFreq(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        double double4 = frequency0.getPct((java.lang.Object) 10);
        long long6 = frequency0.getCount(10L);
        frequency0.addValue('a');
        double double10 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct('#');
        long long15 = frequency11.getCumFreq((long) (byte) 100);
        frequency11.addValue((java.lang.Integer) (-1));
        double double19 = frequency11.getPct('4');
        double double21 = frequency11.getPct((long) 100);
        double double23 = frequency11.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct('#');
        long long28 = frequency24.getCumFreq((long) (byte) 100);
        long long30 = frequency24.getCount(' ');
        double double32 = frequency24.getPct(0);
        long long33 = frequency11.getCount((java.lang.Object) 0);
        double double34 = frequency0.getPct((java.lang.Object) frequency11);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        long long50 = frequency35.getCount((int) (short) 100);
        java.util.Iterator iterator51 = frequency35.valuesIterator();
        double double53 = frequency35.getPct('4');
        double double54 = frequency0.getCumPct((java.lang.Object) frequency35);
        frequency0.addValue('#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount(' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double12 = frequency0.getCumPct((int) '4');
        double double14 = frequency0.getPct((long) (short) 1);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct('#');
        double double19 = frequency15.getPct((-1));
        frequency15.addValue((long) ' ');
        frequency15.clear();
        long long23 = frequency0.getCumFreq((java.lang.Object) frequency15);
        long long25 = frequency0.getCount('#');
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        double double28 = frequency26.getCumPct((java.lang.Object) (byte) 10);
        frequency26.clear();
        java.lang.String str30 = frequency26.toString();
        long long32 = frequency26.getCount((long) '#');
        double double34 = frequency26.getPct((int) '#');
        long long35 = frequency0.getCount((java.lang.Object) frequency26);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        long long4 = frequency0.getCount('#');
        java.util.Iterator iterator5 = frequency0.valuesIterator();
        long long7 = frequency0.getCount((int) (short) 100);
        double double9 = frequency0.getPct((long) (short) 1);
        double double11 = frequency0.getPct((java.lang.Object) true);
        double double13 = frequency0.getCumPct((long) (short) 10);
        java.util.Iterator iterator14 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        double double9 = frequency0.getCumPct((int) (byte) -1);
        double double11 = frequency0.getCumPct('a');
        long long13 = frequency0.getCumFreq((long) (byte) -1);
        long long15 = frequency0.getCumFreq(' ');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct('#');
        long long20 = frequency16.getCumFreq((long) (byte) 100);
        frequency16.addValue((java.lang.Integer) (-1));
        frequency16.addValue((java.lang.Integer) (-1));
        double double26 = frequency16.getPct((int) '4');
        long long28 = frequency16.getCumFreq(0L);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct('#');
        double double33 = frequency29.getPct((-1));
        frequency29.addValue((long) ' ');
        long long37 = frequency29.getCumFreq('a');
        long long39 = frequency29.getCount((int) (byte) 10);
        double double40 = frequency16.getCumPct((java.lang.Object) long39);
        java.util.Iterator iterator41 = frequency16.valuesIterator();
        double double42 = frequency0.getPct((java.lang.Object) frequency16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getPct((int) (byte) 0);
        long long6 = frequency0.getCumFreq(10);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct('#');
        long long11 = frequency7.getCumFreq((long) (byte) 100);
        long long13 = frequency7.getCount((long) '4');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        long long16 = frequency14.getCumFreq((java.lang.Object) 100L);
        double double18 = frequency14.getCumPct(0);
        java.lang.String str19 = frequency14.toString();
        double double20 = frequency7.getPct((java.lang.Object) frequency14);
        java.util.Iterator iterator21 = frequency7.valuesIterator();
        long long22 = frequency0.getCount((java.lang.Object) iterator21);
        long long24 = frequency0.getCumFreq((long) 10);
        frequency0.addValue((long) (byte) 1);
        double double28 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        double double8 = frequency0.getPct('#');
        java.lang.String str9 = frequency0.toString();
        double double11 = frequency0.getPct((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = frequency0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        long long5 = frequency0.getCumFreq('a');
        frequency0.addValue('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        double double14 = frequency0.getCumPct(' ');
        long long16 = frequency0.getCumFreq((long) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        double double49 = frequency30.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        double double54 = frequency50.getPct((-1));
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency30.getCumFreq((java.lang.Object) frequency50);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        long long62 = frequency58.getCumFreq((long) (byte) 100);
        double double64 = frequency58.getPct(' ');
        double double65 = frequency50.getPct((java.lang.Object) double64);
        double double66 = frequency0.getCumPct((java.lang.Object) frequency50);
        double double68 = frequency0.getCumPct(100L);
        long long70 = frequency0.getCumFreq('#');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n100\t1\t33%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        java.util.Iterator iterator30 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct('#');
        frequency31.clear();
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency31);
        double double37 = frequency31.getCumPct('4');
        double double39 = frequency31.getCumPct('a');
        long long40 = frequency31.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCumFreq((-1));
        frequency41.addValue((int) (short) -1);
        frequency41.addValue((long) 10);
        java.util.Iterator iterator48 = frequency41.valuesIterator();
        long long49 = frequency31.getCount((java.lang.Object) iterator48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long14 = frequency5.getCount((int) (byte) 10);
        double double15 = frequency0.getCumPct((java.lang.Object) frequency5);
        frequency5.clear();
        double double18 = frequency5.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        double double4 = frequency0.getPct((-1));
        long long6 = frequency0.getCount('a');
        frequency0.addValue((long) (short) 0);
        double double10 = frequency0.getPct((long) (short) 0);
        long long12 = frequency0.getCumFreq((int) (byte) 10);
        java.lang.String str13 = frequency0.toString();
        double double15 = frequency0.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        long long7 = frequency5.getCumFreq((java.lang.Object) 100L);
        double double9 = frequency5.getCumPct(0);
        double double11 = frequency5.getCumPct('a');
        java.lang.String str12 = frequency5.toString();
        long long13 = frequency0.getCount((java.lang.Object) frequency5);
        long long15 = frequency0.getCumFreq(' ');
        long long17 = frequency0.getCount((long) (-1));
        long long19 = frequency0.getCumFreq((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        frequency0.clear();
        java.lang.String str4 = frequency0.toString();
        long long6 = frequency0.getCount((long) '#');
        double double8 = frequency0.getCumPct('a');
        double double10 = frequency0.getCumPct((long) 'a');
        java.lang.String str11 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('a');
        java.util.Iterator iterator7 = frequency0.valuesIterator();
        long long9 = frequency0.getCumFreq((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        frequency0.addValue((long) (-1));
        long long14 = frequency0.getCount('#');
        double double16 = frequency0.getCumPct((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        long long32 = frequency30.getCumFreq((java.lang.Object) 100L);
        double double34 = frequency30.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((long) '4');
        frequency35.addValue(0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency40.getCumFreq((java.lang.Object) 100L);
        double double44 = frequency40.getCumPct(0);
        double double46 = frequency40.getCumPct('a');
        java.lang.String str47 = frequency40.toString();
        long long48 = frequency35.getCount((java.lang.Object) frequency40);
        double double49 = frequency30.getPct((java.lang.Object) frequency35);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getCumPct('#');
        double double54 = frequency50.getPct((-1));
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency30.getCumFreq((java.lang.Object) frequency50);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        long long62 = frequency58.getCumFreq((long) (byte) 100);
        double double64 = frequency58.getPct(' ');
        double double65 = frequency50.getPct((java.lang.Object) double64);
        double double66 = frequency0.getCumPct((java.lang.Object) frequency50);
        double double68 = frequency0.getCumPct(100L);
        long long70 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency();
        long long73 = frequency71.getCumFreq((java.lang.Object) 100L);
        long long75 = frequency71.getCount('#');
        double double77 = frequency71.getPct('#');
        frequency71.addValue((int) (short) 10);
        double double81 = frequency71.getCumPct((int) ' ');
        java.util.Iterator iterator82 = frequency71.valuesIterator();
        long long83 = frequency0.getCumFreq((java.lang.Object) frequency71);
        long long85 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((int) ' ');
        double double8 = frequency0.getPct((long) 1);
        frequency0.addValue(0);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Object) (byte) 10);
        frequency11.clear();
        java.lang.String str15 = frequency11.toString();
        long long16 = frequency0.getCumFreq((java.lang.Object) frequency11);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        long long19 = frequency17.getCumFreq((java.lang.Object) 100L);
        double double21 = frequency17.getCumPct(0);
        double double23 = frequency17.getCumPct('a');
        long long25 = frequency17.getCount(100);
        double double27 = frequency17.getCumPct(0);
        double double29 = frequency17.getPct('4');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getPct((long) '4');
        double double34 = frequency30.getPct((java.lang.Object) 100L);
        long long36 = frequency30.getCount((long) (-1));
        long long38 = frequency30.getCount((long) (-1));
        long long39 = frequency17.getCumFreq((java.lang.Object) (-1));
        java.lang.String str40 = frequency17.toString();
        frequency17.addValue(1L);
        long long43 = frequency17.getSumFreq();
        java.util.Iterator iterator44 = frequency17.valuesIterator();
        long long46 = frequency17.getCount(0);
        long long48 = frequency17.getCount((-1));
        long long49 = frequency11.getCumFreq((java.lang.Object) long48);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((-1));
        double double4 = frequency0.getCumPct((long) (byte) 100);
        frequency0.addValue('4');
        double double8 = frequency0.getPct(' ');
        java.lang.String str9 = frequency0.toString();
        frequency0.addValue('a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        long long10 = frequency8.getCumFreq((java.lang.Object) 100L);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        long long13 = frequency11.getCumFreq((java.lang.Object) 100L);
        double double15 = frequency11.getCumPct(0);
        double double17 = frequency11.getCumPct('a');
        java.lang.String str18 = frequency11.toString();
        frequency11.addValue((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass21 = frequency11.getClass();
        double double22 = frequency8.getCumPct((java.lang.Object) frequency11);
        double double23 = frequency0.getPct((java.lang.Object) frequency11);
        frequency0.addValue((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Object) (byte) 10);
        long long4 = frequency0.getCumFreq((long) (short) 10);
        frequency0.addValue(0L);
        long long8 = frequency0.getCumFreq(1L);
        java.lang.String str9 = frequency0.toString();
        frequency0.clear();
        long long12 = frequency0.getCumFreq(' ');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((long) '4');
        double double17 = frequency13.getPct((java.lang.Object) 100L);
        long long19 = frequency13.getCount((long) (-1));
        long long21 = frequency13.getCount(' ');
        frequency13.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double25 = frequency13.getCumPct((int) '4');
        frequency13.clear();
        frequency13.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n");
        long long30 = frequency13.getCumFreq((int) (short) 0);
        frequency0.addValue((java.lang.Object) long30);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (byte) 10);
        frequency0.addValue((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getCumPct('#');
        long long10 = frequency6.getCumFreq((long) (byte) 100);
        frequency6.addValue((java.lang.Integer) (-1));
        double double14 = frequency6.getPct('4');
        double double16 = frequency6.getPct((long) 100);
        double double18 = frequency6.getCumPct((long) '4');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct('#');
        long long23 = frequency19.getCumFreq((long) (byte) 100);
        long long25 = frequency19.getCount(' ');
        double double27 = frequency19.getPct(0);
        long long28 = frequency6.getCount((java.lang.Object) 0);
        java.lang.String str29 = frequency6.toString();
        long long31 = frequency6.getCount((int) (byte) 1);
        double double32 = frequency0.getPct((java.lang.Object) (byte) 1);
        double double34 = frequency0.getCumPct((long) (byte) 10);
        frequency0.addValue((java.lang.Integer) 1);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getCumPct('#');
        long long41 = frequency37.getCumFreq((long) (byte) 100);
        double double43 = frequency37.getPct((java.lang.Object) Double.NaN);
        long long45 = frequency37.getCount((java.lang.Object) (byte) -1);
        long long47 = frequency37.getCumFreq((long) (byte) 1);
        double double48 = frequency0.getCumPct((java.lang.Object) frequency37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((long) '4');
        frequency5.addValue(0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        long long12 = frequency10.getCumFreq((java.lang.Object) 100L);
        double double14 = frequency10.getCumPct(0);
        double double16 = frequency10.getCumPct('a');
        java.lang.String str17 = frequency10.toString();
        long long18 = frequency5.getCount((java.lang.Object) frequency10);
        double double19 = frequency0.getPct((java.lang.Object) frequency5);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        long long22 = frequency20.getCumFreq((java.lang.Object) 100L);
        long long24 = frequency20.getCount('#');
        long long26 = frequency20.getCount('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double29 = frequency0.getCumPct((java.lang.Object) frequency20);
        java.util.Iterator iterator30 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct('#');
        frequency31.clear();
        long long35 = frequency0.getCumFreq((java.lang.Object) frequency31);
        double double37 = frequency31.getCumPct('4');
        double double39 = frequency31.getCumPct('a');
        long long40 = frequency31.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long43 = frequency41.getCount((long) (byte) 10);
        java.util.Iterator iterator44 = frequency41.valuesIterator();
        double double46 = frequency41.getPct('a');
        double double48 = frequency41.getPct('#');
        double double50 = frequency41.getCumPct('4');
        long long52 = frequency41.getCumFreq((int) (byte) 1);
        frequency41.clear();
        frequency41.addValue((java.lang.Integer) 10);
        long long57 = frequency41.getCumFreq((int) (short) 10);
        long long58 = frequency31.getCumFreq((java.lang.Object) (short) 10);
        long long60 = frequency31.getCount(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        long long6 = frequency0.getCount((long) '4');
        long long8 = frequency0.getCumFreq((long) 100);
        double double10 = frequency0.getPct((long) ' ');
        long long12 = frequency0.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        long long15 = frequency13.getCumFreq((java.lang.Object) 100L);
        double double17 = frequency13.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct('#');
        double double22 = frequency18.getPct((-1));
        java.util.Iterator iterator23 = frequency18.valuesIterator();
        double double24 = frequency13.getPct((java.lang.Object) frequency18);
        long long26 = frequency18.getCumFreq('a');
        double double27 = frequency0.getPct((java.lang.Object) 'a');
        frequency0.addValue(0);
        double double31 = frequency0.getPct((java.lang.Object) (short) 0);
        java.util.Iterator iterator32 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        frequency0.addValue((int) '4');
        long long14 = frequency0.getCount((long) 100);
        long long15 = frequency0.getSumFreq();
        long long17 = frequency0.getCount(10);
        frequency0.addValue((long) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        long long4 = frequency0.getCount((int) (short) 1);
        double double6 = frequency0.getCumPct((long) (short) 10);
        long long8 = frequency0.getCount((long) (byte) 0);
        long long10 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((long) '4');
        double double15 = frequency11.getPct((java.lang.Object) 100L);
        long long17 = frequency11.getCount((long) (-1));
        long long19 = frequency11.getCount(' ');
        double double21 = frequency11.getPct(100L);
        java.util.Iterator iterator22 = frequency11.valuesIterator();
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency11.getCumPct((int) 'a');
        long long27 = frequency11.getSumFreq();
        long long28 = frequency11.getSumFreq();
        long long29 = frequency0.getCount((java.lang.Object) frequency11);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 10);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct('a');
        double double7 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Object) (byte) 10);
        java.util.Iterator iterator11 = frequency8.valuesIterator();
        double double12 = frequency0.getPct((java.lang.Object) frequency8);
        java.util.Iterator iterator13 = frequency0.valuesIterator();
        java.lang.String str14 = frequency0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getCumPct('#');
        double double9 = frequency5.getPct((-1));
        java.util.Iterator iterator10 = frequency5.valuesIterator();
        double double11 = frequency0.getPct((java.lang.Object) frequency5);
        frequency0.addValue((-1L));
        frequency0.addValue((java.lang.Integer) 1);
        double double17 = frequency0.getPct((int) '#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getPct((long) '4');
        double double22 = frequency18.getPct((java.lang.Object) 100L);
        long long24 = frequency18.getCount((long) (-1));
        long long26 = frequency18.getCount((long) (-1));
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        long long29 = frequency27.getCumFreq((java.lang.Object) 100L);
        long long31 = frequency27.getCount('#');
        java.util.Iterator iterator32 = frequency27.valuesIterator();
        frequency27.addValue((java.lang.Object) "");
        frequency27.clear();
        frequency27.addValue(0L);
        double double38 = frequency18.getCumPct((java.lang.Object) frequency27);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct('#');
        double double43 = frequency39.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        long long46 = frequency44.getCumFreq((java.lang.Object) 100L);
        double double48 = frequency44.getCumPct(0);
        double double50 = frequency44.getCumPct('a');
        java.lang.String str51 = frequency44.toString();
        frequency44.addValue((java.lang.Object) 100.0d);
        java.util.Iterator iterator54 = frequency44.valuesIterator();
        long long55 = frequency39.getCount((java.lang.Object) frequency44);
        double double56 = frequency18.getPct((java.lang.Object) frequency39);
        double double57 = frequency0.getPct((java.lang.Object) frequency39);
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency();
        double double60 = frequency58.getCumPct('#');
        double double62 = frequency58.getPct((-1));
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency();
        long long65 = frequency63.getCumFreq((java.lang.Object) 100L);
        double double67 = frequency63.getCumPct(0);
        double double69 = frequency63.getCumPct('a');
        java.lang.String str70 = frequency63.toString();
        long long72 = frequency63.getCount((int) (byte) 10);
        double double73 = frequency58.getCumPct((java.lang.Object) frequency63);
        frequency58.addValue((int) (byte) -1);
        long long77 = frequency58.getCount('4');
        double double79 = frequency58.getPct((int) (short) 100);
        java.util.Iterator iterator80 = frequency58.valuesIterator();
        java.lang.String str81 = frequency58.toString();
        double double83 = frequency58.getCumPct('a');
        frequency39.addValue((java.lang.Object) double83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str70, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str81, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency();
        long long4 = frequency2.getCumFreq((java.lang.Object) 100L);
        long long6 = frequency2.getCount('#');
        java.util.Iterator iterator7 = frequency2.valuesIterator();
        frequency2.addValue((java.lang.Object) "");
        long long10 = frequency1.getCount((java.lang.Object) frequency2);
        long long12 = frequency1.getCumFreq(0);
        long long14 = frequency1.getCount('#');
        frequency1.clear();
        frequency1.addValue((long) (byte) 0);
        java.util.Iterator iterator18 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct('#');
        long long4 = frequency0.getCumFreq((long) (byte) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        double double8 = frequency0.getPct('4');
        double double10 = frequency0.getPct((long) 100);
        double double12 = frequency0.getCumPct((long) '4');
        frequency0.addValue((int) (short) 100);
        long long16 = frequency0.getCount('a');
        frequency0.addValue((int) (short) -1);
        double double20 = frequency0.getCumPct('#');
        double double22 = frequency0.getCumPct('a');
        double double24 = frequency0.getPct(1);
        double double26 = frequency0.getCumPct(100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCumFreq((java.lang.Object) 100L);
        double double4 = frequency0.getCumPct(0);
        double double6 = frequency0.getCumPct('a');
        java.lang.String str7 = frequency0.toString();
        long long9 = frequency0.getCount((int) (byte) 10);
        double double11 = frequency0.getPct((int) (short) 100);
        java.util.Iterator iterator12 = frequency0.valuesIterator();
        frequency0.addValue(0L);
        frequency0.addValue((int) (byte) -1);
        frequency0.addValue((long) '#');
        long long20 = frequency0.getCount(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str7, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) '4');
        double double4 = frequency0.getPct((java.lang.Object) 100L);
        long long6 = frequency0.getCount((long) (-1));
        long long8 = frequency0.getCount(' ');
        double double10 = frequency0.getPct(100L);
        java.util.Iterator iterator11 = frequency0.valuesIterator();
        long long13 = frequency0.getCumFreq((long) (short) 100);
        frequency0.addValue((int) '#');
        java.lang.String str16 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
    }
}

