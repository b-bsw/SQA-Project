package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 127L, (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.620233E-10f + "'", float2 == 4.620233E-10f);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.6349733946709988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.129321527924962d + "'", double1 == 4.129321527924962d);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.012638627557620415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.205856638137656E-4d + "'", double1 == 2.205856638137656E-4d);
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2015.9999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5366847334153032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5366847334153033d + "'", double1 == 0.5366847334153033d);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1023L), (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-1023L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.13158548711983198d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 750L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        int int2 = org.apache.commons.math3.util.FastMath.max(661, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 661 + "'", int2 == 661);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5430806348152437d, 3.6011880928080983E28d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6011880928080983E28d + "'", double2 == 3.6011880928080983E28d);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 39, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.0f + "'", float2 == 39.0f);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6625659571216381d, (-3.137566414384587E306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842021724855047E-19d, 4.283188721677932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.084202172485505E-19d + "'", double2 == 1.084202172485505E-19d);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.64926731E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.661650474533378d + "'", double1 == 0.661650474533378d);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.4731139338934116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7707893739848156d) + "'", double1 == (-0.7707893739848156d));
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.09545486558053895d, 3.8104773809653514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8104773809653514d + "'", double2 == 3.8104773809653514d);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.2993419E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1413520055419475d + "'", double1 == 1.1413520055419475d);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        int int1 = org.apache.commons.math3.util.FastMath.round(10.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5623517462205421d + "'", double1 == 0.5623517462205421d);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.8828120149361966E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092682d + "'", double1 == 1.0000001192092682d);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8344632077604134d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.11026848715132712d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 9.536744E-7f, 0.9999997749296758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.53674430093088E-7d + "'", double2 == 9.53674430093088E-7d);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9640275716535813d, (double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.86708613731835d + "'", double2 == 104.86708613731835d);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.507682751276436E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.507682749749894E-5d + "'", double1 == 4.507682749749894E-5d);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.184458789852743d, 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5404.834710677771d + "'", double2 == 5404.834710677771d);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5251711488118009d, 1.7025298952542374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29920478501236675d + "'", double2 == 0.29920478501236675d);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 21, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.4731873725534812d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.09453594272628993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30746697826968333d + "'", double1 == 0.30746697826968333d);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 128L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-0.99999994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.9999999f) + "'", float1 == (-0.9999999f));
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 39);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-7.3786976E19f), (-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.378697629483821E19d) + "'", double2 == (-7.378697629483821E19d));
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5623517462205421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5623517462205421d + "'", double1 == 0.5623517462205421d);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-44.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2521.014298575622d) + "'", double1 == (-2521.014298575622d));
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2015.9999f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.50359936E15f) + "'", float1 == (-4.50359936E15f));
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3), 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1500, 1.5370264E31f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5370264E31f + "'", float2 == 1.5370264E31f);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-4.1244601392439496E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023631415874861814d) + "'", double1 == (-0.023631415874861814d));
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(13.7356002949948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 461599.5939121951d + "'", double1 == 461599.5939121951d);
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.1558490151737164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0142573275017009d + "'", double1 == 0.0142573275017009d);
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-38), (double) 2.0282408E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.028240766937036E32d + "'", double2 == 2.028240766937036E32d);
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.02209708691207961d, (double) (-2.9999998f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, 6000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6000L + "'", long2 == 6000L);
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4359738367999996E10d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.910383045673371E-11d + "'", double2 == 2.910383045673371E-11d);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 4, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        int int1 = org.apache.commons.math3.util.FastMath.round(97.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.03937253280921479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007751983046094d + "'", double1 == 1.0007751983046094d);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.99999994f, (-50));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.8817837E-16f + "'", float2 == 8.8817837E-16f);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.2949673E9f, 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(127.0f, (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9375f + "'", float2 == 7.9375f);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2064384.0f, (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2382096E-13f + "'", float2 == 2.2382096E-13f);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.2815044999386025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.129019760422665d + "'", double1 == 16.129019760422665d);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        float float2 = org.apache.commons.math3.util.FastMath.min((-6.000001f), (float) (-34));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.345158334326972E10d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        long long1 = org.apache.commons.math3.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        double double2 = org.apache.commons.math3.util.FastMath.log(6.2211972947867284d, (double) 50L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1401003924481925d + "'", double2 == 2.1401003924481925d);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.267909768656307d, 1.0842021724855047E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2679097686563066d + "'", double2 == 2.2679097686563066d);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7598699960630332d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.73581812221961d + "'", double2 == 46.73581812221961d);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.571098934738399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 433.79201523650374d + "'", double1 == 433.79201523650374d);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.9732551878567528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.962088504675655d + "'", double1 == 0.962088504675655d);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1351374985682157d, (double) 3072);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.695108876643778E-4d + "'", double2 == 3.695108876643778E-4d);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 6000L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6000.0005f + "'", float1 == 6000.0005f);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0691650524286674E-14d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.990081729765975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5486215305415268d + "'", double1 == 0.5486215305415268d);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 230, 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5474252E26f, (double) 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.54742505E26f + "'", float2 == 1.54742505E26f);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        long long2 = org.apache.commons.math3.util.FastMath.min(149L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4210804127942924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        double double2 = org.apache.commons.math3.util.FastMath.log(50.9780097157571d, 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.204690469334889d + "'", double2 == 0.204690469334889d);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.2418773344567871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5353836659458734d, 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.886605660288295E11d + "'", double2 == 5.886605660288295E11d);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5251711488118009d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5223347012340139d, 1.6054761232346983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6054761232346983d + "'", double2 == 1.6054761232346983d);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-62.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 46L, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.831193E31f + "'", float2 == 5.831193E31f);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.746518846982659E9d, (-0.7405240741728077d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.746518846982658E9d + "'", double2 == 6.746518846982658E9d);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4051.54190208279d + "'", double1 == 4051.54190208279d);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.164414002968976d + "'", double1 == 6.164414002968976d);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.10960414795451248d), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10960414795451248d) + "'", double2 == (-0.10960414795451248d));
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1024));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.17512404686688d, (-0.06934569072070507d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1751240468668798d + "'", double2 == 1.1751240468668798d);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.02209708691207961d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.755020761982979E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.189831650612831d) + "'", double1 == (-10.189831650612831d));
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.70805020110221d, (double) (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.2233715E18f, 1.958797365297499d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233709E18f + "'", float2 == 9.2233709E18f);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(112.00001f, 2016.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 112.00001f + "'", float2 == 112.00001f);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 128);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0909305359822086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        double double1 = org.apache.commons.math3.util.FastMath.signum(89.92360567258659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-1.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.809812962444004d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.619625924888008d + "'", double2 == 1.619625924888008d);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.953601409492212E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3406.67702003341d + "'", double1 == 3406.67702003341d);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5492763255146005d + "'", double1 == 2.5492763255146005d);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 4, 1025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2147483647, 2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748352E9f + "'", float2 == 2.14748352E9f);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.536743164059608E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000009536747712d + "'", double1 == 1.0000009536747712d);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0279410268437934d, 4.050338712741454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.050338712741454d + "'", double2 == 4.050338712741454d);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) (-127L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2980741E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2980741E33f + "'", float1 == 1.2980741E33f);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.14254678633741552d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.620233E-10f, 0.75f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.620233E-10f + "'", float2 == 4.620233E-10f);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9735525863233839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.973552586323384d + "'", double1 == 0.973552586323384d);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 661, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 661L + "'", long2 == 661L);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.768371013597152E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707958499577952d + "'", double1 == 1.5707958499577952d);
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.910383E-11f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9103830456733704E-11d + "'", double2 == 2.9103830456733704E-11d);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.6215477523208264d), 0.010988398859591287d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        long long2 = org.apache.commons.math3.util.FastMath.min(8L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 7.9375f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 6000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 86L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 86.0f + "'", float1 == 86.0f);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        long long1 = org.apache.commons.math3.util.FastMath.round(36.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.99999994f, 1.0864876632426175d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999546011007675d + "'", double1 == 0.9999546011007675d);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 34.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5835188324922913d + "'", double1 == 3.5835188324922913d);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-34.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6234989627162255d + "'", double1 == 0.6234989627162255d);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.841534261491385E64d, (double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078125E-7d + "'", double2 == 1.1920928955078125E-7d);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(108222.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6200663.850464795d + "'", double1 == 6200663.850464795d);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        double double1 = org.apache.commons.math3.util.FastMath.log10(8.382711887306458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9233845397715967d + "'", double1 == 0.9233845397715967d);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1359.4785752092612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.6321636932737211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.009739477614549555d), (double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5207040267328378d) + "'", double2 == (-1.5207040267328378d));
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(749.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.367864366808018d + "'", double1 == 27.367864366808018d);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.7564260666383823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306534888271124d + "'", double1 == 0.8306534888271124d);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.443593622809233E69d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.9732551878567528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.05919416648635d + "'", double1 == 113.05919416648635d);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.8750847578455696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 46, (long) 230);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8425767838562601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        int int2 = org.apache.commons.math3.util.FastMath.min(40, 48000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        int int1 = org.apache.commons.math3.util.FastMath.round(2016.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2016 + "'", int1 == 2016);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.6363957575729347d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.3862856729793054E49d, 6.055454452319325E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3862856729793054E49d + "'", double2 == 1.3862856729793054E49d);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.0000004f, 0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5643904318910452d + "'", double2 == 0.5643904318910452d);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        long long2 = org.apache.commons.math3.util.FastMath.min(149L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0075707739244519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08701019437084312d + "'", double1 == 0.08701019437084312d);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7276.563998161455d + "'", double1 == 7276.563998161455d);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0788405256891817E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0788405256891817E-19d + "'", double1 == 1.0788405256891817E-19d);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0007751983046094d, 11.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.345632762712187d + "'", double1 == 2.345632762712187d);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.000488281114d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.174600241584084E-43d + "'", double2 == 7.174600241584084E-43d);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0822918092226002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03434437172145996d + "'", double1 == 0.03434437172145996d);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4242728127018156d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4242728127018156d + "'", double2 == 1.4242728127018156d);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.5623517462205421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4304918528519632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.209973124492415d + "'", double1 == 2.209973124492415d);
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1023.99994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.664475681299524E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.664475681299524E-8d + "'", double1 == 1.664475681299524E-8d);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 29L, 7.610125138662287d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.999998f + "'", float2 == 28.999998f);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0E100d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9362129819375358d + "'", double1 == 1.9362129819375358d);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        int int2 = org.apache.commons.math3.util.FastMath.min((-4), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0232274784994992d, 7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0232274784994995d + "'", double2 == 1.0232274784994995d);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-100.000015f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.130528872063391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5430661936490957d, 1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.503897021644941d + "'", double2 == 1.503897021644941d);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.164414002968976d, 50.793076005481666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12077263008635478d + "'", double2 == 0.12077263008635478d);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.5474252E26f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 0, 0.005375191952790863d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.17253568793198d) + "'", double1 == (-49.17253568793198d));
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.244997998398398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.518455217059944d + "'", double1 == 2.518455217059944d);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, 0.6436097704241932d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-2.14748352E9f), 126.99999237060548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.14748352E9d + "'", double2 == 2.14748352E9d);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.02209708691207961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022098885221519555d + "'", double1 == 0.022098885221519555d);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        long long2 = org.apache.commons.math3.util.FastMath.max(29L, (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        float float1 = org.apache.commons.math3.util.FastMath.abs(8.8817837E-16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.8817837E-16f + "'", float1 == 8.8817837E-16f);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 2.0282408E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.9375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.13158548711983198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1406354131908332d + "'", double1 == 1.1406354131908332d);
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.298342365610589d + "'", double1 == 4.298342365610589d);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-126.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.9580333260613905d, 0.193700035551454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4428418403909626d) + "'", double2 == (-2.4428418403909626d));
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9999999979388464d), 48000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999010695219456d + "'", double2 == 0.9999010695219456d);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.267909768656307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787910802865203d + "'", double1 == 0.9787910802865203d);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.154434690031884d, (-7.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.0d) + "'", double2 == (-7.0d));
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.688101119437145E43d, 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1511132905840549d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9999940395531084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853951831651208d + "'", double1 == 0.7853951831651208d);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.082648376090521d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.9999999999998d + "'", double2 == 1024.9999999999998d);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.094947E-13f, 9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094947E-13f + "'", float2 == 9.094947E-13f);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707509268824842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624361521972155d + "'", double1 == 1.1624361521972155d);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1003275537854505E-17d + "'", double1 == 3.1003275537854505E-17d);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.209973124492415d, 0.7564260666383823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8218109075452849d + "'", double2 == 1.8218109075452849d);
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-63.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707886973994558d + "'", double1 == 1.5707886973994558d);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.43022620016570173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8434441617117128d) + "'", double1 == (-0.8434441617117128d));
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-750.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 2147483647L, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298342365610589d + "'", double2 == 5.298342365610589d);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.290822861412639d) + "'", double1 == (-2.290822861412639d));
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(51.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-29.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6287965664024852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7929669390349671d + "'", double1 == 0.7929669390349671d);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.0016997123712174172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2227587494850775E-162d + "'", double1 == 2.2227587494850775E-162d);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.137998254238577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1644460199269524d + "'", double1 == 2.1644460199269524d);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0000000000000049d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578280992984d + "'", double1 == 1.3169578280992984d);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.910383E-11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.910383E-11f + "'", float1 == 2.910383E-11f);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000953674318d + "'", double1 == 10.000000953674318d);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.39567227992801673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3762399214389404d + "'", double1 == 0.3762399214389404d);
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.23752928622151E42d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 141 + "'", int1 == 141);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1024.0001220703127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-58670.88521551002d) + "'", double1 == (-58670.88521551002d));
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.45231565944180985d), (double) 14L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.45231565944180985d) + "'", double2 == (-0.45231565944180985d));
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6000.0005f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0005f + "'", float2 == 6000.0005f);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-49.83704065529883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 39, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39936.0f + "'", float2 == 39936.0f);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-6.000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.000000953674316d + "'", double1 == 6.000000953674316d);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 8.881786E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.657358789578716d) + "'", double1 == (-34.657358789578716d));
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-34.657358789578716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09967381678567376d + "'", double1 == 0.09967381678567376d);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-1023.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.0861605114833828d, 27.528474355042587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0861605114833828d + "'", double2 == 3.0861605114833828d);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.3683211063593682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9329331452021941d + "'", double1 == 0.9329331452021941d);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        long long2 = org.apache.commons.math3.util.FastMath.min(20L, (long) (-29));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3017603994181974d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1024L, (float) (-50));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.1182202459195336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.30039148809513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3423197723816498d + "'", double1 == 1.3423197723816498d);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 9.53674430092943E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(11.812917954340138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67492.433469899d + "'", double1 == 67492.433469899d);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.000000033134038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59156092460519d + "'", double1 == 114.59156092460519d);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-121), 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121L) + "'", long2 == (-121L));
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.44496326061477254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604328654353665d + "'", double1 == 1.5604328654353665d);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(11.812917954340138d, (double) 5.8274116E13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8274116272128E13d + "'", double2 == 5.8274116272128E13d);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 6.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7158284912051d + "'", double1 == 201.7158284912051d);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2993419E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2993419E33f + "'", float1 == 1.2993419E33f);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.848890218459358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 345.8492399234712d + "'", double1 == 345.8492399234712d);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9033391107665127d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-684.0422700463664d) + "'", double2 == (-684.0422700463664d));
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0d, 0.4043787951567745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2.9999998f), (float) (-14L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(285.99999999999994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.91153452528776d + "'", double1 == 16.91153452528776d);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1024.0007801044699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.00078010447d + "'", double1 == 1024.00078010447d);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.00001f + "'", float1 == 127.00001f);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-50));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.014120383468518E32d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7502145818554039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5597383986215132d + "'", double1 == 0.5597383986215132d);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) -1, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 8, 6000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768372150465258E-7d + "'", double1 == 4.768372150465258E-7d);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970445005179d + "'", double1 == 0.8849970445005179d);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.04001048220963152d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 39.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442156593254849d + "'", double1 == 0.9442156593254849d);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.7762636E-21f + "'", float1 == 6.7762636E-21f);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5707963267948872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965306d + "'", double1 == 4.810477380965306d);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.737124784365025E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-13L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999897818d) + "'", double1 == (-0.9999999999897818d));
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 8.8817837E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178366760566E-16d + "'", double1 == 8.88178366760566E-16d);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1500.0f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.762613918721343d + "'", double1 == 3.762613918721343d);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9675247001368648d) + "'", double1 == (-0.9675247001368648d));
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.437470063761967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.545331397489227d + "'", double1 == 3.545331397489227d);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1621183532803174d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.492660490989457d + "'", double2 == 4.492660490989457d);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-2.229020270326605E-63d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229020270326605E-63d + "'", double1 == 2.229020270326605E-63d);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5707497746364167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.509071350945633d + "'", double1 == 2.509071350945633d);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.52594044935736E-5d, (-0.4071041039658141d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.52594044935736E-5d + "'", double2 == 1.52594044935736E-5d);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        float float2 = org.apache.commons.math3.util.FastMath.max(1024.0f, 4.620233E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 85, 512.5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85.0f + "'", float2 == 85.0f);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        float float2 = org.apache.commons.math3.util.FastMath.max(127.0f, 7.9375f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        double double1 = org.apache.commons.math3.util.FastMath.rint(55.956512780729355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.4359738367999996E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4359738367999996E10d + "'", double1 == 3.4359738367999996E10d);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.017915698460637734d, 0.809812962444004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03849869813274515d + "'", double2 == 0.03849869813274515d);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2016.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2016) + "'", int1 == (-2016));
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.007570773924451899d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.972630067242408d) + "'", double1 == (-0.972630067242408d));
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.0517578129736954E-5d, 1.5573218601131689d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04260447632084876d) + "'", double2 == (-0.04260447632084876d));
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2016.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2016.0f + "'", float2 == 2016.0f);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 2016);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2016L + "'", long2 == 2016L);
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1765355471794627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1017419656965828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1017419656965828d + "'", double1 == 1.1017419656965828d);
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.433773393518789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430691590224186d + "'", double1 == 1.5430691590224186d);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.7079938E27f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.7079938E27f + "'", float1 == 2.7079938E27f);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-62.999996f), (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.749999f) + "'", float2 == (-15.749999f));
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-13.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4994888620096063d) + "'", double1 == (-1.4994888620096063d));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.5065230921350898E254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.328990934768964d) + "'", double1 == (-29.328990934768964d));
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        int int2 = org.apache.commons.math3.util.FastMath.max(2016, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2016 + "'", int2 == 2016);
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) ' ', 86);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4758801E27f + "'", float2 == 2.4758801E27f);
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.176243631242751d, 3.715289172677667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 202.48779875334725d + "'", double2 == 202.48779875334725d);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.187928385330529E-5d, (-0.011682137064909816d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1162021663700457d + "'", double2 == 1.1162021663700457d);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.8828120149361966E-4d, 6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.882812014936196E-4d + "'", double2 == 4.882812014936196E-4d);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        int int2 = org.apache.commons.math3.util.FastMath.max((-34), 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.18838862103418857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6692483165716054d) + "'", double1 == (-1.6692483165716054d));
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6215477523208264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7275232359393335d + "'", double1 == 0.7275232359393335d);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.9823973283939967E-4d, 1.1751240468668798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02061373351040924d) + "'", double2 == (-0.02061373351040924d));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-9223372036854775808L), (double) (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.2233715E18f) + "'", float2 == (-9.2233715E18f));
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1283155162826222d) + "'", double1 == (-1.1283155162826222d));
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.41928129253470725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39701689679318236d) + "'", double1 == (-0.39701689679318236d));
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8414709848078965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0688785009277558d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9943589486530622d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.509071350945633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5911801650911357d + "'", double1 == 0.5911801650911357d);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-29), (-1024L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        long long2 = org.apache.commons.math3.util.FastMath.max(661L, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.15972740774199012d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.1332635352315577E21d), (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3200537642354306d, 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3200537642354309d + "'", double2 == 1.3200537642354309d);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9953380705322046d + "'", double1 == 0.9953380705322046d);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.35366137659382735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3466753987299895d + "'", double1 == 0.3466753987299895d);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5707352916386088d, (-1.54661364251996d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2065299964591305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5213171963583803d + "'", double1 == 1.5213171963583803d);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.913940518571937E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-49.17253568793198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-7.224719895935548d), 3.6011880928080983E28d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.224719895935547d) + "'", double2 == (-7.224719895935547d));
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.8844991406148166d, (double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.2665848258979956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2634384421834473d + "'", double1 == 0.2634384421834473d);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 2016, 1.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2016.0f + "'", float2 == 2016.0f);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8849970445005179d, 5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-919.120475255045d) + "'", double2 == (-919.120475255045d));
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5369650302128113d) + "'", double1 == (-3.5369650302128113d));
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.727786289925683d, 0.8338268425894415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10412335356742336d) + "'", double2 == (-0.10412335356742336d));
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3712141381683466d + "'", double1 == 0.3712141381683466d);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6975039373827737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6423065883854172d + "'", double1 == 0.6423065883854172d);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9999507580093402d), (double) (-1023.99994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999507580093402d) + "'", double2 == (-0.9999507580093402d));
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1025, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-14L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3334775868839923d) + "'", double1 == (-3.3334775868839923d));
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002151468416961833d + "'", double1 == 0.002151468416961833d);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.71421988310894d + "'", double1 == 82.71421988310894d);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37941688514109007d + "'", double1 == 0.37941688514109007d);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.5310603550457816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4881860365921455d) + "'", double1 == (-0.4881860365921455d));
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.736583018476897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9068431676312146d) + "'", double1 == (-0.9068431676312146d));
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(74.35674296486279d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.35674296486278d + "'", double2 == 74.35674296486278d);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.599187944144099d, 0.6483621820319939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5991879441440986d + "'", double2 == 3.5991879441440986d);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.585786437626905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23226068750587248d) + "'", double1 == (-0.23226068750587248d));
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.972630067242408d + "'", double1 == 0.972630067242408d);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.8211867E-34f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6935236E-24f + "'", float2 == 9.6935236E-24f);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768374424203187E-7d + "'", double1 == 4.768374424203187E-7d);
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000001192092682d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 28.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-13.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.841534261491385E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-29.328990934768964d), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-30032.88671720342d) + "'", double2 == (-30032.88671720342d));
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929E-7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        float float2 = org.apache.commons.math3.util.FastMath.max((-127.0f), (float) (-63L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.0f) + "'", float2 == (-63.0f));
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 3072L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.000004f, (-975527.4450396402d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.637689859280612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2142316598443891d + "'", double1 == 0.2142316598443891d);
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.421010862427522E-20d, (-2.23912643706564d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.421010862427522E-20d + "'", double2 == 5.421010862427522E-20d);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 137, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        float float1 = org.apache.commons.math3.util.FastMath.abs(8.881786E-16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.881786E-16f + "'", float1 == 8.881786E-16f);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.447327196772732E34d, 86);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292524006958d + "'", double1 == 0.017453292524006958d);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.99999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 24000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24000.0d + "'", double1 == 24000.0d);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.9375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.9375f + "'", float1 == 7.9375f);
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.017610831014788973d, 1.2785394510828827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06083280556762981d) + "'", double2 == (-0.06083280556762981d));
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(286.4788975654116d, 1.0000001192093038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5673056820522289d + "'", double2 == 1.5673056820522289d);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.44871722863096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448715218377196E-4d + "'", double1 == 8.448715218377196E-4d);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) '#', (float) 2016);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6215477523208264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20652549972907766d) + "'", double1 == (-0.20652549972907766d));
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.4414062985774404E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.0f, 6.164414002968976d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0000005f + "'", float2 == 4.0000005f);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1024));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.079172612257729E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702884095118321d + "'", double1 == 1.5702884095118321d);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.339836909454122d + "'", double1 == 0.339836909454122d);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.848857801796104d, (double) (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.532562594670797d + "'", double2 == 11.532562594670797d);
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.3527167299224545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33909301561996863d) + "'", double1 == (-0.33909301561996863d));
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        int int1 = org.apache.commons.math3.util.FastMath.abs(661);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 661 + "'", int1 == 661);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        long long2 = org.apache.commons.math3.util.FastMath.max(35L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7569856324386435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8586875707426713d + "'", double1 == 0.8586875707426713d);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1729791831319734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127L), 1.80143985E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(127.0f, (float) 48000L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        double double2 = org.apache.commons.math3.util.FastMath.log(100.00000000000001d, 32.01562118716424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7526809663479431d + "'", double2 == 0.7526809663479431d);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 1.441162712889187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.528732941264681d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9576597548889478d), (double) 9.000001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9576597548889478d) + "'", double2 == (-0.9576597548889478d));
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.1035153E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.14351994778492885d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.049964412474072d + "'", double1 == 25.049964412474072d);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 43);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 43L + "'", long1 == 43L);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-14), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768372150465078E-7d + "'", double1 == 4.768372150465078E-7d);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.36693586126414035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1950833553887472d + "'", double1 == 1.1950833553887472d);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.345632762712187d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.18070977791825d) + "'", double1 == (-22.18070977791825d));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.661650474533378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9379882965789272d + "'", double1 == 1.9379882965789272d);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675304813E-12d + "'", double1 == 6.118326675304813E-12d);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 0, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), 3072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-5));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478785d + "'", double1 == 74.20994852478785d);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.545331397489227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.061877705960518836d + "'", double1 == 0.061877705960518836d);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.68434188608064E-14d, 4.856115509710435E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.856115509710435E-13d + "'", double2 == 4.856115509710435E-13d);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.6865756866183495E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000014222d + "'", double1 == 1.0000000000014222d);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-37.999996185302734d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.999996185302734d + "'", double2 == 37.999996185302734d);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        double double1 = org.apache.commons.math3.util.FastMath.log(231.46791666571625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.444441275004965d + "'", double1 == 5.444441275004965d);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.017915698460637734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017915698460637734d + "'", double1 == 0.017915698460637734d);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-34));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1024L), 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5200669294466767d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        double double2 = org.apache.commons.math3.util.FastMath.min(17.76076974417489d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0003709130606282d, 1.2401309032460812E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-104973.24821800704d) + "'", double2 == (-104973.24821800704d));
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        double double2 = org.apache.commons.math3.util.FastMath.max(512.5789572728952d, 1.5609054788787597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 512.5789572728952d + "'", double2 == 512.5789572728952d);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        int int1 = org.apache.commons.math3.util.FastMath.round((-37.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-38) + "'", int1 == (-38));
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.1361707344559157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1357533839793369d + "'", double1 == 0.1357533839793369d);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8586875707426713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3600612468188866d + "'", double1 == 2.3600612468188866d);
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6435222263726064d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-44), (-63959947L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63959947L) + "'", long2 == (-63959947L));
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2015.9999f), 1.2246467991473535E-16d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2015.9998f) + "'", float2 == (-2015.9998f));
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9999999403953552d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794630987664d + "'", double1 == 0.3678794630987664d);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8885515163169583d), 0.1345179953744407d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4411627128891868d + "'", double1 == 1.4411627128891868d);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.2759576E-12f + "'", float1 == 7.2759576E-12f);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        int int2 = org.apache.commons.math3.util.FastMath.max((-38), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.3776033183918694E14d, 7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794866d + "'", double2 == 1.570796326794866d);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        long long2 = org.apache.commons.math3.util.FastMath.max((-9223372036854775808L), (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.6378974212549495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.54883000018738d + "'", double1 == 36.54883000018738d);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.298342365610589d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.079409548469555d), 2.0831675322560934E97d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2016.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.70805020110221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0007751983046094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007751983046094d + "'", double1 == 1.0007751983046094d);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578808d + "'", double1 == 2005.3522829578808d);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.2382096E-13f, 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8158514E19f + "'", float2 == 1.8158514E19f);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        double double1 = org.apache.commons.math3.util.FastMath.abs(17.854718247901992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.854718247901992d + "'", double1 == 17.854718247901992d);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.2796991406480593d), (-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.27969914064805934d) + "'", double2 == (-0.27969914064805934d));
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9640275716535813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        float float2 = org.apache.commons.math3.util.FastMath.min(3072.0002f, (float) 127L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 43);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2360679774997902d + "'", double1 == 2.2360679774997902d);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2207031249999999E-4d, (double) 86.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207031249999999E-4d + "'", double2 == 1.2207031249999999E-4d);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.234021194410018d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20036664302268956d + "'", double2 == 0.20036664302268956d);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        int int1 = org.apache.commons.math3.util.FastMath.round(106.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8838203308698949d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.242265591335951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38) + "'", int2 == (-38));
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8849970445005179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2220482392758838d + "'", double1 == 1.2220482392758838d);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 21, (long) (-15));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.2202849466483139d, 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.586991923454956E13d + "'", double2 == 8.586991923454956E13d);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 256.0f, 0.7665477425729947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 255.99999999999997d + "'", double2 == 255.99999999999997d);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-6.000001f), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6144.0009765625d) + "'", double2 == (-6144.0009765625d));
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.8774718E-37f), (float) (-15));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.8774718E-37f) + "'", float2 == (-5.8774718E-37f));
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.164414002968976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.139932559690632d, 85);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3752713606728143E26d + "'", double2 == 2.3752713606728143E26d);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.18774846815194648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18885342001155384d + "'", double1 == 0.18885342001155384d);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.01428280002321d + "'", double1 == 70.01428280002321d);
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.361975406798963d + "'", double1 == 3.361975406798963d);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8641086300492958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.864108630049296d + "'", double1 == 0.864108630049296d);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5705654518541791d, (double) (-2016));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5705654518541791d + "'", double2 == 0.5705654518541791d);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5628219188284787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4464931094577818d + "'", double1 == 0.4464931094577818d);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341005d + "'", double1 == 1.6094379124341005d);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.244997998398398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10899577685250762d + "'", double1 == 0.10899577685250762d);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 14L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        double double2 = org.apache.commons.math3.util.FastMath.pow(42.51021370567213d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.93722420234059E56d + "'", double2 == 9.93722420234059E56d);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        double double2 = org.apache.commons.math3.util.FastMath.log(21481.281039031423d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.01968878488836084d, (-1.1170794008387335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 80.44386220622742d + "'", double2 == 80.44386220622742d);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        float float2 = org.apache.commons.math3.util.FastMath.min(374.99997f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.88178366760566E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9312063052667533d + "'", double1 == 0.9312063052667533d);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.313220387090301d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5707870865672484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

