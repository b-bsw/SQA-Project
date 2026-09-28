package org.apache.commons.math.util;

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
        long long1 = org.apache.commons.math.util.FastMath.round(2.46819606815034E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9802576824651943d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2808376786846926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3242386343317494d + "'", double1 == 1.3242386343317494d);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5841716915979767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5401845586281078d + "'", double1 == 2.5401845586281078d);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.000115286123023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.48243212226262994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44949479120381985d + "'", double1 == 0.44949479120381985d);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9821279356034003d, 0.13249892381659706d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13249892381659706d + "'", double2 == 0.13249892381659706d);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.044149187845410116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04417790591315649d) + "'", double1 == (-0.04417790591315649d));
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        double double1 = org.apache.commons.math.util.FastMath.abs(227.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 227.0d + "'", double1 == 227.0d);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2808376786846926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9608236039126866d + "'", double1 == 0.9608236039126866d);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9898232533671977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.690758847751954d + "'", double1 == 2.690758847751954d);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5430806348152437d, 1.7750770696059308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.159754170844509d + "'", double2 == 2.159754170844509d);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        double double2 = org.apache.commons.math.util.FastMath.min(32.0d, 1.2799416321930788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2799416321930788d + "'", double2 == 1.2799416321930788d);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5802053839637673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5443731278415634d) + "'", double1 == (-0.5443731278415634d));
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        double double1 = org.apache.commons.math.util.FastMath.sin((-9.513484761488917E139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40834357456474796d + "'", double1 == 0.40834357456474796d);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590842d + "'", double1 == 0.6483608274590842d);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.40946195169855704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3877864478353665d) + "'", double1 == (-0.3877864478353665d));
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7019710183189237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7019710183189237d + "'", double1 == 0.7019710183189237d);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.008491519610769877d), (-0.48653408229724276d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008491519610769879d) + "'", double2 == (-0.008491519610769879d));
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7126526144249964d + "'", double1 == 0.7126526144249964d);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5982251431131134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.535785414660496d) + "'", double1 == (-0.535785414660496d));
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9188537484079546d + "'", double1 == 2.9188537484079546d);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9836065573770493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994505383612071d + "'", double1 == 0.994505383612071d);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.931763225510739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37155687605200366d + "'", double1 == 0.37155687605200366d);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9542174043274347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9834982458959824d), 1.2280208110551356d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1223072818099046E-9d) + "'", double1 == (-4.1223072818099046E-9d));
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44248081051227434d + "'", double1 == 0.44248081051227434d);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.327581142581999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.1894250945222025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7453292519943298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.013657851706229811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01365870103245646d + "'", double1 == 0.01365870103245646d);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7415933335367688d + "'", double1 == 0.7415933335367688d);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.158638853279167d, 1.0202829181297208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2806068627910445d + "'", double2 == 4.2806068627910445d);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8100237733214718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.740476385691844d + "'", double1 == 0.740476385691844d);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(65.86430060990239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.8643006099024d + "'", double1 == 65.8643006099024d);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07139823206237136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07127715650414634d) + "'", double1 == (-0.07127715650414634d));
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.624376645697622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6743332553663808d + "'", double1 == 0.6743332553663808d);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0948410127421968d, 1.102293192940162d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.094841012742197d + "'", double2 == 1.094841012742197d);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999689100311606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3502411805356305E-5d) + "'", double1 == (-1.3502411805356305E-5d));
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.47859127706984d + "'", double1 == 2.47859127706984d);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5516730959931526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6207831908859206d) + "'", double1 == (-0.6207831908859206d));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5440211108893694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098494453571884d + "'", double1 == 0.6098494453571884d);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5631767322193112d), (-0.8816146848906149d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8816146848906149d) + "'", double2 == (-0.8816146848906149d));
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7219067166708867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7219067166708867d + "'", double1 == 0.7219067166708867d);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.491754101407853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.843508051844005d + "'", double1 == 32.843508051844005d);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.940141468803505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        double double1 = org.apache.commons.math.util.FastMath.sinh(103.70899308565303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.485464706843569E44d + "'", double1 == 5.485464706843569E44d);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5518737433602259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5019232260066885d + "'", double1 == 0.5019232260066885d);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.25313651049314223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2558486026857986d + "'", double1 == 0.2558486026857986d);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5631767322193112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1628200628694076d + "'", double1 == 1.1628200628694076d);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.99598501395558d), 0.09506557725167404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09506557725167404d + "'", double2 == 0.09506557725167404d);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9107017292651758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8168003331226937d + "'", double1 == 0.8168003331226937d);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        double double1 = org.apache.commons.math.util.FastMath.signum(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6865874069985796d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6865874069985796d) + "'", double2 == (-0.6865874069985796d));
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        double double1 = org.apache.commons.math.util.FastMath.asin(108.29903111138356d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6708867372551721d + "'", double1 == 0.6708867372551721d);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        double double1 = org.apache.commons.math.util.FastMath.rint((-43.19155203462029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.0d) + "'", double1 == (-43.0d));
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7924685551644433d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5847565194252626E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998601189096E-5d + "'", double1 == 9.07998601189096E-5d);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.745015451903739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9065430375183643d + "'", double1 == 0.9065430375183643d);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        double double1 = org.apache.commons.math.util.FastMath.log1p(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.829869827932433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6042448320459501d + "'", double1 == 0.6042448320459501d);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8561916828402603d + "'", double1 == 0.8561916828402603d);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        double double2 = org.apache.commons.math.util.FastMath.pow(1312.6929859424645d, 9.079985949503006E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0006521406531765d + "'", double2 == 1.0006521406531765d);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5429710340288025d + "'", double1 == 1.5429710340288025d);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.604885025084334d) + "'", double1 == (-0.604885025084334d));
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9951899344229606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002094025184076574d) + "'", double1 == (-0.002094025184076574d));
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5847565194252626E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.584756519423936E-6d + "'", double1 == 1.584756519423936E-6d);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 33L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5034300733007516d + "'", double1 == 0.5034300733007516d);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.015515027990856209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.2990612758127336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.032588422537025d + "'", double1 == 5.032588422537025d);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.810415804571918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9448615067357443d + "'", double1 == 0.9448615067357443d);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.533422450854332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5590814204345168d + "'", double1 == 0.5590814204345168d);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8876996978746371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4109688618214138d + "'", double1 == 1.4109688618214138d);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.44248081051227434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.457061651952349d + "'", double1 == 0.457061651952349d);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        double double2 = org.apache.commons.math.util.FastMath.min(2.0947125472611012d, 3.1326494772257005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0947125472611012d + "'", double2 == 2.0947125472611012d);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 0, 0.11083319553050024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94284158531252d + "'", double1 == 104.94284158531252d);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9751446278717821d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.002962815258153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        double double1 = org.apache.commons.math.util.FastMath.sinh(226.84826038896668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6516488549852542E98d + "'", double1 == 1.6516488549852542E98d);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.989874861238103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.7156517950413d + "'", double1 == 56.7156517950413d);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        int int1 = org.apache.commons.math.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        int int2 = org.apache.commons.math.util.FastMath.min(5507, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5507.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3805150062465965d) + "'", double1 == (-3.3805150062465965d));
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.263196996773619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.613775297505947d + "'", double1 == 8.613775297505947d);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9111302618846769d) + "'", double1 == (-0.9111302618846769d));
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.07998602436399E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985999410328E-5d + "'", double1 == 9.079985999410328E-5d);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0656328345305126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06572723870683374d) + "'", double1 == (-0.06572723870683374d));
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6809246903215531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7783607304516975d + "'", double1 == 2.7783607304516975d);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.10955796484928035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01901860187056251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019016309312897425d + "'", double1 == 0.019016309312897425d);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002962815258153d + "'", double1 == 1.002962815258153d);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.872732826701256E-25d, 0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002895402870311586d + "'", double2 == 0.002895402870311586d);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0530637390494224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8112385339895775d + "'", double1 == 0.8112385339895775d);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12390946642976251d) + "'", double1 == (-0.12390946642976251d));
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1677879131291755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.86264467253485d + "'", double1 == 0.86264467253485d);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.994294500487108d, (-0.8414398880534d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0048261914958174d + "'", double2 == 1.0048261914958174d);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8867254579876315d, (-0.40838771824645015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.002394787391724d + "'", double2 == 2.002394787391724d);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6304888220754902d) + "'", double1 == (-0.6304888220754902d));
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        double double1 = org.apache.commons.math.util.FastMath.log(9.07998601189096E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.306852812898857d) + "'", double1 == (-9.306852812898857d));
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.149548905166106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9125795808248863d + "'", double1 == 0.9125795808248863d);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5844798497868198d + "'", double1 == 0.5844798497868198d);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.04599315997198159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.047067248963123d + "'", double1 == 1.047067248963123d);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3469373133180005d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8068012007388357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.722077905488864d + "'", double1 == 0.722077905488864d);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5412093449191896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4960691053839213d) + "'", double1 == (-0.4960691053839213d));
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2337018336902346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.334356436447235d + "'", double1 == 8.334356436447235d);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5975571443282363d, 0.0027745073023895317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5975571443282361d + "'", double2 == 0.5975571443282361d);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.824209315301355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-90L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4616178806179598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.134866080473415d + "'", double1 == 1.134866080473415d);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0947125472611012d, 1.0176055895227847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.094712547261101d + "'", double2 == 2.094712547261101d);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7019710183189237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35386316025452974d) + "'", double1 == (-0.35386316025452974d));
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.002962815258153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6332089045701867d) + "'", double1 == (-0.6332089045701867d));
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2407288686697966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-90));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.192987713658941d) + "'", double1 == (-5.192987713658941d));
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18818323215214394d) + "'", double1 == (-0.18818323215214394d));
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5596856728972892d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.2534690753051354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.229873870025155d) + "'", double1 == (-1.229873870025155d));
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1326010584537984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1418636685458503d + "'", double1 == 1.1418636685458503d);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.690795798579539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6371507370823788d + "'", double1 == 0.6371507370823788d);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.72239180482502d) + "'", double1 == (-56.72239180482502d));
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8134592121885016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25850779199769414d + "'", double1 == 0.25850779199769414d);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-17.45973974851091d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.0594418557410383d), 0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10475317834218718d + "'", double2 == 0.10475317834218718d);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5019232260066885d, 1.1854652182422676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4416883280587693d + "'", double2 == 0.4416883280587693d);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0352316484600232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8599805959475393d + "'", double1 == 0.8599805959475393d);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0255887029643131d, 0.052518065881558766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.025588702964313d + "'", double2 == 1.025588702964313d);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        double double2 = org.apache.commons.math.util.FastMath.max(0.580829006249046d, 0.09745867084955731d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.580829006249046d + "'", double2 == 0.580829006249046d);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3132565042068824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132565042068824d + "'", double1 == 1.3132565042068824d);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        double double1 = org.apache.commons.math.util.FastMath.abs(44.99809670330265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.99809670330265d + "'", double1 == 44.99809670330265d);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        long long1 = org.apache.commons.math.util.FastMath.abs(37L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        double double1 = org.apache.commons.math.util.FastMath.asin(1312.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.7405072374130097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2028882366758453d) + "'", double1 == (-1.2028882366758453d));
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        double double2 = org.apache.commons.math.util.FastMath.atan2(132058.36709719698d, (-0.5443731278415634d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570800449011003d + "'", double2 == 1.570800449011003d);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        double double1 = org.apache.commons.math.util.FastMath.log(6013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.70167907103957d + "'", double1 == 8.70167907103957d);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7645662682374061d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9173172747640832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9716425476532478d + "'", double1 == 0.9716425476532478d);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3589478765910177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 5507, 0.872928489116717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1843.1103827446304d + "'", double2 == 1843.1103827446304d);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7735389809079516d, (-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7735389809079515d + "'", double2 == 0.7735389809079515d);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9880923460971159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4163206894354956d + "'", double1 == 1.4163206894354956d);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        double double2 = org.apache.commons.math.util.FastMath.atan2(257.19381419176113d, 4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.552892793040788d + "'", double2 == 1.552892793040788d);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.103465364555801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.861454711325157d + "'", double1 == 0.861454711325157d);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5378946274303926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9179704868072519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6006713379737495d) + "'", double1 == (-0.6006713379737495d));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.015417978618561132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8833851034664961d + "'", double1 == 0.8833851034664961d);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9597264399709715d + "'", double1 == 0.9597264399709715d);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9216936941393117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4556943022324125d + "'", double1 == 1.4556943022324125d);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999303766734422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615649143945545d + "'", double1 == 0.7615649143945545d);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.13800468479027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.507222037885182d + "'", double1 == 11.507222037885182d);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.022630443056965113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0228884541592955d + "'", double1 == 1.0228884541592955d);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4551915228366852E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4551915228366852E-11d + "'", double1 == 1.4551915228366852E-11d);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6986765821769388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.887344092558564d) + "'", double1 == (-0.887344092558564d));
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        double double2 = org.apache.commons.math.util.FastMath.pow(82.30348906711043d, 1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1062.3927302649324d + "'", double2 == 1062.3927302649324d);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        double double1 = org.apache.commons.math.util.FastMath.log(11.940141468803501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4799059562027663d + "'", double1 == 2.4799059562027663d);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0896856194228446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        double double1 = org.apache.commons.math.util.FastMath.log(12.633288649374089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5363352864251576d + "'", double1 == 2.5363352864251576d);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9607387187064872d), 0.38863652572621304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9607387187064872d) + "'", double2 == (-0.9607387187064872d));
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        double double1 = org.apache.commons.math.util.FastMath.log(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.076738876852442d + "'", double1 == 2.076738876852442d);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        double double2 = org.apache.commons.math.util.FastMath.max(2.196231140163579d, (-1.437600971038334d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.196231140163579d + "'", double2 == 2.196231140163579d);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2814145124371763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.022634307143927467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02263623983076541d + "'", double1 == 0.02263623983076541d);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.229873870025155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021465348416183753d) + "'", double1 == (-0.021465348416183753d));
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.4414869715493879d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        long long1 = org.apache.commons.math.util.FastMath.round(108.29903111138356d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 108L + "'", long1 == 108L);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8270307983194575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6682015101903132d), 0.6637128698018219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.668201510190313d) + "'", double2 == (-0.668201510190313d));
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.1556157735575975E15d), 0.8922451992629652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8922451992629652d + "'", double2 == 0.8922451992629652d);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9924347232553565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9974718549539727d + "'", double1 == 0.9974718549539727d);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.89818203244916d + "'", double1 == 88.89818203244916d);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.40838771824645015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9914834027794717d + "'", double1 == 1.9914834027794717d);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0935990917790617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0457528827495823d + "'", double1 == 1.0457528827495823d);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.900735886184545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.2464206048444835d) + "'", double1 == (-5.2464206048444835d));
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.248949670772078E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2489243820885466E-5d) + "'", double1 == (-2.2489243820885466E-5d));
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 818.9819689194977d + "'", double1 == 818.9819689194977d);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7750770696059308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03510313708234d + "'", double1 == 3.03510313708234d);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6416439271862105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(155.88596569643704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.88596569643707d + "'", double1 == 155.88596569643707d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        double double1 = org.apache.commons.math.util.FastMath.atan(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5405025668761214d + "'", double1 == 1.5405025668761214d);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        double double2 = org.apache.commons.math.util.FastMath.min(0.08309759227292604d, (-0.5113565640720369d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5113565640720369d) + "'", double2 == (-0.5113565640720369d));
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3590146193143267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.936427648305001d + "'", double1 == 0.936427648305001d);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2037005703909553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8775719214756793d + "'", double1 == 0.8775719214756793d);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7182818284590453d, 0.872928489116717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818284590453d + "'", double2 == 1.7182818284590453d);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.03510313708234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9807747056866981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8309286497640698d + "'", double1 == 0.8309286497640698d);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        double double1 = org.apache.commons.math.util.FastMath.log(1.91882856777121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6517148788876671d + "'", double1 == 0.6517148788876671d);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        long long2 = org.apache.commons.math.util.FastMath.min(108L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-63.81719973521831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-63.0d) + "'", double1 == (-63.0d));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.999948217360899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.45158270528945427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719990366730106d + "'", double1 == 0.6719990366730106d);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616002858669332d + "'", double1 == 0.7616002858669332d);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999575569411912d + "'", double1 == 0.9999575569411912d);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9173172747640832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9577668164872299d + "'", double1 == 0.9577668164872299d);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35.0f, 0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.319927110848207d + "'", double2 == 2.319927110848207d);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21178170748056988d + "'", double1 == 0.21178170748056988d);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9872136726111863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5510171697408757d + "'", double1 == 0.5510171697408757d);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.677053844817004E-155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9406268191575922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026582642806498483d) + "'", double1 == (-0.026582642806498483d));
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.0924287889629486d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0925604496286767d) + "'", double1 == (-0.0925604496286767d));
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9982900983985066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1725643943149529d + "'", double1 == 1.1725643943149529d);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1589375003169515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        int int2 = org.apache.commons.math.util.FastMath.max(90, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7987095471340483d), 1.8427842873511954E202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.334254164290209E-203d) + "'", double2 == (-4.334254164290209E-203d));
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.485464706843569E44d, 1.1496153595671315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.485464706843568E44d + "'", double2 == 5.485464706843568E44d);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        double double1 = org.apache.commons.math.util.FastMath.floor(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.0d + "'", double1 == 37.0d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9834982458959824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9388149908366094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388149908366094d + "'", double1 == 0.9388149908366094d);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0506215241944414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8238673184078138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3590146193143267d + "'", double1 == 1.3590146193143267d);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.09492270797282235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.438670546795531d + "'", double1 == 5.438670546795531d);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9977958852759198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7606669293467007d) + "'", double1 == (-0.7606669293467007d));
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7881717713958057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0048261914958174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5487703736876421d + "'", double1 == 1.5487703736876421d);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8833329068775875d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7074275585391845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6667125839021377d + "'", double1 == 2.6667125839021377d);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(44.9999998819046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.556893301378561d + "'", double1 == 3.556893301378561d);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.6912438838626d + "'", double1 == 45.6912438838626d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1093389265928446d), (-0.01745417862959511d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.3805150062465965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3025850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5713088006770572d + "'", double1 == 1.5713088006770572d);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-1.7405072374130097d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        double double1 = org.apache.commons.math.util.FastMath.rint(46.23553270010918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4556943022324125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.64954321766854d + "'", double1 == 8.64954321766854d);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.32047738164862055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.277993323981788d + "'", double1 == 0.277993323981788d);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.49901183053376447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47855810437913515d + "'", double1 == 0.47855810437913515d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.250318945146276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.777872804388193d + "'", double1 == 0.777872804388193d);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0d), (double) 90);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.380291914558474E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3144002680633424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.010458920780344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1092317842737094d + "'", double1 == 1.1092317842737094d);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.035592047388576235d + "'", double1 == 0.035592047388576235d);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8211080655056974d + "'", double1 == 0.8211080655056974d);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999997649972645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745328841837181d + "'", double1 == 0.01745328841837181d);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8631635751882506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1690152019850792d) + "'", double1 == (-1.1690152019850792d));
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027415567780803757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.596644259751356d) + "'", double1 == (-3.596644259751356d));
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.103465364555801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194517757779813d + "'", double1 == 8.194517757779813d);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        double double2 = org.apache.commons.math.util.FastMath.min(76.73862422940539d, 3.03510313708234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.03510313708234d + "'", double2 == 3.03510313708234d);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.720723359053762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3960301412496883d + "'", double1 == 1.3960301412496883d);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.002774503742748542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568021819492507d + "'", double1 == 1.568021819492507d);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5730.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9446922743316068E-62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9446922743316068E-62d + "'", double1 == 1.9446922743316068E-62d);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.98366774371544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017168240873498188d + "'", double1 == 0.017168240873498188d);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.3886016769558134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.74050723741301d), 8.653470809708786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7405072374130097d) + "'", double2 == (-1.7405072374130097d));
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.04298093908493936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042994183650930454d) + "'", double1 == (-0.042994183650930454d));
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.46346031073593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.698647747478174d + "'", double1 == 2.698647747478174d);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.012055297180161666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999273357849807d + "'", double1 == 0.9999273357849807d);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2587612362107516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6185257010730183d + "'", double1 == 1.6185257010730183d);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2924014765439716d + "'", double1 == 0.2924014765439716d);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        double double1 = org.apache.commons.math.util.FastMath.sin((-40.854048291402435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01334339874628798d + "'", double1 == 0.01334339874628798d);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        double double1 = org.apache.commons.math.util.FastMath.ceil(48980.58846231743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48981.0d + "'", double1 == 48981.0d);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-1L), (-27.876349504902667d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5659403777711782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5394005199551674d) + "'", double1 == (-0.5394005199551674d));
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        double double1 = org.apache.commons.math.util.FastMath.floor(96.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0228884541592955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017852771405714795d + "'", double1 == 0.017852771405714795d);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1071487177940904d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.900735886184545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.698584275341739d + "'", double1 == 1.698584275341739d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        double double1 = org.apache.commons.math.util.FastMath.ulp(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5113565640720369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.07998602436399E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986049317652E-5d + "'", double1 == 9.079986049317652E-5d);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        double double2 = org.apache.commons.math.util.FastMath.pow(15.675653009906092d, (-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7098026097087103d + "'", double2 == 0.7098026097087103d);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2490457723982544d) + "'", double1 == (-1.2490457723982544d));
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        int int1 = org.apache.commons.math.util.FastMath.abs(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        double double1 = org.apache.commons.math.util.FastMath.log10(50.237955471941575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7010319566582488d + "'", double1 == 1.7010319566582488d);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.158638853279166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6088194853164001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6088194853164d) + "'", double1 == (-0.6088194853164d));
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.11710370870180292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020438452831427955d) + "'", double1 == (-0.0020438452831427955d));
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7599028021187388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9473741150701356d, 0.7218011448664199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6178002687535424d + "'", double2 == 1.6178002687535424d);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.10924758513314765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11543848214209212d + "'", double1 == 0.11543848214209212d);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5378946274303922d + "'", double1 == 1.5378946274303922d);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9020848703947254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.68565583622363d + "'", double1 == 51.68565583622363d);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.4865138719659448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0475388422900291d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5807306907661335d), 0.43349402349577826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.929562688685152d) + "'", double2 == (-0.929562688685152d));
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589204E38d + "'", double1 == 6.102016471589204E38d);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        long long2 = org.apache.commons.math.util.FastMath.max(5507L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.194517757779813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.44949479120381985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4345105648245638d + "'", double1 == 0.4345105648245638d);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.07898096151940606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2717104239752093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2717104239752095d + "'", double1 == 1.2717104239752095d);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.4855215610041086d), 0.3683334104437261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4855215610041086d) + "'", double2 == (-1.4855215610041086d));
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3136814122251812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0229280659655783d + "'", double1 == 0.0229280659655783d);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7987095471340483d), 0.533422450854332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7987095471340483d) + "'", double2 == (-0.7987095471340483d));
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.433780830483027d) + "'", double1 == (-1.433780830483027d));
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9110895402590333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0424724406933767d + "'", double1 == 1.0424724406933767d);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7764153489348606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9821938415578451d + "'", double1 == 0.9821938415578451d);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.002309551127695d + "'", double1 == 2.002309551127695d);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6073784172994565d + "'", double1 == 0.6073784172994565d);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.838249024841735d), 0.6532070891002518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.838249024841735d) + "'", double2 == (-6.838249024841735d));
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        double double1 = org.apache.commons.math.util.FastMath.tanh(23.628351601695016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        double double1 = org.apache.commons.math.util.FastMath.rint(31.984371183438945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5884022289215687d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(24.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1375.0987083139757d + "'", double1 == 1375.0987083139757d);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.00565679192583975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6723083385899451d + "'", double1 == 0.6723083385899451d);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5487703736876421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.39364429304659d + "'", double1 == 45.39364429304659d);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6042448320459501d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.122307281809905E-9d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8813736213307353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813736213307353d + "'", double1 == 0.8813736213307353d);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.007885446079761261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007885446079761261d + "'", double1 == 0.007885446079761261d);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4833023923748323d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.872732826701256E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.872732826701256E-25d + "'", double1 == 5.872732826701256E-25d);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9448615067357443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.737447891018455d + "'", double1 == 0.737447891018455d);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3868973415880647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6220107246567897d + "'", double1 == 0.6220107246567897d);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8211080655056974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.3845369719462828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.900710131145049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.433815708350771d + "'", double1 == 1.433815708350771d);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5055823053323238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06516780684692637d + "'", double1 == 0.06516780684692637d);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.851898262478877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7581626343846964d) + "'", double1 == (-0.7581626343846964d));
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-8.306852824943366d), 0.7616002858669332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.306852824943364d) + "'", double2 == (-8.306852824943364d));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3693300629462564d + "'", double1 == 2.3693300629462564d);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6986765821769388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6432049175981438d) + "'", double1 == (-0.6432049175981438d));
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0994172039830736d + "'", double1 == 1.0994172039830736d);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0392740995950414d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        int int1 = org.apache.commons.math.util.FastMath.abs(5507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5507 + "'", int1 == 5507);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8867182812524047d) + "'", double1 == (-0.8867182812524047d));
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.018168583893839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9652889733989565d + "'", double1 == 0.9652889733989565d);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        double double2 = org.apache.commons.math.util.FastMath.min(2.202019757600187d, 0.7219067166708867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7219067166708867d + "'", double2 == 0.7219067166708867d);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.700942273550203E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3332504.6983135534d + "'", double1 == 3332504.6983135534d);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011871350870521892d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5698901873668514d) + "'", double1 == (-2.5698901873668514d));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.2308123878770227d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-89.0d), (-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-88.99999999999999d) + "'", double2 == (-88.99999999999999d));
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5191607731424398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4961516657893783d) + "'", double1 == (-0.4961516657893783d));
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.872983056043322d + "'", double1 == 7.872983056043322d);
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.01745417862959511d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7319013265055243d) + "'", double1 == (-0.7319013265055243d));
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013787719250806334d + "'", double1 == 0.013787719250806334d);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.134890207766664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3946872830200805d + "'", double1 == 1.3946872830200805d);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9132181497465548d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        double double1 = org.apache.commons.math.util.FastMath.signum(155.74608385512988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09745867084955731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9952546615340857d + "'", double1 == 0.9952546615340857d);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9630272572571656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2980222566046529d) + "'", double1 == (-1.2980222566046529d));
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.10955796484928035d), 1.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10955796484928033d) + "'", double2 == (-0.10955796484928033d));
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9001202542666182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.045699465809971355d) + "'", double1 == (-0.045699465809971355d));
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.009206137707697834d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6418625964264848d + "'", double1 == 0.6418625964264848d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1329211224579735d) + "'", double1 == (-0.1329211224579735d));
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000085819143139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813796553363304d + "'", double1 == 0.8813796553363304d);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33), (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8495476049206573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3385886465842725d + "'", double1 == 1.3385886465842725d);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        double double2 = org.apache.commons.math.util.FastMath.atan2(44.99809670330265d, (-1.3818004626805414d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6014946556761336d + "'", double2 == 1.6014946556761336d);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8966854678967096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.376292861194926d + "'", double1 == 51.376292861194926d);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3495439910201015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.29494940570620637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29924457420349515d) + "'", double1 == (-0.29924457420349515d));
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.4203240110583195d) + "'", double1 == (-5.4203240110583195d));
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.468196043089957E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4681959929691923E-4d + "'", double1 == 2.4681959929691923E-4d);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0010578718449796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003524996777038d + "'", double1 == 1.0003524996777038d);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.397984377405469d + "'", double1 == 0.397984377405469d);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8323541239940268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6941601037894628d + "'", double1 == 0.6941601037894628d);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6180237337779616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.85525793289872d + "'", double1 == 1.85525793289872d);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        double double1 = org.apache.commons.math.util.FastMath.log10(48980.58846231743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.690023998518423d + "'", double1 == 4.690023998518423d);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.025881092186968428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3295225782386857d, (-0.4960691053839213d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4960691053839213d) + "'", double2 == (-0.4960691053839213d));
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0475388422900291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2499132869489415d + "'", double1 == 1.2499132869489415d);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.05663520630914342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.02263623983076541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2969610063487869d + "'", double1 == 1.2969610063487869d);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.045699465809971355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        double double2 = org.apache.commons.math.util.FastMath.max(11012.999999999996d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11012.999999999996d + "'", double2 == 11012.999999999996d);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9216936941393117d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.40308433762500984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6632349739413136d, 76.73862422940539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6632349739413137d + "'", double2 == 0.6632349739413137d);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4352296559186861d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017268598258962157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017270314988225264d + "'", double1 == 0.017270314988225264d);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.522076013060139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7131795469286212d) + "'", double1 == (-0.7131795469286212d));
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9065430375183643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3080187522246026E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        double double1 = org.apache.commons.math.util.FastMath.cosh(89.99999999999994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471588857E38d + "'", double1 == 6.102016471588857E38d);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4033482475752073d + "'", double1 == 1.4033482475752073d);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5378946274303924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9117659097492966d + "'", double1 == 0.9117659097492966d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.010625904569068452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010626304510220983d) + "'", double1 == (-0.010626304510220983d));
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.23018603204480417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22820026671210777d + "'", double1 == 0.22820026671210777d);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6682015101903132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7893309947689875d) + "'", double1 == (-0.7893309947689875d));
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5799604581126996d, 871.5850575920532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 871.5850575920532d + "'", double2 == 871.5850575920532d);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.931763225510739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9652788330377596d + "'", double1 == 0.9652788330377596d);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.3561944901923444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.356194490192344d) + "'", double1 == (-2.356194490192344d));
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3332504.6983135534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.712381921440457d + "'", double1 == 15.712381921440457d);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.44949479120381985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4661996943871322d + "'", double1 == 0.4661996943871322d);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6013.0d, 1.3132565042068824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6012.999999999999d + "'", double2 == 6012.999999999999d);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.010458920780344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0668535532697389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25856054082117574d + "'", double1 == 0.25856054082117574d);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5802053839637673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6554620324168675d + "'", double1 == 0.6554620324168675d);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        double double1 = org.apache.commons.math.util.FastMath.rint((-42.44851990227039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.0d) + "'", double1 == (-42.0d));
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.999999999999998d, 3.9733523361592433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996d + "'", double2 == 9.999999999999996d);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.09745867084955731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9979202349577406d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9979202349577405d + "'", double2 == 0.9979202349577405d);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.49602575992282094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4604631653887666d) + "'", double1 == (-0.4604631653887666d));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000004d + "'", double1 == 97.00000000000004d);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11.940141468803507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.208394781784533d + "'", double1 == 0.208394781784533d);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6755160819145565d + "'", double1 == 1.6755160819145565d);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5822681503789437d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10946554602560299d + "'", double1 == 0.10946554602560299d);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3136814122251812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0952081954995738d + "'", double1 == 1.0952081954995738d);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.601988246761649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }
}

