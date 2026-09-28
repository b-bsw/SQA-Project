package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.49495711583675E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4949571158367E13d + "'", double1 == 8.4949571158367E13d);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        double double2 = org.apache.commons.math3.util.FastMath.log(1580072.847490559d, (-6.39599474488673E7d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3234889800848443E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3099240316342194E-25d + "'", double1 == 2.3099240316342194E-25d);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0794415416798357d + "'", double1 == 2.0794415416798357d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.569820717348332d, 0.9612687236353933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3527167299224545d) + "'", double2 == (-0.3527167299224545d));
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.015625002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.015625004f + "'", float1 == 0.015625004f);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0037447732267826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037447732267826d + "'", double1 == 1.0037447732267826d);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.06413302264162797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6349733946709988d + "'", double1 == 1.6349733946709988d);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.2124675420131484E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2124675420131484E28d + "'", double1 == 2.2124675420131484E28d);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1612231530729575d, 1.0000030776922988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1612231530729573d + "'", double2 == 1.1612231530729573d);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-13.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.0d) + "'", double1 == (-13.0d));
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18838862103418857d + "'", double1 == 0.18838862103418857d);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448717228631246E-4d + "'", double1 == 8.448717228631246E-4d);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.8211864E-34f, 0.04402615488638885d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8211867E-34f + "'", float2 == 2.8211867E-34f);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        double double1 = org.apache.commons.math3.util.FastMath.log(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1L, 11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2048.0f + "'", float2 == 2048.0f);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7802246589084126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0459445002261154d + "'", double1 == 1.0459445002261154d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(38.75229574078433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6398352529683655d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.615120592379816d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.7182816664368272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913289130029649d + "'", double1 == 0.9913289130029649d);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6077497654366413d + "'", double1 == 1.6077497654366413d);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.585786437626905d), 1.3610195264493026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.585786437626905d + "'", double2 == 0.585786437626905d);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        double double2 = org.apache.commons.math3.util.FastMath.min((-7.0d), 0.9999999935301913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.0d) + "'", double2 == (-7.0d));
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.5065230921350898E254d), 137);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962075856072d + "'", double1 == 1.5707962075856072d);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0000001372850489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403021903467493d + "'", double1 == 0.5403021903467493d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0909305359822086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.656473403698357d + "'", double1 == 1.656473403698357d);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        double double2 = org.apache.commons.math3.util.FastMath.min(12.16264444841069d, 1.389301394574591d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.389301394574591d + "'", double2 == 1.389301394574591d);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.6508801521799592d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.014550758400599708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014551271908370545d + "'", double1 == 0.014551271908370545d);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.4304247186494576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4438388470574063d + "'", double1 == 0.4438388470574063d);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6436097704241932d + "'", double1 == 0.6436097704241932d);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1022.0d) + "'", double1 == (-1022.0d));
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double2 = org.apache.commons.math3.util.FastMath.pow(286.4788975654116d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3862856729793054E49d + "'", double2 == 1.3862856729793054E49d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.09951163E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(126.99999f, (-121));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7772088E-35f + "'", float2 == 4.7772088E-35f);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        double double1 = org.apache.commons.math3.util.FastMath.log(237.68018390304016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.470926004896228d + "'", double1 == 5.470926004896228d);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(8.946190480851357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7677.584358657442d + "'", double1 == 7677.584358657442d);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13192.8407798297d + "'", double1 == 13192.8407798297d);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.14287895626271624d, (-16.628369761528415d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.133000383741253d + "'", double2 == 3.133000383741253d);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9134895772587739d, 4.507682751276436E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9134895772587739d + "'", double2 == 0.9134895772587739d);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1425465430742778d) + "'", double1 == (-0.1425465430742778d));
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.000000005268356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735907448332d + "'", double1 == 0.8813735907448332d);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.5545968900472659d), 2.488074682093421E62d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.229020270326605E-63d) + "'", double2 == (-2.229020270326605E-63d));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-127L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 46);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.1771933557663626E-8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-11));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        double double1 = org.apache.commons.math3.util.FastMath.signum(7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.8199525775350112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5988104444497883d + "'", double1 == 0.5988104444497883d);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.21052320575111E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.210523205751152E-15d + "'", double1 == 9.210523205751152E-15d);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7730812391918281d, 1024.0004882811143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0007801044699d + "'", double2 == 1024.0007801044699d);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.610125138662287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1009.2650913658417d + "'", double1 == 1009.2650913658417d);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-0.06243896f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06252029346191121d) + "'", double1 == (-0.06252029346191121d));
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14254678633741552d) + "'", double1 == (-0.14254678633741552d));
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        double double2 = org.apache.commons.math3.util.FastMath.min(8.699514748210191d, 0.35232069507293856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35232069507293856d + "'", double2 == 0.35232069507293856d);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.22850376359397642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22652043378197598d + "'", double1 == 0.22652043378197598d);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-4.999750018744576E-5d), 10.079368399158986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.999750018744576E-5d) + "'", double2 == (-4.999750018744576E-5d));
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.990700744648233d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1023.99994f), 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.99994f) + "'", float2 == (-1023.99994f));
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.271684935418713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2716849354187132d + "'", double1 == 1.2716849354187132d);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020907704486165288d + "'", double1 == 0.020907704486165288d);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(127.0f, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4161536.0f + "'", float2 == 4161536.0f);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8865094960340845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1024.0496050813779d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1024.0d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1023.9999999999999d) + "'", double2 == (-1023.9999999999999d));
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.24034274195624494d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-5));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.506934503488869d, (-0.971286084435162d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.68851581036831d + "'", double2 == 2.68851581036831d);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.000015f, (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.000015f) + "'", float2 == (-100.000015f));
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.933423025730715d + "'", double1 == 6.933423025730715d);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1920929665620893E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 106L, 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 149, 0.15972740774199012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02567142327678562d) + "'", double2 == (-0.02567142327678562d));
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1639304525356293E199d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 661 + "'", int1 == 661);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.335747329235344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8483318952611161d + "'", double1 == 0.8483318952611161d);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double1 = org.apache.commons.math3.util.FastMath.asin(8.946190480851357d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.991641660703783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3132616294189077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11835125533092143d + "'", double1 == 0.11835125533092143d);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6625659571216381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6625659571216382d + "'", double1 == 0.6625659571216382d);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-41.392100454203025d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-63L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62.99999999999999d) + "'", double1 == (-62.99999999999999d));
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.11004516131854963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1025, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1024.0001f, 1.9580333260613905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05130745979471407d) + "'", double2 == (-0.05130745979471407d));
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.8828125E-4f, (float) (-29));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.842385207305781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6110610404570322d + "'", double1 == 0.6110610404570322d);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-127), 7.62364218539641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-126.99999999999999d) + "'", double2 == (-126.99999999999999d));
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.656473403698357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2785394510828827d + "'", double1 == 1.2785394510828827d);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.133000383741253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.21991180375937053d), 2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21991180375937053d + "'", double2 == 0.21991180375937053d);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.184458789852743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.949911109190508d, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7683707192685373d) + "'", double2 == (-0.7683707192685373d));
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 39L, 9.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000001f + "'", float2 == 9.000001f);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698197650709977d + "'", double1 == 1.5698197650709977d);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(89.92360567258659d, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46040.886104364334d + "'", double2 == 46040.886104364334d);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.93496684993349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7025298952542374d + "'", double1 == 1.7025298952542374d);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(12.285091215917852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.981898135071284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9818981350712841d + "'", double1 == 0.9818981350712841d);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52L, (float) (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6806784082777886d, (-0.5872139151569291d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-63.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-63.0d) + "'", double1 == (-63.0d));
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.94875668844129d + "'", double1 == 2.94875668844129d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        float float2 = org.apache.commons.math3.util.FastMath.min(1023.00006f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.327747459134791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36693586126414035d + "'", double1 == 0.36693586126414035d);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8.44871722863096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double1 = org.apache.commons.math3.util.FastMath.abs(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 97L, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5370264E31f + "'", float2 == 1.5370264E31f);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1580072.847490559d, (double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1580072.847490559d + "'", double2 == 1580072.847490559d);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.1558490151737164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.472957530972497d + "'", double1 == 23.472957530972497d);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        double double1 = org.apache.commons.math3.util.FastMath.atan(21481.281039031423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707497746364167d + "'", double1 == 1.5707497746364167d);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.02209708691207961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8566692171513597E-4d + "'", double1 == 3.8566692171513597E-4d);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951163E12f + "'", float1 == 1.09951163E12f);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.2775537824944787d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.49994f, (float) (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2 == (-8.0f));
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6973483401028054d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.0368744E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.19611987703015263d, 572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 572.9578286961271d + "'", double2 == 572.9578286961271d);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0f), 0.015625000000000014d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        int int1 = org.apache.commons.math3.util.FastMath.round(8.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 100.000015f, 2.16227766016838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16745572513813106d + "'", double2 == 0.16745572513813106d);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(375.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 375.0d + "'", double1 == 375.0d);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.02283062218882923d, 37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.137816820747311E9d + "'", double2 == 3.137816820747311E9d);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.02816255926152E-309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.02816255926152E-309d + "'", double1 == 4.02816255926152E-309d);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8573168196649732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.75d, 0.0075707739244519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.75d + "'", double2 == 0.75d);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.6714065E24f, 6000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-8.781516350303278d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.781516350303278d + "'", double1 == 8.781516350303278d);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.07074546404006221d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07337258850386931d) + "'", double1 == (-0.07337258850386931d));
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        double double1 = org.apache.commons.math3.util.FastMath.atan(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.569462994251686d + "'", double1 == 1.569462994251686d);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0536712127723509E-8d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011048543456039806d + "'", double2 == 0.011048543456039806d);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5474252E26f, 2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5474254E26f + "'", float2 == 1.5474254E26f);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        int int2 = org.apache.commons.math3.util.FastMath.min(230, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8659030814983063d, 3.1558490151737164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8659030814983063d + "'", double2 == 0.8659030814983063d);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.0f), 3.813181025133959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.256472782294562d) + "'", double2 == (-0.256472782294562d));
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.99999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.99999994f + "'", float1 == 0.99999994f);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.022834589947065314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023097294972507593d + "'", double1 == 0.023097294972507593d);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.641588833612779d, 8.918828546453101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.64158883361278d + "'", double2 == 4.64158883361278d);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 2.19902312E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.0f, 1.588250504492026d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.882812208961696E-4d, 1.2260986406399412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9823973283939967E-4d + "'", double2 == 3.9823973283939967E-4d);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013707783890401887d + "'", double1 == 0.013707783890401887d);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.8828120149361966E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.884004301644022E-4d + "'", double1 == 4.884004301644022E-4d);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3072, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.506934503488869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2547422950466232d + "'", double1 == 1.2547422950466232d);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1920929E-7f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.938659142988208d, 97.0009698887435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.938659142988208d + "'", double2 == 0.938659142988208d);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        int int1 = org.apache.commons.math3.util.FastMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        double double1 = org.apache.commons.math3.util.FastMath.log((-205.9115765284781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5597692393574885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5941072954913211d + "'", double1 == 0.5941072954913211d);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.70805020110221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9074833044665938d) + "'", double1 == (-0.9074833044665938d));
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5492548965142435d, 108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108.43633988276744d + "'", double2 == 108.43633988276744d);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6000, (long) 86);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6000L + "'", long2 == 6000L);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.2716849354187132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10437952659709444d + "'", double1 == 0.10437952659709444d);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0842022E-19f, 7.0368744E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842022E-19f + "'", float2 == 1.0842022E-19f);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-38));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.25065299898745796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24553239290601714d) + "'", double1 == (-0.24553239290601714d));
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0845246306421101d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.581559855949905d + "'", double2 == 34.581559855949905d);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double1 = org.apache.commons.math3.util.FastMath.acos(265.94345040106276d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        long long2 = org.apache.commons.math3.util.FastMath.min(149L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5707352916386088d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.53674430092943E-7d, 108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.53674430092943E-7d + "'", double2 == 9.53674430092943E-7d);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8537.071147449265d, (double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8813735870195429d), 3.155849015173716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-25.305917892432674d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        int int1 = org.apache.commons.math3.util.FastMath.round((-6.1035153E-5f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000005f + "'", float1 == 3.0000005f);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        long long2 = org.apache.commons.math3.util.FastMath.min(20L, (long) (-1024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.881786E-16f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 63.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.00000000000001d + "'", double1 == 63.00000000000001d);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.189528855605421E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.970193088617227d) + "'", double1 == (-0.970193088617227d));
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        long long2 = org.apache.commons.math3.util.FastMath.max(22026L, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(25.415396580804064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.415396580804067d + "'", double1 == 25.415396580804067d);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(57.29291493894794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.642222003741d + "'", double1 == 3282.642222003741d);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1L, (float) (-44));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 51.999996f, 89.9236056725866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.999996185302734d + "'", double2 == 51.999996185302734d);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1920928955078097E-7d, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078097E-7d + "'", double2 == 1.1920928955078097E-7d);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double2 = org.apache.commons.math3.util.FastMath.pow(20.085532134423065d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 403.4286011229416d + "'", double2 == 403.4286011229416d);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5200669294466769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.09341963470486d + "'", double1 == 87.09341963470486d);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.629365427493558E-6d, 0.48168124860751377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.629365427493558E-6d + "'", double2 == 7.629365427493558E-6d);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.026525695313479d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.999999f, (-8.376517822945031E-13d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999046325684d + "'", double2 == 9.999999046325684d);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.014550758400599708d, 1.2207031249999999E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2207031249999999E-4d + "'", double2 == 1.2207031249999999E-4d);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(66.44679360118879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6011880928080983E28d + "'", double1 == 3.6011880928080983E28d);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.7182816664368272d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688101119437145E43d + "'", double2 == 2.688101119437145E43d);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.8844991406148166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050344007274675445d + "'", double1 == 0.050344007274675445d);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        double double1 = org.apache.commons.math3.util.FastMath.log(11.085564054390163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4056437262473316d + "'", double1 == 2.4056437262473316d);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.726209956738549E-7d) + "'", double1 == (-8.726209956738549E-7d));
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.099338555038559d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.099338555038559d + "'", double2 == 3.099338555038559d);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2015.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2015.9999f + "'", float1 == 2015.9999f);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.54742505E26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5474250491067253E26d + "'", double1 == 1.5474250491067253E26d);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(231.46791666571625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.139932559690632d + "'", double1 == 6.139932559690632d);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (byte) 10, 3.2256061285123683d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3231816144628952d + "'", double2 == 0.3231816144628952d);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7973736912471375d, 0.23235910202965793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7973736912471375d + "'", double2 == 0.7973736912471375d);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 8, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 262144.0d + "'", double2 == 262144.0d);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6110610404570322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-8L), (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.910383E-11f) + "'", float2 == (-2.910383E-11f));
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 12);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6287965664024852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        double double1 = org.apache.commons.math3.util.FastMath.acos(89.94410169625876d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.02668142320876577d, 1.2401309032460812E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2401309032460812E-17d + "'", double2 == 1.2401309032460812E-17d);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1500.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1023.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1022.99994f) + "'", float1 == (-1022.99994f));
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.999999111110716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-4.1244601392439496E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.124460139243949E-4d) + "'", double1 == (-4.124460139243949E-4d));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 38, 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.04453605E13f + "'", float2 == 1.04453605E13f);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        long long1 = org.apache.commons.math3.util.FastMath.round((-13.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-13L) + "'", long1 == (-13L));
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.9932228461263812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.999999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        float float1 = org.apache.commons.math3.util.FastMath.signum(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.090853653267673E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.015625637653511198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5551700532107924d + "'", double1 == 1.5551700532107924d);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        long long1 = org.apache.commons.math3.util.FastMath.abs(3072L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3072L + "'", long1 == 3072L);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 29.012614126025312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.012614126025312d + "'", double2 == 29.012614126025312d);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8131810251339586d + "'", double1 == 3.8131810251339586d);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.011032137432646739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0110932158627135d + "'", double1 == 1.0110932158627135d);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.6880966331881486E43d, (double) 230L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.0d + "'", double2 == 230.0d);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-0.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 29L, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 7.392373E-9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.392372908686772E-9d + "'", double1 == 7.392372908686772E-9d);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 0, 3072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 1, (-3.4667109783961534d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        long long2 = org.apache.commons.math3.util.FastMath.min(63L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1023.00006f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(201.71573230680755d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.015624999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-29.012614126025312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.061174760331545d) + "'", double1 == (-4.061174760331545d));
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        double double1 = org.apache.commons.math3.util.FastMath.floor(29.012614126025312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.8820097754150913d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.814697265625001E-6d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.283535870312749E-158d + "'", double2 == 7.283535870312749E-158d);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.796382254433037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.027800920562904d + "'", double1 == 6.027800920562904d);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-57.29577951308232d), 2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.295779513082316d) + "'", double2 == (-57.295779513082316d));
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2304259041251446d + "'", double1 == 0.2304259041251446d);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        float float2 = org.apache.commons.math3.util.FastMath.min(1023.00006f, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, 48000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48000 + "'", int2 == 48000);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 9L, 1.6061093801777693d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.999999f + "'", float2 == 8.999999f);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 6000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-5), (long) (-44));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.015625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.015625f + "'", float1 == 0.015625f);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1023L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9182846632869422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9182846632869424d + "'", double1 == 0.9182846632869424d);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.0786964586302374E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-88.17576400073732d) + "'", double1 == (-88.17576400073732d));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 29L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.965667148572021E12d + "'", double1 == 1.965667148572021E12d);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6673940104325407d, 3282.642222003741d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3282.6426454739853d + "'", double2 == 3282.6426454739853d);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 46L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.768371013597152E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7277862875981045d + "'", double1 == 5.7277862875981045d);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.836218912841156d + "'", double1 == 4.836218912841156d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.1771933557663606E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9663132900858417E-6d + "'", double1 == 2.9663132900858417E-6d);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-36.63870901270898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8725523440809979d + "'", double1 == 0.8725523440809979d);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int int2 = org.apache.commons.math3.util.FastMath.max(750, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.03467284536035253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03468674668190965d) + "'", double1 == (-0.03468674668190965d));
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.1305288720633906E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1305288720617787E-6d + "'", double1 == 2.1305288720617787E-6d);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.814697265625001E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265634253E-6d + "'", double1 == 3.814697265634253E-6d);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1025.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.569462994251686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1621183532803174d + "'", double1 == 1.1621183532803174d);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.881786E-16f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-50) + "'", int1 == (-50));
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        double double2 = org.apache.commons.math3.util.FastMath.min(17.872171540421935d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.872171540421935d + "'", double2 == 17.872171540421935d);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.04453605E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.19077079376318204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18850577885233794d + "'", double1 == 0.18850577885233794d);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.007570918573144928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4337816812784116d) + "'", double1 == (-0.4337816812784116d));
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-6), 0.015625002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5771174481917147d, 0.0688785009277558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0318785345512005d + "'", double2 == 1.0318785345512005d);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.64926744E12f, (-35.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.015625000000000014d, 7.827881037133875E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.41928129253470725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9133817649450813d + "'", double1 == 0.9133817649450813d);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        int int2 = org.apache.commons.math3.util.FastMath.min(6000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.624618747740734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624618747740735d + "'", double1 == 7.624618747740735d);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4210804127942924d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.4657022738769552d, (-1023.9999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4657022738769552d + "'", double2 == 1.4657022738769552d);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(48000.0f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E15f + "'", float2 == 1.64926744E15f);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.19589283408591d, 127.11046571371325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009408018010304003d + "'", double2 == 0.009408018010304003d);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.848890218459359d, 8.187928385330529E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001446299016021d + "'", double2 == 1.0001446299016021d);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1025, (long) (-121));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(84.73931296875567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.132761631686654d + "'", double1 == 5.132761631686654d);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5698207173483318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0224216762791083d + "'", double1 == 1.0224216762791083d);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        double double2 = org.apache.commons.math3.util.FastMath.min((-3.137566414384587E306d), (double) 512.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.137566414384587E306d) + "'", double2 == (-3.137566414384587E306d));
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.6054761232346983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.702986674926819d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 48000L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.778977123006351d + "'", double1 == 10.778977123006351d);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5707963267948581d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(17.872171540421935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.778105565676456E7d + "'", double1 == 5.778105565676456E7d);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.569185067066198d, 163354.18244889102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        long long2 = org.apache.commons.math3.util.FastMath.min(35L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1024L), (float) 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.2061743125711886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.228967409794496d + "'", double1 == 1.228967409794496d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4449632606147725d, (double) 1.2980741E33f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2980741372624545E33d + "'", double2 == 1.2980741372624545E33d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-4.736275386267657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        float float1 = org.apache.commons.math3.util.FastMath.abs(12.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.04402615488638885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009693077094823d + "'", double1 == 1.0009693077094823d);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) (-1024));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.079172612257729E-4d + "'", double1 == 5.079172612257729E-4d);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-63959947L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        double double1 = org.apache.commons.math3.util.FastMath.floor(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.0d + "'", double1 == 572.0d);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5707647845032549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31703.46692071624d + "'", double1 == 31703.46692071624d);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998222988255625d + "'", double1 == 2.998222988255625d);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.9580333260613905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 39);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.244997998398398d + "'", double1 == 6.244997998398398d);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8425767838562601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2658595418453178E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.26585954184532E14d + "'", double1 == 1.26585954184532E14d);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 40);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.162277660168379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8685511210994619d + "'", double1 == 1.8685511210994619d);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.242265591335951d, 1.220703125E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.3978976548952886E-5d) + "'", double2 == (-4.3978976548952886E-5d));
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        double double2 = org.apache.commons.math3.util.FastMath.max(8.881784197001252E-16d, 0.009116460333954432d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009116460333954432d + "'", double2 == 0.009116460333954432d);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1351374985682157d + "'", double1 == 1.1351374985682157d);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 106, 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8274116E13f + "'", float2 == 5.8274116E13f);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1024.0001220703127d, (-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1024.0001220703127d) + "'", double2 == (-1024.0001220703127d));
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3071.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8879813966787504d + "'", double1 == 0.8879813966787504d);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.656473403698357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0276664277248058d + "'", double1 == 1.0276664277248058d);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        double double1 = org.apache.commons.math3.util.FastMath.log(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.313220387090301d + "'", double1 == 7.313220387090301d);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        long long2 = org.apache.commons.math3.util.FastMath.min(2L, 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9640275716535813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3017603043599186d + "'", double1 == 1.3017603043599186d);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        long long2 = org.apache.commons.math3.util.FastMath.max(6L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.996833390848202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.54661364251996d) + "'", double1 == (-1.54661364251996d));
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1500L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2983485416910245d, 6.139932559690632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2983485416910245d + "'", double2 == 1.2983485416910245d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.0480275261378338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.808844491375823d) + "'", double1 == (-0.808844491375823d));
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 2.910383E-11f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        double double2 = org.apache.commons.math3.util.FastMath.min(239.46884570409546d, 1.4489023762258555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4489023762258555d + "'", double2 == 1.4489023762258555d);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5707647845032549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.154229163653721E-5d + "'", double1 == 3.154229163653721E-5d);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.6414445250304635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.193700035551454d + "'", double1 == 0.193700035551454d);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.5908872108403207d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6790281238451179d) + "'", double1 == (-0.6790281238451179d));
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.433773393518789d + "'", double1 == 0.433773393518789d);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3383347192042695E42d, 1.9916154164156743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.941742215644044E83d + "'", double2 == 7.941742215644044E83d);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 9223372036854775807L, (-0.39427356861218293d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39427356861218293d) + "'", double2 == (-0.39427356861218293d));
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        int int2 = org.apache.commons.math3.util.FastMath.min((-34), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.2124675420131484E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4874365673914125E14d + "'", double1 == 1.4874365673914125E14d);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.1361707344559157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1361707344559157d + "'", double1 == 0.1361707344559157d);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        double double1 = org.apache.commons.math3.util.FastMath.abs(108.43633988276744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.43633988276744d + "'", double1 == 108.43633988276744d);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0090262908655008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(70.26985858558899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.382711887306458d + "'", double1 == 8.382711887306458d);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3779650346793701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1127887657566855d + "'", double1 == 1.1127887657566855d);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        double double1 = org.apache.commons.math3.util.FastMath.floor(231.46791666571625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 231.0d + "'", double1 == 231.0d);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3862943611198906d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3753475883946132d + "'", double2 == 0.3753475883946132d);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1612231530729575d, 1.9539726886959428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1612231530729578d + "'", double2 == 1.1612231530729578d);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1753554136824453d + "'", double1 == 1.1753554136824453d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '4', (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.014550758400599708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.556245054886526d + "'", double1 == 1.556245054886526d);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.853230586269599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3472175051613533d + "'", double1 == 1.3472175051613533d);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2045.9999f), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2045.9999f) + "'", float2 == (-2045.9999f));
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(96.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.699514748210191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 0, (-20L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0000004768373099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403019046233176d + "'", double1 == 0.5403019046233176d);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        double double1 = org.apache.commons.math3.util.FastMath.atan(42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707730557363138d + "'", double1 == 1.5707730557363138d);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.441162712889187d, 0.34198014841116886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1331220770383494d + "'", double2 == 1.1331220770383494d);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5707963267948581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948584d + "'", double1 == 1.5707963267948584d);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(512.5789572728952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.003014266594967d + "'", double1 == 8.003014266594967d);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.68434188608064E-14d + "'", double1 == 5.68434188608064E-14d);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4043787951567745d + "'", double1 == 0.4043787951567745d);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.564058481760474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-121), 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-121L) + "'", long2 == (-121L));
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4255617839730704E64d + "'", double1 == 1.4255617839730704E64d);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(374.99997f, (double) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 375.0f + "'", float2 == 375.0f);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 8);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.910383045673371E-11d, 3.345158334326972E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.910383045673371E-11d + "'", double2 == 2.910383045673371E-11d);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.01562373042059934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12499492157923593d + "'", double1 == 0.12499492157923593d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 0.0f, 1.3094075755018562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3094075755018562d + "'", double2 == 1.3094075755018562d);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.103515625000001E-5d, 0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.103515625000001E-5d + "'", double2 == 6.103515625000001E-5d);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        double double1 = org.apache.commons.math3.util.FastMath.tan(237.68018390304016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8750847578455696d) + "'", double1 == (-1.8750847578455696d));
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7569856324386435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7569856324386435d + "'", double1 == 0.7569856324386435d);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0000123108260284d, 1.6718308188647008E103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000123108260284d + "'", double2 == 1.0000123108260284d);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(512.49994f, (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.5565355E-17f + "'", float2 == 5.5565355E-17f);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(39.0f, 60.30380470871524d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.000004f + "'", float2 == 39.000004f);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.29243176689515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04001048220963152d + "'", double1 == 0.04001048220963152d);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.359610000063081E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0879679116459336E-14d + "'", double1 == 2.0879679116459336E-14d);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        double double1 = org.apache.commons.math3.util.FastMath.atan(19.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5207126162141167d + "'", double1 == 1.5207126162141167d);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5600863066415889d, 1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6673940104325407d + "'", double2 == 1.6673940104325407d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(512.49994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.1035153E-5f, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035153E-5f + "'", float2 == 6.1035153E-5f);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.8211867E-34f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8211867E-34f + "'", float2 == 2.8211867E-34f);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 3072L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0002f + "'", float1 == 3072.0002f);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.67977267251461d) + "'", double1 == (-44.67977267251461d));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.910383E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.079576664122082E-13d + "'", double1 == 5.079576664122082E-13d);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.13631466637301434d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0459445002261154d, (-0.21038551689904683d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.999999880790727d, 1.0000001192093038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4142135623731267d + "'", double2 == 1.4142135623731267d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1319682047714509d + "'", double1 == 0.1319682047714509d);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1025, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.6268613048244727d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1025, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2993419E33f + "'", float2 == 1.2993419E33f);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.2737367544323206E-13d, 0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.099476795746016E-13d + "'", double2 == 3.099476795746016E-13d);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.814697265634253E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000038147045416d + "'", double1 == 1.0000038147045416d);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-20L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999979388464d) + "'", double1 == (-0.9999999979388464d));
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(31.499999999999993d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.991374238398652E30d + "'", double2 == 4.991374238398652E30d);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.885078775995249E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        int int2 = org.apache.commons.math3.util.FastMath.max(137, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 137 + "'", int2 == 137);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.960170286650366d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(286.0d, (-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 285.99999999999994d + "'", double2 == 285.99999999999994d);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.15292150460684698E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.281978014156664d + "'", double1 == 42.281978014156664d);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.6286665988545064d, 1.3610195264493026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3610195264493026d + "'", double2 == 1.3610195264493026d);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-50));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.7277862875981045d, 1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.727786289925683d + "'", double2 == 5.727786289925683d);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.433773393518789d), (-0.14351994778492885d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3776033183918697E14d + "'", double1 == 2.3776033183918697E14d);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7954782038978773d, (double) 112L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7954782038978773d + "'", double2 == 0.7954782038978773d);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 11, (-6.1035153E-5f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1035153E-5f) + "'", float2 == (-6.1035153E-5f));
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.416510530506886d, 2.2124675420131484E28d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.416510530506886d + "'", double2 == 5.416510530506886d);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.09951176E12f, (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3687098E8f + "'", float2 == 5.3687098E8f);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        long long1 = org.apache.commons.math3.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.6880966331881486E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5707497746364167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.3017603043599186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1409471084848406d + "'", double1 == 1.1409471084848406d);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 0.015625004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.727077606426953E-4d + "'", double1 == 2.727077606426953E-4d);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6215477523208265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812978183665497d + "'", double1 == 0.812978183665497d);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8260092206769861d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3094075755018562d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.198544273811357E11d + "'", double2 == 7.198544273811357E11d);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7786670548322335d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7722028462284364d + "'", double1 == 0.7722028462284364d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 128);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 128L + "'", long1 == 128L);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2, 1.5670585390721965d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.5370264E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5370263527767281E31d + "'", double1 == 1.5370263527767281E31d);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        int int2 = org.apache.commons.math3.util.FastMath.min((-34), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6378974212549495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8608291180359888d + "'", double1 == 0.8608291180359888d);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1713555603103292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0822918092226002d + "'", double1 == 1.0822918092226002d);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(458.3662361046586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.820816877190263d + "'", double1 == 6.820816877190263d);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.6790281238451179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-14L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999991684712809d) + "'", double1 == (-0.9999991684712809d));
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3890776.558273805d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.9782433465861597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.230031164371132d + "'", double1 == 7.230031164371132d);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.248699261236361d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4350.668043506033d + "'", double2 == 4350.668043506033d);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-7276.563998161455d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000269272749114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.169420946081488E-5d + "'", double1 == 1.169420946081488E-5d);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.00001f + "'", float1 == 35.00001f);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 39L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.6593400423993744E16d + "'", double1 == 8.6593400423993744E16d);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.19077079376318204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.656682604204755d) + "'", double1 == (-1.656682604204755d));
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        int int2 = org.apache.commons.math3.util.FastMath.max(43, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.5035996E15f, (-0.06243896f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-34));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6L, 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207033E-4f + "'", float2 == 1.2207033E-4f);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-4.836344889159275d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.288323357835553E-62d, (-2.3491017549336775d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3491017549336775d) + "'", double2 == (-2.3491017549336775d));
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-8.726209956738549E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.726209956737441E-7d) + "'", double1 == (-8.726209956737441E-7d));
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1765355471794627d + "'", double1 == 1.1765355471794627d);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-2016.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2016.0d) + "'", double1 == (-2016.0d));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(37.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.061290475572342844d), 0.844153986113171d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 1.0E200d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E200d + "'", double2 == 1.0E200d);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.770157551990498E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-72.35560618424385d) + "'", double1 == (-72.35560618424385d));
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.5474252E26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-127));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.02042970020377229d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.6084956416610713E60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(148.40979009083827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0066927999415745d + "'", double1 == 5.0066927999415745d);
    }
}

