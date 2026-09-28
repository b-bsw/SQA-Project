package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.0724781822753713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07247818227537128d) + "'", double1 == (-0.07247818227537128d));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.359770220129362d, 0.589691795662765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5478119715206208d + "'", double2 == 0.5478119715206208d);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.037480427855015416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999297690985627d + "'", double1 == 0.999297690985627d);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8631635751882506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015065046370320606d) + "'", double1 == (-0.015065046370320606d));
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.179307969504034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 411.3440464772179d + "'", double1 == 411.3440464772179d);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.386184147329573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5447278554261825d + "'", double1 == 1.5447278554261825d);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        long long1 = org.apache.commons.math.util.FastMath.round(0.589691795662765d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5677239656717767d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8460294791347751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07261450409748528d) + "'", double1 == (-0.07261450409748528d));
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.058968184019892d + "'", double1 == 2.058968184019892d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9363862393833727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5440211108893683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26438424705757674d) + "'", double1 == (-0.26438424705757674d));
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.009206137707697834d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5664325882614676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004363724684235064d + "'", double1 == 0.004363724684235064d);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.6355590717614192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8804592237999825d) + "'", double1 == (-0.8804592237999825d));
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03169096295775694d, 1.7126526144249963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0027078409703792795d + "'", double2 == 0.0027078409703792795d);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.180265029949425E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4277255845837003E19d + "'", double1 == 1.4277255845837003E19d);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7254630513334037d + "'", double1 == 1.7254630513334037d);
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0003524996777038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841661388913715d + "'", double1 == 0.841661388913715d);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        double double1 = org.apache.commons.math.util.FastMath.log1p(155.88596569643704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.05551920829688d + "'", double1 == 5.05551920829688d);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.064947506970082E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.064947548056719E-9d + "'", double1 == 9.064947548056719E-9d);
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03799291018846901d, 1.5430805990186642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006432304228643252d + "'", double2 == 0.006432304228643252d);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.3818004626805414d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5019232260066885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40674643752602363d + "'", double1 == 0.40674643752602363d);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        double double1 = org.apache.commons.math.util.FastMath.exp(16.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7464014542177137E7d + "'", double1 == 1.7464014542177137E7d);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.044947095365984735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04493197511090111d + "'", double1 == 0.04493197511090111d);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6416439271862105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.005656701421335315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2474367440965453d) + "'", double1 == (-2.2474367440965453d));
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.838791173074587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9980574414724095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540800647713384d + "'", double1 == 1.540800647713384d);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4453238447142773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9960784226512511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.07108968196491d + "'", double1 == 57.07108968196491d);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.777872804388193d + "'", double1 == 0.777872804388193d);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.29807701278948945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3025106826548186d + "'", double1 == 0.3025106826548186d);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8895257804916458d), 1.9615319455195346d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9562768485549252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4931559611188556d + "'", double1 == 1.4931559611188556d);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.184438072585855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6893272594363028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012031030300912635d) + "'", double1 == (-0.012031030300912635d));
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6686000970514328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.30796374308433d + "'", double1 == 38.30796374308433d);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1017337E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 275.9683197201996d + "'", double1 == 275.9683197201996d);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02626982285800363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5445234815150057d + "'", double1 == 1.5445234815150057d);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5860134523134298E15d, 1.4160533322721292d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134295E15d + "'", double2 == 1.5860134523134295E15d);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9955924691418044E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6258415492713906d) + "'", double1 == (-0.6258415492713906d));
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.22820026671210777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2563369027010307d + "'", double1 == 0.2563369027010307d);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1343999713834352d + "'", double1 == 1.1343999713834352d);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.202456058843363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5054831794681595d + "'", double1 == 0.5054831794681595d);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.380291914558474E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24762801762061207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24510502223398353d + "'", double1 == 0.24510502223398353d);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999948217360899d, 1.5705465327319668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5669600933966268d + "'", double2 == 0.5669600933966268d);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09688642602692299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016909871346597345d + "'", double1 == 0.0016909871346597345d);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.055627941708065d) + "'", double1 == (-3.055627941708065d));
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6632349739413136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100.0f, (-0.7511679260882128d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5783078647775797d + "'", double2 == 1.5783078647775797d);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8466727901645837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8751810148205446d) + "'", double1 == (-1.8751810148205446d));
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999997649972645d, 0.7976186295363398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998125574358d + "'", double2 == 0.9999998125574358d);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8550196364002437d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8550196364002436d + "'", double2 == 0.8550196364002436d);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.3757524667023402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.367429073573161d) + "'", double1 == (-0.367429073573161d));
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8939092695313958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9454677517141428d + "'", double1 == 0.9454677517141428d);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9499521125352932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.443035058862805d + "'", double1 == 3.443035058862805d);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0347577566512203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.32821156205036844d), 1.1418636685458503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.32821156205036844d) + "'", double2 == (-0.32821156205036844d));
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.395766663829712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.395766663829712d + "'", double1 == 1.395766663829712d);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8089563172728976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.226191170883517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7860836567294904d) + "'", double1 == (-2.7860836567294904d));
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3080187522246026E-11d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8166592361428845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9555984013705581d) + "'", double1 == (-0.9555984013705581d));
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5378946274303924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2401187956927322d + "'", double1 == 1.2401187956927322d);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.12619156847664464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.010176922302104893d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.22612470361587986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003946620598193431d) + "'", double1 == (-0.003946620598193431d));
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5362739558005147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1538682481118263d + "'", double1 == 1.1538682481118263d);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0817889371810876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6043888810791588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.003987724140430841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003995685691646538d + "'", double1 == 0.003995685691646538d);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.03169096295775694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17801955779564485d + "'", double1 == 0.17801955779564485d);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.340782307793875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.822032341808321d + "'", double1 == 2.822032341808321d);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0806165313998193E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.028240960365167E31d + "'", double1 == 2.028240960365167E31d);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0711099922733015E-13d + "'", double1 == 4.0711099922733015E-13d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        long long1 = org.apache.commons.math.util.FastMath.abs(34L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5709739450023905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5095872708262084d + "'", double1 == 2.5095872708262084d);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        long long1 = org.apache.commons.math.util.FastMath.round(0.647848572923603d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2326303196791324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1732961462972105d + "'", double1 == 1.1732961462972105d);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9917694073609294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5472097319134629d + "'", double1 == 0.5472097319134629d);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6441818891668628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7652892660079903d + "'", double1 == 0.7652892660079903d);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0539849882470707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2602577590774198d + "'", double1 == 1.2602577590774198d);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.189396403106622E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6832092000707405d, (-0.5659403777711782d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6832092000707404d + "'", double2 == 0.6832092000707404d);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        double double1 = org.apache.commons.math.util.FastMath.atan(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269358083d + "'", double1 == 1.5707055269358083d);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        long long1 = org.apache.commons.math.util.FastMath.round(0.052614928267624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        double double2 = org.apache.commons.math.util.FastMath.min(1.557407710533861d, 1.451863517420987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.451863517420987d + "'", double2 == 1.451863517420987d);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9004252816353321d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.2589123923257013d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.658569792660318E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.719982772427445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7884010119012819d + "'", double1 == 1.7884010119012819d);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8726646259971648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3932795595790797d + "'", double1 == 2.3932795595790797d);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        double double2 = org.apache.commons.math.util.FastMath.max(3.443035058862805d, 0.7415933335367688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.443035058862805d + "'", double2 == 3.443035058862805d);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        double double2 = org.apache.commons.math.util.FastMath.min(114.09415978466134d, 0.9465846430649136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9465846430649136d + "'", double2 == 0.9465846430649136d);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021526945404933266d) + "'", double1 == (-0.021526945404933266d));
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.8246075608242496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1998.6364724075593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.834514805034d + "'", double1 == 0.834514805034d);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        double double2 = org.apache.commons.math.util.FastMath.atan2(240.0d, 0.9106833602395891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5670018310053042d + "'", double2 == 1.5670018310053042d);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5507, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.06267212238698011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06263110323617974d + "'", double1 == 0.06263110323617974d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.789199398154453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.789199398154453d + "'", double1 == 2.789199398154453d);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.10955796484928033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10977832693721898d) + "'", double1 == (-0.10977832693721898d));
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.48243212226262994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31656378283939074d) + "'", double1 == (-0.31656378283939074d));
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.041795741632459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8911152217347937d) + "'", double1 == (-0.8911152217347937d));
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        double double1 = org.apache.commons.math.util.FastMath.rint(23.140692632779267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1782893802790361E11d, 155.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        double double1 = org.apache.commons.math.util.FastMath.atan(5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706217938714693d + "'", double1 == 1.5706217938714693d);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.000000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        long long1 = org.apache.commons.math.util.FastMath.abs((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.367429073573161d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3849084105029866d) + "'", double1 == (-0.3849084105029866d));
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        double double2 = org.apache.commons.math.util.FastMath.max(5.192987713658941d, 0.5705905238526439d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.192987713658941d + "'", double2 == 5.192987713658941d);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.015228681040735291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015229269668383628d + "'", double1 == 0.015229269668383628d);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.005656731589213858d, 0.8110535914763489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005656731589213859d + "'", double2 == 0.005656731589213859d);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9171529904029506d, 0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.95887644469623d + "'", double2 == 0.95887644469623d);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.944593378545059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8416476040596701d + "'", double1 == 0.8416476040596701d);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.468196043089957E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        long long2 = org.apache.commons.math.util.FastMath.min((-34L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.473182712567381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1682566138750802d + "'", double1 == 0.1682566138750802d);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        double double1 = org.apache.commons.math.util.FastMath.asin(103.70899308565303d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7820302396610385d, (-0.178332580483657d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7820302396610384d + "'", double2 == 0.7820302396610384d);
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1830110809448033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        long long1 = org.apache.commons.math.util.FastMath.round(9.214782272526239E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        double double1 = org.apache.commons.math.util.FastMath.cosh(54.58021619598075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.528463678408588E23d + "'", double1 == 2.528463678408588E23d);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6733112569964226d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6441005621312442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8025587593013014d + "'", double1 == 0.8025587593013014d);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9188537484079635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        double double1 = org.apache.commons.math.util.FastMath.atanh(132058.36709719698d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3359940102659614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5796499031880894d + "'", double1 == 0.5796499031880894d);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4416883280587693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4150429164256951d + "'", double1 == 0.4150429164256951d);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.367810338251989d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.009213268486503402d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7507264043739388d + "'", double1 == 0.7507264043739388d);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.899437456983869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.53397022115522d + "'", double1 == 51.53397022115522d);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.14604584158491757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6104048481741295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1320498199325564d + "'", double1 == 3.1320498199325564d);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5507, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.059976116562831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.845782423829181d + "'", double1 == 6.845782423829181d);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.129071417624954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0625777230983877d + "'", double1 == 1.0625777230983877d);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.009213268484290538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213007810235053d) + "'", double1 == (-0.009213007810235053d));
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.25569770210804E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        double double1 = org.apache.commons.math.util.FastMath.floor(90.3017607496092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        double double1 = org.apache.commons.math.util.FastMath.floor(51.267151353526884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7423006914399841d, 6.191967820742884E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6289834386711253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2642451658304492d + "'", double1 == 1.2642451658304492d);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6969795110075692d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6969795110075692d + "'", double1 == 0.6969795110075692d);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.605447386361209E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3602555837405309d + "'", double1 == 0.3602555837405309d);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        double double1 = org.apache.commons.math.util.FastMath.log(0.005202425297685838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.258630358725892d) + "'", double1 == (-5.258630358725892d));
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09629957714903337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016807446895289264d + "'", double1 == 0.0016807446895289264d);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        double double2 = org.apache.commons.math.util.FastMath.max(12.0d, (-10.883386029766116d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6271680854142649d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 6013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6013.0f + "'", float2 == 6013.0f);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.544137102816975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1234764057138893d + "'", double1 == 3.1234764057138893d);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.5095872708262084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3589415190408363d + "'", double1 == 1.3589415190408363d);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        double double1 = org.apache.commons.math.util.FastMath.cosh(91.78724175669423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.644706895122267E39d + "'", double1 == 3.644706895122267E39d);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.19991954732456702d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7637216000753616d, (-0.1503666979359498d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7651966357934326d + "'", double2 == 1.7651966357934326d);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7652892660079903d, 47.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01628131156534464d + "'", double2 == 0.01628131156534464d);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        long long2 = org.apache.commons.math.util.FastMath.max(5507L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.8645635938864005d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8645635938864005d + "'", double1 == 1.8645635938864005d);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2028882366758453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9330817719775168d) + "'", double1 == (-0.9330817719775168d));
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(51.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8901179185171081d + "'", double1 == 0.8901179185171081d);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5748247386416045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.1420681583893964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.989925281440789d + "'", double1 == 0.989925281440789d);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 71L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71 + "'", int1 == 71);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        double double2 = org.apache.commons.math.util.FastMath.min(0.10475317834218718d, 1.433815708350771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10475317834218718d + "'", double2 == 0.10475317834218718d);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9159682453057105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        double double1 = org.apache.commons.math.util.FastMath.ceil(16.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        double double2 = org.apache.commons.math.util.FastMath.min(99.99999999999996d, 1.385330775230143E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999996d + "'", double2 == 99.99999999999996d);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4931559611188556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3378917247652664d + "'", double1 == 2.3378917247652664d);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5185956241330958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47661538415315335d + "'", double1 == 0.47661538415315335d);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9072942488780497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.639057329615258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2037005703909553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0971328863865832d + "'", double1 == 1.0971328863865832d);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.463960152516967d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4320632796393198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 9.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8832248240979842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7963459334455114d + "'", double1 == 0.7963459334455114d);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        double double1 = org.apache.commons.math.util.FastMath.floor(49.81533496265541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        float float2 = org.apache.commons.math.util.FastMath.min(802.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7764076780850522d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.48488313582535d) + "'", double1 == (-44.48488313582535d));
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.3402145963603704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1669696685421218d + "'", double1 == 1.1669696685421218d);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4666679623365474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5058021122366747d + "'", double1 == 0.5058021122366747d);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        double double1 = org.apache.commons.math.util.FastMath.log(1.551565975503502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4392647276912034d + "'", double1 == 0.4392647276912034d);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 29L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9990282485857992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7611857431657096d + "'", double1 == 0.7611857431657096d);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6020599913279624d, 0.0012070607874443988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6020599913279624d + "'", double2 == 0.6020599913279624d);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.12619156847664464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1344994818046337d + "'", double1 == 0.1344994818046337d);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0069604799381786375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        int int2 = org.apache.commons.math.util.FastMath.min(7, 6013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.20262627828929064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18341664066254693d) + "'", double1 == (-0.18341664066254693d));
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015174618802134707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1067486750760071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10634594802233763d) + "'", double1 == (-0.10634594802233763d));
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.855146420814099d + "'", double1 == 3.855146420814099d);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2191734374167393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2191734374167393d + "'", double1 == 1.2191734374167393d);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8482836399575128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7501465304010305d + "'", double1 == 0.7501465304010305d);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.07365470632758757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07365470632758757d + "'", double1 == 0.07365470632758757d);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.9955924691418044E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.33333333333333d + "'", double1 == 33.33333333333333d);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2077341857639758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0989696018380017d + "'", double1 == 1.0989696018380017d);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4664203335966488d, 1.517101195721465d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4664203335966488d + "'", double2 == 1.4664203335966488d);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.017455951415885344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454178737585178d + "'", double1 == 0.017454178737585178d);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1542738581313687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06230885991602587d + "'", double1 == 0.06230885991602587d);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.10214098560127556d, (-0.22649705709056728d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.676537508415039d + "'", double2 == 1.676537508415039d);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        double double2 = org.apache.commons.math.util.FastMath.max(13.026012785332021d, 89.99999999999994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.99999999999994d + "'", double2 == 89.99999999999994d);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.567700411154953d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8157584261849007d, 1.85525793289872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7746387500310367d + "'", double2 == 0.7746387500310367d);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3621252723796604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(23.628351601695016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8695324583962805d + "'", double1 == 2.8695324583962805d);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021347E41d + "'", double1 == 6.691673596021347E41d);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9543698520048144d, 0.9652788330377596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9543698520048145d + "'", double2 == 0.9543698520048145d);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1371714489930431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01984738594460336d + "'", double1 == 0.01984738594460336d);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0806165313998193E47d, 6.708203923697058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1022931929401623d, (-0.01220925920246869d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1022931929401623d + "'", double2 == 1.1022931929401623d);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        double double1 = org.apache.commons.math.util.FastMath.log(4.239546047417951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4444561992238574d + "'", double1 == 1.4444561992238574d);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.490762386278728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        double double2 = org.apache.commons.math.util.FastMath.max(17.005468132343413d, 0.011658811940024915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.005468132343413d + "'", double2 == 17.005468132343413d);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7427127147632668d + "'", double1 == 0.7427127147632668d);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5498264316201034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5981526294336509d) + "'", double1 == (-0.5981526294336509d));
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9685252333342943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6772846498789568d + "'", double1 == 0.6772846498789568d);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1857099144018891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18464428771734653d + "'", double1 == 0.18464428771734653d);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42144882472748396d + "'", double1 == 0.42144882472748396d);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        double double1 = org.apache.commons.math.util.FastMath.log(104.94284158531252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.653415836082472d + "'", double1 == 4.653415836082472d);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        double double1 = org.apache.commons.math.util.FastMath.log10(49.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6901960800285136d + "'", double1 == 1.6901960800285136d);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 29.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0601456127484035d + "'", double1 == 4.0601456127484035d);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.51685295210541d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        long long1 = org.apache.commons.math.util.FastMath.round(0.030289126640769458d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0709446474695995d, 0.9966134982981695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9966134982981695d + "'", double2 == 0.9966134982981695d);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2589123923257013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.13036685698037d + "'", double1 == 72.13036685698037d);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.7182818284590455d, 0.3073157296860899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.718281828459045d + "'", double2 == 3.718281828459045d);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5577658169136215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9150577654397632d + "'", double1 == 0.9150577654397632d);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5710374582913385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9816204068070169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0171325081035486d + "'", double1 == 0.0171325081035486d);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.7159162242099002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3604833687127776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30784005477304416d + "'", double1 == 0.30784005477304416d);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813076357488236d + "'", double1 == 0.8813076357488236d);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.017455951415885344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4551255597896954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        int int2 = org.apache.commons.math.util.FastMath.min(6013, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8054616704388724d, 3.555555555555555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.463380064402346d + "'", double2 == 0.463380064402346d);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.698584275341739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.0689089720128332d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        double double2 = org.apache.commons.math.util.FastMath.pow(153298.37563315977d, (-0.4857089771942523d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003029269128215333d + "'", double2 == 0.003029269128215333d);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5515659755035025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3202601476609297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7637144409979837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1917236873124888d) + "'", double1 == (-0.1917236873124888d));
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.021873826022441593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997607774060867d + "'", double1 == 0.9997607774060867d);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6692896481323396d, 0.45639522978117497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9723148318154615d + "'", double2 == 0.9723148318154615d);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.19955016702389086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19955016702389086d + "'", double1 == 0.19955016702389086d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3893722612835904d + "'", double1 == 0.3893722612835904d);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6297804583695628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.4855215610041086d), (-0.8466727901645837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.088827002165164d) + "'", double2 == (-2.088827002165164d));
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1544346900318834d + "'", double1 == 2.1544346900318834d);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4364668701002334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8905489858768362d + "'", double1 == 0.8905489858768362d);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.009213398835148425d), (-1.4359888346861434d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009213398835148427d) + "'", double2 == (-0.009213398835148427d));
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0027745037427485417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.84242254198678E-5d + "'", double1 == 4.84242254198678E-5d);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5520883433674828d) + "'", double1 == (-0.5520883433674828d));
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.15091034527843197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15033819350970476d + "'", double1 == 0.15033819350970476d);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.929562688685152d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.761141324937585d + "'", double1 == 4.761141324937585d);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        long long1 = org.apache.commons.math.util.FastMath.abs(6013L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6013L + "'", long1 == 6013L);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        double double2 = org.apache.commons.math.util.FastMath.max(2.4922458983356286d, 0.3649245612979685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4922458983356286d + "'", double2 == 2.4922458983356286d);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.054839968556690856d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226350743220142d + "'", double1 == 0.9226350743220142d);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9366895107550345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5545058162986882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6682852486118039d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.8645906008931825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1549596372375482d + "'", double1 == 0.1549596372375482d);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0022422116185679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5384141932424149d + "'", double1 == 0.5384141932424149d);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.079986011890955E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000090803982551d + "'", double1 == 1.000090803982551d);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0432322944097694d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.27492709475956467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3164346963809397d + "'", double1 == 1.3164346963809397d);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        double double1 = org.apache.commons.math.util.FastMath.log(96.11528190732773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5655483242216715d + "'", double1 == 4.5655483242216715d);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9984979022832193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8406584489487949d) + "'", double1 == (-0.8406584489487949d));
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.02710278633615723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.730328580304744E-4d) + "'", double1 == (-4.730328580304744E-4d));
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.651648854985254E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.882671060628704E96d + "'", double1 == 2.882671060628704E96d);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        double double1 = org.apache.commons.math.util.FastMath.atanh(46.81563844808717d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6554620324168675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7927663921466835d + "'", double1 == 0.7927663921466835d);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.0539731556403096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2401187956927322d, 0.0691594887363018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0691594887363018d + "'", double2 == 0.0691594887363018d);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.11906841651727786d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.310832494432086d + "'", double1 == 1.310832494432086d);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1195215262618592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0383509140640779d + "'", double1 == 1.0383509140640779d);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        long long1 = org.apache.commons.math.util.FastMath.round(2.334466355854698E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 29.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.072316825685847d + "'", double1 == 3.072316825685847d);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6367696710046598d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0127181307982251d) + "'", double1 == (-1.0127181307982251d));
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, (float) (-34L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.162447344686678d, 0.6361176917519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.07008782270102d + "'", double2 == 1.07008782270102d);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.030679593441180375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0004706556416805d + "'", double1 == 1.0004706556416805d);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09492219498557733d + "'", double1 == 0.09492219498557733d);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 11014L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1083832032431884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1341027206718943d + "'", double1 == 1.1341027206718943d);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        long long2 = org.apache.commons.math.util.FastMath.max(90L, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2957349683831911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.963688479552775d + "'", double1 == 1.963688479552775d);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000072050412114d, 0.16455982144634757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000072050412114d + "'", double2 == 1.0000072050412114d);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.33314442015824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.571865319731872d + "'", double1 == 7.571865319731872d);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3321790415848608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055680642428974d + "'", double1 == 1.055680642428974d);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5604874136486533d, (-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.560487413648653d + "'", double2 == 1.560487413648653d);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5405025668761214d), 2.8193451511126453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5000784749896207d) + "'", double2 == (-0.5000784749896207d));
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-34L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34) + "'", int1 == (-34));
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.952027174244469d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 17L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8498295893693415d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7511679260882128d) + "'", double1 == (-0.7511679260882128d));
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.759438473838613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.424779396119348d) + "'", double1 == (-1.424779396119348d));
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.8019245746239465d), (double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5066805036121624d) + "'", double1 == (-1.5066805036121624d));
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9982900983985065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017423449107112108d + "'", double1 == 0.017423449107112108d);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9186711278102441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58044350973429d + "'", double1 == 1.58044350973429d);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.079573806109243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055310567108d + "'", double1 == 1.5707055310567108d);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0320977775721407d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 17, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3808196560341963d + "'", double1 == 1.3808196560341963d);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.10955796484928033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10933892659284458d) + "'", double1 == (-0.10933892659284458d));
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        double double1 = org.apache.commons.math.util.FastMath.log(57.33314442015824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.048878893142675d + "'", double1 == 4.048878893142675d);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.005656731589213857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00565670142172144d + "'", double1 == 0.00565670142172144d);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6220107246567897d, 3.1371883631628275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19573166520889d + "'", double2 == 0.19573166520889d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6013, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3506939960346185d, (-4.1898842314256335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.350693996034618d + "'", double2 == 2.350693996034618d);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5540437953657898d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.06783547514661402d), 0.4601456216040868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4601456216040868d + "'", double2 == 0.4601456216040868d);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7010319566582488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.634929278365202d) + "'", double1 == (-7.634929278365202d));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7507264043739388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6937282027503668d + "'", double1 == 0.6937282027503668d);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        double double1 = org.apache.commons.math.util.FastMath.cos(31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.842739274527738d + "'", double1 == 0.842739274527738d);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.444667861009766d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5350603518451278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.625375731261228d) + "'", double1 == (-0.625375731261228d));
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        long long1 = org.apache.commons.math.util.FastMath.round(1.000000000000003d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.632331993326186d) + "'", double1 == (-31.632331993326186d));
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        double double2 = org.apache.commons.math.util.FastMath.max(0.013601830198002032d, 0.6377640601517165d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6377640601517165d + "'", double2 == 0.6377640601517165d);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.4750855248827862d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8013537820571914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.338638474191655d + "'", double1 == 1.338638474191655d);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7893309947689875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-45.22533463912584d) + "'", double1 == (-45.22533463912584d));
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.021278590635779138d, 2.2199734862326173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9412321741869626E-4d + "'", double2 == 1.9412321741869626E-4d);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 71, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 71L + "'", long2 == 71L);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        double double1 = org.apache.commons.math.util.FastMath.asin((-49.27834704137805d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.763714440997984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.332682002166082d + "'", double1 == 1.332682002166082d);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        int int2 = org.apache.commons.math.util.FastMath.min(33, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.6019882467616493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.33452691736804824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2885768600359788d + "'", double1 == 0.2885768600359788d);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.522076013060139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4017581716720705d + "'", double1 == 0.4017581716720705d);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9615319455195346d, 66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615319455195346d + "'", double2 == 1.9615319455195346d);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01378859300458183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013787719217586427d + "'", double1 == 0.013787719217586427d);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0017927433227146066d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double2 = org.apache.commons.math.util.FastMath.pow(50.71062398595127d, (-0.7193708484374041d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05934737555189802d + "'", double2 == 0.05934737555189802d);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        double double1 = org.apache.commons.math.util.FastMath.floor(56.72239180482502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.10955796484928035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33099541514842823d + "'", double1 == 0.33099541514842823d);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.585445079827193E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2870787948203515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.846133054665852d + "'", double1 == 9.846133054665852d);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-42.44851990227039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2432.121036977171d) + "'", double1 == (-2432.121036977171d));
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.91882856777121d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(26.28604042479942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9733204907122466d + "'", double1 == 2.9733204907122466d);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5405025668761212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21427338765548834d + "'", double1 == 0.21427338765548834d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.40834357456474796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3424142439948819d + "'", double1 == 0.3424142439948819d);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.44721359549995804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4205343352839652d + "'", double1 == 0.4205343352839652d);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2532779128893359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8492002634157022d + "'", double1 == 0.8492002634157022d);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8958467800237574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46046316538876664d + "'", double1 == 0.46046316538876664d);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5561700507428916d + "'", double1 == 0.5561700507428916d);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4865138719659448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4691170499217469d + "'", double1 == 0.4691170499217469d);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.227020537235472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.227020537235472d + "'", double1 == 2.227020537235472d);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6632349739413137d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2924014765439716d, 1.3329722006465776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2159402662070575d + "'", double2 == 0.2159402662070575d);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.970861181982808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5645889449111796d + "'", double1 == 0.5645889449111796d);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.009528896033633612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5612672865516335d + "'", double1 == 1.5612672865516335d);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1732961462972105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7762449765246209d + "'", double1 == 0.7762449765246209d);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.013277527411913046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000881476620582d + "'", double1 == 1.0000881476620582d);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3972836236549895d + "'", double1 == 0.3972836236549895d);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.094712547261101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5707963267948961d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7749339485040656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9792875536939664d + "'", double1 == 0.9792875536939664d);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.4710393075566005E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.49713280602321935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.8751810148205446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5705465327319668d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.4615926968669573E-293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4615926968669573E-293d + "'", double1 == 2.4615926968669573E-293d);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6432049175981438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.605518178838189d) + "'", double1 == (-0.605518178838189d));
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007263132469506306d) + "'", double1 == (-0.007263132469506306d));
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5362739558005147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.21603037828958d + "'", double1 == 2.21603037828958d);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.005402996770772377d, 9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402996770772376d + "'", double2 == 0.005402996770772376d);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.030891934230224072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17576101453457782d + "'", double1 == 0.17576101453457782d);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211074304587d) + "'", double1 == (-0.5440211074304587d));
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6287196733940792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.87520816275122d + "'", double1 == 1.87520816275122d);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9117659097492966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6123506008988511d + "'", double1 == 0.6123506008988511d);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.743521917312986d), (-0.7368371597382015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7368371597382015d) + "'", double2 == (-0.7368371597382015d));
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.46025618298802606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4602561829880261d + "'", double1 == 0.4602561829880261d);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0078886023836056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        double double1 = org.apache.commons.math.util.FastMath.log1p(56.080597841306755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.044464266297773d + "'", double1 == 4.044464266297773d);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8285569054478337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015185626807227555d, 0.21446015940491509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07069062799992493d + "'", double2 == 0.07069062799992493d);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        double double1 = org.apache.commons.math.util.FastMath.cosh(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.12619156847664464d), 2.477888730288475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12619156847664464d) + "'", double2 == (-0.12619156847664464d));
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7868773786253227d + "'", double1 == 0.7868773786253227d);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3972836236549895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9221154013608778d + "'", double1 == 0.9221154013608778d);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 6013);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6013L + "'", long1 == 6013L);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        double double1 = org.apache.commons.math.util.FastMath.log(0.06406001577433591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7479348885580097d) + "'", double1 == (-2.7479348885580097d));
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        double double2 = org.apache.commons.math.util.FastMath.min(0.027411208051953715d, (-0.008491519610769879d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008491519610769879d) + "'", double2 == (-0.008491519610769879d));
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1956282198912025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0986966500665631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4407143401175706d + "'", double1 == 0.4407143401175706d);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7456241416655577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8166592361428843d) + "'", double1 == (-0.8166592361428843d));
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2906564430950338E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.30685281944005d + "'", double1 == 46.30685281944005d);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.46285676099588835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7820302396610384d, 0.13018704579946147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9684988045470814d + "'", double2 == 0.9684988045470814d);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        double double1 = org.apache.commons.math.util.FastMath.sin(15.260465219302375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43271130022589366d + "'", double1 == 0.43271130022589366d);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1063134264787278E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.690758847751954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 17L, (float) 71);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3602555837405309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8890349204664698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428864833406352d + "'", double1 == 0.9428864833406352d);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.09492219498557733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004508495238238d + "'", double1 == 1.004508495238238d);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0113012745810993E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.9664273046815d + "'", double1 == 55.9664273046815d);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.01334260688846816d, 2.386923871918913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.350365982047363E-5d + "'", double2 == 3.350365982047363E-5d);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.011669273072701132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011669537926844888d + "'", double1 == 0.011669537926844888d);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        float float2 = org.apache.commons.math.util.FastMath.min(11014.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.2640971787204141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2640971787204141d + "'", double2 == 0.2640971787204141d);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 11014L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000069652443239d + "'", double1 == 10.000069652443239d);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777765d + "'", double1 == 10.067661995777765d);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9979202349577406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.005402970483247057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005402944196258899d + "'", double1 == 0.005402944196258899d);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9913289180781171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.79896311514624d + "'", double1 == 56.79896311514624d);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5382334032499028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8708690291361337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.020729591857664022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020731076784300594d + "'", double1 == 0.020731076784300594d);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7467135528742425E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.99999999999999d + "'", double1 == 44.99999999999999d);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.015342654774711285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015341451072796088d) + "'", double1 == (-0.015341451072796088d));
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.015174618802134707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015175783657808091d + "'", double1 == 0.015175783657808091d);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        double double1 = org.apache.commons.math.util.FastMath.atan((-9.513484761488917E139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.9188537484079635d, 1.1542738581313687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4433600510824878d + "'", double2 == 3.4433600510824878d);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.3835903387282156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.29494940570620637d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8889456229033981d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02181661564992912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021820077951851258d + "'", double1 == 0.021820077951851258d);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.12873439758804212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002246839098482782d) + "'", double1 == (-0.002246839098482782d));
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.32410684590028493d, 1.1525354798260945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27292969817782287d + "'", double2 == 0.27292969817782287d);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7080583105044882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 29, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }
}

