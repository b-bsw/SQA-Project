package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.011269295934754417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.444441275004965d, (-0.9993502060907962d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.444441275004964d + "'", double2 == 5.444441275004964d);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8205510187675935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8205510187675935d + "'", double1 == 1.8205510187675935d);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.4757395E20f, 131072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 131072.0f + "'", float2 == 131072.0f);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.154434690031884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.150771154373546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2391264370656394d) + "'", double1 == (-2.2391264370656394d));
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.02249305674199273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02249305674199273d + "'", double1 == 0.02249305674199273d);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.18850577885233794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1048576.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.3407554936658988d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32815170128635673d) + "'", double1 == (-0.32815170128635673d));
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.3236692321000443d, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.114426836181749E-4d + "'", double2 == 8.114426836181749E-4d);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.15396076E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.15396108E11f + "'", float1 == 5.15396108E11f);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22689280275926285d + "'", double1 == 0.22689280275926285d);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(21.0f, (double) 2.8E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.999998f + "'", float2 == 20.999998f);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.16700897784261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7733478655279241d + "'", double1 == 0.7733478655279241d);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 10, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.1875f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(63.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 64512.0d + "'", double2 == 64512.0d);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.30584301E18f + "'", float1 == 2.30584301E18f);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-2.0000000000000004d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-104973.24821800704d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9716102063416081d, 3.7416573867739413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-45.81604924248251d) + "'", double2 == (-45.81604924248251d));
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-51.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.046745412134694E21d + "'", double1 == 7.046745412134694E21d);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.020599913279624d) + "'", double1 == (-6.020599913279624d));
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 6000, (-44.36141949623185d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5999.9995f + "'", float2 == 5999.9995f);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5668307731246351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9165201846296863d + "'", double1 == 0.9165201846296863d);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.298342365610589d, 87);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2507985782666047E55d + "'", double2 == 1.2507985782666047E55d);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        double double1 = org.apache.commons.math3.util.FastMath.atan(17.872171540421935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5149016987903823d + "'", double1 == 1.5149016987903823d);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1.4757395E20f, (double) 2.2382098E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.762866904940629E-14d + "'", double2 == 6.762866904940629E-14d);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2870479599298175d) + "'", double1 == (-0.2870479599298175d));
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.176517423269412E-13d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.769847060100959E-17d + "'", double2 == 3.769847060100959E-17d);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45002077808786195d + "'", double1 == 0.45002077808786195d);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-3.3087225E-22f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3087224502121107E-22d) + "'", double1 == (-3.3087224502121107E-22d));
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2772742781977455E-17d, 1.3486991523486093E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2772742781977455E-17d + "'", double2 == 1.2772742781977455E-17d);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1024, 112L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(508.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.669418070491609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155725176801865d + "'", double1 == 1.9155725176801865d);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.012569432679386039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012491093133179386d + "'", double1 == 0.012491093133179386d);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0075707739244519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0075707739244519d + "'", double1 == 0.0075707739244519d);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9954630704099756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09529285774182059d + "'", double1 == 0.09529285774182059d);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0357153140224502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860465071706698d + "'", double1 == 1.5860465071706698d);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1468915797347967E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0017034229771277E25d + "'", double1 == 2.0017034229771277E25d);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        float float2 = org.apache.commons.math3.util.FastMath.min(126.99999f, (-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2207033E-4f) + "'", float2 == (-1.2207033E-4f));
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2207031E-4f, (-1.192093E-7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.192093E-7f) + "'", float2 == (-1.192093E-7f));
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8778599937165045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0713753091626546d + "'", double1 == 1.0713753091626546d);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.6843426E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.8844991406148166d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000000000000002E100d, 1.1639304525356293E199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000004E100d + "'", double2 == 1.0000000000000004E100d);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2016L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2016L + "'", long1 == 2016L);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1071487177940904d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.13512126156864773d), (double) 6.2277026E10f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13512126156864773d + "'", double2 == 0.13512126156864773d);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000001682150395d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.0000007f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        double double1 = org.apache.commons.math3.util.FastMath.log(11962.131100329156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.389501197277697d + "'", double1 == 9.389501197277697d);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 6.085773152195142E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-1.335144E-4f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.33514404296875E-4d + "'", double1 == 1.33514404296875E-4d);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8586875707426713d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(37542.60032247775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        float float1 = org.apache.commons.math3.util.FastMath.signum(258048.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.018862593966410546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018863712689346446d + "'", double1 == 0.018863712689346446d);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25000003f + "'", float1 == 0.25000003f);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3072.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0f + "'", float1 == 3072.0f);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 16127.999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1049600.000026874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9842620785105387d + "'", double1 == 0.9842620785105387d);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.938659142988208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0826995934081898d + "'", double1 == 1.0826995934081898d);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.4449632606147725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46113323598084716d + "'", double1 == 0.46113323598084716d);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-26));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.61512051684126d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(32.015621187574105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.159127134638988d + "'", double1 == 4.159127134638988d);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.859571186401347E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.859571186401347E15d + "'", double1 == 5.859571186401347E15d);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 4.620233E-10f, 44.29430561789672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17635657438358224d) + "'", double2 == (-0.17635657438358224d));
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-19.999998092651367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9129444723712044d) + "'", double1 == (-0.9129444723712044d));
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.079441482075189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.079441482075189d + "'", double1 == 2.079441482075189d);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 121, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 121L + "'", long2 == 121L);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.2380693740851046E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.4929859817864055E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0013335465472127E47d + "'", double1 == 2.0013335465472127E47d);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9171523356580291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.450905222296818d + "'", double1 == 1.450905222296818d);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.13158548711983198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13158548711983198d + "'", double1 == 0.13158548711983198d);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.036683895975559d, 0.6207559578256505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0226159596344366d + "'", double2 == 1.0226159596344366d);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8956399139416201d, 57.51836340946489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001765199439521086d + "'", double2 == 0.001765199439521086d);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        double double2 = org.apache.commons.math3.util.FastMath.min(73.8403495037882d, (-0.035547557255985324d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.035547557255985324d) + "'", double2 == (-0.035547557255985324d));
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941560535477d + "'", double1 == 0.7615941560535477d);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.7916281914203646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013816518391893289d) + "'", double1 == (-0.013816518391893289d));
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.04690937387533363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-31.72467049624589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.724670496245885d) + "'", double1 == (-31.724670496245885d));
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        long long2 = org.apache.commons.math3.util.FastMath.max((-42L), 18014400656965636L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18014400656965636L + "'", long2 == 18014400656965636L);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2983485416910245d, 2.477888730288475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48264211988227324d + "'", double2 == 0.48264211988227324d);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.80143985E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014398509481984E16d + "'", double1 == 1.8014398509481984E16d);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-1.5258789E-5f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(84.99999f, (-121));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1973443E-35f + "'", float2 == 3.1973443E-35f);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 661);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2401310215141802E-16d, 9.004814790113768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3771865945268513E-17d + "'", double2 == 1.3771865945268513E-17d);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8209470861497329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6077286478785702d + "'", double1 == 0.6077286478785702d);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(686.477360063739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.533028898182115d + "'", double1 == 6.533028898182115d);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.1491887400520766d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16156496120211283d) + "'", double1 == (-0.16156496120211283d));
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3282.6426454739853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.642645473986d + "'", double1 == 3282.642645473986d);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.14748352E9f, 1.2089258E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748352E9f + "'", float2 == 2.14748352E9f);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1025.0001220703898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8637510370828466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5784222410595543d) + "'", double1 == (-0.5784222410595543d));
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        int int2 = org.apache.commons.math3.util.FastMath.max((-77), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-8.726209956737441E-7d), 1.7808614425251377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.726209956737441E-7d) + "'", double2 == (-8.726209956737441E-7d));
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8157617033343525d) + "'", double1 == (-0.8157617033343525d));
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-2064384.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.125f + "'", float1 == 0.125f);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(57.0d, 2.4414062985774404E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707920436259517d + "'", double2 == 1.5707920436259517d);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.7048249349574651d, 0.9998476951563913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8552421908081176E-4d) + "'", double2 == (-2.8552421908081176E-4d));
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 5.759824E-19f, 0.03090864192980489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.759824041329242E-19d + "'", double2 == 5.759824041329242E-19d);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.934966851305078d, 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.964456103663964d + "'", double2 == 4.964456103663964d);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.881146187797675E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.8811461878E11d + "'", double1 == 6.8811461878E11d);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.284913104854943E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 8388608.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.942385152878742d + "'", double1 == 15.942385152878742d);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 11);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.04661182175703781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9544578254513668d + "'", double1 == 0.9544578254513668d);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        int int2 = org.apache.commons.math3.util.FastMath.min((-17), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-63L), (float) 48000L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48000.0f + "'", float2 == 48000.0f);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3328.0f, (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 832.0f + "'", float2 == 832.0f);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.03008425321327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446902459474826d + "'", double1 == 1.446902459474826d);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-121.00001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        double double1 = org.apache.commons.math3.util.FastMath.log(89.71595650537671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.496648640707045d + "'", double1 == 4.496648640707045d);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.0516640514709925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 232.1432501541638d + "'", double1 == 232.1432501541638d);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        long long2 = org.apache.commons.math3.util.FastMath.max((-13L), 19L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19L + "'", long2 == 19L);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 7);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0000005f + "'", float1 == 7.0000005f);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        double double1 = org.apache.commons.math3.util.FastMath.acos(572.9577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8417013480423108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2269808089751186d + "'", double1 == 1.2269808089751186d);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(58670.885227282975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.672846070682779d + "'", double1 == 11.672846070682779d);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 5L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }
}

