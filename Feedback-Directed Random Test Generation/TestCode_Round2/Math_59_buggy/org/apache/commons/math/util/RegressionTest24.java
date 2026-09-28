package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

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
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.291220159807248E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.04031271692589d + "'", double1 == 19.04031271692589d);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4753113860041604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1151032144377384d + "'", double1 == 1.1151032144377384d);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6441818891668628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2147601540744177d + "'", double1 == 1.2147601540744177d);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        double double1 = org.apache.commons.math.util.FastMath.acosh(23.039708058408028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.82989504995974d + "'", double1 == 3.82989504995974d);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.05934737555189802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.059277846412015854d + "'", double1 == 0.059277846412015854d);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.478611141177217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07816651033004303d) + "'", double1 == (-0.07816651033004303d));
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4691170499217469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4345105648245638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4218838186996079d + "'", double1 == 0.4218838186996079d);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1503666979359498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0026243939643340857d) + "'", double1 == (-0.0026243939643340857d));
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5151448119299741d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008990973092745012d) + "'", double1 == (-0.008990973092745012d));
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14560850479387782d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182818284590455d + "'", double2 == 2.7182818284590455d);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8547036332233621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2897566425056353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.89761221453621d + "'", double1 == 73.89761221453621d);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.549535562644912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9976936561661449d + "'", double1 == 0.9976936561661449d);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5148963642116557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.548949668431059d + "'", double1 == 4.548949668431059d);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.31226337743157023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7317887661991493d + "'", double1 == 0.7317887661991493d);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5430806348152435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 6013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4614395203971036d, 0.005402944196258899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402944196258899d + "'", double2 == 0.005402944196258899d);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.1694228248157563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-67.00299232820947d) + "'", double1 == (-67.00299232820947d));
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(46.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.30685281944006d + "'", double1 == 46.30685281944006d);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.944180385331819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9716894490174415d + "'", double1 == 0.9716894490174415d);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.41085053990380177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43564278933290035d + "'", double1 == 0.43564278933290035d);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2836621854632254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00495083909973608d + "'", double1 == 0.00495083909973608d);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1283791160097205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12909145401957944d) + "'", double1 == (-0.12909145401957944d));
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7720875399559285d, 31.30685281944008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024656936000432148d + "'", double2 == 0.024656936000432148d);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        double double2 = org.apache.commons.math.util.FastMath.min(2.4332738559053477d, 1.5517788711824279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5517788711824279d + "'", double2 == 1.5517788711824279d);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7950781550795927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        double double2 = org.apache.commons.math.util.FastMath.min(2.0096164144597455d, 0.45869279545028524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.45869279545028524d + "'", double2 == 0.45869279545028524d);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5664325882614676d, (-0.12796368962740468d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.944187786814786d + "'", double2 == 0.944187786814786d);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4658506161222316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.331225884386796d + "'", double1 == 4.331225884386796d);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(120.42757201625034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.42757201625035d + "'", double1 == 120.42757201625035d);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8939092695313958d, 2979.3805346802797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8939092695313958d + "'", double2 == 0.8939092695313958d);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01649118258835379d, 1.405819438223506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.405819438223506d + "'", double2 == 1.405819438223506d);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.457061651952349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.106283780211016d + "'", double1 == 1.106283780211016d);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6904229025850541d + "'", double1 == 0.6904229025850541d);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.00936323361755153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00936296000659807d) + "'", double1 == (-0.00936296000659807d));
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        double double1 = org.apache.commons.math.util.FastMath.abs(88.36342295838328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.36342295838328d + "'", double1 == 88.36342295838328d);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        int int2 = org.apache.commons.math.util.FastMath.max(71, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        long long1 = org.apache.commons.math.util.FastMath.abs(802L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 802L + "'", long1 == 802L);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.948147847987199E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.781639158231253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.977854870808778d + "'", double1 == 0.977854870808778d);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.005202401830118581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079904094734795E-5d + "'", double1 == 9.079904094734795E-5d);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        double double1 = org.apache.commons.math.util.FastMath.tan(39.71440790938188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.099564408481614d) + "'", double1 == (-2.099564408481614d));
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6612716408007345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17962010198654416d) + "'", double1 == (-0.17962010198654416d));
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.120226499004344d + "'", double1 == 1.120226499004344d);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5729063682998855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7734137622334676d + "'", double1 == 1.7734137622334676d);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        double double2 = org.apache.commons.math.util.FastMath.pow((-466.0d), 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.814498792732607E258d) + "'", double2 == (-6.814498792732607E258d));
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8626451474962336E-9d + "'", double1 == 1.8626451474962336E-9d);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.239326967783478d + "'", double1 == 12.239326967783478d);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.5341459860801647d, (-0.460285399369799d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6518117677881824d + "'", double2 == 0.6518117677881824d);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9441803853319909d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5549716497484685d + "'", double1 == 2.5549716497484685d);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8925588891839019d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4343711054302433d) + "'", double1 == (-1.4343711054302433d));
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4364668701002334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2107461918092115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0056728824661278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01755230299705588d + "'", double1 == 0.01755230299705588d);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.580829006249046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.845540075417947d + "'", double1 == 1.845540075417947d);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4440807867778165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4440807867778164d) + "'", double1 == (-0.4440807867778164d));
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        int int2 = org.apache.commons.math.util.FastMath.max(17, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.49724292869339315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4036253692882953d + "'", double1 == 0.4036253692882953d);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5888449716910757d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.142563876395169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8409458341004288d + "'", double1 == 0.8409458341004288d);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22026.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 29L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6487252814968991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.274528205402796d + "'", double1 == 1.274528205402796d);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7688894800973336d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.17589803024473025d, 0.08421862328573278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17589803024473022d + "'", double2 == 0.17589803024473022d);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6297804583695628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6722448354534546d + "'", double1 == 0.6722448354534546d);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5857545646094631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5348544088640951d) + "'", double1 == (-0.5348544088640951d));
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        float float2 = org.apache.commons.math.util.FastMath.min(11014.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0176064912058518d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9969953215678267d, (-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2509916761758584d + "'", double2 == 2.2509916761758584d);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.1690152019850792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9203659307095967d) + "'", double1 == (-0.9203659307095967d));
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-5.220801521793461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-92.538534636487d) + "'", double1 == (-92.538534636487d));
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7099759466766968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9366445920399753d + "'", double1 == 0.9366445920399753d);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        int int2 = org.apache.commons.math.util.FastMath.min(17, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.05663520630914342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056604934487285374d + "'", double1 == 0.056604934487285374d);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03958249199032516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03959282893446271d + "'", double1 == 0.03959282893446271d);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5467447399008167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5199092753895171d + "'", double1 == 0.5199092753895171d);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.686587405821238d + "'", double1 == 0.686587405821238d);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6698223371050964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02914389770583061d + "'", double1 == 0.02914389770583061d);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        double double1 = org.apache.commons.math.util.FastMath.floor(13.188688139030402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7486778430423748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8942185941087609d, (-0.7538347920505799d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8942185941087608d + "'", double2 == 0.8942185941087608d);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7480575296890003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.16409640061781955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        double double1 = org.apache.commons.math.util.FastMath.acosh(51.53397022115522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.635294238064854d + "'", double1 == 4.635294238064854d);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8250752499738025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.282052483257919d + "'", double1 == 2.282052483257919d);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0533450212094795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8672260268709622d + "'", double1 == 1.8672260268709622d);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.009213268488716318d), 2.0301927663008446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009213268488716316d) + "'", double2 == (-0.009213268488716316d));
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.310832494432086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.1051695795645d + "'", double1 == 75.1051695795645d);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.00952889605982097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529184477772738d + "'", double1 == 0.009529184477772738d);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4580499354808867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.458049935480887d + "'", double1 == 1.458049935480887d);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6014946556761336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.379423030041176d + "'", double1 == 2.379423030041176d);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        double double1 = org.apache.commons.math.util.FastMath.acos(55.273280124121555d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        double double1 = org.apache.commons.math.util.FastMath.cos(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.480272527447467d, 0.06263110323617974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5285110256002687d + "'", double2 == 1.5285110256002687d);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5362901735522732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9006667358439738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9006667358439738d + "'", double1 == 0.9006667358439738d);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        double double2 = org.apache.commons.math.util.FastMath.min(8.057764839327667E-23d, 1.231057343412815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.057764839327667E-23d + "'", double2 == 8.057764839327667E-23d);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 4.518030890222253E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.3582216239154814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8325451219316486d + "'", double1 == 1.8325451219316486d);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.3502502963739158E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023812487246836846d) + "'", double1 == (-0.023812487246836846d));
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1972245773362196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        double double2 = org.apache.commons.math.util.FastMath.min(0.23018603204480417d, 1.1877181244729045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23018603204480417d + "'", double2 == 0.23018603204480417d);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.07969186436297289d), 1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080678E43d + "'", double2 == 1.3440585709080678E43d);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5319282579302229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2741469377914957d) + "'", double1 == (-0.2741469377914957d));
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        double double1 = org.apache.commons.math.util.FastMath.cos(48.153426409720026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.515216056997717d) + "'", double1 == (-0.515216056997717d));
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.128438542496736d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8089563172728975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7406028079520919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7626821172682914d + "'", double1 == 2.7626821172682914d);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9992976909856272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03748042785501257d + "'", double1 == 0.03748042785501257d);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.197999443548337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096721148490316d + "'", double1 == 0.8096721148490316d);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0190724274822965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(76.73862422940537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2495016574510105d + "'", double1 == 4.2495016574510105d);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        double double1 = org.apache.commons.math.util.FastMath.asinh(40.6686938236807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.398756903216956d + "'", double1 == 4.398756903216956d);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.095563752817182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.026789739363150215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003588665297165d + "'", double1 == 1.0003588665297165d);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5729063682998855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6047647812819544d + "'", double1 == 0.6047647812819544d);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.07352194555034251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.0052823489951d), 0.834514805034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.005282348995099d) + "'", double2 == (-4.005282348995099d));
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7330860214110332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9353662484229944d + "'", double1 == 0.9353662484229944d);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.09247351917780995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        double double2 = org.apache.commons.math.util.FastMath.min(6.466743204778643d, (-4.041914822914973d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.041914822914973d) + "'", double2 == (-4.041914822914973d));
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        float float2 = org.apache.commons.math.util.FastMath.max(37.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0061896131712864556d, 1.120226499004344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0033586360328177363d + "'", double2 == 0.0033586360328177363d);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.37072378740163d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2316777559563157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        double double1 = org.apache.commons.math.util.FastMath.sinh(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0405312203410338E16d + "'", double1 == 1.0405312203410338E16d);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7480575296890003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2930884003786862d + "'", double1 == 1.2930884003786862d);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9699398265477828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9898778295481812d + "'", double1 == 0.9898778295481812d);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.18564763581321805d, 1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1830277020859743d + "'", double2 == 0.1830277020859743d);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4239994887637555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8112385339895775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20919314482078918d) + "'", double1 == (-0.20919314482078918d));
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        long long1 = org.apache.commons.math.util.FastMath.round(5.990944299844879d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8939966636005577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2966743308943072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.962663245958902d + "'", double1 == 0.962663245958902d);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(10.000069652443239d, 2097152.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.00006965244324d + "'", double2 == 10.00006965244324d);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        long long1 = org.apache.commons.math.util.FastMath.round(25.998515216396303d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1294589369076663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13018704579946147d + "'", double1 == 0.13018704579946147d);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.998998620741038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.012055005199484565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999273393047667d + "'", double1 == 0.9999273393047667d);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5451804579148973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001784685517717d + "'", double1 == 1.001784685517717d);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4051.541902082797d + "'", double1 == 4051.541902082797d);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2897566425056355d, (-0.469482074719316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2897566425056353d + "'", double2 == 1.2897566425056353d);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6888366918779438d) + "'", double1 == (-0.6888366918779438d));
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9735760889955917d, 0.07352180207555892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9735760889955916d + "'", double2 == 0.9735760889955916d);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.012055005199484565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1039953207604149E-4d + "'", double1 == 2.1039953207604149E-4d);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5736534520715902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5427042853305813d + "'", double1 == 0.5427042853305813d);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9816204068070169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3787745970092955d + "'", double1 == 1.3787745970092955d);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5982251431131133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5497865631280039d + "'", double1 == 0.5497865631280039d);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.187482763357499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9848155403163146d) + "'", double1 == (-0.9848155403163146d));
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.10955796484928033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0060074791812659d + "'", double1 == 1.0060074791812659d);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.7162978893146719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        double double1 = org.apache.commons.math.util.FastMath.acos(27.289917197127757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.015626271752052213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5551694190348233d + "'", double1 == 1.5551694190348233d);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6682015101903132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8074867794251602d) + "'", double1 == (-0.8074867794251602d));
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        double double1 = org.apache.commons.math.util.FastMath.sin(19099.184266826574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9917845908123722d) + "'", double1 == (-0.9917845908123722d));
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0915250460768902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 71, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9451107533364372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8105618017949228d) + "'", double1 == (-0.8105618017949228d));
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03927547481280819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03926538433371611d + "'", double1 == 0.03926538433371611d);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5400056540554331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5167047988170517d + "'", double1 == 0.5167047988170517d);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1341027206718943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1790802230737255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7199213999449399d) + "'", double1 == (-1.7199213999449399d));
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.005202425297685839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0052159814102006d + "'", double1 == 1.0052159814102006d);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3537352837904361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.26753882605443d + "'", double1 == 20.26753882605443d);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.10634503779918675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10088563389260032d) + "'", double1 == (-0.10088563389260032d));
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.47765433426214554d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8880756611890623d + "'", double1 == 0.8880756611890623d);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.7367464541147153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.13497831075872602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13538854917865029d + "'", double1 == 0.13538854917865029d);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2352049125074824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-5L), (-33.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7943809778600359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        double double1 = org.apache.commons.math.util.FastMath.asin(5730.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5925886082396253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086642840591758d + "'", double1 == 1.8086642840591758d);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5274728362673279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8640818794988373d + "'", double1 == 0.8640818794988373d);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        double double1 = org.apache.commons.math.util.FastMath.signum(275.9683197201996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0281434657352284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6582608008173365d + "'", double1 == 1.6582608008173365d);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4345105648245638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.011405449524645117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10679629920856396d + "'", double1 == 0.10679629920856396d);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5284616441409065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9101609705753021d) + "'", double1 == (-0.9101609705753021d));
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.855146420814098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.376981373151548d + "'", double1 == 17.376981373151548d);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(97.00000000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207041d + "'", double1 == 4.594700892207041d);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.772695717397461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013486084384645325d) + "'", double1 == (-0.013486084384645325d));
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032519d + "'", double1 == 43.42944819032519d);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.007857730892738682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        double double2 = org.apache.commons.math.util.FastMath.max(4.423938653542384d, 1.0320977775721407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.423938653542384d + "'", double2 == 4.423938653542384d);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.33599401026596143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4736684646685712d) + "'", double1 == (-0.4736684646685712d));
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5515060405847224d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8460294791347751d, 1.0157829411440935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.694473107001779d + "'", double2 == 0.694473107001779d);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        long long1 = org.apache.commons.math.util.FastMath.abs(2979L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5713088006770572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5245506190419055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5489390506012609d) + "'", double1 == (-0.5489390506012609d));
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.170113421798433d) + "'", double1 == (-31.170113421798433d));
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.02586747778105082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025867477781050825d + "'", double1 == 0.025867477781050825d);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        double double1 = org.apache.commons.math.util.FastMath.sin(97.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37960773902748224d + "'", double1 == 0.37960773902748224d);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.29155717484956145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(257.19381419176113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 257.1938141917612d + "'", double1 == 257.1938141917612d);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.694290324463072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0022875950823242d + "'", double1 == 1.0022875950823242d);
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        double double1 = org.apache.commons.math.util.FastMath.acos((-9.722238707046217E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.571768550818762d + "'", double1 == 1.571768550818762d);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3594649189632695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3672564664934867d + "'", double1 == 0.3672564664934867d);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9403224593445607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0851525736489815d) + "'", double1 == (-1.0851525736489815d));
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.001697419855619805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016974190405101815d + "'", double1 == 0.0016974190405101815d);
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.8340465493115374E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6079788782430797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1905827885947613d + "'", double1 == 1.1905827885947613d);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        double double1 = org.apache.commons.math.util.FastMath.cosh(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.005656852264782563d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        double double1 = org.apache.commons.math.util.FastMath.rint((-43.19155203462028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.0d) + "'", double1 == (-43.0d));
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.963905663126391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8069702060688517d + "'", double1 == 1.8069702060688517d);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.06773161457158877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06767983917713637d) + "'", double1 == (-0.06767983917713637d));
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7674333530483114d + "'", double1 == 0.7674333530483114d);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9802576824651943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1449642569142922d + "'", double1 == 1.1449642569142922d);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        long long2 = org.apache.commons.math.util.FastMath.max(26L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.19616193913956d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        int int2 = org.apache.commons.math.util.FastMath.min(33, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02626982285800363d, (-0.005302331860359104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005302331860359104d) + "'", double2 == (-0.005302331860359104d));
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.014438678988775109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8939966636005579d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011535675582d + "'", double1 == 1.8163011535675582d);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6719990366730106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719990366730108d + "'", double1 == 0.6719990366730108d);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.016996106527921995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016852487515153763d) + "'", double1 == (-0.016852487515153763d));
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        double double1 = org.apache.commons.math.util.FastMath.floor((-33.71296437329639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.0d) + "'", double1 == (-34.0d));
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21446015940491509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21284933075406728d + "'", double1 == 0.21284933075406728d);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 71, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.13381059201667d), 1.055680642428974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.13381059201667d) + "'", double2 == (-2.13381059201667d));
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-466.4266135928925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.838249024841735d) + "'", double1 == (-6.838249024841735d));
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 26L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8941553469910031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.713440075526582d + "'", double1 == 0.713440075526582d);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6148957975355112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.661307374317772d + "'", double1 == 22.661307374317772d);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3080927484239062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9847235026260124d + "'", double1 == 1.9847235026260124d);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.085665678873702E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.085665678873264E-7d + "'", double1 == 5.085665678873264E-7d);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7620196544019282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1415888340962679d), 0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2968626891319997d) + "'", double2 == (-0.2968626891319997d));
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7073875782300506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7600621509746883d + "'", double1 == 0.7600621509746883d);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.4106097927876521d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.747031677944916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18757108759626964d + "'", double1 == 0.18757108759626964d);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.05551920829688d, 1.6038473373858848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2635928263636012d + "'", double2 == 1.2635928263636012d);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.030429149482917455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.516710186322011d) + "'", double1 == (-1.516710186322011d));
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.060942605739583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060942605739583d + "'", double1 == 0.060942605739583d);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 90L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.830640877860784d, 1.3963472835230404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7717435000389646d + "'", double2 == 0.7717435000389646d);
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.44278822716643d, 1.5596856728972892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.00255805722183d + "'", double2 == 1.00255805722183d);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01574435112081428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.151273637039934d) + "'", double1 == (-4.151273637039934d));
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3594649189632695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35946491896326954d + "'", double1 == 0.35946491896326954d);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9999999999999996d, 2.334466355854698E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999996d + "'", double2 == 1.9999999999999996d);
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.016852487515153763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01671127870011256d) + "'", double1 == (-0.01671127870011256d));
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.7966660362236415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        int int2 = org.apache.commons.math.util.FastMath.min(29, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5404195002705842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8145361005682599d + "'", double1 == 0.8145361005682599d);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        double double1 = org.apache.commons.math.util.FastMath.log(2.181747322616968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7801260798882919d + "'", double1 == 0.7801260798882919d);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5631041023265138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.773616063672105d + "'", double1 == 3.773616063672105d);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.638566441559658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2144640561045415d + "'", double1 == 0.2144640561045415d);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 33.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.359770220129362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7112272763732647d + "'", double1 == 0.7112272763732647d);
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.07695912379014387d, 1.333055186303952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07695912379014389d + "'", double2 == 0.07695912379014389d);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 37, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2230962529739251E283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2230962529739251E283d + "'", double1 == 1.2230962529739251E283d);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7355666122507827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9049926100365969d + "'", double1 == 0.9049926100365969d);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.015174618802134707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.012208349338536975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012208046095758495d) + "'", double1 == (-0.012208046095758495d));
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6935247302816968d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573781157848E-5d + "'", double1 == 9.079573781157848E-5d);
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        int int1 = org.apache.commons.math.util.FastMath.round(802.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 802 + "'", int1 == 802);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1312.6929859424647d + "'", double1 == 1312.6929859424647d);
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6046661120266558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8456134392380273d + "'", double1 == 0.8456134392380273d);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6088194853164001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1911263529634042d + "'", double1 == 1.1911263529634042d);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.5284616441409065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9991040211506196d) + "'", double1 == (-0.9991040211506196d));
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        double double2 = org.apache.commons.math.util.FastMath.min(0.014352477285206713d, (-4.390055938922822d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.390055938922822d) + "'", double2 == (-4.390055938922822d));
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9234560495448352d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(40.6686938236807d, (-27.876349504902667d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.66869382368069d + "'", double2 == 40.66869382368069d);
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.1349059180212415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8092783730642492d + "'", double1 == 1.8092783730642492d);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.04417790591315649d), (-34.27577589899106d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04417790591315649d) + "'", double2 == (-0.04417790591315649d));
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04646023281402976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046460232814029764d + "'", double1 == 0.046460232814029764d);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        double double2 = org.apache.commons.math.util.FastMath.max(2.09927770074216d, 1.5707055310567108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.09927770074216d + "'", double2 == 2.09927770074216d);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9615319455195346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9615319455195346d + "'", double1 == 1.9615319455195346d);
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.011871560217519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0059182671656375d + "'", double1 == 1.0059182671656375d);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.8078463628702286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9927458330425835d + "'", double1 == 0.9927458330425835d);
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0054029704834161855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07350490108432352d + "'", double1 == 0.07350490108432352d);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.211942326299679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0277580097816033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23507672831863546d + "'", double1 == 0.23507672831863546d);
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.025881092186968428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025881092186968428d + "'", double1 == 0.025881092186968428d);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        float float2 = org.apache.commons.math.util.FastMath.min(90.0f, 6013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0017927433227146066d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2091797289097923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.985115626221791d + "'", double1 == 11.985115626221791d);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.036716079445307026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5340719930307432d + "'", double1 == 1.5340719930307432d);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4109688618214138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1216029507724143d + "'", double1 == 1.1216029507724143d);
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7523615947576159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9360173509972305d + "'", double1 == 0.9360173509972305d);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9202997082519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9202997082519614d + "'", double1 == 0.9202997082519614d);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.2343247169751904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-23.60718109841417d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45204159659775767d + "'", double1 == 0.45204159659775767d);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.786749131547214d + "'", double1 == 0.786749131547214d);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(100.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5769.292359335709d + "'", double1 == 5769.292359335709d);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        int int2 = org.apache.commons.math.util.FastMath.max(34, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 29L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1047531783421872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9798327911250778d) + "'", double1 == (-0.9798327911250778d));
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        int int2 = org.apache.commons.math.util.FastMath.max(33, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8337177321043896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2002069896618364d + "'", double1 == 1.2002069896618364d);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7466222644566186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.5679543875799386E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.97258441441911E15d + "'", double1 == 7.97258441441911E15d);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 17, 108.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.520482796722225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.349570768613328d + "'", double1 == 2.349570768613328d);
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6848167883550323d), (-5156.620156177408d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6848167883550325d) + "'", double2 == (-0.6848167883550325d));
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9736862425967708d, 5.438670546795531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.438670546795531d + "'", double2 == 5.438670546795531d);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.23507672831863546d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.427548195562127E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.427548195562127E-46d + "'", double1 == 3.427548195562127E-46d);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.46143952039710356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4779901901401122d + "'", double1 == 0.4779901901401122d);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1493706264193658d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14937062641936577d + "'", double2 == 0.14937062641936577d);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1003.8247302299309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.49901183053376447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1271115852042126d + "'", double1 == 1.1271115852042126d);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.21670660727375085d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5219877681494083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5219877681494085d + "'", double1 == 1.5219877681494085d);
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015185626807227555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2966743308943072d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-12.806875836617005d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999972581449377d) + "'", double1 == (-0.9999972581449377d));
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.7479348885580097d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9179704868072519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        double double1 = org.apache.commons.math.util.FastMath.tan(22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2450341739723718d) + "'", double1 == (-0.2450341739723718d));
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.29807701278948945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2938306732305204d + "'", double1 == 0.2938306732305204d);
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.080810485818935E-5d, 0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.336581798015843E-4d + "'", double2 == 2.336581798015843E-4d);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2501983752875385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, (long) 29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.701845363548474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 33.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5445234815150057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4691170499217469d, 0.9410715221203457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4691170499217469d + "'", double2 == 0.4691170499217469d);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26L, 802.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 802.0f + "'", float2 == 802.0f);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.969616689786745E-17d + "'", double1 == 4.969616689786745E-17d);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        double double1 = org.apache.commons.math.util.FastMath.rint((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-5.174738283267841E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.174738283290936E-6d) + "'", double1 == (-5.174738283290936E-6d));
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9951899344229606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1017337E7d, (-0.6098494453571868d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6098494453571868d) + "'", double2 == (-0.6098494453571868d));
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.03993552504819818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03991430824350931d + "'", double1 == 0.03991430824350931d);
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.004363724684235064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0043637108352784365d + "'", double1 == 0.0043637108352784365d);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6516488549852542E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.21791772061627d + "'", double1 == 98.21791772061627d);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.15254772534412783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.42581659714188025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42581659714188025d + "'", double1 == 0.42581659714188025d);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.161865024476282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.195888131002834d + "'", double1 == 3.195888131002834d);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2707236083120753E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2707236083120753E31d + "'", double1 == 1.2707236083120753E31d);
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        double double2 = org.apache.commons.math.util.FastMath.atan2(120.42757201625032d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 9, 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6672440571753369d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5892817163115238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.129783033680656d + "'", double1 == 6.129783033680656d);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5126873628972832d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2020197576001874d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        int int2 = org.apache.commons.math.util.FastMath.min(29, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        double double1 = org.apache.commons.math.util.FastMath.cos(114.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6195206125592099d + "'", double1 == 0.6195206125592099d);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.432748222320811d), 0.9872136726111863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1852984026857394d) + "'", double2 == (-1.1852984026857394d));
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.10178798778736835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0051848715264704d + "'", double1 == 1.0051848715264704d);
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8416476040596701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7648602883992974d + "'", double1 == 0.7648602883992974d);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1124593530822633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11198882333509497d) + "'", double1 == (-0.11198882333509497d));
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6932565044940331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2500820004205557d + "'", double1 == 1.2500820004205557d);
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.51029328814076E14d + "'", double1 == 8.51029328814076E14d);
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0876054358307137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08397843176912599d + "'", double1 == 0.08397843176912599d);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7220779054888641d, 0.4204193151348753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0435414563457697d + "'", double2 == 1.0435414563457697d);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0001522971108041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854743061545423d + "'", double1 == 0.7854743061545423d);
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.728786708005704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.314295031872359d + "'", double1 == 15.314295031872359d);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.017453292519943424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0174541787375853d + "'", double1 == 0.0174541787375853d);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        double double1 = org.apache.commons.math.util.FastMath.log(2.833213344056216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0414115247747806d + "'", double1 == 1.0414115247747806d);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1447298858494002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0653122583386827d, 1.4254875655208386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0943796633992329d + "'", double2 == 1.0943796633992329d);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7182649593784625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6675656024765805d + "'", double1 == 0.6675656024765805d);
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(55.273280124121555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3166.925670956504d + "'", double1 == 3166.925670956504d);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09506557725167404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0219767103592319d) + "'", double1 == (-1.0219767103592319d));
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1304751349378549d, 1.557407668450882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13047513493785493d + "'", double2 == 0.13047513493785493d);
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.34501162170677324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46216627548292055d) + "'", double1 == (-0.46216627548292055d));
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.9871243512413317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4401832893044155d + "'", double1 == 1.4401832893044155d);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4960691053839213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008658039206372157d) + "'", double1 == (-0.008658039206372157d));
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013657427094607013d + "'", double1 == 0.013657427094607013d);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6852301231749561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011959521783249286d) + "'", double1 == (-0.011959521783249286d));
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000071526246055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615971598582109d + "'", double1 == 0.7615971598582109d);
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.055680642428974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-43.0d), (-0.04566767881511902d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5718583654378082d) + "'", double2 == (-1.5718583654378082d));
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        float float2 = org.apache.commons.math.util.FastMath.max((-90.0f), 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2534690753051354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1531434799809943d + "'", double1 == 1.1531434799809943d);
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        long long2 = org.apache.commons.math.util.FastMath.min((-5L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7831804032231446d), 1.6811676665524076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7831804032231446d) + "'", double2 == (-0.7831804032231446d));
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4205343352839652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40824829046386313d + "'", double1 == 0.40824829046386313d);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-15.35252977886304d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2325353.429881668d + "'", double1 == 2325353.429881668d);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5022376695662525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0446117799198393d + "'", double1 == 1.0446117799198393d);
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(15.712381921440457d, 1.5707963267948868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.712381921440455d + "'", double2 == 15.712381921440455d);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.940021456376382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6626990330019014d + "'", double1 == 0.6626990330019014d);
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.44341522934086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2848221021388184d + "'", double1 == 3.2848221021388184d);
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6013, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6013L + "'", long2 == 6013L);
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6013, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6099535495393804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7809952301642952d + "'", double1 == 0.7809952301642952d);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5695861191798108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.804659225904596d + "'", double1 == 4.804659225904596d);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3166.925670956504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.197999443548337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.993222846126381d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9260406133217521d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.079986049317652E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-46.772927173523236d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.2924014765439716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6637326581866334d + "'", double1 == 0.6637326581866334d);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3963472835230404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1816713940529493d + "'", double1 == 1.1816713940529493d);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8882087680867928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6642279537135205d + "'", double1 == 2.6642279537135205d);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6983819079412873d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8895257804916457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8010612089693027d) + "'", double1 == (-0.8010612089693027d));
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9970401079464968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5473150540209468d + "'", double1 == 1.5473150540209468d);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9184948618572503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.62587908887202d + "'", double1 == 52.62587908887202d);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2493184782545368d, 0.9683274362856896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9683274362856896d + "'", double2 == 0.9683274362856896d);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9034600343951873d + "'", double1 == 0.9034600343951873d);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        double double1 = org.apache.commons.math.util.FastMath.acosh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.69310177908424d + "'", double1 == 10.69310177908424d);
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8705409696704832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7162989434194544d + "'", double1 == 0.7162989434194544d);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02089234154942062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020677089498930153d + "'", double1 == 0.020677089498930153d);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8103.083927575384d + "'", double1 == 8103.083927575384d);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0474759092521686d + "'", double1 == 3.0474759092521686d);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.17366404762497195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1896558309763048d + "'", double1 == 1.1896558309763048d);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.332682002166082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23587057680833456d + "'", double1 == 0.23587057680833456d);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.414477459402565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.545572587350129d + "'", double1 == 2.545572587350129d);
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.22638463320826d, 1.6532184445134213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.401261840271627d + "'", double2 == 1.401261840271627d);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5615628962569676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4456871763130682d + "'", double1 == 0.4456871763130682d);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.017454178629595106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5882513917771335d + "'", double1 == 1.5882513917771335d);
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.51848940392213184E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9368575217759323d + "'", double1 == 0.9368575217759323d);
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2587612362107516d, 2.6667125839021377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2587612362107516d + "'", double2 == 1.2587612362107516d);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.986075506374595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.80779419342187d + "'", double1 == 19.80779419342187d);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.007420927433301355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        double double1 = org.apache.commons.math.util.FastMath.acos(227.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8361528200478593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5574077246549018d), 1.4610626787992866d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794411714424d + "'", double1 == 0.3678794411714424d);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.032588422537025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7136829325606209d + "'", double1 == 1.7136829325606209d);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.000000000000254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805600723d + "'", double1 == 0.6931471805600723d);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0437346740099507d + "'", double1 == 1.0437346740099507d);
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.24377959524211273d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21633966230316995d) + "'", double1 == (-0.21633966230316995d));
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6207831908859206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.240537625891841d + "'", double1 == 2.240537625891841d);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6735761908999143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7980915852291232d) + "'", double1 == (-0.7980915852291232d));
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6156614753256583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 29.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        double double1 = org.apache.commons.math.util.FastMath.sin((-6.470817953541134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18653361663230011d) + "'", double1 == (-0.18653361663230011d));
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3423042232497897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

