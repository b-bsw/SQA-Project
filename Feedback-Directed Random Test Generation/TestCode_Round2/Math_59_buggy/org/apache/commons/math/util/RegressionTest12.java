package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3619730303123129d, 17.520046655456152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.361973030312313d + "'", double2 == 0.361973030312313d);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.023782649535268d, 0.800134365783882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7578112213568773d + "'", double2 == 1.7578112213568773d);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        long long1 = org.apache.commons.math.util.FastMath.round(3.5750132885251107d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.42518782200101835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007420927433301355d + "'", double1 == 0.007420927433301355d);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000908039823013d + "'", double1 == 1.0000908039823013d);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6755160819145565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.21945160292010324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21945160292010324d + "'", double1 == 0.21945160292010324d);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8712746824463771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05984490553849807d) + "'", double1 == (-0.05984490553849807d));
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8456633445388351d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(818.9819689194977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46924.21031640158d + "'", double1 == 46924.21031640158d);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        double double1 = org.apache.commons.math.util.FastMath.log(1312.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.179307969504034d + "'", double1 == 7.179307969504034d);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        double double1 = org.apache.commons.math.util.FastMath.cos(90.3017607496092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6935247302816968d) + "'", double1 == (-0.6935247302816968d));
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8053457690335615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7368371597382015d) + "'", double1 == (-0.7368371597382015d));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 108L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9164145587216197d + "'", double1 == 0.9164145587216197d);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.21633966230316995d), (-0.99598501395558d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9277034142769383d) + "'", double2 == (-2.9277034142769383d));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4494947912038199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4355889145431134d + "'", double1 == 0.4355889145431134d);
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0020438452831427955d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9914834027794717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3120268186024098d + "'", double1 == 1.3120268186024098d);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1093389265928446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0037960591563502375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00378887230585552d + "'", double1 == 0.00378887230585552d);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.10903143175231948d, 0.005656852264782563d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.518960038756951d + "'", double2 == 1.518960038756951d);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.017452406437283508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745063483862636d) + "'", double1 == (-0.01745063483862636d));
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6811676665524073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6811676665524076d + "'", double1 == 1.6811676665524076d);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8966854678967096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8064012322901598d + "'", double1 == 0.8064012322901598d);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8466727901645837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5804973451249884d + "'", double1 == 2.5804973451249884d);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8143989712440974d + "'", double1 == 0.8143989712440974d);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7734137622334677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5729063682998855d + "'", double1 == 0.5729063682998855d);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        double double1 = org.apache.commons.math.util.FastMath.rint(114.09415978466134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.0d + "'", double1 == 114.0d);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        double double1 = org.apache.commons.math.util.FastMath.cosh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471784987917d + "'", double1 == 0.6931471784987917d);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.865450952848139d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5382334032499028d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.03559956249561319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03561460890735782d + "'", double1 == 0.03561460890735782d);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8450980400142568d, 0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7997951320060821d + "'", double2 == 0.7997951320060821d);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        int int2 = org.apache.commons.math.util.FastMath.min(90, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44721359549995804d + "'", double1 == 0.44721359549995804d);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.16298994513340984d), 0.9737269126464657d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16298994513340984d) + "'", double2 == (-0.16298994513340984d));
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        double double2 = org.apache.commons.math.util.FastMath.atan2(62.307354339300744d, (-0.21670660727375085d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.574274338913512d + "'", double2 == 1.574274338913512d);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        double double2 = org.apache.commons.math.util.FastMath.pow(92.0d, 1.4658506161222316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 756.1702669404289d + "'", double2 == 756.1702669404289d);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.10990588764248074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939664250495758d + "'", double1 == 0.9939664250495758d);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        double double1 = org.apache.commons.math.util.FastMath.atan((-323.0051853474518d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.567700411154953d) + "'", double1 == (-1.567700411154953d));
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0767388768524415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9265347913128554d + "'", double1 == 3.9265347913128554d);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.32047738164862055d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10642219731928483d + "'", double2 == 0.10642219731928483d);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.9447553921348883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.026480513893276d + "'", double1 == 34.026480513893276d);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.2490457723982544d), (-0.7893184915864662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7893184915864662d) + "'", double2 == (-0.7893184915864662d));
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6483608274590855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6947506487576589d) + "'", double1 == (-0.6947506487576589d));
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5405025668761214d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5405025668761212d) + "'", double1 == (-1.5405025668761212d));
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-6.470817953541134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11293707858645427d) + "'", double1 == (-0.11293707858645427d));
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (-33.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8948825727293745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3956124250860893d + "'", double1 == 1.3956124250860893d);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.751100853507406E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1782893802790361E11d + "'", double1 == 1.1782893802790361E11d);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.989874861238103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966134982981695d + "'", double1 == 0.9966134982981695d);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.03927547481280818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        double double1 = org.apache.commons.math.util.FastMath.signum((-40.854048291402435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7, (float) 33L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6809246903215531d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0926371180390901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4601456216040868d + "'", double1 == 0.4601456216040868d);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        double double1 = org.apache.commons.math.util.FastMath.atan((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5532542667374942d) + "'", double1 == (-1.5532542667374942d));
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.32719023706934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.746619681958038d + "'", double1 == 18.746619681958038d);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09719072562620351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09688642602692299d + "'", double1 == 0.09688642602692299d);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.05654463277833749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9972986940697113d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        double double1 = org.apache.commons.math.util.FastMath.log(0.936427648305001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06568301763189695d) + "'", double1 == (-0.06568301763189695d));
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.10955796484928035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.4160533322721292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2452137411103849d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24282050753856244d) + "'", double1 == (-0.24282050753856244d));
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02626982285800363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02627284444545242d + "'", double1 == 0.02627284444545242d);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260406133217521d + "'", double1 == 0.9260406133217521d);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7434618395438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.203568507135691d + "'", double1 == 1.203568507135691d);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.298292365610484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201424d + "'", double1 == 1.7433261306201424d);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0865078793721343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46557874873944705d + "'", double1 == 0.46557874873944705d);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0950379321938841d), 0.0011640511417403306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0950379321938841d) + "'", double2 == (-1.0950379321938841d));
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.11083319553050024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11038158952253177d + "'", double1 == 0.11038158952253177d);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.18131977440149033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1803278688524591d + "'", double1 == 0.1803278688524591d);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6719990366730106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237305723485223d + "'", double1 == 0.7237305723485223d);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9282846855324671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4110955828127631d + "'", double1 == 1.4110955828127631d);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8585575386941564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.414477459402565d + "'", double1 == 6.414477459402565d);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9562645537814451d + "'", double1 == 1.9562645537814451d);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.466743204778643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5429791986523687d + "'", double1 == 2.5429791986523687d);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8347682213968615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7595880598482629d + "'", double1 == 0.7595880598482629d);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.367810338251987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14604584158491757d + "'", double1 == 0.14604584158491757d);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        double double1 = org.apache.commons.math.util.FastMath.cosh(103.70899308565303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.485464706843569E44d + "'", double1 == 5.485464706843569E44d);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9756299818288702d), 0.9872136726111863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9872136726111863d + "'", double2 == 0.9872136726111863d);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.559685672897289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4837638933767474d + "'", double1 == 2.4837638933767474d);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.05167897363437805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05172502946184861d + "'", double1 == 0.05172502946184861d);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        double double1 = org.apache.commons.math.util.FastMath.log(2.4959438633913105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9146669596257818d + "'", double1 == 0.9146669596257818d);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.367810338251987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8139497520487735d + "'", double1 == 2.8139497520487735d);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.011983210854855571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.18131977440149033d, 1.228462604887648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12275173010011566d + "'", double2 == 0.12275173010011566d);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7881717713958057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        double double1 = org.apache.commons.math.util.FastMath.log1p(51.68565583622363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.964343233227284d + "'", double1 == 3.964343233227284d);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9615319455195346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5199340510531957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7820802611773309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1067486750760071d) + "'", double1 == (-0.1067486750760071d));
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.13249892381659706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13211157291488562d + "'", double1 == 0.13211157291488562d);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0255887029643131d, (-3.3805150062465965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.918131392275503d + "'", double2 == 0.918131392275503d);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        double double1 = org.apache.commons.math.util.FastMath.exp(18.746619681958038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.385330775230143E8d + "'", double1 == 1.385330775230143E8d);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7615941559557649d), 0.672065641742427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8477647080717694d) + "'", double2 == (-0.8477647080717694d));
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9683274362856896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5666784137257918d + "'", double1 == 0.5666784137257918d);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        double double2 = org.apache.commons.math.util.FastMath.max(0.35430360994810484d, (-2.13381059201667d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35430360994810484d + "'", double2 == 0.35430360994810484d);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        long long2 = org.apache.commons.math.util.FastMath.min(108L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.582203397533547d + "'", double1 == 0.582203397533547d);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7193708484374041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2707236083120753E31d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.002309551127695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6355590717614192d + "'", double1 == 3.6355590717614192d);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0748524634035861d + "'", double1 == 0.0748524634035861d);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.367810338251987d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5166179526408777d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01745063483862636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0457103449725933E-4d) + "'", double1 == (-3.0457103449725933E-4d));
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 90, (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.359770220129362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.202774714925223d + "'", double1 == 1.202774714925223d);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3313563464012605d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        double double1 = org.apache.commons.math.util.FastMath.ceil(49.59008907222208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 108L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8462950832072025d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.12873439758804212d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.052495160685712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 174.89508969139933d + "'", double1 == 174.89508969139933d);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0268328847498687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2311438316434992d + "'", double1 == 0.2311438316434992d);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3615615830612523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3537352837904361d + "'", double1 == 0.3537352837904361d);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0120948455406893d + "'", double1 == 1.0120948455406893d);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6692896481323396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9528496174425045d + "'", double1 == 1.9528496174425045d);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.025293885879535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.025293885879535d + "'", double2 == 2.025293885879535d);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.48250862996283855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.523803578782063d + "'", double1 == 0.523803578782063d);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8250752499738025d, 0.9543698520048144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.832346142004121d + "'", double2 == 0.832346142004121d);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 1, (-31.17011361997944d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.109521640352153d + "'", double2 == 3.109521640352153d);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        double double1 = org.apache.commons.math.util.FastMath.sinh(47.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2906564430950338E20d + "'", double1 == 1.2906564430950338E20d);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.360130725463979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6033871039701522d + "'", double1 == 0.6033871039701522d);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1312996469029764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0996823760496963d + "'", double1 == 3.0996823760496963d);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.012209562553744127d), 9.429962432340893E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021278590635779138d + "'", double1 == 0.021278590635779138d);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2020197576001874d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7006231354388308d, (-4.122307281809905E-9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7006231354388308d + "'", double2 == 1.7006231354388308d);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8877017014171673d + "'", double1 == 0.8877017014171673d);
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9132181497465548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-52.3235457552236d) + "'", double1 == (-52.3235457552236d));
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.50871659209645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9873579129275408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.982414675845302d + "'", double1 == 2.982414675845302d);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8585575386941564d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6632349739413136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.25313651049314223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25876123621075164d + "'", double1 == 0.25876123621075164d);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 37, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7157658795650589d + "'", double1 == 0.7157658795650589d);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        double double1 = org.apache.commons.math.util.FastMath.sinh(50.710623985951266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.276114056013788E21d + "'", double1 == 5.276114056013788E21d);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0352316484600232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.034594658672037475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034009715875359614d + "'", double1 == 0.034009715875359614d);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.094712547261101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.123105625617656d + "'", double1 == 7.123105625617656d);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        long long1 = org.apache.commons.math.util.FastMath.abs(7L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.755849220270756d), 0.017454178629595234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.755849220270756d) + "'", double2 == (-6.755849220270756d));
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7713020696518287d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9534903170187385d) + "'", double1 == (-0.9534903170187385d));
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8564693635507433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5424056614562467d + "'", double1 == 0.5424056614562467d);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5675499795375124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5408008620104859d + "'", double1 == 0.5408008620104859d);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9787910788176273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.080597841306755d + "'", double1 == 56.080597841306755d);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017454178737585296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001523280448503d + "'", double1 == 1.0001523280448503d);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4724053287214428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6038473373858848d + "'", double1 == 1.6038473373858848d);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9408416071039944d + "'", double1 == 0.9408416071039944d);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.725771710223923d, 3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7257717102239228d + "'", double2 == 0.7257717102239228d);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9192986415975283d + "'", double1 == 0.9192986415975283d);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.35049754306911085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3504975430691109d + "'", double1 == 0.3504975430691109d);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.005403023058834883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005402970483247057d + "'", double1 == 0.005402970483247057d);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.74703167794491d + "'", double1 == 11.74703167794491d);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.079985974456667E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985999410328E-5d + "'", double1 == 9.079985999410328E-5d);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0061837645452961654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35430360994810484d + "'", double1 == 0.35430360994810484d);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015840105828908848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015840768307772042d + "'", double1 == 0.015840768307772042d);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8186478528670488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6832092000707405d + "'", double1 == 0.6832092000707405d);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-33L), 5.83569384937053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.395766663829712d) + "'", double2 == (-1.395766663829712d));
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.50871659209645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.087617698774597d + "'", double1 == 16.087617698774597d);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5820305439415169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6154530614821584d) + "'", double1 == (-0.6154530614821584d));
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8100237733214718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.050505149493486d + "'", double1 == 1.050505149493486d);
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0176055895227845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5640109638251691d + "'", double1 == 1.5640109638251691d);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.080398205182299E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.044947095365984735d + "'", double1 == 0.044947095365984735d);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.997529084960586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2558486026857986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29155717484956145d + "'", double1 == 0.29155717484956145d);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9982900983985066d, (-1.045149707144593d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9982900983985066d + "'", double2 == 0.9982900983985066d);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2316777559563157d, 0.47428373042402705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47428373042402705d + "'", double2 == 0.47428373042402705d);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.919567136057255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9195671360572548d) + "'", double1 == (-1.9195671360572548d));
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6647371013175847d + "'", double1 == 3.6647371013175847d);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5516730959931526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8201512193813868d) + "'", double1 == (-0.8201512193813868d));
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0012070607874443988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012070604943308525d + "'", double1 == 0.0012070604943308525d);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3010299956639812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3258176636680326d + "'", double1 == 1.3258176636680326d);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05663520630914342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.24495829336661d + "'", double1 == 3.24495829336661d);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.800134365783882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8947805892373116d, 9.07998601188716E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8947805892373116d + "'", double2 == 0.8947805892373116d);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12819302534937357d + "'", double1 == 0.12819302534937357d);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.617667823836307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.85459774564664d + "'", double1 == 1.85459774564664d);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.919567136057255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9578816255865316d) + "'", double1 == (-0.9578816255865316d));
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.678421832629247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784218326292472d + "'", double1 == 0.6784218326292472d);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9448615067357444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8325451219316489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.249772867773091d + "'", double1 == 5.249772867773091d);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5440211108893697d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.003796077390327768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037960956245680563d + "'", double1 == 0.0037960956245680563d);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.16429734860675368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.413544660356582d) + "'", double1 == (-9.413544660356582d));
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        double double1 = org.apache.commons.math.util.FastMath.log1p(57.298091261946645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.065569352888179d + "'", double1 == 4.065569352888179d);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 2979L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.58021619598075d + "'", double1 == 54.58021619598075d);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7456241416655578d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346646087760579d + "'", double1 == 0.7346646087760579d);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.556943220947281d + "'", double1 == 0.556943220947281d);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.265653458137023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.3978118125063327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8323541239940268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6056015466954472d + "'", double1 == 0.6056015466954472d);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3211090992020038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7475755061678413d + "'", double1 == 2.7475755061678413d);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.3786185863965946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.228462604887648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7451749797335945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6404059372365005d + "'", double1 == 0.6404059372365005d);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41884530877048626d + "'", double1 == 0.41884530877048626d);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.49008347417426656d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0973039206233832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8317596825694501d + "'", double1 == 0.8317596825694501d);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        int int2 = org.apache.commons.math.util.FastMath.max(90, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.45158270528945427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.037010624154675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0377040455078794d + "'", double1 == 1.0377040455078794d);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        double double1 = org.apache.commons.math.util.FastMath.exp(29.540726696924008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.751100853508406E12d + "'", double1 == 6.751100853508406E12d);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2763452613426045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        double double2 = org.apache.commons.math.util.FastMath.min(9.07998602436399E-5d, (-0.11375468959206643d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11375468959206643d) + "'", double2 == (-0.11375468959206643d));
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8840556524639369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.219703667149318d + "'", double1 == 1.219703667149318d);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        double double2 = org.apache.commons.math.util.FastMath.min(2.4835970359743094d, 0.9198805219398823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9198805219398823d + "'", double2 == 0.9198805219398823d);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        double double1 = org.apache.commons.math.util.FastMath.sin(212.75275683459444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7678918407989204d) + "'", double1 == (-0.7678918407989204d));
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.708203923697058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        double double1 = org.apache.commons.math.util.FastMath.exp((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194012623990515E-40d + "'", double1 == 8.194012623990515E-40d);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9496482207527558d, 0.6692896481323396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9496482207527557d + "'", double2 == 0.9496482207527557d);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5982251431131134d), 0.7219067166708867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6919820465465093d) + "'", double2 == (-0.6919820465465093d));
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 108.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6187.944187412891d + "'", double1 == 6187.944187412891d);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.13249892381659706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001164728649041d + "'", double1 == 1.001164728649041d);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9155040003582885E22d, 1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1877181244729043d + "'", double2 == 1.1877181244729043d);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        double double1 = org.apache.commons.math.util.FastMath.log10(818.9819689194977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.913274340240312d + "'", double1 == 2.913274340240312d);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9044387629088754d, 0.21178170748056988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.340782307793875d + "'", double2 == 1.340782307793875d);
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 108);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1331999452259886E-46d + "'", double1 == 1.1331999452259886E-46d);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.030289126640769458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030293758218151813d + "'", double1 == 0.030293758218151813d);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3152166151204571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        double double1 = org.apache.commons.math.util.FastMath.asinh(23.628351601695016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8560419988730192d + "'", double1 == 3.8560419988730192d);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        double double2 = org.apache.commons.math.util.FastMath.pow(1375.0987083139757d, (-0.6848167883550326d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007092776508144172d + "'", double2 == 0.007092776508144172d);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995216443485196d + "'", double1 == 0.6995216443485196d);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.9952004122082412d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9952004122082412d) + "'", double2 == (-1.9952004122082412d));
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.0969832464593828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0969832464593828d + "'", double1 == 0.0969832464593828d);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.6162298357006117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8013537820571914d) + "'", double1 == (-0.8013537820571914d));
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0865078793721343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.963905663126391d + "'", double1 == 2.963905663126391d);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.007092776508144172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08421862328573278d + "'", double1 == 0.08421862328573278d);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.596644259751356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9984979022832193d) + "'", double1 == (-0.9984979022832193d));
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7620587253843047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.9512437185814275d, 0.9999997649972645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3229164272389442d + "'", double2 == 1.3229164272389442d);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4726612473342131E-15d, 0.2958255551963092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.095866506272659E-5d + "'", double2 == 4.095866506272659E-5d);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.449394909181667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4344206022424219d) + "'", double1 == (-0.4344206022424219d));
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-33.96421184743732d), 57.33314442015824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-33.96421184743731d) + "'", double2 == (-33.96421184743731d));
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        double double1 = org.apache.commons.math.util.FastMath.log10(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6848167883550325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4958174067642112d) + "'", double1 == (-0.4958174067642112d));
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6794497296418427d), 40.6380510645342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6794497296418426d) + "'", double2 == (-0.6794497296418426d));
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7735460199712506d), 1375.0987083139757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.625384808364832E-4d) + "'", double2 == (-5.625384808364832E-4d));
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0994172039830736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0320977775721407d + "'", double1 == 1.0320977775721407d);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9111302618846769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9111302618846769d + "'", double1 == 0.9111302618846769d);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        double double1 = org.apache.commons.math.util.FastMath.exp(92.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.017628405034299E39d + "'", double1 == 9.017628405034299E39d);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        long long1 = org.apache.commons.math.util.FastMath.round(0.810415804571918d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6130679609866563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042259046182297d) + "'", double1 == (-0.042259046182297d));
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.602036160225165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9219744771138908d + "'", double1 == 0.9219744771138908d);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.262122178163566E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01365785170622981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013658701032456458d + "'", double1 == 0.013658701032456458d);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        long long1 = org.apache.commons.math.util.FastMath.round(28.738038368372738d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8840556524639369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9402423370939733d + "'", double1 == 0.9402423370939733d);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.929562688685152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3947262909064218d + "'", double1 == 0.3947262909064218d);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7038211969154579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.021462373800272d + "'", double1 == 1.021462373800272d);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2311438316434992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6361176917519d) + "'", double1 == (-0.6361176917519d));
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9402423370939733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3699313837652003d + "'", double1 == 1.3699313837652003d);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705654518541774d + "'", double1 == 0.5705654518541774d);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.617667823836307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2814145124371763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0861668553868433d + "'", double1 == 1.0861668553868433d);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6229473377768496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6725047799604035d) + "'", double1 == (-0.6725047799604035d));
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7336975489865022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6329856393072076d + "'", double1 == 0.6329856393072076d);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.05256643013047821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05123140109615459d + "'", double1 == 0.05123140109615459d);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7659219106381584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.827444419368824E-10d + "'", double1 == 4.827444419368824E-10d);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4661996943871322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-34L), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6743332553663808d, (-0.5166179526408777d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6743332553663808d + "'", double2 == 0.6743332553663808d);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.549516130084085d, 104.18930738450574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014871026053112092d + "'", double2 == 0.014871026053112092d);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.022728632940653824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000258306497284d + "'", double1 == 1.000258306497284d);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.12275173010011566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8022326162223065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014001600519967322d) + "'", double1 == (-0.014001600519967322d));
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6532070891002518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256817d) + "'", double1 == (-0.9092974268256817d));
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.219703667149318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386184147329573d + "'", double1 == 2.386184147329573d);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0973039206233832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0475227542270302d + "'", double1 == 1.0475227542270302d);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7673695592041386d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1301077462402083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.454624741523039d + "'", double1 == 7.454624741523039d);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8694416130821835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015174618802134707d + "'", double1 == 0.015174618802134707d);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6995216443485195d), 0.9260406133217521d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6995216443485194d) + "'", double2 == (-0.6995216443485194d));
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.042259046182297d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9586214211861716d + "'", double1 == 0.9586214211861716d);
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.037010624154675d, (-0.6655280485429236d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0860389587809567d + "'", double2 == 3.0860389587809567d);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.366904830001973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.926672077942048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.604885025084334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.18573988815053546d, 226.84826038896668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4204038234137333E-166d + "'", double2 == 1.4204038234137333E-166d);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6706596876784242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8753211067136092d + "'", double1 == 0.8753211067136092d);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5944359846634683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7243120906228638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7489554219173225d + "'", double1 == 0.7489554219173225d);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.267365292027d), 5.085665678873264E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.267365292027d) + "'", double2 == (-2.267365292027d));
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        int int2 = org.apache.commons.math.util.FastMath.max(37, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.012209562553744129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01220895588284645d + "'", double1 == 0.01220895588284645d);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0586370213946186d + "'", double1 == 1.0586370213946186d);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538872d + "'", double1 == 1.0038848218538872d);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.504668038064618E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3828979036148312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9864372157282446d + "'", double1 == 3.9864372157282446d);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6723083385899451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7241124145944234d + "'", double1 == 0.7241124145944234d);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.832346142004121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2987055082800065d + "'", double1 == 1.2987055082800065d);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1917602223703325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1917602223703327d + "'", double1 == 1.1917602223703327d);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3494089883469367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8739137188214786d + "'", double1 == 0.8739137188214786d);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7558926889211433d) + "'", double1 == (-0.7558926889211433d));
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.223372036854776E18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0530637390494226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0530637390494226d + "'", double1 == 1.0530637390494226d);
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015106004980173343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015106579549212285d + "'", double1 == 0.015106579549212285d);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.367810338251989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0301927663008446d + "'", double1 == 2.0301927663008446d);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5015733900925633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6900053411253284d) + "'", double1 == (-0.6900053411253284d));
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8003067438809977d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9421475168289407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.565484928832517d + "'", double1 == 2.565484928832517d);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.029949908321658926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029510168361517913d + "'", double1 == 0.029510168361517913d);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.25850779199769414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2529698293414318d + "'", double1 == 0.2529698293414318d);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9446922743316068E-62d, 1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5661709721771937d + "'", double2 == 1.5661709721771937d);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5507L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7023967071298747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6058868587310341d) + "'", double1 == (-0.6058868587310341d));
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8690586640680674d, 19.526476712002587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8690586640680674d + "'", double2 == 0.8690586640680674d);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        double double2 = org.apache.commons.math.util.FastMath.min((-5.124738597288386E-4d), 46.30686372341393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.124738597288386E-4d) + "'", double2 == (-5.124738597288386E-4d));
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.322723236313804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        double double2 = org.apache.commons.math.util.FastMath.min(91.0d, 6.191967820742884E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.0d + "'", double2 == 91.0d);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.4223506181800103d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.455197646070681E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.455197646070681E-11d + "'", double1 == 1.455197646070681E-11d);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.24282050753856244d), 46924.21031640158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.174738283267841E-6d) + "'", double2 == (-5.174738283267841E-6d));
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.080398292528045E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958773184d + "'", double1 == 0.9999999958773184d);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        long long1 = org.apache.commons.math.util.FastMath.round(0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.147784570106809d, 0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.147784570106808d + "'", double2 == 4.147784570106808d);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.407075111026485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8201512193813868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8201512193813867d) + "'", double1 == (-0.8201512193813867d));
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0037960591563502375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000072050412114d + "'", double1 == 1.0000072050412114d);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999999999999996d + "'", double1 == 1.9999999999999996d);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0740973108363787d + "'", double1 == 1.0740973108363787d);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7771211630872612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6510512224104581d + "'", double1 == 0.6510512224104581d);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5274728362673281d), 1.7084653196386397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.527472836267328d) + "'", double2 == (-0.527472836267328d));
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        double double1 = org.apache.commons.math.util.FastMath.atanh(153298.37563315977d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0000135327670998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453528711286092d + "'", double1 == 0.017453528711286092d);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0996823760496963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054099663228108226d + "'", double1 == 0.054099663228108226d);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        double double2 = org.apache.commons.math.util.FastMath.pow(11013.232874703393d, 0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2083.76558392283d + "'", double2 == 2083.76558392283d);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47100149383084566d + "'", double1 == 0.47100149383084566d);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.37562335430237803d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7415933335367688d, 0.8334224771468443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7415933335367688d + "'", double2 == 0.7415933335367688d);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-33.96421184743731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.14604584158491757d, 0.9997560082775591d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1450554729350647d + "'", double2 == 0.1450554729350647d);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5558726996235265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4147280379840659d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3752021393940158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6125374595843227d + "'", double1 == 0.6125374595843227d);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1748086632901192E-91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.427548195562127E-46d + "'", double1 == 3.427548195562127E-46d);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0926371180390901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019070115239284053d + "'", double1 == 0.019070115239284053d);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0653122583386827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5574077246549018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.226191170883517d) + "'", double1 == (-1.226191170883517d));
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(46.81563844808717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8170870323423696d + "'", double1 == 0.8170870323423696d);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45231565944180985d) + "'", double1 == (-0.45231565944180985d));
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.580829006249046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7621213855082706d + "'", double1 == 0.7621213855082706d);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4299012280529384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1552397460307036d + "'", double1 == 1.1552397460307036d);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2717104239752095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5669483416477585d + "'", double1 == 2.5669483416477585d);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 4.5435938534266416E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        long long1 = org.apache.commons.math.util.FastMath.round(5.438670546795531d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.476411659486956d + "'", double1 == 28.476411659486956d);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9816204068070169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3402145963603704d + "'", double1 == 2.3402145963603704d);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5913365965931429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4645742898914677d + "'", double1 == 0.4645742898914677d);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        double double2 = org.apache.commons.math.util.FastMath.max(6.145735497073049d, 0.5802053839637674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.145735497073049d + "'", double2 == 6.145735497073049d);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2343900235798524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2343900235798524d + "'", double1 == 1.2343900235798524d);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1304751349378549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5071961149184759d + "'", double1 == 0.5071961149184759d);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6207831908859206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5816724044616679d) + "'", double1 == (-0.5816724044616679d));
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7735460199712506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6489866703054372d) + "'", double1 == (-0.6489866703054372d));
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.041914824263685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        long long2 = org.apache.commons.math.util.FastMath.max(29L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9479239466377265d) + "'", double1 == (-0.9479239466377265d));
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.1898842314256335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7364352239483065d) + "'", double1 == (-1.7364352239483065d));
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6046661120266558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5030788542413147d) + "'", double1 == (-0.5030788542413147d));
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.3273845772164696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.22649705709056728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22847976310912121d) + "'", double1 == (-0.22847976310912121d));
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.690758847751954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        long long1 = org.apache.commons.math.util.FastMath.round(0.015174618802134707d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5429710340288028d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.617667823836307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7103940453389738d + "'", double1 == 0.7103940453389738d);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707963267948957d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3956124250860893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        double double1 = org.apache.commons.math.util.FastMath.abs(46.81563844808717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.81563844808717d + "'", double1 == 46.81563844808717d);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        int int2 = org.apache.commons.math.util.FastMath.min(37, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0475227542270302d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        long long1 = org.apache.commons.math.util.FastMath.round(0.04599315997198159d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9022330041131084d), 0.2355885565015715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3153820931708018d) + "'", double2 == (-1.3153820931708018d));
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.613775297505947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-70.66879307167105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2897566425056355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1294589369076663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8878679636476879d) + "'", double1 == (-0.8878679636476879d));
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33L), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3265.8594322456925d) + "'", double1 == (-3265.8594322456925d));
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.013658701032456458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013658276341614619d + "'", double1 == 0.013658276341614619d);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        long long1 = org.apache.commons.math.util.FastMath.round(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        double double2 = org.apache.commons.math.util.FastMath.max(1.566249314920251d, 1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.566249314920251d + "'", double2 == 1.566249314920251d);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.97562998182887d) + "'", double1 == (-0.97562998182887d));
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        double double2 = org.apache.commons.math.util.FastMath.max(0.25320738314893254d, 0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8482836399575129d + "'", double2 == 0.8482836399575129d);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        double double1 = org.apache.commons.math.util.FastMath.tan(57.298091261946645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9305202046730568d + "'", double1 == 0.9305202046730568d);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4857089771942523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6649659815242346d) + "'", double1 == (-0.6649659815242346d));
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9406268191575922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.061208797058628805d) + "'", double1 == (-0.061208797058628805d));
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.4855215610041086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08517145339109096d + "'", double1 == 0.08517145339109096d);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.018489475704365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.258039429329131d + "'", double1 == 3.258039429329131d);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9652889733989565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6255462598880301d + "'", double1 == 1.6255462598880301d);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.984871312738818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9047914215655611d) + "'", double1 == (-0.9047914215655611d));
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8000000000000002d + "'", double1 == 0.8000000000000002d);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.11038158952253177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.324399215586538d + "'", double1 == 6.324399215586538d);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9067898571222959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2966288756752378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7523615947576159d + "'", double1 == 0.7523615947576159d);
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        float float2 = org.apache.commons.math.util.FastMath.max(33.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.5405025668761214d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.076738876852442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03624593110524417d + "'", double1 == 0.03624593110524417d);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.872928489116717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0151182431195d + "'", double1 == 50.0151182431195d);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32.843508051844005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        int int2 = org.apache.commons.math.util.FastMath.min(90, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1854652182422676d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7616002858669332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508840476391541d + "'", double1 == 0.6508840476391541d);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0378042825874916d, 1.433759246577862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0378042825874918d + "'", double2 == 1.0378042825874918d);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.158638853279166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.98437118343892d + "'", double1 == 31.98437118343892d);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6229473377768496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01087248211073928d) + "'", double1 == (-0.01087248211073928d));
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9977958852759198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1718029187786896d) + "'", double1 == (-1.1718029187786896d));
    }
}

