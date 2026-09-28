package org.apache.commons.math.util;

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.4833023923748323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.989995813684211d) + "'", double1 == (-0.989995813684211d));
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.1830110809448033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5746813724695927d) + "'", double1 == (-0.5746813724695927d));
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.008983023749580713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000403476291617d + "'", double1 == 1.0000403476291617d);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8720836498654725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6270520618142631d + "'", double1 == 0.6270520618142631d);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.06722830713210516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.851898262478877d + "'", double1 == 3.851898262478877d);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.354638711533299d + "'", double1 == 0.354638711533299d);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9738051722046778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        double double1 = org.apache.commons.math.util.FastMath.atan((-5.195945676325781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3806633393658063d) + "'", double1 == (-1.3806633393658063d));
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8325008986719311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2990612758127336d + "'", double1 == 1.2990612758127336d);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.194315997789401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6137261894007203d + "'", double1 == 0.6137261894007203d);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.999448616881847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6682015101903132d), 2.46819606815034E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.668201510190313d) + "'", double2 == (-0.668201510190313d));
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0000145960805298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000004865336505d + "'", double1 == 1.000004865336505d);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.647848572923603d + "'", double1 == 0.647848572923603d);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5309649148733837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5562675674585421d + "'", double1 == 0.5562675674585421d);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        int int1 = org.apache.commons.math.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5562675674585421d, 1.367918055200995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44830029897233037d + "'", double2 == 0.44830029897233037d);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        double double1 = org.apache.commons.math.util.FastMath.tanh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.9952004122082412d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3280247521861903d, (-0.016996106527921995d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9951899344229606d + "'", double2 == 0.9951899344229606d);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5175807674647721d) + "'", double1 == (-0.5175807674647721d));
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6881171418161356E43d, 0.6686000970514328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5150224550074456d + "'", double1 == 3.5150224550074456d);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999067329932104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999689100311606d + "'", double1 == 0.9999689100311606d);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7346773280347003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24762801762061207d + "'", double1 == 0.24762801762061207d);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999974706003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707252015575928d + "'", double1 == 1.5707252015575928d);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6580161192200634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4185258506619445d) + "'", double1 == (-0.4185258506619445d));
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.918853748407957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.520046655456152d + "'", double1 == 17.520046655456152d);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10, 46.2263037084224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9110895402590333d + "'", double1 == 0.9110895402590333d);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        long long1 = org.apache.commons.math.util.FastMath.round(37.21392919076789d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.11400146268484936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11375468959206643d) + "'", double1 == (-0.11375468959206643d));
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        double double2 = org.apache.commons.math.util.FastMath.pow(37.574240039999225d, 1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.710623985951266d + "'", double2 == 50.710623985951266d);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7047567822517626d, 2.4855874989531728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4855874989531728d + "'", double2 == 2.4855874989531728d);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2990612758127336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2616419081022748d + "'", double1 == 0.2616419081022748d);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.008491621659255943d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008491519610769877d) + "'", double1 == (-0.008491519610769877d));
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8922451992629652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8922451992629653d + "'", double1 == 0.8922451992629653d);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334224771468441d + "'", double1 == 0.8334224771468441d);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        double double2 = org.apache.commons.math.util.FastMath.min((-5.124738597288386E-4d), 5.872732826701256E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.124738597288386E-4d) + "'", double2 == (-5.124738597288386E-4d));
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.473182712567381d + "'", double1 == 1.473182712567381d);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-32.267649876135856d), 0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5557490923207962d) + "'", double2 == (-1.5557490923207962d));
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.3586387116292378d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9185957173539763d + "'", double1 == 0.9185957173539763d);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.549516130084085d + "'", double1 == 1.549516130084085d);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        long long1 = org.apache.commons.math.util.FastMath.round(0.24762801762061207d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.44851990227039d) + "'", double1 == (-42.44851990227039d));
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6610060414837632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6204290412244261d + "'", double1 == 0.6204290412244261d);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0691594887363018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012070607874443988d + "'", double1 == 0.0012070607874443988d);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9155040003582885E22d, 1.0438800790430118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9155040003582885E22d + "'", double2 == 1.9155040003582885E22d);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2022162221140908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0964562107599605d + "'", double1 == 1.0964562107599605d);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.1830110809448033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 125.07732156842896d + "'", double1 == 125.07732156842896d);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        double double1 = org.apache.commons.math.util.FastMath.log(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.657359027997266d) + "'", double1 == (-34.657359027997266d));
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        double double2 = org.apache.commons.math.util.FastMath.min(3.834046549311538E43d, 0.3331559825783589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3331559825783589d + "'", double2 == 0.3331559825783589d);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.06558580471017249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06783547514661402d) + "'", double1 == (-0.06783547514661402d));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5515659755035025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01745417862959511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.46346031073593d + "'", double1 == 7.46346031073593d);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.3818004626805416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9821933800072388d) + "'", double1 == (-0.9821933800072388d));
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.06820006471439112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4085654100084491d + "'", double1 == 0.4085654100084491d);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.012209562553744129d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012208955900931634d) + "'", double1 == (-0.012208955900931634d));
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.694813279936381d + "'", double1 == 2.694813279936381d);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5378946274303926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1542738581313687d + "'", double1 == 1.1542738581313687d);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        double double1 = org.apache.commons.math.util.FastMath.ceil(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.052518065881558766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7853981633974482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067826440032d + "'", double1 == 0.7071067826440032d);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948961d + "'", double1 == 1.5707963267948961d);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.0432322944097698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.613775297505947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.263196996773619d + "'", double1 == 2.263196996773619d);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        double double1 = org.apache.commons.math.util.FastMath.floor((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4063917980622467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526997202405776d + "'", double1 == 0.9526997202405776d);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.931763225510739d + "'", double1 == 0.931763225510739d);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.3477990933099977d, (-0.23641824551800447d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3477990933099973d + "'", double2 == 3.3477990933099973d);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3010299956639812d, 1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23669574761529574d + "'", double2 == 0.23669574761529574d);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.515582944293113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.674614424237458d + "'", double1 == 1.674614424237458d);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.267365292027d) + "'", double1 == (-2.267365292027d));
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8065537826828391d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6580161192200634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6179330631483282d + "'", double1 == 0.6179330631483282d);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5430806348152437d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0154861513366447d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0565321053670247d, (-0.16429734860675368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8882856957001204d + "'", double2 == 0.8882856957001204d);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.720075976020836E-43d + "'", double1 == 3.720075976020836E-43d);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6814106311611626d + "'", double1 == 0.6814106311611626d);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5882496193148399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20091875991192137d + "'", double1 == 0.20091875991192137d);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6881171418161356E43d, (-4.187482763357499d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3801753953415168E-182d + "'", double2 == 1.3801753953415168E-182d);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-323.0051853474518d), 4.707836221164656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-323.00518534745174d) + "'", double2 == (-323.00518534745174d));
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442157056960552d + "'", double1 == 0.9442157056960552d);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.4626264090759076d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.940021456376382d + "'", double1 == 0.940021456376382d);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 90L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508801680230075d + "'", double1 == 0.6508801680230075d);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5840734641020677d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.4855874989531728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39542905600596706d + "'", double1 == 0.39542905600596706d);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.98714636101983d + "'", double1 == 9.98714636101983d);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213268486503402d) + "'", double1 == (-0.009213268486503402d));
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.468196043089957E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103465364555801d + "'", double1 == 2.103465364555801d);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01530032932138615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015417978618561132d + "'", double1 == 0.015417978618561132d);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132565042068824d + "'", double1 == 1.3132565042068824d);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1416876847493498d, 11.940141468803507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.865450952848139d + "'", double2 == 4.865450952848139d);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5405025668761214d), 1.5378946274303926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5405025668761212d) + "'", double2 == (-1.5405025668761212d));
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        double double2 = org.apache.commons.math.util.FastMath.min(9.079985986933499E-5d, 2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.079985986933499E-5d + "'", double2 == 9.079985986933499E-5d);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9050824179664846d + "'", double1 == 0.9050824179664846d);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.445323844714277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1251435150698329d + "'", double1 == 0.1251435150698329d);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0475388422900291d + "'", double1 == 1.0475388422900291d);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        double double2 = org.apache.commons.math.util.FastMath.max(3.2710663101885897d, 0.5840734641020677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709825806045d + "'", double1 == 0.8414709825806045d);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        double double1 = org.apache.commons.math.util.FastMath.floor(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7017425096437429d) + "'", double1 == (-0.7017425096437429d));
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5574077246549023d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1435074.2840743547d + "'", double2 == 1435074.2840743547d);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11.940141468803507d, 1.2281786100136092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4682955026240894d + "'", double2 == 1.4682955026240894d);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7786671247869191d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6416439271862105d), 1.7453292519943298d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6416439271862104d) + "'", double2 == (-0.6416439271862104d));
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.46025618298802606d, 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04599315997198159d + "'", double2 == 0.04599315997198159d);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.132601058453798d, (-0.685230123174956d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5951428498639341d + "'", double2 == 0.5951428498639341d);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.43450228702824d, 0.6657737487535582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.448895063159511d + "'", double2 == 1.448895063159511d);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.000004865336505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718295053847029d + "'", double1 == 2.718295053847029d);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5113565640720369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47100149383084566d) + "'", double1 == (-0.47100149383084566d));
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.188688139030402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23018603204480417d + "'", double1 == 0.23018603204480417d);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.31868510059102656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.051211323930365d + "'", double1 == 1.051211323930365d);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        double double1 = org.apache.commons.math.util.FastMath.exp(35.44341522934086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4710393075566005E15d + "'", double1 == 2.4710393075566005E15d);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.10990588764248074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6809246903215531d + "'", double1 == 1.6809246903215531d);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8211080655056973d), 1.5515659755035025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.48674355529070396d) + "'", double2 == (-0.48674355529070396d));
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194232725E-6d + "'", double1 == 1.5847565194232725E-6d);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        double double1 = org.apache.commons.math.util.FastMath.abs((-3.0321124266229886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0321124266229886d + "'", double1 == 3.0321124266229886d);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0393938154819877d + "'", double1 == 2.0393938154819877d);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.12552491762180948d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2966288756752378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.555555555555555d + "'", double1 == 3.555555555555555d);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0565321053670247d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        double double2 = org.apache.commons.math.util.FastMath.pow(630998.4197775756d, (-1.8916039409537213d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0681780852520792E-11d + "'", double2 == 1.0681780852520792E-11d);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7047567822517627d + "'", double1 == 0.7047567822517627d);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        double double2 = org.apache.commons.math.util.FastMath.min(0.35430360994810484d, 0.055410749812933396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.055410749812933396d + "'", double2 == 0.055410749812933396d);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5249037881284782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40838771824645015d) + "'", double1 == (-0.40838771824645015d));
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.103465364555801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1034653645558015d + "'", double1 == 2.1034653645558015d);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3648280517791587E-23d + "'", double1 == 3.3648280517791587E-23d);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5155829442931129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1358834053983713d + "'", double1 == 1.1358834053983713d);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6483608274590867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.276225755267126d + "'", double1 == 2.276225755267126d);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646284d + "'", double1 == 1.5395564933646284d);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9738051722046778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8270307983194575d) + "'", double1 == (-0.8270307983194575d));
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.433803554543751d + "'", double1 == 3.433803554543751d);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5507L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5507 + "'", int1 == 5507);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.12552491762180948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12585691605953508d) + "'", double1 == (-0.12585691605953508d));
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32L, 2.0898120925088963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5055823053323238d + "'", double2 == 1.5055823053323238d);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-55.79430724113828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.016627609179162d + "'", double1 == 11.016627609179162d);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.10178798778736835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10214098560127556d + "'", double1 == 0.10214098560127556d);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6557942026326724d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.555555555555555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5262856567377758d + "'", double1 == 1.5262856567377758d);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.74050723741301d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7405072374130097d) + "'", double1 == (-1.7405072374130097d));
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.14977507862289408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6035270795055018d, (-6.755849220270756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.052495160685712d + "'", double2 == 3.052495160685712d);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6852301231749561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8816146848906149d) + "'", double1 == (-0.8816146848906149d));
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9526997202405776d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 5507.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.0d + "'", double1 == 5507.0d);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913289158005998d + "'", double1 == 0.9913289158005998d);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5847565194232725E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219106381574E-8d + "'", double1 == 2.7659219106381574E-8d);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963267803446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6532070891002518d + "'", double1 == 0.6532070891002518d);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4959438633913105d + "'", double1 == 2.4959438633913105d);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(630998.4197775756d, (-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 630998.4197775755d + "'", double2 == 630998.4197775755d);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9955742875642762d), (-0.772695717397461d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.2308123878770227d) + "'", double2 == (-2.2308123878770227d));
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.21020213304517052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5945828425407312d + "'", double1 == 0.5945828425407312d);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.7162978893146719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.824209315301355d + "'", double1 == 6.824209315301355d);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4802620430283604E-16d + "'", double1 == 2.4802620430283604E-16d);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        double double1 = org.apache.commons.math.util.FastMath.asin(120.42757201625032d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        long long1 = org.apache.commons.math.util.FastMath.round(0.18573988815053546d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9278183521288984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8294016629382825d) + "'", double1 == (-0.8294016629382825d));
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5707963267948963d), (-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948961d) + "'", double2 == (-1.5707963267948961d));
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-33L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.0374464491245434d, 45.057704222641604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.504668038064618E21d + "'", double2 == 5.504668038064618E21d);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4312712619442752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194252626E-6d + "'", double1 == 1.5847565194252626E-6d);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7346773280347003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6204290412244261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6692896481323396d + "'", double1 == 0.6692896481323396d);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.002962815258153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0029628152581527d) + "'", double1 == (-1.0029628152581527d));
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2503189451462755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03927547481280818d + "'", double1 == 0.03927547481280818d);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0352316484600232d + "'", double1 == 1.0352316484600232d);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.008491621659255943d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20401567913623667d) + "'", double1 == (-0.20401567913623667d));
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        double double2 = org.apache.commons.math.util.FastMath.min(0.13211426394445566d, (-0.668201510190313d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.668201510190313d) + "'", double2 == (-0.668201510190313d));
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3709403595463754d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38894538189191646d) + "'", double1 == (-0.38894538189191646d));
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.35430360994810484d, (-88.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.518030890222253E39d + "'", double2 == 4.518030890222253E39d);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.3689423485032375d), 1.549516130084085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.549516130084085d + "'", double2 == 1.549516130084085d);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.009213529184899944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549018d) + "'", double1 == (-1.5574077246549018d));
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.624376645697622d + "'", double1 == 0.624376645697622d);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 37L, 0.0027745037427485417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.99999999999999d + "'", double2 == 36.99999999999999d);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.989995813684211d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6476859432225454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-37.109670996601714d) + "'", double1 == (-37.109670996601714d));
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.991328918078117d, 6.78302841225571E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9913289180781171d + "'", double2 == 0.9913289180781171d);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        long long1 = org.apache.commons.math.util.FastMath.abs(90L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 90L + "'", long1 == 90L);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8414709848078965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5035165489448541d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5035165489448541d + "'", double2 == 0.5035165489448541d);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794411714424d + "'", double1 == 0.3678794411714424d);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.9999303766734422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999303766734422d + "'", double2 == 0.9999303766734422d);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3619730303123129d, (-0.016996106527921995d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6177159347513663d + "'", double2 == 1.6177159347513663d);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        double double2 = org.apache.commons.math.util.FastMath.max(0.36787944117144233d, (-1.7162978893146719d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36787944117144233d + "'", double2 == 0.36787944117144233d);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.473182712567381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09745867084955731d + "'", double1 == 0.09745867084955731d);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 33L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5055823053323238d, 1.194315997789401d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.194315997789401d + "'", double2 == 1.194315997789401d);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7434618395438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030429149482917455d + "'", double1 == 0.030429149482917455d);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5507L, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.10903143175231947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10924758513314765d + "'", double1 == 0.10924758513314765d);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0874684814275741d + "'", double1 == 1.0874684814275741d);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        int int1 = org.apache.commons.math.util.FastMath.abs(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.6162298357006117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-36.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1556157735575975E15d) + "'", double1 == (-2.1556157735575975E15d));
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        double double1 = org.apache.commons.math.util.FastMath.cos((-89.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5101770449416689d + "'", double1 == 0.5101770449416689d);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.194315997789401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4991939135618992d + "'", double1 == 1.4991939135618992d);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.010458920780344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.466743204778643d + "'", double1 == 6.466743204778643d);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6154095886644868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2337018336902346d + "'", double1 == 2.2337018336902346d);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1326010584537984d + "'", double1 == 2.1326010584537984d);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.025888510549649656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2958255551963092d + "'", double1 == 0.2958255551963092d);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 90, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32269275245300827d + "'", double1 == 0.32269275245300827d);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-33L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.99999999999999d) + "'", double1 == (-32.99999999999999d));
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9625468178726484d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9091395677903495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.381716167593891d + "'", double1 == 1.381716167593891d);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-33), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0432322944097698d), 66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0432322944097698d) + "'", double2 == (-1.0432322944097698d));
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 5507.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3L, 1.0008301381573537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.002737247938193d + "'", double2 == 3.002737247938193d);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.45639522978117497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4724053287214428d + "'", double1 == 0.4724053287214428d);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        float float2 = org.apache.commons.math.util.FastMath.min(90.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5847565194232725E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999987442d + "'", double1 == 0.9999999999987442d);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.164135227174141d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        double double1 = org.apache.commons.math.util.FastMath.log10(11012.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041905639223649d + "'", double1 == 4.041905639223649d);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4063917980622467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8867254579876315d + "'", double1 == 0.8867254579876315d);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6177159347513663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8390715290764523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6853169696133172d) + "'", double1 == (-0.6853169696133172d));
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11.016627609179162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.319130550186172d + "'", double1 == 3.319130550186172d);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.448895063159511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2037005703909553d + "'", double1 == 1.2037005703909553d);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9465846430649136d + "'", double1 == 0.9465846430649136d);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        double double1 = org.apache.commons.math.util.FastMath.tan(96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8826122347595406d) + "'", double1 == (-1.8826122347595406d));
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.999942448217206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.444667861009766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8939092695313958d + "'", double1 == 0.8939092695313958d);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.82989504995974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5748247386416045d + "'", double1 == 1.5748247386416045d);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8683173535625466d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-13.89543714211785d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        double double1 = org.apache.commons.math.util.FastMath.atan(11.016627609179162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.480272527447467d + "'", double1 == 1.480272527447467d);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01745329251994342d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01745329251994342d + "'", double2 == 0.01745329251994342d);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38863652572621304d + "'", double1 == 0.38863652572621304d);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42518782200101835d + "'", double1 == 0.42518782200101835d);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6896428168918044d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6441609899881241d) + "'", double1 == (-0.6441609899881241d));
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 37L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 37.0f + "'", float1 == 37.0f);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9866277300914504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5515060405847224d + "'", double1 == 0.5515060405847224d);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.70899308565303d + "'", double1 == 103.70899308565303d);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9880923460971159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8334224771468441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.46360058552194d, 0.9036922050915067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4636005855219394d + "'", double2 == 2.4636005855219394d);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5249037881284782d), 51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010093960950310118d) + "'", double2 == (-0.010093960950310118d));
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 90);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90.0f + "'", float1 == 90.0f);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.07145890874357941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07139823206237136d) + "'", double1 == (-0.07139823206237136d));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.358221623915482d, 0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3582216239154814d + "'", double2 == 3.3582216239154814d);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3280247521861903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7735822610963057d + "'", double1 == 3.7735822610963057d);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6020599913279624d + "'", double1 == 0.6020599913279624d);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574544541530776d + "'", double1 == 1.6574544541530776d);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.8551464208140986d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8816146848906149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6637128698018219d + "'", double1 == 0.6637128698018219d);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8462950832072025d + "'", double1 == 0.8462950832072025d);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        int int2 = org.apache.commons.math.util.FastMath.min(90, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3754263855773785d + "'", double1 == 1.3754263855773785d);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.11400146268484936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.892256650791169d + "'", double1 == 0.892256650791169d);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.40838771824645015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3978118125063327d) + "'", double1 == (-0.3978118125063327d));
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6986765821769388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49724292869339315d + "'", double1 == 0.49724292869339315d);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7893750108307106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8739456127896417d + "'", double1 == 0.8739456127896417d);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        double double1 = org.apache.commons.math.util.FastMath.log(134.38863804832192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.900735886184545d + "'", double1 == 4.900735886184545d);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6887971054572842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8456633445388351d + "'", double1 == 0.8456633445388351d);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-90));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90) + "'", int1 == (-90));
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.101733671056989E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1017337E7d + "'", double1 == 2.1017337E7d);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.4855215610041086d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4855215610041086d) + "'", double2 == (-1.4855215610041086d));
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8655103306675354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015106004980173343d + "'", double1 == 0.015106004980173343d);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999999999999999d, (-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.076738876852442d + "'", double2 == 2.076738876852442d);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9204150691407506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1691408755888344d + "'", double1 == 1.1691408755888344d);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8163415799735056d) + "'", double1 == (-0.8163415799735056d));
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) (-33));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11012.999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3505896985737582d + "'", double1 == 1.3505896985737582d);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.07898096151940606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07906310090586803d) + "'", double1 == (-0.07906310090586803d));
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5558726996235265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5558726996235265d + "'", double1 == 0.5558726996235265d);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0964562107599605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0964562107599607d + "'", double1 == 1.0964562107599607d);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.22789274007256666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20529948069235546d + "'", double1 == 0.20529948069235546d);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192465179596234d + "'", double1 == 1.192465179596234d);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.023008927771751345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9772537590358271d + "'", double1 == 0.9772537590358271d);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.12873439758804212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3494089883469367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.855146420814098d + "'", double1 == 2.855146420814098d);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.98611111111111d + "'", double1 == 17.98611111111111d);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5274728362673282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009206137707697834d) + "'", double1 == (-0.009206137707697834d));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2022162221140908d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0950379321938843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.101088875655695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.720075976020836E-43d, 1.000004865336505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.720075976020837E-43d + "'", double2 == 3.720075976020837E-43d);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.13936960904520276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1304751349378549d + "'", double1 == 0.1304751349378549d);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7456241416655578d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7456241416655577d) + "'", double1 == (-0.7456241416655577d));
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8482836399575129d, (-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8482836399575128d + "'", double2 == 0.8482836399575128d);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.4900403122965926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060912694476906684d + "'", double1 == 0.060912694476906684d);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.480272527447467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5695861191798108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003535606004149d + "'", double1 == 1.003535606004149d);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        double double1 = org.apache.commons.math.util.FastMath.log(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.179836020565457d + "'", double1 == 7.179836020565457d);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        double double1 = org.apache.commons.math.util.FastMath.floor(155.74608385512988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.0d + "'", double1 == 155.0d);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        double double2 = org.apache.commons.math.util.FastMath.min(3.4900403122965926d, 34.37746770784939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4900403122965926d + "'", double2 == 3.4900403122965926d);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0012070607874443988d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.7405072374130097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.83569384937053d + "'", double1 == 5.83569384937053d);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 33);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.989417798345493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017268598258962157d + "'", double1 == 0.017268598258962157d);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6435011087932844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3705561619927477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.431145960437433d) + "'", double1 == (-0.431145960437433d));
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8622957433108482d + "'", double1 == 1.8622957433108482d);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04599315997198159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04602563205824346d + "'", double1 == 0.04602563205824346d);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.562253565251371d + "'", double1 == 5.562253565251371d);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6686000970514328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011669273072701132d + "'", double1 == 0.011669273072701132d);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 5507L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8813736213307353d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999303766734422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800350373956384d + "'", double1 == 0.011800350373956384d);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 132058.36709719698d + "'", double1 == 132058.36709719698d);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.515582944293113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47428373042402705d + "'", double1 == 0.47428373042402705d);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0565321053670247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9733523361592433d + "'", double1 == 3.9733523361592433d);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8462950832072025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0724781822753713d) + "'", double1 == (-0.0724781822753713d));
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 90L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.995200412208242d) + "'", double1 == (-1.995200412208242d));
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5847565194232725E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        int int2 = org.apache.commons.math.util.FastMath.max(90, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8414709825806045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173172747640832d + "'", double1 == 0.9173172747640832d);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.012209562553744129d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012209562553744129d + "'", double1 == 0.012209562553744129d);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9020848703947254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4352296559186861d + "'", double1 == 1.4352296559186861d);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.466743204778643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18564763581321805d + "'", double1 == 0.18564763581321805d);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-33), 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.490762386278728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.913891279076611d + "'", double1 == 2.913891279076611d);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(28.738038368372738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5015733900925633d + "'", double1 == 0.5015733900925633d);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4881369946309988d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        long long2 = org.apache.commons.math.util.FastMath.max(90L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.45973974851091d) + "'", double1 == (-17.45973974851091d));
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5807306907661335d) + "'", double1 == (-0.5807306907661335d));
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3877787807814457E-17d, (-0.6278458088294271d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9004252816353321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9656414365486929d + "'", double1 == 0.9656414365486929d);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6019895799783384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.78724175669423d + "'", double1 == 91.78724175669423d);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.23641824551800447d), 1.2130532941206642d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5840734641020677d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.678421832629247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9707650795890375d + "'", double1 == 0.9707650795890375d);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1034653645558015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3229353653636484d + "'", double1 == 0.3229353653636484d);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985986933499E-5d + "'", double1 == 9.079985986933499E-5d);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.3010710787424613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5169281719127183d + "'", double1 == 1.5169281719127183d);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9982900983985066d + "'", double1 == 0.9982900983985066d);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7893184915864662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        double double1 = org.apache.commons.math.util.FastMath.sin((-17.45973974851091d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.98366774371544d + "'", double1 == 0.98366774371544d);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        double double1 = org.apache.commons.math.util.FastMath.rint(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4453238447142773d, (-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.445323844714277d + "'", double2 == 1.445323844714277d);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454178629595234d + "'", double1 == 0.017454178629595234d);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        double double1 = org.apache.commons.math.util.FastMath.log(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5746813724695927d), (-0.10955796484928035d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7591770905221553d) + "'", double2 == (-1.7591770905221553d));
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        double double2 = org.apache.commons.math.util.FastMath.min(9.429962432340893E-5d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.429962432340893E-5d + "'", double2 == 9.429962432340893E-5d);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34559293815501096d + "'", double1 == 0.34559293815501096d);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7071067826440032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0281149846033601d + "'", double1 == 1.0281149846033601d);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2037005703909553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18540062026815304d + "'", double1 == 0.18540062026815304d);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        double double2 = org.apache.commons.math.util.FastMath.atan2(31.98437118343895d, 0.5558726996235265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.553418566264681d + "'", double2 == 1.553418566264681d);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5760630454288633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.3017607496092d + "'", double1 == 90.3017607496092d);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.011658811940024915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011658811940024917d + "'", double1 == 0.011658811940024917d);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9333701257923868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9526997202405776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.20529948069235546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20388401007638224d + "'", double1 == 0.20388401007638224d);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6655280485429236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-38.131948329087294d) + "'", double1 == (-38.131948329087294d));
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        double double1 = org.apache.commons.math.util.FastMath.ceil(23.628351601695016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5246280046224637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5246280046224637d + "'", double1 == 0.5246280046224637d);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.513484761488917E139d) + "'", double1 == (-9.513484761488917E139d));
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.18573988815053546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0172993018445189d + "'", double1 == 1.0172993018445189d);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2679097336560172d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.085038501948388d + "'", double1 == 1.085038501948388d);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49203441069488424d + "'", double1 == 0.49203441069488424d);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000897785780501d + "'", double1 == 1.000897785780501d);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6180237337779616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.851794930779705d + "'", double1 == 0.851794930779705d);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01530032932138615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010228883744553106d) + "'", double1 == (-0.010228883744553106d));
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.34080130993844177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34080130993844177d + "'", double1 == 0.34080130993844177d);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5729347079345366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5454785027470476d + "'", double1 == 0.5454785027470476d);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7134299764161373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7943809778600359d + "'", double1 == 0.7943809778600359d);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.3273845772164696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        long long1 = org.apache.commons.math.util.FastMath.round(0.46904838772645735d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        double double1 = org.apache.commons.math.util.FastMath.rint((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3754263855773785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9421475168289407d + "'", double1 == 0.9421475168289407d);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.7659219106381574E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.765921910638158E-8d + "'", double1 == 2.765921910638158E-8d);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        int int2 = org.apache.commons.math.util.FastMath.max(33, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5748247386416045d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.686371961004665d + "'", double2 == 9.686371961004665d);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.012283997231502098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11083319553050024d + "'", double1 == 0.11083319553050024d);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6563678204210392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8690586640680674d + "'", double1 == 0.8690586640680674d);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.195945676325781d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.080398205182299E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080398180225239E-5d + "'", double1 == 9.080398180225239E-5d);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-33));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.052518065881558766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0090635232033223d + "'", double1 == 3.0090635232033223d);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.39542905600596706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        double double1 = org.apache.commons.math.util.FastMath.acos(44.9999998819046d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999689100311606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007885446079761261d + "'", double1 == 0.007885446079761261d);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.154092655271697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8325451219316489d + "'", double1 == 1.8325451219316489d);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2587612362107516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23012809149401298d + "'", double1 == 0.23012809149401298d);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01365785170622981d, 0.07031263443540531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013657851706229811d + "'", double2 == 0.013657851706229811d);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5507L, 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.002962815258153d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        double double1 = org.apache.commons.math.util.FastMath.acos(51.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

