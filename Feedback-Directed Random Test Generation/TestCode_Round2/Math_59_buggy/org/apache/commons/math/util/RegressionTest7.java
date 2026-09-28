package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7167268785408383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.273280124121555d + "'", double1 == 55.273280124121555d);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9223289201784547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.745015451903739d + "'", double1 == 0.745015451903739d);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891437136247581d + "'", double1 == 0.9891437136247581d);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        double double1 = org.apache.commons.math.util.FastMath.signum(5507.000045396766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.079985949503006E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7764153489348606d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        double double1 = org.apache.commons.math.util.FastMath.cos(104.9439513269027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29494940570620637d) + "'", double1 == (-0.29494940570620637d));
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7084653196386397d, 5.085665678873702E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796029120392d + "'", double2 == 1.570796029120392d);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1195215262618592d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1195215262618592d + "'", double2 == 1.1195215262618592d);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194232725E-6d + "'", double1 == 1.5847565194232725E-6d);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8947805892373116d, 0.0683060003022046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9924347232553565d + "'", double2 == 0.9924347232553565d);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8895257804916458d) + "'", double1 == (-0.8895257804916458d));
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.010228883744553106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9898232533671977d + "'", double1 == 0.9898232533671977d);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6624791557154159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6624791557154159d + "'", double1 == 0.6624791557154159d);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3868973415880647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3868973415880647d + "'", double1 == 0.3868973415880647d);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33), (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4867844010000003E19d + "'", double1 == 3.4867844010000003E19d);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-33));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1898842314256335d) + "'", double1 == (-4.1898842314256335d));
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2717104239752093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9044387629088754d + "'", double1 == 0.9044387629088754d);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7243500169114551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0633894957263825d + "'", double1 == 1.0633894957263825d);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7134299764161373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000115286123023d + "'", double1 == 1.000115286123023d);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        double double2 = org.apache.commons.math.util.FastMath.max(2.276225755267126d, 0.04602563205824346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.276225755267126d + "'", double2 == 2.276225755267126d);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000001d + "'", double1 == 5.000000000000001d);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5631767322193112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5369939140971179d) + "'", double1 == (-0.5369939140971179d));
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.10214098560127556d, (-63.81719973521831d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1399921305519953d + "'", double2 == 3.1399921305519953d);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.158638853279166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.005846743218731832d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9607190280136697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6733112569964226d + "'", double1 == 0.6733112569964226d);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3752021393940158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3589478765910177d + "'", double1 == 0.3589478765910177d);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5175807674647721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8028961524453898d) + "'", double1 == (-0.8028961524453898d));
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5507 + "'", int1 == 5507);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        double double2 = org.apache.commons.math.util.FastMath.max((-89.3634064240365d), 0.29167236570643446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29167236570643446d + "'", double2 == 0.29167236570643446d);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.386923871918913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.485943101132887d + "'", double1 == 5.485943101132887d);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.14748549792895108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6130679609866563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6020599913279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705905238526439d + "'", double1 == 0.5705905238526439d);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6705208933150383d), 0.42581659714188025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6705208933150382d) + "'", double2 == (-0.6705208933150382d));
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.48250862996283855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9036922050915067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015772404403454655d + "'", double1 == 0.015772404403454655d);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        double double1 = org.apache.commons.math.util.FastMath.atan(96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604132228496979d + "'", double1 == 1.5604132228496979d);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999989097008681d + "'", double1 == 0.9999989097008681d);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.46025618298802606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3786118881275891d + "'", double1 == 0.3786118881275891d);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.12585691605953508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12585691605953506d) + "'", double1 == (-0.12585691605953506d));
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        long long1 = org.apache.commons.math.util.FastMath.round(0.02181661564992912d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999989097008681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9526997202405776d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9526997202405776d + "'", double2 == 0.9526997202405776d);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6657737487535582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8159495993954272d + "'", double1 == 0.8159495993954272d);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04599315997198159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010578718449796d + "'", double1 == 1.0010578718449796d);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        double double1 = org.apache.commons.math.util.FastMath.atanh(45.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        double double1 = org.apache.commons.math.util.FastMath.sin((-89.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8600694058124533d) + "'", double1 == (-0.8600694058124533d));
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8655103306675354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.59008907222208d + "'", double1 == 49.59008907222208d);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 90.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5516730959931526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8022326162223065d) + "'", double1 == (-0.8022326162223065d));
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8082072382458939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.690795798579539d + "'", double1 == 0.690795798579539d);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.1379435771909256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7204111979381276d + "'", double1 == 1.7204111979381276d);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.9625468178726484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.28604042479942d + "'", double1 == 26.28604042479942d);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.788010753606722d + "'", double1 == 0.788010753606722d);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        double double1 = org.apache.commons.math.util.FastMath.atan(120.01818825115909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5624644491486637d + "'", double1 == 1.5624644491486637d);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7786671247869191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.61433989587707d + "'", double1 == 44.61433989587707d);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.055410749812933396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5153571826562113d + "'", double1 == 1.5153571826562113d);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-43.19155203462029d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90L), (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.23641824551800447d), (-0.19374578338773524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.23641824551800447d) + "'", double2 == (-0.23641824551800447d));
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.010973228372790073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10475317834218718d + "'", double1 == 0.10475317834218718d);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1098842226362917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013752800218212d + "'", double1 == 2.013752800218212d);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        double double1 = org.apache.commons.math.util.FastMath.asin(108.29903111138354d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        double double1 = org.apache.commons.math.util.FastMath.log(5730.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.653470809708786d + "'", double1 == 8.653470809708786d);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4865138719659448d + "'", double1 == 0.4865138719659448d);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997649972645d + "'", double1 == 0.9999997649972645d);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (-33));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3010710787424613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.984871312897978d + "'", double1 == 8.984871312897978d);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8739456127896416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3495439910201015d + "'", double1 == 1.3495439910201015d);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8882856957001204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8001343657838819d + "'", double1 == 0.8001343657838819d);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1195215262618592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8157584261849007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.03529443571144d + "'", double1 == 104.03529443571144d);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12454753567443298d) + "'", double1 == (-0.12454753567443298d));
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5507);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5507L + "'", long1 == 5507L);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5574076203137444d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567155E14d + "'", double1 == 7.930067261567155E14d);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847656E-8d + "'", double1 == 1.4901161193847656E-8d);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0653122583386827d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0281149846033601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9866275920404864d, (-0.5440211108893697d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0073508372728197d + "'", double2 == 1.0073508372728197d);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        long long1 = org.apache.commons.math.util.FastMath.round(2.855146420814098d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.486784401E19d, 1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0501628923259995E35d + "'", double2 == 3.0501628923259995E35d);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5440211108893694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7229210080217559d + "'", double1 == 1.7229210080217559d);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.47428373042402705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.515582944293113d + "'", double1 == 0.515582944293113d);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.437600971038334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4376009710383337d) + "'", double1 == (-1.4376009710383337d));
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0341909072993258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5841716915979767d + "'", double1 == 1.5841716915979767d);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        int int2 = org.apache.commons.math.util.FastMath.min((-90), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1251435150698329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15289141269055143d + "'", double1 == 0.15289141269055143d);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.7405072374130097d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6441609899881241d), 0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8628069656298388d) + "'", double2 == (-0.8628069656298388d));
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        double double2 = org.apache.commons.math.util.FastMath.min(0.45158270528945427d, (-0.8939966636005579d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8939966636005579d) + "'", double2 == (-0.8939966636005579d));
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7659219106381584E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962991356774d + "'", double1 == 1.5707962991356774d);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        double double1 = org.apache.commons.math.util.FastMath.exp(26.28604042479942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.605447386361209E11d + "'", double1 == 2.605447386361209E11d);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.8427842873511956E202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4908919308538355E-81d + "'", double1 == 1.4908919308538355E-81d);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3022547416014814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2640971787204141d + "'", double1 == 0.2640971787204141d);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5878687580950964d), 6.191476652127584E48d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5878687580950963d) + "'", double2 == (-0.5878687580950963d));
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.615354633267934E7d, (-33.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707972395684235d + "'", double2 == 1.5707972395684235d);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0341909072993258d, (-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0341909072993256d + "'", double2 == 1.0341909072993256d);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9036922050915067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.031814983519345d + "'", double1 == 1.031814983519345d);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7551415795108877d), 51.267151353526884d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9647007265430612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999492312032946d + "'", double1 == 0.9999492312032946d);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9685252333342943d + "'", double1 == 0.9685252333342943d);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        double double1 = org.apache.commons.math.util.FastMath.rint(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.005656731589213857d, 1.142599163434008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005656731589213858d + "'", double2 == 0.005656731589213858d);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5144957554275266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5144957554275267d + "'", double1 == 0.5144957554275267d);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        double double1 = org.apache.commons.math.util.FastMath.exp(45.057704222641604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.700942273550203E19d + "'", double1 == 3.700942273550203E19d);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5884022289215687d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.71296437329639d) + "'", double1 == (-33.71296437329639d));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.080398180225239E-5d, 0.5009408451299502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009446037147747973d + "'", double2 == 0.009446037147747973d);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963267803446d, (-0.7949577687638787d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6983819079412873d + "'", double2 == 0.6983819079412873d);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.845663344538835d, 2.6881171418160975E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.9625468178726484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.8551464208140986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.60718109841417d) + "'", double1 == (-23.60718109841417d));
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        double double1 = org.apache.commons.math.util.FastMath.sinh(871.5850575920532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1023185539947518d + "'", double1 == 1.1023185539947518d);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 39481480091340L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.005202425297685839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29807701278948945d + "'", double1 == 0.29807701278948945d);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1098842226362917d, 0.12931063444698587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1098842226362917d + "'", double2 == 1.1098842226362917d);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-6.755849220270756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9988359491211439d) + "'", double1 == (-0.9988359491211439d));
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1525354798260945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1596819083340262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0506215241944414d + "'", double1 == 1.0506215241944414d);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3632703054402189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1990207225524583d + "'", double1 == 1.1990207225524583d);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6162298357006117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4177144927409673d) + "'", double1 == (-2.4177144927409673d));
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5907801071923648d, 0.6270520618142631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3378889326503705d + "'", double2 == 1.3378889326503705d);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.918853748407957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7924685551644433d + "'", double1 == 1.7924685551644433d);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2452137411103849d) + "'", double1 == (-0.2452137411103849d));
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4223506181800103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.449394909181667d) + "'", double1 == (-0.449394909181667d));
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.202019757600187d + "'", double1 == 2.202019757600187d);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.4900403122965926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        double double1 = org.apache.commons.math.util.FastMath.ceil(37.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.0d + "'", double1 == 37.0d);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3469373133180005d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34693731331800054d + "'", double2 == 0.34693731331800054d);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        double double1 = org.apache.commons.math.util.FastMath.cos((-42.44851990227039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.037010624154675d + "'", double1 == 0.037010624154675d);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        double double1 = org.apache.commons.math.util.FastMath.floor((-51.777749330614135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-52.0d) + "'", double1 == (-52.0d));
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        double double1 = org.apache.commons.math.util.FastMath.tanh(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.9091395677903495d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.21670660727375085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8051661645504247d + "'", double1 == 0.8051661645504247d);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8089563172728976d, 1.0438800790430118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8014654691351221d + "'", double2 == 0.8014654691351221d);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5258806213658974d) + "'", double1 == (-0.5258806213658974d));
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7850009775214999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.010176922302104895d), 11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010176922302104893d) + "'", double2 == (-0.010176922302104893d));
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9132181497465548d) + "'", double1 == (-0.9132181497465548d));
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        double double1 = org.apache.commons.math.util.FastMath.cosh(44.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7467135528742425E19d + "'", double1 == 1.7467135528742425E19d);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.788010753606722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8876996978746371d + "'", double1 == 0.8876996978746371d);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.079986011887159E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1727924348551592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9204150691407506d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double double1 = org.apache.commons.math.util.FastMath.log(1.638566441559658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4938217385693559d + "'", double1 == 0.4938217385693559d);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.5912749463979503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.54353615872827d + "'", double1 == 77.54353615872827d);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.005402970483400532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8238673184078138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.204120223528484d + "'", double1 == 47.204120223528484d);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7812347470298677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1790802230737255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8034325040154596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.589691795662765d + "'", double1 == 0.589691795662765d);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5515659755035025d, 1.7204111979381276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515659755035025d + "'", double2 == 1.5515659755035025d);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3495439910201015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13018704579946147d + "'", double1 == 0.13018704579946147d);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        double double2 = org.apache.commons.math.util.FastMath.max(0.39542905600596706d, (-2.248949670772078E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39542905600596706d + "'", double2 == 0.39542905600596706d);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5659403777711782d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5748247386416045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        long long1 = org.apache.commons.math.util.FastMath.round(0.09506557725167404d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(71.6197243913529d, (-13.89543714211785d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.61972439135289d + "'", double2 == 71.61972439135289d);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-33.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0732178989295803E14d) + "'", double1 == (-1.0732178989295803E14d));
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.590466459908002E-72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.491754101407853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        double double1 = org.apache.commons.math.util.FastMath.log(2.4855874989531728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9105090496960474d + "'", double1 == 0.9105090496960474d);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6848167883550325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01195230772972848d) + "'", double1 == (-0.01195230772972848d));
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4833023923748323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08738234671223125d + "'", double1 == 0.08738234671223125d);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5907801071923648d, 37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.590780107192365d + "'", double2 == 1.590780107192365d);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7470124028605071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6794497296418427d) + "'", double1 == (-0.6794497296418427d));
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.3845369719462828d), (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3845369719462828d) + "'", double2 == (-0.3845369719462828d));
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.999942448217206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0176064912058518d + "'", double1 == 1.0176064912058518d);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7786671247869191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3169578969248166d, 50.237955471941575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1016359.4424036132d + "'", double2 == 1016359.4424036132d);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.1286157825604266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5144957554275266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6727947914027862d + "'", double1 == 0.6727947914027862d);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.3504116548137945d), (-0.7219067166708868d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7219067166708868d) + "'", double2 == (-0.7219067166708868d));
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5664325882614676d, (-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5664325882614676d + "'", double2 == 1.5664325882614676d);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.9733523361592433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0973039206233832d + "'", double1 == 1.0973039206233832d);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5175807674647721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.31868510059102656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        double double1 = org.apache.commons.math.util.FastMath.asin(37.574240039999225d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.888945622903398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015515027990856209d) + "'", double1 == (-0.015515027990856209d));
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        long long1 = org.apache.commons.math.util.FastMath.round(0.47428373042402705d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7330383821741316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.002774496623513146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.005403023058834883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00540307563595756d + "'", double1 == 0.00540307563595756d);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 33, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1844562330844421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.04541326200418545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04646023281402976d + "'", double1 == 0.04646023281402976d);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8816146848906149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7951386301113977d) + "'", double1 == (-0.7951386301113977d));
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        double double1 = org.apache.commons.math.util.FastMath.exp((-63.81719973521831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9254945977133745E-28d + "'", double1 == 1.9254945977133745E-28d);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8196150146861299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9607387187064872d) + "'", double1 == (-0.9607387187064872d));
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6983819079412873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8105257933460475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        double double1 = org.apache.commons.math.util.FastMath.floor(1312.6929859424645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1312.0d + "'", double1 == 1312.0d);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.39781181250633263d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2650237603550034d + "'", double1 == 1.2650237603550034d);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5631767322193112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.16902146990801d + "'", double1 == 2.16902146990801d);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5362901735522732d, 132058.36709719698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3705561619927477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7182649593784625d + "'", double1 == 0.7182649593784625d);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.015515027990856209d), 0.3868973415880647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04007967425933629d) + "'", double2 == (-0.04007967425933629d));
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7945982305639963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        double double2 = org.apache.commons.math.util.FastMath.pow(6012.84549645786d, (-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001697419855619805d + "'", double2 == 0.001697419855619805d);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.013276747223059479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9421475168289407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025881092186968428d) + "'", double1 == (-0.025881092186968428d));
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.002962815258153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002962815258153d + "'", double1 == 1.002962815258153d);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.080398180225239E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080398155268179E-5d + "'", double1 == 9.080398155268179E-5d);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.999948217360899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540345878732046d + "'", double1 == 0.540345878732046d);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6157320800633225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5822681503789437d) + "'", double1 == (-0.5822681503789437d));
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5975571443282363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.237502387897734d + "'", double1 == 34.237502387897734d);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        int int1 = org.apache.commons.math.util.FastMath.round(7.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.720723359053762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.88596569643704d + "'", double1 == 155.88596569643704d);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6655280485429236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5820305439415169d) + "'", double1 == (-0.5820305439415169d));
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5841716915979767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.07351901771299219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07365190683305112d + "'", double1 == 0.07365190683305112d);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2273817004129048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596122796450436d + "'", double1 == 1.5596122796450436d);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5847577751512122E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999987442d + "'", double1 == 0.9999999999987442d);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.96421184743732d) + "'", double1 == (-33.96421184743732d));
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.092783262284966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129071417624954d + "'", double1 == 1.129071417624954d);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.84147096835031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6637128698018219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.725771710223923d + "'", double1 == 0.725771710223923d);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.397041808397797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029949908321658926d + "'", double1 == 0.029949908321658926d);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917694073609294d + "'", double1 == 0.9917694073609294d);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.052518065881558766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05256643013047821d + "'", double1 == 0.05256643013047821d);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        double double1 = org.apache.commons.math.util.FastMath.atan(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5485777614681775d + "'", double1 == 1.5485777614681775d);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.7591770905221553d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6849166814234299d + "'", double1 == 0.6849166814234299d);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.31868510059102656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9496482207527558d + "'", double1 == 0.9496482207527558d);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8640359722236105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7818950091321848d) + "'", double1 == (-0.7818950091321848d));
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 37L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2119.943841984046d + "'", double1 == 2119.943841984046d);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05165599792339188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05167897363437805d + "'", double1 == 0.05167897363437805d);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8170870323423696d, 2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8170870323423696d + "'", double2 == 0.8170870323423696d);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7317887661991493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        double double2 = org.apache.commons.math.util.FastMath.min(120.42757201625032d, 35.44341522934086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.44341522934086d + "'", double2 == 35.44341522934086d);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09478022484215487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09492270797282235d + "'", double1 == 0.09492270797282235d);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-33L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5759586531581288d) + "'", double1 == (-0.5759586531581288d));
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3280247521861903d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0964562107599605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.993538734274722d + "'", double1 == 1.993538734274722d);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6035270795055018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21930323887902778d) + "'", double1 == (-0.21930323887902778d));
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.888945622903398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7764076780850522d) + "'", double1 == (-0.7764076780850522d));
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5258806213658974d), (-0.16298994513340984d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5258806213658973d) + "'", double2 == (-0.5258806213658973d));
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        double double2 = org.apache.commons.math.util.FastMath.max(2.018168583893839d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.018168583893839d + "'", double2 == 2.018168583893839d);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49901183053376447d + "'", double1 == 0.49901183053376447d);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.1898842314256335d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.2264970570905673d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003953119392307968d) + "'", double1 == (-0.003953119392307968d));
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(108.29903111138356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.378064702776815d + "'", double1 == 5.378064702776815d);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11012.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5507, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 5507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5280998217363506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.196231140163579d + "'", double1 == 2.196231140163579d);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5872139151569482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8848257745809853d) + "'", double1 == (-0.8848257745809853d));
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9366895107550345d + "'", double1 == 0.9366895107550345d);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        double double1 = org.apache.commons.math.util.FastMath.rint(19.088431721273945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        double double1 = org.apache.commons.math.util.FastMath.log(3.3586387116292378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2115357465331211d + "'", double1 == 1.2115357465331211d);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.940141468803501d + "'", double1 == 11.940141468803501d);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        double double1 = org.apache.commons.math.util.FastMath.exp(108.29903111138356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0806165313998187E47d + "'", double1 == 1.0806165313998187E47d);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999999958776927d, 2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6991118430775187d + "'", double2 == 2.6991118430775187d);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.1379435771909256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32047738164862055d + "'", double1 == 0.32047738164862055d);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8683173535625466d, 0.20529948069235546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8683173535625465d + "'", double2 == 0.8683173535625465d);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.000897785780501d, 4.865450952848139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.004375718651318d + "'", double2 == 1.004375718651318d);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5246280046224637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243120906228638d + "'", double1 == 0.7243120906228638d);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 33.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0681780852520792E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.202324049037342E-4d + "'", double1 == 2.202324049037342E-4d);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0948410127421968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.830640877860784d + "'", double1 == 0.830640877860784d);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9898232533671977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9948986146171869d + "'", double1 == 0.9948986146171869d);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9982900983985066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9982900983985066d + "'", double1 == 0.9982900983985066d);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2640971787204141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2640971787204141d + "'", double1 == 0.2640971787204141d);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        double double1 = org.apache.commons.math.util.FastMath.asinh(153298.37563315977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.633288649374089d + "'", double1 == 12.633288649374089d);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3469373133180005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3615615830612523d + "'", double1 == 0.3615615830612523d);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.12552491762180948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0078886023836056d + "'", double1 == 1.0078886023836056d);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        long long1 = org.apache.commons.math.util.FastMath.abs((-33L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9994780690209127d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) (-90L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7951386301113977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6717696549042369d) + "'", double1 == (-0.6717696549042369d));
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.7645662682374061d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7456241416655578d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6325311183113567d) + "'", double1 == (-0.6325311183113567d));
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        double double2 = org.apache.commons.math.util.FastMath.pow(28.738038368372738d, 0.9185957173539763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.864143275884796d + "'", double2 == 21.864143275884796d);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7219067166708868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7219067166708867d) + "'", double1 == (-0.7219067166708867d));
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6631489452679062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.940894492205956d + "'", double1 == 1.940894492205956d);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 33, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9834982458959824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3888768966542657d) + "'", double1 == (-1.3888768966542657d));
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.496025759922821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5166179526408777d) + "'", double1 == (-0.5166179526408777d));
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0054029967707723775d + "'", double1 == 0.0054029967707723775d);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        int int2 = org.apache.commons.math.util.FastMath.min(7, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        long long1 = org.apache.commons.math.util.FastMath.round(2.539788332061041E-13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6416439271862105d), 103.70899308565303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6416439271862105d) + "'", double2 == (-0.6416439271862105d));
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.003535606004149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.787162844955128d + "'", double1 == 0.787162844955128d);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.041905639223649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3282586280971982d + "'", double1 == 1.3282586280971982d);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-63.81719973521831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.009213529184899944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8968903759882284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04726063612294401d) + "'", double1 == (-0.04726063612294401d));
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.674083105727976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7047567822517627d, 71.6197243913529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3080187522246026E-11d + "'", double2 == 1.3080187522246026E-11d);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7470124028605071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8435567492887723d) + "'", double1 == (-0.8435567492887723d));
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        double double1 = org.apache.commons.math.util.FastMath.rint(229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.0d + "'", double1 == 229.0d);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0969832464593828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09728846154807012d) + "'", double1 == (-0.09728846154807012d));
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3752021393940158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.2264970570905673d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22649705709056728d) + "'", double1 == (-0.22649705709056728d));
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.2003257647899614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        double double1 = org.apache.commons.math.util.FastMath.sinh(89.40934278535333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.380291914558474E38d + "'", double1 == 3.380291914558474E38d);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3.0f, 0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9999999999999996d + "'", double2 == 2.9999999999999996d);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0634370688955608d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03966067399745926d + "'", double2 == 0.03966067399745926d);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5705451157070798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3980.715929598703d) + "'", double1 == (-3980.715929598703d));
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5675499795375124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9380411276052492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9789051801137091d + "'", double1 == 0.9789051801137091d);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8089563172728975d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        double double1 = org.apache.commons.math.util.FastMath.signum(16.86085826032837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        double double1 = org.apache.commons.math.util.FastMath.expm1(46.23553270010918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2018125075709377E20d + "'", double1 == 1.2018125075709377E20d);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.013276747223059479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013277527411913046d) + "'", double1 == (-0.013277527411913046d));
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7130376554537363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.854048291402435d) + "'", double1 == (-40.854048291402435d));
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.13018704579946147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1294589369076663d + "'", double1 == 0.1294589369076663d);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9789051801137091d, 0.9105090496960474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9807747056866981d + "'", double2 == 0.9807747056866981d);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5557490923207962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.8139497520487735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.675653009906092d + "'", double1 == 16.675653009906092d);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7431447610156813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8600694058124533d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7788906677207307d) + "'", double1 == (-0.7788906677207307d));
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0806165313998193E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3359940102659614d + "'", double1 == 0.3359940102659614d);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.08738234671223125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0874935930354446d + "'", double1 == 0.0874935930354446d);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.47428373042402705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(50.237955471941575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8768177324556823d + "'", double1 == 0.8768177324556823d);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.10178798778736835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6727947914027862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7820830806840948d + "'", double1 == 0.7820830806840948d);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8001343657838819d, 0.9044387629088754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.800134365783882d + "'", double2 == 0.800134365783882d);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4938217385693559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4572444275267257d + "'", double1 == 0.4572444275267257d);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        double double1 = org.apache.commons.math.util.FastMath.rint((-27.876349504902663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.0d) + "'", double1 == (-28.0d));
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8163415799735056d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.079986011887159E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998602436399E-5d + "'", double1 == 9.07998602436399E-5d);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.3756233543023781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37562335430237803d) + "'", double1 == (-0.37562335430237803d));
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.677053844817004E-155d + "'", double1 == 6.677053844817004E-155d);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.553234855038964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.008591840113815d + "'", double1 == 1.008591840113815d);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-7.661153040102054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1062.1024200991178d) + "'", double1 == (-1062.1024200991178d));
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7160033436347992d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3896127456026699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.076864027916964d + "'", double1 == 1.076864027916964d);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9988359491211439d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.32821156205036844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.449394909181667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.900710131145049d + "'", double1 == 0.900710131145049d);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2230306629577952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.105907167423105d + "'", double1 == 1.105907167423105d);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8882856957001204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0935990917790617d + "'", double1 == 1.0935990917790617d);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8064012322901598d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8064012322901599d + "'", double2 == 0.8064012322901599d);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6476859432225454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7243500169114551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8510875494985548d + "'", double1 == 0.8510875494985548d);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6157320800633225d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8939092695313958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.444667861009766d + "'", double1 == 2.444667861009766d);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.455197646070681E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.455197646070681E-11d + "'", double1 == 1.455197646070681E-11d);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0438800790430118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4991939135618992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159682453057105d + "'", double1 == 0.9159682453057105d);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9872136726111863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7336545584598283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9365964011255326d + "'", double1 == 0.9365964011255326d);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.995592469141819E14d + "'", double1 == 2.995592469141819E14d);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5672637267613392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5672637267613392d + "'", double1 == 1.5672637267613392d);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.0d, (-1.0950379321938841d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999999999999999d + "'", double2 == 4.999999999999999d);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3134238597771562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32410684590028493d + "'", double1 == 0.32410684590028493d);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        float float2 = org.apache.commons.math.util.FastMath.max((-90.0f), (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.9E-324d, 4.041905639223649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.988092346097116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.872928489116717d + "'", double1 == 0.872928489116717d);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8462950832072025d, 0.838315415809956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8694416130821835d + "'", double2 == 0.8694416130821835d);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        double double1 = org.apache.commons.math.util.FastMath.floor((-33.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.0d) + "'", double1 == (-33.0d));
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9873579129275408d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.276225755267126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.50871659209645d + "'", double1 == 1.50871659209645d);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.5663706143591734d, 16.86085826032837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.566370614359174d + "'", double2 == 2.566370614359174d);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6046661120266558d, 0.32410684590028493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8495476049206573d + "'", double2 == 0.8495476049206573d);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2355885565015715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 33L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.485943101132887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7392512988951674d + "'", double1 == 0.7392512988951674d);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        float float2 = org.apache.commons.math.util.FastMath.min((-90.0f), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7047567822517626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.533422450854332d + "'", double1 == 0.533422450854332d);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.830640877860784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9802576824651943d + "'", double1 == 0.9802576824651943d);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1022931929401623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1022931929401623d + "'", double1 == 1.1022931929401623d);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.485943101132887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 240.27638476315678d + "'", double1 == 240.27638476315678d);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        double double1 = org.apache.commons.math.util.FastMath.ceil(226.84826038896668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 227.0d + "'", double1 == 227.0d);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.01195230772972848d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.9955924691418044E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66910.49509128612d + "'", double1 == 66910.49509128612d);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7451749797335945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12774173556062693d) + "'", double1 == (-0.12774173556062693d));
    }
}

