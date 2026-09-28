package org.apache.commons.math.util;

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5274728362673282d), 1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5274728362673281d) + "'", double2 == (-0.5274728362673281d));
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.042994183650930454d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        double double2 = org.apache.commons.math.util.FastMath.min(3.450721885123068E-11d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.00540307563595756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5653932248697253d + "'", double1 == 1.5653932248697253d);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double double2 = org.apache.commons.math.util.FastMath.max(0.737447891018455d, 2.0767388768524415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0767388768524415d + "'", double2 == 2.0767388768524415d);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12487180307829396d) + "'", double1 == (-0.12487180307829396d));
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8968903759882284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015653690090444476d + "'", double1 == 0.015653690090444476d);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.9180159690299023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9403224593445607d) + "'", double1 == (-0.9403224593445607d));
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9234560495448352d), 2.2737367544323206E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9917694073609294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-43.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7795906493412312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3340129869462407d + "'", double1 == 1.3340129869462407d);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.3877864478353665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0761361354023782d + "'", double1 == 1.0761361354023782d);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8739456127896417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4068245344922743d + "'", double1 == 1.4068245344922743d);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2602577590774198d, 0.9789051801137091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9789051801137091d + "'", double2 == 0.9789051801137091d);
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.10955796484928035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11603727084635668d) + "'", double1 == (-0.11603727084635668d));
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.407075111026485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9866275920404853d) + "'", double1 == (-0.9866275920404853d));
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7713020696518287d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8808843933637389d) + "'", double1 == (-0.8808843933637389d));
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4617111047443176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1648615463474224d + "'", double1 == 0.1648615463474224d);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.07145890874357941d), 1.2037005703909553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05929642259399588d) + "'", double2 == (-0.05929642259399588d));
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        float float2 = org.apache.commons.math.util.FastMath.max(33.0f, (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6006713379737495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6178002687535424d, (-0.07898096151940606d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9627175972960995d + "'", double2 == 0.9627175972960995d);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7243500169114551d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        float float2 = org.apache.commons.math.util.FastMath.max(5507.0f, 33.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4682955026240894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38410220600044526d + "'", double1 == 0.38410220600044526d);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8170870323423696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.81563844808717d + "'", double1 == 46.81563844808717d);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6269791532528178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5918212578224735d + "'", double1 == 0.5918212578224735d);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.25488428787741324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5936569354152138d) + "'", double1 == (-0.5936569354152138d));
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.940141468803507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8334737036630135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3012989023072947d + "'", double1 == 1.3012989023072947d);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.1286157825604266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.01134940823824843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01134916460125532d + "'", double1 == 0.01134916460125532d);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5378946274303922d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.25850779199769414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9210231484373848d + "'", double1 == 0.9210231484373848d);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 108);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 108L + "'", long1 == 108L);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9882684920925461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8350746649902792d + "'", double1 == 0.8350746649902792d);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9990886426902358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999696121897531d + "'", double1 == 0.999696121897531d);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5982251431131134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5631767322193112d) + "'", double1 == (-0.5631767322193112d));
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        double double1 = org.apache.commons.math.util.FastMath.rint(1016359.4424036132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1016359.0d + "'", double1 == 1016359.0d);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        double double1 = org.apache.commons.math.util.FastMath.log(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2763452613426045d + "'", double1 == 1.2763452613426045d);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.15289141269055143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.760032670961511d + "'", double1 == 8.760032670961511d);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02626982285800363d, (-0.8631635751882506d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8631635751882506d) + "'", double2 == (-0.8631635751882506d));
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7734137622334677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9179181668776548d + "'", double1 == 0.9179181668776548d);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8922451992629653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6377640601517166d + "'", double1 == 0.6377640601517166d);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5507);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5507.0f + "'", float1 == 5507.0f);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        double double1 = org.apache.commons.math.util.FastMath.acosh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610484d + "'", double1 == 5.298292365610484d);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.49724292869339315d, 0.9751446278717821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47154978371078976d + "'", double2 == 0.47154978371078976d);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8100237733214718d, 5.9538600730106995E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3605018649890197E-20d + "'", double2 == 1.3605018649890197E-20d);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5912749463979503d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9738051722046778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.341405852131295d) + "'", double1 == (-1.341405852131295d));
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0190724274822965d + "'", double1 == 0.0190724274822965d);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6441609899881241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.5258607844979077E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0487097934144756E-29d + "'", double1 == 5.0487097934144756E-29d);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.562253565251371d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3988061238431161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0069604799381786375d + "'", double1 == 0.0069604799381786375d);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6682015101903132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.134890207766664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.429962432340893E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.025490037428053d) + "'", double1 == (-4.025490037428053d));
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455065036229584d + "'", double1 == 0.017455065036229584d);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.5012142829615005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.366904830001973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7158979898481593d + "'", double1 == 0.7158979898481593d);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-3.137529136120666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-179.76717759904133d) + "'", double1 == (-179.76717759904133d));
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0806165313998187E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8241707059519972d, 0.6372778494888827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8840556524639369d + "'", double2 == 0.8840556524639369d);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.009213529184899944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6098494453571868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0281149846033601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01204168896484698d + "'", double1 == 0.01204168896484698d);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.857180126010562d + "'", double1 == 4.857180126010562d);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.23641824551800447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6178002687535424d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0006521406531765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.33314442015824d + "'", double1 == 57.33314442015824d);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.267909733656017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787910788176273d + "'", double1 == 0.9787910788176273d);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.06783547514661402d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        double double1 = org.apache.commons.math.util.FastMath.expm1(155.88596569643704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.016660462605011E67d + "'", double1 == 5.016660462605011E67d);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5405025668761214d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.999999999999886d) + "'", double1 == (-32.999999999999886d));
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.570800449011003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442173091730631d + "'", double1 == 0.9442173091730631d);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803774d + "'", double1 == 0.027415567780803774d);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2763452613426045d, 0.6517148788876671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0986966500665631d + "'", double2 == 1.0986966500665631d);
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7688894800973336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9652788330377596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7466222644566186d + "'", double1 == 0.7466222644566186d);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        double double2 = org.apache.commons.math.util.FastMath.max((-5.4203240110583195d), (-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.4203240110583195d) + "'", double2 == (-5.4203240110583195d));
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09247351917780994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957273701577616d + "'", double1 == 0.9957273701577616d);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6887971054572842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5972086840807774d + "'", double1 == 0.5972086840807774d);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        double double2 = org.apache.commons.math.util.FastMath.min((-90.0d), (-0.23641824551800447d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-90.0d) + "'", double2 == (-90.0d));
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7920158446873097d, 0.32269275245300827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7920158446873097d + "'", double2 == 0.7920158446873097d);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930827464263656d) + "'", double1 == (-0.9930827464263656d));
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5113565640720369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7161222253623902d) + "'", double1 == (-0.7161222253623902d));
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1223072818099046E-9d) + "'", double1 == (-4.1223072818099046E-9d));
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8159495993954272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9543698520048144d + "'", double1 == 0.9543698520048144d);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2291346864364843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.01012531265250826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21633966230316995d) + "'", double1 == (-0.21633966230316995d));
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7243120906228638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.021278590635779134d, (double) 90.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3642878043664685E-4d + "'", double2 == 2.3642878043664685E-4d);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        double double1 = org.apache.commons.math.util.FastMath.sinh(41.356159248556786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5679543875799386E17d + "'", double1 == 4.5679543875799386E17d);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5378946274303924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175112166d + "'", double1 == 1.2334031175112166d);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        double double1 = org.apache.commons.math.util.FastMath.abs(871.5850575920532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 871.5850575920532d + "'", double1 == 871.5850575920532d);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7581226324091722d) + "'", double1 == (-0.7581226324091722d));
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8334737036630135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8813796553363304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.49933439946688d + "'", double1 == 50.49933439946688d);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2897566425056355d + "'", double1 == 1.2897566425056355d);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        long long2 = org.apache.commons.math.util.FastMath.min(33L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8028961524453898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7193708484374041d) + "'", double1 == (-0.7193708484374041d));
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202425297431776d + "'", double1 == 0.005202425297431776d);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.007885446079761261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007916618090901184d + "'", double1 == 0.007916618090901184d);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.079986049317652E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080398292528045E-5d + "'", double1 == 9.080398292528045E-5d);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9866275920404853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6271680854142649d) + "'", double1 == (-0.6271680854142649d));
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.16902146990801d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.4814657071109039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3133467281133133d + "'", double1 == 2.3133467281133133d);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.568021819492507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.013277527411913046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01336646187610678d) + "'", double1 == (-0.01336646187610678d));
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.137529136120666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.463960152516967d) + "'", double1 == (-1.463960152516967d));
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6890233931048119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.846254174356267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        double double1 = org.apache.commons.math.util.FastMath.tanh(108.29903111138354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        double double2 = org.apache.commons.math.util.FastMath.min(0.034594658672037475d, 1.0087397904378297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.034594658672037475d + "'", double2 == 0.034594658672037475d);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.25d, 103.70899308565303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2500000000000002d + "'", double2 == 1.2500000000000002d);
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.19864621794280862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19736244536848485d + "'", double1 == 0.19736244536848485d);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.192465179596234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0378042825874916d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3405036138143701d + "'", double1 == 0.3405036138143701d);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8414398880534d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7456034194619627d) + "'", double1 == (-0.7456034194619627d));
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.851898262478877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5675627542389041d + "'", double1 == 1.5675627542389041d);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944007d + "'", double1 == 96.30685281944007d);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2650237603550034d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5884022289215687d), (-1.0950379321938843d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6485250056879788d) + "'", double2 == (-2.6485250056879788d));
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021347E41d + "'", double1 == 6.691673596021347E41d);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0952081954995738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8890235927828648d + "'", double1 == 0.8890235927828648d);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.015653690090444476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01565305086940654d + "'", double1 == 0.01565305086940654d);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.716297889314671d) + "'", double1 == (-1.716297889314671d));
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0119420950219882d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0040325852407168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6951614431905825d + "'", double1 == 0.6951614431905825d);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        double double1 = org.apache.commons.math.util.FastMath.tanh(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707963267948961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9465846430649136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5363352864251576d, 5.438670546795531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 157.88718339239696d + "'", double2 == 157.88718339239696d);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6632456843634443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8143989712440974d + "'", double1 == 0.8143989712440974d);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.460256182988026d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.510293288140764E14d, 5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948903d + "'", double2 == 1.5707963267948903d);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.940141468803501d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6795226183513794d), 1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4991939135618992d + "'", double2 == 1.4991939135618992d);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963118937354d + "'", double1 == 1.5707963118937354d);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.8551464208140986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3169964300810872d) + "'", double1 == (-1.3169964300810872d));
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.079985949503006E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.30557148829374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30557148829374003d + "'", double1 == 0.30557148829374003d);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8882849769695147d + "'", double1 == 1.8882849769695147d);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.262122178163566E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.46360058552194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.46360058552194d + "'", double1 == 2.46360058552194d);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        double double1 = org.apache.commons.math.util.FastMath.acos((-5156.620156177409d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5672637267613392d, 17.98611111111111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5672637267613392d + "'", double2 == 1.5672637267613392d);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6727947914027862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6727947914027863d + "'", double1 == 0.6727947914027863d);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.553418566264681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0087463981833455d + "'", double1 == 1.0087463981833455d);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3923239496630908d + "'", double1 == 1.3923239496630908d);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.49901183053376447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4048061113733491d + "'", double1 == 0.4048061113733491d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        double double1 = org.apache.commons.math.util.FastMath.floor((-5.124738597288386E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2979L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        long long1 = org.apache.commons.math.util.FastMath.round(2.094712547261101d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0255887029643131d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.195945676325781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 179.53879335695746d + "'", double1 == 179.53879335695746d);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985974456667E-5d + "'", double1 == 9.079985974456667E-5d);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6332089045701867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.010176922302104893d), 0.37103568847214113d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3212259960962827d, 65.8643006099024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.291220159807248E7d + "'", double2 == 9.291220159807248E7d);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017455065036229584d, 1.047067248963123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016668889589171274d + "'", double2 == 0.016668889589171274d);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-33), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        double double1 = org.apache.commons.math.util.FastMath.log(1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09629957714903337d + "'", double1 == 0.09629957714903337d);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.05165599792339188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37242622246109275d + "'", double1 == 0.37242622246109275d);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-88.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.99999999999999d) + "'", double1 == (-87.99999999999999d));
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43429448190325176d) + "'", double1 == (-0.43429448190325176d));
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8939966636005579d), 0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8939966636005579d) + "'", double2 == (-0.8939966636005579d));
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.707836221164656d, 0.017453292447995462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5670890583875878d + "'", double2 == 1.5670890583875878d);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.053671212772351E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8390031896359254E-10d + "'", double1 == 1.8390031896359254E-10d);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        long long1 = org.apache.commons.math.util.FastMath.round(0.49724292869339315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.824475489000561E-13d + "'", double1 == 7.824475489000561E-13d);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963267803446d, 0.8968903759882284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4993327597777462d + "'", double2 == 1.4993327597777462d);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        long long1 = org.apache.commons.math.util.FastMath.abs(108L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 108L + "'", long1 == 108L);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.570796029120392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99998294450721d + "'", double1 == 89.99998294450721d);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3946872830200805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14447684095481458d + "'", double1 == 0.14447684095481458d);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.720075976020837E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.720075976020837E-43d + "'", double1 == 3.720075976020837E-43d);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12390750916924391d) + "'", double1 == (-0.12390750916924391d));
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1471972199216043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.080398180225239E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080398167746709E-5d + "'", double1 == 9.080398167746709E-5d);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.0656328345305126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0656328345305126d + "'", double1 == 0.0656328345305126d);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        double double1 = org.apache.commons.math.util.FastMath.ceil(71.61972439135289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.0d + "'", double1 == 72.0d);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0665578081381937d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double double1 = org.apache.commons.math.util.FastMath.log1p(22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999999999998d + "'", double1 == 9.999999999999998d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        double double2 = org.apache.commons.math.util.FastMath.max(2.548742334243514d, (-2.5287649310207496d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.548742334243514d + "'", double2 == 2.548742334243514d);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.824209315301355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1191049213972765d + "'", double1 == 0.1191049213972765d);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.009446037147747973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09719072562620351d + "'", double1 == 0.09719072562620351d);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3880462512735203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.007013702438816d + "'", double1 == 4.007013702438816d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) (-33));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1102230246251565E-16d, 0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8482836399575129d + "'", double2 == 0.8482836399575129d);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.012283997231502098d, 1.5485777614681775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0010994967881021618d + "'", double2 == 0.0010994967881021618d);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.25313651049314223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2586856194944183d + "'", double1 == 0.2586856194944183d);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        double double2 = org.apache.commons.math.util.FastMath.min(630998.4197775756d, 0.8309286497640698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8309286497640698d + "'", double2 == 0.8309286497640698d);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8325008986719311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7578465122604494d + "'", double1 == 0.7578465122604494d);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6157320800633225d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9972986940697113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9972986940697113d + "'", double1 == 0.9972986940697113d);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        double double1 = org.apache.commons.math.util.FastMath.expm1(55.273280124121555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0113012745810993E24d + "'", double1 == 1.0113012745810993E24d);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        long long1 = org.apache.commons.math.util.FastMath.round((-36.00591422616983d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-36L) + "'", long1 == (-36L));
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8599805959475393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.161510274442745d + "'", double1 == 1.161510274442745d);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        double double1 = org.apache.commons.math.util.FastMath.atan(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.940894492205956d, 0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9408944922059557d + "'", double2 == 1.9408944922059557d);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5536062115091314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6180780088437617d) + "'", double1 == (-0.6180780088437617d));
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6610060414837631d, 0.0069604799381786375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6610060414837631d + "'", double2 == 0.6610060414837631d);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9091395677903495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.447744288530596d + "'", double1 == 3.447744288530596d);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.854802108020353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6563678204210392d + "'", double1 == 0.6563678204210392d);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9914834027794717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2351518461832036d) + "'", double1 == (-2.2351518461832036d));
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.407075111026485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.919567136057255d) + "'", double1 == (-1.919567136057255d));
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.037010624154675d, 1.1844562330844421d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031236769083149582d + "'", double2 == 0.031236769083149582d);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3978952727983707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 90);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8939966636005579d + "'", double1 == 0.8939966636005579d);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999999999999999d, 6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.492757420590522E-45d + "'", double2 == 6.492757420590522E-45d);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1223072818099046E-9d) + "'", double1 == (-4.1223072818099046E-9d));
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        double double1 = org.apache.commons.math.util.FastMath.atan((-55.79430724113828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5528752701066448d) + "'", double1 == (-1.5528752701066448d));
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        double double1 = org.apache.commons.math.util.FastMath.abs(153298.37563315977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 153298.37563315977d + "'", double1 == 153298.37563315977d);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999273357849807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414317219434816d + "'", double1 == 0.8414317219434816d);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6271680854142649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8d + "'", double1 == 0.8d);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5729347079345366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.826740701209424d + "'", double1 == 32.826740701209424d);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015185626807227555d + "'", double1 == 0.015185626807227555d);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2979.38053468028d, (-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.3805346802797d + "'", double2 == 2979.3805346802797d);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9204150691407506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.743980336957493d + "'", double1 == 0.743980336957493d);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.69314718055995d + "'", double1 == 32.69314718055995d);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        double double1 = org.apache.commons.math.util.FastMath.atanh(134.38863804832192d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0202829181297208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7032375600859d + "'", double1 == 0.7032375600859d);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2640971787204141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3035285795044003d + "'", double1 == 1.3035285795044003d);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.025588702964313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7887367149835787d + "'", double1 == 2.7887367149835787d);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7134299764161373d, 1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.38894538189191646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5965032461018823d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.05256643013047821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.052614928267624d + "'", double1 == 0.052614928267624d);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3590146193143267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5059580783195847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9186711278102441d + "'", double1 == 0.9186711278102441d);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.2458627722545559d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6264661237378711d) + "'", double1 == (-0.6264661237378711d));
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9185957173539763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7429945002163879d + "'", double1 == 0.7429945002163879d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        double double1 = org.apache.commons.math.util.FastMath.log1p(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670571d + "'", double1 == 4.584967478670571d);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3880462512735203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9833476282002843d + "'", double1 == 0.9833476282002843d);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-8.306852824943366d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        long long1 = org.apache.commons.math.util.FastMath.round(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.5434949887343516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.6890233931048119d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        double double1 = org.apache.commons.math.util.FastMath.ulp(155.74608385512988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0006521406531765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003260171829864d + "'", double1 == 1.0003260171829864d);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.605170185988091d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9135245975035817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6109592601276898d + "'", double1 == 0.6109592601276898d);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.11375468959206643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0019853938729656843d) + "'", double1 == (-0.0019853938729656843d));
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(45.6912438838626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5750132885251107d + "'", double1 == 3.5750132885251107d);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        double double1 = org.apache.commons.math.util.FastMath.log(0.052614928267624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9447553921348883d) + "'", double1 == (-2.9447553921348883d));
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        double double1 = org.apache.commons.math.util.FastMath.acos(28.738038368372738d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6774664656433237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.159754170844509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2926117730048923d + "'", double1 == 1.2926117730048923d);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.9955924691418044E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8840556524639369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3940358404305488d + "'", double1 == 1.3940358404305488d);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2657156711620368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.52016602115306d + "'", double1 == 72.52016602115306d);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6483608274590867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.045149707144593d) + "'", double1 == (-1.045149707144593d));
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        double double2 = org.apache.commons.math.util.FastMath.min(104.94284158531252d, (-0.7735460199712506d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7735460199712506d) + "'", double2 == (-0.7735460199712506d));
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.4900403122965926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.51685295210541d + "'", double1 == 1.51685295210541d);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0798250505610605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7134299764161373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384971956767416d + "'", double1 == 0.5384971956767416d);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.09492270797282235d, 0.4345105648245638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3594649189632695d + "'", double2 == 0.3594649189632695d);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.432886694068576d + "'", double1 == 1.432886694068576d);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4610626787992866d, (-3.0321124266229886d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0321124266229886d) + "'", double2 == (-3.0321124266229886d));
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7651502649370375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8712746824463771d + "'", double1 == 0.8712746824463771d);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4430227241169226d + "'", double1 == 0.4430227241169226d);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0150241067016164d + "'", double1 == 1.0150241067016164d);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7791612621104443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5103225366272008d) + "'", double1 == (-1.5103225366272008d));
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        double double1 = org.apache.commons.math.util.FastMath.asinh(41.356159248556786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.41551468337368d + "'", double1 == 4.41551468337368d);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4051557739351637d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4261297042774799d + "'", double2 == 0.4261297042774799d);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        double double1 = org.apache.commons.math.util.FastMath.log(37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.634234665783512d + "'", double1 == 3.634234665783512d);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5759586531581288d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017019484439497464d, (-0.19374578338773524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0539731556403096d + "'", double2 == 3.0539731556403096d);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.551565975503502d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        double double1 = org.apache.commons.math.util.FastMath.tan((-6.755849220270756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5113217269764148d) + "'", double1 == (-0.5113217269764148d));
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16454021803458782d) + "'", double1 == (-0.16454021803458782d));
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        double double1 = org.apache.commons.math.util.FastMath.signum(90.5972751726331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        double double1 = org.apache.commons.math.util.FastMath.log1p(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3425054583783953d + "'", double1 == 3.3425054583783953d);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5972086840807774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5350603518451278d + "'", double1 == 0.5350603518451278d);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.23641824551800447d), (-0.6483608274590855d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.7919355759617512d) + "'", double2 == (-2.7919355759617512d));
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        long long1 = org.apache.commons.math.util.FastMath.round(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0190724274822965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7195940277157655d) + "'", double1 == (-1.7195940277157655d));
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6941601037894628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6941601037894628d + "'", double1 == 0.6941601037894628d);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8694416130821835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.81533496265541d + "'", double1 == 49.81533496265541d);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        double double1 = org.apache.commons.math.util.FastMath.exp(31.984371183438945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.773845626111828E13d + "'", double1 == 7.773845626111828E13d);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3027551975274565E-11d + "'", double1 == 1.3027551975274565E-11d);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8655103306675354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8655103306675355d + "'", double1 == 0.8655103306675355d);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 5507L, 1.549516130084085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5507.0d + "'", double2 == 5507.0d);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.012208955900931634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012208349338536975d) + "'", double1 == (-0.012208349338536975d));
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.43349402349577826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46285676099588835d + "'", double1 == 0.46285676099588835d);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4959438633913105d, 0.01134916460125532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.566249314920251d + "'", double2 == 1.566249314920251d);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8655103306675354d, (-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8193451511126453d + "'", double2 == 2.8193451511126453d);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        double double1 = org.apache.commons.math.util.FastMath.asin(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.40838771824645015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3877161903520107d) + "'", double1 == (-0.3877161903520107d));
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5166179526408777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4750855248827862d) + "'", double1 == (-0.4750855248827862d));
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 2979L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2722218725854069E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.334466355854698E-5d + "'", double1 == 2.334466355854698E-5d);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402864822065013d + "'", double1 == 1.8402864822065013d);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707972395684235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158328637896095d + "'", double1 == 0.45158328637896095d);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.071550891715021d + "'", double1 == 1.071550891715021d);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.33452691736804824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3345269173680483d + "'", double1 == 0.3345269173680483d);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        double double1 = org.apache.commons.math.util.FastMath.log(1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6887971054572842d + "'", double1 == 0.6887971054572842d);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        float float2 = org.apache.commons.math.util.FastMath.max(7.0f, 90.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1269092742903832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1312996469029764d + "'", double1 == 1.1312996469029764d);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.4177144927409673d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08912508088157221d + "'", double1 == 0.08912508088157221d);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.492757420590521E-45d + "'", double1 == 6.492757420590521E-45d);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3683334104437261d, 0.8968903759882284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8968903759882284d + "'", double2 == 0.8968903759882284d);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3671733557939904d + "'", double1 == 0.3671733557939904d);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.431145960437433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7615649143945545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7050719644457958d + "'", double1 == 0.7050719644457958d);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        double double2 = org.apache.commons.math.util.FastMath.atan2(157.88718339239696d, 1.1664162281198318d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.56340880499775d + "'", double2 == 1.56340880499775d);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.06516780684692637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06516780684692638d + "'", double1 == 0.06516780684692638d);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.544137102816975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 944.8154734160571d + "'", double1 == 944.8154734160571d);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        long long1 = org.apache.commons.math.util.FastMath.round(3.0321124266229886d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        double double1 = org.apache.commons.math.util.FastMath.asin((-36.00591422616983d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.570796326794896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2602577590774198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8511351556504899d + "'", double1 == 0.8511351556504899d);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9442173091730631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5708004490110032d + "'", double1 == 1.5708004490110032d);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017268598258962157d, (-0.5675499795375124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.111175469398392d + "'", double2 == 3.111175469398392d);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1503666979359498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0113263887595518d + "'", double1 == 1.0113263887595518d);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.668201510190313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2316777559563157d + "'", double1 == 1.2316777559563157d);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8813735870195429d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 108L, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        double double2 = org.apache.commons.math.util.FastMath.min(Double.NaN, (-1.2589123923257013d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        long long1 = org.apache.commons.math.util.FastMath.round(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        double double1 = org.apache.commons.math.util.FastMath.abs(157.88718339239696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 157.88718339239696d + "'", double1 == 157.88718339239696d);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1079395657990083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0281127352162502d + "'", double1 == 2.0281127352162502d);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.835438933818835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9651860437766335d + "'", double1 == 0.9651860437766335d);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3313563464012605d + "'", double1 == 2.3313563464012605d);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.2806068627910445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7319013265055243d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8211080655056975d) + "'", double1 == (-0.8211080655056975d));
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5907801071923648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.364828051779159E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.364828051779159E-23d + "'", double1 == 3.364828051779159E-23d);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        double double2 = org.apache.commons.math.util.FastMath.atan2(125.07732156842896d, 0.8611875304425891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5639111943713004d + "'", double2 == 1.5639111943713004d);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.274526125422991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550196364002437d + "'", double1 == 0.8550196364002437d);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.940021456376382d, 2.3642878043664685E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705448125620591d + "'", double2 == 1.5705448125620591d);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        double double1 = org.apache.commons.math.util.FastMath.atan((-30.24580420121606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5377459288874316d) + "'", double1 == (-1.5377459288874316d));
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1674231661645518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.343154841667963d + "'", double1 == 2.343154841667963d);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        double double1 = org.apache.commons.math.util.FastMath.ceil(91.78724175669423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.0d + "'", double1 == 92.0d);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.22649705709056728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25682580430988977d) + "'", double1 == (-0.25682580430988977d));
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03927547481280819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.039275474812808193d + "'", double1 == 0.039275474812808193d);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2493184782545368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2225981852327883d + "'", double1 == 0.2225981852327883d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1748086632901192E-91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1748086632901192E-91d + "'", double1 == 1.1748086632901192E-91d);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5624644491486637d, (-33.71296437329639d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-33.71296437329639d) + "'", double2 == (-33.71296437329639d));
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2479614275509088d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3229353653636484d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        double double1 = org.apache.commons.math.util.FastMath.acos(27.289917197127753d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8450980400142568d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.725771710223923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.919734331907825d + "'", double1 == 0.919734331907825d);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8166592361428845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.934717325643677d) + "'", double1 == (-0.934717325643677d));
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.079985999410328E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6723083385899451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7373226231318831d + "'", double1 == 0.7373226231318831d);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.44341522934086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.549535562644912d + "'", double1 == 1.549535562644912d);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        double double2 = org.apache.commons.math.util.FastMath.min(0.003796077390327768d, (-0.00833887421809711d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00833887421809711d) + "'", double2 == (-0.00833887421809711d));
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.834046549311538E43d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8340465493115374E43d + "'", double2 == 3.8340465493115374E43d);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6180237337779616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2089948465116955d) + "'", double1 == (-0.2089948465116955d));
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.052614928267624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.014613329118427d + "'", double1 == 3.014613329118427d);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5844798497868198d, 1.0438800790430118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5104205015863672d + "'", double2 == 0.5104205015863672d);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9020848703947254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01574435112081428d + "'", double1 == 0.01574435112081428d);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.102016471588857E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.0090635232033223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.4066401663162d + "'", double1 == 172.4066401663162d);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9891437136247581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9945570439269725d + "'", double1 == 0.9945570439269725d);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.005846743218731832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005846743218731832d + "'", double1 == 0.005846743218731832d);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2145517147893816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7950499969146666d + "'", double1 == 0.7950499969146666d);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3956124250860895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3754263855773785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8520158292706517d + "'", double1 == 1.8520158292706517d);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 285.24676385439324d + "'", double1 == 285.24676385439324d);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.013658700984922159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013659550437909718d + "'", double1 == 0.013659550437909718d);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8334224771468441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334224771468443d + "'", double1 == 0.8334224771468443d);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.515582944293113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.540726696924008d + "'", double1 == 29.540726696924008d);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7092677926697085d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.44949479120381985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4494947912038199d + "'", double1 == 0.4494947912038199d);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        int int1 = org.apache.commons.math.util.FastMath.abs(108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8089563172728975d, 1.9914834027794717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6555929984114899d + "'", double2 == 0.6555929984114899d);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0092021272751517d + "'", double1 == 1.0092021272751517d);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3756233543023781d), 7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05360906381648784d) + "'", double2 == (-0.05360906381648784d));
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9792875536939665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7749339485040656d + "'", double1 == 0.7749339485040656d);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.4160533322721292d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5705905238526439d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.289982084979077E-25d + "'", double2 == 4.289982084979077E-25d);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3331559825783589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2311475199693016d + "'", double1 == 1.2311475199693016d);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8638723945101193d + "'", double1 == 0.8638723945101193d);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1917602223703325d + "'", double1 == 1.1917602223703325d);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.6991118430775187d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8813736213307353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.213053378920721d + "'", double1 == 1.213053378920721d);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5009408451299502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4644000018086939d + "'", double1 == 0.4644000018086939d);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9442157056960552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2352049125074824d + "'", double1 == 1.2352049125074824d);
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5405025668761212d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        double double2 = org.apache.commons.math.util.FastMath.pow((-179.76717759904133d), 0.23018603204480417d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        double double2 = org.apache.commons.math.util.FastMath.min(5.438670546795531d, 44.99809670330265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.438670546795531d + "'", double2 == 5.438670546795531d);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8390715290764523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9431910296713536d) + "'", double1 == (-0.9431910296713536d));
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0069604799381786375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3988061238431161d + "'", double1 == 0.3988061238431161d);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.537204015658685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9116493419535971d + "'", double1 == 0.9116493419535971d);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9977958852759198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8959387361703598d + "'", double1 == 0.8959387361703598d);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.40308433762500984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0823444148999104d + "'", double1 == 1.0823444148999104d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7134299764161373d, 0.9652788330377596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7134299764161373d + "'", double2 == 0.7134299764161373d);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01745284947299009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533425911717582d + "'", double1 == 1.5533425911717582d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6708867372551721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9559709842120367d + "'", double1 == 1.9559709842120367d);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4068245344922743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.163944626011821d + "'", double1 == 2.163944626011821d);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.01195230772972848d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 108.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-90.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6848167883550325d), (-0.7893309947689875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6848167883550326d) + "'", double2 == (-0.6848167883550326d));
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4724053287214428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.066831555228962d + "'", double1 == 27.066831555228962d);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        double double1 = org.apache.commons.math.util.FastMath.ceil(22025.46579480672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8105257933460475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9022330041131084d) + "'", double1 == (-0.9022330041131084d));
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        double double2 = org.apache.commons.math.util.FastMath.min(1.815758426184901d, 0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6632349739413137d + "'", double2 == 0.6632349739413137d);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.694813279936381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2640971787204141d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5430089060047839d), 1.0952081954995736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.460285399369799d) + "'", double2 == (-0.460285399369799d));
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.4626264090759076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9855829002548678d) + "'", double1 == (-0.9855829002548678d));
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20715996628268618d + "'", double1 == 0.20715996628268618d);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5975571443282363d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

